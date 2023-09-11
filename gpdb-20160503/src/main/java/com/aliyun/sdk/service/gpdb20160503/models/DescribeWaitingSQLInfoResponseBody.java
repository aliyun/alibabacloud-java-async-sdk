// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWaitingSQLInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWaitingSQLInfoResponseBody</p>
 */
public class DescribeWaitingSQLInfoResponseBody extends TeaModel {
    @NameInMap("Database")
    private String database;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
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

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private String requestId; 

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * The queried lock-waiting query.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWaitingSQLInfoResponseBody build() {
            return new DescribeWaitingSQLInfoResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Application")
        private String application;

        @NameInMap("BlockedByApplication")
        private String blockedByApplication;

        @NameInMap("BlockedByPID")
        private String blockedByPID;

        @NameInMap("BlockedBySQLStmt")
        private String blockedBySQLStmt;

        @NameInMap("BlockedByUser")
        private String blockedByUser;

        @NameInMap("GrantLocks")
        private String grantLocks;

        @NameInMap("NotGrantLocks")
        private String notGrantLocks;

        @NameInMap("PID")
        private String PID;

        @NameInMap("SQLStmt")
        private String SQLStmt;

        @NameInMap("User")
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

            /**
             * The application that sent the query.
             */
            public Builder application(String application) {
                this.application = application;
                return this;
            }

            /**
             * The application that sent the blocking query.
             */
            public Builder blockedByApplication(String blockedByApplication) {
                this.blockedByApplication = blockedByApplication;
                return this;
            }

            /**
             * The process ID of the blocking query.
             */
            public Builder blockedByPID(String blockedByPID) {
                this.blockedByPID = blockedByPID;
                return this;
            }

            /**
             * The SQL statement of the blocking query.
             */
            public Builder blockedBySQLStmt(String blockedBySQLStmt) {
                this.blockedBySQLStmt = blockedBySQLStmt;
                return this;
            }

            /**
             * The database account that is used to perform the blocking query.
             */
            public Builder blockedByUser(String blockedByUser) {
                this.blockedByUser = blockedByUser;
                return this;
            }

            /**
             * The authorized locks.
             */
            public Builder grantLocks(String grantLocks) {
                this.grantLocks = grantLocks;
                return this;
            }

            /**
             * The unauthorized locks.
             */
            public Builder notGrantLocks(String notGrantLocks) {
                this.notGrantLocks = notGrantLocks;
                return this;
            }

            /**
             * The ID of the process that uniquely identifies the query.
             */
            public Builder PID(String PID) {
                this.PID = PID;
                return this;
            }

            /**
             * The SQL statement of the query.
             */
            public Builder SQLStmt(String SQLStmt) {
                this.SQLStmt = SQLStmt;
                return this;
            }

            /**
             * The database account that is used to perform the query.
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
