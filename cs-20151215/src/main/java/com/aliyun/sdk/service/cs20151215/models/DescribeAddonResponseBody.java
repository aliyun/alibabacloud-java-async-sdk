// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonResponseBody</p>
 */
public class DescribeAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("architecture")
    private java.util.List < String > architecture;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("config_schema")
    private String configSchema;

    @com.aliyun.core.annotation.NameInMap("install_by_default")
    private Boolean installByDefault;

    @com.aliyun.core.annotation.NameInMap("managed")
    private Boolean managed;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("newer_versions")
    private java.util.List < NewerVersions> newerVersions;

    @com.aliyun.core.annotation.NameInMap("supported_actions")
    private java.util.List < String > supportedActions;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private DescribeAddonResponseBody(Builder builder) {
        this.architecture = builder.architecture;
        this.category = builder.category;
        this.configSchema = builder.configSchema;
        this.installByDefault = builder.installByDefault;
        this.managed = builder.managed;
        this.name = builder.name;
        this.newerVersions = builder.newerVersions;
        this.supportedActions = builder.supportedActions;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonResponseBody create() {
        return builder().build();
    }

    /**
     * @return architecture
     */
    public java.util.List < String > getArchitecture() {
        return this.architecture;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return configSchema
     */
    public String getConfigSchema() {
        return this.configSchema;
    }

    /**
     * @return installByDefault
     */
    public Boolean getInstallByDefault() {
        return this.installByDefault;
    }

    /**
     * @return managed
     */
    public Boolean getManaged() {
        return this.managed;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return newerVersions
     */
    public java.util.List < NewerVersions> getNewerVersions() {
        return this.newerVersions;
    }

    /**
     * @return supportedActions
     */
    public java.util.List < String > getSupportedActions() {
        return this.supportedActions;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List < String > architecture; 
        private String category; 
        private String configSchema; 
        private Boolean installByDefault; 
        private Boolean managed; 
        private String name; 
        private java.util.List < NewerVersions> newerVersions; 
        private java.util.List < String > supportedActions; 
        private String version; 

        /**
         * Architectures supported by the component. Valid values:
         * <p>
         * 
         * *   amd64
         * *   arm64
         */
        public Builder architecture(java.util.List < String > architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * The category of the component.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The custom parameter schema of the component.
         */
        public Builder configSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }

        /**
         * Indicates whether the component is automatically installed by default.
         */
        public Builder installByDefault(Boolean installByDefault) {
            this.installByDefault = installByDefault;
            return this;
        }

        /**
         * Indicates whether the component is fully managed.
         */
        public Builder managed(Boolean managed) {
            this.managed = managed;
            return this;
        }

        /**
         * The name of the component.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The latest version of the component.
         */
        public Builder newerVersions(java.util.List < NewerVersions> newerVersions) {
            this.newerVersions = newerVersions;
            return this;
        }

        /**
         * Operations supported by the component. Valid values:
         * <p>
         * 
         * *   Install
         * *   Upgrade
         * *   Modify
         * *   Uninstall
         */
        public Builder supportedActions(java.util.List < String > supportedActions) {
            this.supportedActions = supportedActions;
            return this;
        }

        /**
         * The version of the component.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeAddonResponseBody build() {
            return new DescribeAddonResponseBody(this);
        } 

    } 

    public static class NewerVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("minimum_cluster_version")
        private String minimumClusterVersion;

        @com.aliyun.core.annotation.NameInMap("upgradable")
        private Boolean upgradable;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private NewerVersions(Builder builder) {
            this.minimumClusterVersion = builder.minimumClusterVersion;
            this.upgradable = builder.upgradable;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewerVersions create() {
            return builder().build();
        }

        /**
         * @return minimumClusterVersion
         */
        public String getMinimumClusterVersion() {
            return this.minimumClusterVersion;
        }

        /**
         * @return upgradable
         */
        public Boolean getUpgradable() {
            return this.upgradable;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String minimumClusterVersion; 
            private Boolean upgradable; 
            private String version; 

            /**
             * The minimum cluster version required by the component version.
             */
            public Builder minimumClusterVersion(String minimumClusterVersion) {
                this.minimumClusterVersion = minimumClusterVersion;
                return this;
            }

            /**
             * Indicates whether the component can be updated to the version.
             */
            public Builder upgradable(Boolean upgradable) {
                this.upgradable = upgradable;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public NewerVersions build() {
                return new NewerVersions(this);
            } 

        } 

    }
}
