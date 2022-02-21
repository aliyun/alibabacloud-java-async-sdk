// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetActivityTaskResponseBody</p>
 */
public class GetActivityTaskResponseBody extends TeaModel {
    @NameInMap("ActivityId")
    private String activityId;

    @NameInMap("ActivityName")
    private String activityName;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ExperimentTaskId")
    private String experimentTaskId;

    @NameInMap("Hosts")
    private java.util.List < Hosts> hosts;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Phase")
    private String phase;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunResult")
    private String runResult;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("State")
    private String state;

    @NameInMap("Success")
    private Boolean success;

    private GetActivityTaskResponseBody(Builder builder) {
        this.activityId = builder.activityId;
        this.activityName = builder.activityName;
        this.endTime = builder.endTime;
        this.experimentTaskId = builder.experimentTaskId;
        this.hosts = builder.hosts;
        this.httpStatusCode = builder.httpStatusCode;
        this.phase = builder.phase;
        this.requestId = builder.requestId;
        this.runResult = builder.runResult;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActivityTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return activityName
     */
    public String getActivityName() {
        return this.activityName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return experimentTaskId
     */
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    /**
     * @return hosts
     */
    public java.util.List < Hosts> getHosts() {
        return this.hosts;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runResult
     */
    public String getRunResult() {
        return this.runResult;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String activityId; 
        private String activityName; 
        private Long endTime; 
        private String experimentTaskId; 
        private java.util.List < Hosts> hosts; 
        private Integer httpStatusCode; 
        private String phase; 
        private String requestId; 
        private String runResult; 
        private Long startTime; 
        private String state; 
        private Boolean success; 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        /**
         * ActivityName.
         */
        public Builder activityName(String activityName) {
            this.activityName = activityName;
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
         * ExperimentTaskId.
         */
        public Builder experimentTaskId(String experimentTaskId) {
            this.experimentTaskId = experimentTaskId;
            return this;
        }

        /**
         * Hosts.
         */
        public Builder hosts(java.util.List < Hosts> hosts) {
            this.hosts = hosts;
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
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
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
         * RunResult.
         */
        public Builder runResult(String runResult) {
            this.runResult = runResult;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetActivityTaskResponseBody build() {
            return new GetActivityTaskResponseBody(this);
        } 

    } 

    public static class Hosts extends TeaModel {
        @NameInMap("Data")
        private String data;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ExpId")
        private String expId;

        @NameInMap("HostIp")
        private String hostIp;

        @NameInMap("Result")
        private String result;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        private Hosts(Builder builder) {
            this.data = builder.data;
            this.endTime = builder.endTime;
            this.errorMessage = builder.errorMessage;
            this.expId = builder.expId;
            this.hostIp = builder.hostIp;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hosts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return expId
         */
        public String getExpId() {
            return this.expId;
        }

        /**
         * @return hostIp
         */
        public String getHostIp() {
            return this.hostIp;
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
            private String data; 
            private Long endTime; 
            private String errorMessage; 
            private String expId; 
            private String hostIp; 
            private String result; 
            private Long startTime; 
            private String state; 
            private String taskId; 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ExpId.
             */
            public Builder expId(String expId) {
                this.expId = expId;
                return this;
            }

            /**
             * HostIp.
             */
            public Builder hostIp(String hostIp) {
                this.hostIp = hostIp;
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

            public Hosts build() {
                return new Hosts(this);
            } 

        } 

    }
}
