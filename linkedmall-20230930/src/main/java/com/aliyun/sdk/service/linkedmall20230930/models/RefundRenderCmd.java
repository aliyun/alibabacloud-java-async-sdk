// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundRenderCmd} extends {@link TeaModel}
 *
 * <p>RefundRenderCmd</p>
 */
public class RefundRenderCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizClaimType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizClaimType;

    @com.aliyun.core.annotation.NameInMap("goodsStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer goodsStatus;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderLineId;

    private RefundRenderCmd(Builder builder) {
        this.bizClaimType = builder.bizClaimType;
        this.goodsStatus = builder.goodsStatus;
        this.orderLineId = builder.orderLineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundRenderCmd create() {
        return builder().build();
    }

    /**
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return goodsStatus
     */
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public static final class Builder {
        private Integer bizClaimType; 
        private Integer goodsStatus; 
        private String orderLineId; 

        /**
         * bizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * goodsStatus.
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        public RefundRenderCmd build() {
            return new RefundRenderCmd(this);
        } 

    } 

}
