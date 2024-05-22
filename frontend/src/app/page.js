"use client";
import React from 'react';
import axios from 'axios';

export default function Home() {

  const handleRandomizerSubmit = async () => {
    const response = await axios.get(
      "localhost:8080/"
    )
  }


  return (
    <div className="homePage">
      <div className="randomizer">
        <form onSubmit={handleRandomizerSubmit}>
          <button type="submit">Submit</button>
        </form>
      </div>
    </div>
  );
}
