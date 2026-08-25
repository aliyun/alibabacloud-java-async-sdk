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
 * {@link ListNodePoolComponentInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodePoolComponentInstancesResponseBody</p>
 */
public class ListNodePoolComponentInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("component_instances")
    private java.util.List<ComponentInstances> componentInstances;

    @com.aliyun.core.annotation.NameInMap("max_results")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    private ListNodePoolComponentInstancesResponseBody(Builder builder) {
        this.componentInstances = builder.componentInstances;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePoolComponentInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentInstances
     */
    public java.util.List<ComponentInstances> getComponentInstances() {
        return this.componentInstances;
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

    public static final class Builder {
        private java.util.List<ComponentInstances> componentInstances; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListNodePoolComponentInstancesResponseBody model) {
            this.componentInstances = model.componentInstances;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
        } 

        /**
         * component_instances.
         */
        public Builder componentInstances(java.util.List<ComponentInstances> componentInstances) {
            this.componentInstances = componentInstances;
            return this;
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

        public ListNodePoolComponentInstancesResponseBody build() {
            return new ListNodePoolComponentInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodePoolComponentInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstancesResponseBody</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Envs(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodePoolComponentInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstancesResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("custom_config")
        private java.util.Map<String, ?> customConfig;

        @com.aliyun.core.annotation.NameInMap("envs")
        private java.util.List<Envs> envs;

        private Config(Builder builder) {
            this.customConfig = builder.customConfig;
            this.envs = builder.envs;
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

        /**
         * @return envs
         */
        public java.util.List<Envs> getEnvs() {
            return this.envs;
        }

        public static final class Builder {
            private java.util.Map<String, ?> customConfig; 
            private java.util.List<Envs> envs; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.customConfig = model.customConfig;
                this.envs = model.envs;
            } 

            /**
             * custom_config.
             */
            public Builder customConfig(java.util.Map<String, ?> customConfig) {
                this.customConfig = customConfig;
                return this;
            }

            /**
             * envs.
             */
            public Builder envs(java.util.List<Envs> envs) {
                this.envs = envs;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodePoolComponentInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentInstancesResponseBody</p>
     */
    public static class ComponentInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("config_revision")
        private String configRevision;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ComponentInstances(Builder builder) {
            this.config = builder.config;
            this.configRevision = builder.configRevision;
            this.name = builder.name;
            this.state = builder.state;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInstances create() {
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
         * @return state
         */
        public String getState() {
            return this.state;
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
            private String state; 
            private String version; 

            private Builder() {
            } 

            private Builder(ComponentInstances model) {
                this.config = model.config;
                this.configRevision = model.configRevision;
                this.name = model.name;
                this.state = model.state;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ComponentInstances build() {
                return new ComponentInstances(this);
            } 

        } 

    }
}
