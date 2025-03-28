// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceStatusCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStatusCountResponseBody</p>
 */
public class GetInstanceStatusCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceStatusCountResponseBody model) {
            this.requestId = model.requestId;
            this.statusCount = model.statusCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of instances.</p>
         */
        public Builder statusCount(StatusCount statusCount) {
            this.statusCount = statusCount;
            return this;
        }

        public GetInstanceStatusCountResponseBody build() {
            return new GetInstanceStatusCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceStatusCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceStatusCountResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StatusCount model) {
                this.failureCount = model.failureCount;
                this.notRunCount = model.notRunCount;
                this.runningCount = model.runningCount;
                this.successCount = model.successCount;
                this.totalCount = model.totalCount;
                this.waitResCount = model.waitResCount;
                this.waitTimeCount = model.waitTimeCount;
            } 

            /**
             * <p>The number of instances that failed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failureCount(Integer failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * <p>The number of instances that are not run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notRunCount(Integer notRunCount) {
                this.notRunCount = notRunCount;
                return this;
            }

            /**
             * <p>The number of instances that are running.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * <p>The number of instances that are successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The total number of instances returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The number of instances that are waiting for resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder waitResCount(Integer waitResCount) {
                this.waitResCount = waitResCount;
                return this;
            }

            /**
             * <p>The number of instances that are waiting for their scheduling time to arrive.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
