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
 * {@link UpdateModelTokenRateLimitRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelTokenRateLimitRequest</p>
 */
public class UpdateModelTokenRateLimitRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Consumers> consumers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedRevision")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedRevision;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("globalTpm")
    private Long globalTpm;

    private UpdateModelTokenRateLimitRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.modelId = builder.modelId;
        this.consumers = builder.consumers;
        this.expectedRevision = builder.expectedRevision;
        this.globalTpm = builder.globalTpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelTokenRateLimitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return consumers
     */
    public java.util.List<Consumers> getConsumers() {
        return this.consumers;
    }

    /**
     * @return expectedRevision
     */
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    /**
     * @return globalTpm
     */
    public Long getGlobalTpm() {
        return this.globalTpm;
    }

    public static final class Builder extends Request.Builder<UpdateModelTokenRateLimitRequest, Builder> {
        private String gatewayId; 
        private String modelId; 
        private java.util.List<Consumers> consumers; 
        private Long expectedRevision; 
        private Long globalTpm; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelTokenRateLimitRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.modelId = request.modelId;
            this.consumers = request.consumers;
            this.expectedRevision = request.expectedRevision;
            this.globalTpm = request.globalTpm;
        } 

        /**
         * <p>The instance ID of the dedicated AI gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-example01</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The actual model card ID that starts with msc- or the logical model ID that starts with vm-.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-example01</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The complete list of consumer limits. Pass an empty array to clear the consumer limits for the model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;consumerId&quot;:&quot;cs-example01&quot;,&quot;tpm&quot;:300}]</p>
         */
        public Builder consumers(java.util.List<Consumers> consumers) {
            this.putBodyParameter("consumers", consumers);
            this.consumers = consumers;
            return this;
        }

        /**
         * <p>The revision returned by the last query. Set this parameter to 0 for the first configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder expectedRevision(Long expectedRevision) {
            this.putBodyParameter("expectedRevision", expectedRevision);
            this.expectedRevision = expectedRevision;
            return this;
        }

        /**
         * <p>The global tokens per minute (TPM) limit for the model within the instance. If this parameter is omitted, the global limit is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder globalTpm(Long globalTpm) {
            this.putBodyParameter("globalTpm", globalTpm);
            this.globalTpm = globalTpm;
            return this;
        }

        @Override
        public UpdateModelTokenRateLimitRequest build() {
            return new UpdateModelTokenRateLimitRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelTokenRateLimitRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelTokenRateLimitRequest</p>
     */
    public static class Consumers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("tpm")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-example01</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The tokens per minute (TPM) limit for the consumer using this model.</p>
             * <p>This parameter is required.</p>
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
}
