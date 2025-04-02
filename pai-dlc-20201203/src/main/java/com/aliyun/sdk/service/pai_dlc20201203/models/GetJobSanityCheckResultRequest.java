// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetJobSanityCheckResultRequest} extends {@link RequestModel}
 *
 * <p>GetJobSanityCheckResultRequest</p>
 */
public class GetJobSanityCheckResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanityCheckNumber")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer sanityCheckNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SanityCheckPhase")
    private String sanityCheckPhase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetJobSanityCheckResultRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.sanityCheckNumber = builder.sanityCheckNumber;
        this.sanityCheckPhase = builder.sanityCheckPhase;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobSanityCheckResultRequest create() {
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
     * @return sanityCheckNumber
     */
    public Integer getSanityCheckNumber() {
        return this.sanityCheckNumber;
    }

    /**
     * @return sanityCheckPhase
     */
    public String getSanityCheckPhase() {
        return this.sanityCheckPhase;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<GetJobSanityCheckResultRequest, Builder> {
        private String jobId; 
        private Integer sanityCheckNumber; 
        private String sanityCheckPhase; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(GetJobSanityCheckResultRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.sanityCheckNumber = request.sanityCheckNumber;
            this.sanityCheckPhase = request.sanityCheckPhase;
            this.token = request.token;
        } 

        /**
         * <p>The job ID. For more information about how to obtain a job ID, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlcl5qxoxxxxx5iq</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The nth time for which the job sanity check is performed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sanityCheckNumber(Integer sanityCheckNumber) {
            this.putQueryParameter("SanityCheckNumber", sanityCheckNumber);
            this.sanityCheckNumber = sanityCheckNumber;
            return this;
        }

        /**
         * <p>The phase in which the job sanity check is performed.</p>
         * <ul>
         * <li>CheckInit</li>
         * <li>DeviceCheck</li>
         * <li>SingleNodeCommCheck</li>
         * <li>TwoNodeCommCheck</li>
         * <li>AllNodeCommCheck</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeviceCheck</p>
         */
        public Builder sanityCheckPhase(String sanityCheckPhase) {
            this.putQueryParameter("SanityCheckPhase", sanityCheckPhase);
            this.sanityCheckPhase = sanityCheckPhase;
            return this;
        }

        /**
         * <p>The token information for job sharing. For more information about how to obtain the token information, see <a href="https://help.aliyun.com/document_detail/2557812.html">GetToken</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhbG<strong><strong><strong>zI1NiIsInR5cCI6IkpXVCJ9.eyJle</strong></strong>jE3MDk1Mzk0NDIsImlhdCI6MTcwODkzNDY0MiwidXNlcl9pZCI6IjE3NTgwNTQxNjI0Mzg2NTUiLCJ0YXJnZXRfaWQiOiJkbGM1OGh1a2xyYzZwdGMyIiwidGFyZ2V0X3R5cGUiOiJqb2IifQ.GNL7jo6</strong><strong>mgKKv0QeGIYgvBufSU-PH_EQttX</strong>**</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public GetJobSanityCheckResultRequest build() {
            return new GetJobSanityCheckResultRequest(this);
        } 

    } 

}
