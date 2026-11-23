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
 * {@link GetModelTokenRateLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelTokenRateLimitResponseBody</p>
 */
public class GetModelTokenRateLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetModelTokenRateLimitResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelTokenRateLimitResponseBody create() {
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

        private Builder(GetModelTokenRateLimitResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result code of the request. The value is Ok if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The saved quotas, versions, and rule IDs for the current model.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gatewayId&quot;:&quot;gw-example01&quot;,&quot;modelId&quot;:&quot;msc-example01&quot;,&quot;revision&quot;:1,&quot;appliedRevision&quot;:1,&quot;globalTpm&quot;:1800,&quot;consumers&quot;:[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}],&quot;globalRuleId&quot;:&quot;model-tpm/gw-example01/msc-example01/global&quot;,&quot;consumerRuleIds&quot;:{&quot;cs-example01&quot;:&quot;model-tpm/gw-example01/msc-example01/consumer/cs-example01&quot;}}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The cause of the error. This parameter is omitted if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified gateway does not exist.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>7A35E9B2-4C16-4E90-8A71-24F3BB508C01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModelTokenRateLimitResponseBody build() {
            return new GetModelTokenRateLimitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelTokenRateLimitResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelTokenRateLimitResponseBody</p>
     */
    public static class Consumers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("tpm")
        private Long tpm;

        private Consumers(Builder builder) {
            this.consumerId = builder.consumerId;
            this.tpm = builder.tpm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Consumers create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return tpm
         */
        public Long getTpm() {
            return this.tpm;
        }

        public static final class Builder {
            private String consumerId; 
            private Long tpm; 

            private Builder() {
            } 

            private Builder(Consumers model) {
                this.consumerId = model.consumerId;
                this.tpm = model.tpm;
            } 

            /**
             * <p>The ID of the consumer.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-example01</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The maximum number of tokens per minute (TPM) for this consumer using this model.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder tpm(Long tpm) {
                this.tpm = tpm;
                return this;
            }

            public Consumers build() {
                return new Consumers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelTokenRateLimitResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelTokenRateLimitResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appliedRevision")
        private Long appliedRevision;

        @com.aliyun.core.annotation.NameInMap("consumerRuleIds")
        private java.util.Map<String, String> consumerRuleIds;

        @com.aliyun.core.annotation.NameInMap("consumers")
        private java.util.List<Consumers> consumers;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("globalRuleId")
        private String globalRuleId;

        @com.aliyun.core.annotation.NameInMap("globalTpm")
        private Long globalTpm;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("revision")
        private Long revision;

        private Data(Builder builder) {
            this.appliedRevision = builder.appliedRevision;
            this.consumerRuleIds = builder.consumerRuleIds;
            this.consumers = builder.consumers;
            this.gatewayId = builder.gatewayId;
            this.globalRuleId = builder.globalRuleId;
            this.globalTpm = builder.globalTpm;
            this.modelId = builder.modelId;
            this.revision = builder.revision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appliedRevision
         */
        public Long getAppliedRevision() {
            return this.appliedRevision;
        }

        /**
         * @return consumerRuleIds
         */
        public java.util.Map<String, String> getConsumerRuleIds() {
            return this.consumerRuleIds;
        }

        /**
         * @return consumers
         */
        public java.util.List<Consumers> getConsumers() {
            return this.consumers;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return globalRuleId
         */
        public String getGlobalRuleId() {
            return this.globalRuleId;
        }

        /**
         * @return globalTpm
         */
        public Long getGlobalTpm() {
            return this.globalTpm;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return revision
         */
        public Long getRevision() {
            return this.revision;
        }

        public static final class Builder {
            private Long appliedRevision; 
            private java.util.Map<String, String> consumerRuleIds; 
            private java.util.List<Consumers> consumers; 
            private String gatewayId; 
            private String globalRuleId; 
            private Long globalTpm; 
            private String modelId; 
            private Long revision; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appliedRevision = model.appliedRevision;
                this.consumerRuleIds = model.consumerRuleIds;
                this.consumers = model.consumers;
                this.gatewayId = model.gatewayId;
                this.globalRuleId = model.globalRuleId;
                this.globalTpm = model.globalTpm;
                this.modelId = model.modelId;
                this.revision = model.revision;
            } 

            /**
             * <p>The most recent configuration revision successfully delivered to the control plane.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appliedRevision(Long appliedRevision) {
                this.appliedRevision = appliedRevision;
                return this;
            }

            /**
             * <p>The mapping from consumer IDs to model throttling rule IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cs-example01&quot;:&quot;model-tpm/gw-example01/msc-example01/consumer/cs-example01&quot;}</p>
             */
            public Builder consumerRuleIds(java.util.Map<String, String> consumerRuleIds) {
                this.consumerRuleIds = consumerRuleIds;
                return this;
            }

            /**
             * <p>The list of configured consumer quotas for this model.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}]</p>
             */
            public Builder consumers(java.util.List<Consumers> consumers) {
                this.consumers = consumers;
                return this;
            }

            /**
             * <p>The instance ID of the dedicated AI gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-example01</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The rule ID for the global model quota, which can be matched with the rule hits in the gateway throttling logs. This parameter is returned only when the global quota is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>model-tpm/gw-example01/msc-example01/global</p>
             */
            public Builder globalRuleId(String globalRuleId) {
                this.globalRuleId = globalRuleId;
                return this;
            }

            /**
             * <p>The maximum number of tokens per minute (TPM) shared by all consumers for this model within the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder globalTpm(Long globalTpm) {
                this.globalTpm = globalTpm;
                return this;
            }

            /**
             * <p>The actual model card ID (prefixed with msc-) or the logical model ID (prefixed with vm-).</p>
             * 
             * <strong>example:</strong>
             * <p>msc-example01</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The saved revision of the model throttling configuration. Pass this value as expectedRevision in subsequent modification requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder revision(Long revision) {
                this.revision = revision;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
