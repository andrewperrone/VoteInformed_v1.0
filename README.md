# Table of Contents
- [About](#about)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Repository Contents/Complete Codebase Overview](#repository-contentscomplete-codebase-overview)
- [Database (Schema & Data Scripts)](#database-schema--data-scripts)
- [Step by Step Setup Guide](#step-by-step-setup-guide)
- [Build & Generate APK](#build--generate-apk)
- [Packages & APIs](#packages--apis)
- [User Guide](#user-guide)
- [Contributors](#contributors)
- [License & Acknowledgements](#license--acknowledgements)
## About
**VoteInformed** is an Android application that seeks to help voters compare two politicians side-by-side across multiple metrics (Overview, issues, contact). Users can select politicians from a list and view their profile, with the option to switch between tabs to see different set of information. Data is provided locally, from SQLite and Room, or fetched from APIs.

## Features
### Politician Profiles
- Search politicians by name
- Biography, political party, social media links, committees & positions, and contact information
- Switch between multiple politicians
### Articles & News
- Display political articles related to user selected concerns
- Updates feed based on user's preferences
### Legislation
- Display 2025 legislations with ability to filter based on category
### Community Concerns
- Updates homepage news article to match user's concerns
### Politician Comparison Tool
- Side by side comparison view
- Compares politicians based on bio, policices. etc,
- Includes swap option for left and right politicians, search dialog, and remove option
- UI changes for updates on both sides
### Favorites System
- User can bookmark articles on homepage to bookmark page (Saved tab) for future references
- Bookmark stored on  local databases
### Local Database & Repository
- Politicians, articles, concerns, etc stored on Room Databases, and DAO interfaces which enables fast offline viewing
### Search System
- Fast search for specific politicians used on main search page and comparison dialog

## Technology Stack
### Languages & Platforms
- Java (Android)
- Android SDK
### UI/AndroidX
- AndroidX layouts
- Material components
### Libraries
- Glide (image loading)
- Room/SQLite for local database
- ViewModel
### Tools
- Android Studio
- Gradle
### Hardware/Device
- Android device or emulator (On Android studio)

## Repository Contents/Complete Codebase Overview

## Database (Schema & Data Scripts)

## Step by Step Setup Guide
### Prerequisites
- Java JDK 11+
- Android Studio (Arctic Fox or newer)
- Android SDK Platform
- Gradle
- git for cloning repository
### Clone
1. git clone url
2. Open Android Studio
3. Allow Android Studio to sync with Gradle
### Build & Generating APK
- From Android Studio: Run -> app (choose device)

## Key Code Snippets & Explanations
Below will showcase important files and their description
### *PoliticianComparisonActivity.java*
#### **Purpose:** main UI controller for comparison screen
#### **Key responsibilities:**
- Initializes views and tabs
- Loads politician from repository
- Open selection dialog (search) to choose politician on the left or right
- Update card UI (name, party, image, metric rows) based on selected politician and active tab
#### **Important snippet (updateCard logic)**
##### Description:
### *VoteInformed_Repository.java*
#### **Purpose:** abstraction layer for data
#### **Brief logic:** 
#### **Sample**
### *PoliticianSearchAdapter.java*
#### **Purpose:** show filtered search results in dialog_politician_search
#### Behavior
- Accepts a list of Politician object and filters them by name on the text input. Click listener triggers the selection
## Packages & APIs
### Libraries
- Glide
- Material Components
- AndroidX
- Room
## User Guide
### Launch
- The app will prompt you to either login or register for an account
  - Start by registering an account by providing for the information being asked
- After signing up, you'll be redirected to the home page
  - Options on the homepage include voicing your own concerns, articles, legislations, sidebar overlay, and profile
    - Voice Your Concerns: allows user to select issues they're interested in
    - Articles: curated up to date articles based on users interest (from voice your concerns) 
    - Legislations: display 2025 legislations with option to filter
    - Sidebar: accessible on the top left icon that provides quick access to home, search, saved articles, comparison tool, profile, and signout
    - Profile: lets user to view their bookmarks, change their personal information (name, email address, and address), and log out
### Testing Strategy & Sample Test Cases
#### Testing approaches
- Manual UI testing (emulator + device)
- Unit tests
- Integration tests
- Smoke tests
#### Sample test cases
##### Launching
- Start app and go to Politician Comparison page
- Politician Comparison should have two cards that show "Empty Slot" and "Select a candidate"
##### Select Candidate 1
- Select swap on left card and search "Eric Adams" and select Eric Adams
-  Left politician card should display Eric Adams' information
##### Select Candidate 2
- Select swap on right card and search "Chuck Schumer" and select Chuck Schumer
- Right politician card should display Chuck Schumer's information
##### Tab Switching
- Select candidate and switch from Overview to Issue tab
- Metric rows 3 & 4 (Issue tab inforamtion) should now be visible while the others are hidden
##### Remove Candidate
- Select candidate and remove them from comparison
- The corresponding politician card should reset back to Empty Slot

## Contributors
- Andrew Perrone: Project owner & original author, Database designer, GitHub manager, Project lead
- Sarah Torres: Co author, Fullstack lead
- Jennifer Kwon: Co author, Database designer 
- Jeff Lin: Co author, UIUX lead

## License & Acknowledgements

