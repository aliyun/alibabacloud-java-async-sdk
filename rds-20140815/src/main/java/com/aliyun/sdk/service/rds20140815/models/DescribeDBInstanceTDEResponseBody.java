// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEResponseBody</p>
 */
public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    @NameInMap("Databases")
    private Databases databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TDEMode")
    private String TDEMode;

    @NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBInstanceTDEResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.TDEMode = builder.TDEMode;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTDEResponseBody create() {
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
     * @return TDEMode
     */
    public String getTDEMode() {
        return this.TDEMode;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private Databases databases; 
        private String requestId; 
        private String TDEMode; 
        private String TDEStatus; 

        /**
         * The TDE status at the database level.
         * <p>
         * 
         * >  If your instance runs SQL Server 2019 SE or SQL Server EE, you can specify whether to enable TDE at the database level when you enable TDE at the instance level.
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
         * The key method for instance level TDE encryption, with values:
         * <p>
         * - **Aliyun_Generate_Key**
         * - **Customer_Provided_Key**
         * - **Unknown**
         */
        public Builder TDEMode(String TDEMode) {
            this.TDEMode = TDEMode;
            return this;
        }

        /**
         * The TDE status of the instance. Valid values:
         * <p>
         * 
         * *   **Enabled**
         * *   **Disabled**
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBInstanceTDEResponseBody build() {
            return new DescribeDBInstanceTDEResponseBody(this);
        } 

    } 

    public static class Database extends TeaModel {
        @NameInMap("DBName")
        private String DBName;

        @NameInMap("TDEStatus")
        private String TDEStatus;

        private Database(Builder builder) {
            this.DBName = builder.DBName;
            this.TDEStatus = builder.TDEStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return TDEStatus
         */
        public String getTDEStatus() {
            return this.TDEStatus;
        }

        public static final class Builder {
            private String DBName; 
            private String TDEStatus; 

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The TDE status at the database level. Valid values:
             * <p>
             * 
             * *   **Enabled**
             * *   **Disabled**
             */
            public Builder TDEStatus(String TDEStatus) {
                this.TDEStatus = TDEStatus;
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
