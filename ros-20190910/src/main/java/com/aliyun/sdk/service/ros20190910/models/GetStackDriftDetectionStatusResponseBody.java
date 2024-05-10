// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackDriftDetectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackDriftDetectionStatusResponseBody</p>
 */
public class GetStackDriftDetectionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DriftDetectionId")
    private String driftDetectionId;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionStatus")
    private String driftDetectionStatus;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionStatusReason")
    private String driftDetectionStatusReason;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @com.aliyun.core.annotation.NameInMap("DriftedStackResourceCount")
    private Integer driftedStackResourceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackDriftStatus")
    private String stackDriftStatus;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    private GetStackDriftDetectionStatusResponseBody(Builder builder) {
        this.driftDetectionId = builder.driftDetectionId;
        this.driftDetectionStatus = builder.driftDetectionStatus;
        this.driftDetectionStatusReason = builder.driftDetectionStatusReason;
        this.driftDetectionTime = builder.driftDetectionTime;
        this.driftedStackResourceCount = builder.driftedStackResourceCount;
        this.requestId = builder.requestId;
        this.stackDriftStatus = builder.stackDriftStatus;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackDriftDetectionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return driftDetectionId
     */
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    /**
     * @return driftDetectionStatus
     */
    public String getDriftDetectionStatus() {
        return this.driftDetectionStatus;
    }

    /**
     * @return driftDetectionStatusReason
     */
    public String getDriftDetectionStatusReason() {
        return this.driftDetectionStatusReason;
    }

    /**
     * @return driftDetectionTime
     */
    public String getDriftDetectionTime() {
        return this.driftDetectionTime;
    }

    /**
     * @return driftedStackResourceCount
     */
    public Integer getDriftedStackResourceCount() {
        return this.driftedStackResourceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackDriftStatus
     */
    public String getStackDriftStatus() {
        return this.stackDriftStatus;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder {
        private String driftDetectionId; 
        private String driftDetectionStatus; 
        private String driftDetectionStatusReason; 
        private String driftDetectionTime; 
        private Integer driftedStackResourceCount; 
        private String requestId; 
        private String stackDriftStatus; 
        private String stackId; 

        /**
         * The ID of the drift detection operation.
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * The drift detection status. Valid values:
         * <p>
         * 
         * *   DETECTION_COMPLETE: The drift detection operation has been completed for all resources that support drift detection in the stack.
         * *   DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack.
         * *   DETECTION_IN_PROGRESS: The stack drift detection operation is in progress.
         */
        public Builder driftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }

        /**
         * The reason why the stack drift detection operation has its current status.
         */
        public Builder driftDetectionStatusReason(String driftDetectionStatusReason) {
            this.driftDetectionStatusReason = driftDetectionStatusReason;
            return this;
        }

        /**
         * The time when the stack drift detection operation was initiated.
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * The total number of stack resources that have drifted.
         */
        public Builder driftedStackResourceCount(Integer driftedStackResourceCount) {
            this.driftedStackResourceCount = driftedStackResourceCount;
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
         * The drift status of the stack. Valid values:
         * <p>
         * 
         * *   DRIFTED: The actual configuration of the stack differs, or has drifted, from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.
         * *   NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.
         * *   IN_SYNC: The current configuration of each supported resource matches its expected template configuration. A stack with no resources that support drift detection also has a status of IN_SYNC.
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public GetStackDriftDetectionStatusResponseBody build() {
            return new GetStackDriftDetectionStatusResponseBody(this);
        } 

    } 

}
