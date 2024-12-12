// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCopyrightExtractJobRequest} extends {@link RequestModel}
 *
 * <p>QueryCopyrightExtractJobRequest</p>
 */
public class QueryCopyrightExtractJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private QueryCopyrightExtractJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCopyrightExtractJobRequest create() {
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

    public static final class Builder extends Request.Builder<QueryCopyrightExtractJobRequest, Builder> {
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCopyrightExtractJobRequest request) {
            super(request);
            this.jobId = request.jobId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2288c6ca184c0e47098a5b665e2a12****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public QueryCopyrightExtractJobRequest build() {
            return new QueryCopyrightExtractJobRequest(this);
        } 

    } 

}
