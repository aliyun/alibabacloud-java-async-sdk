// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvironmentFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvironmentFeatureResponseBody</p>
 */
public class DescribeEnvironmentFeatureResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Status code: 200 indicates success.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The return data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         * <p>
         * 
         * *   `true`: successful
         * *   `false`: failed
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("Config")
        private java.util.Map < String, String > config;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Language")
        private String language;

        @NameInMap("LatestVersion")
        private String latestVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("Version")
        private String version;

        private Feature(Builder builder) {
            this.alias = builder.alias;
            this.config = builder.config;
            this.description = builder.description;
            this.environmentId = builder.environmentId;
            this.icon = builder.icon;
            this.language = builder.language;
            this.latestVersion = builder.latestVersion;
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
            private String name; 
            private String status; 
            private String version; 

            /**
             * Alias of Feature.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * Config of Feature.
             */
            public Builder config(java.util.Map < String, String > config) {
                this.config = config;
                return this;
            }

            /**
             * Description of Feature.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Environment ID.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * Icon address.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Lanuage.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * This is the latest version of Feature.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * Name of Feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Installation status of Feature.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version of Feature.
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
        @NameInMap("Args")
        private java.util.List < String > args;

        @NameInMap("Image")
        private String image;

        @NameInMap("Name")
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
             * Container parameters.
             */
            public Builder args(java.util.List < String > args) {
                this.args = args;
                return this;
            }

            /**
             * Container image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * Name of the container.
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
        @NameInMap("FeatureContainers")
        private java.util.List < FeatureContainers> featureContainers;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Status")
        private String status;

        private FeatureStatus(Builder builder) {
            this.featureContainers = builder.featureContainers;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureStatus create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < FeatureContainers> featureContainers; 
            private String name; 
            private String namespace; 
            private String status; 

            /**
             * Feature container list.
             */
            public Builder featureContainers(java.util.List < FeatureContainers> featureContainers) {
                this.featureContainers = featureContainers;
                return this;
            }

            /**
             * K8s resource name of the Feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Running status.
             * <p>
             * - Success: Running normal
             * - Failed: Running exception
             * - Not Found: Not installed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FeatureStatus build() {
                return new FeatureStatus(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Feature")
        private Feature feature;

        @NameInMap("FeatureStatus")
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
             * Feature Installation information.
             */
            public Builder feature(Feature feature) {
                this.feature = feature;
                return this;
            }

            /**
             * Running status of the Feature.
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
