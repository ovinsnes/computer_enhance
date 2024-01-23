function run() {
  var arr = [200];
  var sum = 0;

  arr.forEach((i) => {
    sum += i;
  });

  return sum;
}

function end() {}

for (let i = 0; i < 1e6; ++i) {
  run();
  end();
}
