# Running RESTful API Application

## Dependencies.

You must have docker installed on the machine you are running these commands

## Step - 1

```
git clone https://github.com/javahometech/uday-api
```

## Step - 2

```
cd uday-api
```

## Step - 3

```
docker build -t uday:1 .
```

## Step - 4

```
docker run -d -p 8080:8080 uday:1
```

## Step - 5
 Open the browser
```
http://localhost:8080/instances
```
