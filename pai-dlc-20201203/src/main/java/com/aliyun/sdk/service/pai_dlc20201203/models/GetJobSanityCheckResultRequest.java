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
         * SanityCheckPhase.
         */
        public Builder sanityCheckPhase(String sanityCheckPhase) {
            this.putQueryParameter("SanityCheckPhase", sanityCheckPhase);
            this.sanityCheckPhase = sanityCheckPhase;
            return this;
        }

        /**
         * Token.
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
