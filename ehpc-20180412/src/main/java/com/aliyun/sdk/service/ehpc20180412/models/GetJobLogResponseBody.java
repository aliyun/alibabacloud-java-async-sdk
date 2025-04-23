// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetJobLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobLogResponseBody</p>
 */
public class GetJobLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorLog")
    private String errorLog;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("OutputLog")
    private String outputLog;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetJobLogResponseBody(Builder builder) {
        this.errorLog = builder.errorLog;
        this.jobId = builder.jobId;
        this.outputLog = builder.outputLog;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorLog
     */
    public String getErrorLog() {
        return this.errorLog;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return outputLog
     */
    public String getOutputLog() {
        return this.outputLog;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String errorLog; 
        private String jobId; 
        private String outputLog; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobLogResponseBody model) {
            this.errorLog = model.errorLog;
            this.jobId = model.jobId;
            this.outputLog = model.outputLog;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The content of the error logs. The content is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>c2xlZXAgMzA=</p>
         */
        public Builder errorLog(String errorLog) {
            this.errorLog = errorLog;
            return this;
        }

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1.scheduler****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The content of the output logs. The content is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>c2xlZXAgMzA=</p>
         */
        public Builder outputLog(String outputLog) {
            this.outputLog = outputLog;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobLogResponseBody build() {
            return new GetJobLogResponseBody(this);
        } 

    } 

}
