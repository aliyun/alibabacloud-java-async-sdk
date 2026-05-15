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
 * {@link AgentResource} extends {@link TeaModel}
 *
 * <p>AgentResource</p>
 */
public class AgentResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("flow")
    private Flow flow;

    @com.aliyun.core.annotation.NameInMap("latestVersion")
    private LatestVersion latestVersion;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("runtime")
    private AgentRuntime runtime;

    private AgentResource(Builder builder) {
        this.flow = builder.flow;
        this.latestVersion = builder.latestVersion;
        this.resourceType = builder.resourceType;
        this.runtime = builder.runtime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentResource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flow
     */
    public Flow getFlow() {
        return this.flow;
    }

    /**
     * @return latestVersion
     */
    public LatestVersion getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return runtime
     */
    public AgentRuntime getRuntime() {
        return this.runtime;
    }

    public static final class Builder {
        private Flow flow; 
        private LatestVersion latestVersion; 
        private String resourceType; 
        private AgentRuntime runtime; 

        private Builder() {
        } 

        private Builder(AgentResource model) {
            this.flow = model.flow;
            this.latestVersion = model.latestVersion;
            this.resourceType = model.resourceType;
            this.runtime = model.runtime;
        } 

        /**
         * <p>当 resourceType 为 Flow 时，此字段包含完整的工作流对象，包括所有配置和状态信息；当 resourceType 为 AgentRuntime 时，此字段为空</p>
         */
        public Builder flow(Flow flow) {
            this.flow = flow;
            return this;
        }

        /**
         * <p>资源的最新发布版本摘要，包含版本号、描述和创建时间。如果资源没有已发布版本，则此字段为空</p>
         */
        public Builder latestVersion(LatestVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>资源类型标识符，用于区分资源是智能体运行时（AgentRuntime）还是工作流（Flow）</p>
         * 
         * <strong>example:</strong>
         * <p>AgentRuntime</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>当 resourceType 为 AgentRuntime 时，此字段包含完整的智能体运行时对象，包括所有配置和状态信息；当 resourceType 为 Flow 时，此字段为空</p>
         */
        public Builder runtime(AgentRuntime runtime) {
            this.runtime = runtime;
            return this;
        }

        public AgentResource build() {
            return new AgentResource(this);
        } 

    } 

    /**
     * 
     * {@link AgentResource} extends {@link TeaModel}
     *
     * <p>AgentResource</p>
     */
    public static class LatestVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("publisher")
        private String publisher;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private LatestVersion(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.publisher = builder.publisher;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestVersion create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private String publisher; 
            private String version; 

            private Builder() {
            } 

            private Builder(LatestVersion model) {
                this.createdAt = model.createdAt;
                this.description = model.description;
                this.publisher = model.publisher;
                this.version = model.version;
            } 

            /**
             * <p>版本发布时间，采用ISO 8601格式</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-15T08:30:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>该版本的描述信息</p>
             * 
             * <strong>example:</strong>
             * <p>修复了消息处理的并发问题</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>版本发布者（仅 AgentRuntime 类型资源返回）</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * <p>最新发布的版本号</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public LatestVersion build() {
                return new LatestVersion(this);
            } 

        } 

    }
}
