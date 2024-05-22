// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmLogsResponseBody</p>
 */
public class DescribeGtmLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private Logs logs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeGtmLogsResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public Logs getLogs() {
        return this.logs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private Logs logs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The list of logs returned.
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned on all pages.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmLogsResponseBody build() {
            return new DescribeGtmLogsResponseBody(this);
        } 

    } 

    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OperAction")
        private String operAction;

        @com.aliyun.core.annotation.NameInMap("OperIp")
        private String operIp;

        @com.aliyun.core.annotation.NameInMap("OperTime")
        private String operTime;

        @com.aliyun.core.annotation.NameInMap("OperTimestamp")
        private Long operTimestamp;

        private Log(Builder builder) {
            this.content = builder.content;
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.id = builder.id;
            this.operAction = builder.operAction;
            this.operIp = builder.operIp;
            this.operTime = builder.operTime;
            this.operTimestamp = builder.operTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operAction
         */
        public String getOperAction() {
            return this.operAction;
        }

        /**
         * @return operIp
         */
        public String getOperIp() {
            return this.operIp;
        }

        /**
         * @return operTime
         */
        public String getOperTime() {
            return this.operTime;
        }

        /**
         * @return operTimestamp
         */
        public Long getOperTimestamp() {
            return this.operTimestamp;
        }

        public static final class Builder {
            private String content; 
            private String entityId; 
            private String entityName; 
            private String entityType; 
            private Long id; 
            private String operAction; 
            private String operIp; 
            private String operTime; 
            private Long operTimestamp; 

            /**
             * The formatted message content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The ID of the object that was operated on.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The name of the object that was operated on.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * The type of the object that was operated on.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The ID of the log record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The operation performed.
             */
            public Builder operAction(String operAction) {
                this.operAction = operAction;
                return this;
            }

            /**
             * The IP address subject to the operation.
             */
            public Builder operIp(String operIp) {
                this.operIp = operIp;
                return this;
            }

            /**
             * The time when the operation was performed.
             */
            public Builder operTime(String operTime) {
                this.operTime = operTime;
                return this;
            }

            /**
             * A timestamp that indicates the time when the operation was performed.
             */
            public Builder operTimestamp(Long operTimestamp) {
                this.operTimestamp = operTimestamp;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Log")
        private java.util.List < Log> log;

        private Logs(Builder builder) {
            this.log = builder.log;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return log
         */
        public java.util.List < Log> getLog() {
            return this.log;
        }

        public static final class Builder {
            private java.util.List < Log> log; 

            /**
             * Log.
             */
            public Builder log(java.util.List < Log> log) {
                this.log = log;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
