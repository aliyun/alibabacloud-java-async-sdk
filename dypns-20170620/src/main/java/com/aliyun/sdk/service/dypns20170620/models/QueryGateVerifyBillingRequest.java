// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link QueryGateVerifyBillingRequest} extends {@link RequestModel}
 *
 * <p>QueryGateVerifyBillingRequest</p>
 */
public class QueryGateVerifyBillingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private String month;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryGateVerifyBillingRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.month = builder.month;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyBillingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<QueryGateVerifyBillingRequest, Builder> {
        private Integer authenticationType; 
        private String month; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryGateVerifyBillingRequest request) {
            super(request);
            this.authenticationType = request.authenticationType;
            this.month = request.month;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder authenticationType(Integer authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder month(String month) {
            this.putQueryParameter("Month", month);
            this.month = month;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public QueryGateVerifyBillingRequest build() {
            return new QueryGateVerifyBillingRequest(this);
        } 

    } 

}
