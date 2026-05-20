#!/bin/bash

while true
do
    fswatch -1 .

    sleep 120

    git add .

    git commit -m "auto update: $(date '+%Y-%m-%d %H:%M:%S')" || true

    git pull --rebase origin main

    git push

    echo "Changes synced to GitHub"
done
