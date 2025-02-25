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
 * {@link InitModifyRefundWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>InitModifyRefundWithDesignatedTbUidRequest</p>
 */
public class InitModifyRefundWithDesignatedTbUidRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RefundCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer refundCode;

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

    private InitModifyRefundWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.disputeId = builder.disputeId;
        this.refundCode = builder.refundCode;
        this.subLmOrderId = builder.subLmOrderId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitModifyRefundWithDesignatedTbUidRequest create() {
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
     * @return refundCode
     */
    public Integer getRefundCode() {
        return this.refundCode;
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

    public static final class Builder extends Request.Builder<InitModifyRefundWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private Long disputeId; 
        private Integer refundCode; 
        private String subLmOrderId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(InitModifyRefundWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.disputeId = request.disputeId;
            this.refundCode = request.refundCode;
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
         * <p>LMALL2022***001</p>
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
         * <p>1</p>
         */
        public Builder refundCode(Integer refundCode) {
            this.putBodyParameter("RefundCode", refundCode);
            this.refundCode = refundCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>742***206</p>
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
         * <p>u***002</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public InitModifyRefundWithDesignatedTbUidRequest build() {
            return new InitModifyRefundWithDesignatedTbUidRequest(this);
        } 

    } 

}
