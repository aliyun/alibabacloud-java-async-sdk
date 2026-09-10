// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RunPolarClawCronJobResponseBody} extends {@link TeaModel}
 *
 * <p>RunPolarClawCronJobResponseBody</p>
 */
public class RunPolarClawCronJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("Ran")
    private Boolean ran;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunPolarClawCronJobResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.jobId = builder.jobId;
        this.message = builder.message;
        this.ok = builder.ok;
        this.ran = builder.ran;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPolarClawCronJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return ran
     */
    public Boolean getRan() {
        return this.ran;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String jobId; 
        private String message; 
        private Boolean ok; 
        private Boolean ran; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunPolarClawCronJobResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.jobId = model.jobId;
            this.message = model.message;
            this.ok = model.ok;
            this.ran = model.ran;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The unique ID for this job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>8006e51c-dab3-4602-bc69-4f728002c6ce</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * <p>Indicates whether the job actually ran.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ran(Boolean ran) {
            this.ran = ran;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunPolarClawCronJobResponseBody build() {
            return new RunPolarClawCronJobResponseBody(this);
        } 

    } 

}
