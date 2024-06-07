// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySecretNoRemainRequest} extends {@link RequestModel}
 *
 * <p>QuerySecretNoRemainRequest</p>
 */
public class QuerySecretNoRemainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    @com.aliyun.core.annotation.Validation(required = true)
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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

    private QuerySecretNoRemainRequest(Builder builder) {
        super(builder);
        this.city = builder.city;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.secretNo = builder.secretNo;
        this.specId = builder.specId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecretNoRemainRequest create() {
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

    public static final class Builder extends Request.Builder<QuerySecretNoRemainRequest, Builder> {
        private String city; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String secretNo; 
        private Long specId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySecretNoRemainRequest request) {
            super(request);
            this.city = request.city;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.secretNo = request.secretNo;
            this.specId = request.specId;
        } 

        /**
         * The home location of the phone number.
         * <p>
         * 
         * *   If **SpecId** is set to 1 or 2, you can specify the **City** parameter to query the quantity of available phone numbers.
         * 
         * 1.  You can enter a single city name to perform a query.
         * 2.  You can enter National to query the quantity of remaining phone numbers available in the Chinese mainland for online purchase.
         * 3.  You can enter National List to query the cities with available phone numbers and the quantities of remaining phone numbers in the Chinese mainland. Cities without available phone numbers will not be returned.
         * 
         * *   If **SpecId** is set to 3, home locations are not distinguished for phone numbers that start with 95 and only the quantity of all the remaining phone numbers that start with 95 and are available for online purchase can be queried. If SpecId is set to 3, **City** must be set to **Nationwide**.
         * 
         * >  Home locations can be set to only locations in the Chinese mainland.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
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
         * The prefix of the phone number. When you call the QuerySecretNoRemain operation with **SecretNo** specified, the quantity of remaining phone numbers with the specified prefix that are available for online purchase is queried.
         * <p>
         * 
         * Up to 18 digits of a phone number prefix can be specified.
         */
        public Builder secretNo(String secretNo) {
            this.putQueryParameter("SecretNo", secretNo);
            this.secretNo = secretNo;
            return this;
        }

        /**
         * The type of the phone number. Valid values:
         * <p>
         * 
         * *   **1**: a phone number assigned by a virtual network operator, that is, a phone number that belongs to the 170 or 171 number segment.
         * *   **2**: a phone number provided by a carrier.
         * *   **3**: a phone number that starts with 95.
         */
        public Builder specId(Long specId) {
            this.putQueryParameter("SpecId", specId);
            this.specId = specId;
            return this;
        }

        @Override
        public QuerySecretNoRemainRequest build() {
            return new QuerySecretNoRemainRequest(this);
        } 

    } 

}
