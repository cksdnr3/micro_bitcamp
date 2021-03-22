import React, { useState } from 'react';

const Counter = () => {
  const [ count, setCount ] = useState(0);

  const onIncrease = () => {
    setCount(count + 1);
  }

  const onDecrease = () => {
    setCount(count - 1);
  }

  return (
    <>
    <div>count: {count}</div>
    <button onClick={ onIncrease }>증가</button>
    <button onClick={ onDecrease }>감소</button>
    </>
  )
}

export default Counter;