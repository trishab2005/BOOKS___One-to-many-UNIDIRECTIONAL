import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <nav className="bg-black text-white px-10 py-4 flex justify-between">
      <h1 className="font-bold text-2xl">
        📚 AI Library
      </h1>

      <div className="flex gap-6">
        <Link to="/">Dashboard</Link>
        <Link to="/books">Books</Link>
        <Link to="/add-book">Add Book</Link>
        <Link to="/ai">AI Review</Link>
      </div>
    </nav>
  );
}