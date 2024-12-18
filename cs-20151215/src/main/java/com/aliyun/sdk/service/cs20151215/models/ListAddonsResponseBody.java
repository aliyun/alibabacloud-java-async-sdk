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

    /**
     * @return addons
     */
    public java.util.List<Addons> getAddons() {
        return this.addons;
    }

    public static final class Builder {
        private java.util.List<Addons> addons; 

        /**
         * <p>The list of available components.</p>
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
             * <p>monitor</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The schema of the custom parameters of the component.</p>
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
             * <p>false</p>
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
             * <p>The version number.</p>
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
