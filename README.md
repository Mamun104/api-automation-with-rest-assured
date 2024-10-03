
# 🚀 **API Automation with Rest Assured**

![API Automation](https://github.com/user-attachments/assets/ce0184f5-f0fd-4083-b31a-21bd60c4a358)

This project demonstrates robust API automation using **Rest Assured**, executed through **Java** and **Gradle**, with comprehensive test insights provided by **Allure** reports. It encompasses key operations such as user login, creation, update, and deletion, with results presented in visually detailed reports generated by **newman-reporter-allure**.

---

## 🛠️ **Technologies and Tools** 🛠️

- **Java**  
- **Gradle**  
- **Allure**  
- **IntelliJ**  

---

## 📋 **Prerequisites** 📋

Before starting, ensure the following tools are installed:

- **Java**  
- **Gradle**  
- **Allure**  

---

## 🔍 **Test Scenarios** 🔍

### **User Login** 🔑
- 🔴 **Invalid email login attempt**  
- 🔴 **Invalid password login attempt**  
- 🔴 **Valid email with invalid password**  
- 🔴 **Invalid email with valid password**  
- ✅ **Successful login with valid credentials**  

### **User Management** 🧑‍💼
- ✅ **Create user with valid data**  
- 🔴 **Attempt to create user with invalid data**  
- ✅ **Update user with valid data**  
- 🔴 **Attempt to update user with invalid data**  
- ✅ **Delete user with valid data**  
- 🔴 **Attempt to delete user with invalid data**  

---

## 📋 **Test Cases**

### **User Login Test Cases** 🔑

| **Test Case ID** | **Description**                                  | **Expected Result**                     | **Actual Result** | **Test Status** |
|------------------|--------------------------------------------------|----------------------------------------|------------------|-----------------|
| **TC-001**       | User cannot log in with an invalid email         | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-002**       | User cannot log in with an invalid password      | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-003**       | Valid email but invalid password                 | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-004**       | Invalid email but valid password                 | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-005**       | Valid credentials, successful login              | Redirect to dashboard                  | As Expected       | ✅ **Pass**      |

### **User Management Test Cases** 🧑‍💼

| **Test Case ID** | **Description**                                  | **Expected Result**                     | **Actual Result** | **Test Status** |
|------------------|--------------------------------------------------|----------------------------------------|------------------|-----------------|
| **TC-006**       | Create a user with valid data                    | User created successfully              | As Expected       | ✅ **Pass**      |
| **TC-007**       | Attempt to create user with invalid data         | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-008**       | Update a user with valid data                    | User updated successfully              | As Expected       | ✅ **Pass**      |
| **TC-009**       | Attempt to update user with invalid data         | Error message displayed                | As Expected       | ✅ **Pass**      |
| **TC-010**       | Delete user with valid data                      | User deleted successfully              | As Expected       | ✅ **Pass**      |
| **TC-011**       | Attempt to delete user with invalid data         | Error message displayed                | As Expected       | ✅ **Pass**      |

---

## 🏃‍♂️ **How to Run the Project** 🏃‍♂️

Follow these steps to set up and run the project:

**Clone the repository**  
   ```bash
   git clone <repository-url>
   ```

**Navigate to the root folder**  
   ```bash
   cd <project-root-directory>
   ```

**Execute the tests using Gradle**  
   ```bash
   gradle clean test
   ```

**Generate Allure reports**  
   ```bash
   allure generate allure-results --clean -o allure-report
   ```

**Serve Allure results locally**  
   ```bash
   allure serve allure-results
   ```

---

## ✨ **Installing Allure Reporter** ✨

For generating advanced Allure reports, install **newman-reporter-allure** globally:
```bash
npm install -g newman-reporter-allure
```

---

## ⚙️ **Running the Project with Allure** ⚙️

Generate Allure reports locally with the following commands:

```bash
allure generate allure-results --clean -o allure-report
```

```bash
allure serve allure-results
```

---

## 🌟 **Sample Allure Reports** 🌟

Check out these example Allure reports generated by **newman-reporter-allure**:

![Sample Allure Report 1](https://github.com/user-attachments/assets/2680d7ea-a009-4823-98d8-d15b9f7f4d5f)

![Sample Allure Report 2](https://github.com/user-attachments/assets/c2df0cce-fdca-4e73-a534-a22c4596a42c)

![Sample Allure Report 3](https://github.com/user-attachments/assets/4173c9cc-ea47-484e-b41d-c424be8932cf)

These reports offer:

- 📊 **Detailed request/response logs**  
- 📈 **Interactive charts and statistics**  
- 📋 **Summaries of test outcomes with pass/fail insights**  

---

🎉 **Congratulations! Now you’re ready to dive into API automation, generate powerful reports, and explore the beautiful insights Allure brings to your testing suite!** Happy testing! 🎉

---
