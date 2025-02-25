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
 * {@link QuerySellerLicenseRequest} extends {@link RequestModel}
 *
 * <p>QuerySellerLicenseRequest</p>
 */
public class QuerySellerLicenseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SellerId")
    private String sellerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private QuerySellerLicenseRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.sellerId = builder.sellerId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySellerLicenseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return sellerId
     */
    public String getSellerId() {
        return this.sellerId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QuerySellerLicenseRequest, Builder> {
        private String bizId; 
        private String sellerId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySellerLicenseRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.sellerId = request.sellerId;
            this.tenantId = request.tenantId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * SellerId.
         */
        public Builder sellerId(String sellerId) {
            this.putBodyParameter("SellerId", sellerId);
            this.sellerId = sellerId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QuerySellerLicenseRequest build() {
            return new QuerySellerLicenseRequest(this);
        } 

    } 

}
