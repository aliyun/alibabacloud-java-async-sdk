// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbInstanceDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbInstanceDbsResponseBody</p>
 */
public class DescribeDbInstanceDbsResponseBody extends TeaModel {
    @NameInMap("Databases")
    private Databases databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private String total;

    private DescribeDbInstanceDbsResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbInstanceDbsResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public Databases getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Databases databases; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * Indicates the information about the storage-layer databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates the total number of storage-layer databases.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDbInstanceDbsResponseBody build() {
            return new DescribeDbInstanceDbsResponseBody(this);
        } 

    } 

    public static class Database extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Status")
        private Integer status;

        private Database(Builder builder) {
            this.dbName = builder.dbName;
            this.description = builder.description;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dbName; 
            private String description; 
            private Integer status; 

            /**
             * Indicates the name of a storage-layer database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Indicates the description of the storage-layer database.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates the state of the storage-layer database. Valid values:
             * <p>
             * 
             * *   **0**: The database is being created.
             * *   **1**: The database is available.
             * *   **3**: The database is being deleted.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("Database")
        private java.util.List < Database> database;

        private Databases(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List < Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List < Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List < Database> database) {
                this.database = database;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
