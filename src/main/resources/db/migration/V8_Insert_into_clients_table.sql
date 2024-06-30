INSERT INTO clients (
    "unique_id",
    "client_id",
    "client_secret",
    "redirect_uri",
    "created_at",
    "updated_at"
)
VALUES (
    '0e1f6b9c-2a3b-4d8e-a9f2-6b7c1a5d9e3f',
    'gAjKkusOQpuMisTHAMqxwmUxcafCEUxQ',
    'NRVdqahVt3gyWOiJbtohgVnLqIKDvRjCtp6suDfhU47QSgwv3825hd21xPv5DWvWehwwNxXOhrW5y1vuDuQdnTVusRYvsABRBakqb2TBRLtA5dm2JShkgTaaASjOh8ka',
    'http://localhost:3000/oauth/callback',
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP
);