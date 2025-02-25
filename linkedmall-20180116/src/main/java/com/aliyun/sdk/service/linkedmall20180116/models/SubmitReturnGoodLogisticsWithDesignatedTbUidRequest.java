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
 * {@link SubmitReturnGoodLogisticsWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>SubmitReturnGoodLogisticsWithDesignatedTbUidRequest</p>
 */
public class SubmitReturnGoodLogisticsWithDesignatedTbUidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CpCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisputeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long disputeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogisticsNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logisticsNo;

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

    private SubmitReturnGoodLogisticsWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.cpCode = builder.cpCode;
        this.disputeId = builder.disputeId;
        this.logisticsNo = builder.logisticsNo;
        this.subLmOrderId = builder.subLmOrderId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitReturnGoodLogisticsWithDesignatedTbUidRequest create() {
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
     * @return cpCode
     */
    public String getCpCode() {
        return this.cpCode;
    }

    /**
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return logisticsNo
     */
    public String getLogisticsNo() {
        return this.logisticsNo;
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

    public static final class Builder extends Request.Builder<SubmitReturnGoodLogisticsWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String cpCode; 
        private Long disputeId; 
        private String logisticsNo; 
        private String subLmOrderId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitReturnGoodLogisticsWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.cpCode = request.cpCode;
            this.disputeId = request.disputeId;
            this.logisticsNo = request.logisticsNo;
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
         * <p>LMALL20***003</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>YTO</p>
         */
        public Builder cpCode(String cpCode) {
            this.putBodyParameter("CpCode", cpCode);
            this.cpCode = cpCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19145***4240</p>
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
         * <p>YT685***0586</p>
         */
        public Builder logisticsNo(String logisticsNo) {
            this.putBodyParameter("LogisticsNo", logisticsNo);
            this.logisticsNo = logisticsNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>702***47</p>
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
         * <p>user0***01</p>
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public SubmitReturnGoodLogisticsWithDesignatedTbUidRequest build() {
            return new SubmitReturnGoodLogisticsWithDesignatedTbUidRequest(this);
        } 

    } 

}
