// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartJobRunResponseBody} extends {@link TeaModel}
 *
 * <p>StartJobRunResponseBody</p>
 */
public class StartJobRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobRunId")
    private String jobRunId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private StartJobRunResponseBody(Builder builder) {
        this.jobRunId = builder.jobRunId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartJobRunResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobRunId
     */
    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobRunId; 
        private String requestId; 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-54321</p>
         */
        public Builder jobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartJobRunResponseBody build() {
            return new StartJobRunResponseBody(this);
        } 

    } 

}
