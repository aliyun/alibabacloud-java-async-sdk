// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTraceExtractRequest} extends {@link RequestModel}
 *
 * <p>QueryTraceExtractRequest</p>
 */
public class QueryTraceExtractRequest extends Request {
    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private QueryTraceExtractRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTraceExtractRequest create() {
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

    public static final class Builder extends Request.Builder<QueryTraceExtractRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTraceExtractRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public QueryTraceExtractRequest build() {
            return new QueryTraceExtractRequest(this);
        } 

    } 

}
