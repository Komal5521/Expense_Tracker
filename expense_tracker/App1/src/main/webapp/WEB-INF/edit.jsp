<html>
<body>
    <h2>Edit Expense</h2>
    <form action="/expenses/edit/${expense.id}" method="POST">
        <label>Description:</label>
        <input type="text" name="description" value="${expense.description}">
        <label>Amount:</label>
        <input type="text" name="amount" value="${expense.amount}">
        <label>Date:</label>
        <input type="date" name="date" value="${expense.date}">
        <button type="submit">Update</button>
    </form>
</body>
</html>
