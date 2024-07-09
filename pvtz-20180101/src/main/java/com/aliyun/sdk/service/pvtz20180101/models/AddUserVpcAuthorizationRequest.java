// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserVpcAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>AddUserVpcAuthorizationRequest</p>
 */
public class AddUserVpcAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthChannel")
    private String authChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long authorizedUserId;

    private AddUserVpcAuthorizationRequest(Builder builder) {
        super(builder);
        this.authChannel = builder.authChannel;
        this.authCode = builder.authCode;
        this.authType = builder.authType;
        this.authorizedUserId = builder.authorizedUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserVpcAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authChannel
     */
    public String getAuthChannel() {
        return this.authChannel;
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return authorizedUserId
     */
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public static final class Builder extends Request.Builder<AddUserVpcAuthorizationRequest, Builder> {
        private String authChannel; 
        private String authCode; 
        private String authType; 
        private Long authorizedUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserVpcAuthorizationRequest request) {
            super(request);
            this.authChannel = request.authChannel;
            this.authCode = request.authCode;
            this.authType = request.authType;
            this.authorizedUserId = request.authorizedUserId;
        } 

        /**
         * The authorization method. Valid values:
         * <p>
         * 
         * *   AUTH_CODE: An authorization code is used to associate VPCs across accounts. The system checks whether the value of AuthCode is valid.
         * *   RESOURCE_DIRECTORY: A resource directory is used to associate VPCs across accounts. The system checks whether the value of AuthorizedUserId and the current account are in the same resource directory.
         * *   If this parameter is empty, an authorization code is used to associate VPCs across accounts.
         */
        public Builder authChannel(String authChannel) {
            this.putQueryParameter("AuthChannel", authChannel);
            this.authChannel = authChannel;
            return this;
        }

        /**
         * The verification code.
         * <p>
         * 
         * This parameter is required when AuthType is set to NORMAL or is left empty and AuthChannel is set to AUTH_CODE or is left empty.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * The authorization scope. Valid values:
         * <p>
         * 
         * *   NORMAL: general authorization.
         * *   CLOUD_PRODUCT: cloud service-related authorization
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        @Override
        public AddUserVpcAuthorizationRequest build() {
            return new AddUserVpcAuthorizationRequest(this);
        } 

    } 

}
