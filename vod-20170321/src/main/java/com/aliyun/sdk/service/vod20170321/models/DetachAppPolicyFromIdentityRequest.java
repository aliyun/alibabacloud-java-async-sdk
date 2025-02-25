// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The ID of the application. This parameter is optional if you set PolicyNames to VODAppAdministratorAccess. This parameter is required if you set PolicyNames to a value other than VODAppAdministratorAccess.</p>
         * <ul>
         * <li>Default value: <strong>app-1000000</strong>.</li>
         * <li>For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the RAM user or the name of the RAM role.</p>
         * <ul>
         * <li>Specifies the ID of the RAM user for this parameter if you set IdentityType to RamUser.</li>
         * <li>Specifies the name of the RAM role for this parameter if you set IdentityType to RamRole.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test****name</p>
         */
        public Builder identityName(String identityName) {
            this.putQueryParameter("IdentityName", identityName);
            this.identityName = identityName;
            return this;
        }

        /**
         * <p>The type of the identity. Valid values:</p>
         * <ul>
         * <li><strong>RamUser</strong>: RAM user</li>
         * <li><strong>RamRole</strong>: RAM role</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>The name of the policy. Separate multiple names with commas (,). Only system policies are supported.</p>
         * <ul>
         * <li><strong>VODAppFullAccess</strong>: permissions to manage all resources in an application</li>
         * <li><strong>VODAppReadOnlyAccess</strong>: permissions to read all resources in an application</li>
         * <li><strong>VODAppAdministratorAccess</strong>: permissions of the application administrator</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VODAppFullAccess</p>
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
