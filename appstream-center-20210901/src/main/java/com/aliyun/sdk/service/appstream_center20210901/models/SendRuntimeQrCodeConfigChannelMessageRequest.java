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
 * {@link SendRuntimeQrCodeConfigChannelMessageRequest} extends {@link RequestModel}
 *
 * <p>SendRuntimeQrCodeConfigChannelMessageRequest</p>
 */
public class SendRuntimeQrCodeConfigChannelMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentPlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> runtimeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    private SendRuntimeQrCodeConfigChannelMessageRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.code = builder.code;
        this.runtimeIds = builder.runtimeIds;
        this.runtimeType = builder.runtimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRuntimeQrCodeConfigChannelMessageRequest create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return runtimeIds
     */
    public java.util.List<String> getRuntimeIds() {
        return this.runtimeIds;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public static final class Builder extends Request.Builder<SendRuntimeQrCodeConfigChannelMessageRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private String code; 
        private java.util.List<String> runtimeIds; 
        private String runtimeType; 

        private Builder() {
            super();
        } 

        private Builder(SendRuntimeQrCodeConfigChannelMessageRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.code = request.code;
            this.runtimeIds = request.runtimeIds;
            this.runtimeType = request.runtimeType;
        } 

        /**
         * <p>The agent platform type.</p>
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
         * <p>The third-party channel code, such as dingtalk-connector (DingTalk), feishu (Lark), or wecom (WeCom). If the current agent platform and provider do not support the channel, the error code ChannelConfig.NotSupported is returned, and no messages are sent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * <p>The IDs of the runtime resources, such as cloud desktop IDs. You can specify 1 to 200 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder runtimeIds(java.util.List<String> runtimeIds) {
            this.putBodyParameter("RuntimeIds", runtimeIds);
            this.runtimeIds = runtimeIds;
            return this;
        }

        /**
         * <p>The runtime environment type of the runtime resource. Currently, only CloudDesktop is supported.</p>
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
        public SendRuntimeQrCodeConfigChannelMessageRequest build() {
            return new SendRuntimeQrCodeConfigChannelMessageRequest(this);
        } 

    } 

}
