// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskByUuidResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskByUuidResponseBody</p>
 */
public class GetTaskByUuidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Task")
    private Task task;

    private GetTaskByUuidResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskByUuidResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public GetTaskByUuidResponseBody build() {
            return new GetTaskByUuidResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("ActualTime")
        private Long actualTime;

        @NameInMap("CallId")
        private String callId;

        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("EndReason")
        private Integer endReason;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("JobGroupId")
        private String jobGroupId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("PlannedTime")
        private Long plannedTime;

        private Task(Builder builder) {
            this.actualTime = builder.actualTime;
            this.callId = builder.callId;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.jobGroupId = builder.jobGroupId;
            this.jobId = builder.jobId;
            this.plannedTime = builder.plannedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return plannedTime
         */
        public Long getPlannedTime() {
            return this.plannedTime;
        }

        public static final class Builder {
            private Long actualTime; 
            private String callId; 
            private String calledNumber; 
            private String callingNumber; 
            private Integer endReason; 
            private Long endTime; 
            private String id; 
            private String instanceId; 
            private String jobGroupId; 
            private String jobId; 
            private Long plannedTime; 

            /**
             * ActualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * EndReason.
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * JobGroupId.
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * PlannedTime.
             */
            public Builder plannedTime(Long plannedTime) {
                this.plannedTime = plannedTime;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
