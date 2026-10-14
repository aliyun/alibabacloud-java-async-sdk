// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeAddonResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonResponseBody</p>
 */
public class DescribeAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAddonResponseBody(Builder builder) {
        this.addons = builder.addons;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addons
     */
    public java.util.List<Addons> getAddons() {
        return this.addons;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Addons> addons; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAddonResponseBody model) {
            this.addons = model.addons;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The add-on information.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            this.addons = addons;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAddonResponseBody build() {
            return new DescribeAddonResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAddonResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonResponseBody</p>
     */
    public static class ConfigSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigVersion")
        private String configVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private Object params;

        private ConfigSchema(Builder builder) {
            this.appVersion = builder.appVersion;
            this.configVersion = builder.configVersion;
            this.name = builder.name;
            this.params = builder.params;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSchema create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return configVersion
         */
        public String getConfigVersion() {
            return this.configVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public Object getParams() {
            return this.params;
        }

        public static final class Builder {
            private String appVersion; 
            private String configVersion; 
            private String name; 
            private Object params; 

            private Builder() {
            } 

            private Builder(ConfigSchema model) {
                this.appVersion = model.appVersion;
                this.configVersion = model.configVersion;
                this.name = model.name;
                this.params = model.params;
            } 

            /**
             * <p>The application version.</p>
             * 
             * <strong>example:</strong>
             * <p>859e9d595b2974ed79c444658d1dea89</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>4155709cd12a09bdb8cbaca71bf03233</p>
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom parameters of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;:&quot;val1&quot;}</p>
             */
            public Builder params(Object params) {
                this.params = params;
                return this;
            }

            public ConfigSchema build() {
                return new ConfigSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAddonResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAddonResponseBody</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanupCloudResources")
        private String cleanupCloudResources;

        @com.aliyun.core.annotation.NameInMap("ConfigSchema")
        private java.util.List<ConfigSchema> configSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Addons(Builder builder) {
            this.cleanupCloudResources = builder.cleanupCloudResources;
            this.configSchema = builder.configSchema;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return cleanupCloudResources
         */
        public String getCleanupCloudResources() {
            return this.cleanupCloudResources;
        }

        /**
         * @return configSchema
         */
        public java.util.List<ConfigSchema> getConfigSchema() {
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
            private String cleanupCloudResources; 
            private java.util.List<ConfigSchema> configSchema; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.cleanupCloudResources = model.cleanupCloudResources;
                this.configSchema = model.configSchema;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>Indicates whether associated cloud resources are automatically cleaned up.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cleanupCloudResources(String cleanupCloudResources) {
                this.cleanupCloudResources = cleanupCloudResources;
                return this;
            }

            /**
             * <p>The schema of custom parameters for the add-on.</p>
             */
            public Builder configSchema(java.util.List<ConfigSchema> configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * <p>The name of the add-on.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The add-on version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
