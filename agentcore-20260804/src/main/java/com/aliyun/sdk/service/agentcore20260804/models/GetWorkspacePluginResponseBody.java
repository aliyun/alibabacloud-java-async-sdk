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
 * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkspacePluginResponseBody</p>
 */
public class GetWorkspacePluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetWorkspacePluginResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspacePluginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetWorkspacePluginResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The plug-in details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message. An error description is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkspacePluginResponseBody build() {
            return new GetWorkspacePluginResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
     */
    public static class AgentLoop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpaceName")
        private String agentSpaceName;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        private AgentLoop(Builder builder) {
            this.agentSpaceName = builder.agentSpaceName;
            this.createdAt = builder.createdAt;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentLoop create() {
            return builder().build();
        }

        /**
         * @return agentSpaceName
         */
        public String getAgentSpaceName() {
            return this.agentSpaceName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String agentSpaceName; 
            private String createdAt; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(AgentLoop model) {
                this.agentSpaceName = model.agentSpaceName;
                this.createdAt = model.createdAt;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The AgentSpace name associated with the AgentLoop plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>agentcore-ws-123456</p>
             */
            public Builder agentSpaceName(String agentSpaceName) {
                this.agentSpaceName = agentSpaceName;
                return this;
            }

            /**
             * <p>The creation time of the AgentSpace in UTC in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T03:04:05Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The region ID where the AgentSpace resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public AgentLoop build() {
                return new AgentLoop(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
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
             * <p>Indicates whether public network access is enabled.</p>
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
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
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
             * <p>Indicates whether VPC network access is enabled for the collaboration plug-in.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The list of vSwitch IDs used for plug-in deployment.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID used for plug-in deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1example</p>
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
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
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
             * <p>The public network access configuration.</p>
             */
            public Builder internet(Internet internet) {
                this.internet = internet;
                return this;
            }

            /**
             * <p>The user VPC configuration.</p>
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
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentLoop")
        private AgentLoop agentLoop;

        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        private Config(Builder builder) {
            this.agentLoop = builder.agentLoop;
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return agentLoop
         */
        public AgentLoop getAgentLoop() {
            return this.agentLoop;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private AgentLoop agentLoop; 
            private Network network; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.agentLoop = model.agentLoop;
                this.network = model.network;
            } 

            /**
             * <p>The AgentLoop plug-in configuration.</p>
             */
            public Builder agentLoop(AgentLoop agentLoop) {
                this.agentLoop = agentLoop;
                return this;
            }

            /**
             * <p>The network configuration of the plug-in, including public network access configuration and VPC configuration.</p>
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
     * {@link GetWorkspacePluginResponseBody} extends {@link TeaModel}
     *
     * <p>GetWorkspacePluginResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("pluginName")
        private String pluginName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.config = builder.config;
            this.enabled = builder.enabled;
            this.pluginName = builder.pluginName;
            this.status = builder.status;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return pluginName
         */
        public String getPluginName() {
            return this.pluginName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Config config; 
            private Boolean enabled; 
            private String pluginName; 
            private String status; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.config = model.config;
                this.enabled = model.enabled;
                this.pluginName = model.pluginName;
                this.status = model.status;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The user-configurable properties currently in effect for the plug-in. This field is empty if the plug-in is not installed.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Indicates whether the plug-in is enabled. The value is true when the status is ENABLED.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The plug-in name.</p>
             * 
             * <strong>example:</strong>
             * <p>collaboration</p>
             */
            public Builder pluginName(String pluginName) {
                this.pluginName = pluginName;
                return this;
            }

            /**
             * <p>The plug-in status. Valid values: DISABLED, ENABLING, ENABLED, ENABLE_FAILED, DISABLING, DISABLE_FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ws-123456</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
