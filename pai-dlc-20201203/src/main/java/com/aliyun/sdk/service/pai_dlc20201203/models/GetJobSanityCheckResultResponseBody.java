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
 * {@link GetJobSanityCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobSanityCheckResultResponseBody</p>
 */
public class GetJobSanityCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestID")
    private String requestID;

    @com.aliyun.core.annotation.NameInMap("SanityCheckResult")
    private java.util.List<SanityCheckResultItem> sanityCheckResult;

    private GetJobSanityCheckResultResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestID = builder.requestID;
        this.sanityCheckResult = builder.sanityCheckResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobSanityCheckResultResponseBody create() {
        return builder().build();
    }

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
     * @return requestID
     */
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * @return sanityCheckResult
     */
    public java.util.List<SanityCheckResultItem> getSanityCheckResult() {
        return this.sanityCheckResult;
    }

    public static final class Builder {
        private String jobId; 
        private String requestID; 
        private java.util.List<SanityCheckResultItem> sanityCheckResult; 

        private Builder() {
        } 

        private Builder(GetJobSanityCheckResultResponseBody model) {
            this.jobId = model.jobId;
            this.requestID = model.requestID;
            this.sanityCheckResult = model.sanityCheckResult;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-xxxxxx</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B3789344-F1xxxBE-5xx2-A04D-xxxxx</p>
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * <p>The job sanity check result.</p>
         */
        public Builder sanityCheckResult(java.util.List<SanityCheckResultItem> sanityCheckResult) {
            this.sanityCheckResult = sanityCheckResult;
            return this;
        }

        public GetJobSanityCheckResultResponseBody build() {
            return new GetJobSanityCheckResultResponseBody(this);
        } 

    } 

}
