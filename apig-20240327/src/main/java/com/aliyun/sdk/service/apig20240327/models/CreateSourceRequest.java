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
 * {@link CreateSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateSourceRequest</p>
 */
public class CreateSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("k8sSourceConfig")
    private K8sSourceConfig k8sSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nacosSourceConfig")
    private NacosSourceConfig nacosSourceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateSourceRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.k8sSourceConfig = builder.k8sSourceConfig;
        this.nacosSourceConfig = builder.nacosSourceConfig;
        this.resourceGroupId = builder.resourceGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return k8sSourceConfig
     */
    public K8sSourceConfig getK8sSourceConfig() {
        return this.k8sSourceConfig;
    }

    /**
     * @return nacosSourceConfig
     */
    public NacosSourceConfig getNacosSourceConfig() {
        return this.nacosSourceConfig;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateSourceRequest, Builder> {
        private String gatewayId; 
        private K8sSourceConfig k8sSourceConfig; 
        private NacosSourceConfig nacosSourceConfig; 
        private String resourceGroupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateSourceRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.k8sSourceConfig = request.k8sSourceConfig;
            this.nacosSourceConfig = request.nacosSourceConfig;
            this.resourceGroupId = request.resourceGroupId;
            this.type = request.type;
        } 

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtgi6q***</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The source configuration when the source type is K8S.</p>
         */
        public Builder k8sSourceConfig(K8sSourceConfig k8sSourceConfig) {
            this.putBodyParameter("k8sSourceConfig", k8sSourceConfig);
            this.k8sSourceConfig = k8sSourceConfig;
            return this;
        }

        /**
         * <p>The source configuration when the source type is MSE_NACOS.</p>
         */
        public Builder nacosSourceConfig(NacosSourceConfig nacosSourceConfig) {
            this.putBodyParameter("nacosSourceConfig", nacosSourceConfig);
            this.nacosSourceConfig = nacosSourceConfig;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The source type. Valid values:</p>
         * <ul>
         * <li>MSE_NACOS: MSE Nacos</li>
         * <li>K8S: Container Service for Kubernetes (ACK)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MSE_NACOS</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateSourceRequest build() {
            return new CreateSourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateSourceRequest</p>
     */
    public static class AuthorizeSecurityGroupRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("portRanges")
        private java.util.List<String> portRanges;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        private AuthorizeSecurityGroupRules(Builder builder) {
            this.description = builder.description;
            this.portRanges = builder.portRanges;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizeSecurityGroupRules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return portRanges
         */
        public java.util.List<String> getPortRanges() {
            return this.portRanges;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<String> portRanges; 
            private String securityGroupId; 

            private Builder() {
            } 

            private Builder(AuthorizeSecurityGroupRules model) {
                this.description = model.description;
                this.portRanges = model.portRanges;
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * <p>The rule description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of port ranges.</p>
             */
            public Builder portRanges(java.util.List<String> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * <p>The ID of a security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp14w4fa4j***</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public AuthorizeSecurityGroupRules build() {
                return new AuthorizeSecurityGroupRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateSourceRequest</p>
     */
    public static class K8sSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizeSecurityGroupRules")
        private java.util.List<AuthorizeSecurityGroupRules> authorizeSecurityGroupRules;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        private K8sSourceConfig(Builder builder) {
            this.authorizeSecurityGroupRules = builder.authorizeSecurityGroupRules;
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sSourceConfig create() {
            return builder().build();
        }

        /**
         * @return authorizeSecurityGroupRules
         */
        public java.util.List<AuthorizeSecurityGroupRules> getAuthorizeSecurityGroupRules() {
            return this.authorizeSecurityGroupRules;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private java.util.List<AuthorizeSecurityGroupRules> authorizeSecurityGroupRules; 
            private String clusterId; 

            private Builder() {
            } 

            private Builder(K8sSourceConfig model) {
                this.authorizeSecurityGroupRules = model.authorizeSecurityGroupRules;
                this.clusterId = model.clusterId;
            } 

            /**
             * <p>The security group rules.</p>
             */
            public Builder authorizeSecurityGroupRules(java.util.List<AuthorizeSecurityGroupRules> authorizeSecurityGroupRules) {
                this.authorizeSecurityGroupRules = authorizeSecurityGroupRules;
                return this;
            }

            /**
             * <p>The ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c3fbe6caaaece4062b*****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public K8sSourceConfig build() {
                return new K8sSourceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSourceRequest} extends {@link TeaModel}
     *
     * <p>CreateSourceRequest</p>
     */
    public static class NacosSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NacosSourceConfig(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosSourceConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            private Builder() {
            } 

            private Builder(NacosSourceConfig model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The Nacos instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-0dw3w***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NacosSourceConfig build() {
                return new NacosSourceConfig(this);
            } 

        } 

    }
}
