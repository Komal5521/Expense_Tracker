<html>
<body>
    <h2>Create Expense</h2>
    <form action="/expenses/create" method="POST">
        <label>Description:</label>
        <input type="text" name="description">
        <label>Amount:</label>
        <input type="text" name="amount">
        <label>Date:</label>
        <input type="date" name="date">
        <button type="submit">Save</button>
    </form>
</body>
</html>
