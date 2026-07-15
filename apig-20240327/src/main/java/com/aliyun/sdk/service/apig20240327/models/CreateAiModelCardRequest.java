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
 * {@link CreateAiModelCardRequest} extends {@link RequestModel}
 *
 * <p>CreateAiModelCardRequest</p>
 */
public class CreateAiModelCardRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("meta")
    private Meta meta;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProvider;

    private CreateAiModelCardRequest(Builder builder) {
        super(builder);
        this.availablePaths = builder.availablePaths;
        this.credit = builder.credit;
        this.features = builder.features;
        this.gatewayId = builder.gatewayId;
        this.meta = builder.meta;
        this.modelName = builder.modelName;
        this.modelProvider = builder.modelProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiModelCardRequest create() {
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
     * @return modelProvider
     */
    public String getModelProvider() {
        return this.modelProvider;
    }

    public static final class Builder extends Request.Builder<CreateAiModelCardRequest, Builder> {
        private java.util.List<AvailablePaths> availablePaths; 
        private Credit credit; 
        private java.util.Map<String, ?> features; 
        private String gatewayId; 
        private Meta meta; 
        private String modelName; 
        private String modelProvider; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiModelCardRequest request) {
            super(request);
            this.availablePaths = request.availablePaths;
            this.credit = request.credit;
            this.features = request.features;
            this.gatewayId = request.gatewayId;
            this.meta = request.meta;
            this.modelName = request.modelName;
            this.modelProvider = request.modelProvider;
        } 

        /**
         * availablePaths.
         */
        public Builder availablePaths(java.util.List<AvailablePaths> availablePaths) {
            this.putBodyParameter("availablePaths", availablePaths);
            this.availablePaths = availablePaths;
            return this;
        }

        /**
         * credit.
         */
        public Builder credit(Credit credit) {
            this.putBodyParameter("credit", credit);
            this.credit = credit;
            return this;
        }

        /**
         * features.
         */
        public Builder features(java.util.Map<String, ?> features) {
            this.putBodyParameter("features", features);
            this.features = features;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-8c13d2b4f8a1</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Meta meta) {
            this.putBodyParameter("meta", meta);
            this.meta = meta;
            return this;
        }

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder modelProvider(String modelProvider) {
            this.putBodyParameter("modelProvider", modelProvider);
            this.modelProvider = modelProvider;
            return this;
        }

        @Override
        public CreateAiModelCardRequest build() {
            return new CreateAiModelCardRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAiModelCardRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelCardRequest</p>
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
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * type.
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
     * {@link CreateAiModelCardRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelCardRequest</p>
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
             * cacheCost.
             */
            public Builder cacheCost(Float cacheCost) {
                this.cacheCost = cacheCost;
                return this;
            }

            /**
             * inputCost.
             */
            public Builder inputCost(Float inputCost) {
                this.inputCost = inputCost;
                return this;
            }

            /**
             * outputCost.
             */
            public Builder outputCost(Float outputCost) {
                this.outputCost = outputCost;
                return this;
            }

            /**
             * type.
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
     * {@link CreateAiModelCardRequest} extends {@link TeaModel}
     *
     * <p>CreateAiModelCardRequest</p>
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
             * maxInputTokens.
             */
            public Builder maxInputTokens(Long maxInputTokens) {
                this.maxInputTokens = maxInputTokens;
                return this;
            }

            /**
             * maxOutputTokens.
             */
            public Builder maxOutputTokens(Long maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * maxTokens.
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * supportedInputModalities.
             */
            public Builder supportedInputModalities(java.util.List<String> supportedInputModalities) {
                this.supportedInputModalities = supportedInputModalities;
                return this;
            }

            /**
             * supportedOutputModalities.
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
