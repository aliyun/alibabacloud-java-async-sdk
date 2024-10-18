// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StderrLog")
    private String stderrLog;

    @com.aliyun.core.annotation.NameInMap("StderrLogSize")
    private String stderrLogSize;

    @com.aliyun.core.annotation.NameInMap("StdoutLog")
    private String stdoutLog;

    @com.aliyun.core.annotation.NameInMap("StdoutLogSize")
    private String stdoutLogSize;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetJobLogResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.stderrLog = builder.stderrLog;
        this.stderrLogSize = builder.stderrLogSize;
        this.stdoutLog = builder.stdoutLog;
        this.stdoutLogSize = builder.stdoutLogSize;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stderrLog
     */
    public String getStderrLog() {
        return this.stderrLog;
    }

    /**
     * @return stderrLogSize
     */
    public String getStderrLogSize() {
        return this.stderrLogSize;
    }

    /**
     * @return stdoutLog
     */
    public String getStdoutLog() {
        return this.stdoutLog;
    }

    /**
     * @return stdoutLogSize
     */
    public String getStdoutLogSize() {
        return this.stdoutLogSize;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 
        private String stderrLog; 
        private String stderrLogSize; 
        private String stdoutLog; 
        private String stdoutLogSize; 
        private String success; 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1.manager</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error output log that is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>aG9zdG5hbWU=</p>
         */
        public Builder stderrLog(String stderrLog) {
            this.stderrLog = stderrLog;
            return this;
        }

        /**
         * <p>The size of the error output file.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder stderrLogSize(String stderrLogSize) {
            this.stderrLogSize = stderrLogSize;
            return this;
        }

        /**
         * <p>The standard output log that is encoded in Base64.</p>
         * 
         * <strong>example:</strong>
         * <p>aG9zdG5hbWU=</p>
         */
        public Builder stdoutLog(String stdoutLog) {
            this.stdoutLog = stdoutLog;
            return this;
        }

        /**
         * <p>The size of the standard output file.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder stdoutLogSize(String stdoutLogSize) {
            this.stdoutLogSize = stdoutLogSize;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetJobLogResponseBody build() {
            return new GetJobLogResponseBody(this);
        } 

    } 

}
