// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowsByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowsByPageResponseBody</p>
 */
public class ListTaskFlowsByPageResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskFlowList")
    private TaskFlowList taskFlowList;

    @NameInMap("TotalCount")
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
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The details of the returned task flows.
         */
        public Builder taskFlowList(TaskFlowList taskFlowList) {
            this.taskFlowList = taskFlowList;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTaskFlowsByPageResponseBody build() {
            return new ListTaskFlowsByPageResponseBody(this);
        } 

    } 

    public static class TaskFlow extends TeaModel {
        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("CreatorNickName")
        private String creatorNickName;

        @NameInMap("CronBeginDate")
        private String cronBeginDate;

        @NameInMap("CronEndDate")
        private String cronEndDate;

        @NameInMap("CronStr")
        private String cronStr;

        @NameInMap("CronSwitch")
        private Boolean cronSwitch;

        @NameInMap("CronType")
        private Integer cronType;

        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagOwnerId")
        private String dagOwnerId;

        @NameInMap("DagOwnerNickName")
        private String dagOwnerNickName;

        @NameInMap("DeployId")
        private Long deployId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LatestInstanceStatus")
        private Integer latestInstanceStatus;

        @NameInMap("LatestInstanceTime")
        private String latestInstanceTime;

        @NameInMap("ScenarioId")
        private String scenarioId;

        @NameInMap("ScheduleParam")
        private String scheduleParam;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TimeZoneId")
        private String timeZoneId;

        @NameInMap("TriggerType")
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
             * The ID of the user who created the task flow.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The username of the user who created the task flow.
             */
            public Builder creatorNickName(String creatorNickName) {
                this.creatorNickName = creatorNickName;
                return this;
            }

            /**
             * The start time of scheduled scheduling. The task flow is not scheduled before this point in time.
             */
            public Builder cronBeginDate(String cronBeginDate) {
                this.cronBeginDate = cronBeginDate;
                return this;
            }

            /**
             * The end time of scheduled scheduling. The task flow is not scheduled after this point in time.
             */
            public Builder cronEndDate(String cronEndDate) {
                this.cronEndDate = cronEndDate;
                return this;
            }

            /**
             * Scheduled Cron.
             */
            public Builder cronStr(String cronStr) {
                this.cronStr = cronStr;
                return this;
            }

            /**
             * Whether to enable scheduled scheduling.
             */
            public Builder cronSwitch(Boolean cronSwitch) {
                this.cronSwitch = cronSwitch;
                return this;
            }

            /**
             * Scheduling cycle type. Valid values:
             * <p>
             * - **2**: Hourly scheduling
             * - **3**: Daily scheduling
             * - **4**: Weekly scheduling
             * - **5**: Monthly scheduling
             */
            public Builder cronType(Integer cronType) {
                this.cronType = cronType;
                return this;
            }

            /**
             * The name of the task flow.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * The user ID of the task flow owner.
             */
            public Builder dagOwnerId(String dagOwnerId) {
                this.dagOwnerId = dagOwnerId;
                return this;
            }

            /**
             * The username of the owner of the task flow.
             */
            public Builder dagOwnerNickName(String dagOwnerNickName) {
                this.dagOwnerNickName = dagOwnerNickName;
                return this;
            }

            /**
             * The ID of the last deployment record of the task flow.
             */
            public Builder deployId(Long deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The description of the task flow.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the task flow.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The status of the last execution of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder latestInstanceStatus(Integer latestInstanceStatus) {
                this.latestInstanceStatus = latestInstanceStatus;
                return this;
            }

            /**
             * The time when the last execution record was created.
             */
            public Builder latestInstanceTime(String latestInstanceTime) {
                this.latestInstanceTime = latestInstanceTime;
                return this;
            }

            /**
             * The ID of the application scenario.
             */
            public Builder scenarioId(String scenarioId) {
                this.scenarioId = scenarioId;
                return this;
            }

            /**
             * Event scheduling configuration, JSON string format.
             */
            public Builder scheduleParam(String scheduleParam) {
                this.scheduleParam = scheduleParam;
                return this;
            }

            /**
             * The status of the task flow. Valid values:
             * <p>
             * 
             * *   **0**: invalid
             * *   **1**: scheduling disabled
             * *   **2**: waiting to be scheduled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Time zone setting. Default value: East 8(Asia/Shanghai).
             */
            public Builder timeZoneId(String timeZoneId) {
                this.timeZoneId = timeZoneId;
                return this;
            }

            /**
             * The trigger type. Valid values:
             * <p>
             * - **0**: Periodic scheduling
             * - **1**: Run manually
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
    public static class TaskFlowList extends TeaModel {
        @NameInMap("TaskFlow")
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
