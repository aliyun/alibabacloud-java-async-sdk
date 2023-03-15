// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateTemplateResponseBody</p>
 */
public class ValidateTemplateResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Outputs")
    private java.util.List < Outputs> outputs;

    @NameInMap("Parameters")
    private java.util.List < java.util.Map<String, ?>> parameters;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceTypes")
    private ResourceTypes resourceTypes;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    @NameInMap("UpdateInfo")
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
         * The output items of the template.
         */
        public Builder outputs(java.util.List < Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * The parameters in the Parameters section of the template.
         * <p>
         * 
         * The Parameters section contains the parameters that you must specify when you use the template to create a stack. You can use the parameters to specify the stack details, such as the username, the password, and the Elastic Compute Service (ECS) instance type in the specified region.
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
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
         * > 
         * *   For a Resource Orchestration Service (ROS) template, the resource whose definition contains the `Count` parameter is not displayed as a list.
         * *   For a Terraform template, the resource whose definition contains the `count` or `for_each` parameter is not displayed as a list.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The update information about the stack.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("Label")
        private String label;

        @NameInMap("OutputKey")
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
             * The description of the output item.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The alias of the output item.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The name of the output item.
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
        @NameInMap("DataSources")
        private java.util.List < String > dataSources;

        @NameInMap("Resources")
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
             * The DataSource resource types.
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * The regular resource types.
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
        @NameInMap("LogicalResourceIdPattern")
        private String logicalResourceIdPattern;

        @NameInMap("ResourcePath")
        private String resourcePath;

        @NameInMap("ResourceType")
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
             * If resources are defined in an ROS template, the following rules apply:
             * 
             * *   Resource whose definition does not contain the `Count` parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern and `ResourcePath` parameters is `server`.
             * *   Resource whose definition contains the `Count` parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern parameter is `server[*]`, and the value of the `ResourcePath` parameter is `server`.
             * 
             * If resources and [modules](https://www.terraform.io/language/modules) are defined in a Terraform template, the following rules apply:
             * 
             * *   Resource and module whose definitions do not contain the [count](https://www.terraform.io/language/meta-arguments/count) or [for_each](https://www.terraform.io/language/meta-arguments/for_each) parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern and `ResourcePath` parameters is `server`.
             * *   Resource and module whose definitions contain the [count](https://www.terraform.io/language/meta-arguments/count) or [for_each](https://www.terraform.io/language/meta-arguments/for_each) parameter: If the resource name defined in the template is `server`, the value of the LogicalResourceIdPattern parameter is `server[*]`, and the value of the `ResourcePath` parameter is `server`.
             * 
             * Examples of the LogicalResourceIdPattern parameter for resources in a Terraform template:
             * 
             * *   Valid values of the LogicalResourceIdPattern parameter if a resource belongs to the root module:
             * 
             *     *   `server`: In this case, the `count` or `for_each` parameter is not contained in the resource. The value of the `ResourcePath` parameter is `server`.
             *     *   `server[*]`: In this case, the `count` or `for_each` parameter is contained in the resource. The value of the `ResourcePath` parameter is `server`.
             * 
             * *   Valid values of the LogicalResourceIdPattern parameter if a resource belongs to a child module:
             * 
             *     *   `app.server`: In this case, the `count` or `for_each` parameter is not contained in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.server`.
             *     *   `app.server[*]`: In this case, the `count` or `for_each` parameter is contained in the `server` resource, but not in the `app` module. The value of the `ResourcePath` parameter is `app.server`.
             *     *   `app[*].server`: In this case, the `count` or `for_each` parameter is contained in the `app` module, but not in the `server` resource. The value of the `ResourcePath` parameter is `app.server`.
             *     *   `app[*].server[*]`: In this case, the `count` or `for_each` parameter is contained in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.server`.
             *     *   `app.app_group[*].server`: In this case, the `count` or `for_each` parameter is contained in the `app_group` module, but not in the `app` module and the `server` resource. The value of the `ResourcePath` parameter is `app.app_group.server`. The `app_group` module is a child module of the `app` module.
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
        @NameInMap("ParametersAllowedToBeModified")
        private java.util.List < String > parametersAllowedToBeModified;

        @NameInMap("ParametersCauseInterruptionIfModified")
        private java.util.List < String > parametersCauseInterruptionIfModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List < String > parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        private java.util.List < String > parametersConditionallyCauseInterruptionIfModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List < String > parametersNotAllowedToBeModified;

        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        private java.util.List < String > parametersUncertainlyAllowedToBeModified;

        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified;

        private UpdateInfo(Builder builder) {
            this.parametersAllowedToBeModified = builder.parametersAllowedToBeModified;
            this.parametersCauseInterruptionIfModified = builder.parametersCauseInterruptionIfModified;
            this.parametersConditionallyAllowedToBeModified = builder.parametersConditionallyAllowedToBeModified;
            this.parametersConditionallyCauseInterruptionIfModified = builder.parametersConditionallyCauseInterruptionIfModified;
            this.parametersNotAllowedToBeModified = builder.parametersNotAllowedToBeModified;
            this.parametersUncertainlyAllowedToBeModified = builder.parametersUncertainlyAllowedToBeModified;
            this.parametersUncertainlyCauseInterruptionIfModified = builder.parametersUncertainlyCauseInterruptionIfModified;
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

        public static final class Builder {
            private java.util.List < String > parametersAllowedToBeModified; 
            private java.util.List < String > parametersCauseInterruptionIfModified; 
            private java.util.List < String > parametersConditionallyAllowedToBeModified; 
            private java.util.List < String > parametersConditionallyCauseInterruptionIfModified; 
            private java.util.List < String > parametersNotAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified; 

            /**
             * The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions. If you change only values of the parameters in a stack template and use the template to update the stack, service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List < String > parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters that can be modified under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values of the parameters determine whether validation errors are caused.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values and the update type determine whether service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List < String > parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List < String > parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersUncertainlyCauseInterruptionIfModified(java.util.List < String > parametersUncertainlyCauseInterruptionIfModified) {
                this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
                return this;
            }

            public UpdateInfo build() {
                return new UpdateInfo(this);
            } 

        } 

    }
}
