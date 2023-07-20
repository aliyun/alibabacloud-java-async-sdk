// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowActivityResponseBody</p>
 */
public class DescribeWorkflowActivityResponseBody extends TeaModel {
    @NameInMap("ActivityInfo")
    private java.util.List < ActivityInfo> activityInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeWorkflowActivityResponseBody(Builder builder) {
        this.activityInfo = builder.activityInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return activityInfo
     */
    public java.util.List < ActivityInfo> getActivityInfo() {
        return this.activityInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ActivityInfo> activityInfo; 
        private String requestId; 

        /**
         * ActivityInfo.
         */
        public Builder activityInfo(java.util.List < ActivityInfo> activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWorkflowActivityResponseBody build() {
            return new DescribeWorkflowActivityResponseBody(this);
        } 

    } 

    public static class ActivityInfo extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("Error")
        private String error;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtEnd")
        private String gmtEnd;

        @NameInMap("GmtStart")
        private String gmtStart;

        @NameInMap("Input")
        private String input;

        @NameInMap("Method")
        private String method;

        @NameInMap("Output")
        private String output;

        @NameInMap("State")
        private String state;

        @NameInMap("WorkerNode")
        private String workerNode;

        private ActivityInfo(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.duration = builder.duration;
            this.error = builder.error;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.input = builder.input;
            this.method = builder.method;
            this.output = builder.output;
            this.state = builder.state;
            this.workerNode = builder.workerNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityInfo create() {
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
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return workerNode
         */
        public String getWorkerNode() {
            return this.workerNode;
        }

        public static final class Builder {
            private String activityId; 
            private String activityName; 
            private String duration; 
            private String error; 
            private String gmtCreate; 
            private String gmtEnd; 
            private String gmtStart; 
            private String input; 
            private String method; 
            private String output; 
            private String state; 
            private String workerNode; 

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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtEnd.
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * GmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
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
             * WorkerNode.
             */
            public Builder workerNode(String workerNode) {
                this.workerNode = workerNode;
                return this;
            }

            public ActivityInfo build() {
                return new ActivityInfo(this);
            } 

        } 

    }
}
