// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetAIAppJobRequest} extends {@link RequestModel}
 *
 * <p>GetAIAppJobRequest</p>
 */
public class GetAIAppJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyOutputs")
    private Boolean onlyOutputs;

    private GetAIAppJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.onlyOutputs = builder.onlyOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIAppJobRequest create() {
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

    /**
     * @return onlyOutputs
     */
    public Boolean getOnlyOutputs() {
        return this.onlyOutputs;
    }

    public static final class Builder extends Request.Builder<GetAIAppJobRequest, Builder> {
        private String jobId; 
        private Boolean onlyOutputs; 

        private Builder() {
            super();
        } 

        private Builder(GetAIAppJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.onlyOutputs = request.onlyOutputs;
        } 

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68ca759e798b40b4903b255*******</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Specifies whether to return only the task results. If you set this parameter to true, the response does not include the results of each node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onlyOutputs(Boolean onlyOutputs) {
            this.putQueryParameter("OnlyOutputs", onlyOutputs);
            this.onlyOutputs = onlyOutputs;
            return this;
        }

        @Override
        public GetAIAppJobRequest build() {
            return new GetAIAppJobRequest(this);
        } 

    } 

}
