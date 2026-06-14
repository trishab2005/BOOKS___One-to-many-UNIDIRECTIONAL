import { useState } from "react";
import { createBook } from "../api/bookApi";

export default function AddBook() {
  const [book, setBook] = useState({
    title: "",
    category: "",
    price: "",
  });

  const handleChange = (e) => {
    setBook({
      ...book,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      console.log("Submitting:", book);

      const response = await createBook({
        title: book.title,
        category: book.category,
        price: Number(book.price),
      });

      console.log("SUCCESS:", response.data);

      alert("📚 Book Added Successfully!");

      setBook({
        title: "",
        category: "",
        price: "",
      });
    } catch (error) {
      console.error("ERROR:", error);
      alert("❌ Failed to add book");
    }
  };

  return (
    <div className="min-h-screen flex justify-center items-center px-4">

      <form
        onSubmit={handleSubmit}
        className="
          bg-slate-800/90
          backdrop-blur-lg
          p-8
          rounded-2xl
          shadow-2xl
          border
          border-cyan-500/30
          w-[450px]
        "
      >
        <h1 className="text-4xl font-bold text-white mb-8 text-center">
          📚 Add Book
        </h1>

        <input
          type="text"
          name="title"
          placeholder="Book Title"
          value={book.title}
          onChange={handleChange}
          required
          className="
            w-full
            p-4
            mb-5
            rounded-lg
            bg-slate-700
            text-white
            placeholder-gray-300
            border
            border-slate-500
            focus:outline-none
            focus:ring-2
            focus:ring-cyan-500
          "
        />

        <input
          type="text"
          name="category"
          placeholder="Category"
          value={book.category}
          onChange={handleChange}
          required
          className="
            w-full
            p-4
            mb-5
            rounded-lg
            bg-slate-700
            text-white
            placeholder-gray-300
            border
            border-slate-500
            focus:outline-none
            focus:ring-2
            focus:ring-cyan-500
          "
        />

        <input
          type="number"
          name="price"
          placeholder="Price"
          value={book.price}
          onChange={handleChange}
          required
          className="
            w-full
            p-4
            mb-6
            rounded-lg
            bg-slate-700
            text-white
            placeholder-gray-300
            border
            border-slate-500
            focus:outline-none
            focus:ring-2
            focus:ring-cyan-500
          "
        />

        <button
          type="submit"
          className="
            w-full
            bg-gradient-to-r
            from-cyan-500
            to-blue-600
            py-4
            rounded-lg
            font-bold
            text-white
            hover:scale-105
            transition
            duration-300
            shadow-lg
          "
        >
          Save Book
        </button>
      </form>

    </div>
  );
}