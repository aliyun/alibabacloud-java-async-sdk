// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserVpcAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>AddUserVpcAuthorizationRequest</p>
 */
public class AddUserVpcAuthorizationRequest extends Request {
    @Query
    @NameInMap("AuthChannel")
    private String authChannel;

    @Query
    @NameInMap("AuthCode")
    private String authCode;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("AuthorizedUserId")
    @Validation(required = true)
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

        private Builder(AddUserVpcAuthorizationRequest response) {
            super(response);
            this.authChannel = response.authChannel;
            this.authCode = response.authCode;
            this.authType = response.authType;
            this.authorizedUserId = response.authorizedUserId;
        } 

        /**
         * AuthChannel.
         */
        public Builder authChannel(String authChannel) {
            this.putQueryParameter("AuthChannel", authChannel);
            this.authChannel = authChannel;
            return this;
        }

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * AuthorizedUserId.
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
