// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentTaskResponseBody</p>
 */
public class GetExperimentTaskResponseBody extends TeaModel {
    @NameInMap("Activities")
    private java.util.List < Activities> activities;

    @NameInMap("ExperimentId")
    private String experimentId;

    @NameInMap("ExperimentName")
    private String experimentName;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("State")
    private String state;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private String taskId;

    private GetExperimentTaskResponseBody(Builder builder) {
        this.activities = builder.activities;
        this.experimentId = builder.experimentId;
        this.experimentName = builder.experimentName;
        this.httpStatusCode = builder.httpStatusCode;
        this.namespace = builder.namespace;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.startTime = builder.startTime;
        this.state = builder.state;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return activities
     */
    public java.util.List < Activities> getActivities() {
        return this.activities;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private java.util.List < Activities> activities; 
        private String experimentId; 
        private String experimentName; 
        private Integer httpStatusCode; 
        private String namespace; 
        private String requestId; 
        private String result; 
        private Long startTime; 
        private String state; 
        private Boolean success; 
        private String taskId; 

        /**
         * Activities.
         */
        public Builder activities(java.util.List < Activities> activities) {
            this.activities = activities;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetExperimentTaskResponseBody build() {
            return new GetExperimentTaskResponseBody(this);
        } 

    } 

    public static class Activities extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("CheckState")
        private String checkState;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExperimentTaskId")
        private String experimentTaskId;

        @NameInMap("Phase")
        private String phase;

        @NameInMap("RunResult")
        private String runResult;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        private Activities(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.checkState = builder.checkState;
            this.endTime = builder.endTime;
            this.experimentTaskId = builder.experimentTaskId;
            this.phase = builder.phase;
            this.runResult = builder.runResult;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activities create() {
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
         * @return checkState
         */
        public String getCheckState() {
            return this.checkState;
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
         * @return phase
         */
        public String getPhase() {
            return this.phase;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String activityId; 
            private String activityName; 
            private String checkState; 
            private Long endTime; 
            private String experimentTaskId; 
            private String phase; 
            private String runResult; 
            private Long startTime; 
            private String state; 
            private String taskId; 

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
             * CheckState.
             */
            public Builder checkState(String checkState) {
                this.checkState = checkState;
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
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
}
