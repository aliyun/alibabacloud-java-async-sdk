// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceErrorLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceErrorLogResponseBody</p>
 */
public class DescribeDBInstanceErrorLogResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBInstanceErrorLogResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceErrorLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The content of the error log.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceErrorLogResponseBody build() {
            return new DescribeDBInstanceErrorLogResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Database")
        private String database;

        @NameInMap("Host")
        private String host;

        @NameInMap("LogContext")
        private String logContext;

        @NameInMap("LogLevel")
        private String logLevel;

        @NameInMap("Time")
        private Long time;

        @NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.database = builder.database;
            this.host = builder.host;
            this.logContext = builder.logContext;
            this.logLevel = builder.logLevel;
            this.time = builder.time;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return logContext
         */
        public String getLogContext() {
            return this.logContext;
        }

        /**
         * @return logLevel
         */
        public String getLogLevel() {
            return this.logLevel;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String database; 
            private String host; 
            private String logContext; 
            private String logLevel; 
            private Long time; 
            private String user; 

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * This parameter is not supported.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The content of the error log.
             */
            public Builder logContext(String logContext) {
                this.logContext = logContext;
                return this;
            }

            /**
             * The level of the queried log.
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * The time when the log was generated. The time is displayed in UTC.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * The name of the database account.
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
