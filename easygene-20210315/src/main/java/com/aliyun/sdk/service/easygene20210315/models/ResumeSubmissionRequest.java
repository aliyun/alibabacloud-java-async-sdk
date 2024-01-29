// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeSubmissionRequest} extends {@link RequestModel}
 *
 * <p>ResumeSubmissionRequest</p>
 */
public class ResumeSubmissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubmissionId")
    @Validation(required = true)
    private String submissionId;

    @Query
    @NameInMap("Workspace")
    @Validation(required = true)
    private String workspace;

    private ResumeSubmissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.submissionId = builder.submissionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeSubmissionRequest create() {
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
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ResumeSubmissionRequest, Builder> {
        private String regionId; 
        private String submissionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ResumeSubmissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.submissionId = request.submissionId;
            this.workspace = request.workspace;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubmissionId.
         */
        public Builder submissionId(String submissionId) {
            this.putQueryParameter("SubmissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ResumeSubmissionRequest build() {
            return new ResumeSubmissionRequest(this);
        } 

    } 

}
