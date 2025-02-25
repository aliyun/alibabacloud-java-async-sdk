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

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * RequestID.
         */
        public Builder requestID(String requestID) {
            this.requestID = requestID;
            return this;
        }

        /**
         * SanityCheckResult.
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
