// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryExperimentTaskByClusterIdResponseBody} extends {@link TeaModel}
 *
 * <p>PageableQueryExperimentTaskByClusterIdResponseBody</p>
 */
public class PageableQueryExperimentTaskByClusterIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("ExperimentTasks")
    private java.util.List < ExperimentTasks> experimentTasks;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Pages")
    private Integer pages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private PageableQueryExperimentTaskByClusterIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.experimentTasks = builder.experimentTasks;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageableQueryExperimentTaskByClusterIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return experimentTasks
     */
    public java.util.List < ExperimentTasks> getExperimentTasks() {
        return this.experimentTasks;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pages
     */
    public Integer getPages() {
        return this.pages;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private java.util.List < ExperimentTasks> experimentTasks; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageSize; 
        private Integer pages; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ExperimentTasks.
         */
        public Builder experimentTasks(java.util.List < ExperimentTasks> experimentTasks) {
            this.experimentTasks = experimentTasks;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Pages.
         */
        public Builder pages(Integer pages) {
            this.pages = pages;
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

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBody build() {
            return new PageableQueryExperimentTaskByClusterIdResponseBody(this);
        } 

    } 

    public static class Creator extends TeaModel {
        @NameInMap("SubUserId")
        private String subUserId;

        @NameInMap("UserId")
        private String userId;

        private Creator(Builder builder) {
            this.subUserId = builder.subUserId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return subUserId
         */
        public String getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String subUserId; 
            private String userId; 

            /**
             * SubUserId.
             */
            public Builder subUserId(String subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    public static class SchedulerConfig extends TeaModel {
        @NameInMap("CronExpression")
        private String cronExpression;

        @NameInMap("FixedTime")
        private String fixedTime;

        private SchedulerConfig(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.fixedTime = builder.fixedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerConfig create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        public static final class Builder {
            private String cronExpression; 
            private String fixedTime; 

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            public SchedulerConfig build() {
                return new SchedulerConfig(this);
            } 

        } 

    }
    public static class ExtInfo extends TeaModel {
        @NameInMap("SchedulerConfig")
        private SchedulerConfig schedulerConfig;

        private ExtInfo(Builder builder) {
            this.schedulerConfig = builder.schedulerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtInfo create() {
            return builder().build();
        }

        /**
         * @return schedulerConfig
         */
        public SchedulerConfig getSchedulerConfig() {
            return this.schedulerConfig;
        }

        public static final class Builder {
            private SchedulerConfig schedulerConfig; 

            /**
             * SchedulerConfig.
             */
            public Builder schedulerConfig(SchedulerConfig schedulerConfig) {
                this.schedulerConfig = schedulerConfig;
                return this;
            }

            public ExtInfo build() {
                return new ExtInfo(this);
            } 

        } 

    }
    public static class ExperimentTasks extends TeaModel {
        @NameInMap("Creator")
        private Creator creator;

        @NameInMap("CurrentPhase")
        private String currentPhase;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("ExperimentName")
        private String experimentName;

        @NameInMap("ExtInfo")
        private ExtInfo extInfo;

        @NameInMap("Message")
        private String message;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Result")
        private String result;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        private ExperimentTasks(Builder builder) {
            this.creator = builder.creator;
            this.currentPhase = builder.currentPhase;
            this.endTime = builder.endTime;
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
            this.extInfo = builder.extInfo;
            this.message = builder.message;
            this.namespace = builder.namespace;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExperimentTasks create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return currentPhase
         */
        public String getCurrentPhase() {
            return this.currentPhase;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return extInfo
         */
        public ExtInfo getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Creator creator; 
            private String currentPhase; 
            private Long endTime; 
            private String experimentId; 
            private String experimentName; 
            private ExtInfo extInfo; 
            private String message; 
            private String namespace; 
            private String result; 
            private Long startTime; 
            private String state; 
            private String taskId; 

            /**
             * Creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CurrentPhase.
             */
            public Builder currentPhase(String currentPhase) {
                this.currentPhase = currentPhase;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ExperimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(ExtInfo extInfo) {
                this.extInfo = extInfo;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ExperimentTasks build() {
                return new ExperimentTasks(this);
            } 

        } 

    }
}
