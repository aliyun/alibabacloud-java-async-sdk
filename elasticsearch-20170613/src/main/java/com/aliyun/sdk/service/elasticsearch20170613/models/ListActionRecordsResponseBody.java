// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListActionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListActionRecordsResponseBody</p>
 */
public class ListActionRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListActionRecordsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListActionRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListActionRecordsResponseBody build() {
            return new ListActionRecordsResponseBody(this);
        } 

    } 

    public static class SubStatusInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completeNodeCount")
        private Integer completeNodeCount;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("exception")
        private String exception;

        @com.aliyun.core.annotation.NameInMap("latencyMills")
        private Long latencyMills;

        @com.aliyun.core.annotation.NameInMap("nodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("stateType")
        private String stateType;

        @com.aliyun.core.annotation.NameInMap("subState")
        private String subState;

        private SubStatusInfo(Builder builder) {
            this.completeNodeCount = builder.completeNodeCount;
            this.endTime = builder.endTime;
            this.exception = builder.exception;
            this.latencyMills = builder.latencyMills;
            this.nodeCount = builder.nodeCount;
            this.process = builder.process;
            this.startTime = builder.startTime;
            this.stateType = builder.stateType;
            this.subState = builder.subState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubStatusInfo create() {
            return builder().build();
        }

        /**
         * @return completeNodeCount
         */
        public Integer getCompleteNodeCount() {
            return this.completeNodeCount;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return exception
         */
        public String getException() {
            return this.exception;
        }

        /**
         * @return latencyMills
         */
        public Long getLatencyMills() {
            return this.latencyMills;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return stateType
         */
        public String getStateType() {
            return this.stateType;
        }

        /**
         * @return subState
         */
        public String getSubState() {
            return this.subState;
        }

        public static final class Builder {
            private Integer completeNodeCount; 
            private Long endTime; 
            private String exception; 
            private Long latencyMills; 
            private Integer nodeCount; 
            private String process; 
            private Long startTime; 
            private String stateType; 
            private String subState; 

            /**
             * completeNodeCount.
             */
            public Builder completeNodeCount(Integer completeNodeCount) {
                this.completeNodeCount = completeNodeCount;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * exception.
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * latencyMills.
             */
            public Builder latencyMills(Long latencyMills) {
                this.latencyMills = latencyMills;
                return this;
            }

            /**
             * nodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * stateType.
             */
            public Builder stateType(String stateType) {
                this.stateType = stateType;
                return this;
            }

            /**
             * subState.
             */
            public Builder subState(String subState) {
                this.subState = subState;
                return this;
            }

            public SubStatusInfo build() {
                return new SubStatusInfo(this);
            } 

        } 

    }
    public static class StatusInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completeNodeCount")
        private Integer completeNodeCount;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("exception")
        private String exception;

        @com.aliyun.core.annotation.NameInMap("latencyMills")
        private Long latencyMills;

        @com.aliyun.core.annotation.NameInMap("nodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("stateType")
        private String stateType;

        @com.aliyun.core.annotation.NameInMap("subState")
        private String subState;

        @com.aliyun.core.annotation.NameInMap("subStatusInfo")
        private java.util.List < SubStatusInfo> subStatusInfo;

        private StatusInfo(Builder builder) {
            this.completeNodeCount = builder.completeNodeCount;
            this.endTime = builder.endTime;
            this.exception = builder.exception;
            this.latencyMills = builder.latencyMills;
            this.nodeCount = builder.nodeCount;
            this.process = builder.process;
            this.startTime = builder.startTime;
            this.stateType = builder.stateType;
            this.subState = builder.subState;
            this.subStatusInfo = builder.subStatusInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusInfo create() {
            return builder().build();
        }

        /**
         * @return completeNodeCount
         */
        public Integer getCompleteNodeCount() {
            return this.completeNodeCount;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return exception
         */
        public String getException() {
            return this.exception;
        }

        /**
         * @return latencyMills
         */
        public Long getLatencyMills() {
            return this.latencyMills;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return stateType
         */
        public String getStateType() {
            return this.stateType;
        }

        /**
         * @return subState
         */
        public String getSubState() {
            return this.subState;
        }

        /**
         * @return subStatusInfo
         */
        public java.util.List < SubStatusInfo> getSubStatusInfo() {
            return this.subStatusInfo;
        }

        public static final class Builder {
            private Integer completeNodeCount; 
            private Long endTime; 
            private String exception; 
            private Long latencyMills; 
            private Integer nodeCount; 
            private String process; 
            private Long startTime; 
            private String stateType; 
            private String subState; 
            private java.util.List < SubStatusInfo> subStatusInfo; 

            /**
             * completeNodeCount.
             */
            public Builder completeNodeCount(Integer completeNodeCount) {
                this.completeNodeCount = completeNodeCount;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * exception.
             */
            public Builder exception(String exception) {
                this.exception = exception;
                return this;
            }

            /**
             * latencyMills.
             */
            public Builder latencyMills(Long latencyMills) {
                this.latencyMills = latencyMills;
                return this;
            }

            /**
             * nodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * stateType.
             */
            public Builder stateType(String stateType) {
                this.stateType = stateType;
                return this;
            }

            /**
             * subState.
             */
            public Builder subState(String subState) {
                this.subState = subState;
                return this;
            }

            /**
             * subStatusInfo.
             */
            public Builder subStatusInfo(java.util.List < SubStatusInfo> subStatusInfo) {
                this.subStatusInfo = subStatusInfo;
                return this;
            }

            public StatusInfo build() {
                return new StatusInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("ActionParams")
        private java.util.Map < String, ? > actionParams;

        @com.aliyun.core.annotation.NameInMap("ActionResultAccessList")
        private java.util.List < String > actionResultAccessList;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MetaNow")
        private String metaNow;

        @com.aliyun.core.annotation.NameInMap("MetaOld")
        private String metaOld;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("RecordDiff")
        private java.util.Map < String, ? > recordDiff;

        @com.aliyun.core.annotation.NameInMap("RecordIds")
        private java.util.List < String > recordIds;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StateType")
        private String stateType;

        @com.aliyun.core.annotation.NameInMap("StatusInfo")
        private java.util.List < StatusInfo> statusInfo;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserInfo")
        private String userInfo;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        private Result(Builder builder) {
            this.actionName = builder.actionName;
            this.actionParams = builder.actionParams;
            this.actionResultAccessList = builder.actionResultAccessList;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.metaNow = builder.metaNow;
            this.metaOld = builder.metaOld;
            this.ownerId = builder.ownerId;
            this.process = builder.process;
            this.recordDiff = builder.recordDiff;
            this.recordIds = builder.recordIds;
            this.requestId = builder.requestId;
            this.startTime = builder.startTime;
            this.stateType = builder.stateType;
            this.statusInfo = builder.statusInfo;
            this.userId = builder.userId;
            this.userInfo = builder.userInfo;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionParams
         */
        public java.util.Map < String, ? > getActionParams() {
            return this.actionParams;
        }

        /**
         * @return actionResultAccessList
         */
        public java.util.List < String > getActionResultAccessList() {
            return this.actionResultAccessList;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return metaNow
         */
        public String getMetaNow() {
            return this.metaNow;
        }

        /**
         * @return metaOld
         */
        public String getMetaOld() {
            return this.metaOld;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return recordDiff
         */
        public java.util.Map < String, ? > getRecordDiff() {
            return this.recordDiff;
        }

        /**
         * @return recordIds
         */
        public java.util.List < String > getRecordIds() {
            return this.recordIds;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return stateType
         */
        public String getStateType() {
            return this.stateType;
        }

        /**
         * @return statusInfo
         */
        public java.util.List < StatusInfo> getStatusInfo() {
            return this.statusInfo;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userInfo
         */
        public String getUserInfo() {
            return this.userInfo;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String actionName; 
            private java.util.Map < String, ? > actionParams; 
            private java.util.List < String > actionResultAccessList; 
            private Long endTime; 
            private String instanceId; 
            private String metaNow; 
            private String metaOld; 
            private String ownerId; 
            private String process; 
            private java.util.Map < String, ? > recordDiff; 
            private java.util.List < String > recordIds; 
            private String requestId; 
            private Long startTime; 
            private String stateType; 
            private java.util.List < StatusInfo> statusInfo; 
            private String userId; 
            private String userInfo; 
            private String userType; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * ActionParams.
             */
            public Builder actionParams(java.util.Map < String, ? > actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * ActionResultAccessList.
             */
            public Builder actionResultAccessList(java.util.List < String > actionResultAccessList) {
                this.actionResultAccessList = actionResultAccessList;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MetaNow.
             */
            public Builder metaNow(String metaNow) {
                this.metaNow = metaNow;
                return this;
            }

            /**
             * MetaOld.
             */
            public Builder metaOld(String metaOld) {
                this.metaOld = metaOld;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Process.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * RecordDiff.
             */
            public Builder recordDiff(java.util.Map < String, ? > recordDiff) {
                this.recordDiff = recordDiff;
                return this;
            }

            /**
             * RecordIds.
             */
            public Builder recordIds(java.util.List < String > recordIds) {
                this.recordIds = recordIds;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StateType.
             */
            public Builder stateType(String stateType) {
                this.stateType = stateType;
                return this;
            }

            /**
             * StatusInfo.
             */
            public Builder statusInfo(java.util.List < StatusInfo> statusInfo) {
                this.statusInfo = statusInfo;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserInfo.
             */
            public Builder userInfo(String userInfo) {
                this.userInfo = userInfo;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
