// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetStackDriftDetectionStatusResponseBody model) {
            this.driftDetectionId = model.driftDetectionId;
            this.driftDetectionStatus = model.driftDetectionStatus;
            this.driftDetectionStatusReason = model.driftDetectionStatusReason;
            this.driftDetectionTime = model.driftDetectionTime;
            this.driftedStackResourceCount = model.driftedStackResourceCount;
            this.requestId = model.requestId;
            this.stackDriftStatus = model.stackDriftStatus;
            this.stackId = model.stackId;
        } 

        /**
         * <p>The ID of the drift detection operation.</p>
         * 
         * <strong>example:</strong>
         * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * <p>The drift detection status. Valid values:</p>
         * <ul>
         * <li>DETECTION_COMPLETE: The drift detection operation has been completed for all resources that support drift detection in the stack.</li>
         * <li>DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack.</li>
         * <li>DETECTION_IN_PROGRESS: The stack drift detection operation is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DETECTION_COMPLETE</p>
         */
        public Builder driftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }

        /**
         * <p>The reason why the stack drift detection operation has its current status.</p>
         * 
         * <strong>example:</strong>
         * <p>Detect stack drift successfully</p>
         */
        public Builder driftDetectionStatusReason(String driftDetectionStatusReason) {
            this.driftDetectionStatusReason = driftDetectionStatusReason;
            return this;
        }

        /**
         * <p>The time when the stack drift detection operation was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * <p>The total number of stack resources that have drifted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driftedStackResourceCount(Integer driftedStackResourceCount) {
            this.driftedStackResourceCount = driftedStackResourceCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The drift status of the stack. Valid values:</p>
         * <ul>
         * <li>DRIFTED: The actual configuration of the stack differs, or has drifted, from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.</li>
         * <li>NOT_CHECKED: Resource Orchestration Service (ROS) has not checked whether the actual configuration of the resource differs from its expected template configuration.</li>
         * <li>IN_SYNC: The current configuration of each supported resource matches its expected template configuration. A stack with no resources that support drift detection also has a status of IN_SYNC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DRIFTED</p>
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
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
