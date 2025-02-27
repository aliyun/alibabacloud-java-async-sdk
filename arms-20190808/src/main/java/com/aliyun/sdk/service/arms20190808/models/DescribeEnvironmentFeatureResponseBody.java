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
 * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvironmentFeatureResponseBody</p>
 */
public class DescribeEnvironmentFeatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEnvironmentFeatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvironmentFeatureResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
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
        public Builder data(Data data) {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>01FF8DD9-A09C-47A1-895A-B6E321BE77B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEnvironmentFeatureResponseBody build() {
            return new DescribeEnvironmentFeatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentFeatureResponseBody</p>
     */
    public static class Feature extends TeaModel {
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

        private Feature(Builder builder) {
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

        public static Feature create() {
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
             * <p>Prometheus agent.</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The configuration of the feature.</p>
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
             * <p>The environment ID.</p>
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
             * <p>The language.</p>
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
             * <p>The installation status of the agent.</p>
             * <ul>
             * <li>Installing: The agent is being installed.</li>
             * <li>Success: The agent is installed.</li>
             * <li>Failed: The agent failed to be installed.</li>
             * <li>UnInstall: The agent is uninstalled or has not been installed.</li>
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
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.17</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Feature build() {
                return new Feature(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentFeatureResponseBody</p>
     */
    public static class FeatureContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List<String> args;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private FeatureContainers(Builder builder) {
            this.args = builder.args;
            this.image = builder.image;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureContainers create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public java.util.List<String> getArgs() {
            return this.args;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> args; 
            private String image; 
            private String name; 

            /**
             * <p>The container parameters.</p>
             */
            public Builder args(java.util.List<String> args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-cn-hangzhou-vpc.ack.aliyuncs.com/acs/arms-prometheus-agent:v4.0.0</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The container name.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prometheus-operator</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public FeatureContainers build() {
                return new FeatureContainers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentFeatureResponseBody</p>
     */
    public static class FeatureStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindResourceId")
        private String bindResourceId;

        @com.aliyun.core.annotation.NameInMap("FeatureContainers")
        private java.util.List<FeatureContainers> featureContainers;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private FeatureStatus(Builder builder) {
            this.bindResourceId = builder.bindResourceId;
            this.featureContainers = builder.featureContainers;
            this.ips = builder.ips;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.securityGroupId = builder.securityGroupId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureStatus create() {
            return builder().build();
        }

        /**
         * @return bindResourceId
         */
        public String getBindResourceId() {
            return this.bindResourceId;
        }

        /**
         * @return featureContainers
         */
        public java.util.List<FeatureContainers> getFeatureContainers() {
            return this.featureContainers;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String bindResourceId; 
            private java.util.List<FeatureContainers> featureContainers; 
            private java.util.List<String> ips; 
            private String name; 
            private String namespace; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>c013823b55e4b4d6bb6b6f28682bd38a7</p>
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * <p>The containers of the feature.</p>
             */
            public Builder featureContainers(java.util.List<FeatureContainers> featureContainers) {
                this.featureContainers = featureContainers;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The Kubernetes resource name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prometheus-ack-arms-prometheus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>arms-prom</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp1c9fcexoalq9po6cp8</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The status of the agent. Valid values:</p>
             * <ul>
             * <li>Success: The agent is running.</li>
             * <li>Failed: The agent failed to run.</li>
             * <li>Not Found: The agent is not installed.</li>
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
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1qt6ict0dbxgv4wer8l</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public FeatureStatus build() {
                return new FeatureStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvironmentFeatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Feature")
        private Feature feature;

        @com.aliyun.core.annotation.NameInMap("FeatureStatus")
        private FeatureStatus featureStatus;

        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        private Data(Builder builder) {
            this.feature = builder.feature;
            this.featureStatus = builder.featureStatus;
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public Feature getFeature() {
            return this.feature;
        }

        /**
         * @return featureStatus
         */
        public FeatureStatus getFeatureStatus() {
            return this.featureStatus;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        public static final class Builder {
            private Feature feature; 
            private FeatureStatus featureStatus; 
            private String config; 

            /**
             * <p>The installation information about the feature.</p>
             */
            public Builder feature(Feature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * <p>The status of the feature.</p>
             */
            public Builder featureStatus(FeatureStatus featureStatus) {
                this.featureStatus = featureStatus;
                return this;
            }

            /**
             * config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
