// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpControlPolicyItemRequest} extends {@link RequestModel}
 *
 * <p>AddIpControlPolicyItemRequest</p>
 */
public class AddIpControlPolicyItemRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CidrIp")
    @Validation(required = true)
    private String cidrIp;

    @Query
    @NameInMap("IpControlId")
    @Validation(required = true)
    private String ipControlId;

    @Query
    @NameInMap("SecurityToken")
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CidrIp.
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * IpControlId.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
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
        public AddIpControlPolicyItemRequest build() {
            return new AddIpControlPolicyItemRequest(this);
        } 

    } 

}
