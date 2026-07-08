// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link GetAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAuthCodeRequest</p>
 */
public class GetAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCreateUser")
    private Boolean autoCreateUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenType")
    private String tokenType;

    private GetAuthCodeRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.adDomain = builder.adDomain;
        this.autoCreateUser = builder.autoCreateUser;
        this.endUserId = builder.endUserId;
        this.externalUserId = builder.externalUserId;
        this.policy = builder.policy;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return autoCreateUser
     */
    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<GetAuthCodeRequest, Builder> {
        private String accountType; 
        private String adDomain; 
        private Boolean autoCreateUser; 
        private String endUserId; 
        private String externalUserId; 
        private String policy; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthCodeRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.adDomain = request.adDomain;
            this.autoCreateUser = request.autoCreateUser;
            this.endUserId = request.endUserId;
            this.externalUserId = request.externalUserId;
            this.policy = request.policy;
            this.tokenType = request.tokenType;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putBodyParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * AdDomain.
         */
        public Builder adDomain(String adDomain) {
            this.putBodyParameter("AdDomain", adDomain);
            this.adDomain = adDomain;
            return this;
        }

        /**
         * AutoCreateUser.
         */
        public Builder autoCreateUser(Boolean autoCreateUser) {
            this.putBodyParameter("AutoCreateUser", autoCreateUser);
            this.autoCreateUser = autoCreateUser;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * TokenType.
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public GetAuthCodeRequest build() {
            return new GetAuthCodeRequest(this);
        } 

    } 

}
