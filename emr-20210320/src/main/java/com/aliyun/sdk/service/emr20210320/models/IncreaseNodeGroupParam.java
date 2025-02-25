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
 * {@link IncreaseNodeGroupParam} extends {@link TeaModel}
 *
 * <p>IncreaseNodeGroupParam</p>
 */
public class IncreaseNodeGroupParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Long nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private IncreaseNodeGroupParam(Builder builder) {
        this.nodeCount = builder.nodeCount;
        this.nodeGroupId = builder.nodeGroupId;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseNodeGroupParam create() {
        return builder().build();
    }

    /**
     * @return nodeCount
     */
    public Long getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder {
        private Long nodeCount; 
        private String nodeGroupId; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String vSwitchId; 

        /**
         * NodeCount.
         */
        public Builder nodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        public IncreaseNodeGroupParam build() {
            return new IncreaseNodeGroupParam(this);
        } 

    } 

}
