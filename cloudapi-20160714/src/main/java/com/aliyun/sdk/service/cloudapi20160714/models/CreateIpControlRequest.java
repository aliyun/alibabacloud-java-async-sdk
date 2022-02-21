// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpControlRequest} extends {@link RequestModel}
 *
 * <p>CreateIpControlRequest</p>
 */
public class CreateIpControlRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IpControlName")
    @Validation(required = true)
    private String ipControlName;

    @Query
    @NameInMap("IpControlPolicys")
    private java.util.List < IpControlPolicys> ipControlPolicys;

    @Query
    @NameInMap("IpControlType")
    @Validation(required = true)
    private String ipControlType;

    @Query
    @NameInMap("SecurityToken")
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

        private Builder(CreateIpControlRequest response) {
            super(response);
            this.description = response.description;
            this.ipControlName = response.ipControlName;
            this.ipControlPolicys = response.ipControlPolicys;
            this.ipControlType = response.ipControlType;
            this.securityToken = response.securityToken;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IpControlName.
         */
        public Builder ipControlName(String ipControlName) {
            this.putQueryParameter("IpControlName", ipControlName);
            this.ipControlName = ipControlName;
            return this;
        }

        /**
         * IpControlPolicys.
         */
        public Builder ipControlPolicys(java.util.List < IpControlPolicys> ipControlPolicys) {
            this.putQueryParameter("IpControlPolicys", ipControlPolicys);
            this.ipControlPolicys = ipControlPolicys;
            return this;
        }

        /**
         * IpControlType.
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

    public static class IpControlPolicys extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CidrIp")
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CidrIp.
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
