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
 * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAiModelProviderResponseBody</p>
 */
public class CreateAiModelProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAiModelProviderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiModelProviderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAiModelProviderResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>464F9EA0-1052-51BD-8187-D292AA2D8D24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAiModelProviderResponseBody build() {
            return new CreateAiModelProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAiModelProviderResponseBody</p>
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
     * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAiModelProviderResponseBody</p>
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
     * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAiModelProviderResponseBody</p>
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
    /**
     * 
     * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAiModelProviderResponseBody</p>
     */
    public static class ModelCards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("availablePaths")
        private java.util.List<AvailablePaths> availablePaths;

        @com.aliyun.core.annotation.NameInMap("credit")
        private Credit credit;

        @com.aliyun.core.annotation.NameInMap("features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("meta")
        private Meta meta;

        @com.aliyun.core.annotation.NameInMap("modelCardId")
        private String modelCardId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelProvider")
        private String modelProvider;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceURL")
        private String sourceURL;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private ModelCards(Builder builder) {
            this.availablePaths = builder.availablePaths;
            this.credit = builder.credit;
            this.features = builder.features;
            this.gatewayId = builder.gatewayId;
            this.meta = builder.meta;
            this.modelCardId = builder.modelCardId;
            this.modelName = builder.modelName;
            this.modelProvider = builder.modelProvider;
            this.source = builder.source;
            this.sourceURL = builder.sourceURL;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelCards create() {
            return builder().build();
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
         * @return modelCardId
         */
        public String getModelCardId() {
            return this.modelCardId;
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

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceURL
         */
        public String getSourceURL() {
            return this.sourceURL;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<AvailablePaths> availablePaths; 
            private Credit credit; 
            private java.util.Map<String, ?> features; 
            private String gatewayId; 
            private Meta meta; 
            private String modelCardId; 
            private String modelName; 
            private String modelProvider; 
            private String source; 
            private String sourceURL; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(ModelCards model) {
                this.availablePaths = model.availablePaths;
                this.credit = model.credit;
                this.features = model.features;
                this.gatewayId = model.gatewayId;
                this.meta = model.meta;
                this.modelCardId = model.modelCardId;
                this.modelName = model.modelName;
                this.modelProvider = model.modelProvider;
                this.source = model.source;
                this.sourceURL = model.sourceURL;
                this.updateTime = model.updateTime;
            } 

            /**
             * availablePaths.
             */
            public Builder availablePaths(java.util.List<AvailablePaths> availablePaths) {
                this.availablePaths = availablePaths;
                return this;
            }

            /**
             * credit.
             */
            public Builder credit(Credit credit) {
                this.credit = credit;
                return this;
            }

            /**
             * features.
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * modelCardId.
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * modelProvider.
             */
            public Builder modelProvider(String modelProvider) {
                this.modelProvider = modelProvider;
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
             * sourceURL.
             */
            public Builder sourceURL(String sourceURL) {
                this.sourceURL = sourceURL;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ModelCards build() {
                return new ModelCards(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAiModelProviderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAiModelProviderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("boundServices")
        private java.util.List<ServiceInfo> boundServices;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("modelCards")
        private java.util.List<ModelCards> modelCards;

        @com.aliyun.core.annotation.NameInMap("modelCount")
        private Integer modelCount;

        @com.aliyun.core.annotation.NameInMap("modelProviderId")
        private String modelProviderId;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.boundServices = builder.boundServices;
            this.displayName = builder.displayName;
            this.gatewayId = builder.gatewayId;
            this.modelCards = builder.modelCards;
            this.modelCount = builder.modelCount;
            this.modelProviderId = builder.modelProviderId;
            this.provider = builder.provider;
            this.source = builder.source;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boundServices
         */
        public java.util.List<ServiceInfo> getBoundServices() {
            return this.boundServices;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return modelCards
         */
        public java.util.List<ModelCards> getModelCards() {
            return this.modelCards;
        }

        /**
         * @return modelCount
         */
        public Integer getModelCount() {
            return this.modelCount;
        }

        /**
         * @return modelProviderId
         */
        public String getModelProviderId() {
            return this.modelProviderId;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<ServiceInfo> boundServices; 
            private String displayName; 
            private String gatewayId; 
            private java.util.List<ModelCards> modelCards; 
            private Integer modelCount; 
            private String modelProviderId; 
            private String provider; 
            private String source; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boundServices = model.boundServices;
                this.displayName = model.displayName;
                this.gatewayId = model.gatewayId;
                this.modelCards = model.modelCards;
                this.modelCount = model.modelCount;
                this.modelProviderId = model.modelProviderId;
                this.provider = model.provider;
                this.source = model.source;
                this.updateTime = model.updateTime;
            } 

            /**
             * boundServices.
             */
            public Builder boundServices(java.util.List<ServiceInfo> boundServices) {
                this.boundServices = boundServices;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * modelCards.
             */
            public Builder modelCards(java.util.List<ModelCards> modelCards) {
                this.modelCards = modelCards;
                return this;
            }

            /**
             * modelCount.
             */
            public Builder modelCount(Integer modelCount) {
                this.modelCount = modelCount;
                return this;
            }

            /**
             * modelProviderId.
             */
            public Builder modelProviderId(String modelProviderId) {
                this.modelProviderId = modelProviderId;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
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
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
