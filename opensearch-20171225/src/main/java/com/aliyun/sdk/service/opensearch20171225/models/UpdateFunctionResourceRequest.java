// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateFunctionResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionResourceRequest</p>
 */
public class UpdateFunctionResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("resourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private UpdateFunctionResourceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.resourceName = builder.resourceName;
        this.data = builder.data;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionResourceRequest create() {
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
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

    public static final class Builder extends Request.Builder<UpdateFunctionResourceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String resourceName; 
        private Data data; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionResourceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.resourceName = request.resourceName;
            this.data = request.data;
            this.description = request.description;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The name of the feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rank</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The name of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fg_json</p>
         */
        public Builder resourceName(String resourceName) {
            this.putPathParameter("resourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The resource data. The data structure varies with the resource type.</p>
         */
        public Builder data(Data data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>updated description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateFunctionResourceRequest build() {
            return new UpdateFunctionResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFunctionResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateFunctionResourceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Features model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>system_item_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>item</p>
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
    /**
     * 
     * {@link UpdateFunctionResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateFunctionResourceRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<Features> features;

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
        public java.util.List<Features> getFeatures() {
            return this.features;
        }

        public static final class Builder {
            private java.util.List<Features> features; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.features = model.features;
            } 

            /**
             * <p>The input features.</p>
             */
            public Builder features(java.util.List<Features> features) {
                this.features = features;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateFunctionResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateFunctionResourceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Generators model) {
                this.generator = model.generator;
                this.input = model.input;
                this.output = model.output;
            } 

            /**
             * <p>The type of the feature generator.</p>
             * 
             * <strong>example:</strong>
             * <p>combo</p>
             */
            public Builder generator(String generator) {
                this.generator = generator;
                return this;
            }

            /**
             * <p>The input.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The name of the output feature.</p>
             * 
             * <strong>example:</strong>
             * <p>feature1</p>
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
    /**
     * 
     * {@link UpdateFunctionResourceRequest} extends {@link TeaModel}
     *
     * <p>UpdateFunctionResourceRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Generators")
        private java.util.List<Generators> generators;

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
        public java.util.List<Generators> getGenerators() {
            return this.generators;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<Generators> generators; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.generators = model.generators;
            } 

            /**
             * <p>The content of the file that corresponds to a resource of the raw_file type.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The feature generators that correspond to resources of the feature_generator type.</p>
             */
            public Builder generators(java.util.List<Generators> generators) {
                this.generators = generators;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
