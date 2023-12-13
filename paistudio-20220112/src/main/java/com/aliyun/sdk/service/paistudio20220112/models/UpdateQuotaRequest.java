// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateQuotaRequest</p>
 */
public class UpdateQuotaRequest extends Request {
    @Path
    @NameInMap("QuotaId")
    private String quotaId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @Body
    @NameInMap("QueueStrategy")
    private String queueStrategy;

    private UpdateQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.description = builder.description;
        this.labels = builder.labels;
        this.queueStrategy = builder.queueStrategy;
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
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return queueStrategy
     */
    public String getQueueStrategy() {
        return this.queueStrategy;
    }

    public static final class Builder extends Request.Builder<UpdateQuotaRequest, Builder> {
        private String quotaId; 
        private String description; 
        private java.util.List < Label > labels; 
        private String queueStrategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.description = request.description;
            this.labels = request.labels;
            this.queueStrategy = request.queueStrategy;
        } 

        /**
         * Quota ID
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * QueueStrategy.
         */
        public Builder queueStrategy(String queueStrategy) {
            this.putBodyParameter("QueueStrategy", queueStrategy);
            this.queueStrategy = queueStrategy;
            return this;
        }

        @Override
        public UpdateQuotaRequest build() {
            return new UpdateQuotaRequest(this);
        } 

    } 

}
