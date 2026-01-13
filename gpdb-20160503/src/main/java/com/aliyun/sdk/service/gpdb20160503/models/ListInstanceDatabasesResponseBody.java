// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListInstanceDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceDatabasesResponseBody</p>
 */
public class ListInstanceDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListInstanceDatabasesResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceDatabasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List<Databases> databases; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceDatabasesResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.databases = model.databases;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The queried databases.</p>
         */
        public Builder databases(java.util.List<Databases> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceDatabasesResponseBody build() {
            return new ListInstanceDatabasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceDatabasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceDatabasesResponseBody</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Databases(Builder builder) {
            this.databaseName = builder.databaseName;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String databaseName; 
            private String description; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.databaseName = model.databaseName;
                this.description = model.description;
            } 

            /**
             * <p>The database name.</p>
             * <ul>
             * <li>Only contain letters, digits, and underscores (_).</li>
             * <li>Must start with a letter.</li>
             * <li>Up to 63 characters in length.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testdatabase</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
