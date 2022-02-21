// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecordDataRequest</p>
 */
public class DescribeRecordDataRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("Acid")
    private String acid;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecLevel")
    private Integer secLevel;

    private DescribeRecordDataRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.acid = builder.acid;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secLevel = builder.secLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
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

    /**
     * @return secLevel
     */
    public Integer getSecLevel() {
        return this.secLevel;
    }

    public static final class Builder extends Request.Builder<DescribeRecordDataRequest, Builder> {
        private String accountId; 
        private String accountType; 
        private String acid; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer secLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecordDataRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.accountType = response.accountType;
            this.acid = response.acid;
            this.ownerId = response.ownerId;
            this.prodCode = response.prodCode;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.secLevel = response.secLevel;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * Acid.
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
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

        /**
         * SecLevel.
         */
        public Builder secLevel(Integer secLevel) {
            this.putQueryParameter("SecLevel", secLevel);
            this.secLevel = secLevel;
            return this;
        }

        @Override
        public DescribeRecordDataRequest build() {
            return new DescribeRecordDataRequest(this);
        } 

    } 

}
