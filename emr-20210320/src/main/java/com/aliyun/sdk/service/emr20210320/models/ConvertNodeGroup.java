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
 * {@link ConvertNodeGroup} extends {@link TeaModel}
 *
 * <p>ConvertNodeGroup</p>
 */
public class ConvertNodeGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    private ConvertNodeGroup(Builder builder) {
        this.nodeGroupId = builder.nodeGroupId;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertNodeGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    public static final class Builder {
        private String nodeGroupId; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 

        private Builder() {
        } 

        private Builder(ConvertNodeGroup model) {
            this.nodeGroupId = model.nodeGroupId;
            this.paymentDuration = model.paymentDuration;
            this.paymentDurationUnit = model.paymentDurationUnit;
            this.paymentType = model.paymentType;
        } 

        /**
         * <p>节点组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>付费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * <p>付费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * <p>付费类型。</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public ConvertNodeGroup build() {
            return new ConvertNodeGroup(this);
        } 

    } 

}
