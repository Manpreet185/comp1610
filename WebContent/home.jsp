<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="text-align:center">
		<h1>Bank Account</h1>
	</div>
	<div style="width: 46%; float:left; height:200px; background:gray; margin:1%; padding: 1%">
		<b>Your Account Details:</b>
		<table>
			<tr>
				<td>Username</td>
				<td>ha07</td>
			</tr>
			<tr>
				<td>Accounts</td>
				<td>0</td>
			</tr>
		</table>
	</div>
	<div style="width: 46%; float:left; height:200px; background:yellow; margin:1%; padding: 1%">
		<form action=create-account >
			<h3>Create Account</h3>
			<table>	
				<tr>
					<td>Select Account Type:</td>
					<td><select name="account_type">
						<option value="saving">Saving</option>
						<option value="current">Current/Checking</option>
						<option value="isa">ISA (individual savings account)</option>
					</select></td>
				</tr>
				<tr>
					<td>Enter Initial AMOUNT:</td>
					<td><input type="text" name="amount"/></td>
				</tr>
			</table>
			<button type="submit">Create Account</button>
     	</form>
	</div>
	
	<div style="width: 96%; float:left; height:200px; background:yellow; margin:1%; padding: 1%">
		<form action="transfer-amount" >
			<h3>Transfer Amount</h3>
			<table>	
				<tr>
					<td>Select Account Type:</td>
					<td><select name="account_type">
						<option value="saving">Saving</option>
						<option value="current">Current/Checking</option>
						<option value="isa">ISA (individual savings account)</option>
					</select></td>
				</tr>
				<tr>
					<td>Enter Account ID:</td>
					<td><input type="text" name="account_id"/></td>
				</tr>
				<tr>
					<td>Enter Initial AMOUNT:</td>
					<td><input type="text" name="amount"/></td>
				</tr>
			</table>
			<button type="submit">Create Account</button>
     	</form>
	</div>
</body>
</html>