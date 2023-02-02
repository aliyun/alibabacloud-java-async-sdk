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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(java.util.List < Outputs> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < java.util.Map<String, ?>> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(ResourceTypes resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * UpdateInfo.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * OutputKey.
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
             * DataSources.
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * Resources.
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
             * LogicalResourceIdPattern.
             */
            public Builder logicalResourceIdPattern(String logicalResourceIdPattern) {
                this.logicalResourceIdPattern = logicalResourceIdPattern;
                return this;
            }

            /**
             * ResourcePath.
             */
            public Builder resourcePath(String resourcePath) {
                this.resourcePath = resourcePath;
                return this;
            }

            /**
             * ResourceType.
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
             * ParametersAllowedToBeModified.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * ParametersCauseInterruptionIfModified.
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List < String > parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * ParametersConditionallyAllowedToBeModified.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * ParametersConditionallyCauseInterruptionIfModified.
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List < String > parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * ParametersNotAllowedToBeModified.
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * ParametersUncertainlyAllowedToBeModified.
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List < String > parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * ParametersUncertainlyCauseInterruptionIfModified.
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
