// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Agent} extends {@link TeaModel}
 *
 * <p>Agent</p>
 */
public class Agent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("McpServerId")
    private String mcpServerId;

    @com.aliyun.core.annotation.NameInMap("McpServerName")
    private String mcpServerName;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private Long updatedAt;

    private Agent(Builder builder) {
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.mcpServerId = builder.mcpServerId;
        this.mcpServerName = builder.mcpServerName;
        this.metadata = builder.metadata;
        this.name = builder.name;
        this.prompt = builder.prompt;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Agent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return mcpServerId
     */
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    /**
     * @return mcpServerName
     */
    public String getMcpServerName() {
        return this.mcpServerName;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private Long createdAt; 
        private String description; 
        private String mcpServerId; 
        private String mcpServerName; 
        private Metadata metadata; 
        private String name; 
        private String prompt; 
        private Long updatedAt; 

        private Builder() {
        } 

        private Builder(Agent model) {
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.mcpServerId = model.mcpServerId;
            this.mcpServerName = model.mcpServerName;
            this.metadata = model.metadata;
            this.name = model.name;
            this.prompt = model.prompt;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * <p>The creation time in UNIX milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717200000000</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>IoT device data query agent</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the MCP server associated with the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>8vHW4mDRxxxxx</p>
         */
        public Builder mcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }

        /**
         * <p>The name of the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>data-analyze-agent</p>
         */
        public Builder mcpServerName(String mcpServerName) {
            this.mcpServerName = mcpServerName;
            return this;
        }

        /**
         * <p>The associated table metadata.</p>
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The custom prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>You are an IoT data analytics assistant...</p>
         */
        public Builder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The update time in UNIX milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717200000000</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Agent build() {
            return new Agent(this);
        } 

    } 

}
