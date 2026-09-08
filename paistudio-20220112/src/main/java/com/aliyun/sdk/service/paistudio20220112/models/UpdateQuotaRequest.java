// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UpdateQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaRequest</p>
 */
public class UpdateQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropagateDefaultGPUDriver")
    private Boolean propagateDefaultGPUDriver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueueStrategy")
    private String queueStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaConfig")
    private QuotaConfig quotaConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    private UpdateQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.description = builder.description;
        this.labels = builder.labels;
        this.propagateDefaultGPUDriver = builder.propagateDefaultGPUDriver;
        this.queueStrategy = builder.queueStrategy;
        this.quotaConfig = builder.quotaConfig;
        this.quotaName = builder.quotaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return propagateDefaultGPUDriver
     */
    public Boolean getPropagateDefaultGPUDriver() {
        return this.propagateDefaultGPUDriver;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    /**
     * @return quotaConfig
     */
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaRequest, Builder> {
        private String quotaId; 
        private String description; 
        private java.util.List<Label> labels; 
        private Boolean propagateDefaultGPUDriver; 
        private String queueStrategy; 
        private QuotaConfig quotaConfig; 
        private String quotaName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.description = request.description;
            this.labels = request.labels;
            this.propagateDefaultGPUDriver = request.propagateDefaultGPUDriver;
            this.queueStrategy = request.queueStrategy;
            this.quotaConfig = request.quotaConfig;
            this.quotaName = request.quotaName;
        } 

        /**
         * <p>Quota ID。</p>
         * 
         * <strong>example:</strong>
         * <p>quota-20210126170216-mtl37ge7gkvdz</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The description of the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test quota</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of user-defined labels. This is a full update.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * PropagateDefaultGPUDriver.
         */
        public Builder propagateDefaultGPUDriver(Boolean propagateDefaultGPUDriver) {
            this.putBodyParameter("PropagateDefaultGPUDriver", propagateDefaultGPUDriver);
            this.propagateDefaultGPUDriver = propagateDefaultGPUDriver;
            return this;
        }

        /**
         * <p>The queuing strategy for jobs in the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PaiStrategyIntelligent</p>
         */
        public Builder queueStrategy(String queueStrategy) {
            this.putBodyParameter("QueueStrategy", queueStrategy);
            this.queueStrategy = queueStrategy;
            return this;
        }

        /**
         * <p>The resource quota configuration.</p>
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.putBodyParameter("QuotaConfig", quotaConfig);
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * <p>The resource quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder quotaName(String quotaName) {
            this.putBodyParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        @Override
        public UpdateQuotaRequest build() {
            return new UpdateQuotaRequest(this);
        } 

    } 

}
