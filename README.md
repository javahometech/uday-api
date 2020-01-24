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
docker build -t udaykanakaboina/myapp-api:1 .
```

## Step - 4

```
docker login -u udaykanakaboina -p yourpassword
```

## Step - 5

```
docker push udaykanakaboina/myapp-api:1
```

## Step - 5

make suer docker-compose.yml is pointing to above image
```
docker-compose up -d
```

## Step - 5
 Open the browser
```
http://localhost:8080/instances
```
