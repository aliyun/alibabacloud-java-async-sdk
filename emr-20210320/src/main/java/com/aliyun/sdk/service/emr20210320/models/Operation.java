// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Operation} extends {@link TeaModel}
 *
 * <p>Operation</p>
 */
public class Operation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("OperationState")
    private String operationState;

    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("StateChangeReason")
    private OperationStateChangeReason stateChangeReason;

    private Operation(Builder builder) {
        this.clusterId = builder.clusterId;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.operationId = builder.operationId;
        this.operationState = builder.operationState;
        this.operationType = builder.operationType;
        this.startTime = builder.startTime;
        this.stateChangeReason = builder.stateChangeReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Operation create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return operationState
     */
    public String getOperationState() {
        return this.operationState;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return stateChangeReason
     */
    public OperationStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    public static final class Builder {
        private String clusterId; 
        private Long createTime; 
        private String description; 
        private Long endTime; 
        private String operationId; 
        private String operationState; 
        private String operationType; 
        private Long startTime; 
        private OperationStateChangeReason stateChangeReason; 

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 创建时间。
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 描述。
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 结束时间。
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * 操作ID。
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * 操作状态。
         */
        public Builder operationState(String operationState) {
            this.operationState = operationState;
            return this;
        }

        /**
         * 操作类型。
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * 开始时间。
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * 状态转换原因。
         */
        public Builder stateChangeReason(OperationStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        public Operation build() {
            return new Operation(this);
        } 

    } 

}
