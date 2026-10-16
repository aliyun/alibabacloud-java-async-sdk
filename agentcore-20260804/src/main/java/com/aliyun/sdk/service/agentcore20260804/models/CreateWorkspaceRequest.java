// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateWorkspaceRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateWorkspaceRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private CreateWorkspaceRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace creation request body.</p>
         */
        public Builder body(CreateWorkspaceRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-create-20260805-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRequest</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Vpc(Builder builder) {
            this.enabled = builder.enabled;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Vpc model) {
                this.enabled = model.enabled;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Specifies whether to enable the VPC network.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs. When the VPC network is enabled, the list must contain at least one vSwitch, and all vSwitches must belong to the VPC specified by VpcId.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The user VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1234567890</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRequest</p>
     */
    public static class NetworkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("publicEgressEnabled")
        private Boolean publicEgressEnabled;

        @com.aliyun.core.annotation.NameInMap("publicIngressEnabled")
        private Boolean publicIngressEnabled;

        @com.aliyun.core.annotation.NameInMap("vpc")
        private Vpc vpc;

        private NetworkConfiguration(Builder builder) {
            this.publicEgressEnabled = builder.publicEgressEnabled;
            this.publicIngressEnabled = builder.publicIngressEnabled;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfiguration create() {
            return builder().build();
        }

        /**
         * @return publicEgressEnabled
         */
        public Boolean getPublicEgressEnabled() {
            return this.publicEgressEnabled;
        }

        /**
         * @return publicIngressEnabled
         */
        public Boolean getPublicIngressEnabled() {
            return this.publicIngressEnabled;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private Boolean publicEgressEnabled; 
            private Boolean publicIngressEnabled; 
            private Vpc vpc; 

            private Builder() {
            } 

            private Builder(NetworkConfiguration model) {
                this.publicEgressEnabled = model.publicEgressEnabled;
                this.publicIngressEnabled = model.publicIngressEnabled;
                this.vpc = model.vpc;
            } 

            /**
             * <p>Specifies whether to allow public outbound access from the platform. If this parameter is not specified, the default value is true. This setting only controls whether the latest versions of managed and custom agents use the public outbound endpoint of the platform. It does not affect fixed historical versions, model or MCP proxy endpoints, or the public outbound endpoint of the user VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicEgressEnabled(Boolean publicEgressEnabled) {
                this.publicEgressEnabled = publicEgressEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to allow public inbound access. If this parameter is not specified, the default value is true. If disabled, the public inbound endpoints of all agent endpoints in the workspace are closed, and the original public inbound endpoints are restored when re-enabled. INNER_DIRECT and user VPC endpoints are not affected. Collaboration and Element Web endpoints are not controlled by this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder publicIngressEnabled(Boolean publicIngressEnabled) {
                this.publicIngressEnabled = publicIngressEnabled;
                return this;
            }

            /**
             * <p>The user VPC network configuration.</p>
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public NetworkConfiguration build() {
                return new NetworkConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceRequest</p>
     */
    public static class CreateWorkspaceRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        private CreateWorkspaceRequestBody(Builder builder) {
            this.name = builder.name;
            this.networkConfiguration = builder.networkConfiguration;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateWorkspaceRequestBody create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkConfiguration
         */
        public NetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String name; 
            private NetworkConfiguration networkConfiguration; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(CreateWorkspaceRequestBody model) {
                this.name = model.name;
                this.networkConfiguration = model.networkConfiguration;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The name of the workspace.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>production-agents</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network configuration of the workspace.</p>
             */
            public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
                this.networkConfiguration = networkConfiguration;
                return this;
            }

            /**
             * <p>The workspace storage type. PLATFORM indicates platform-managed storage, and PRIVATE indicates user private OSS storage.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public CreateWorkspaceRequestBody build() {
                return new CreateWorkspaceRequestBody(this);
            } 

        } 

    }
}
