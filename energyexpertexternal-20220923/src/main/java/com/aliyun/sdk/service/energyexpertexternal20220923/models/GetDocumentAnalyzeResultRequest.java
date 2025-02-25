// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetDocumentAnalyzeResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentAnalyzeResultRequest</p>
 */
public class GetDocumentAnalyzeResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private GetDocumentAnalyzeResultRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentAnalyzeResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<GetDocumentAnalyzeResultRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentAnalyzeResultRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public GetDocumentAnalyzeResultRequest build() {
            return new GetDocumentAnalyzeResultRequest(this);
        } 

    } 

}
