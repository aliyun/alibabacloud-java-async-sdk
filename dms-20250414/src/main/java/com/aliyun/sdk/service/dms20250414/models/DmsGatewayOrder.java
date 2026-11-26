// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DmsGatewayOrder} extends {@link TeaModel}
 *
 * <p>DmsGatewayOrder</p>
 */
public class DmsGatewayOrder extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("FreeOrder")
    private Boolean freeOrder;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("PayNum")
    private Integer payNum;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private DmsGatewayOrder(Builder builder) {
        this.bizType = builder.bizType;
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.expireTime = builder.expireTime;
        this.freeOrder = builder.freeOrder;
        this.gmtCreate = builder.gmtCreate;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.orderId = builder.orderId;
        this.payNum = builder.payNum;
        this.region = builder.region;
        this.state = builder.state;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DmsGatewayOrder create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return freeOrder
     */
    public Boolean getFreeOrder() {
        return this.freeOrder;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return payNum
     */
    public Integer getPayNum() {
        return this.payNum;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String bizType; 
        private String chargeType; 
        private String commodityCode; 
        private String expireTime; 
        private Boolean freeOrder; 
        private String gmtCreate; 
        private String instanceId; 
        private String instanceType; 
        private Long orderId; 
        private Integer payNum; 
        private String region; 
        private String state; 
        private String tags; 

        private Builder() {
        } 

        private Builder(DmsGatewayOrder model) {
            this.bizType = model.bizType;
            this.chargeType = model.chargeType;
            this.commodityCode = model.commodityCode;
            this.expireTime = model.expireTime;
            this.freeOrder = model.freeOrder;
            this.gmtCreate = model.gmtCreate;
            this.instanceId = model.instanceId;
            this.instanceType = model.instanceType;
            this.orderId = model.orderId;
            this.payNum = model.payNum;
            this.region = model.region;
            this.state = model.state;
            this.tags = model.tags;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * FreeOrder.
         */
        public Builder freeOrder(Boolean freeOrder) {
            this.freeOrder = freeOrder;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * PayNum.
         */
        public Builder payNum(Integer payNum) {
            this.payNum = payNum;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public DmsGatewayOrder build() {
            return new DmsGatewayOrder(this);
        } 

    } 

}
