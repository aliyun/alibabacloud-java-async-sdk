// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetUsageResponseBody</p>
 */
public class GetUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsageResponseBody create() {
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
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
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
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUsageResponseBody build() {
            return new GetUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetUsageResponseBody</p>
     */
    public static class Entitlements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedModels")
        private java.util.List<String> allowedModels;

        @com.aliyun.core.annotation.NameInMap("bindingId")
        private Long bindingId;

        @com.aliyun.core.annotation.NameInMap("effectiveAt")
        private String effectiveAt;

        @com.aliyun.core.annotation.NameInMap("expireAt")
        private String expireAt;

        @com.aliyun.core.annotation.NameInMap("quotaInitial")
        private Long quotaInitial;

        @com.aliyun.core.annotation.NameInMap("quotaRemaining")
        private Long quotaRemaining;

        @com.aliyun.core.annotation.NameInMap("quotaUsed")
        private Long quotaUsed;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        private Entitlements(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.bindingId = builder.bindingId;
            this.effectiveAt = builder.effectiveAt;
            this.expireAt = builder.expireAt;
            this.quotaInitial = builder.quotaInitial;
            this.quotaRemaining = builder.quotaRemaining;
            this.quotaUsed = builder.quotaUsed;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entitlements create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        /**
         * @return bindingId
         */
        public Long getBindingId() {
            return this.bindingId;
        }

        /**
         * @return effectiveAt
         */
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return quotaInitial
         */
        public Long getQuotaInitial() {
            return this.quotaInitial;
        }

        /**
         * @return quotaRemaining
         */
        public Long getQuotaRemaining() {
            return this.quotaRemaining;
        }

        /**
         * @return quotaUsed
         */
        public Long getQuotaUsed() {
            return this.quotaUsed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.List<String> allowedModels; 
            private Long bindingId; 
            private String effectiveAt; 
            private String expireAt; 
            private Long quotaInitial; 
            private Long quotaRemaining; 
            private Long quotaUsed; 
            private String status; 
            private Long templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(Entitlements model) {
                this.allowedModels = model.allowedModels;
                this.bindingId = model.bindingId;
                this.effectiveAt = model.effectiveAt;
                this.expireAt = model.expireAt;
                this.quotaInitial = model.quotaInitial;
                this.quotaRemaining = model.quotaRemaining;
                this.quotaUsed = model.quotaUsed;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * allowedModels.
             */
            public Builder allowedModels(java.util.List<String> allowedModels) {
                this.allowedModels = allowedModels;
                return this;
            }

            /**
             * bindingId.
             */
            public Builder bindingId(Long bindingId) {
                this.bindingId = bindingId;
                return this;
            }

            /**
             * effectiveAt.
             */
            public Builder effectiveAt(String effectiveAt) {
                this.effectiveAt = effectiveAt;
                return this;
            }

            /**
             * expireAt.
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * quotaInitial.
             */
            public Builder quotaInitial(Long quotaInitial) {
                this.quotaInitial = quotaInitial;
                return this;
            }

            /**
             * quotaRemaining.
             */
            public Builder quotaRemaining(Long quotaRemaining) {
                this.quotaRemaining = quotaRemaining;
                return this;
            }

            /**
             * quotaUsed.
             */
            public Builder quotaUsed(Long quotaUsed) {
                this.quotaUsed = quotaUsed;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * templateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public Entitlements build() {
                return new Entitlements(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetUsageResponseBody</p>
     */
    public static class ModelStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("inputUsage")
        private Long inputUsage;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("outputUsage")
        private Long outputUsage;

        @com.aliyun.core.annotation.NameInMap("requests")
        private Long requests;

        @com.aliyun.core.annotation.NameInMap("totalUsage")
        private Long totalUsage;

        private ModelStats(Builder builder) {
            this.inputUsage = builder.inputUsage;
            this.model = builder.model;
            this.outputUsage = builder.outputUsage;
            this.requests = builder.requests;
            this.totalUsage = builder.totalUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelStats create() {
            return builder().build();
        }

        /**
         * @return inputUsage
         */
        public Long getInputUsage() {
            return this.inputUsage;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return outputUsage
         */
        public Long getOutputUsage() {
            return this.outputUsage;
        }

        /**
         * @return requests
         */
        public Long getRequests() {
            return this.requests;
        }

        /**
         * @return totalUsage
         */
        public Long getTotalUsage() {
            return this.totalUsage;
        }

        public static final class Builder {
            private Long inputUsage; 
            private String model; 
            private Long outputUsage; 
            private Long requests; 
            private Long totalUsage; 

            private Builder() {
            } 

            private Builder(ModelStats model) {
                this.inputUsage = model.inputUsage;
                this.model = model.model;
                this.outputUsage = model.outputUsage;
                this.requests = model.requests;
                this.totalUsage = model.totalUsage;
            } 

            /**
             * inputUsage.
             */
            public Builder inputUsage(Long inputUsage) {
                this.inputUsage = inputUsage;
                return this;
            }

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * outputUsage.
             */
            public Builder outputUsage(Long outputUsage) {
                this.outputUsage = outputUsage;
                return this;
            }

            /**
             * requests.
             */
            public Builder requests(Long requests) {
                this.requests = requests;
                return this;
            }

            /**
             * totalUsage.
             */
            public Builder totalUsage(Long totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            public ModelStats build() {
                return new ModelStats(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetUsageResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("totalInputUsage")
        private Long totalInputUsage;

        @com.aliyun.core.annotation.NameInMap("totalOutputUsage")
        private Long totalOutputUsage;

        @com.aliyun.core.annotation.NameInMap("totalRequests")
        private Long totalRequests;

        @com.aliyun.core.annotation.NameInMap("totalUsage")
        private Long totalUsage;

        private Summary(Builder builder) {
            this.totalInputUsage = builder.totalInputUsage;
            this.totalOutputUsage = builder.totalOutputUsage;
            this.totalRequests = builder.totalRequests;
            this.totalUsage = builder.totalUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return totalInputUsage
         */
        public Long getTotalInputUsage() {
            return this.totalInputUsage;
        }

        /**
         * @return totalOutputUsage
         */
        public Long getTotalOutputUsage() {
            return this.totalOutputUsage;
        }

        /**
         * @return totalRequests
         */
        public Long getTotalRequests() {
            return this.totalRequests;
        }

        /**
         * @return totalUsage
         */
        public Long getTotalUsage() {
            return this.totalUsage;
        }

        public static final class Builder {
            private Long totalInputUsage; 
            private Long totalOutputUsage; 
            private Long totalRequests; 
            private Long totalUsage; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.totalInputUsage = model.totalInputUsage;
                this.totalOutputUsage = model.totalOutputUsage;
                this.totalRequests = model.totalRequests;
                this.totalUsage = model.totalUsage;
            } 

            /**
             * totalInputUsage.
             */
            public Builder totalInputUsage(Long totalInputUsage) {
                this.totalInputUsage = totalInputUsage;
                return this;
            }

            /**
             * totalOutputUsage.
             */
            public Builder totalOutputUsage(Long totalOutputUsage) {
                this.totalOutputUsage = totalOutputUsage;
                return this;
            }

            /**
             * totalRequests.
             */
            public Builder totalRequests(Long totalRequests) {
                this.totalRequests = totalRequests;
                return this;
            }

            /**
             * totalUsage.
             */
            public Builder totalUsage(Long totalUsage) {
                this.totalUsage = totalUsage;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("entitlements")
        private java.util.List<Entitlements> entitlements;

        @com.aliyun.core.annotation.NameInMap("modelStats")
        private java.util.List<ModelStats> modelStats;

        @com.aliyun.core.annotation.NameInMap("summary")
        private Summary summary;

        private Data(Builder builder) {
            this.entitlements = builder.entitlements;
            this.modelStats = builder.modelStats;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entitlements
         */
        public java.util.List<Entitlements> getEntitlements() {
            return this.entitlements;
        }

        /**
         * @return modelStats
         */
        public java.util.List<ModelStats> getModelStats() {
            return this.modelStats;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List<Entitlements> entitlements; 
            private java.util.List<ModelStats> modelStats; 
            private Summary summary; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.entitlements = model.entitlements;
                this.modelStats = model.modelStats;
                this.summary = model.summary;
            } 

            /**
             * entitlements.
             */
            public Builder entitlements(java.util.List<Entitlements> entitlements) {
                this.entitlements = entitlements;
                return this;
            }

            /**
             * modelStats.
             */
            public Builder modelStats(java.util.List<ModelStats> modelStats) {
                this.modelStats = modelStats;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
