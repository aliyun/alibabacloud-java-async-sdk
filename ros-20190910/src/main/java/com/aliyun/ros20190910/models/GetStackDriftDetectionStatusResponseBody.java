// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackDriftDetectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackDriftDetectionStatusResponseBody</p>
 */
public class GetStackDriftDetectionStatusResponseBody extends TeaModel {
    @NameInMap("DriftDetectionId")
    private String driftDetectionId;

    @NameInMap("DriftDetectionStatus")
    private String driftDetectionStatus;

    @NameInMap("DriftDetectionStatusReason")
    private String driftDetectionStatusReason;

    @NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @NameInMap("DriftedStackResourceCount")
    private Integer driftedStackResourceCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackDriftStatus")
    private String stackDriftStatus;

    @NameInMap("StackId")
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
         * DriftDetectionId.
         */
        public Builder driftDetectionId(String driftDetectionId) {
            this.driftDetectionId = driftDetectionId;
            return this;
        }

        /**
         * DriftDetectionStatus.
         */
        public Builder driftDetectionStatus(String driftDetectionStatus) {
            this.driftDetectionStatus = driftDetectionStatus;
            return this;
        }

        /**
         * DriftDetectionStatusReason.
         */
        public Builder driftDetectionStatusReason(String driftDetectionStatusReason) {
            this.driftDetectionStatusReason = driftDetectionStatusReason;
            return this;
        }

        /**
         * DriftDetectionTime.
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * DriftedStackResourceCount.
         */
        public Builder driftedStackResourceCount(Integer driftedStackResourceCount) {
            this.driftedStackResourceCount = driftedStackResourceCount;
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
         * StackDriftStatus.
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * StackId.
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
