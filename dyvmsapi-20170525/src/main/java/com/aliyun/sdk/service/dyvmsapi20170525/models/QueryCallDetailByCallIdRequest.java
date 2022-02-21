// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallDetailByCallIdRequest} extends {@link RequestModel}
 *
 * <p>QueryCallDetailByCallIdRequest</p>
 */
public class QueryCallDetailByCallIdRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdId")
    @Validation(required = true)
    private Long prodId;

    @Query
    @NameInMap("QueryDate")
    @Validation(required = true)
    private Long queryDate;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryCallDetailByCallIdRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.ownerId = builder.ownerId;
        this.prodId = builder.prodId;
        this.queryDate = builder.queryDate;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallDetailByCallIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodId
     */
    public Long getProdId() {
        return this.prodId;
    }

    /**
     * @return queryDate
     */
    public Long getQueryDate() {
        return this.queryDate;
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

    public static final class Builder extends Request.Builder<QueryCallDetailByCallIdRequest, Builder> {
        private String callId; 
        private Long ownerId; 
        private Long prodId; 
        private Long queryDate; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCallDetailByCallIdRequest response) {
            super(response);
            this.callId = response.callId;
            this.ownerId = response.ownerId;
            this.prodId = response.prodId;
            this.queryDate = response.queryDate;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
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
         * ProdId.
         */
        public Builder prodId(Long prodId) {
            this.putQueryParameter("ProdId", prodId);
            this.prodId = prodId;
            return this;
        }

        /**
         * QueryDate.
         */
        public Builder queryDate(Long queryDate) {
            this.putQueryParameter("QueryDate", queryDate);
            this.queryDate = queryDate;
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
        public QueryCallDetailByCallIdRequest build() {
            return new QueryCallDetailByCallIdRequest(this);
        } 

    } 

}
