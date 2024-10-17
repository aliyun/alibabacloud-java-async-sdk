// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTaskFlowsByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowsByPageResponseBody</p>
 */
public class ListTaskFlowsByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskFlowList")
    private TaskFlowList taskFlowList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTaskFlowsByPageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskFlowList = builder.taskFlowList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowsByPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
     * @return taskFlowList
     */
    public TaskFlowList getTaskFlowList() {
        return this.taskFlowList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TaskFlowList taskFlowList; 
        private Integer totalCount; 

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6CB28697-BFE2-5739-9228-3971990E982C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the returned task flows.</p>
         */
        public Builder taskFlowList(TaskFlowList taskFlowList) {
            this.taskFlowList = taskFlowList;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTaskFlowsByPageResponseBody build() {
            return new ListTaskFlowsByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskFlowsByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowsByPageResponseBody</p>
     */
    public static class TaskFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("CreatorNickName")
        private String creatorNickName;

        @com.aliyun.core.annotation.NameInMap("CronBeginDate")
        private String cronBeginDate;

        @com.aliyun.core.annotation.NameInMap("CronEndDate")
        private String cronEndDate;

        @com.aliyun.core.annotation.NameInMap("CronStr")
        private String cronStr;

        @com.aliyun.core.annotation.NameInMap("CronSwitch")
        private Boolean cronSwitch;

        @com.aliyun.core.annotation.NameInMap("CronType")
        private Integer cronType;

        @com.aliyun.core.annotation.NameInMap("DagName")
        private String dagName;

        @com.aliyun.core.annotation.NameInMap("DagOwnerId")
        private String dagOwnerId;

        @com.aliyun.core.annotation.NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @com.aliyun.core.annotation.NameInMap("DeployId")
        private Long deployId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("LatestInstanceTime")
        private String latestInstanceTime;

        @com.aliyun.core.annotation.NameInMap("ScenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("ScheduleParam")
        private String scheduleParam;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TimeZoneId")
        private String timeZoneId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Integer triggerType;

        private TaskFlow(Builder builder) {
            this.creatorId = builder.creatorId;
            this.creatorNickName = builder.creatorNickName;
            this.cronBeginDate = builder.cronBeginDate;
            this.cronEndDate = builder.cronEndDate;
            this.cronStr = builder.cronStr;
            this.cronSwitch = builder.cronSwitch;
            this.cronType = builder.cronType;
            this.dagName = builder.dagName;
            this.dagOwnerId = builder.dagOwnerId;
            this.dagOwnerNickName = builder.dagOwnerNickName;
            this.deployId = builder.deployId;
            this.description = builder.description;
            this.id = builder.id;
            this.latestInstanceStatus = builder.latestInstanceStatus;
            this.latestInstanceTime = builder.latestInstanceTime;
            this.scenarioId = builder.scenarioId;
            this.scheduleParam = builder.scheduleParam;
            this.status = builder.status;
            this.timeZoneId = builder.timeZoneId;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlow create() {
            return builder().build();
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return creatorNickName
         */
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        /**
         * @return cronBeginDate
         */
        public String getCronBeginDate() {
            return this.cronBeginDate;
        }

        /**
         * @return cronEndDate
         */
        public String getCronEndDate() {
            return this.cronEndDate;
        }

        /**
         * @return cronStr
         */
        public String getCronStr() {
            return this.cronStr;
        }

        /**
         * @return cronSwitch
         */
        public Boolean getCronSwitch() {
            return this.cronSwitch;
        }

        /**
         * @return cronType
         */
        public Integer getCronType() {
            return this.cronType;
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return dagOwnerId
         */
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        /**
         * @return dagOwnerNickName
         */
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        /**
         * @return deployId
         */
        public Long getDeployId() {
            return this.deployId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return latestInstanceStatus
         */
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        /**
         * @return latestInstanceTime
         */
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return scheduleParam
         */
        public String getScheduleParam() {
            return this.scheduleParam;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return timeZoneId
         */
        public String getTimeZoneId() {
            return this.timeZoneId;
        }

        /**
         * @return triggerType
         */
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String creatorId; 
            private String creatorNickName; 
            private String cronBeginDate; 
            private String cronEndDate; 
            private String cronStr; 
            private Boolean cronSwitch; 
            private Integer cronType; 
            private String dagName; 
            private String dagOwnerId; 
            private String dagOwnerNickName; 
            private Long deployId; 
            private String description; 
            private Long id; 
            private Integer latestInstanceStatus; 
            private String latestInstanceTime; 
            private String scenarioId; 
            private String scheduleParam; 
            private Integer status; 
            private String timeZoneId; 
            private Integer triggerType; 

            /**
             * <p>The ID of the user who created the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The username of the user who created the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Creator_NickName</p>
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * <p>The start time of scheduled scheduling. The task flow is not scheduled before this point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01</p>
             */
            public Builder cronBeginDate(String cronBeginDate) {
                this.cronBeginDate = cronBeginDate;
                return this;
            }

            /**
             * <p>The end time of scheduled scheduling. The task flow is not scheduled after this point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01</p>
             */
            public Builder cronEndDate(String cronEndDate) {
                this.cronEndDate = cronEndDate;
                return this;
            }

            /**
             * <p>Scheduled Cron.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 1 * * ? *</p>
             */
            public Builder cronStr(String cronStr) {
                this.cronStr = cronStr;
                return this;
            }

            /**
             * <p>Whether to enable scheduled scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder cronSwitch(Boolean cronSwitch) {
                this.cronSwitch = cronSwitch;
                return this;
            }

            /**
             * <p>Scheduling cycle type. Valid values:</p>
             * <ul>
             * <li><strong>2</strong>: Hourly scheduling</li>
             * <li><strong>3</strong>: Daily scheduling</li>
             * <li><strong>4</strong>: Weekly scheduling</li>
             * <li><strong>5</strong>: Monthly scheduling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cronType(Integer cronType) {
                this.cronType = cronType;
                return this;
            }

            /**
             * <p>The name of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>poc_task_test</p>
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * <p>The user ID of the task flow owner.</p>
             * 
             * <strong>example:</strong>
             * <p>12***89</p>
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * <p>The username of the owner of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>Owner_NickName</p>
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * <p>The ID of the last deployment record of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>65***</p>
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * <p>The description of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>7***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The status of the last execution of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: scheduling disabled</li>
             * <li><strong>2</strong>: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * <p>The time when the last execution record was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-13</p>
             */
            public Builder latestInstanceTime(String latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * <p>The ID of the application scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>1245</p>
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * <p>Event scheduling configuration, JSON string format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;triggerType&quot;:&quot;1&quot;,&quot;specificTime&quot;:&quot;2022-11-15 11:59&quot;}</p>
             */
            public Builder scheduleParam(String scheduleParam) {
                this.scheduleParam = scheduleParam;
                return this;
            }

            /**
             * <p>The status of the task flow. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: invalid</li>
             * <li><strong>1</strong>: scheduling disabled</li>
             * <li><strong>2</strong>: waiting to be scheduled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Time zone setting. Default value: East 8(Asia/Shanghai).</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZoneId(String timeZoneId) {
                this.timeZoneId = timeZoneId;
                return this;
            }

            /**
             * <p>The trigger type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Periodic scheduling</li>
             * <li><strong>1</strong>: Run manually</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public TaskFlow build() {
                return new TaskFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTaskFlowsByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowsByPageResponseBody</p>
     */
    public static class TaskFlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskFlow")
        private java.util.List < TaskFlow> taskFlow;

        private TaskFlowList(Builder builder) {
            this.taskFlow = builder.taskFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskFlowList create() {
            return builder().build();
        }

        /**
         * @return taskFlow
         */
        public java.util.List < TaskFlow> getTaskFlow() {
            return this.taskFlow;
        }

        public static final class Builder {
            private java.util.List < TaskFlow> taskFlow; 

            /**
             * TaskFlow.
             */
            public Builder taskFlow(java.util.List < TaskFlow> taskFlow) {
                this.taskFlow = taskFlow;
                return this;
            }

            public TaskFlowList build() {
                return new TaskFlowList(this);
            } 

        } 

    }
}
