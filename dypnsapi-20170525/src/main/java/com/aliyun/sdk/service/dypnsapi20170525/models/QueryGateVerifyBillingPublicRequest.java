// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGateVerifyBillingPublicRequest} extends {@link RequestModel}
 *
 * <p>QueryGateVerifyBillingPublicRequest</p>
 */
public class QueryGateVerifyBillingPublicRequest extends Request {
    @Query
    @NameInMap("AuthenticationType")
    @Validation(required = true, maximum = 99)
    private Integer authenticationType;

    @Query
    @NameInMap("Month")
    @Validation(required = true)
    private String month;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private QueryGateVerifyBillingPublicRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.month = builder.month;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyBillingPublicRequest create() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<QueryGateVerifyBillingPublicRequest, Builder> {
        private Integer authenticationType; 
        private String month; 
        private Long ownerId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(QueryGateVerifyBillingPublicRequest response) {
            super(response);
            this.authenticationType = response.authenticationType;
            this.month = response.month;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
        } 

        /**
         * AuthenticationType.
         */
        public Builder authenticationType(Integer authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * Month.
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public QueryGateVerifyBillingPublicRequest build() {
            return new QueryGateVerifyBillingPublicRequest(this);
        } 

    } 

}
