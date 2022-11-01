// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeInstanceGroupRequest</p>
 */
public class AuthorizeInstanceGroupRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("AuthorizeUserIds")
    private java.util.List < String > authorizeUserIds;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("UnAuthorizeUserIds")
    private java.util.List < String > unAuthorizeUserIds;

    private AuthorizeInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.authorizeUserIds = builder.authorizeUserIds;
        this.productType = builder.productType;
        this.unAuthorizeUserIds = builder.unAuthorizeUserIds;
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
     * @return authorizeUserIds
     */
    public java.util.List < String > getAuthorizeUserIds() {
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
    public java.util.List < String > getUnAuthorizeUserIds() {
        return this.unAuthorizeUserIds;
    }

    public static final class Builder extends Request.Builder<AuthorizeInstanceGroupRequest, Builder> {
        private String appInstanceGroupId; 
        private java.util.List < String > authorizeUserIds; 
        private String productType; 
        private java.util.List < String > unAuthorizeUserIds; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeInstanceGroupRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.authorizeUserIds = request.authorizeUserIds;
            this.productType = request.productType;
            this.unAuthorizeUserIds = request.unAuthorizeUserIds;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AuthorizeUserIds.
         */
        public Builder authorizeUserIds(java.util.List < String > authorizeUserIds) {
            this.putBodyParameter("AuthorizeUserIds", authorizeUserIds);
            this.authorizeUserIds = authorizeUserIds;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * UnAuthorizeUserIds.
         */
        public Builder unAuthorizeUserIds(java.util.List < String > unAuthorizeUserIds) {
            this.putBodyParameter("UnAuthorizeUserIds", unAuthorizeUserIds);
            this.unAuthorizeUserIds = unAuthorizeUserIds;
            return this;
        }

        @Override
        public AuthorizeInstanceGroupRequest build() {
            return new AuthorizeInstanceGroupRequest(this);
        } 

    } 

}
