// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSparkCodeLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeLogResponseBody</p>
 */
public class DescribeSparkCodeLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Log")
    private String log;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSparkCodeLogResponseBody(Builder builder) {
        this.log = builder.log;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkCodeLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return log
     */
    public String getLog() {
        return this.log;
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
        private String log; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The content of the log.
         */
        public Builder log(String log) {
            this.log = log;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request was successful, **Success** is returned.
         * *   If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSparkCodeLogResponseBody build() {
            return new DescribeSparkCodeLogResponseBody(this);
        } 

    } 

}
