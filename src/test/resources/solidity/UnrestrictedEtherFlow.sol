contract Wallet {
    address payable owner;

    function withdraw() payable public {
        owner.transfer(msg.value);
    }

    function () payable external {}
}
