// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link RefundAppInstanceForPartnerRequest} extends {@link RequestModel}
 *
 * <p>RefundAppInstanceForPartnerRequest</p>
 */
public class RefundAppInstanceForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefundReason")
    private String refundReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private RefundAppInstanceForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.clientToken = builder.clientToken;
        this.refundReason = builder.refundReason;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundAppInstanceForPartnerRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return refundReason
     */
    public String getRefundReason() {
        return this.refundReason;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RefundAppInstanceForPartnerRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String clientToken; 
        private String refundReason; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RefundAppInstanceForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.clientToken = request.clientToken;
            this.refundReason = request.refundReason;
            this.userId = request.userId;
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
         * <p>The ID of the website building service.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The idempotence token.</p>
         * 
         * <strong>example:</strong>
         * <p>c6f7e8b9-a0b1-4c2d-9e0f-1a2b3c4d5e6f</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The reason for the refund.</p>
         * 
         * <strong>example:</strong>
         * <p>渠道商退款</p>
         */
        public Builder refundReason(String refundReason) {
            this.putQueryParameter("RefundReason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RefundAppInstanceForPartnerRequest build() {
            return new RefundAppInstanceForPartnerRequest(this);
        } 

    } 

}
