// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowsResponseBody</p>
 */
public class ListWorkflowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWorkflowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListWorkflowsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public ListWorkflowsResponseBody build() {
            return new ListWorkflowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private Integer appType;

        @com.aliyun.core.annotation.NameInMap("Calendar")
        private String calendar;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CurrentExecuteStatus")
        private Integer currentExecuteStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LastExecuteEndTime")
        private String lastExecuteEndTime;

        @com.aliyun.core.annotation.NameInMap("LastExecuteStatus")
        private Integer lastExecuteStatus;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private Long workflowId;

        @com.aliyun.core.annotation.NameInMap("Xattrs")
        private String xattrs;

        private Records(Builder builder) {
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.calendar = builder.calendar;
            this.creator = builder.creator;
            this.currentExecuteStatus = builder.currentExecuteStatus;
            this.description = builder.description;
            this.lastExecuteEndTime = builder.lastExecuteEndTime;
            this.lastExecuteStatus = builder.lastExecuteStatus;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.status = builder.status;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
            this.timezone = builder.timezone;
            this.updater = builder.updater;
            this.workflowId = builder.workflowId;
            this.xattrs = builder.xattrs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return calendar
         */
        public String getCalendar() {
            return this.calendar;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return currentExecuteStatus
         */
        public Integer getCurrentExecuteStatus() {
            return this.currentExecuteStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastExecuteEndTime
         */
        public String getLastExecuteEndTime() {
            return this.lastExecuteEndTime;
        }

        /**
         * @return lastExecuteStatus
         */
        public Integer getLastExecuteStatus() {
            return this.lastExecuteStatus;
        }

        /**
         * @return maxConcurrency
         */
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return timeExpression
         */
        public String getTimeExpression() {
            return this.timeExpression;
        }

        /**
         * @return timeType
         */
        public Integer getTimeType() {
            return this.timeType;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return updater
         */
        public String getUpdater() {
            return this.updater;
        }

        /**
         * @return workflowId
         */
        public Long getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return xattrs
         */
        public String getXattrs() {
            return this.xattrs;
        }

        public static final class Builder {
            private String appName; 
            private Integer appType; 
            private String calendar; 
            private String creator; 
            private Integer currentExecuteStatus; 
            private String description; 
            private String lastExecuteEndTime; 
            private Integer lastExecuteStatus; 
            private Integer maxConcurrency; 
            private String name; 
            private Integer status; 
            private String timeExpression; 
            private Integer timeType; 
            private String timezone; 
            private String updater; 
            private Long workflowId; 
            private String xattrs; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.appName = model.appName;
                this.appType = model.appType;
                this.calendar = model.calendar;
                this.creator = model.creator;
                this.currentExecuteStatus = model.currentExecuteStatus;
                this.description = model.description;
                this.lastExecuteEndTime = model.lastExecuteEndTime;
                this.lastExecuteStatus = model.lastExecuteStatus;
                this.maxConcurrency = model.maxConcurrency;
                this.name = model.name;
                this.status = model.status;
                this.timeExpression = model.timeExpression;
                this.timeType = model.timeType;
                this.timezone = model.timezone;
                this.updater = model.updater;
                this.workflowId = model.workflowId;
                this.xattrs = model.xattrs;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * Calendar.
             */
            public Builder calendar(String calendar) {
                this.calendar = calendar;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CurrentExecuteStatus.
             */
            public Builder currentExecuteStatus(Integer currentExecuteStatus) {
                this.currentExecuteStatus = currentExecuteStatus;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LastExecuteEndTime.
             */
            public Builder lastExecuteEndTime(String lastExecuteEndTime) {
                this.lastExecuteEndTime = lastExecuteEndTime;
                return this;
            }

            /**
             * LastExecuteStatus.
             */
            public Builder lastExecuteStatus(Integer lastExecuteStatus) {
                this.lastExecuteStatus = lastExecuteStatus;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TimeExpression.
             */
            public Builder timeExpression(String timeExpression) {
                this.timeExpression = timeExpression;
                return this;
            }

            /**
             * TimeType.
             */
            public Builder timeType(Integer timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * Updater.
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(Long workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * Xattrs.
             */
            public Builder xattrs(String xattrs) {
                this.xattrs = xattrs;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
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
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
