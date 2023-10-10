// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonMetadataResponseBody</p>
 */
public class DescribeClusterAddonMetadataResponseBody extends TeaModel {
    @NameInMap("config_schema")
    private String configSchema;

    @NameInMap("name")
    private String name;

    @NameInMap("version")
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
         * The component schema parameters.
         */
        public Builder configSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }

        /**
         * The component name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The component version.
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
