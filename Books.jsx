import { useEffect, useState } from "react";
import { getAllBooks } from "../api/bookApi";
import BookCard from "../components/BookCard";

export default function Books() {

  const [books, setBooks] = useState([]);

  useEffect(() => {
    loadBooks();
  }, []);

  const loadBooks = async () => {
    try {
      const response = await getAllBooks();
      setBooks(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div className="p-10">

      <h1 className="text-5xl font-bold mb-10">
        Books Library
      </h1>

      <div className="grid md:grid-cols-3 gap-6">

        {books.map((book) => (
          <BookCard
            key={book.bookId}
            book={book}
          />
        ))}

      </div>

    </div>
  );
}