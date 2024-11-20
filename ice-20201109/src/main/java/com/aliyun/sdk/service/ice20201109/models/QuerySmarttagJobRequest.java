// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySmarttagJobRequest} extends {@link RequestModel}
 *
 * <p>QuerySmarttagJobRequest</p>
 */
public class QuerySmarttagJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    private QuerySmarttagJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmarttagJobRequest create() {
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<QuerySmarttagJobRequest, Builder> {
        private String jobId; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(QuerySmarttagJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.params = request.params;
        } 

        /**
         * <p>The ID of the smart tagging job that you want to query. You can obtain the job ID from the response parameters of the SubmitSmarttagJob operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The extra parameters that you want to query in the request. The value is a JSON string. Example: {&quot;labelResultType&quot;:&quot;auto&quot;}. The value of labelResultType is of the STRING type. Valid values:</p>
         * <ul>
         * <li>auto: machine tagging</li>
         * <li>hmi: tagging by human and machine</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;labelResultType&quot;:&quot;auto&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public QuerySmarttagJobRequest build() {
            return new QuerySmarttagJobRequest(this);
        } 

    } 

}
