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
 * {@link DescribeDBInstanceErrorLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceErrorLogResponseBody</p>
 */
public class DescribeDBInstanceErrorLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceErrorLogResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The content of the error log.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceErrorLogResponseBody build() {
            return new DescribeDBInstanceErrorLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceErrorLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceErrorLogResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("LogContext")
        private String logContext;

        @com.aliyun.core.annotation.NameInMap("LogLevel")
        private String logLevel;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("User")
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.database = model.database;
                this.host = model.host;
                this.logContext = model.logContext;
                this.logLevel = model.logLevel;
                this.time = model.time;
                this.user = model.user;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbtest</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The content of the error log.</p>
             * 
             * <strong>example:</strong>
             * <p>unsupported frontend protocol 2689.28208: server supports 1.0 to 3.0</p>
             */
            public Builder logContext(String logContext) {
                this.logContext = logContext;
                return this;
            }

            /**
             * <p>The level of the queried log.</p>
             * 
             * <strong>example:</strong>
             * <p>FATAL</p>
             */
            public Builder logLevel(String logLevel) {
                this.logLevel = logLevel;
                return this;
            }

            /**
             * <p>The time when the log was generated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-24 11:28:14</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The name of the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpguser</p>
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
