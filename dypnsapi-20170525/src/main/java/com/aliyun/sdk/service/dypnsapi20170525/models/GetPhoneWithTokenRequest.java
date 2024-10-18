// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPhoneWithTokenRequest} extends {@link RequestModel}
 *
 * <p>GetPhoneWithTokenRequest</p>
 */
public class GetPhoneWithTokenRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SpToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spToken;

    private GetPhoneWithTokenRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.spToken = builder.spToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneWithTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return spToken
     */
    public String getSpToken() {
        return this.spToken;
    }

    public static final class Builder extends Request.Builder<GetPhoneWithTokenRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String spToken; 

        private Builder() {
            super();
        } 

        private Builder(GetPhoneWithTokenRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.spToken = request.spToken;
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
         * <p>The token for phone number verification that is obtained by the JavaScript SDK. The validity period of the token is 10 minutes for China Telecom, 30 minutes for China Unicom, and 2 minutes for China Mobile. The token can be used only once.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dfafdafad542****</p>
         */
        public Builder spToken(String spToken) {
            this.putQueryParameter("SpToken", spToken);
            this.spToken = spToken;
            return this;
        }

        @Override
        public GetPhoneWithTokenRequest build() {
            return new GetPhoneWithTokenRequest(this);
        } 

    } 

}
