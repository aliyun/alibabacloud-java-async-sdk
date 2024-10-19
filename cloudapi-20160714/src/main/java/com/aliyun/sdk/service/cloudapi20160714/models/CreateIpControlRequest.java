// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIpControlRequest} extends {@link RequestModel}
 *
 * <p>CreateIpControlRequest</p>
 */
public class CreateIpControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlPolicys")
    private java.util.List < IpControlPolicys> ipControlPolicys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipControlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private CreateIpControlRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.ipControlName = builder.ipControlName;
        this.ipControlPolicys = builder.ipControlPolicys;
        this.ipControlType = builder.ipControlType;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipControlName
     */
    public String getIpControlName() {
        return this.ipControlName;
    }

    /**
     * @return ipControlPolicys
     */
    public java.util.List < IpControlPolicys> getIpControlPolicys() {
        return this.ipControlPolicys;
    }

    /**
     * @return ipControlType
     */
    public String getIpControlType() {
        return this.ipControlType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CreateIpControlRequest, Builder> {
        private String description; 
        private String ipControlName; 
        private java.util.List < IpControlPolicys> ipControlPolicys; 
        private String ipControlType; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpControlRequest request) {
            super(request);
            this.description = request.description;
            this.ipControlName = request.ipControlName;
            this.ipControlPolicys = request.ipControlPolicys;
            this.ipControlType = request.ipControlType;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The description. The description can be up to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the ACL. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (<em>). The name cannot start with an underscore (</em>).``</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>controlNameTest</p>
         */
        public Builder ipControlName(String ipControlName) {
            this.putQueryParameter("IpControlName", ipControlName);
            this.ipControlName = ipControlName;
            return this;
        }

        /**
         * <p>The information about the policies. The information is an array of ipcontrolpolicys data.</p>
         */
        public Builder ipControlPolicys(java.util.List < IpControlPolicys> ipControlPolicys) {
            this.putQueryParameter("IpControlPolicys", ipControlPolicys);
            this.ipControlPolicys = ipControlPolicys;
            return this;
        }

        /**
         * <p>The type of the ACL. Valid values:</p>
         * <ul>
         * <li><strong>ALLOW</strong>: an IP address whitelist</li>
         * <li><strong>REFUSE</strong>: an IP address blacklist</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALLOW</p>
         */
        public Builder ipControlType(String ipControlType) {
            this.putQueryParameter("IpControlType", ipControlType);
            this.ipControlType = ipControlType;
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
        public CreateIpControlRequest build() {
            return new CreateIpControlRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIpControlRequest} extends {@link TeaModel}
     *
     * <p>CreateIpControlRequest</p>
     */
    public static class IpControlPolicys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CidrIp")
        private String cidrIp;

        private IpControlPolicys(Builder builder) {
            this.appId = builder.appId;
            this.cidrIp = builder.cidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpControlPolicys create() {
            return builder().build();
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

        public static final class Builder {
            private String appId; 
            private String cidrIp; 

            /**
             * <p>The ID of the application that is restricted by the policy. You can configure the AppId parameter only when the value of the IpControlType parameter is ALLOW.</p>
             * <ul>
             * <li>You can add only one application ID at a time.</li>
             * <li>If this parameter is empty, no applications are restricted.</li>
             * <li>If this parameter is not empty, not only IP addresses but also applications are restricted.</li>
             * <li>If this parameter is not empty and no security authentication method is specified for the API, all API calls are restricted.</li>
             * <li>If the value of the IpControlType parameter is REFUSE and the AppId parameter is not empty, API Gateway automatically ignores the AppId parameter and restricts only the IP addresses.</li>
             * <li>Valid values of N in IpControlPolicys.N: <code>[1,100]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>11111</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The IP address or CIDR block involved in a policy.</p>
             * <ul>
             * <li>If you want to specify a policy when you create an ACL, this parameter is required.</li>
             * <li>The IP address or CIDR block that is defined in each policy. Separate multiple IP addresses or CIDR blocks with semicolons (;). You can add a maximum of 10 IP addresses or CIDR blocks.</li>
             * <li>Valid values of N in IpControlPolicys.N: <code>[1,100]</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>114.1.1.0/24</p>
             */
            public Builder cidrIp(String cidrIp) {
                this.cidrIp = cidrIp;
                return this;
            }

            public IpControlPolicys build() {
                return new IpControlPolicys(this);
            } 

        } 

    }
}
