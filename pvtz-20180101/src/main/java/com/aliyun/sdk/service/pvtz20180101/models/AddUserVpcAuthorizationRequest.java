// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The authorization channel. Valid values:</p>
         * <ul>
         * <li>AUTH_CODE: A verification code is used for authorization.</li>
         * <li>RESOURCE_DIRECTORY: A resource directory is used for authorization.</li>
         * </ul>
         * <p>Default value: AUTH_CODE.</p>
         * 
         * <strong>example:</strong>
         * <p>AUTH_CODE</p>
         */
        public Builder authChannel(String authChannel) {
            this.putQueryParameter("AuthChannel", authChannel);
            this.authChannel = authChannel;
            return this;
        }

        /**
         * <p>The verification code.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The specified authentication code is used if the value of AuthChannel is left empty or is set to AUTH_CODE.</p>
         * </li>
         * <li><p>In other cases, a random 6-digit number is used. Example: 123456.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li>NORMAL: general authorization</li>
         * <li>CLOUD_PRODUCT: cloud service-related authorization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
         * <blockquote>
         * <p> You can set an effective scope across accounts only by using an Alibaba Cloud account instead of a RAM user. You can set an effective scope across accounts registered on the same site. For example, you can perform the operation across accounts that are both registered on the Alibaba Cloud China site or Alibaba Cloud international site. You cannot set an effective scope across accounts registered on different sites. For example, you cannot perform the operation across accounts that are separately registered on the Alibaba Cloud China site and Alibaba Cloud international site.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
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
