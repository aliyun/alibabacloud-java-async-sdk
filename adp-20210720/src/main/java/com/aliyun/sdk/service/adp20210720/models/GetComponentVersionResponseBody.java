// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComponentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetComponentVersionResponseBody</p>
 */
public class GetComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private GetComponentVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComponentVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public GetComponentVersionResponseBody build() {
            return new GetComponentVersionResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("limits")
        private java.util.Map < String, ? > limits;

        @NameInMap("requests")
        private java.util.Map < String, ? > requests;

        private Resources(Builder builder) {
            this.limits = builder.limits;
            this.requests = builder.requests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return limits
         */
        public java.util.Map < String, ? > getLimits() {
            return this.limits;
        }

        /**
         * @return requests
         */
        public java.util.Map < String, ? > getRequests() {
            return this.requests;
        }

        public static final class Builder {
            private java.util.Map < String, ? > limits; 
            private java.util.Map < String, ? > requests; 

            /**
             * limits.
             */
            public Builder limits(java.util.Map < String, ? > limits) {
                this.limits = limits;
                return this;
            }

            /**
             * requests.
             */
            public Builder requests(java.util.Map < String, ? > requests) {
                this.requests = requests;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentUID")
        private String componentUID;

        @NameInMap("description")
        private String description;

        @NameInMap("documents")
        private String documents;

        @NameInMap("orchestrationValues")
        private String orchestrationValues;

        @NameInMap("packageURL")
        private String packageURL;

        @NameInMap("parentComponent")
        private Boolean parentComponent;

        @NameInMap("productComponentVersionUID")
        private String productComponentVersionUID;

        @NameInMap("provider")
        private String provider;

        @NameInMap("readme")
        private String readme;

        @NameInMap("resources")
        private Resources resources;

        @NameInMap("uid")
        private String uid;

        @NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.componentName = builder.componentName;
            this.componentUID = builder.componentUID;
            this.description = builder.description;
            this.documents = builder.documents;
            this.orchestrationValues = builder.orchestrationValues;
            this.packageURL = builder.packageURL;
            this.parentComponent = builder.parentComponent;
            this.productComponentVersionUID = builder.productComponentVersionUID;
            this.provider = builder.provider;
            this.readme = builder.readme;
            this.resources = builder.resources;
            this.uid = builder.uid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentUID
         */
        public String getComponentUID() {
            return this.componentUID;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return documents
         */
        public String getDocuments() {
            return this.documents;
        }

        /**
         * @return orchestrationValues
         */
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        /**
         * @return packageURL
         */
        public String getPackageURL() {
            return this.packageURL;
        }

        /**
         * @return parentComponent
         */
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        /**
         * @return productComponentVersionUID
         */
        public String getProductComponentVersionUID() {
            return this.productComponentVersionUID;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return readme
         */
        public String getReadme() {
            return this.readme;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String componentName; 
            private String componentUID; 
            private String description; 
            private String documents; 
            private String orchestrationValues; 
            private String packageURL; 
            private Boolean parentComponent; 
            private String productComponentVersionUID; 
            private String provider; 
            private String readme; 
            private Resources resources; 
            private String uid; 
            private String version; 

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * componentUID.
             */
            public Builder componentUID(String componentUID) {
                this.componentUID = componentUID;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * documents.
             */
            public Builder documents(String documents) {
                this.documents = documents;
                return this;
            }

            /**
             * orchestrationValues.
             */
            public Builder orchestrationValues(String orchestrationValues) {
                this.orchestrationValues = orchestrationValues;
                return this;
            }

            /**
             * packageURL.
             */
            public Builder packageURL(String packageURL) {
                this.packageURL = packageURL;
                return this;
            }

            /**
             * parentComponent.
             */
            public Builder parentComponent(Boolean parentComponent) {
                this.parentComponent = parentComponent;
                return this;
            }

            /**
             * productComponentVersionUID.
             */
            public Builder productComponentVersionUID(String productComponentVersionUID) {
                this.productComponentVersionUID = productComponentVersionUID;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * readme.
             */
            public Builder readme(String readme) {
                this.readme = readme;
                return this;
            }

            /**
             * resources.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * version.
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
