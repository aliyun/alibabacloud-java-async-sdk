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
 * {@link AgentRuntimeVersion} extends {@link TeaModel}
 *
 * <p>AgentRuntimeVersion</p>
 */
public class AgentRuntimeVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeArn")
    private String agentRuntimeArn;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    private String agentRuntimeId;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeName")
    private String agentRuntimeName;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeVersion")
    private String agentRuntimeVersion;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    private AgentRuntimeVersion(Builder builder) {
        this.agentRuntimeArn = builder.agentRuntimeArn;
        this.agentRuntimeId = builder.agentRuntimeId;
        this.agentRuntimeName = builder.agentRuntimeName;
        this.agentRuntimeVersion = builder.agentRuntimeVersion;
        this.description = builder.description;
        this.lastUpdatedAt = builder.lastUpdatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentRuntimeVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeArn
     */
    public String getAgentRuntimeArn() {
        return this.agentRuntimeArn;
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return agentRuntimeName
     */
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    /**
     * @return agentRuntimeVersion
     */
    public String getAgentRuntimeVersion() {
        return this.agentRuntimeVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public static final class Builder {
        private String agentRuntimeArn; 
        private String agentRuntimeId; 
        private String agentRuntimeName; 
        private String agentRuntimeVersion; 
        private String description; 
        private String lastUpdatedAt; 

        private Builder() {
        } 

        private Builder(AgentRuntimeVersion model) {
            this.agentRuntimeArn = model.agentRuntimeArn;
            this.agentRuntimeId = model.agentRuntimeId;
            this.agentRuntimeName = model.agentRuntimeName;
            this.agentRuntimeVersion = model.agentRuntimeVersion;
            this.description = model.description;
            this.lastUpdatedAt = model.lastUpdatedAt;
        } 

        /**
         * <p>智能体运行时的ARN</p>
         */
        public Builder agentRuntimeArn(String agentRuntimeArn) {
            this.agentRuntimeArn = agentRuntimeArn;
            return this;
        }

        /**
         * <p>智能体运行时的ID</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * <p>智能体运行时的名称</p>
         */
        public Builder agentRuntimeName(String agentRuntimeName) {
            this.agentRuntimeName = agentRuntimeName;
            return this;
        }

        /**
         * <p>已发布版本的版本号</p>
         */
        public Builder agentRuntimeVersion(String agentRuntimeVersion) {
            this.agentRuntimeVersion = agentRuntimeVersion;
            return this;
        }

        /**
         * <p>此版本的描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>最后更新的时间戳</p>
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        public AgentRuntimeVersion build() {
            return new AgentRuntimeVersion(this);
        } 

    } 

}
