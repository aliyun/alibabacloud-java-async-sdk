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
 * {@link ManagedDaOrderVO} extends {@link TeaModel}
 *
 * <p>ManagedDaOrderVO</p>
 */
public class ManagedDaOrderVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("payNum")
    private Integer payNum;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("subscriptionPlan")
    private String subscriptionPlan;

    private ManagedDaOrderVO(Builder builder) {
        this.expireTime = builder.expireTime;
        this.gmtCreate = builder.gmtCreate;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.payNum = builder.payNum;
        this.region = builder.region;
        this.state = builder.state;
        this.subscriptionPlan = builder.subscriptionPlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManagedDaOrderVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
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
     * @return subscriptionPlan
     */
    public String getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public static final class Builder {
        private String expireTime; 
        private String gmtCreate; 
        private String instanceId; 
        private Long orderId; 
        private Integer payNum; 
        private String region; 
        private String state; 
        private String subscriptionPlan; 

        private Builder() {
        } 

        private Builder(ManagedDaOrderVO model) {
            this.expireTime = model.expireTime;
            this.gmtCreate = model.gmtCreate;
            this.instanceId = model.instanceId;
            this.orderId = model.orderId;
            this.payNum = model.payNum;
            this.region = model.region;
            this.state = model.state;
            this.subscriptionPlan = model.subscriptionPlan;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * payNum.
         */
        public Builder payNum(Integer payNum) {
            this.payNum = payNum;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * subscriptionPlan.
         */
        public Builder subscriptionPlan(String subscriptionPlan) {
            this.subscriptionPlan = subscriptionPlan;
            return this;
        }

        public ManagedDaOrderVO build() {
            return new ManagedDaOrderVO(this);
        } 

    } 

}
