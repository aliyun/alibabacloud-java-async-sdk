// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link RefundOrderCmd} extends {@link TeaModel}
 *
 * <p>RefundOrderCmd</p>
 */
public class RefundOrderCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applyReasonTextId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyReasonTextId;

    @com.aliyun.core.annotation.NameInMap("applyReasonTips")
    private String applyReasonTips;

    @com.aliyun.core.annotation.NameInMap("applyRefundCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer applyRefundCount;

    @com.aliyun.core.annotation.NameInMap("applyRefundFee")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyRefundFee;

    @com.aliyun.core.annotation.NameInMap("bizClaimType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bizClaimType;

    @com.aliyun.core.annotation.NameInMap("goodsStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer goodsStatus;

    @com.aliyun.core.annotation.NameInMap("leaveMessage")
    private String leaveMessage;

    @com.aliyun.core.annotation.NameInMap("leavePictureLists")
    private java.util.List<LeavePictureList> leavePictureLists;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<LeavePictureList> getLeavePictureLists() {
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
        private java.util.List<LeavePictureList> leavePictureLists; 
        private String orderLineId; 

        private Builder() {
        } 

        private Builder(RefundOrderCmd model) {
            this.applyReasonTextId = model.applyReasonTextId;
            this.applyReasonTips = model.applyReasonTips;
            this.applyRefundCount = model.applyRefundCount;
            this.applyRefundFee = model.applyRefundFee;
            this.bizClaimType = model.bizClaimType;
            this.goodsStatus = model.goodsStatus;
            this.leaveMessage = model.leaveMessage;
            this.leavePictureLists = model.leavePictureLists;
            this.orderLineId = model.orderLineId;
        } 

        /**
         * <p>The refund reason ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47821</p>
         */
        public Builder applyReasonTextId(Long applyReasonTextId) {
            this.applyReasonTextId = applyReasonTextId;
            return this;
        }

        /**
         * <p>The refund reason text.</p>
         * 
         * <strong>example:</strong>
         * <p>I no longer want it</p>
         */
        public Builder applyReasonTips(String applyReasonTips) {
            this.applyReasonTips = applyReasonTips;
            return this;
        }

        /**
         * <p>The return quantity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder applyRefundCount(Integer applyRefundCount) {
            this.applyRefundCount = applyRefundCount;
            return this;
        }

        /**
         * <p>The requested refund amount in cents.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder applyRefundFee(Long applyRefundFee) {
            this.applyRefundFee = applyRefundFee;
            return this;
        }

        /**
         * <p>The refund type. Valid values:</p>
         * <ul>
         * <li>1: Refund only. </li>
         * <li>3: Return and refund.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * <p>The goods status. Valid values:</p>
         * <ul>
         * <li>4: Not shipped. </li>
         * <li>1: Not received.</li>
         * <li>2: Received.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>I no longer want it</p>
         */
        public Builder leaveMessage(String leaveMessage) {
            this.leaveMessage = leaveMessage;
            return this;
        }

        /**
         * <p>The image list.</p>
         */
        public Builder leavePictureLists(java.util.List<LeavePictureList> leavePictureLists) {
            this.leavePictureLists = leavePictureLists;
            return this;
        }

        /**
         * <p>The sub-distribution order ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5458</p>
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
