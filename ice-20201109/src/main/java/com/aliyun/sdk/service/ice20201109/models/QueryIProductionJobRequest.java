// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryIProductionJobRequest} extends {@link RequestModel}
 *
 * <p>QueryIProductionJobRequest</p>
 */
public class QueryIProductionJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private QueryIProductionJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIProductionJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<QueryIProductionJobRequest, Builder> {
        private String clientToken; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(QueryIProductionJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.jobId = request.jobId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public QueryIProductionJobRequest build() {
            return new QueryIProductionJobRequest(this);
        } 

    } 

}
