// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeErrorLogRecordsResponseBody</p>
 */
public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeErrorLogRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeErrorLogRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeErrorLogRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAA17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeErrorLogRecordsResponseBody build() {
            return new DescribeErrorLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogRecordsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConnInfo")
        private String connInfo;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Db")
        private String db;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("UserIp")
        private String userIp;

        private Logs(Builder builder) {
            this.category = builder.category;
            this.connInfo = builder.connInfo;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
            this.db = builder.db;
            this.user = builder.user;
            this.userIp = builder.userIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return connInfo
         */
        public String getConnInfo() {
            return this.connInfo;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return userIp
         */
        public String getUserIp() {
            return this.userIp;
        }

        public static final class Builder {
            private String category; 
            private String connInfo; 
            private String content; 
            private String createTime; 
            private String DBInstanceName; 
            private String db; 
            private String user; 
            private String userIp; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.category = model.category;
                this.connInfo = model.connInfo;
                this.content = model.content;
                this.createTime = model.createTime;
                this.DBInstanceName = model.DBInstanceName;
                this.db = model.db;
                this.user = model.user;
                this.userIp = model.userIp;
            } 

            /**
             * <p>The log category. Valid values:</p>
             * <ul>
             * <li><strong>NETWORK</strong>: network connectivity log.</li>
             * <li><strong>ACCESS</strong>: access control log.</li>
             * <li><strong>-</strong>: general log.</li>
             * <li><strong>COMMAND</strong>: slow log.</li>
             * <li><strong>SHARDING</strong>: cluster log.</li>
             * <li><strong>STORAGE</strong>: storage engine log.</li>
             * <li><strong>CONNPOOL</strong>: connection pool log.</li>
             * <li><strong>ASIO</strong>: asynchronous I/O log.</li>
             * <li><strong>WRITE</strong>: slow update log.</li>
             * </ul>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NETWORK</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The log connection information.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>conn18xxxxxx</p>
             */
            public Builder connInfo(String connInfo) {
                this.connInfo = connInfo;
                return this;
            }

            /**
             * <p>The error log content.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-15T15:14:27.175188+08:00 0 [Note] [MY-012468] [InnoDB] Transactions deadlock detected, dumping detailed information.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the error log was generated. The value is a UNIX timestamp in milliseconds.</p>
             * <blockquote>
             * <p>Notice: For ApsaraDB for MongoDB instances, the time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1731983067000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p>Only ApsaraDB for MongoDB instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>d-bp128a003436****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The database name.</p>
             * <blockquote>
             * <p>Only certain special logs of ApsaraDB RDS for PostgreSQL and PolarDB for PostgreSQL instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>db_name</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The database account.</p>
             * <blockquote>
             * <p>Only certain special logs of ApsaraDB RDS for PostgreSQL and PolarDB for PostgreSQL instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>db_user</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The client IP address.</p>
             * <blockquote>
             * <p>Only certain special logs of ApsaraDB RDS for PostgreSQL and PolarDB for PostgreSQL instances are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>x.x.x.x</p>
             */
            public Builder userIp(String userIp) {
                this.userIp = userIp;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeErrorLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeErrorLogRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
        private Long itemsNumbers;

        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
        private Integer maxRecordsPerPage;

        @com.aliyun.core.annotation.NameInMap("PageNumbers")
        private Integer pageNumbers;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.itemsNumbers = builder.itemsNumbers;
            this.logs = builder.logs;
            this.maxRecordsPerPage = builder.maxRecordsPerPage;
            this.pageNumbers = builder.pageNumbers;
            this.startTime = builder.startTime;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return itemsNumbers
         */
        public Long getItemsNumbers() {
            return this.itemsNumbers;
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return maxRecordsPerPage
         */
        public Integer getMaxRecordsPerPage() {
            return this.maxRecordsPerPage;
        }

        /**
         * @return pageNumbers
         */
        public Integer getPageNumbers() {
            return this.pageNumbers;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private String endTime; 
            private Long itemsNumbers; 
            private java.util.List<Logs> logs; 
            private Integer maxRecordsPerPage; 
            private Integer pageNumbers; 
            private String startTime; 
            private Long totalRecords; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.itemsNumbers = model.itemsNumbers;
                this.logs = model.logs;
                this.maxRecordsPerPage = model.maxRecordsPerPage;
                this.pageNumbers = model.pageNumbers;
                this.startTime = model.startTime;
                this.totalRecords = model.totalRecords;
            } 

            /**
             * <p>The end time of the query. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-23T05:48:43Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The total number of log entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder itemsNumbers(Long itemsNumbers) {
                this.itemsNumbers = itemsNumbers;
                return this;
            }

            /**
             * <p>The log details.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The maximum number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * <p>The page number of the current query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumbers(Integer pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * <p>The start time of the query. The time is in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-22T05:48:43Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of log entries within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
