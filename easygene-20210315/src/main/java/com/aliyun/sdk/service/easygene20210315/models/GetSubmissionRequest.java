// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSubmissionRequest} extends {@link RequestModel}
 *
 * <p>GetSubmissionRequest</p>
 */
public class GetSubmissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubmissionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String submissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetSubmissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.submissionId = builder.submissionId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubmissionRequest create() {
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

    public static final class Builder extends Request.Builder<GetSubmissionRequest, Builder> {
        private String regionId; 
        private String submissionId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetSubmissionRequest request) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-13BeXWnGvrOl3MC124tazcJVKaV</p>
         */
        public Builder submissionId(String submissionId) {
            this.putQueryParameter("SubmissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestWorkspace</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetSubmissionRequest build() {
            return new GetSubmissionRequest(this);
        } 

    } 

}
