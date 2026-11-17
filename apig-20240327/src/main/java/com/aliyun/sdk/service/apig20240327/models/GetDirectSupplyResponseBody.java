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
 * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectSupplyResponseBody</p>
 */
public class GetDirectSupplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDirectSupplyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectSupplyResponseBody create() {
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

        private Builder(GetDirectSupplyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDirectSupplyResponseBody build() {
            return new GetDirectSupplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
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
             * <p>The invocation path.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type.</p>
             * 
             * <strong>example:</strong>
             * <p>type-xxxxxxxx</p>
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
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
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
             * <p>The unit price of cache-hit tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.001</p>
             */
            public Builder cacheCost(Float cacheCost) {
                this.cacheCost = cacheCost;
                return this;
            }

            /**
             * <p>The unit price of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.004</p>
             */
            public Builder inputCost(Float inputCost) {
                this.inputCost = inputCost;
                return this;
            }

            /**
             * <p>The unit price of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.012</p>
             */
            public Builder outputCost(Float outputCost) {
                this.outputCost = outputCost;
                return this;
            }

            /**
             * <p>The billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>type-xxxxxxxx</p>
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
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
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
             * <p>The maximum number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>128000</p>
             */
            public Builder maxInputTokens(Long maxInputTokens) {
                this.maxInputTokens = maxInputTokens;
                return this;
            }

            /**
             * <p>The maximum number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder maxOutputTokens(Long maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * <p>The maximum total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The list of supported input modalities.</p>
             */
            public Builder supportedInputModalities(java.util.List<String> supportedInputModalities) {
                this.supportedInputModalities = supportedInputModalities;
                return this;
            }

            /**
             * <p>The list of supported output modalities.</p>
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
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class CandidateModels extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("modelSourceId")
        private String modelSourceId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private CandidateModels(Builder builder) {
            this.availablePaths = builder.availablePaths;
            this.credit = builder.credit;
            this.features = builder.features;
            this.gatewayId = builder.gatewayId;
            this.meta = builder.meta;
            this.modelCardId = builder.modelCardId;
            this.modelName = builder.modelName;
            this.modelProvider = builder.modelProvider;
            this.modelSourceId = builder.modelSourceId;
            this.source = builder.source;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CandidateModels create() {
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
         * @return modelSourceId
         */
        public String getModelSourceId() {
            return this.modelSourceId;
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
            private java.util.List<AvailablePaths> availablePaths; 
            private Credit credit; 
            private java.util.Map<String, ?> features; 
            private String gatewayId; 
            private Meta meta; 
            private String modelCardId; 
            private String modelName; 
            private String modelProvider; 
            private String modelSourceId; 
            private String source; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(CandidateModels model) {
                this.availablePaths = model.availablePaths;
                this.credit = model.credit;
                this.features = model.features;
                this.gatewayId = model.gatewayId;
                this.meta = model.meta;
                this.modelCardId = model.modelCardId;
                this.modelName = model.modelName;
                this.modelProvider = model.modelProvider;
                this.modelSourceId = model.modelSourceId;
                this.source = model.source;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list of available invocation paths.</p>
             */
            public Builder availablePaths(java.util.List<AvailablePaths> availablePaths) {
                this.availablePaths = availablePaths;
                return this;
            }

            /**
             * <p>The billing information of the model.</p>
             */
            public Builder credit(Credit credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The capabilities and features supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;nativeStreaming&quot;:true}</p>
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The capability information of the model.</p>
             */
            public Builder meta(Meta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The ID of the model card, which starts with msc-.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-xxxxxxxx</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model provider.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder modelProvider(String modelProvider) {
                this.modelProvider = modelProvider;
                return this;
            }

            /**
             * <p>The ID of the model source.</p>
             * 
             * <strong>example:</strong>
             * <p>model-source-xxxxxxxx</p>
             */
            public Builder modelSourceId(String modelSourceId) {
                this.modelSourceId = modelSourceId;
                return this;
            }

            /**
             * <p>The source of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>source-xxxxxxxx</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-15T10:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CandidateModels build() {
                return new CandidateModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class CatalogError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        private CatalogError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CatalogError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
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
            private String message; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(CatalogError model) {
                this.code = model.code;
                this.message = model.message;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Model catalog query failed</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public CatalogError build() {
                return new CatalogError(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class ModelsAvailablePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ModelsAvailablePaths(Builder builder) {
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelsAvailablePaths create() {
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

            private Builder(ModelsAvailablePaths model) {
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * <p>The invocation path.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/chat/completions</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The path type.</p>
             * 
             * <strong>example:</strong>
             * <p>type-xxxxxxxx</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ModelsAvailablePaths build() {
                return new ModelsAvailablePaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class ModelsCredit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cacheCost")
        private Float cacheCost;

        @com.aliyun.core.annotation.NameInMap("inputCost")
        private Float inputCost;

        @com.aliyun.core.annotation.NameInMap("outputCost")
        private Float outputCost;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ModelsCredit(Builder builder) {
            this.cacheCost = builder.cacheCost;
            this.inputCost = builder.inputCost;
            this.outputCost = builder.outputCost;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelsCredit create() {
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

            private Builder(ModelsCredit model) {
                this.cacheCost = model.cacheCost;
                this.inputCost = model.inputCost;
                this.outputCost = model.outputCost;
                this.type = model.type;
            } 

            /**
             * <p>The unit price of cache-hit tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.001</p>
             */
            public Builder cacheCost(Float cacheCost) {
                this.cacheCost = cacheCost;
                return this;
            }

            /**
             * <p>The unit price of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.004</p>
             */
            public Builder inputCost(Float inputCost) {
                this.inputCost = inputCost;
                return this;
            }

            /**
             * <p>The unit price of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>0.012</p>
             */
            public Builder outputCost(Float outputCost) {
                this.outputCost = outputCost;
                return this;
            }

            /**
             * <p>The billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>type-xxxxxxxx</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ModelsCredit build() {
                return new ModelsCredit(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class ModelsMeta extends TeaModel {
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

        private ModelsMeta(Builder builder) {
            this.maxInputTokens = builder.maxInputTokens;
            this.maxOutputTokens = builder.maxOutputTokens;
            this.maxTokens = builder.maxTokens;
            this.supportedInputModalities = builder.supportedInputModalities;
            this.supportedOutputModalities = builder.supportedOutputModalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelsMeta create() {
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

            private Builder(ModelsMeta model) {
                this.maxInputTokens = model.maxInputTokens;
                this.maxOutputTokens = model.maxOutputTokens;
                this.maxTokens = model.maxTokens;
                this.supportedInputModalities = model.supportedInputModalities;
                this.supportedOutputModalities = model.supportedOutputModalities;
            } 

            /**
             * <p>The maximum number of input tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>128000</p>
             */
            public Builder maxInputTokens(Long maxInputTokens) {
                this.maxInputTokens = maxInputTokens;
                return this;
            }

            /**
             * <p>The maximum number of output tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder maxOutputTokens(Long maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * <p>The maximum total number of tokens.</p>
             * 
             * <strong>example:</strong>
             * <p>16384</p>
             */
            public Builder maxTokens(Long maxTokens) {
                this.maxTokens = maxTokens;
                return this;
            }

            /**
             * <p>The list of supported input modalities.</p>
             */
            public Builder supportedInputModalities(java.util.List<String> supportedInputModalities) {
                this.supportedInputModalities = supportedInputModalities;
                return this;
            }

            /**
             * <p>The list of supported output modalities.</p>
             */
            public Builder supportedOutputModalities(java.util.List<String> supportedOutputModalities) {
                this.supportedOutputModalities = supportedOutputModalities;
                return this;
            }

            public ModelsMeta build() {
                return new ModelsMeta(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("availablePaths")
        private java.util.List<ModelsAvailablePaths> availablePaths;

        @com.aliyun.core.annotation.NameInMap("credit")
        private ModelsCredit credit;

        @com.aliyun.core.annotation.NameInMap("features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("meta")
        private ModelsMeta meta;

        @com.aliyun.core.annotation.NameInMap("modelCardId")
        private String modelCardId;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("modelProvider")
        private String modelProvider;

        @com.aliyun.core.annotation.NameInMap("modelSourceId")
        private String modelSourceId;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Models(Builder builder) {
            this.availablePaths = builder.availablePaths;
            this.credit = builder.credit;
            this.features = builder.features;
            this.gatewayId = builder.gatewayId;
            this.meta = builder.meta;
            this.modelCardId = builder.modelCardId;
            this.modelName = builder.modelName;
            this.modelProvider = builder.modelProvider;
            this.modelSourceId = builder.modelSourceId;
            this.source = builder.source;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return availablePaths
         */
        public java.util.List<ModelsAvailablePaths> getAvailablePaths() {
            return this.availablePaths;
        }

        /**
         * @return credit
         */
        public ModelsCredit getCredit() {
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
        public ModelsMeta getMeta() {
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
         * @return modelSourceId
         */
        public String getModelSourceId() {
            return this.modelSourceId;
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
            private java.util.List<ModelsAvailablePaths> availablePaths; 
            private ModelsCredit credit; 
            private java.util.Map<String, ?> features; 
            private String gatewayId; 
            private ModelsMeta meta; 
            private String modelCardId; 
            private String modelName; 
            private String modelProvider; 
            private String modelSourceId; 
            private String source; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.availablePaths = model.availablePaths;
                this.credit = model.credit;
                this.features = model.features;
                this.gatewayId = model.gatewayId;
                this.meta = model.meta;
                this.modelCardId = model.modelCardId;
                this.modelName = model.modelName;
                this.modelProvider = model.modelProvider;
                this.modelSourceId = model.modelSourceId;
                this.source = model.source;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The list of available invocation paths.</p>
             */
            public Builder availablePaths(java.util.List<ModelsAvailablePaths> availablePaths) {
                this.availablePaths = availablePaths;
                return this;
            }

            /**
             * <p>The billing information of the model.</p>
             */
            public Builder credit(ModelsCredit credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The capabilities and features supported by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;nativeStreaming&quot;:true}</p>
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The capability information of the model.</p>
             */
            public Builder meta(ModelsMeta meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The ID of the model card, which starts with msc-.</p>
             * 
             * <strong>example:</strong>
             * <p>msc-xxxxxxxx</p>
             */
            public Builder modelCardId(String modelCardId) {
                this.modelCardId = modelCardId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The model provider.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen</p>
             */
            public Builder modelProvider(String modelProvider) {
                this.modelProvider = modelProvider;
                return this;
            }

            /**
             * <p>The ID of the model source.</p>
             * 
             * <strong>example:</strong>
             * <p>model-source-xxxxxxxx</p>
             */
            public Builder modelSourceId(String modelSourceId) {
                this.modelSourceId = modelSourceId;
                return this;
            }

            /**
             * <p>The source of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>source-xxxxxxxx</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The last update time in ISO 8601 (RFC 3339) format in the UTC time zone, such as 2026-05-15T10:00:00Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-15T10:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDirectSupplyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectSupplyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("candidateModels")
        private java.util.List<CandidateModels> candidateModels;

        @com.aliyun.core.annotation.NameInMap("catalogError")
        private CatalogError catalogError;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("models")
        private java.util.List<Models> models;

        private Data(Builder builder) {
            this.candidateModels = builder.candidateModels;
            this.catalogError = builder.catalogError;
            this.enabled = builder.enabled;
            this.gatewayId = builder.gatewayId;
            this.models = builder.models;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return candidateModels
         */
        public java.util.List<CandidateModels> getCandidateModels() {
            return this.candidateModels;
        }

        /**
         * @return catalogError
         */
        public CatalogError getCatalogError() {
            return this.catalogError;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return models
         */
        public java.util.List<Models> getModels() {
            return this.models;
        }

        public static final class Builder {
            private java.util.List<CandidateModels> candidateModels; 
            private CatalogError catalogError; 
            private Boolean enabled; 
            private String gatewayId; 
            private java.util.List<Models> models; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.candidateModels = model.candidateModels;
                this.catalogError = model.catalogError;
                this.enabled = model.enabled;
                this.gatewayId = model.gatewayId;
                this.models = model.models;
            } 

            /**
             * <p>The list of candidate models that can be added to direct supply.</p>
             */
            public Builder candidateModels(java.util.List<CandidateModels> candidateModels) {
                this.candidateModels = candidateModels;
                return this;
            }

            /**
             * <p>The error message returned when the model catalog query fails. This parameter is not returned when the query succeeds.</p>
             */
            public Builder catalogError(CatalogError catalogError) {
                this.catalogError = catalogError;
                return this;
            }

            /**
             * <p>Indicates whether direct supply is enabled.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the gateway instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-xxxxxxxx</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The list of models for which direct supply is enabled.</p>
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
