// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The outputs of the template.</p>
         */
        public Builder outputs(java.util.List < Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The parameters that are defined in the Parameters section of the template.</p>
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource types that are used in the template.</p>
         */
        public Builder resourceTypes(ResourceTypes resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The regular resources that are defined in the template.</p>
         * <blockquote>
         * <ul>
         * <li>For a Resource Orchestration Service (ROS) template, the resource whose definition contains <code>Count</code> is not displayed as a list.</li>
         * <li>For a Terraform template, the resource whose definition contains <code>count</code> or <code>for_each</code> is not displayed as a list.</li>
         * </ul>
         * </blockquote>
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The information about the stack update. This parameter cannot be returned if the value of UpdateInfoOptions contains Disabled.</p>
         */
        public Builder updateInfo(UpdateInfo updateInfo) {
            this.updateInfo = updateInfo;
            return this;
        }

        public ValidateTemplateResponseBody build() {
            return new ValidateTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateTemplateResponseBody</p>
     */
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
             * <p>The description of the template output.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance ID of my ECS.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The alias of the template output.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance ID</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The name of the template output.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_id</p>
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
    /**
     * 
     * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateTemplateResponseBody</p>
     */
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
             * <p>The DataSource resource types that are used in the template. The value is deduplicated.</p>
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>The regular resource types that are used in the template. The value is deduplicated.</p>
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
    /**
     * 
     * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateTemplateResponseBody</p>
     */
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
             * <p>The pattern in which the logical IDs of regular resources are formed.</p>
             * <p>If resources are defined in a ROS template, the following rules apply:</p>
             * <ul>
             * <li>Resource whose definition does not contain <code>Count</code>: If the resource name defined in the template is <code>server</code>, the values of LogicalResourceIdPattern and <code>ResourcePath</code> are both <code>server</code>.``</li>
             * <li>Resource whose definition contains <code>Count</code>: If the resource name defined in the template is <code>server</code>, the value of LogicalResourceIdPattern is <code>server[*]</code>, and the value of <code>ResourcePath</code> is <code>server</code>.</li>
             * </ul>
             * <p>If resources and <a href="https://www.terraform.io/language/modules">modules</a> are defined in a Terraform template, the following rules apply:</p>
             * <ul>
             * <li>Resource and module whose definitions do not contain <a href="https://www.terraform.io/language/meta-arguments/count"><code>count</code></a> or <a href="https://www.terraform.io/language/meta-arguments/for_each"><code>for_each</code></a>: If the resource name defined in the template is <code>server</code>, the values of LogicalResourceIdPattern and <code>ResourcePath</code> are both <code>server</code>.``</li>
             * <li>Resource and module whose definitions contain <a href="https://www.terraform.io/language/meta-arguments/count"><code>count</code></a> or <a href="https://www.terraform.io/language/meta-arguments/for_each"><code>for_each</code></a>: If the resource name defined in the template is <code>server</code>, the value of LogicalResourceIdPattern is <code>server[*]</code>, and the value of <code>ResourcePath</code> is <code>server</code>.</li>
             * </ul>
             * <p>Examples of LogicalResourceIdPattern for resources in a Terraform template:</p>
             * <ul>
             * <li><p>Valid values of LogicalResourceIdPattern if a resource belongs to the root module:</p>
             * <ul>
             * <li><code>server</code>: In this case, <code>count</code> and <code>for_each</code> are not contained in the resource. The value of <code>ResourcePath</code> is <code>server</code>.</li>
             * <li><code>server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the resource. The value of <code>ResourcePath</code> is <code>server</code>.</li>
             * </ul>
             * </li>
             * <li><p>Valid values of LogicalResourceIdPattern if a resource belongs to a child module:</p>
             * <ul>
             * <li><code>app.server</code>: In this case, <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.````</li>
             * <li><code>app.server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>server</code> resource, but <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module. The value of <code>ResourcePath</code> is <code>app.server</code>.</li>
             * <li><code>app[*].server</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app</code> module, but <code>count</code> and <code>for_each</code> are not contained in the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.</li>
             * <li><code>app[*].server[*]</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.server</code>.````</li>
             * <li><code>app.app_group[*].server</code>: In this case, <code>count</code> or <code>for_each</code> is contained in the <code>app_group</code> module, but <code>count</code> and <code>for_each</code> are not contained in the <code>app</code> module and the <code>server</code> resource. The value of <code>ResourcePath</code> is <code>app.app_group.server</code>. The <code>app_group</code> module is a child module of the <code>app</code> module.````</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>server</p>
             */
            public Builder logicalResourceIdPattern(String logicalResourceIdPattern) {
                this.logicalResourceIdPattern = logicalResourceIdPattern;
                return this;
            }

            /**
             * <p>The path of the regular resource. In most cases, the path of a regular resource is the same as the resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>server</p>
             */
            public Builder resourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
                return this;
            }

            /**
             * <p>The regular resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::InstanceGroup</p>
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
    /**
     * 
     * {@link ValidateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ValidateTemplateResponseBody</p>
     */
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
             * <p>The parameters that can be modified.</p>
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List < String > parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersCauseReplacementIfModified(java.util.List < String > parametersCauseReplacementIfModified) {
                this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
                return this;
            }

            /**
             * <p>The parameters that can be modified under specific conditions.</p>
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions under specific conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List < String > parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources under specific conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersConditionallyCauseReplacementIfModified(java.util.List < String > parametersConditionallyCauseReplacementIfModified) {
                this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
                return this;
            }

            /**
             * <p>The parameters that cannot be modified.</p>
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters that can be modified under uncertain conditions.</p>
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List < String > parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions under uncertain conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersUncertainlyCauseInterruptionIfModified(java.util.List < String > parametersUncertainlyCauseInterruptionIfModified) {
                this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources under uncertain conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if the value of UpdateInfoOptions contains EnableReplacement.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
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
