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
 * {@link DescribeWaitingSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWaitingSQLInfoResponseBody</p>
 */
public class DescribeWaitingSQLInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWaitingSQLInfoResponseBody(Builder builder) {
        this.database = builder.database;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWaitingSQLInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String database; 
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeWaitingSQLInfoResponseBody model) {
            this.database = model.database;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * <p>The queried lock-waiting query.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWaitingSQLInfoResponseBody build() {
            return new DescribeWaitingSQLInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWaitingSQLInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWaitingSQLInfoResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private String application;

        @com.aliyun.core.annotation.NameInMap("BlockedByApplication")
        private String blockedByApplication;

        @com.aliyun.core.annotation.NameInMap("BlockedByPID")
        private String blockedByPID;

        @com.aliyun.core.annotation.NameInMap("BlockedBySQLStmt")
        private String blockedBySQLStmt;

        @com.aliyun.core.annotation.NameInMap("BlockedByUser")
        private String blockedByUser;

        @com.aliyun.core.annotation.NameInMap("GrantLocks")
        private String grantLocks;

        @com.aliyun.core.annotation.NameInMap("NotGrantLocks")
        private String notGrantLocks;

        @com.aliyun.core.annotation.NameInMap("PID")
        private String PID;

        @com.aliyun.core.annotation.NameInMap("SQLStmt")
        private String SQLStmt;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.application = builder.application;
            this.blockedByApplication = builder.blockedByApplication;
            this.blockedByPID = builder.blockedByPID;
            this.blockedBySQLStmt = builder.blockedBySQLStmt;
            this.blockedByUser = builder.blockedByUser;
            this.grantLocks = builder.grantLocks;
            this.notGrantLocks = builder.notGrantLocks;
            this.PID = builder.PID;
            this.SQLStmt = builder.SQLStmt;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public String getApplication() {
            return this.application;
        }

        /**
         * @return blockedByApplication
         */
        public String getBlockedByApplication() {
            return this.blockedByApplication;
        }

        /**
         * @return blockedByPID
         */
        public String getBlockedByPID() {
            return this.blockedByPID;
        }

        /**
         * @return blockedBySQLStmt
         */
        public String getBlockedBySQLStmt() {
            return this.blockedBySQLStmt;
        }

        /**
         * @return blockedByUser
         */
        public String getBlockedByUser() {
            return this.blockedByUser;
        }

        /**
         * @return grantLocks
         */
        public String getGrantLocks() {
            return this.grantLocks;
        }

        /**
         * @return notGrantLocks
         */
        public String getNotGrantLocks() {
            return this.notGrantLocks;
        }

        /**
         * @return PID
         */
        public String getPID() {
            return this.PID;
        }

        /**
         * @return SQLStmt
         */
        public String getSQLStmt() {
            return this.SQLStmt;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String application; 
            private String blockedByApplication; 
            private String blockedByPID; 
            private String blockedBySQLStmt; 
            private String blockedByUser; 
            private String grantLocks; 
            private String notGrantLocks; 
            private String PID; 
            private String SQLStmt; 
            private String user; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.application = model.application;
                this.blockedByApplication = model.blockedByApplication;
                this.blockedByPID = model.blockedByPID;
                this.blockedBySQLStmt = model.blockedBySQLStmt;
                this.blockedByUser = model.blockedByUser;
                this.grantLocks = model.grantLocks;
                this.notGrantLocks = model.notGrantLocks;
                this.PID = model.PID;
                this.SQLStmt = model.SQLStmt;
                this.user = model.user;
            } 

            /**
             * <p>The application that sent the query.</p>
             * 
             * <strong>example:</strong>
             * <p>DataGrip 2022.1.5</p>
             */
            public Builder application(String application) {
                this.application = application;
                return this;
            }

            /**
             * <p>The application that sent the blocking query.</p>
             * 
             * <strong>example:</strong>
             * <p>DataGrip 2022.1.5</p>
             */
            public Builder blockedByApplication(String blockedByApplication) {
                this.blockedByApplication = blockedByApplication;
                return this;
            }

            /**
             * <p>The process ID of the blocking query.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder blockedByPID(String blockedByPID) {
                this.blockedByPID = blockedByPID;
                return this;
            }

            /**
             * <p>The SQL statement of the blocking query.</p>
             * 
             * <strong>example:</strong>
             * <p>Select * from t1;</p>
             */
            public Builder blockedBySQLStmt(String blockedBySQLStmt) {
                this.blockedBySQLStmt = blockedBySQLStmt;
                return this;
            }

            /**
             * <p>The database account that is used to perform the blocking query.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser1</p>
             */
            public Builder blockedByUser(String blockedByUser) {
                this.blockedByUser = blockedByUser;
                return this;
            }

            /**
             * <p>The authorized locks.</p>
             * 
             * <strong>example:</strong>
             * <p>ShareLock,AccessExclusiveLock</p>
             */
            public Builder grantLocks(String grantLocks) {
                this.grantLocks = grantLocks;
                return this;
            }

            /**
             * <p>The unauthorized locks.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessShareLock</p>
             */
            public Builder notGrantLocks(String notGrantLocks) {
                this.notGrantLocks = notGrantLocks;
                return this;
            }

            /**
             * <p>The ID of the process that uniquely identifies the query.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder PID(String PID) {
                this.PID = PID;
                return this;
            }

            /**
             * <p>The SQL statement of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>Select * from t1,t2 where t1.id=t2.id;</p>
             */
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
                return this;
            }

            /**
             * <p>The database account that is used to perform the query.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
