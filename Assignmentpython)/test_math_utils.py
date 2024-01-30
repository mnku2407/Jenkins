import pytest
from math_utils import MathUtils  # Assuming MathUtils is defined in math_utils.py

def test_add():
    # Test normal cases
    assert MathUtils.add(5, 3) == 8
    assert MathUtils.add(-1, 1) == 0
    assert MathUtils.add(-2, -3) == -5

    # Test edge cases
    assert MathUtils.add(0, 0) == 0

def test_subtract():
    # Test normal cases
    assert MathUtils.subtract(10, 5) == 5
    assert MathUtils.subtract(-1, 1) == -2
    assert MathUtils.subtract(-3, -2) == -1

    # Test edge cases
    assert MathUtils.subtract(0, 0) == 0

def test_multiply():
    # Test normal cases
    assert MathUtils.multiply(7, 6) == 42
    assert MathUtils.multiply(-1, 4) == -4
    assert MathUtils.multiply(-3, -2) == 6

    # Test edge cases
    assert MathUtils.multiply(0, 5) == 0

def test_divide():
    # Test normal cases
    assert MathUtils.divide(8, 2) == 4
    assert MathUtils.divide(-10, 2) == -5
    assert MathUtils.divide(-6, -3) == 2

    # Test division by zero
    assert MathUtils.divide(5, 0) == -1.0

    # Test edge cases
    assert MathUtils.divide(0, 5) == 0