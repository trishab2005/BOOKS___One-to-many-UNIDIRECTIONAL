import { useNavigate } from "react-router-dom";
import { motion } from "framer-motion";

export default function Dashboard() {

  const navigate = useNavigate();

  return (
    <div className="relative h-[90vh] overflow-hidden">

      <div className="absolute inset-0 bg-gradient-to-br from-slate-950 via-blue-950 to-slate-950"></div>

      <div className="absolute top-20 left-20 w-72 h-72 bg-cyan-500/20 rounded-full blur-3xl"></div>

      <div className="absolute bottom-20 right-20 w-96 h-96 bg-purple-500/20 rounded-full blur-3xl"></div>

      <div className="relative z-10 h-full flex flex-col justify-center items-center">

        <motion.h1
          initial={{ opacity:0, y:-40 }}
          animate={{ opacity:1, y:0 }}
          transition={{ duration:1 }}
          className="text-7xl font-bold"
        >
          AI Powered Library
        </motion.h1>

        <p className="mt-5 text-2xl text-slate-300">
          Spring Boot • Oracle • React • OpenAI
        </p>

        <div className="flex gap-4 mt-10">

          <button
            onClick={() => navigate("/books")}
            className="bg-cyan-500 px-8 py-3 rounded-xl"
          >
            Explore Books
          </button>

          <button
            onClick={() => navigate("/ai")}
            className="border px-8 py-3 rounded-xl"
          >
            AI Reviews
          </button>

        </div>

      </div>

    </div>
  );
}