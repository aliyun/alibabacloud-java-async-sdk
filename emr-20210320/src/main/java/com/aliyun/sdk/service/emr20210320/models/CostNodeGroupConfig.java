// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link CostNodeGroupConfig} extends {@link TeaModel}
 *
 * <p>CostNodeGroupConfig</p>
 */
public class CostNodeGroupConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<CostInstanceType> instanceTypes;

    @com.aliyun.core.annotation.NameInMap("MaximalNodeCount")
    private Integer maximalNodeCount;

    @com.aliyun.core.annotation.NameInMap("MinimalNodeCount")
    private Integer minimalNodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    private String nodeGroupType;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    private CostNodeGroupConfig(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.maximalNodeCount = builder.maximalNodeCount;
        this.minimalNodeCount = builder.minimalNodeCount;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupType = builder.nodeGroupType;
        this.paymentType = builder.paymentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostNodeGroupConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<CostInstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return maximalNodeCount
     */
    public Integer getMaximalNodeCount() {
        return this.maximalNodeCount;
    }

    /**
     * @return minimalNodeCount
     */
    public Integer getMinimalNodeCount() {
        return this.minimalNodeCount;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    public static final class Builder {
        private java.util.List<CostInstanceType> instanceTypes; 
        private Integer maximalNodeCount; 
        private Integer minimalNodeCount; 
        private Integer nodeCount; 
        private String nodeGroupName; 
        private String nodeGroupType; 
        private String paymentType; 

        private Builder() {
        } 

        private Builder(CostNodeGroupConfig model) {
            this.instanceTypes = model.instanceTypes;
            this.maximalNodeCount = model.maximalNodeCount;
            this.minimalNodeCount = model.minimalNodeCount;
            this.nodeCount = model.nodeCount;
            this.nodeGroupName = model.nodeGroupName;
            this.nodeGroupType = model.nodeGroupType;
            this.paymentType = model.paymentType;
        } 

        /**
         * <p>实例类型列表。</p>
         */
        public Builder instanceTypes(java.util.List<CostInstanceType> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>最大节点数限制。</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maximalNodeCount(Integer maximalNodeCount) {
            this.maximalNodeCount = maximalNodeCount;
            return this;
        }

        /**
         * <p>最小节点数限制。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minimalNodeCount(Integer minimalNodeCount) {
            this.minimalNodeCount = minimalNodeCount;
            return this;
        }

        /**
         * <p>节点数。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>节点组类型。取值范围：</p>
         * <ul>
         * <li>MASTER：管理类型节点组。</li>
         * <li>CORE：存储类型节点组。</li>
         * <li>TASK：计算类型节点组。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CORE</p>
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * <p>付费类型。</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public CostNodeGroupConfig build() {
            return new CostNodeGroupConfig(this);
        } 

    } 

}
