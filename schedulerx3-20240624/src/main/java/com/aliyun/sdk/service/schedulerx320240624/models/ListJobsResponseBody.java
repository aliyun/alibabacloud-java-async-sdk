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
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
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

    private ListJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
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

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AttemptInterval")
        private Integer attemptInterval;

        @com.aliyun.core.annotation.NameInMap("Calendar")
        private String calendar;

        @com.aliyun.core.annotation.NameInMap("CleanMode")
        private String cleanMode;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CurrentExecuteStatus")
        private Integer currentExecuteStatus;

        @com.aliyun.core.annotation.NameInMap("DataOffset")
        private Integer dataOffset;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecutorBlockStrategy")
        private String executorBlockStrategy;

        @com.aliyun.core.annotation.NameInMap("JobHandler")
        private String jobHandler;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("LastExecuteEndTime")
        private String lastExecuteEndTime;

        @com.aliyun.core.annotation.NameInMap("LastExecuteStatus")
        private Integer lastExecuteStatus;

        @com.aliyun.core.annotation.NameInMap("MaxAttempt")
        private Integer maxAttempt;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NoticeConfig")
        private String noticeConfig;

        @com.aliyun.core.annotation.NameInMap("NoticeContacts")
        private String noticeContacts;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RouteStrategy")
        private Integer routeStrategy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeExpression")
        private String timeExpression;

        @com.aliyun.core.annotation.NameInMap("TimeType")
        private Integer timeType;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        @com.aliyun.core.annotation.NameInMap("Xattrs")
        private String xattrs;

        private Records(Builder builder) {
            this.appName = builder.appName;
            this.attemptInterval = builder.attemptInterval;
            this.calendar = builder.calendar;
            this.cleanMode = builder.cleanMode;
            this.creator = builder.creator;
            this.currentExecuteStatus = builder.currentExecuteStatus;
            this.dataOffset = builder.dataOffset;
            this.description = builder.description;
            this.executorBlockStrategy = builder.executorBlockStrategy;
            this.jobHandler = builder.jobHandler;
            this.jobId = builder.jobId;
            this.jobType = builder.jobType;
            this.lastExecuteEndTime = builder.lastExecuteEndTime;
            this.lastExecuteStatus = builder.lastExecuteStatus;
            this.maxAttempt = builder.maxAttempt;
            this.maxConcurrency = builder.maxConcurrency;
            this.name = builder.name;
            this.noticeConfig = builder.noticeConfig;
            this.noticeContacts = builder.noticeContacts;
            this.parameters = builder.parameters;
            this.priority = builder.priority;
            this.routeStrategy = builder.routeStrategy;
            this.status = builder.status;
            this.timeExpression = builder.timeExpression;
            this.timeType = builder.timeType;
            this.timeZone = builder.timeZone;
            this.timezone = builder.timezone;
            this.updater = builder.updater;
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
         * @return attemptInterval
         */
        public Integer getAttemptInterval() {
            return this.attemptInterval;
        }

        /**
         * @return calendar
         */
        public String getCalendar() {
            return this.calendar;
        }

        /**
         * @return cleanMode
         */
        public String getCleanMode() {
            return this.cleanMode;
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
         * @return dataOffset
         */
        public Integer getDataOffset() {
            return this.dataOffset;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executorBlockStrategy
         */
        public String getExecutorBlockStrategy() {
            return this.executorBlockStrategy;
        }

        /**
         * @return jobHandler
         */
        public String getJobHandler() {
            return this.jobHandler;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
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
         * @return maxAttempt
         */
        public Integer getMaxAttempt() {
            return this.maxAttempt;
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
         * @return noticeConfig
         */
        public String getNoticeConfig() {
            return this.noticeConfig;
        }

        /**
         * @return noticeContacts
         */
        public String getNoticeContacts() {
            return this.noticeContacts;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return routeStrategy
         */
        public Integer getRouteStrategy() {
            return this.routeStrategy;
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
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
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
         * @return xattrs
         */
        public String getXattrs() {
            return this.xattrs;
        }

        public static final class Builder {
            private String appName; 
            private Integer attemptInterval; 
            private String calendar; 
            private String cleanMode; 
            private String creator; 
            private Integer currentExecuteStatus; 
            private Integer dataOffset; 
            private String description; 
            private String executorBlockStrategy; 
            private String jobHandler; 
            private Long jobId; 
            private String jobType; 
            private String lastExecuteEndTime; 
            private Integer lastExecuteStatus; 
            private Integer maxAttempt; 
            private Integer maxConcurrency; 
            private String name; 
            private String noticeConfig; 
            private String noticeContacts; 
            private String parameters; 
            private Integer priority; 
            private Integer routeStrategy; 
            private Integer status; 
            private String timeExpression; 
            private Integer timeType; 
            private String timeZone; 
            private String timezone; 
            private String updater; 
            private String xattrs; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AttemptInterval.
             */
            public Builder attemptInterval(Integer attemptInterval) {
                this.attemptInterval = attemptInterval;
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
             * CleanMode.
             */
            public Builder cleanMode(String cleanMode) {
                this.cleanMode = cleanMode;
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
             * DataOffset.
             */
            public Builder dataOffset(Integer dataOffset) {
                this.dataOffset = dataOffset;
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
             * ExecutorBlockStrategy.
             */
            public Builder executorBlockStrategy(String executorBlockStrategy) {
                this.executorBlockStrategy = executorBlockStrategy;
                return this;
            }

            /**
             * JobHandler.
             */
            public Builder jobHandler(String jobHandler) {
                this.jobHandler = jobHandler;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
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
             * MaxAttempt.
             */
            public Builder maxAttempt(Integer maxAttempt) {
                this.maxAttempt = maxAttempt;
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
             * NoticeConfig.
             */
            public Builder noticeConfig(String noticeConfig) {
                this.noticeConfig = noticeConfig;
                return this;
            }

            /**
             * NoticeContacts.
             */
            public Builder noticeContacts(String noticeContacts) {
                this.noticeContacts = noticeContacts;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RouteStrategy.
             */
            public Builder routeStrategy(Integer routeStrategy) {
                this.routeStrategy = routeStrategy;
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
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

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
             * <ul>
             * <li></li>
             * </ul>
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
