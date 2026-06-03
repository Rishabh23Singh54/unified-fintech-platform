CREATE TABLE users (
    -- Matches Long + GenerationType.AUTO (BIGSERIAL handles auto-incrementing IDs in Postgres)
    id BIGSERIAL PRIMARY KEY,
    
    -- Matches String + unique = true + length = 100 + nullable = false
    username VARCHAR(100) NOT NULL UNIQUE,
    
    -- Matches String + nullable = false
    password VARCHAR(255) NOT NULL,
    
    -- Matches String + nullable = false
    role VARCHAR(255) NOT NULL,
    
    -- Matches Date + @CreationTimestamp (Defaults to current time on insert)
    created_at TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    
    -- Matches Date + @UpdateTimestamp
    updated_at TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);
