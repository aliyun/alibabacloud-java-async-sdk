// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link AuthorizeInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeInstanceGroupRequest</p>
 */
public class AuthorizeInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizeUserGroupIds")
    private java.util.List<String> authorizeUserGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizeUserIds")
    private java.util.List<String> authorizeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AvatarId")
    private String avatarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnAuthorizeUserGroupIds")
    private java.util.List<String> unAuthorizeUserGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnAuthorizeUserIds")
    private java.util.List<String> unAuthorizeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserMeta")
    private UserMeta userMeta;

    private AuthorizeInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.authorizeUserGroupIds = builder.authorizeUserGroupIds;
        this.authorizeUserIds = builder.authorizeUserIds;
        this.avatarId = builder.avatarId;
        this.productType = builder.productType;
        this.unAuthorizeUserGroupIds = builder.unAuthorizeUserGroupIds;
        this.unAuthorizeUserIds = builder.unAuthorizeUserIds;
        this.userMeta = builder.userMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeInstanceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    /**
     * @return authorizeUserGroupIds
     */
    public java.util.List<String> getAuthorizeUserGroupIds() {
        return this.authorizeUserGroupIds;
    }

    /**
     * @return authorizeUserIds
     */
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    /**
     * @return avatarId
     */
    public String getAvatarId() {
        return this.avatarId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return unAuthorizeUserGroupIds
     */
    public java.util.List<String> getUnAuthorizeUserGroupIds() {
        return this.unAuthorizeUserGroupIds;
    }

    /**
     * @return unAuthorizeUserIds
     */
    public java.util.List<String> getUnAuthorizeUserIds() {
        return this.unAuthorizeUserIds;
    }

    /**
     * @return userMeta
     */
    public UserMeta getUserMeta() {
        return this.userMeta;
    }

    public static final class Builder extends Request.Builder<AuthorizeInstanceGroupRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstancePersistentId; 
        private java.util.List<String> authorizeUserGroupIds; 
        private java.util.List<String> authorizeUserIds; 
        private String avatarId; 
        private String productType; 
        private java.util.List<String> unAuthorizeUserGroupIds; 
        private java.util.List<String> unAuthorizeUserIds; 
        private UserMeta userMeta; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeInstanceGroupRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstancePersistentId = request.appInstancePersistentId;
            this.authorizeUserGroupIds = request.authorizeUserGroupIds;
            this.authorizeUserIds = request.authorizeUserIds;
            this.avatarId = request.avatarId;
            this.productType = request.productType;
            this.unAuthorizeUserGroupIds = request.unAuthorizeUserGroupIds;
            this.unAuthorizeUserIds = request.unAuthorizeUserIds;
            this.userMeta = request.userMeta;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>持久会话ID。</p>
         * 
         * <strong>example:</strong>
         * <p>p-0cc7s3mw2fg4j****</p>
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.putBodyParameter("AppInstancePersistentId", appInstancePersistentId);
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * AuthorizeUserGroupIds.
         */
        public Builder authorizeUserGroupIds(java.util.List<String> authorizeUserGroupIds) {
            this.putBodyParameter("AuthorizeUserGroupIds", authorizeUserGroupIds);
            this.authorizeUserGroupIds = authorizeUserGroupIds;
            return this;
        }

        /**
         * <p>The IDs of the users that you want to add to the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
         */
        public Builder authorizeUserIds(java.util.List<String> authorizeUserIds) {
            this.putBodyParameter("AuthorizeUserIds", authorizeUserIds);
            this.authorizeUserIds = authorizeUserIds;
            return this;
        }

        /**
         * AvatarId.
         */
        public Builder avatarId(String avatarId) {
            this.putBodyParameter("AvatarId", avatarId);
            this.avatarId = avatarId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * UnAuthorizeUserGroupIds.
         */
        public Builder unAuthorizeUserGroupIds(java.util.List<String> unAuthorizeUserGroupIds) {
            this.putBodyParameter("UnAuthorizeUserGroupIds", unAuthorizeUserGroupIds);
            this.unAuthorizeUserGroupIds = unAuthorizeUserGroupIds;
            return this;
        }

        /**
         * <p>The IDs of the users that you want to remove from the authorization list of the delivery group. You can specify 1 to 100 user IDs.</p>
         */
        public Builder unAuthorizeUserIds(java.util.List<String> unAuthorizeUserIds) {
            this.putBodyParameter("UnAuthorizeUserIds", unAuthorizeUserIds);
            this.unAuthorizeUserIds = unAuthorizeUserIds;
            return this;
        }

        /**
         * <p>The user information.</p>
         */
        public Builder userMeta(UserMeta userMeta) {
            String userMetaShrink = shrink(userMeta, "UserMeta", "json");
            this.putBodyParameter("UserMeta", userMetaShrink);
            this.userMeta = userMeta;
            return this;
        }

        @Override
        public AuthorizeInstanceGroupRequest build() {
            return new AuthorizeInstanceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeInstanceGroupRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeInstanceGroupRequest</p>
     */
    public static class UserMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDomain")
        private String adDomain;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserMeta(Builder builder) {
            this.adDomain = builder.adDomain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserMeta create() {
            return builder().build();
        }

        /**
         * @return adDomain
         */
        public String getAdDomain() {
            return this.adDomain;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String adDomain; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserMeta model) {
                this.adDomain = model.adDomain;
                this.type = model.type;
            } 

            /**
             * <p>The AD domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * <p>The user type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ad: Active Directory (AD) account</li>
             * <li>simple: convenience account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>simple</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserMeta build() {
                return new UserMeta(this);
            } 

        } 

    }
}
