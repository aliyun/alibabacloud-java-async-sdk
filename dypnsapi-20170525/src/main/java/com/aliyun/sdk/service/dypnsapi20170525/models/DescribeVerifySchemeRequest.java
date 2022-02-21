// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVerifySchemeRequest} extends {@link RequestModel}
 *
 * <p>DescribeVerifySchemeRequest</p>
 */
public class DescribeVerifySchemeRequest extends Request {
    @Query
    @NameInMap("CustomerId")
    private Long customerId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SchemeCode")
    @Validation(required = true)
    private String schemeCode;

    private DescribeVerifySchemeRequest(Builder builder) {
        super(builder);
        this.customerId = builder.customerId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeCode = builder.schemeCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifySchemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerId
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return schemeCode
     */
    public String getSchemeCode() {
        return this.schemeCode;
    }

    public static final class Builder extends Request.Builder<DescribeVerifySchemeRequest, Builder> {
        private Long customerId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String schemeCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVerifySchemeRequest response) {
            super(response);
            this.customerId = response.customerId;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.schemeCode = response.schemeCode;
        } 

        /**
         * CustomerId.
         */
        public Builder customerId(Long customerId) {
            this.putQueryParameter("CustomerId", customerId);
            this.customerId = customerId;
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

        /**
         * SchemeCode.
         */
        public Builder schemeCode(String schemeCode) {
            this.putQueryParameter("SchemeCode", schemeCode);
            this.schemeCode = schemeCode;
            return this;
        }

        @Override
        public DescribeVerifySchemeRequest build() {
            return new DescribeVerifySchemeRequest(this);
        } 

    } 

}
