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
 * {@link ExchangeEntitlementResponseBody} extends {@link TeaModel}
 *
 * <p>ExchangeEntitlementResponseBody</p>
 */
public class ExchangeEntitlementResponseBody extends TeaModel {
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

    private ExchangeEntitlementResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExchangeEntitlementResponseBody create() {
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

        private Builder(ExchangeEntitlementResponseBody model) {
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

        public ExchangeEntitlementResponseBody build() {
            return new ExchangeEntitlementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExchangeEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>ExchangeEntitlementResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedModels")
        private java.util.List<String> allowedModels;

        @com.aliyun.core.annotation.NameInMap("quotaLimit")
        private Long quotaLimit;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Template(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.quotaLimit = builder.quotaLimit;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        /**
         * @return quotaLimit
         */
        public Long getQuotaLimit() {
            return this.quotaLimit;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> allowedModels; 
            private Long quotaLimit; 
            private Long templateId; 
            private String templateName; 
            private String type; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.allowedModels = model.allowedModels;
                this.quotaLimit = model.quotaLimit;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.type = model.type;
            } 

            /**
             * allowedModels.
             */
            public Builder allowedModels(java.util.List<String> allowedModels) {
                this.allowedModels = allowedModels;
                return this;
            }

            /**
             * quotaLimit.
             */
            public Builder quotaLimit(Long quotaLimit) {
                this.quotaLimit = quotaLimit;
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

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link ExchangeEntitlementResponseBody} extends {@link TeaModel}
     *
     * <p>ExchangeEntitlementResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("effectiveAt")
        private String effectiveAt;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("expireAt")
        private String expireAt;

        @com.aliyun.core.annotation.NameInMap("keyHash")
        private String keyHash;

        @com.aliyun.core.annotation.NameInMap("redemptionOrderNo")
        private String redemptionOrderNo;

        @com.aliyun.core.annotation.NameInMap("reused")
        private Boolean reused;

        @com.aliyun.core.annotation.NameInMap("template")
        private Template template;

        private Data(Builder builder) {
            this.apiKey = builder.apiKey;
            this.effectiveAt = builder.effectiveAt;
            this.endpoint = builder.endpoint;
            this.expireAt = builder.expireAt;
            this.keyHash = builder.keyHash;
            this.redemptionOrderNo = builder.redemptionOrderNo;
            this.reused = builder.reused;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return effectiveAt
         */
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return keyHash
         */
        public String getKeyHash() {
            return this.keyHash;
        }

        /**
         * @return redemptionOrderNo
         */
        public String getRedemptionOrderNo() {
            return this.redemptionOrderNo;
        }

        /**
         * @return reused
         */
        public Boolean getReused() {
            return this.reused;
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String apiKey; 
            private String effectiveAt; 
            private String endpoint; 
            private String expireAt; 
            private String keyHash; 
            private String redemptionOrderNo; 
            private Boolean reused; 
            private Template template; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiKey = model.apiKey;
                this.effectiveAt = model.effectiveAt;
                this.endpoint = model.endpoint;
                this.expireAt = model.expireAt;
                this.keyHash = model.keyHash;
                this.redemptionOrderNo = model.redemptionOrderNo;
                this.reused = model.reused;
                this.template = model.template;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
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
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
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
             * keyHash.
             */
            public Builder keyHash(String keyHash) {
                this.keyHash = keyHash;
                return this;
            }

            /**
             * redemptionOrderNo.
             */
            public Builder redemptionOrderNo(String redemptionOrderNo) {
                this.redemptionOrderNo = redemptionOrderNo;
                return this;
            }

            /**
             * reused.
             */
            public Builder reused(Boolean reused) {
                this.reused = reused;
                return this;
            }

            /**
             * template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
