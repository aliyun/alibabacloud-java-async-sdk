// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCDiskChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRCDiskChargeTypeResponseBody</p>
 */
public class ModifyRCDiskChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private java.util.List<String> expiredTime;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRCDiskChargeTypeResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.expiredTime = builder.expiredTime;
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCDiskChargeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return expiredTime
     */
    public java.util.List<String> getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String chargeType; 
        private java.util.List<String> expiredTime; 
        private java.util.List<String> instanceIds; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyRCDiskChargeTypeResponseBody model) {
            this.chargeType = model.chargeType;
            this.expiredTime = model.expiredTime;
            this.instanceIds = model.instanceIds;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(java.util.List<String> expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRCDiskChargeTypeResponseBody build() {
            return new ModifyRCDiskChargeTypeResponseBody(this);
        } 

    } 

}
