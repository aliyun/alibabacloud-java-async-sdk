// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppPoliciesForIdentityRequest} extends {@link RequestModel}
 *
 * <p>ListAppPoliciesForIdentityRequest</p>
 */
public class ListAppPoliciesForIdentityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityName")
    private String identityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    private String identityType;

    private ListAppPoliciesForIdentityRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.identityName = builder.identityName;
        this.identityType = builder.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPoliciesForIdentityRequest create() {
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
     * @return identityName
     */
    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    public static final class Builder extends Request.Builder<ListAppPoliciesForIdentityRequest, Builder> {
        private String appId; 
        private String identityName; 
        private String identityType; 

        private Builder() {
            super();
        } 

        private Builder(ListAppPoliciesForIdentityRequest request) {
            super(request);
            this.appId = request.appId;
            this.identityName = request.identityName;
            this.identityType = request.identityType;
        } 

        /**
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the identity.
         * <p>
         * 
         * *   Specifies the ID of the RAM user when the IdentityType parameter is set to RamUser.
         * *   Specifies the name of the RAM role when the IdentityType parameter is set to RamRole.
         */
        public Builder identityName(String identityName) {
            this.putQueryParameter("IdentityName", identityName);
            this.identityName = identityName;
            return this;
        }

        /**
         * The type of the identity. Valid values:
         * <p>
         * 
         * *   **RamUser**: a RAM user.
         * *   **RamRole**: a RAM role.
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        @Override
        public ListAppPoliciesForIdentityRequest build() {
            return new ListAppPoliciesForIdentityRequest(this);
        } 

    } 

}
