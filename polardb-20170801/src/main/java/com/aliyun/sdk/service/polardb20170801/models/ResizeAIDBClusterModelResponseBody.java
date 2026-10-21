// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ResizeAIDBClusterModelResponseBody} extends {@link TeaModel}
 *
 * <p>ResizeAIDBClusterModelResponseBody</p>
 */
public class ResizeAIDBClusterModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentCapacity")
    private Long currentCapacity;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("PoolHitCapacity")
    private Long poolHitCapacity;

    @com.aliyun.core.annotation.NameInMap("PoolHitRatio")
    private Double poolHitRatio;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequiredDelta")
    private Long requiredDelta;

    @com.aliyun.core.annotation.NameInMap("TargetCapacity")
    private Long targetCapacity;

    private ResizeAIDBClusterModelResponseBody(Builder builder) {
        this.currentCapacity = builder.currentCapacity;
        this.DBClusterId = builder.DBClusterId;
        this.dryRun = builder.dryRun;
        this.poolHitCapacity = builder.poolHitCapacity;
        this.poolHitRatio = builder.poolHitRatio;
        this.requestId = builder.requestId;
        this.requiredDelta = builder.requiredDelta;
        this.targetCapacity = builder.targetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeAIDBClusterModelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentCapacity
     */
    public Long getCurrentCapacity() {
        return this.currentCapacity;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return poolHitCapacity
     */
    public Long getPoolHitCapacity() {
        return this.poolHitCapacity;
    }

    /**
     * @return poolHitRatio
     */
    public Double getPoolHitRatio() {
        return this.poolHitRatio;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requiredDelta
     */
    public Long getRequiredDelta() {
        return this.requiredDelta;
    }

    /**
     * @return targetCapacity
     */
    public Long getTargetCapacity() {
        return this.targetCapacity;
    }

    public static final class Builder {
        private Long currentCapacity; 
        private String DBClusterId; 
        private Boolean dryRun; 
        private Long poolHitCapacity; 
        private Double poolHitRatio; 
        private String requestId; 
        private Long requiredDelta; 
        private Long targetCapacity; 

        private Builder() {
        } 

        private Builder(ResizeAIDBClusterModelResponseBody model) {
            this.currentCapacity = model.currentCapacity;
            this.DBClusterId = model.DBClusterId;
            this.dryRun = model.dryRun;
            this.poolHitCapacity = model.poolHitCapacity;
            this.poolHitRatio = model.poolHitRatio;
            this.requestId = model.requestId;
            this.requiredDelta = model.requiredDelta;
            this.targetCapacity = model.targetCapacity;
        } 

        /**
         * <p>The current measured capacity of the instance. This parameter is returned only when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder currentCapacity(Long currentCapacity) {
            this.currentCapacity = currentCapacity;
            return this;
        }

        /**
         * <p>The ID of the PolarDB AI 3.0 logical instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-2ze4x2mwo81knj08a</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Indicates whether the current request performs a capacity dry run only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The capacity that can be directly borrowed from the large pool without reshaping. This parameter is returned only when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder poolHitCapacity(Long poolHitCapacity) {
            this.poolHitCapacity = poolHitCapacity;
            return this;
        }

        /**
         * <p>The direct hit ratio of the large pool. Valid values: 0 to 1. This parameter is returned only when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>0.75</p>
         */
        public Builder poolHitRatio(Double poolHitRatio) {
            this.poolHitRatio = poolHitRatio;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The positive difference between the target capacity and the current capacity. This parameter is returned only when DryRun is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        public Builder requiredDelta(Long requiredDelta) {
            this.requiredDelta = requiredDelta;
            return this;
        }

        /**
         * <p>The target total capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        public Builder targetCapacity(Long targetCapacity) {
            this.targetCapacity = targetCapacity;
            return this;
        }

        public ResizeAIDBClusterModelResponseBody build() {
            return new ResizeAIDBClusterModelResponseBody(this);
        } 

    } 

}
