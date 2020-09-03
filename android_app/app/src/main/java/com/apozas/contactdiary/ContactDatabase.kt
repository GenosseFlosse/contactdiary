package com.apozas.contactdiary

/*
    This file is part of Contact Diary.
    Contact Diary is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    Contact Diary is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with Contact Diary. If not, see <http://www.gnu.org/licenses/>.
    Copyright 2020 by Alex Pozas-Kerstjens (apozas)
*/

import android.provider.BaseColumns

class ContactDatabase {
    object ContactDatabase {
        // Table contents are grouped together in an anonymous object.
        object FeedEntry : BaseColumns {
            const val TABLE_NAME = "ContactDB"
            const val TYPE_COLUMN = "Type"
            const val NAME_COLUMN = "Name"
            const val PLACE_COLUMN = "Place"
            const val DATETIME_COLUMN = "Timestamp"
            const val PHONE_COLUMN = "Phone"
            const val RELATIVE_COLUMN = "Relative"
            const val COMPANIONS_COLUMN = "Companions"
            const val CLOSECONTACT_COLUMN = "CloseContact"
            const val ENCOUNTER_COLUMN = "EncounterType"
        }
    }

    companion object {
        const val SQL_CREATE_ENTRIES =
            "CREATE TABLE ${ContactDatabase.FeedEntry.TABLE_NAME} (" +
                    "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                    "${ContactDatabase.FeedEntry.TYPE_COLUMN} TEXT," +
                    "${ContactDatabase.FeedEntry.NAME_COLUMN} TEXT," +
                    "${ContactDatabase.FeedEntry.PLACE_COLUMN} TEXT," +
                    "${ContactDatabase.FeedEntry.DATETIME_COLUMN} INT," +
                    "${ContactDatabase.FeedEntry.PHONE_COLUMN} TEXT," +
                    "${ContactDatabase.FeedEntry.RELATIVE_COLUMN} TINYINT," +
                    "${ContactDatabase.FeedEntry.COMPANIONS_COLUMN} TEXT," +
                    "${ContactDatabase.FeedEntry.ENCOUNTER_COLUMN} TINYINT," +
                    "${ContactDatabase.FeedEntry.CLOSECONTACT_COLUMN} TINYINT)"
        const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${ContactDatabase.FeedEntry.TABLE_NAME}"
    }

}