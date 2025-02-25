// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionResourceRequest</p>
 */
public class CreateFunctionResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private CreateFunctionResourceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.data = builder.data;
        this.description = builder.description;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<CreateFunctionResourceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private Data data; 
        private String description; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionResourceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.data = request.data;
            this.description = request.description;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The resource data. The data structure varies with the resource type.
         */
        public Builder data(Data data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The description of the resource.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the resource.
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * The resource type.
         * <p>
         * 
         * Valid values:
         * 
         * *   feature_generator
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   raw_file
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public CreateFunctionResourceRequest build() {
            return new CreateFunctionResourceRequest(this);
        } 

    } 

    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Features(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * The name of the feature.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the feature.
             * <p>
             * 
             * Valid values:
             * 
             * *   item
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   user
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List < Features> features;

        private Input(Builder builder) {
            this.features = builder.features;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.List < Features> getFeatures() {
            return this.features;
        }

        public static final class Builder {
            private java.util.List < Features> features; 

            /**
             * The input features.
             */
            public Builder features(java.util.List < Features> features) {
                this.features = features;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Generators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Generator")
        private String generator;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private Generators(Builder builder) {
            this.generator = builder.generator;
            this.input = builder.input;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Generators create() {
            return builder().build();
        }

        /**
         * @return generator
         */
        public String getGenerator() {
            return this.generator;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String generator; 
            private Input input; 
            private String output; 

            /**
             * The type of the feature generator.
             * <p>
             * 
             * Valid values:
             * 
             * *   lookup
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   sequence
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   overlap
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   raw
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   combo
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   id
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder generator(String generator) {
                this.generator = generator;
                return this;
            }

            /**
             * The input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The name of the output feature.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Generators build() {
                return new Generators(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Generators")
        private java.util.List < Generators> generators;

        private Data(Builder builder) {
            this.content = builder.content;
            this.generators = builder.generators;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return generators
         */
        public java.util.List < Generators> getGenerators() {
            return this.generators;
        }

        public static final class Builder {
            private String content; 
            private java.util.List < Generators> generators; 

            /**
             * The content of the file that corresponds to a resource of the raw_file type.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The feature generators that correspond to resources of the feature_generator type.
             */
            public Builder generators(java.util.List < Generators> generators) {
                this.generators = generators;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
