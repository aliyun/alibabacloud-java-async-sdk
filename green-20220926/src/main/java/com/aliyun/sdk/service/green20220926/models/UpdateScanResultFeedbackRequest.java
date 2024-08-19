// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScanResultFeedbackRequest} extends {@link RequestModel}
 *
 * <p>UpdateScanResultFeedbackRequest</p>
 */
public class UpdateScanResultFeedbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryRequestId")
    private String queryRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private UpdateScanResultFeedbackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.queryRequestId = builder.queryRequestId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
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

    public static final class Builder extends Request.Builder<UpdateScanResultFeedbackRequest, Builder> {
        private String feedback; 
        private String queryRequestId; 
        private String regionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScanResultFeedbackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.queryRequestId = request.queryRequestId;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
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

        @Override
        public UpdateScanResultFeedbackRequest build() {
            return new UpdateScanResultFeedbackRequest(this);
        } 

    } 

}
