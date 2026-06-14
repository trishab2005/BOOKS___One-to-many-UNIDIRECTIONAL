import axios from "axios";

const BOOK_API = "http://localhost:8888/books";
const AI_API = "http://localhost:8888/api/ai";

export const getAllBooks = () => {
  return axios.get(BOOK_API);
};

export const createBook = (book) => {
  return axios.post(BOOK_API, book);
};

export const getBookByTitle = (title) => {
  return axios.get(`${BOOK_API}/title/${title}`);
};

export const getBooksByCategory = (category) => {
  return axios.get(`${BOOK_API}/category/${category}`);
};

export const getBooksByPriceRange = (start, end) => {
  return axios.get(
    `${BOOK_API}/price-range?start=${start}&end=${end}`
  );
};

export const getAIReview = (author) => {
  return axios.get(`${AI_API}/review/${author}`);
};