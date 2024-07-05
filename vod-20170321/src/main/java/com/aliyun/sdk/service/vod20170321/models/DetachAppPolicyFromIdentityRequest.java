// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAppPolicyFromIdentityRequest} extends {@link RequestModel}
 *
 * <p>DetachAppPolicyFromIdentityRequest</p>
 */
public class DetachAppPolicyFromIdentityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyNames;

    private DetachAppPolicyFromIdentityRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.identityName = builder.identityName;
        this.identityType = builder.identityType;
        this.policyNames = builder.policyNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAppPolicyFromIdentityRequest create() {
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

    /**
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
    }

    public static final class Builder extends Request.Builder<DetachAppPolicyFromIdentityRequest, Builder> {
        private String appId; 
        private String identityName; 
        private String identityType; 
        private String policyNames; 

        private Builder() {
            super();
        } 

        private Builder(DetachAppPolicyFromIdentityRequest request) {
            super(request);
            this.appId = request.appId;
            this.identityName = request.identityName;
            this.identityType = request.identityType;
            this.policyNames = request.policyNames;
        } 

        /**
         * The ID of the application. This parameter is optional if you set PolicyNames to VODAppAdministratorAccess. This parameter is required if you set PolicyNames to a value other than VODAppAdministratorAccess.
         * <p>
         * 
         * *   Default value: **app-1000000**.
         * *   For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the RAM user or the name of the RAM role.
         * <p>
         * 
         * *   Specifies the ID of the RAM user for this parameter if you set IdentityType to RamUser.
         * *   Specifies the name of the RAM role for this parameter if you set IdentityType to RamRole.
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
         * *   **RamUser**: RAM user
         * *   **RamRole**: RAM role
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * The name of the policy. Separate multiple names with commas (,). Only system policies are supported.
         * <p>
         * 
         * *   **VODAppFullAccess**: permissions to manage all resources in an application
         * *   **VODAppReadOnlyAccess**: permissions to read all resources in an application
         * *   **VODAppAdministratorAccess**: permissions of the application administrator
         */
        public Builder policyNames(String policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
            return this;
        }

        @Override
        public DetachAppPolicyFromIdentityRequest build() {
            return new DetachAppPolicyFromIdentityRequest(this);
        } 

    } 

}
