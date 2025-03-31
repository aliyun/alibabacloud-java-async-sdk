// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
 * {@link ListAccessTokensRequest} extends {@link RequestModel}
 *
 * <p>ListAccessTokensRequest</p>
 */
public class ListAccessTokensRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessTokenId")
    private java.util.List<String> accessTokenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListAccessTokensRequest(Builder builder) {
        super(builder);
        this.accessTokenId = builder.accessTokenId;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessTokensRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokenId
     */
    public java.util.List<String> getAccessTokenId() {
        return this.accessTokenId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAccessTokensRequest, Builder> {
        private java.util.List<String> accessTokenId; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessTokensRequest request) {
            super(request);
            this.accessTokenId = request.accessTokenId;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.status = request.status;
        } 

        /**
         * <p>The information about activation codes.</p>
         */
        public Builder accessTokenId(java.util.List<String> accessTokenId) {
            this.putQueryParameter("AccessTokenId", accessTokenId);
            this.accessTokenId = accessTokenId;
            return this;
        }

        /**
         * <p>The name of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The status of the activation code. Valid values:</p>
         * <ul>
         * <li>activated</li>
         * <li>unactivated</li>
         * <li>expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>activated</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAccessTokensRequest build() {
            return new ListAccessTokensRequest(this);
        } 

    } 

}
