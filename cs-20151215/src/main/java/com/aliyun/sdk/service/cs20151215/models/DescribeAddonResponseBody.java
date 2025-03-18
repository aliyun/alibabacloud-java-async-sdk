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
 * {@link DescribeAddonResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonResponseBody</p>
 */
public class DescribeAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("architecture")
    private java.util.List<String> architecture;

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
    private java.util.List<NewerVersions> newerVersions;

    @com.aliyun.core.annotation.NameInMap("supported_actions")
    private java.util.List<String> supportedActions;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architecture
     */
    public java.util.List<String> getArchitecture() {
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
    public java.util.List<NewerVersions> getNewerVersions() {
        return this.newerVersions;
    }

    /**
     * @return supportedActions
     */
    public java.util.List<String> getSupportedActions() {
        return this.supportedActions;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.List<String> architecture; 
        private String category; 
        private String configSchema; 
        private Boolean installByDefault; 
        private Boolean managed; 
        private String name; 
        private java.util.List<NewerVersions> newerVersions; 
        private java.util.List<String> supportedActions; 
        private String version; 

        private Builder() {
        } 

        private Builder(DescribeAddonResponseBody model) {
            this.architecture = model.architecture;
            this.category = model.category;
            this.configSchema = model.configSchema;
            this.installByDefault = model.installByDefault;
            this.managed = model.managed;
            this.name = model.name;
            this.newerVersions = model.newerVersions;
            this.supportedActions = model.supportedActions;
            this.version = model.version;
        } 

        /**
         * <p>Architectures supported by the component. Valid values:</p>
         * <ul>
         * <li>amd64</li>
         * <li>arm64</li>
         * </ul>
         */
        public Builder architecture(java.util.List<String> architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>The category of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>network</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The custom parameter schema of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder configSchema(String configSchema) {
            this.configSchema = configSchema;
            return this;
        }

        /**
         * <p>Indicates whether the component is automatically installed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder installByDefault(Boolean installByDefault) {
            this.installByDefault = installByDefault;
            return this;
        }

        /**
         * <p>Indicates whether the component is fully managed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder managed(Boolean managed) {
            this.managed = managed;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The latest version of the component.</p>
         */
        public Builder newerVersions(java.util.List<NewerVersions> newerVersions) {
            this.newerVersions = newerVersions;
            return this;
        }

        /**
         * <p>Operations supported by the component. Valid values:</p>
         * <ul>
         * <li>Install</li>
         * <li>Upgrade</li>
         * <li>Modify</li>
         * <li>Uninstall</li>
         * </ul>
         */
        public Builder supportedActions(java.util.List<String> supportedActions) {
            this.supportedActions = supportedActions;
            return this;
        }

        /**
         * <p>The version of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.9.3.6-32932850-aliyun</p>
         */
        public Builder version(String version) {
            this.version = version;
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

            private Builder() {
            } 

            private Builder(NewerVersions model) {
                this.minimumClusterVersion = model.minimumClusterVersion;
                this.upgradable = model.upgradable;
                this.version = model.version;
            } 

            /**
             * <p>The minimum cluster version required by the component version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.20.4</p>
             */
            public Builder minimumClusterVersion(String minimumClusterVersion) {
                this.minimumClusterVersion = minimumClusterVersion;
                return this;
            }

            /**
             * <p>Indicates whether the component can be updated to the version.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder upgradable(Boolean upgradable) {
                this.upgradable = upgradable;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.9.3.10-7dfca203-aliyun</p>
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
