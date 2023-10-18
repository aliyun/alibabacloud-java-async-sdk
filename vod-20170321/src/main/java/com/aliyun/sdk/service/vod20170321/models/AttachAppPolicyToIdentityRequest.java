// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachAppPolicyToIdentityRequest} extends {@link RequestModel}
 *
 * <p>AttachAppPolicyToIdentityRequest</p>
 */
public class AttachAppPolicyToIdentityRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("IdentityName")
    @Validation(required = true)
    private String identityName;

    @Query
    @NameInMap("IdentityType")
    @Validation(required = true)
    private String identityType;

    @Query
    @NameInMap("PolicyNames")
    @Validation(required = true)
    private String policyNames;

    private AttachAppPolicyToIdentityRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.identityName = builder.identityName;
        this.identityType = builder.identityType;
        this.policyNames = builder.policyNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachAppPolicyToIdentityRequest create() {
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

    public static final class Builder extends Request.Builder<AttachAppPolicyToIdentityRequest, Builder> {
        private String appId; 
        private String identityName; 
        private String identityType; 
        private String policyNames; 

        private Builder() {
            super();
        } 

        private Builder(AttachAppPolicyToIdentityRequest request) {
            super(request);
            this.appId = request.appId;
            this.identityName = request.identityName;
            this.identityType = request.identityType;
            this.policyNames = request.policyNames;
        } 

        /**
         * The ID of the application. Default value: **app-1000000**. For more information, see [Multi-application service](~~113600~~).
         * <p>
         * 
         * > This parameter is optional only if you set the policy name to VODAppAdministratorAccess.
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
         * *   Specify the ID of the RAM user when the IdentityType parameter is set to RamUser.
         * *   Specify the name of the RAM role when the IdentityType parameter is set to RamRole.
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
         * *   **RamUser**: a RAM user
         * *   **RamRole**: a RAM role
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * The name of the policy. Only system policies are supported. Separate multiple policy names with commas (,). Valid values:
         * <p>
         * 
         * *   **VODAppFullAccess**: permissions to manage all resources in an application.
         * *   **VODAppReadOnlyAccess**: permissions to read all resources in an application.
         * *   **VODAppAdministratorAccess**: permissions of the application administrator.
         */
        public Builder policyNames(String policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
            return this;
        }

        @Override
        public AttachAppPolicyToIdentityRequest build() {
            return new AttachAppPolicyToIdentityRequest(this);
        } 

    } 

}
