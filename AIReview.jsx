import { useState } from "react";
import { getAIReview } from "../api/bookApi";

export default function AIReview() {

  const [author, setAuthor] = useState("");
  const [review, setReview] = useState("");
  const [loading, setLoading] = useState(false);

  const generateReview = async () => {

    if (!author.trim()) {
      alert("Please enter an author name");
      return;
    }

    try {
      setLoading(true);

      const response = await getAIReview(author);

      setReview(response.data);

    } catch (error) {

      console.error(error);

      setReview("❌ Failed to generate AI review.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="min-h-screen px-6 py-10">

      <div className="max-w-5xl mx-auto">

        <h1 className="text-6xl font-bold text-white mb-10">
          🤖 AI Author Review
        </h1>

        <div
          className="
            bg-slate-800/90
            backdrop-blur-lg
            border
            border-cyan-500/30
            rounded-2xl
            p-8
            shadow-2xl
          "
        >

          <div className="flex flex-col md:flex-row gap-4">

            <input
              type="text"
              placeholder="Enter Author Name"
              value={author}
              onChange={(e) => setAuthor(e.target.value)}
              className="
                flex-1
                p-4
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
              onClick={generateReview}
              className="
                bg-gradient-to-r
                from-blue-500
                to-purple-600
                px-8
                py-4
                rounded-lg
                font-semibold
                text-white
                hover:scale-105
                transition
                duration-300
                shadow-lg
              "
            >
              {loading ? "Generating..." : "Generate Review"}
            </button>

          </div>

        </div>

        {review && (

          <div
            className="
              mt-10
              bg-slate-800/90
              backdrop-blur-lg
              border
              border-purple-500/30
              rounded-2xl
              p-8
              shadow-2xl
            "
          >

            <h2 className="text-3xl font-bold text-cyan-400 mb-6">
              AI Review
            </h2>

            <p className="text-gray-200 text-lg leading-8 whitespace-pre-wrap">
              {review}
            </p>

          </div>

        )}

      </div>

    </div>
  );
}