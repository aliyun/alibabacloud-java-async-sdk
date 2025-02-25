// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentAccessKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentAccessKeyResponseBody</p>
 */
public class DescribeMonitoringAgentAccessKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKey")
    private String accessKey;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The AccessKey ID that is required to install the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>E7A27f9****</p>
         */
        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0F655E9-D793-51E6-BD78-CABBCCFC1047</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The AccessKey secret that is required to install the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>sBjNOUhLylrxMX-Xv1****</p>
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
