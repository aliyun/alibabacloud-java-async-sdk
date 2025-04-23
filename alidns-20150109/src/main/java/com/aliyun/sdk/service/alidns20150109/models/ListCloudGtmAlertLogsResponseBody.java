// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ListCloudGtmAlertLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmAlertLogsResponseBody</p>
 */
public class ListCloudGtmAlertLogsResponseBody extends TeaModel {
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

    private ListCloudGtmAlertLogsResponseBody(Builder builder) {
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

    public static ListCloudGtmAlertLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCloudGtmAlertLogsResponseBody model) {
            this.logs = model.logs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The alert logs.</p>
         */
        public Builder logs(Logs logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>Current page number, starting from 1, default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of alarm log entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListCloudGtmAlertLogsResponseBody build() {
            return new ListCloudGtmAlertLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudGtmAlertLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAlertLogsResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Log(Builder builder) {
            this.actionType = builder.actionType;
            this.content = builder.content;
            this.entityType = builder.entityType;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String actionType; 
            private String content; 
            private String entityType; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Log model) {
                this.actionType = model.actionType;
                this.content = model.content;
                this.entityType = model.entityType;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>Alert type:</p>
             * <ul>
             * <li>ALERT</li>
             * <li>RESUME</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALERT</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The alert content.</p>
             * 
             * <strong>example:</strong>
             * <p>The alert content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Alarm object types:</p>
             * <ul>
             * <li>GTM_ADDRESS: Address</li>
             * <li>GTM_ADDRESS_POOL: Address Pool</li>
             * <li>GTM_INSTANCE: Instance</li>
             * <li>GTM_MONITOR_TEMPLATE: Health Check Template</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GTM_ADDRESS</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>Alert log time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1711328826977</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudGtmAlertLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudGtmAlertLogsResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Log")
        private java.util.List<Log> log;

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
        public java.util.List<Log> getLog() {
            return this.log;
        }

        public static final class Builder {
            private java.util.List<Log> log; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.log = model.log;
            } 

            /**
             * Log.
             */
            public Builder log(java.util.List<Log> log) {
                this.log = log;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
