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
 * {@link DescribeClusterAddonMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonMetadataResponseBody</p>
 */
public class DescribeClusterAddonMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config_schema")
    private String configSchema;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private DescribeClusterAddonMetadataResponseBody(Builder builder) {
        this.configSchema = builder.configSchema;
        this.name = builder.name;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonMetadataResponseBody create() {
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

        /**
         * <p>The component schema parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  &quot;$schema&quot;: &quot;<a href="https://json-schema.org/draft-07/schema#%5C%22,%5Cn">https://json-schema.org/draft-07/schema#\&quot;,\n</a>  &quot;properties&quot;: {\n    &quot;controller&quot;: {\n      &quot;description&quot;: &quot;&quot;,\n      &quot;properties&quot;: {\n        &quot;resources&quot;: {\n          &quot;properties&quot;: {\n            &quot;armsPrometheusOperator&quot;: {\n              &quot;properties&quot;: {\n                &quot;resources&quot;: {\n                  &quot;properties&quot;: {\n                    &quot;limits&quot;: {\n                      &quot;properties&quot;: {\n                        &quot;memory&quot;: {\n                          &quot;description&quot;: &quot;memory limit of arms prometheus operator&quot;,\n                          &quot;type&quot;: &quot;string&quot;,\n                          &quot;pattern&quot;: &quot;^[1-9][0-9]<em>(\\.\\d+)?(K|Ki|M|Mi|G|Gi|T|Ti)?$&quot;,\n                          &quot;default&quot;: &quot;500m&quot;,\n                          &quot;x-ui-description&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-prompt-message&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-validation-message&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-additional-tips&quot;: &quot;<mds-key>&quot;\n                        },\n                        &quot;cpu&quot;: {\n                          &quot;description&quot;: &quot;cpu limit of arms prometheus operator&quot;,\n                          &quot;type&quot;: &quot;string&quot;,\n                          &quot;pattern&quot;: &quot;^[1-9][0-9]</em>(m|\\.\\d+)?$&quot;,\n                          &quot;default&quot;: &quot;1.0&quot;,\n                          &quot;x-ui-description&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-validation-message&quot;: &quot;<mds-key>&quot;\n                        }\n                      },\n                      &quot;type&quot;: &quot;object&quot;,\n                      &quot;additionalProperties&quot;: false\n                    },\n                    &quot;requests&quot;: {\n                      &quot;properties&quot;: {\n                        &quot;memory&quot;: {\n                          &quot;description&quot;: &quot;memory request of arms prometheus operator&quot;,\n                          &quot;type&quot;: &quot;string&quot;,\n                          &quot;pattern&quot;: &quot;^[1-9][0-9]<em>(\\.\\d+)?(K|Ki|M|Mi|G|Gi|T|Ti)?$&quot;,\n                          &quot;default&quot;: &quot;500m&quot;,\n                          &quot;x-ui-description&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-validation-message&quot;: &quot;<mds-key>&quot;\n                        },\n                        &quot;cpu&quot;: {\n                          &quot;description&quot;: &quot;cpu request of arms prometheus operator&quot;,\n                          &quot;type&quot;: &quot;string&quot;,\n                          &quot;pattern&quot;: &quot;^[1-9][0-9]</em>(m|\\.\\d+)?$&quot;,\n                          &quot;default&quot;: &quot;1.0&quot;,\n                          &quot;x-ui-description&quot;: &quot;<mds-key>&quot;,\n                          &quot;x-ui-validation-message&quot;: &quot;<mds-key>&quot;\n                        }\n                      },\n                      &quot;type&quot;: &quot;object&quot;,\n                      &quot;additionalProperties&quot;: false\n                    }\n                  },\n                  &quot;type&quot;: &quot;object&quot;,\n                  &quot;additionalProperties&quot;: false\n                }\n              },\n              &quot;type&quot;: &quot;object&quot;,\n              &quot;additionalProperties&quot;: false\n            }\n          },\n          &quot;type&quot;: &quot;object&quot;,\n          &quot;additionalProperties&quot;: false\n        }\n      },\n      &quot;type&quot;: &quot;object&quot;,\n      &quot;additionalProperties&quot;: false\n    }\n  },\n  &quot;title&quot;: &quot;Values&quot;,\n  &quot;type&quot;: &quot;object&quot;,\n  &quot;additionalProperties&quot;: false\n}</p>
         */
        public Builder configSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }

        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8.4.1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeClusterAddonMetadataResponseBody build() {
            return new DescribeClusterAddonMetadataResponseBody(this);
        } 

    } 

}
