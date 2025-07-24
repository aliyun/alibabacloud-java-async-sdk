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
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

        private Logs(Builder builder) {
            this.category = builder.category;
            this.connInfo = builder.connInfo;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.DBInstanceName = builder.DBInstanceName;
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

        public static final class Builder {
            private String category; 
            private String connInfo; 
            private String content; 
            private String createTime; 
            private String DBInstanceName; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.category = model.category;
                this.connInfo = model.connInfo;
                this.content = model.content;
                this.createTime = model.createTime;
                this.DBInstanceName = model.DBInstanceName;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConnInfo.
             */
            public Builder connInfo(String connInfo) {
                this.connInfo = connInfo;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ItemsNumbers.
             */
            public Builder itemsNumbers(Long itemsNumbers) {
                this.itemsNumbers = itemsNumbers;
                return this;
            }

            /**
             * Logs.
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * MaxRecordsPerPage.
             */
            public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
                this.maxRecordsPerPage = maxRecordsPerPage;
                return this;
            }

            /**
             * PageNumbers.
             */
            public Builder pageNumbers(Integer pageNumbers) {
                this.pageNumbers = pageNumbers;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalRecords.
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
