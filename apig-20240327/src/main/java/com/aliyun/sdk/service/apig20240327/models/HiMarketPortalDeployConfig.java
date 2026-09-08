// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketPortalDeployConfig} extends {@link TeaModel}
 *
 * <p>HiMarketPortalDeployConfig</p>
 */
public class HiMarketPortalDeployConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.NameInMap("saeConfig")
    private SaeConfig saeConfig;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private HiMarketPortalDeployConfig(Builder builder) {
        this.message = builder.message;
        this.platform = builder.platform;
        this.saeConfig = builder.saeConfig;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketPortalDeployConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return saeConfig
     */
    public SaeConfig getSaeConfig() {
        return this.saeConfig;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String platform; 
        private SaeConfig saeConfig; 
        private String status; 

        private Builder() {
        } 

        private Builder(HiMarketPortalDeployConfig model) {
            this.message = model.message;
            this.platform = model.platform;
            this.saeConfig = model.saeConfig;
            this.status = model.status;
        } 

        /**
         * <p>The deployment status message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The deployment platform type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAE</p>
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * <p>The SAE (Serverless App Engine) deployment configuration.</p>
         */
        public Builder saeConfig(SaeConfig saeConfig) {
            this.saeConfig = saeConfig;
            return this;
        }

        /**
         * <p>The deployment status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public HiMarketPortalDeployConfig build() {
            return new HiMarketPortalDeployConfig(this);
        } 

    } 

    /**
     * 
     * {@link HiMarketPortalDeployConfig} extends {@link TeaModel}
     *
     * <p>HiMarketPortalDeployConfig</p>
     */
    public static class SaeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("oidcRoleName")
        private String oidcRoleName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("replicas")
        private String replicas;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private SaeConfig(Builder builder) {
            this.appId = builder.appId;
            this.namespaceId = builder.namespaceId;
            this.oidcRoleName = builder.oidcRoleName;
            this.regionId = builder.regionId;
            this.replicas = builder.replicas;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaeConfig create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return oidcRoleName
         */
        public String getOidcRoleName() {
            return this.oidcRoleName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return replicas
         */
        public String getReplicas() {
            return this.replicas;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String appId; 
            private String namespaceId; 
            private String oidcRoleName; 
            private String regionId; 
            private String replicas; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(SaeConfig model) {
                this.appId = model.appId;
                this.namespaceId = model.namespaceId;
                this.oidcRoleName = model.oidcRoleName;
                this.regionId = model.regionId;
                this.replicas = model.replicas;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The SAE application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-xxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The SAE namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou:default</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The OIDC role name used for SAE to access other cloud resources.</p>
             * 
             * <strong>example:</strong>
             * <p>apig-portal-oidc-role</p>
             */
            public Builder oidcRoleName(String oidcRoleName) {
                this.oidcRoleName = oidcRoleName;
                return this;
            }

            /**
             * <p>The region ID of SAE.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of instance replicas.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder replicas(String replicas) {
                this.replicas = replicas;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public SaeConfig build() {
                return new SaeConfig(this);
            } 

        } 

    }
}
