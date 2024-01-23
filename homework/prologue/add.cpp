/*
LISTING 1
*/

int __attribute__((noinline)) add(int A, int B)
{
    return A + B;
}

int main(int ArgCount, char **Args)
{
    return add(1234, 5678);
}