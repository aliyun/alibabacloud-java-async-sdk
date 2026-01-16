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
 * {@link GetClusterAddonInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterAddonInstanceResponseBody</p>
 */
public class GetClusterAddonInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CleanupCloudResources")
    private Boolean cleanupCloudResources;

    @com.aliyun.core.annotation.NameInMap("ConfigSchema")
    private java.util.List<ConfigSchema> configSchema;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetClusterAddonInstanceResponseBody(Builder builder) {
        this.cleanupCloudResources = builder.cleanupCloudResources;
        this.configSchema = builder.configSchema;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAddonInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String status; 
        private String version; 

        private Builder() {
        } 

        private Builder(GetClusterAddonInstanceResponseBody model) {
            this.cleanupCloudResources = model.cleanupCloudResources;
            this.configSchema = model.configSchema;
            this.name = model.name;
            this.requestId = model.requestId;
            this.status = model.status;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetClusterAddonInstanceResponseBody build() {
            return new GetClusterAddonInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterAddonInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterAddonInstanceResponseBody</p>
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
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            public ConfigSchema build() {
                return new ConfigSchema(this);
            } 

        } 

    }
}
