// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatherStatsResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatherStatsResultResponseBody</p>
 */
public class DescribeGatherStatsResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GatherStatsResult")
    private GatherStatsResult gatherStatsResult;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGatherStatsResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.gatherStatsResult = builder.gatherStatsResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatherStatsResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatherStatsResult
     */
    public GatherStatsResult getGatherStatsResult() {
        return this.gatherStatsResult;
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

    public static final class Builder {
        private String code; 
        private GatherStatsResult gatherStatsResult; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GatherStatsResult.
         */
        public Builder gatherStatsResult(GatherStatsResult gatherStatsResult) {
            this.gatherStatsResult = gatherStatsResult;
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

        public DescribeGatherStatsResultResponseBody build() {
            return new DescribeGatherStatsResultResponseBody(this);
        } 

    } 

    public static class Change extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("ChangeAborted")
        private Boolean changeAborted;

        @NameInMap("ChangeDescription")
        private String changeDescription;

        @NameInMap("ChangeFinished")
        private Boolean changeFinished;

        @NameInMap("ChangeId")
        private String changeId;

        @NameInMap("ChangeMessage")
        private String changeMessage;

        @NameInMap("ChangeName")
        private String changeName;

        @NameInMap("ChangePaused")
        private Boolean changePaused;

        @NameInMap("ChangeSucceeded")
        private Boolean changeSucceeded;

        @NameInMap("ChangeTimedout")
        private Boolean changeTimedout;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Change(Builder builder) {
            this.actionName = builder.actionName;
            this.changeAborted = builder.changeAborted;
            this.changeDescription = builder.changeDescription;
            this.changeFinished = builder.changeFinished;
            this.changeId = builder.changeId;
            this.changeMessage = builder.changeMessage;
            this.changeName = builder.changeName;
            this.changePaused = builder.changePaused;
            this.changeSucceeded = builder.changeSucceeded;
            this.changeTimedout = builder.changeTimedout;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.envId = builder.envId;
            this.finishTime = builder.finishTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Change create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return changeAborted
         */
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        /**
         * @return changeDescription
         */
        public String getChangeDescription() {
            return this.changeDescription;
        }

        /**
         * @return changeFinished
         */
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        /**
         * @return changeId
         */
        public String getChangeId() {
            return this.changeId;
        }

        /**
         * @return changeMessage
         */
        public String getChangeMessage() {
            return this.changeMessage;
        }

        /**
         * @return changeName
         */
        public String getChangeName() {
            return this.changeName;
        }

        /**
         * @return changePaused
         */
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        /**
         * @return changeSucceeded
         */
        public Boolean getChangeSucceeded() {
            return this.changeSucceeded;
        }

        /**
         * @return changeTimedout
         */
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUsername
         */
        public String getCreateUsername() {
            return this.createUsername;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String actionName; 
            private Boolean changeAborted; 
            private String changeDescription; 
            private Boolean changeFinished; 
            private String changeId; 
            private String changeMessage; 
            private String changeName; 
            private Boolean changePaused; 
            private Boolean changeSucceeded; 
            private Boolean changeTimedout; 
            private Long createTime; 
            private String createUsername; 
            private String envId; 
            private Long finishTime; 
            private Long updateTime; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * ChangeAborted.
             */
            public Builder changeAborted(Boolean changeAborted) {
                this.changeAborted = changeAborted;
                return this;
            }

            /**
             * ChangeDescription.
             */
            public Builder changeDescription(String changeDescription) {
                this.changeDescription = changeDescription;
                return this;
            }

            /**
             * ChangeFinished.
             */
            public Builder changeFinished(Boolean changeFinished) {
                this.changeFinished = changeFinished;
                return this;
            }

            /**
             * ChangeId.
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * ChangeMessage.
             */
            public Builder changeMessage(String changeMessage) {
                this.changeMessage = changeMessage;
                return this;
            }

            /**
             * ChangeName.
             */
            public Builder changeName(String changeName) {
                this.changeName = changeName;
                return this;
            }

            /**
             * ChangePaused.
             */
            public Builder changePaused(Boolean changePaused) {
                this.changePaused = changePaused;
                return this;
            }

            /**
             * ChangeSucceeded.
             */
            public Builder changeSucceeded(Boolean changeSucceeded) {
                this.changeSucceeded = changeSucceeded;
                return this;
            }

            /**
             * ChangeTimedout.
             */
            public Builder changeTimedout(Boolean changeTimedout) {
                this.changeTimedout = changeTimedout;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUsername.
             */
            public Builder createUsername(String createUsername) {
                this.createUsername = createUsername;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Change build() {
                return new Change(this);
            } 

        } 

    }
    public static class InstanceResult extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("StorageKey")
        private String storageKey;

        @NameInMap("TaskMessage")
        private String taskMessage;

        @NameInMap("TaskSucceeded")
        private Boolean taskSucceeded;

        private InstanceResult(Builder builder) {
            this.instanceId = builder.instanceId;
            this.storageKey = builder.storageKey;
            this.taskMessage = builder.taskMessage;
            this.taskSucceeded = builder.taskSucceeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResult create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return storageKey
         */
        public String getStorageKey() {
            return this.storageKey;
        }

        /**
         * @return taskMessage
         */
        public String getTaskMessage() {
            return this.taskMessage;
        }

        /**
         * @return taskSucceeded
         */
        public Boolean getTaskSucceeded() {
            return this.taskSucceeded;
        }

        public static final class Builder {
            private String instanceId; 
            private String storageKey; 
            private String taskMessage; 
            private Boolean taskSucceeded; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * StorageKey.
             */
            public Builder storageKey(String storageKey) {
                this.storageKey = storageKey;
                return this;
            }

            /**
             * TaskMessage.
             */
            public Builder taskMessage(String taskMessage) {
                this.taskMessage = taskMessage;
                return this;
            }

            /**
             * TaskSucceeded.
             */
            public Builder taskSucceeded(Boolean taskSucceeded) {
                this.taskSucceeded = taskSucceeded;
                return this;
            }

            public InstanceResult build() {
                return new InstanceResult(this);
            } 

        } 

    }
    public static class InstanceResults extends TeaModel {
        @NameInMap("InstanceResult")
        private java.util.List < InstanceResult> instanceResult;

        private InstanceResults(Builder builder) {
            this.instanceResult = builder.instanceResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResults create() {
            return builder().build();
        }

        /**
         * @return instanceResult
         */
        public java.util.List < InstanceResult> getInstanceResult() {
            return this.instanceResult;
        }

        public static final class Builder {
            private java.util.List < InstanceResult> instanceResult; 

            /**
             * InstanceResult.
             */
            public Builder instanceResult(java.util.List < InstanceResult> instanceResult) {
                this.instanceResult = instanceResult;
                return this;
            }

            public InstanceResults build() {
                return new InstanceResults(this);
            } 

        } 

    }
    public static class GatherStatsResult extends TeaModel {
        @NameInMap("Change")
        private Change change;

        @NameInMap("InstanceResults")
        private InstanceResults instanceResults;

        private GatherStatsResult(Builder builder) {
            this.change = builder.change;
            this.instanceResults = builder.instanceResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatherStatsResult create() {
            return builder().build();
        }

        /**
         * @return change
         */
        public Change getChange() {
            return this.change;
        }

        /**
         * @return instanceResults
         */
        public InstanceResults getInstanceResults() {
            return this.instanceResults;
        }

        public static final class Builder {
            private Change change; 
            private InstanceResults instanceResults; 

            /**
             * Change.
             */
            public Builder change(Change change) {
                this.change = change;
                return this;
            }

            /**
             * InstanceResults.
             */
            public Builder instanceResults(InstanceResults instanceResults) {
                this.instanceResults = instanceResults;
                return this;
            }

            public GatherStatsResult build() {
                return new GatherStatsResult(this);
            } 

        } 

    }
}
