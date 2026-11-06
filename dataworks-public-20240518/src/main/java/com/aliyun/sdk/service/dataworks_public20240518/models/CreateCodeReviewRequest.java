// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateCodeReviewRequest} extends {@link RequestModel}
 *
 * <p>CreateCodeReviewRequest</p>
 */
public class CreateCodeReviewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PipelineRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pipelineRunId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reviewers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reviewers;

    private CreateCodeReviewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.pipelineRunId = builder.pipelineRunId;
        this.projectId = builder.projectId;
        this.reviewers = builder.reviewers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeReviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return reviewers
     */
    public String getReviewers() {
        return this.reviewers;
    }

    public static final class Builder extends Request.Builder<CreateCodeReviewRequest, Builder> {
        private String regionId; 
        private String description; 
        private String pipelineRunId; 
        private Long projectId; 
        private String reviewers; 

        private Builder() {
            super();
        } 

        private Builder(CreateCodeReviewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.pipelineRunId = request.pipelineRunId;
            this.projectId = request.projectId;
            this.reviewers = request.reviewers;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the code review. The maximum length is 1,024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Code review</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of a single release pipeline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-id</p>
         */
        public Builder pipelineRunId(String pipelineRunId) {
            this.putBodyParameter("PipelineRunId", pipelineRunId);
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23620</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Specifies the reviewers. Separate multiple accounts with commas (,). At least one reviewer is required, and the maximum length is 512 characters after deduplication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456,2345678901234567</p>
         */
        public Builder reviewers(String reviewers) {
            this.putBodyParameter("Reviewers", reviewers);
            this.reviewers = reviewers;
            return this;
        }

        @Override
        public CreateCodeReviewRequest build() {
            return new CreateCodeReviewRequest(this);
        } 

    } 

}
