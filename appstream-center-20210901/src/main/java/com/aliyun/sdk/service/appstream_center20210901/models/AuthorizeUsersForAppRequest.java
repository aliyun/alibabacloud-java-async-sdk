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
 * {@link AuthorizeUsersForAppRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeUsersForAppRequest</p>
 */
public class AuthorizeUsersForAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizeUserIds")
    private java.util.List<String> authorizeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnAuthorizeUserIds")
    private java.util.List<String> unAuthorizeUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserMeta")
    private UserMeta userMeta;

    private AuthorizeUsersForAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.authorizeUserIds = builder.authorizeUserIds;
        this.productType = builder.productType;
        this.unAuthorizeUserIds = builder.unAuthorizeUserIds;
        this.userMeta = builder.userMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeUsersForAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return authorizeUserIds
     */
    public java.util.List<String> getAuthorizeUserIds() {
        return this.authorizeUserIds;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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

    public static final class Builder extends Request.Builder<AuthorizeUsersForAppRequest, Builder> {
        private String appId; 
        private String appInstanceGroupId; 
        private java.util.List<String> authorizeUserIds; 
        private String productType; 
        private java.util.List<String> unAuthorizeUserIds; 
        private UserMeta userMeta; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeUsersForAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.authorizeUserIds = request.authorizeUserIds;
            this.productType = request.productType;
            this.unAuthorizeUserIds = request.unAuthorizeUserIds;
            this.userMeta = request.userMeta;
        } 

        /**
         * <p>The application ID. The application must be deployed in the image used by the delivery group. You can obtain the ID from the Apps list returned by the <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-i87mycyn419nu****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The delivery group ID. You can call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> operation to obtain the ID.</p>
         * <p>The application specified by AppId must be deployed in the image used by this delivery group.</p>
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
         * <p>The list of usernames to add authorization for the application. A maximum of 100 usernames can be specified in a single request.</p>
         * <p>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified. You can also specify both. Adding authorization is subject to the authorized user quota for the application.</p>
         */
        public Builder authorizeUserIds(java.util.List<String> authorizeUserIds) {
            this.putBodyParameter("AuthorizeUserIds", authorizeUserIds);
            this.authorizeUserIds = authorizeUserIds;
            return this;
        }

        /**
         * <p>The product type. Application-level authorization applies to WUYING Cloud Application delivery groups.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>CloudApp: WUYING Cloud Application.</li>
         * </ul>
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
         * <p>The list of usernames to be unauthorized for the application. A maximum of 100 usernames can be specified in a single request.</p>
         * <p>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified. You can also specify both. Removing authorizations is not subject to quota limits.</p>
         */
        public Builder unAuthorizeUserIds(java.util.List<String> unAuthorizeUserIds) {
            this.putBodyParameter("UnAuthorizeUserIds", unAuthorizeUserIds);
            this.unAuthorizeUserIds = unAuthorizeUserIds;
            return this;
        }

        /**
         * <p>The account information of the authorized user, which specifies the account type corresponding to the username.</p>
         * <ul>
         * <li>If the workspace to which the delivery group belongs is an AD workspace, <strong>this parameter is required</strong>: set Type to ad and set AdDomain to the AD domain bound to the workspace.</li>
         * <li>If this parameter is not specified, the WUYING convenience account (simple) is used by default.</li>
         * </ul>
         */
        public Builder userMeta(UserMeta userMeta) {
            String userMetaShrink = shrink(userMeta, "UserMeta", "json");
            this.putBodyParameter("UserMeta", userMetaShrink);
            this.userMeta = userMeta;
            return this;
        }

        @Override
        public AuthorizeUsersForAppRequest build() {
            return new AuthorizeUsersForAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link AuthorizeUsersForAppRequest} extends {@link TeaModel}
     *
     * <p>AuthorizeUsersForAppRequest</p>
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
             * <p>The AD domain name. Specify this parameter when Type is set to ad. The value must match the AD domain bound to the workspace of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder adDomain(String adDomain) {
                this.adDomain = adDomain;
                return this;
            }

            /**
             * <p>The account type. Default value: simple.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ad: AD account.</li>
             * <li>simple: WUYING convenience account.</li>
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
