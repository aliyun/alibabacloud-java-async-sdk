// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStatusCountResponseBody</p>
 */
public class GetInstanceStatusCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusCount")
    private StatusCount statusCount;

    private GetInstanceStatusCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusCount = builder.statusCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStatusCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCount
     */
    public StatusCount getStatusCount() {
        return this.statusCount;
    }

    public static final class Builder {
        private String requestId; 
        private StatusCount statusCount; 

        /**
         * The request ID, which is used to locate the logs and troubleshoot problems.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status statistics of the instance.
         */
        public Builder statusCount(StatusCount statusCount) {
            this.statusCount = statusCount;
            return this;
        }

        public GetInstanceStatusCountResponseBody build() {
            return new GetInstanceStatusCountResponseBody(this);
        } 

    } 

    public static class StatusCount extends TeaModel {
        @NameInMap("FailureCount")
        private Integer failureCount;

        @NameInMap("NotRunCount")
        private Integer notRunCount;

        @NameInMap("RunningCount")
        private Integer runningCount;

        @NameInMap("SuccessCount")
        private Integer successCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("WaitResCount")
        private Integer waitResCount;

        @NameInMap("WaitTimeCount")
        private Integer waitTimeCount;

        private StatusCount(Builder builder) {
            this.failureCount = builder.failureCount;
            this.notRunCount = builder.notRunCount;
            this.runningCount = builder.runningCount;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
            this.waitResCount = builder.waitResCount;
            this.waitTimeCount = builder.waitTimeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusCount create() {
            return builder().build();
        }

        /**
         * @return failureCount
         */
        public Integer getFailureCount() {
            return this.failureCount;
        }

        /**
         * @return notRunCount
         */
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return waitResCount
         */
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        /**
         * @return waitTimeCount
         */
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

        public static final class Builder {
            private Integer failureCount; 
            private Integer notRunCount; 
            private Integer runningCount; 
            private Integer successCount; 
            private Integer totalCount; 
            private Integer waitResCount; 
            private Integer waitTimeCount; 

            /**
             * The number of failed instances.
             */
            public Builder failureCount(Integer failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * The number of instances that are not running.
             */
            public Builder notRunCount(Integer notRunCount) {
                this.notRunCount = notRunCount;
                return this;
            }

            /**
             * The number of running instances.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * The number of successful instances.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * The total number of instances.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The number of instances waiting for resources.
             */
            public Builder waitResCount(Integer waitResCount) {
                this.waitResCount = waitResCount;
                return this;
            }

            /**
             * The number of instances to be run that meet the conditions.
             */
            public Builder waitTimeCount(Integer waitTimeCount) {
                this.waitTimeCount = waitTimeCount;
                return this;
            }

            public StatusCount build() {
                return new StatusCount(this);
            } 

        } 

    }
}
