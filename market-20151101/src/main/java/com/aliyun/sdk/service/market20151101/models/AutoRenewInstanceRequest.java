// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AutoRenewInstanceRequest} extends {@link RequestModel}
 *
 * <p>AutoRenewInstanceRequest</p>
 */
public class AutoRenewInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewCycle")
    private String autoRenewCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderBizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderBizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AutoRenewInstanceRequest(Builder builder) {
        super(builder);
        this.autoRenewCycle = builder.autoRenewCycle;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.orderBizId = builder.orderBizId;
        this.ownerId = builder.ownerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoRenewInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewCycle
     */
    public String getAutoRenewCycle() {
        return this.autoRenewCycle;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return orderBizId
     */
    public Long getOrderBizId() {
        return this.orderBizId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AutoRenewInstanceRequest, Builder> {
        private String autoRenewCycle; 
        private Integer autoRenewDuration; 
        private Long orderBizId; 
        private Long ownerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AutoRenewInstanceRequest request) {
            super(request);
            this.autoRenewCycle = request.autoRenewCycle;
            this.autoRenewDuration = request.autoRenewDuration;
            this.orderBizId = request.orderBizId;
            this.ownerId = request.ownerId;
            this.type = request.type;
        } 

        /**
         * AutoRenewCycle.
         */
        public Builder autoRenewCycle(String autoRenewCycle) {
            this.putBodyParameter("AutoRenewCycle", autoRenewCycle);
            this.autoRenewCycle = autoRenewCycle;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.putBodyParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder orderBizId(Long orderBizId) {
            this.putBodyParameter("OrderBizId", orderBizId);
            this.orderBizId = orderBizId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putBodyParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AutoRenewInstanceRequest build() {
            return new AutoRenewInstanceRequest(this);
        } 

    } 

}
