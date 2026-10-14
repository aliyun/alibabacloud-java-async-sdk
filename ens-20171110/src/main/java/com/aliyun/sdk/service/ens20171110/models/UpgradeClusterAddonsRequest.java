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
 * {@link UpgradeClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterAddonsRequest</p>
 */
public class UpgradeClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private UpgradeClusterAddonsRequest(Builder builder) {
        super(builder);
        this.addons = builder.addons;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterAddonsRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeClusterAddonsRequest, Builder> {
        private java.util.List<Addons> addons; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterAddonsRequest request) {
            super(request);
            this.addons = request.addons;
            this.clusterId = request.clusterId;
        } 

        /**
         * <p>The component information.</p>
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
         * <p>eck-xxxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UpgradeClusterAddonsRequest build() {
            return new UpgradeClusterAddonsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>UpgradeClusterAddonsRequest</p>
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
             * <p>4155709cd12a09bdb8cbaca71bf03233</p>
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
             * <p>The custom parameters for the component.</p>
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
     * {@link UpgradeClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>UpgradeClusterAddonsRequest</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSchema")
        private java.util.List<ConfigSchema> configSchema;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextVersion")
        private String nextVersion;

        private Addons(Builder builder) {
            this.configSchema = builder.configSchema;
            this.name = builder.name;
            this.nextVersion = builder.nextVersion;
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
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
        }

        public static final class Builder {
            private java.util.List<ConfigSchema> configSchema; 
            private String name; 
            private String nextVersion; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.configSchema = model.configSchema;
                this.name = model.name;
                this.nextVersion = model.nextVersion;
            } 

            /**
             * <p>The schema of the custom parameters for the component.</p>
             */
            public Builder configSchema(java.util.List<ConfigSchema> configSchema) {
                this.configSchema = configSchema;
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
             * <p>The target version for the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
