// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link BatchConfigRuntimeChannelRequest} extends {@link RequestModel}
 *
 * <p>BatchConfigRuntimeChannelRequest</p>
 */
public class BatchConfigRuntimeChannelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentPlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ChannelConfigs> channelConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    private BatchConfigRuntimeChannelRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.channelConfigs = builder.channelConfigs;
        this.runtimeType = builder.runtimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchConfigRuntimeChannelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return channelConfigs
     */
    public java.util.List<ChannelConfigs> getChannelConfigs() {
        return this.channelConfigs;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public static final class Builder extends Request.Builder<BatchConfigRuntimeChannelRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private java.util.List<ChannelConfigs> channelConfigs; 
        private String runtimeType; 

        private Builder() {
            super();
        } 

        private Builder(BatchConfigRuntimeChannelRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.channelConfigs = request.channelConfigs;
            this.runtimeType = request.runtimeType;
        } 

        /**
         * <p>The agent platform, such as ENTERPRISE. If the value is invalid, the error code InvalidParameter.AgentPlatform is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putBodyParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider.</p>
         * <ul>
         * <li>JVS Computer: Enter OpenClaw.</li>
         * <li>OpenClaw: Enter OpenClaw.</li>
         * <li>Hermes Agent: Enter HermesAgent.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putBodyParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>The list of channel configurations. A maximum of 200 configurations are supported. Each configuration item specifies an agent runtime and the third-party channel to be configured for it. Different channel configurations can be delivered to different runtimes. Multiple configuration items for the same runtime are processed sequentially.</p>
         * <p>This parameter is required.</p>
         */
        public Builder channelConfigs(java.util.List<ChannelConfigs> channelConfigs) {
            this.putBodyParameter("ChannelConfigs", channelConfigs);
            this.channelConfigs = channelConfigs;
            return this;
        }

        /**
         * <p>The agent runtime type, such as CloudDesktop (cloud desktop).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putBodyParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        @Override
        public BatchConfigRuntimeChannelRequest build() {
            return new BatchConfigRuntimeChannelRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchConfigRuntimeChannelRequest} extends {@link TeaModel}
     *
     * <p>BatchConfigRuntimeChannelRequest</p>
     */
    public static class ChannelConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Config")
        @com.aliyun.core.annotation.Validation(required = true)
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConfigMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String configMode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String runtimeId;

        private ChannelConfigs(Builder builder) {
            this.code = builder.code;
            this.config = builder.config;
            this.configMode = builder.configMode;
            this.name = builder.name;
            this.runtimeId = builder.runtimeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelConfigs create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return configMode
         */
        public String getConfigMode() {
            return this.configMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public static final class Builder {
            private String code; 
            private String config; 
            private String configMode; 
            private String name; 
            private String runtimeId; 

            private Builder() {
            } 

            private Builder(ChannelConfigs model) {
                this.code = model.code;
                this.config = model.config;
                this.configMode = model.configMode;
                this.name = model.name;
                this.runtimeId = model.runtimeId;
            } 

            /**
             * <p>The third-party channel code, such as dingtalk-connector (DingTalk), feishu (Lark), and wecom (WeCom). System channel codes are not case-sensitive. Configuring wechat and jvsclaw is not supported. If these values are passed, the entire request fails and the error code ChannelConfig.NotSupported is returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk-connector</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The JSON string for the channel configuration.</p>
             * <ul>
             * <li>Simple mode: only appKey and appSecret are allowed.</li>
             * <li>Custom mode: all configuration items required for the channel under the current agent provider must be included.</li>
             * </ul>
             * <p>If the string is not valid JSON, the error code InvalidParameter.ValueInvalid is returned.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;appKey&quot;:&quot;testKey&quot;,&quot;appSecret&quot;:&quot;testSecret&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration mode. Valid values:</p>
             * <ul>
             * <li>Simple: the simple configuration mode.</li>
             * <li>Custom: the custom configuration mode.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * <p>The channel name.</p>
             * <p>If this parameter is not specified, the system automatically uses the code as the name.</p>
             * 
             * <strong>example:</strong>
             * <p>DingTalk</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The agent runtime ID. The ID mappings are as follows:</p>
             * <ul>
             * <li>JVS Computer: the JVS Computer ID, in the format of jvs-xxxx.</li>
             * <li>OpenClaw: the cloud desktop ID, in the format of ecd-xxxx.</li>
             * <li>Hermes Agent: the Hermes Agent ID, in the format of jvs-xxxx.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xgads</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            public ChannelConfigs build() {
                return new ChannelConfigs(this);
            } 

        } 

    }
}
