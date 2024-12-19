// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ApplyRefundWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>ApplyRefundWithDesignatedTbUidRequest</p>
 */
public class ApplyRefundWithDesignatedTbUidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisputeId")
    private Long disputeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GoodsStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer goodsStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Proofs")
    private java.util.List<Proofs> proofs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReasonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reasonId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer refundCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundCount")
    private Integer refundCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundFee")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long refundFee;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subLmOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tbAccountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TbUserId")
    private Long tbUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdPartyUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdPartyUserId;

    private ApplyRefundWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.disputeId = builder.disputeId;
        this.goodsStatus = builder.goodsStatus;
        this.message = builder.message;
        this.proofs = builder.proofs;
        this.reasonId = builder.reasonId;
        this.refundCode = builder.refundCode;
        this.refundCount = builder.refundCount;
        this.refundFee = builder.refundFee;
        this.subLmOrderId = builder.subLmOrderId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyRefundWithDesignatedTbUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return goodsStatus
     */
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return proofs
     */
    public java.util.List<Proofs> getProofs() {
        return this.proofs;
    }

    /**
     * @return reasonId
     */
    public Long getReasonId() {
        return this.reasonId;
    }

    /**
     * @return refundCode
     */
    public Integer getRefundCode() {
        return this.refundCode;
    }

    /**
     * @return refundCount
     */
    public Integer getRefundCount() {
        return this.refundCount;
    }

    /**
     * @return refundFee
     */
    public Long getRefundFee() {
        return this.refundFee;
    }

    /**
     * @return subLmOrderId
     */
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    /**
     * @return tbAccountType
     */
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    /**
     * @return tbUserId
     */
    public Long getTbUserId() {
        return this.tbUserId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static final class Builder extends Request.Builder<ApplyRefundWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Long disputeId; 
        private Integer goodsStatus; 
        private String message; 
        private java.util.List<Proofs> proofs; 
        private Long reasonId; 
        private Integer refundCode; 
        private Integer refundCount; 
        private Long refundFee; 
        private String subLmOrderId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyRefundWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.disputeId = request.disputeId;
            this.goodsStatus = request.goodsStatus;
            this.message = request.message;
            this.proofs = request.proofs;
            this.reasonId = request.reasonId;
            this.refundCode = request.refundCode;
            this.refundCount = request.refundCount;
            this.refundFee = request.refundFee;
            this.subLmOrderId = request.subLmOrderId;
            this.tbAccountType = request.tbAccountType;
            this.tbUserId = request.tbUserId;
            this.thirdPartyUserId = request.thirdPartyUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20***001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DisputeId.
         */
        public Builder disputeId(Long disputeId) {
            this.putBodyParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.putBodyParameter("GoodsStatus", goodsStatus);
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putBodyParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * Proofs.
         */
        public Builder proofs(java.util.List<Proofs> proofs) {
            String proofsShrink = shrink(proofs, "Proofs", "json");
            this.putBodyParameter("Proofs", proofsShrink);
            this.proofs = proofs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>150013</p>
         */
        public Builder reasonId(Long reasonId) {
            this.putBodyParameter("ReasonId", reasonId);
            this.reasonId = reasonId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder refundCode(Integer refundCode) {
            this.putBodyParameter("RefundCode", refundCode);
            this.refundCode = refundCode;
            return this;
        }

        /**
         * RefundCount.
         */
        public Builder refundCount(Integer refundCount) {
            this.putBodyParameter("RefundCount", refundCount);
            this.refundCount = refundCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>990</p>
         */
        public Builder refundFee(Long refundFee) {
            this.putBodyParameter("RefundFee", refundFee);
            this.refundFee = refundFee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>702091003</p>
         */
        public Builder subLmOrderId(String subLmOrderId) {
            this.putBodyParameter("SubLmOrderId", subLmOrderId);
            this.subLmOrderId = subLmOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ANONY</p>
         */
        public Builder tbAccountType(String tbAccountType) {
            this.putBodyParameter("TbAccountType", tbAccountType);
            this.tbAccountType = tbAccountType;
            return this;
        }

        /**
         * TbUserId.
         */
        public Builder tbUserId(Long tbUserId) {
            this.putBodyParameter("TbUserId", tbUserId);
            this.tbUserId = tbUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>U333***21</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public ApplyRefundWithDesignatedTbUidRequest build() {
            return new ApplyRefundWithDesignatedTbUidRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyRefundWithDesignatedTbUidRequest} extends {@link TeaModel}
     *
     * <p>ApplyRefundWithDesignatedTbUidRequest</p>
     */
    public static class Proofs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessagePic")
        private String messagePic;

        @com.aliyun.core.annotation.NameInMap("MessagePicDesc")
        private String messagePicDesc;

        private Proofs(Builder builder) {
            this.messagePic = builder.messagePic;
            this.messagePicDesc = builder.messagePicDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Proofs create() {
            return builder().build();
        }

        /**
         * @return messagePic
         */
        public String getMessagePic() {
            return this.messagePic;
        }

        /**
         * @return messagePicDesc
         */
        public String getMessagePicDesc() {
            return this.messagePicDesc;
        }

        public static final class Builder {
            private String messagePic; 
            private String messagePicDesc; 

            /**
             * MessagePic.
             */
            public Builder messagePic(String messagePic) {
                this.messagePic = messagePic;
                return this;
            }

            /**
             * MessagePicDesc.
             */
            public Builder messagePicDesc(String messagePicDesc) {
                this.messagePicDesc = messagePicDesc;
                return this;
            }

            public Proofs build() {
                return new Proofs(this);
            } 

        } 

    }
}
