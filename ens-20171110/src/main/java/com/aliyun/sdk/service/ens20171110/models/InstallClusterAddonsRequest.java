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
 * {@link InstallClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>InstallClusterAddonsRequest</p>
 */
public class InstallClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addons")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private InstallClusterAddonsRequest(Builder builder) {
        super(builder);
        this.addons = builder.addons;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallClusterAddonsRequest create() {
        return builder().build();
    }

@Override
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<InstallClusterAddonsRequest, Builder> {
        private java.util.List<Addons> addons; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(InstallClusterAddonsRequest request) {
            super(request);
            this.addons = request.addons;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The component information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            String addonsShrink = shrink(addons, "Addons", "json");
            this.putQueryParameter("Addons", addonsShrink);
            this.addons = addons;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public InstallClusterAddonsRequest build() {
            return new InstallClusterAddonsRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>InstallClusterAddonsRequest</p>
     */
    public static class ConfigSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ConfigVersion")
        private String configVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.Map<String, ?> params;

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
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public static final class Builder {
            private String appVersion; 
            private String configVersion; 
            private String name; 
            private java.util.Map<String, ?> params; 

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
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom parameters of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
             */
            public Builder params(java.util.Map<String, ?> params) {
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
     * {@link InstallClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>InstallClusterAddonsRequest</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSchema")
        private java.util.List<ConfigSchema> configSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Addons(Builder builder) {
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
            private java.util.List<ConfigSchema> configSchema; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.configSchema = model.configSchema;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The schema for the custom parameters of the component.</p>
             */
            public Builder configSchema(java.util.List<ConfigSchema> configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * <p>The plug-in name.</p>
             * 
             * <strong>example:</strong>
             * <p>edge-csi-lite</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version number.</p>
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
