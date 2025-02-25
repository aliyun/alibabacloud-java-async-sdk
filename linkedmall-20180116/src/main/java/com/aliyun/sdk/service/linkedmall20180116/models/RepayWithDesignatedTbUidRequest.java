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
 * {@link RepayWithDesignatedTbUidRequest} extends {@link RequestModel}
 *
 * <p>RepayWithDesignatedTbUidRequest</p>
 */
public class RepayWithDesignatedTbUidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LmOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lmOrderId;

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

    private RepayWithDesignatedTbUidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.extJson = builder.extJson;
        this.lmOrderId = builder.lmOrderId;
        this.tbAccountType = builder.tbAccountType;
        this.tbUserId = builder.tbUserId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RepayWithDesignatedTbUidRequest create() {
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
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return lmOrderId
     */
    public Long getLmOrderId() {
        return this.lmOrderId;
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

    public static final class Builder extends Request.Builder<RepayWithDesignatedTbUidRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String extJson; 
        private Long lmOrderId; 
        private String tbAccountType; 
        private Long tbUserId; 
        private String thirdPartyUserId; 

        private Builder() {
            super();
        } 

        private Builder(RepayWithDesignatedTbUidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.extJson = request.extJson;
            this.lmOrderId = request.lmOrderId;
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
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putBodyParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder lmOrderId(Long lmOrderId) {
            this.putBodyParameter("LmOrderId", lmOrderId);
            this.lmOrderId = lmOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putBodyParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        @Override
        public RepayWithDesignatedTbUidRequest build() {
            return new RepayWithDesignatedTbUidRequest(this);
        } 

    } 

}
