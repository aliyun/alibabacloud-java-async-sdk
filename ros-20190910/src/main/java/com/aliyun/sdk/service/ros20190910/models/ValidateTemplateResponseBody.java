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

    private ValidateTemplateResponseBody(Builder builder) {
        this.description = builder.description;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.resourceTypes = builder.resourceTypes;
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

    public static final class Builder {
        private String description; 
        private java.util.List < Outputs> outputs; 
        private java.util.List < java.util.Map<String, ?>> parameters; 
        private String requestId; 
        private ResourceTypes resourceTypes; 

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

        public ValidateTemplateResponseBody build() {
            return new ValidateTemplateResponseBody(this);
        } 

    } 

    public static class Outputs extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("OutputKey")
        private String outputKey;

        private Outputs(Builder builder) {
            this.description = builder.description;
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
         * @return outputKey
         */
        public String getOutputKey() {
            return this.outputKey;
        }

        public static final class Builder {
            private String description; 
            private String outputKey; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
}
