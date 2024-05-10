// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateTemplateResponseBody</p>
 */
public class ValidateTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List < Outputs> outputs;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < java.util.Map<String, ?>> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private ResourceTypes resourceTypes;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List < Resources> resources;

    @com.aliyun.core.annotation.NameInMap("UpdateInfo")
    private UpdateInfo updateInfo;

    private ValidateTemplateResponseBody(Builder builder) {
        this.description = builder.description;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
        this.resources = builder.resources;
        this.updateInfo = builder.updateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return outputs
     */
    public java.util.List < Outputs> getOutputs() {
        return this.outputs;
    }

    /**
     * @return parameters
     */
    public java.util.List < java.util.Map<String, ?>> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypes
     */
    public ResourceTypes getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return updateInfo
     */
    public UpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }

    public static final class Builder {
        private String description; 
        private java.util.List < Outputs> outputs; 
        private java.util.List < java.util.Map<String, ?>> parameters; 
        private String requestId; 
        private ResourceTypes resourceTypes; 
        private java.util.List < Resources> resources; 
        private UpdateInfo updateInfo; 

        /**
         * The description of the template.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The outputs of the template.
         */
        public Builder outputs(java.util.List < Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * The parameters that are defined in the Parameters section of the template.
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource types that are used in the template.
         */
        public Builder resourceTypes(ResourceTypes resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * The regular resources that are defined in the template.
         * <p>
         * 
         * > - For a Resource Orchestration Service (ROS) template, the resource whose definition contains `Count` is not displayed as a list.
         * > -  For a Terraform template, the resource whose definition contains `count` or `for_each` is not displayed as a list.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The information about the stack update. This parameter cannot be returned if the value of UpdateInfoOptions contains Disabled.
         */
        public Builder updateInfo(UpdateInfo updateInfo) {
            this.updateInfo = updateInfo;
            return this;
        }

        public ValidateTemplateResponseBody build() {
            return new ValidateTemplateResponseBody(this);
        } 

    } 

    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("OutputKey")
        private String outputKey;

        private Outputs(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.outputKey = builder.outputKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return outputKey
         */
        public String getOutputKey() {
            return this.outputKey;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private String outputKey; 

            /**
             * The description of the template output.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The alias of the template output.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the template output.
             */
            public Builder outputKey(String outputKey) {
                this.outputKey = outputKey;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    public static class ResourceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List < String > dataSources;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < String > resources;

        private ResourceTypes(Builder builder) {
            this.dataSources = builder.dataSources;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypes create() {
            return builder().build();
        }

        /**
         * @return dataSources
         */
        public java.util.List < String > getDataSources() {
            return this.dataSources;
        }

        /**
         * @return resources
         */
        public java.util.List < String > getResources() {
            return this.resources;
        }

        public static final class Builder {
            private java.util.List < String > dataSources; 
            private java.util.List < String > resources; 

            /**
             * The DataSource resource types that are used in the template. The value is deduplicated.
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * The regular resource types that are used in the template. The value is deduplicated.
             */
            public Builder resources(java.util.List < String > resources) {
                this.resources = resources;
                return this;
            }

            public ResourceTypes build() {
                return new ResourceTypes(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicalResourceIdPattern")
        private String logicalResourceIdPattern;

        @com.aliyun.core.annotation.NameInMap("ResourcePath")
        private String resourcePath;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resources(Builder builder) {
            this.logicalResourceIdPattern = builder.logicalResourceIdPattern;
            this.resourcePath = builder.resourcePath;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return logicalResourceIdPattern
         */
        public String getLogicalResourceIdPattern() {
            return this.logicalResourceIdPattern;
        }

        /**
         * @return resourcePath
         */
        public String getResourcePath() {
            return this.resourcePath;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String logicalResourceIdPattern; 
            private String resourcePath; 
            private String resourceType; 

            /**
             * The pattern in which the logical IDs of regular resources are formed.
             * <p>
             * 
             * If resources are defined in a ROS template, the following rules apply:
             * 
             * *   Resource whose definition does not contain `Count`: If the resource name defined in the template is `server`, the values of LogicalResourceIdPattern and `ResourcePath` are both `server`.``
             * *   Resource whose definition contains `Count`: If the resource name defined in the template is `server`, the value of LogicalResourceIdPattern is `server[*]`, and the value of `ResourcePath` is `server`.
             * 
             * If resources and [modules](https://www.terraform.io/language/modules) are defined in a Terraform template, the following rules apply:
             * 
             * *   Resource and module whose definitions do not contain [`count`](https://www.terraform.io/language/meta-arguments/count) or [`for_each`](https://www.terraform.io/language/meta-arguments/for_each): If the resource name defined in the template is `server`, the values of LogicalResourceIdPattern and `ResourcePath` are both `server`.``
             * *   Resource and module whose definitions contain [`count`](https://www.terraform.io/language/meta-arguments/count) or [`for_each`](https://www.terraform.io/language/meta-arguments/for_each): If the resource name defined in the template is `server`, the value of LogicalResourceIdPattern is `server[*]`, and the value of `ResourcePath` is `server`.
             * 
             * Examples of LogicalResourceIdPattern for resources in a Terraform template:
             * 
             * *   Valid values of LogicalResourceIdPattern if a resource belongs to the root module:
             * 
             *     *   `server`: In this case, `count` and `for_each` are not contained in the resource. The value of `ResourcePath` is `server`.
             *     *   `server[*]`: In this case, `count` or `for_each` is contained in the resource. The value of `ResourcePath` is `server`.
             * 
             * *   Valid values of LogicalResourceIdPattern if a resource belongs to a child module:
             * 
             *     *   `app.server`: In this case, `count` and `for_each` are not contained in the `app` module and the `server` resource. The value of `ResourcePath` is `app.server`.````
             *     *   `app.server[*]`: In this case, `count` or `for_each` is contained in the `server` resource, but `count` and `for_each` are not contained in the `app` module. The value of `ResourcePath` is `app.server`.
             *     *   `app[*].server`: In this case, `count` or `for_each` is contained in the `app` module, but `count` and `for_each` are not contained in the `server` resource. The value of `ResourcePath` is `app.server`.
             *     *   `app[*].server[*]`: In this case, `count` or `for_each` is contained in the `app` module and the `server` resource. The value of `ResourcePath` is `app.server`.````
             *     *   `app.app_group[*].server`: In this case, `count` or `for_each` is contained in the `app_group` module, but `count` and `for_each` are not contained in the `app` module and the `server` resource. The value of `ResourcePath` is `app.app_group.server`. The `app_group` module is a child module of the `app` module.````
             */
            public Builder logicalResourceIdPattern(String logicalResourceIdPattern) {
                this.logicalResourceIdPattern = logicalResourceIdPattern;
                return this;
            }

            /**
             * The path of the regular resource. In most cases, the path of a regular resource is the same as the resource name.
             */
            public Builder resourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
                return this;
            }

            /**
             * The regular resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class UpdateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParametersAllowedToBeModified")
        private java.util.List < String > parametersAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersCauseInterruptionIfModified")
        private java.util.List < String > parametersCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersCauseReplacementIfModified")
        private java.util.List < String > parametersCauseReplacementIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List < String > parametersConditionallyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        private java.util.List < String > parametersConditionallyCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyCauseReplacementIfModified")
        private java.util.List < String > parametersConditionallyCauseReplacementIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List < String > parametersNotAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyAllowedToBeModified")
        private java.util.List < String > parametersUncertainlyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyCauseReplacementIfModified")
        private java.util.List < String > parametersUncertainlyCauseReplacementIfModified;

        private UpdateInfo(Builder builder) {
            this.parametersAllowedToBeModified = builder.parametersAllowedToBeModified;
            this.parametersCauseInterruptionIfModified = builder.parametersCauseInterruptionIfModified;
            this.parametersCauseReplacementIfModified = builder.parametersCauseReplacementIfModified;
            this.parametersConditionallyAllowedToBeModified = builder.parametersConditionallyAllowedToBeModified;
            this.parametersConditionallyCauseInterruptionIfModified = builder.parametersConditionallyCauseInterruptionIfModified;
            this.parametersConditionallyCauseReplacementIfModified = builder.parametersConditionallyCauseReplacementIfModified;
            this.parametersNotAllowedToBeModified = builder.parametersNotAllowedToBeModified;
            this.parametersUncertainlyAllowedToBeModified = builder.parametersUncertainlyAllowedToBeModified;
            this.parametersUncertainlyCauseInterruptionIfModified = builder.parametersUncertainlyCauseInterruptionIfModified;
            this.parametersUncertainlyCauseReplacementIfModified = builder.parametersUncertainlyCauseReplacementIfModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateInfo create() {
            return builder().build();
        }

        /**
         * @return parametersAllowedToBeModified
         */
        public java.util.List < String > getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        /**
         * @return parametersCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersCauseInterruptionIfModified() {
            return this.parametersCauseInterruptionIfModified;
        }

        /**
         * @return parametersCauseReplacementIfModified
         */
        public java.util.List < String > getParametersCauseReplacementIfModified() {
            return this.parametersCauseReplacementIfModified;
        }

        /**
         * @return parametersConditionallyAllowedToBeModified
         */
        public java.util.List < String > getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        /**
         * @return parametersConditionallyCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersConditionallyCauseInterruptionIfModified() {
            return this.parametersConditionallyCauseInterruptionIfModified;
        }

        /**
         * @return parametersConditionallyCauseReplacementIfModified
         */
        public java.util.List < String > getParametersConditionallyCauseReplacementIfModified() {
            return this.parametersConditionallyCauseReplacementIfModified;
        }

        /**
         * @return parametersNotAllowedToBeModified
         */
        public java.util.List < String > getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyAllowedToBeModified
         */
        public java.util.List < String > getParametersUncertainlyAllowedToBeModified() {
            return this.parametersUncertainlyAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersUncertainlyCauseInterruptionIfModified() {
            return this.parametersUncertainlyCauseInterruptionIfModified;
        }

        /**
         * @return parametersUncertainlyCauseReplacementIfModified
         */
        public java.util.List < String > getParametersUncertainlyCauseReplacementIfModified() {
            return this.parametersUncertainlyCauseReplacementIfModified;
        }

        public static final class Builder {
            private java.util.List < String > parametersAllowedToBeModified; 
            private java.util.List < String > parametersCauseInterruptionIfModified; 
            private java.util.List < String > parametersCauseReplacementIfModified; 
            private java.util.List < String > parametersConditionallyAllowedToBeModified; 
            private java.util.List < String > parametersConditionallyCauseInterruptionIfModified; 
            private java.util.List < String > parametersConditionallyCauseReplacementIfModified; 
            private java.util.List < String > parametersNotAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified; 
            private java.util.List < String > parametersUncertainlyCauseReplacementIfModified; 

            /**
             * The parameters that can be modified.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions.
             * <p>
             * 
             * > - This parameter is supported only for a small number of resource types.
             * > - This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List < String > parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters whose changes trigger replacement updates for resources.
             * <p>
             * 
             * > -  This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.
             * > -  This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersCauseReplacementIfModified(java.util.List < String > parametersCauseReplacementIfModified) {
                this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
                return this;
            }

            /**
             * The parameters that can be modified under specific conditions.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under specific conditions.
             * <p>
             * 
             * > - This parameter is supported only for a small number of resource types.
             * > - This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List < String > parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters whose changes trigger replacement updates for resources under specific conditions.
             * <p>
             * 
             * > - This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.
             * > - This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersConditionallyCauseReplacementIfModified(java.util.List < String > parametersConditionallyCauseReplacementIfModified) {
                this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
                return this;
            }

            /**
             * The parameters that cannot be modified.
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * The parameters that can be modified under uncertain conditions.
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List < String > parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under uncertain conditions.
             * <p>
             * 
             * > - This parameter is supported only for a small number of resource types.
             * > - This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersUncertainlyCauseInterruptionIfModified(java.util.List < String > parametersUncertainlyCauseInterruptionIfModified) {
                this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters whose changes trigger replacement updates for resources under uncertain conditions.
             * <p>
             * 
             * > -  This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.
             * > -  This parameter is valid only for updates on ROS stacks.
             */
            public Builder parametersUncertainlyCauseReplacementIfModified(java.util.List < String > parametersUncertainlyCauseReplacementIfModified) {
                this.parametersUncertainlyCauseReplacementIfModified = parametersUncertainlyCauseReplacementIfModified;
                return this;
            }

            public UpdateInfo build() {
                return new UpdateInfo(this);
            } 

        } 

    }
}
