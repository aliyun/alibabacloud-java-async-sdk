// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListNodePoolComponentInstanceNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodePoolComponentInstanceNodesResponseBody</p>
 */
public class ListNodePoolComponentInstanceNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("max_results")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("node_list")
    private java.util.List<NodeList> nodeList;

    @com.aliyun.core.annotation.NameInMap("total_count")
    private Integer totalCount;

    private ListNodePoolComponentInstanceNodesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeList = builder.nodeList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePoolComponentInstanceNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeList
     */
    public java.util.List<NodeList> getNodeList() {
        return this.nodeList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NodeList> nodeList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNodePoolComponentInstanceNodesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nodeList = model.nodeList;
            this.totalCount = model.totalCount;
        } 

        /**
         * max_results.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * next_token.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * node_list.
         */
        public Builder nodeList(java.util.List<NodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }

        /**
         * total_count.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNodePoolComponentInstanceNodesResponseBody build() {
            return new ListNodePoolComponentInstanceNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodePoolComponentInstanceNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstanceNodesResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("custom_config")
        private java.util.Map<String, ?> customConfig;

        private Config(Builder builder) {
            this.customConfig = builder.customConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return customConfig
         */
        public java.util.Map<String, ?> getCustomConfig() {
            return this.customConfig;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customConfig; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
            } 

            /**
             * custom_config.
             */
            public Builder customConfig(java.util.Map<String, ?> customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodePoolComponentInstanceNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstanceNodesResponseBody</p>
     */
    public static class Component extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("config_revision")
        private String configRevision;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Component(Builder builder) {
            this.config = builder.config;
            this.configRevision = builder.configRevision;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return configRevision
         */
        public String getConfigRevision() {
            return this.configRevision;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Config config; 
            private String configRevision; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Component model) {
                this.config = model.config;
                this.configRevision = model.configRevision;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * config_revision.
             */
            public Builder configRevision(String configRevision) {
                this.configRevision = configRevision;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodePoolComponentInstanceNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstanceNodesResponseBody</p>
     */
    public static class NodeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("component")
        private Component component;

        @com.aliyun.core.annotation.NameInMap("instance_id")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("node_name")
        private String nodeName;

        private NodeList(Builder builder) {
            this.component = builder.component;
            this.instanceId = builder.instanceId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeList create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public Component getComponent() {
            return this.component;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private Component component; 
            private String instanceId; 
            private String nodeName; 

            private Builder() {
            } 

            private Builder(NodeList model) {
                this.component = model.component;
                this.instanceId = model.instanceId;
                this.nodeName = model.nodeName;
            } 

            /**
             * component.
             */
            public Builder component(Component component) {
                this.component = component;
                return this;
            }

            /**
             * instance_id.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * node_name.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public NodeList build() {
                return new NodeList(this);
            } 

        } 

    }
}
