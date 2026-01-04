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
 * {@link ListAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAddonsResponseBody</p>
 */
public class ListAddonsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Addons")
    private java.util.List<Addons> addons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAddonsResponseBody(Builder builder) {
        this.addons = builder.addons;
        this.requestId = builder.requestId;
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

        private Builder(ListAddonsResponseBody model) {
            this.addons = model.addons;
            this.requestId = model.requestId;
        } 

        /**
         * Addons.
         */
        public Builder addons(java.util.List<Addons> addons) {
            this.addons = addons;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * ConfigVersion.
             */
            public Builder configVersion(String configVersion) {
                this.configVersion = configVersion;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Params.
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
     * {@link ListAddonsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAddonsResponseBody</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanupCloudResources")
        private Boolean cleanupCloudResources;

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
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean cleanupCloudResources; 
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
             * CleanupCloudResources.
             */
            public Builder cleanupCloudResources(Boolean cleanupCloudResources) {
                this.cleanupCloudResources = cleanupCloudResources;
                return this;
            }

            /**
             * ConfigSchema.
             */
            public Builder configSchema(java.util.List<ConfigSchema> configSchema) {
                this.configSchema = configSchema;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Version.
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
