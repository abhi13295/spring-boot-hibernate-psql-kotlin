# spring-boot-hibernate-psql-kotlin
Basic spring boot application with hibernate and postgres dependency in Kotlin
Kotlin 1.9.23
Spring 3.2.0

# Download postgres and run the commands
-- Create the user
CREATE USER demoabhinav WITH PASSWORD 'demoabhinav123';

-- Create the database
CREATE DATABASE demo OWNER postgres;

-- Grant database-level privileges
GRANT ALL PRIVILEGES ON DATABASE demo TO demoabhinav;

-- Switch to the database
\c demo

-- Grant schema-level privileges
GRANT USAGE ON SCHEMA public TO demoabhinav;
GRANT CREATE ON SCHEMA public TO demoabhinav;

-- Grant privileges on existing tables, sequences, and functions
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO demoabhinav;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO demoabhinav;
GRANT ALL PRIVILEGES ON ALL FUNCTIONS IN SCHEMA public TO demoabhinav;

-- Set default privileges for new objects
ALTER DEFAULT PRIVILEGES IN SCHEMA public GRANT ALL ON TABLES TO demoabhinav;
ALTER DEFAULT PRIVILEGES IN SCHEMA public GRANT ALL ON SEQUENCES TO demoabhinav;
ALTER DEFAULT PRIVILEGES IN SCHEMA public GRANT ALL ON FUNCTIONS TO demoabhinav;
