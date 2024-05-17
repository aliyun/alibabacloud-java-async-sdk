// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBLinksResponseBody</p>
 */
public class DescribeDBLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBLinkInfos")
    private java.util.List < DBLinkInfos> DBLinkInfos;

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

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBLinkInfos
     */
    public java.util.List < DBLinkInfos> getDBLinkInfos() {
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
        private java.util.List < DBLinkInfos> DBLinkInfos; 
        private String requestId; 

        /**
         * The ID of the cluster.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Details about the database links.
         */
        public Builder DBLinkInfos(java.util.List < DBLinkInfos> DBLinkInfos) {
            this.DBLinkInfos = DBLinkInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBLinksResponseBody build() {
            return new DescribeDBLinksResponseBody(this);
        } 

    } 

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

            /**
             * The ID of the source cluster that the database link connects.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The name of the database link.
             */
            public Builder DBLinkName(String DBLinkName) {
                this.DBLinkName = DBLinkName;
                return this;
            }

            /**
             * The name of the source database of the database link.
             */
            public Builder sourceDBName(String sourceDBName) {
                this.sourceDBName = sourceDBName;
                return this;
            }

            /**
             * The account of the destination database of the database link.
             */
            public Builder targetAccount(String targetAccount) {
                this.targetAccount = targetAccount;
                return this;
            }

            /**
             * The ID of the destination cluster that the database link connects.
             * <p>
             * 
             * > If the destination cluster is not a PolarDB for Oracle cluster, the returned value is empty.
             */
            public Builder targetDBInstanceName(String targetDBInstanceName) {
                this.targetDBInstanceName = targetDBInstanceName;
                return this;
            }

            /**
             * The name of the destination database of the database link.
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
