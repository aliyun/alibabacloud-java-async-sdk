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
    @com.aliyun.core.annotation.NameInMap("RefundReason")
    private String refundReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private RefundAppInstanceForPartnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
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
        private String refundReason; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RefundAppInstanceForPartnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * RefundReason.
         */
        public Builder refundReason(String refundReason) {
            this.putQueryParameter("RefundReason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * UserId.
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
