// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserRequest} extends {@link RequestModel}
 *
 * <p>GetUserRequest</p>
 */
public class GetUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
    private String userPrincipalName;

    private GetUserRequest(Builder builder) {
        super(builder);
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userId = builder.userId;
        this.userPrincipalName = builder.userPrincipalName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

    public static final class Builder extends Request.Builder<GetUserRequest, Builder> {
        private String userAccessKeyId; 
        private String userId; 
        private String userPrincipalName; 

        private Builder() {
            super();
        } 

        private Builder(GetUserRequest request) {
            super(request);
            this.userAccessKeyId = request.userAccessKeyId;
            this.userId = request.userId;
            this.userPrincipalName = request.userPrincipalName;
        } 

        /**
         * <p>The AccessKey ID of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LTAI4GFTgcR8m8cZQDTH****</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * <p>The ID of the RAM user.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The logon name of the RAM user.</p>
         * <p>The name is in the format of <code>&lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code>. <code>&lt;username&gt;</code> indicates the name of the RAM user. <code>&lt;AccountAlias&gt;.onaliyun.com</code> indicates the default domain name.</p>
         * <p>The value of <code>UserPrincipalName</code> must be <code>1 to 128</code> characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_). The value of <code>&lt;username&gt;</code> must be <code>1 to 64</code> characters in length.</p>
         * <blockquote>
         * <p>You must specify only one of the following parameters: <code>UserPrincipalName</code>, <code>UserId</code>, and <code>UserAccessKeyId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder userPrincipalName(String userPrincipalName) {
            this.putQueryParameter("UserPrincipalName", userPrincipalName);
            this.userPrincipalName = userPrincipalName;
            return this;
        }

        @Override
        public GetUserRequest build() {
            return new GetUserRequest(this);
        } 

    } 

}
