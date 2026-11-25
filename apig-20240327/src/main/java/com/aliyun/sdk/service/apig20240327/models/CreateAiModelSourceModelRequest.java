// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateAiModelSourceModelRequest} extends {@link RequestModel}
 *
 * <p>CreateAiModelSourceModelRequest</p>
 */
public class CreateAiModelSourceModelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("availablePaths")
    private java.util.List<AvailablePaths> availablePaths;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credit")
    private Credit credit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("features")
    private java.util.Map<String, ?> features;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateAiModelSourceModelRequest(Builder builder) {
        super(builder);
        this.availablePaths = builder.availablePaths;
        this.credit = builder.credit;
        this.features = builder.features;
        this.meta = builder.meta;
        this.modelName = builder.modelName;
        this.modelSourceId = builder.modelSourceId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiModelSourceModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availablePaths
     */
    public java.util.List<AvailablePaths> getAvailablePaths() {
        return this.availablePaths;
    }

    /**
     * @return credit
     */
    public Credit getCredit() {
        return this.credit;
    }

    /**
     * @return features
     */
    public java.util.Map<String, ?> getFeatures() {
        return this.features;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelSourceId
     */
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateAiModelSourceModelRequest, Builder> {
        private java.util.List<AvailablePaths> availablePaths; 
        private Credit credit; 
        private java.util.Map<String, ?> features; 
        private Meta meta; 
        private String modelName; 
        private String modelSourceId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiModelSourceModelRequest request) {
            super(request);
            this.availablePaths = request.availablePaths;
            this.credit = request.credit;
            this.features = request.features;
            this.meta = request.meta;
            this.modelName = request.modelName;
            this.modelSourceId = request.modelSourceId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The protocols and invocation paths supported by the model.</p>
         */
        public Builder availablePaths(java.util.List<AvailablePaths> availablePaths) {
            this.putBodyParameter("availablePaths", availablePaths);
            this.availablePaths = availablePaths;
            return this;
        }

        /**
         * <p>The credit pricing configuration of the model.</p>
         */
        public Builder credit(Credit credit) {
            this.putBodyParameter("credit", credit);
            this.credit = credit;
            return this;
        }

        /**
         * <p>The set of capabilities declared by the model. The key is the capability name, and the value indicates whether the capability is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;nativeStreaming&quot;:true}</p>
         */
        public Builder features(java.util.Map<String, ?> features) {
            this.putBodyParameter("features", features);
            this.features = features;
            return this;
        }

        /**
         * <p>The token limits and input and output modality information of the model.</p>
         */
        public Builder meta(Meta meta) {
            this.putBodyParameter("meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * <p>The actual model name used by the upstream service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("modelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The ID of the model source. Use the modelSourceId returned by the CreateAiModelSource operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-d00000000000000000000</p>
         */
        public Builder modelSourceId(String modelSourceId) {
            this.putBodyParameter("modelSourceId", modelSourceId);
            this.modelSourceId = modelSourceId;
            return this;
        }

        /**
         * <p>The client-generated idempotency token used to identify the same creation or retry operation.</p>
         * 
         * <strong>example:</strong>
         * <p>b1907ca4-952c-4c5f-8d1f-0aa6ae339c96</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateAiModelSourceModelRequest build() {
            return new CreateAiModelSourceModelRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAiModelSourceModelRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelSourceModelRequest</p>
     */
    public static class AvailablePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AvailablePaths(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailablePaths create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(AvailablePaths model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The invocation path of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The protocol type used by the invocation path.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAI/v1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AvailablePaths build() {
                return new AvailablePaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAiModelSourceModelRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelSourceModelRequest</p>
     */
    public static class Credit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cacheCost")
        private Float cacheCost;

        @com.aliyun.core.annotation.NameInMap("inputCost")
        private Float inputCost;

        @com.aliyun.core.annotation.NameInMap("outputCost")
        private Float outputCost;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Credit(Builder builder) {
            this.cacheCost = builder.cacheCost;
            this.inputCost = builder.inputCost;
            this.outputCost = builder.outputCost;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credit create() {
            return builder().build();
        }

        /**
         * @return cacheCost
         */
        public Float getCacheCost() {
            return this.cacheCost;
        }

        /**
         * @return inputCost
         */
        public Float getInputCost() {
            return this.inputCost;
        }

        /**
         * @return outputCost
         */
        public Float getOutputCost() {
            return this.outputCost;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Float cacheCost; 
            private Float inputCost; 
            private Float outputCost; 
            private String type; 

            private Builder() {
            } 

            private Builder(Credit model) {
                this.cacheCost = model.cacheCost;
                this.inputCost = model.inputCost;
                this.outputCost = model.outputCost;
                this.type = model.type;
            } 

            /**
             * <p>The number of credits per million input tokens that hit the cache. The value must be a non-negative number. A value of 0 indicates that cached input is free of charge.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder cacheCost(Float cacheCost) {
                this.cacheCost = cacheCost;
                return this;
            }

            /**
             * <p>The number of credits per million input tokens. The value must be a non-negative number. A value of 0 indicates that the input is free of charge.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputCost(Float inputCost) {
                this.inputCost = inputCost;
                return this;
            }

            /**
             * <p>The number of credits per million output tokens. The value must be a non-negative number. A value of 0 indicates that the output is free of charge.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outputCost(Float outputCost) {
                this.outputCost = outputCost;
                return this;
            }

            /**
             * <p>The pricing method. Valid values: fixed (fixed credit pricing).</p>
             * 
             * <strong>example:</strong>
             * <p>fixed</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Credit build() {
                return new Credit(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAiModelSourceModelRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelSourceModelRequest</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxInputTokens")
        private Long maxInputTokens;

        @com.aliyun.core.annotation.NameInMap("maxOutputTokens")
        private Long maxOutputTokens;

        @com.aliyun.core.annotation.NameInMap("maxTokens")
        private Long maxTokens;

        @com.aliyun.core.annotation.NameInMap("supportedInputModalities")
        private java.util.List<String> supportedInputModalities;

        @com.aliyun.core.annotation.NameInMap("supportedOutputModalities")
        private java.util.List<String> supportedOutputModalities;

        private Meta(Builder builder) {
            this.maxInputTokens = builder.maxInputTokens;
            this.maxOutputTokens = builder.maxOutputTokens;
            this.maxTokens = builder.maxTokens;
            this.supportedInputModalities = builder.supportedInputModalities;
            this.supportedOutputModalities = builder.supportedOutputModalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return maxInputTokens
         */
        public Long getMaxInputTokens() {
            return this.maxInputTokens;
        }

        /**
         * @return maxOutputTokens
         */
        public Long getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        /**
         * @return maxTokens
         */
        public Long getMaxTokens() {
            return this.maxTokens;
        }

        /**
         * @return supportedInputModalities
         */
        public java.util.List<String> getSupportedInputModalities() {
            return this.supportedInputModalities;
        }

        /**
         * @return supportedOutputModalities
         */
        public java.util.List<String> getSupportedOutputModalities() {
            return this.supportedOutputModalities;
        }

        public static final class Builder {
            private Long maxInputTokens; 
            private Long maxOutputTokens; 
            private Long maxTokens; 
            private java.util.List<String> supportedInputModalities; 
            private java.util.List<String> supportedOutputModalities; 

            private Builder() {
            } 

            private Builder(Meta model) {
                this.maxInputTokens = model.maxInputTokens;
                this.maxOutputTokens = model.maxOutputTokens;
                this.maxTokens = model.maxTokens;
                this.supportedInputModalities = model.supportedInputModalities;
                this.supportedOutputModalities = model.supportedOutputModalities;
            } 

            /**
             * <p>The maximum number of input tokens supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>32768</p>
             */
            public Builder maxInputTokens(Long maxInputTokens) {
                this.maxInputTokens = maxInputTokens;
                return this;
            }

            /**
             * <p>The maximum number of output tokens supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder maxOutputTokens(Long maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * <p>The maximum number of context tokens supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>40960</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The input modalities supported by the model.</p>
             */
            public Builder supportedInputModalities(java.util.List<String> supportedInputModalities) {
                this.supportedInputModalities = supportedInputModalities;
                return this;
            }

            /**
             * <p>The output modalities supported by the model.</p>
             */
            public Builder supportedOutputModalities(java.util.List<String> supportedOutputModalities) {
                this.supportedOutputModalities = supportedOutputModalities;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
