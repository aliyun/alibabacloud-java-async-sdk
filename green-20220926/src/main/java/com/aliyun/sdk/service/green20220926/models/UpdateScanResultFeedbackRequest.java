// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateScanResultFeedbackRequest} extends {@link RequestModel}
 *
 * <p>UpdateScanResultFeedbackRequest</p>
 */
public class UpdateScanResultFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryRequestId")
    private String queryRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    private UpdateScanResultFeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.labels = builder.labels;
        this.queryRequestId = builder.queryRequestId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.riskLevel = builder.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScanResultFeedbackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return queryRequestId
     */
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public static final class Builder extends Request.Builder<UpdateScanResultFeedbackRequest, Builder> {
        private String feedback; 
        private String labels; 
        private String queryRequestId; 
        private String regionId; 
        private String resourceType; 
        private String riskLevel; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScanResultFeedbackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.labels = request.labels;
            this.queryRequestId = request.queryRequestId;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.riskLevel = request.riskLevel;
        } 

        /**
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.putBodyParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * QueryRequestId.
         */
        public Builder queryRequestId(String queryRequestId) {
            this.putBodyParameter("QueryRequestId", queryRequestId);
            this.queryRequestId = queryRequestId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.putBodyParameter("RiskLevel", riskLevel);
            this.riskLevel = riskLevel;
            return this;
        }

        @Override
        public UpdateScanResultFeedbackRequest build() {
            return new UpdateScanResultFeedbackRequest(this);
        } 

    } 

}
