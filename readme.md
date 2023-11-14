## PROBLEM STATEMENT ##
![Kuddle Design Challenge](image-2.png)

## TO DO ##
# Implementing same logic for Dance and Yoga Classes
# Design the database schema and database connectivity for persistance
# Cleaner error handling


## FLOW FOR DEMO PURPOSES ##
![Assuming there are some users already in program](image-1.png)
![Once the user is removed, Waiting List user is promoted to the program](image.png)

## DTO ## 
```
{
    "gym": {
        "maxCapacity": 3,
        "users": [
            "Karan",
            "Shivansh",
            "Pratyush"
        ],
        "startTime": "18:00:00",
        "waitingListUsers": [
            "Richa"
        ]
    }
}
```

```
{
    "gym": {
        "maxCapacity": 3,
        "users": [
            "Karan",
            "Shivansh",
            "Richa"
        ],
        "startTime": "18:00:00",
        "waitingListUsers": []
    }
}
```