// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBLinksResponseBody</p>
 */
public class DescribeDBLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBLinkInfos")
    private java.util.List<DBLinkInfos> DBLinkInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBLinksResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.DBLinkInfos = builder.DBLinkInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBLinksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBLinkInfos
     */
    public java.util.List<DBLinkInfos> getDBLinkInfos() {
        return this.DBLinkInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private java.util.List<DBLinkInfos> DBLinkInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBLinksResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.DBLinkInfos = model.DBLinkInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-a*************</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Details about the database links.</p>
         */
        public Builder DBLinkInfos(java.util.List<DBLinkInfos> DBLinkInfos) {
            this.DBLinkInfos = DBLinkInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>45D24263-7E3A-4140-9472-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBLinksResponseBody build() {
            return new DescribeDBLinksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBLinksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLinksResponseBody</p>
     */
    public static class DBLinkInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBLinkName")
        private String DBLinkName;

        @com.aliyun.core.annotation.NameInMap("SourceDBName")
        private String sourceDBName;

        @com.aliyun.core.annotation.NameInMap("TargetAccount")
        private String targetAccount;

        @com.aliyun.core.annotation.NameInMap("TargetDBInstanceName")
        private String targetDBInstanceName;

        @com.aliyun.core.annotation.NameInMap("TargetDBName")
        private String targetDBName;

        private DBLinkInfos(Builder builder) {
            this.DBInstanceName = builder.DBInstanceName;
            this.DBLinkName = builder.DBLinkName;
            this.sourceDBName = builder.sourceDBName;
            this.targetAccount = builder.targetAccount;
            this.targetDBInstanceName = builder.targetDBInstanceName;
            this.targetDBName = builder.targetDBName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBLinkInfos create() {
            return builder().build();
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBLinkName
         */
        public String getDBLinkName() {
            return this.DBLinkName;
        }

        /**
         * @return sourceDBName
         */
        public String getSourceDBName() {
            return this.sourceDBName;
        }

        /**
         * @return targetAccount
         */
        public String getTargetAccount() {
            return this.targetAccount;
        }

        /**
         * @return targetDBInstanceName
         */
        public String getTargetDBInstanceName() {
            return this.targetDBInstanceName;
        }

        /**
         * @return targetDBName
         */
        public String getTargetDBName() {
            return this.targetDBName;
        }

        public static final class Builder {
            private String DBInstanceName; 
            private String DBLinkName; 
            private String sourceDBName; 
            private String targetAccount; 
            private String targetDBInstanceName; 
            private String targetDBName; 

            private Builder() {
            } 

            private Builder(DBLinkInfos model) {
                this.DBInstanceName = model.DBInstanceName;
                this.DBLinkName = model.DBLinkName;
                this.sourceDBName = model.sourceDBName;
                this.targetAccount = model.targetAccount;
                this.targetDBInstanceName = model.targetDBInstanceName;
                this.targetDBName = model.targetDBName;
            } 

            /**
             * <p>The ID of the source cluster that the database link connects.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-a*************</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The name of the database link.</p>
             * 
             * <strong>example:</strong>
             * <p>dblink_test</p>
             */
            public Builder DBLinkName(String DBLinkName) {
                this.DBLinkName = DBLinkName;
                return this;
            }

            /**
             * <p>The name of the source database of the database link.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb1</p>
             */
            public Builder sourceDBName(String sourceDBName) {
                this.sourceDBName = sourceDBName;
                return this;
            }

            /**
             * <p>The account of the destination database of the database link.</p>
             * 
             * <strong>example:</strong>
             * <p>testacc</p>
             */
            public Builder targetAccount(String targetAccount) {
                this.targetAccount = targetAccount;
                return this;
            }

            /**
             * <p>The ID of the destination cluster that the database link connects.</p>
             * <blockquote>
             * <p>If the destination cluster is not a PolarDB for Oracle cluster, the returned value is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pc-b************</p>
             */
            public Builder targetDBInstanceName(String targetDBInstanceName) {
                this.targetDBInstanceName = targetDBInstanceName;
                return this;
            }

            /**
             * <p>The name of the destination database of the database link.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb2</p>
             */
            public Builder targetDBName(String targetDBName) {
                this.targetDBName = targetDBName;
                return this;
            }

            public DBLinkInfos build() {
                return new DBLinkInfos(this);
            } 

        } 

    }
}
