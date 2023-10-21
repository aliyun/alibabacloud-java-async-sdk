// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutLogMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>PutLogMonitorResponseBody</p>
 */
public class PutLogMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogId")
    private String logId;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PutLogMonitorResponseBody(Builder builder) {
        this.code = builder.code;
        this.logId = builder.logId;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutLogMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logId
     */
    public String getLogId() {
        return this.logId;
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

    public static final class Builder {
        private String code; 
        private String logId; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the log monitoring metric.
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the call is successful, the value `successful` is returned.
         * *   If the call fails, an error message is returned. Example: `alias of aggreate must be set value.`
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutLogMonitorResponseBody build() {
            return new PutLogMonitorResponseBody(this);
        } 

    } 

}
