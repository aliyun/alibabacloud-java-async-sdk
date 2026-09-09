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
 * {@link InstallWorkspacePluginRequest} extends {@link RequestModel}
 *
 * <p>InstallWorkspacePluginRequest</p>
 */
public class InstallWorkspacePluginRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pluginName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private InstallWorkspacePluginRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private InstallWorkspacePluginRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.pluginName = builder.pluginName;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallWorkspacePluginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * @return body
     */
    public InstallWorkspacePluginRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<InstallWorkspacePluginRequest, Builder> {
        private String workspaceId; 
        private String pluginName; 
        private InstallWorkspacePluginRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(InstallWorkspacePluginRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.pluginName = request.pluginName;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The plugin name. Currently, only collaboration is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>collaboration</p>
         */
        public Builder pluginName(String pluginName) {
            this.putPathParameter("pluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        /**
         * <p>The request body for installing a plugin.</p>
         */
        public Builder body(InstallWorkspacePluginRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The client idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-plugin-install-20260810-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public InstallWorkspacePluginRequest build() {
            return new InstallWorkspacePluginRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallWorkspacePluginRequest} extends {@link TeaModel}
     *
     * <p>InstallWorkspacePluginRequest</p>
     */
    public static class Internet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        private Internet(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Internet create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(Internet model) {
                this.enabled = model.enabled;
            } 

            /**
             * <p>Specifies whether to enable public network access. If set to true without a VPC specified, PUB_NET is used. If set to true with a VPC specified, PRIVATE_PUBNET is used. If only a VPC is specified, PRIVATE_NET is used. At least one of public network or VPC must be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public Internet build() {
                return new Internet(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallWorkspacePluginRequest} extends {@link TeaModel}
     *
     * <p>InstallWorkspacePluginRequest</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("vSwitchIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>Specifies whether the collaboration plugin uses VPC networking. If set to false, vpcId and vSwitchIds are ignored. If set to true, you must provide both vpcId and at least two vSwitchIds.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs. The collaboration plugin requires that the vSwitches cover at least two different zones, and all vSwitches must belong to the VPC specified by vpcId.</p>
             * <p>This parameter is required.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * <p>This parameter is required.</p>
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
     * {@link InstallWorkspacePluginRequest} extends {@link TeaModel}
     *
     * <p>InstallWorkspacePluginRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("internet")
        private Internet internet;

        @com.aliyun.core.annotation.NameInMap("vpc")
        private Vpc vpc;

        private Network(Builder builder) {
            this.internet = builder.internet;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return internet
         */
        public Internet getInternet() {
            return this.internet;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private Internet internet; 
            private Vpc vpc; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.internet = model.internet;
                this.vpc = model.vpc;
            } 

            /**
             * <p>Controls whether the collaboration component is allowed to access the public network. This configuration only controls public network access capability and does not expose the component service to the public network.</p>
             */
            public Builder internet(Internet internet) {
                this.internet = internet;
                return this;
            }

            /**
             * <p>The user VPC and vSwitch list used for deploying the collaboration plugin. The zones corresponding to the vSwitches are queried by the server and do not need to be provided by the user.</p>
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallWorkspacePluginRequest} extends {@link TeaModel}
     *
     * <p>InstallWorkspacePluginRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        private Config(Builder builder) {
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private Network network; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.network = model.network;
            } 

            /**
             * <p>The network configuration used by the collaboration plugin. If not specified, the server uses the existing network configuration of the workspace.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link InstallWorkspacePluginRequest} extends {@link TeaModel}
     *
     * <p>InstallWorkspacePluginRequest</p>
     */
    public static class InstallWorkspacePluginRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        private InstallWorkspacePluginRequestBody(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallWorkspacePluginRequestBody create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        public static final class Builder {
            private Config config; 

            private Builder() {
            } 

            private Builder(InstallWorkspacePluginRequestBody model) {
                this.config = model.config;
            } 

            /**
             * <p>The plugin-specific configuration. The configuration structure is determined by pluginName. Currently, the collaboration plugin supports network.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            public InstallWorkspacePluginRequestBody build() {
                return new InstallWorkspacePluginRequestBody(this);
            } 

        } 

    }
}
