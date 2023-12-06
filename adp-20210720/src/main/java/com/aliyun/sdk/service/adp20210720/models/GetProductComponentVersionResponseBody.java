// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductComponentVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductComponentVersionResponseBody</p>
 */
public class GetProductComponentVersionResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    private GetProductComponentVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductComponentVersionResponseBody create() {
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

        public GetProductComponentVersionResponseBody build() {
            return new GetProductComponentVersionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("appVersion")
        private String appVersion;

        @NameInMap("category")
        private String category;

        @NameInMap("componentDescription")
        private String componentDescription;

        @NameInMap("componentName")
        private String componentName;

        @NameInMap("componentUID")
        private String componentUID;

        @NameInMap("componentVersionDescription")
        private String componentVersionDescription;

        @NameInMap("componentVersionUID")
        private String componentVersionUID;

        @NameInMap("enable")
        private Boolean enable;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("orchestrationValues")
        private String orchestrationValues;

        @NameInMap("parentComponent")
        private Boolean parentComponent;

        @NameInMap("parentComponentVersionRelationUID")
        private String parentComponentVersionRelationUID;

        @NameInMap("parentComponentVersionUID")
        private String parentComponentVersionUID;

        @NameInMap("productVersionUID")
        private String productVersionUID;

        @NameInMap("relationUID")
        private String relationUID;

        @NameInMap("releaseName")
        private String releaseName;

        @NameInMap("resources")
        private String resources;

        @NameInMap("sequence")
        private Integer sequence;

        @NameInMap("source")
        private String source;

        @NameInMap("values")
        private String values;

        @NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.appVersion = builder.appVersion;
            this.category = builder.category;
            this.componentDescription = builder.componentDescription;
            this.componentName = builder.componentName;
            this.componentUID = builder.componentUID;
            this.componentVersionDescription = builder.componentVersionDescription;
            this.componentVersionUID = builder.componentVersionUID;
            this.enable = builder.enable;
            this.namespace = builder.namespace;
            this.orchestrationValues = builder.orchestrationValues;
            this.parentComponent = builder.parentComponent;
            this.parentComponentVersionRelationUID = builder.parentComponentVersionRelationUID;
            this.parentComponentVersionUID = builder.parentComponentVersionUID;
            this.productVersionUID = builder.productVersionUID;
            this.relationUID = builder.relationUID;
            this.releaseName = builder.releaseName;
            this.resources = builder.resources;
            this.sequence = builder.sequence;
            this.source = builder.source;
            this.values = builder.values;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return componentDescription
         */
        public String getComponentDescription() {
            return this.componentDescription;
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
         * @return componentVersionDescription
         */
        public String getComponentVersionDescription() {
            return this.componentVersionDescription;
        }

        /**
         * @return componentVersionUID
         */
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return orchestrationValues
         */
        public String getOrchestrationValues() {
            return this.orchestrationValues;
        }

        /**
         * @return parentComponent
         */
        public Boolean getParentComponent() {
            return this.parentComponent;
        }

        /**
         * @return parentComponentVersionRelationUID
         */
        public String getParentComponentVersionRelationUID() {
            return this.parentComponentVersionRelationUID;
        }

        /**
         * @return parentComponentVersionUID
         */
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        /**
         * @return productVersionUID
         */
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        /**
         * @return relationUID
         */
        public String getRelationUID() {
            return this.relationUID;
        }

        /**
         * @return releaseName
         */
        public String getReleaseName() {
            return this.releaseName;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appVersion; 
            private String category; 
            private String componentDescription; 
            private String componentName; 
            private String componentUID; 
            private String componentVersionDescription; 
            private String componentVersionUID; 
            private Boolean enable; 
            private String namespace; 
            private String orchestrationValues; 
            private Boolean parentComponent; 
            private String parentComponentVersionRelationUID; 
            private String parentComponentVersionUID; 
            private String productVersionUID; 
            private String relationUID; 
            private String releaseName; 
            private String resources; 
            private Integer sequence; 
            private String source; 
            private String values; 
            private String version; 

            /**
             * appVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
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
             * componentDescription.
             */
            public Builder componentDescription(String componentDescription) {
                this.componentDescription = componentDescription;
                return this;
            }

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
             * componentVersionDescription.
             */
            public Builder componentVersionDescription(String componentVersionDescription) {
                this.componentVersionDescription = componentVersionDescription;
                return this;
            }

            /**
             * componentVersionUID.
             */
            public Builder componentVersionUID(String componentVersionUID) {
                this.componentVersionUID = componentVersionUID;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
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
             * parentComponent.
             */
            public Builder parentComponent(Boolean parentComponent) {
                this.parentComponent = parentComponent;
                return this;
            }

            /**
             * parentComponentVersionRelationUID.
             */
            public Builder parentComponentVersionRelationUID(String parentComponentVersionRelationUID) {
                this.parentComponentVersionRelationUID = parentComponentVersionRelationUID;
                return this;
            }

            /**
             * parentComponentVersionUID.
             */
            public Builder parentComponentVersionUID(String parentComponentVersionUID) {
                this.parentComponentVersionUID = parentComponentVersionUID;
                return this;
            }

            /**
             * productVersionUID.
             */
            public Builder productVersionUID(String productVersionUID) {
                this.productVersionUID = productVersionUID;
                return this;
            }

            /**
             * relationUID.
             */
            public Builder relationUID(String relationUID) {
                this.relationUID = relationUID;
                return this;
            }

            /**
             * releaseName.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * sequence.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * values.
             */
            public Builder values(String values) {
                this.values = values;
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
