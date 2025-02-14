// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link BuySecretNoRequest} extends {@link RequestModel}
 *
 * <p>BuySecretNoRequest</p>
 */
public class BuySecretNoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayPool")
    private Boolean displayPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretNo")
    private String secretNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long specId;

    private BuySecretNoRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.displayPool = builder.displayPool;
        this.ownerId = builder.ownerId;
        this.poolKey = builder.poolKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuySecretNoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return displayPool
     */
    public Boolean getDisplayPool() {
        return this.displayPool;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
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
     * @return secretNo
     */
    public String getSecretNo() {
        return this.secretNo;
    }

    /**
     * @return specId
     */
    public Long getSpecId() {
        return this.specId;
    }

    public static final class Builder extends Request.Builder<BuySecretNoRequest, Builder> {
        private String city; 
        private Boolean displayPool; 
        private Long ownerId; 
        private String poolKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 
        private Long specId; 

        private Builder() {
            super();
        } 

        private Builder(BuySecretNoRequest request) {
            super(request);
            this.city = request.city;
            this.displayPool = request.displayPool;
            this.ownerId = request.ownerId;
            this.poolKey = request.poolKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
            this.specId = request.specId;
        } 

        /**
         * <p>Specifies the home location of the phone number.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The home location can be set only to a location in the Chinese mainland.</p>
         * </li>
         * <li><p>A phone number that starts with 95 does not have a home location. If you purchase a phone number that starts with 95, set this parameter to <strong>Nationwide</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>Specifies whether to add the phone number to the pool of numbers that will be displayed during calls.</p>
         * <blockquote>
         * <p> This parameter takes effect only for customers who have enabled the number display feature.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder displayPool(Boolean displayPool) {
            this.putQueryParameter("DisplayPool", displayPool);
            this.displayPool = displayPool;
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
         * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FC123456</p>
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
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
         * <p>The prefix of the phone number. If you specify the value of <strong>SecretNo</strong> when you purchase a phone number, a phone number starting with the specified prefix is selected.</p>
         * <blockquote>
         * <p> You can specify up to 18 digits of the phone number prefix.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        /**
         * <p>The type of the phone number. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: a phone number assigned by a virtual network operator, that is, a phone number that belongs to the 170 or 171 number segment.</li>
         * <li><strong>2</strong>: a phone number provided by a carrier.</li>
         * <li><strong>3</strong>: a phone number that starts with 95.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public BuySecretNoRequest build() {
            return new BuySecretNoRequest(this);
        } 

    } 

}
