// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAssignJobsAsyncResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetAssignJobsAsyncResultResponseBody</p>
 */
public class GetAssignJobsAsyncResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.NameInMap("JobsId")
    private java.util.List<String> jobsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Boolean timeout;

    @com.aliyun.core.annotation.NameInMap("Valid")
    private Boolean valid;

    private GetAssignJobsAsyncResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jobGroupId = builder.jobGroupId;
        this.jobsId = builder.jobsId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeout = builder.timeout;
        this.valid = builder.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssignJobsAsyncResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return jobsId
     */
    public java.util.List<String> getJobsId() {
        return this.jobsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return timeout
     */
    public Boolean getTimeout() {
        return this.timeout;
    }

    /**
     * @return valid
     */
    public Boolean getValid() {
        return this.valid;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String jobGroupId; 
        private java.util.List<String> jobsId; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Boolean timeout; 
        private Boolean valid; 

        private Builder() {
        } 

        private Builder(GetAssignJobsAsyncResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jobGroupId = model.jobGroupId;
            this.jobsId = model.jobsId;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timeout = model.timeout;
            this.valid = model.valid;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * JobsId.
         */
        public Builder jobsId(java.util.List<String> jobsId) {
            this.jobsId = jobsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Boolean timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Valid.
         */
        public Builder valid(Boolean valid) {
            this.valid = valid;
            return this;
        }

        public GetAssignJobsAsyncResultResponseBody build() {
            return new GetAssignJobsAsyncResultResponseBody(this);
        } 

    } 

}
