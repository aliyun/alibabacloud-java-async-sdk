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
         * body.
         */
        public Builder body(InstallWorkspacePluginRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * clientToken.
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
             * <p>设置为 true 且未指定 VPC 时使用 PUB_NET；设置为 true 且指定 VPC 时使用 PRIVATE_PUBNET；仅指定 VPC 时使用 PRIVATE_NET。公网和 VPC 至少配置一种。</p>
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
             * <p>显式控制 collaboration 插件是否使用 VPC 网络。设置为 false 时，VpcId 和 VSwitchIds 将被忽略；设置为 true 时必须同时提供 VpcId 和至少两个 VSwitchIds。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>交换机 ID 列表。collaboration 插件要求交换机至少覆盖两个不同可用区，且所有交换机必须属于 VpcId 指定的 VPC。</p>
             * <p>This parameter is required.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
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
             * <p>控制协作组件是否允许访问公网。该配置只控制公网访问能力，不表示将组件服务暴露到公网。</p>
             */
            public Builder internet(Internet internet) {
                this.internet = internet;
                return this;
            }

            /**
             * <p>协作插件部署使用的用户 VPC 和交换机列表。交换机对应的可用区由服务端查询，不需要用户传入 Zones。</p>
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
             * <p>collaboration 插件使用的网络配置。未指定时，服务端使用工作空间已有的网络配置。</p>
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
             * <p>插件专属配置。配置结构由 PluginName 决定。当前 collaboration 插件支持 Network。</p>
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
