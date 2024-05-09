// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEnvironmentFeatureResponseBody build() {
            return new DescribeEnvironmentFeatureResponseBody(this);
        } 

    } 

    public static class Feature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.Map < String, String > config;

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
        public java.util.Map < String, String > getConfig() {
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
            private java.util.Map < String, String > config; 
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
             * The alias of the feature.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The configuration of the feature.
             */
            public Builder config(java.util.Map < String, String > config) {
                this.config = config;
                return this;
            }

            /**
             * The description of the feature.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The environment ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * The URL of the icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * The language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The latest version number.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * Whether or not it is a managed component.
             */
            public Builder managed(Boolean managed) {
                this.managed = managed;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The version number.
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
    public static class FeatureContainers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private java.util.List < String > args;

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
        public java.util.List < String > getArgs() {
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
            private java.util.List < String > args; 
            private String image; 
            private String name; 

            /**
             * The container parameters.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The name of the container.
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
    public static class FeatureStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindResourceId")
        private String bindResourceId;

        @com.aliyun.core.annotation.NameInMap("FeatureContainers")
        private java.util.List < FeatureContainers> featureContainers;

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
        public java.util.List < FeatureContainers> getFeatureContainers() {
            return this.featureContainers;
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
            private java.util.List < FeatureContainers> featureContainers; 
            private String name; 
            private String namespace; 
            private String securityGroupId; 
            private String status; 
            private String vSwitchId; 

            /**
             * BindResourceId.
             */
            public Builder bindResourceId(String bindResourceId) {
                this.bindResourceId = bindResourceId;
                return this;
            }

            /**
             * The containers of the feature.
             */
            public Builder featureContainers(java.util.List < FeatureContainers> featureContainers) {
                this.featureContainers = featureContainers;
                return this;
            }

            /**
             * The Kubernetes resource name of the feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The status of the agent. Valid values:
             * <p>
             * 
             * *   Success: The agent is running.
             * *   Failed: The agent failed to run.
             * *   Not Found: The agent is not installed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Feature")
        private Feature feature;

        @com.aliyun.core.annotation.NameInMap("FeatureStatus")
        private FeatureStatus featureStatus;

        private Data(Builder builder) {
            this.feature = builder.feature;
            this.featureStatus = builder.featureStatus;
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

        public static final class Builder {
            private Feature feature; 
            private FeatureStatus featureStatus; 

            /**
             * The installation information of the feature.
             */
            public Builder feature(Feature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * The status of the feature.
             */
            public Builder featureStatus(FeatureStatus featureStatus) {
                this.featureStatus = featureStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
