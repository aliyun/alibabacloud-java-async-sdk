// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetJobAttemptLogRequest} extends {@link RequestModel}
 *
 * <p>GetJobAttemptLogRequest</p>
 */
public class GetJobAttemptLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobAttemptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobAttemptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vcName;

    private GetJobAttemptLogRequest(Builder builder) {
        super(builder);
        this.jobAttemptId = builder.jobAttemptId;
        this.jobId = builder.jobId;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobAttemptLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobAttemptId
     */
    public String getJobAttemptId() {
        return this.jobAttemptId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<GetJobAttemptLogRequest, Builder> {
        private String jobAttemptId; 
        private String jobId; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(GetJobAttemptLogRequest request) {
            super(request);
            this.jobAttemptId = request.jobAttemptId;
            this.jobId = request.jobId;
            this.vcName = request.vcName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202105272322hangzhou5d64f1560000128-0001</p>
         */
        public Builder jobAttemptId(String jobAttemptId) {
            this.putBodyParameter("JobAttemptId", jobAttemptId);
            this.jobAttemptId = jobAttemptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202105272322hangzhou5d64f1560000128</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>release-test</p>
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public GetJobAttemptLogRequest build() {
            return new GetJobAttemptLogRequest(this);
        } 

    } 

}
