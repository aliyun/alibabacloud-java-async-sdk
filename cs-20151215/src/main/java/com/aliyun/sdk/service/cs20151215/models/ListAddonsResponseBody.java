// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonsResponseBody</p>
 */
public class ListAddonsResponseBody extends TeaModel {
    @NameInMap("addons")
    private java.util.List < Addons> addons;

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
    public java.util.List < Addons> getAddons() {
        return this.addons;
    }

    public static final class Builder {
        private java.util.List < Addons> addons; 

        /**
         * addons.
         */
        public Builder addons(java.util.List < Addons> addons) {
            this.addons = addons;
            return this;
        }

        public ListAddonsResponseBody build() {
            return new ListAddonsResponseBody(this);
        } 

    } 

    public static class Addons extends TeaModel {
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

        @NameInMap("supported_actions")
        private java.util.List < String > supportedActions;

        @NameInMap("version")
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

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
