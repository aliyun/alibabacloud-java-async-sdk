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
 * {@link ListAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonsResponseBody</p>
 */
public class ListAddonsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addons")
    private java.util.List<Addons> addons;

    private ListAddonsResponseBody(Builder builder) {
        this.addons = builder.addons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAddonsResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Addons> addons; 

        private Builder() {
        } 

        private Builder(ListAddonsResponseBody model) {
            this.addons = model.addons;
        } 

        /**
         * <p>The list of available add-on components.</p>
         */
        public Builder addons(java.util.List<Addons> addons) {
            this.addons = addons;
            return this;
        }

        public ListAddonsResponseBody build() {
            return new ListAddonsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAddonsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonsResponseBody</p>
     */
    public static class Addons extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("supported_actions")
        private java.util.List<String> supportedActions;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Addons(Builder builder) {
            this.architecture = builder.architecture;
            this.category = builder.category;
            this.configSchema = builder.configSchema;
            this.installByDefault = builder.installByDefault;
            this.managed = builder.managed;
            this.name = builder.name;
            this.supportedActions = builder.supportedActions;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
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
            private java.util.List<String> supportedActions; 
            private String version; 

            private Builder() {
            } 

            private Builder(Addons model) {
                this.architecture = model.architecture;
                this.category = model.category;
                this.configSchema = model.configSchema;
                this.installByDefault = model.installByDefault;
                this.managed = model.managed;
                this.name = model.name;
                this.supportedActions = model.supportedActions;
                this.version = model.version;
            } 

            /**
             * <p>The CPU architectures supported by the component.</p>
             */
            public Builder architecture(java.util.List<String> architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The component categorization. Valid values:</p>
             * <ul>
             * <li>core: core component.</li>
             * <li>network: network type component.</li>
             * <li>security: security component.</li>
             * <li>storage: storage component.</li>
             * <li>monitor: logging and monitoring component.</li>
             * <li>application: application component.</li>
             * </ul>
             * <p>An empty value indicates that the component belongs to another categorization.</p>
             * 
             * <strong>example:</strong>
             * <p>monitor</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The schema of custom parameters for the component.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder configSchema(String configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * <p>Indicates whether the component is installed by default. Valid values:</p>
             * <ul>
             * <li><p>true: The component is installed by default when a cluster is created.</p>
             * </li>
             * <li><p>false: The component is not installed by default.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder installByDefault(Boolean installByDefault) {
                this.installByDefault = installByDefault;
                return this;
            }

            /**
             * <p>Indicates whether the component is managed. Valid values:</p>
             * <ul>
             * <li><p>true: The component is managed.</p>
             * </li>
             * <li><p>false: The component is not managed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prometheus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operations supported by the component.</p>
             */
            public Builder supportedActions(java.util.List<String> supportedActions) {
                this.supportedActions = supportedActions;
                return this;
            }

            /**
             * <p>The component version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.9</p>
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
