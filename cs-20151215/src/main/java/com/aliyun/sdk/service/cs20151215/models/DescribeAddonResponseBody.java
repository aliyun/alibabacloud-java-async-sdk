// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonResponseBody</p>
 */
public class DescribeAddonResponseBody extends TeaModel {
    @NameInMap("architecture")
    private java.util.List < String > architecture;

    @NameInMap("category")
    private String category;

    @NameInMap("config_schema")
    private String configSchema;

    @NameInMap("install_by_default")
    private Boolean installByDefault;

    @NameInMap("managed")
    private Boolean managed;

    @NameInMap("name")
    private String name;

    @NameInMap("newer_versions")
    private java.util.List < NewerVersions> newerVersions;

    @NameInMap("supported_actions")
    private java.util.List < String > supportedActions;

    @NameInMap("version")
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
         * architecture.
         */
        public Builder architecture(java.util.List < String > architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * config_schema.
         */
        public Builder configSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }

        /**
         * install_by_default.
         */
        public Builder installByDefault(Boolean installByDefault) {
            this.installByDefault = installByDefault;
            return this;
        }

        /**
         * managed.
         */
        public Builder managed(Boolean managed) {
            this.managed = managed;
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
         * newer_versions.
         */
        public Builder newerVersions(java.util.List < NewerVersions> newerVersions) {
            this.newerVersions = newerVersions;
            return this;
        }

        /**
         * supported_actions.
         */
        public Builder supportedActions(java.util.List < String > supportedActions) {
            this.supportedActions = supportedActions;
            return this;
        }

        /**
         * version.
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
        @NameInMap("minimum_cluster_version")
        private String minimumClusterVersion;

        @NameInMap("upgradable")
        private Boolean upgradable;

        @NameInMap("version")
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
             * minimum_cluster_version.
             */
            public Builder minimumClusterVersion(String minimumClusterVersion) {
                this.minimumClusterVersion = minimumClusterVersion;
                return this;
            }

            /**
             * upgradable.
             */
            public Builder upgradable(Boolean upgradable) {
                this.upgradable = upgradable;
                return this;
            }

            /**
             * version.
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
