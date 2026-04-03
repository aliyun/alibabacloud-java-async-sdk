// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link IMBotMetadata} extends {@link TeaModel}
 *
 * <p>IMBotMetadata</p>
 */
public class IMBotMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointId")
    private String agentRuntimeEndpointId;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointUrl")
    private String agentRuntimeEndpointUrl;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    private String agentRuntimeId;

    @com.aliyun.core.annotation.NameInMap("customFunctionMeta")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String customFunctionMeta;

    @com.aliyun.core.annotation.NameInMap("protocolType")
    private String protocolType;

    @com.aliyun.core.annotation.NameInMap("role")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String role;

    private IMBotMetadata(Builder builder) {
        this.agentRuntimeEndpointId = builder.agentRuntimeEndpointId;
        this.agentRuntimeEndpointUrl = builder.agentRuntimeEndpointUrl;
        this.agentRuntimeId = builder.agentRuntimeId;
        this.customFunctionMeta = builder.customFunctionMeta;
        this.protocolType = builder.protocolType;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IMBotMetadata create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeEndpointId
     */
    public String getAgentRuntimeEndpointId() {
        return this.agentRuntimeEndpointId;
    }

    /**
     * @return agentRuntimeEndpointUrl
     */
    public String getAgentRuntimeEndpointUrl() {
        return this.agentRuntimeEndpointUrl;
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return customFunctionMeta
     */
    public String getCustomFunctionMeta() {
        return this.customFunctionMeta;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    public static final class Builder {
        private String agentRuntimeEndpointId; 
        private String agentRuntimeEndpointUrl; 
        private String agentRuntimeId; 
        private String customFunctionMeta; 
        private String protocolType; 
        private String role; 

        private Builder() {
        } 

        private Builder(IMBotMetadata model) {
            this.agentRuntimeEndpointId = model.agentRuntimeEndpointId;
            this.agentRuntimeEndpointUrl = model.agentRuntimeEndpointUrl;
            this.agentRuntimeId = model.agentRuntimeId;
            this.customFunctionMeta = model.customFunctionMeta;
            this.protocolType = model.protocolType;
            this.role = model.role;
        } 

        /**
         * <p>可选</p>
         */
        public Builder agentRuntimeEndpointId(String agentRuntimeEndpointId) {
            this.agentRuntimeEndpointId = agentRuntimeEndpointId;
            return this;
        }

        /**
         * <p>标准模式下必填：下游 Agent 可调用的 URL；custom 模式可省略</p>
         */
        public Builder agentRuntimeEndpointUrl(String agentRuntimeEndpointUrl) {
            this.agentRuntimeEndpointUrl = agentRuntimeEndpointUrl;
            return this;
        }

        /**
         * <p>绑定的 Agent Runtime UUID</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * <p>自定义函数元信息；可选；与后端 IMBotMetadata 持久化字段一致</p>
         */
        public Builder customFunctionMeta(String customFunctionMeta) {
            this.customFunctionMeta = customFunctionMeta;
            return this;
        }

        /**
         * <p>标准模式下必填，与 ValidateAgentRuntimeProtocolTypeValue 一致（大小写敏感）；custom 模式可省略</p>
         */
        public Builder protocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }

        /**
         * <p>不写入单 Bot 持久化 JSON；用于首次/更新时设置租户级 FC RAM 执行角色 ARN（acs:ram::...）；FC 启用且非 custom 时按服务逻辑校验</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public IMBotMetadata build() {
            return new IMBotMetadata(this);
        } 

    } 

}
