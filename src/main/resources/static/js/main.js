import { table } from './table.js';

Promise.all(
        ['queryWithHint']
        .map(path => fetch(path).then(r => r.json()).then(ar => table(ar, "")))
        ).then(ar => rootDiv.innerHTML = ar.join(''));

