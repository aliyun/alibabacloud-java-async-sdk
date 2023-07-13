// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobLogResponseBody</p>
 */
public class GetJobLogResponseBody extends TeaModel {
    @NameInMap("ErrorLog")
    private String errorLog;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("OutputLog")
    private String outputLog;

    @NameInMap("RequestId")
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

        /**
         * ErrorLog.
         */
        public Builder errorLog(String errorLog) {
            this.errorLog = errorLog;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * OutputLog.
         */
        public Builder outputLog(String outputLog) {
            this.outputLog = outputLog;
            return this;
        }

        /**
         * The content of the error logs. The content is encoded in Base64.
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
