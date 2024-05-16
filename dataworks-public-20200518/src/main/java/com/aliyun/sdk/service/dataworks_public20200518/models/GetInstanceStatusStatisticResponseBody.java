// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStatusStatisticResponseBody</p>
 */
public class GetInstanceStatusStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCount")
    private StatusCount statusCount;

    private GetInstanceStatusStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusCount = builder.statusCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStatusStatisticResponseBody create() {
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
         * The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The numbers of instances in different states.
         */
        public Builder statusCount(StatusCount statusCount) {
            this.statusCount = statusCount;
            return this;
        }

        public GetInstanceStatusStatisticResponseBody build() {
            return new GetInstanceStatusStatisticResponseBody(this);
        } 

    } 

    public static class StatusCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureCount")
        private Integer failureCount;

        @com.aliyun.core.annotation.NameInMap("NotRunCount")
        private Integer notRunCount;

        @com.aliyun.core.annotation.NameInMap("RunningCount")
        private Integer runningCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("WaitResCount")
        private Integer waitResCount;

        @com.aliyun.core.annotation.NameInMap("WaitTimeCount")
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
             * The number of instances that failed to run.
             */
            public Builder failureCount(Integer failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * The number of instances that are not run.
             */
            public Builder notRunCount(Integer notRunCount) {
                this.notRunCount = notRunCount;
                return this;
            }

            /**
             * The number of instances that are running.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * The number of instances that are successfully run.
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
             * The number of instances that are waiting for resources.
             */
            public Builder waitResCount(Integer waitResCount) {
                this.waitResCount = waitResCount;
                return this;
            }

            /**
             * The number of instances that are waiting to run.
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
