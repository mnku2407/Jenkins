class MathUtils:
    def add(a, b):
        """Return the sum of a and b."""
        return a + b

    def subtract(a, b):
        """Return the result of subtracting b from a."""
        return a - b

    def multiply(a, b):
        """Return the product of a and b."""
        return a * b

    def divide(a, b):
        """
        Return the result of dividing a by b.
        Returns -1.0 if b is 0 to avoid division by zero.
        """
        if b == 0:
            return -1.0
        else:
            return a / b