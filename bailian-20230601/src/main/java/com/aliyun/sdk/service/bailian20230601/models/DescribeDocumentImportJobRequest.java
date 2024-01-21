// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocumentImportJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocumentImportJobRequest</p>
 */
public class DescribeDocumentImportJobRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private DescribeDocumentImportJobRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentImportJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<DescribeDocumentImportJobRequest, Builder> {
        private String agentKey; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocumentImportJobRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.jobId = request.jobId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public DescribeDocumentImportJobRequest build() {
            return new DescribeDocumentImportJobRequest(this);
        } 

    } 

}
