// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEResponseBody</p>
 */
public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private Databases databases;

    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TDEMode")
    private String TDEMode;

    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBInstanceTDEResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.encryptionKey = builder.encryptionKey;
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
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
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
        private String encryptionKey; 
        private String requestId; 
        private String TDEMode; 
        private String TDEStatus; 

        /**
         * <p>The TDE status at the database level.</p>
         * <blockquote>
         * <p> If your instance runs SQL Server 2019 SE or SQL Server EE, you can specify whether to enable TDE at the database level when you enable TDE at the instance level.</p>
         * </blockquote>
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>749c1df7-<strong><strong>-</strong></strong>-<strong><strong>-</strong></strong></p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The method that is used to generate the key for TDE at the instance level. Valid values:</p>
         * <ul>
         * <li><strong>Aliyun_Generate_Key</strong></li>
         * <li><strong>Customer_Provided_Key</strong></li>
         * <li><strong>Unknown</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aliyun_Generate_Key</p>
         */
        public Builder TDEMode(String TDEMode) {
            this.TDEMode = TDEMode;
            return this;
        }

        /**
         * <p>The TDE status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBInstanceTDEResponseBody build() {
            return new DescribeDBInstanceTDEResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTDEResponseBody</p>
     */
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("TDEStatus")
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test02</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The TDE status at the database level. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
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
    /**
     * 
     * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTDEResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
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
