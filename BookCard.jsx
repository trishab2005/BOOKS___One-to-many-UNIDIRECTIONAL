export default function BookCard({ book }) {
  return (
    <div className="bg-slate-800 p-5 rounded-xl shadow-lg hover:scale-105 transition">

      <h2 className="text-2xl font-bold mb-2">
        {book.title}
      </h2>

      <p className="text-cyan-400">
        {book.category}
      </p>

      <p className="mt-2">
        ₹ {book.price}
      </p>

    </div>
  );
}