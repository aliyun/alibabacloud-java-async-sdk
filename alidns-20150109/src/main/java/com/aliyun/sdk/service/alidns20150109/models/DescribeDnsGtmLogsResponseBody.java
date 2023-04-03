// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmLogsResponseBody</p>
 */
public class DescribeDnsGtmLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    private Logs logs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeDnsGtmLogsResponseBody(Builder builder) {
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

    public static DescribeDnsGtmLogsResponseBody create() {
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
         * The returned logs.
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * The number of the returned page.
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

        public DescribeDnsGtmLogsResponseBody build() {
            return new DescribeDnsGtmLogsResponseBody(this);
        } 

    } 

    public static class Log extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("EntityName")
        private String entityName;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("OperAction")
        private String operAction;

        @NameInMap("OperTime")
        private String operTime;

        @NameInMap("OperTimestamp")
        private Long operTimestamp;

        private Log(Builder builder) {
            this.content = builder.content;
            this.entityId = builder.entityId;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.id = builder.id;
            this.operAction = builder.operAction;
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
             * The ID of the object on which the operation was performed.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The name of the object on which the operation was performed.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * The type of the object on which the operation was performed.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The ID of the record.
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
             * The time when the operation was performed.
             */
            public Builder operTime(String operTime) {
                this.operTime = operTime;
                return this;
            }

            /**
             * The timestamp of the operation.
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
        @NameInMap("Log")
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
