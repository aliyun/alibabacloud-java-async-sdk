// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListEnvironmentFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentFeaturesResponseBody</p>
 */
public class ListEnvironmentFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListEnvironmentFeaturesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Status Code. Description 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>40B10E04-81E8-4643-970D-F1B38F2E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the alert rule was deleted. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The alert rule was deleted.</li>
         * <li><code>false</code>: The alert rule failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEnvironmentFeaturesResponseBody build() {
            return new ListEnvironmentFeaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvironmentFeaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvironmentFeaturesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map<String, String> config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnvironmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("Managed")
        private Boolean managed;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.alias = builder.alias;
            this.config = builder.config;
            this.description = builder.description;
            this.environmentId = builder.environmentId;
            this.icon = builder.icon;
            this.language = builder.language;
            this.latestVersion = builder.latestVersion;
            this.managed = builder.managed;
            this.name = builder.name;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return config
         */
        public java.util.Map<String, String> getConfig() {
            return this.config;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
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
            private String alias; 
            private java.util.Map<String, String> config; 
            private String description; 
            private String environmentId; 
            private String icon; 
            private String language; 
            private String latestVersion; 
            private Boolean managed; 
            private String name; 
            private String status; 
            private String version; 

            /**
             * <p>The alias of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus Agent</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The feature configuration.</p>
             */
            public Builder config(java.util.Map<String, String> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The description of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>Collect Metric data using the Prometheus collection specification.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the environment instance.</p>
             * 
             * <strong>example:</strong>
             * <p>env-xxxxx</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The URL of the icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The language. Valid values:</p>
             * <ul>
             * <li>zh: Chinese</li>
             * <li>en: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The latest version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.17</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>Indicates whether the component is fully managed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>metric-agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the feature. Valid values:</p>
             * <ul>
             * <li>Installing: The agent is being installed.</li>
             * <li>Success: The agent is installed.</li>
             * <li>Failed: The agent failed to be installed.</li>
             * <li>UnInstall: The agent is uninstalled.</li>
             * <li>Uninstalling: The agent is being uninstalled.</li>
             * <li>UnInstallFailed: The agent failed to be uninstalled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.17</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
