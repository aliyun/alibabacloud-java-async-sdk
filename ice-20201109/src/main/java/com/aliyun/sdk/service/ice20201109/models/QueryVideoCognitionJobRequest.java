// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QueryVideoCognitionJobRequest} extends {@link RequestModel}
 *
 * <p>QueryVideoCognitionJobRequest</p>
 */
public class QueryVideoCognitionJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeResults")
    private IncludeResults includeResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    private QueryVideoCognitionJobRequest(Builder builder) {
        super(builder);
        this.includeResults = builder.includeResults;
        this.jobId = builder.jobId;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoCognitionJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeResults
     */
    public IncludeResults getIncludeResults() {
        return this.includeResults;
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

    public static final class Builder extends Request.Builder<QueryVideoCognitionJobRequest, Builder> {
        private IncludeResults includeResults; 
        private String jobId; 
        private String params; 

        private Builder() {
            super();
        } 

        private Builder(QueryVideoCognitionJobRequest request) {
            super(request);
            this.includeResults = request.includeResults;
            this.jobId = request.jobId;
            this.params = request.params;
        } 

        /**
         * <p>Specifies whether to include the full algorithm results in the response.</p>
         */
        public Builder includeResults(IncludeResults includeResults) {
            String includeResultsShrink = shrink(includeResults, "IncludeResults", "json");
            this.putQueryParameter("IncludeResults", includeResultsShrink);
            this.includeResults = includeResults;
            return this;
        }

        /**
         * <p>The ID of the task to query. It is returned when you call the <a href="https://help.aliyun.com/document_detail/478786.html">SubmitSmarttagJob</a> operation.</p>
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

        /**
         * <p>Additional request parameters, provided as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        @Override
        public QueryVideoCognitionJobRequest build() {
            return new QueryVideoCognitionJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryVideoCognitionJobRequest} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobRequest</p>
     */
    public static class IncludeResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NeedAsr")
        private Boolean needAsr;

        @com.aliyun.core.annotation.NameInMap("NeedOcr")
        private Boolean needOcr;

        @com.aliyun.core.annotation.NameInMap("NeedProcess")
        private Boolean needProcess;

        private IncludeResults(Builder builder) {
            this.needAsr = builder.needAsr;
            this.needOcr = builder.needOcr;
            this.needProcess = builder.needProcess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IncludeResults create() {
            return builder().build();
        }

        /**
         * @return needAsr
         */
        public Boolean getNeedAsr() {
            return this.needAsr;
        }

        /**
         * @return needOcr
         */
        public Boolean getNeedOcr() {
            return this.needOcr;
        }

        /**
         * @return needProcess
         */
        public Boolean getNeedProcess() {
            return this.needProcess;
        }

        public static final class Builder {
            private Boolean needAsr; 
            private Boolean needOcr; 
            private Boolean needProcess; 

            private Builder() {
            } 

            private Builder(IncludeResults model) {
                this.needAsr = model.needAsr;
                this.needOcr = model.needOcr;
                this.needProcess = model.needProcess;
            } 

            /**
             * <p>Specifies whether to include Automatic Speech Recognition (ASR) results.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAsr(Boolean needAsr) {
                this.needAsr = needAsr;
                return this;
            }

            /**
             * <p>Specifies whether to include Optical Character Recognition (OCR) results.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needOcr(Boolean needOcr) {
                this.needOcr = needOcr;
                return this;
            }

            /**
             * <p>Specifies whether to include the URL to the raw output of the algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needProcess(Boolean needProcess) {
                this.needProcess = needProcess;
                return this;
            }

            public IncludeResults build() {
                return new IncludeResults(this);
            } 

        } 

    }
}
