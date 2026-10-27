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
 * {@link ListNodePoolComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodePoolComponentsResponseBody</p>
 */
public class ListNodePoolComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("max_results")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    private ListNodePoolComponentsResponseBody(Builder builder) {
        this.components = builder.components;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePoolComponentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
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
        private java.util.List<Components> components; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListNodePoolComponentsResponseBody model) {
            this.components = model.components;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
        } 

        /**
         * <p>The node components.</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The maximum number of results per page. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>5c0a1c0f91c14c6****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListNodePoolComponentsResponseBody build() {
            return new ListNodePoolComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodePoolComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodePoolComponentsResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config_schema")
        private String configSchema;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Components(Builder builder) {
            this.configSchema = builder.configSchema;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return configSchema
         */
        public String getConfigSchema() {
            return this.configSchema;
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
            private String configSchema; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.configSchema = model.configSchema;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The parameter schema of the node component, including custom parameters and system parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;$schema\&quot;: \&quot;\&quot;,\&quot;properties\&quot;: {}&quot;</p>
             */
            public Builder configSchema(String configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * <p>The name of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>kubelet</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the node component.</p>
             * 
             * <strong>example:</strong>
             * <p>1.28.9-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
