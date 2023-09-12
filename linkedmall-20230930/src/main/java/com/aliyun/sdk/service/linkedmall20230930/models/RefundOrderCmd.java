// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundOrderCmd} extends {@link TeaModel}
 *
 * <p>RefundOrderCmd</p>
 */
public class RefundOrderCmd extends TeaModel {
    @NameInMap("applyReasonTextId")
    @Validation(required = true)
    private Long applyReasonTextId;

    @NameInMap("applyReasonTips")
    private String applyReasonTips;

    @NameInMap("applyRefundCount")
    private Integer applyRefundCount;

    @NameInMap("applyRefundFee")
    @Validation(required = true)
    private Long applyRefundFee;

    @NameInMap("bizClaimType")
    @Validation(required = true)
    private Integer bizClaimType;

    @NameInMap("goodsStatus")
    @Validation(required = true)
    private Integer goodsStatus;

    @NameInMap("leaveMessage")
    private String leaveMessage;

    @NameInMap("leavePictureLists")
    private java.util.List < LeavePictureList > leavePictureLists;

    @NameInMap("orderLineId")
    @Validation(required = true)
    private String orderLineId;

    private RefundOrderCmd(Builder builder) {
        this.applyReasonTextId = builder.applyReasonTextId;
        this.applyReasonTips = builder.applyReasonTips;
        this.applyRefundCount = builder.applyRefundCount;
        this.applyRefundFee = builder.applyRefundFee;
        this.bizClaimType = builder.bizClaimType;
        this.goodsStatus = builder.goodsStatus;
        this.leaveMessage = builder.leaveMessage;
        this.leavePictureLists = builder.leavePictureLists;
        this.orderLineId = builder.orderLineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundOrderCmd create() {
        return builder().build();
    }

    /**
     * @return applyReasonTextId
     */
    public Long getApplyReasonTextId() {
        return this.applyReasonTextId;
    }

    /**
     * @return applyReasonTips
     */
    public String getApplyReasonTips() {
        return this.applyReasonTips;
    }

    /**
     * @return applyRefundCount
     */
    public Integer getApplyRefundCount() {
        return this.applyRefundCount;
    }

    /**
     * @return applyRefundFee
     */
    public Long getApplyRefundFee() {
        return this.applyRefundFee;
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
     * @return leaveMessage
     */
    public String getLeaveMessage() {
        return this.leaveMessage;
    }

    /**
     * @return leavePictureLists
     */
    public java.util.List < LeavePictureList > getLeavePictureLists() {
        return this.leavePictureLists;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public static final class Builder {
        private Long applyReasonTextId; 
        private String applyReasonTips; 
        private Integer applyRefundCount; 
        private Long applyRefundFee; 
        private Integer bizClaimType; 
        private Integer goodsStatus; 
        private String leaveMessage; 
        private java.util.List < LeavePictureList > leavePictureLists; 
        private String orderLineId; 

        /**
         * applyReasonTextId.
         */
        public Builder applyReasonTextId(Long applyReasonTextId) {
            this.applyReasonTextId = applyReasonTextId;
            return this;
        }

        /**
         * applyReasonTips.
         */
        public Builder applyReasonTips(String applyReasonTips) {
            this.applyReasonTips = applyReasonTips;
            return this;
        }

        /**
         * applyRefundCount.
         */
        public Builder applyRefundCount(Integer applyRefundCount) {
            this.applyRefundCount = applyRefundCount;
            return this;
        }

        /**
         * applyRefundFee.
         */
        public Builder applyRefundFee(Long applyRefundFee) {
            this.applyRefundFee = applyRefundFee;
            return this;
        }

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
         * leaveMessage.
         */
        public Builder leaveMessage(String leaveMessage) {
            this.leaveMessage = leaveMessage;
            return this;
        }

        /**
         * leavePictureLists.
         */
        public Builder leavePictureLists(java.util.List < LeavePictureList > leavePictureLists) {
            this.leavePictureLists = leavePictureLists;
            return this;
        }

        /**
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        public RefundOrderCmd build() {
            return new RefundOrderCmd(this);
        } 

    } 

}
