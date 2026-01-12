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
 * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterAddonInstancesResponseBody</p>
 */
public class ListClusterAddonInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterAddonInstancesResponseBody(Builder builder) {
        this.addons = builder.addons;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAddonInstancesResponseBody create() {
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

        private Builder(ListClusterAddonInstancesResponseBody model) {
            this.addons = model.addons;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of addon information.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            this.addons = addons;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterAddonInstancesResponseBody build() {
            return new ListClusterAddonInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAddonInstancesResponseBody</p>
     */
    public static class ConfigSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigVersion")
        private String configVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

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
        public String getParams() {
            return this.params;
        }

        public static final class Builder {
            private String appVersion; 
            private String configVersion; 
            private String name; 
            private String params; 

            private Builder() {
            } 

            private Builder(ConfigSchema model) {
                this.appVersion = model.appVersion;
                this.configVersion = model.configVersion;
                this.name = model.name;
                this.params = model.params;
            } 

            /**
             * <p>Application version.</p>
             * 
             * <strong>example:</strong>
             * <p>7380581386597434629002</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>Configuration version.</p>
             * 
             * <strong>example:</strong>
             * <p>4572581386436834662215</p>
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * <p>Component name.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Custom parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;: &quot;val1&quot;}</p>
             */
            public Builder params(String params) {
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
     * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAddonInstancesResponseBody</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanupCloudResources")
        private Boolean cleanupCloudResources;

        @com.aliyun.core.annotation.NameInMap("ConfigSchema")
        private java.util.List<ConfigSchema> configSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Addons(Builder builder) {
            this.cleanupCloudResources = builder.cleanupCloudResources;
            this.configSchema = builder.configSchema;
            this.name = builder.name;
            this.status = builder.status;
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
        public Boolean getCleanupCloudResources() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean cleanupCloudResources; 
            private java.util.List<ConfigSchema> configSchema; 
            private String name; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.cleanupCloudResources = model.cleanupCloudResources;
                this.configSchema = model.configSchema;
                this.name = model.name;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>Whether to automatically clean up associated cloud resources.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cleanupCloudResources(Boolean cleanupCloudResources) {
                this.cleanupCloudResources = cleanupCloudResources;
                return this;
            }

            /**
             * <p>List of custom parameter schemas for the addon.</p>
             */
            public Builder configSchema(java.util.List<ConfigSchema> configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * <p>Addon name.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Current addon status. Values:</p>
             * <ul>
             * <li><strong>enabling</strong>: Enabling.</li>
             * <li><strong>enabled</strong>: Enabled.</li>
             * <li><strong>disabling</strong>: Disabling.</li>
             * <li><strong>disabled</strong>: Disabled.</li>
             * <li><strong>upgrading</strong>: Upgrading.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Version number.</p>
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
