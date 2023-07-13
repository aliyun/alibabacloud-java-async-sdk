// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentAccessKeyResponseBody</p>
 */
public class DescribeMonitoringAgentAccessKeyResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    private String accessKey;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretKey")
    private String secretKey;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMonitoringAgentAccessKeyResponseBody(Builder builder) {
        this.accessKey = builder.accessKey;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretKey = builder.secretKey;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentAccessKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessKey; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private String secretKey; 
        private Boolean success; 

        /**
         * The AccessKey ID that is required to install the agent.
         */
        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeMonitoringAgentAccessKey**.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringAgentAccessKeyResponseBody build() {
            return new DescribeMonitoringAgentAccessKeyResponseBody(this);
        } 

    } 

}
