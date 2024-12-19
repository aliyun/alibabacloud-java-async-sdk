// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyIpControlPolicyItemRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpControlPolicyItemRequest</p>
 */
public class ModifyIpControlPolicyItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private ModifyIpControlPolicyItemRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cidrIp = builder.cidrIp;
        this.ipControlId = builder.ipControlId;
        this.policyItemId = builder.policyItemId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpControlPolicyItemRequest create() {
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
     * @return cidrIp
     */
    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return policyItemId
     */
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ModifyIpControlPolicyItemRequest, Builder> {
        private String appId; 
        private String cidrIp; 
        private String ipControlId; 
        private String policyItemId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpControlPolicyItemRequest request) {
            super(request);
            this.appId = request.appId;
            this.cidrIp = request.cidrIp;
            this.ipControlId = request.ipControlId;
            this.policyItemId = request.policyItemId;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The ID of the application that is restricted by the policy. You can configure the AppId parameter only when the value of the IpControlType parameter is ALLOW.</p>
         * <ul>
         * <li>You can add only one application ID at a time.</li>
         * <li>If this parameter is empty, no applications are restricted.</li>
         * <li>If this parameter is not empty, not only IP addresses but also applications are restricted.</li>
         * <li>If this parameter is not empty and no security authentication method is specified for the API, all API calls are restricted.</li>
         * <li>If the value of the IpControlType parameter is REFUSE and the AppId parameter is not empty, API Gateway automatically ignores the AppId parameter and restricts only the IP addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The IP address or CIDR block that is defined in a policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can add a maximum of 10 IP addresses or CIDR blocks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>113.125.1.101;101.11.1.1</p>
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * <p>The ID of the ACL. The ID is unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P151617000829241</p>
         */
        public Builder policyItemId(String policyItemId) {
            this.putQueryParameter("PolicyItemId", policyItemId);
            this.policyItemId = policyItemId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ModifyIpControlPolicyItemRequest build() {
            return new ModifyIpControlPolicyItemRequest(this);
        } 

    } 

}
