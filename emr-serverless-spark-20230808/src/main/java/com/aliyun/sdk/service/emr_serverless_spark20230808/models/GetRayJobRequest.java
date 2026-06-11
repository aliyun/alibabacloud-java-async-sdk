// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetRayJobRequest} extends {@link RequestModel}
 *
 * <p>GetRayJobRequest</p>
 */
public class GetRayJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("submissionId")
    private String submissionId;

    private GetRayJobRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.submissionId = builder.submissionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return submissionId
     */
    public String getSubmissionId() {
        return this.submissionId;
    }

    public static final class Builder extends Request.Builder<GetRayJobRequest, Builder> {
        private String workspaceId; 
        private String submissionId; 

        private Builder() {
            super();
        } 

        private Builder(GetRayJobRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.submissionId = request.submissionId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * submissionId.
         */
        public Builder submissionId(String submissionId) {
            this.putPathParameter("submissionId", submissionId);
            this.submissionId = submissionId;
            return this;
        }

        @Override
        public GetRayJobRequest build() {
            return new GetRayJobRequest(this);
        } 

    } 

}
