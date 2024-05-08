// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpControlPolicyItemRequest} extends {@link RequestModel}
 *
 * <p>AddIpControlPolicyItemRequest</p>
 */
public class AddIpControlPolicyItemRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private AddIpControlPolicyItemRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cidrIp = builder.cidrIp;
        this.ipControlId = builder.ipControlId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpControlPolicyItemRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<AddIpControlPolicyItemRequest, Builder> {
        private String appId; 
        private String cidrIp; 
        private String ipControlId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(AddIpControlPolicyItemRequest request) {
            super(request);
            this.appId = request.appId;
            this.cidrIp = request.cidrIp;
            this.ipControlId = request.ipControlId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The restriction policy on app IDs for a specific policy. You can restrict app IDs only for whitelists. The IpControlType values of whitelists are ALLOW.
         * <p>
         * 
         * *   You can add only one app ID restriction policy at a time.
         * *   If this parameter is empty, no restriction is imposed on the app IDs.
         * *   If this parameter is not empty, there is restriction not only on IP addresses, but also on apps.
         * *   Please note that if this parameter is not empty and the security authentication method of the API is No Authentication, all API calls are restricted.
         * *   If this parameter is not empty for a blacklist, API Gateway automatically skips this parameter and sets only restriction on IP addresses. The IpControlType value of a blacklist is REFUSE.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The IP addresses or CIDR blocks involved in the policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can specify a maximum of 10 IP addresses or CIDR blocks.
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * The ID of the ACL. The ID is unique.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * The security token included in the WebSocket request header. The system uses this token to authenticate the request.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public AddIpControlPolicyItemRequest build() {
            return new AddIpControlPolicyItemRequest(this);
        } 

    } 

}
