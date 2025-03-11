// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDbInstanceDbsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbInstanceDbsResponseBody</p>
 */
public class DescribeDbInstanceDbsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private Databases databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>Indicates the information about the storage-layer databases.</p>
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9F3D991-08DE-4B74-BE0E-06B809******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Indicates the total number of storage-layer databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDbInstanceDbsResponseBody build() {
            return new DescribeDbInstanceDbsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDbInstanceDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbInstanceDbsResponseBody</p>
     */
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Indicates the name of a storage-layer database.</p>
             * 
             * <strong>example:</strong>
             * <p>db_test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates the description of the storage-layer database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates the state of the storage-layer database. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The database is being created.</li>
             * <li><strong>1</strong>: The database is available.</li>
             * <li><strong>3</strong>: The database is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeDbInstanceDbsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbInstanceDbsResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private java.util.List<Database> database;

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
        public java.util.List<Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List<Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List<Database> database) {
                this.database = database;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
