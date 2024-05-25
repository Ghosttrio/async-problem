import React, { useEffect, useState } from "react";
import axios from "axios";

function Test() {
    const doTest = () => {
        const requestData = [
            { id: 1, name: "test1" },
            { id: 2, name: "test2" },
            { id: 3, name: "test3" },
            { id: 4, name: "test4" },
            { id: 5, name: "test5" },
            { id: 6, name: "test6" },
            { id: 7, name: "test7" },
            { id: 8, name: "test8" },
            { id: 9, name: "test9" },
            { id: 10, name: "test10" }
        ];

        for (const data of requestData) {
            console.log("현재 값 ===> " + data.name);
            axios.post('http://localhost:8080/test', data);
        }
    }

    return (
        <div>
            <button onClick={searchDojo}>테스트</button>
        </div>
    );
}

export default Test;