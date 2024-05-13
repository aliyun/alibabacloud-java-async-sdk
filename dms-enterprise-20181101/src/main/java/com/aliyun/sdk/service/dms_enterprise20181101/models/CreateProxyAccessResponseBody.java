// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProxyAccessResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProxyAccessResponseBody</p>
 */
public class CreateProxyAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProxyAccessId")
    private Long proxyAccessId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateProxyAccessResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.proxyAccessId = builder.proxyAccessId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProxyAccessResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return proxyAccessId
     */
    public Long getProxyAccessId() {
        return this.proxyAccessId;
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
        private String errorCode; 
        private String errorMessage; 
        private Long proxyAccessId; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned to the query task.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message that is returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the security protection authorization. After the security protection agent authorizes the target user, the system automatically generates a security protection authorization ID. The ID is globally unique.
         */
        public Builder proxyAccessId(Long proxyAccessId) {
            this.proxyAccessId = proxyAccessId;
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
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateProxyAccessResponseBody build() {
            return new CreateProxyAccessResponseBody(this);
        } 

    } 

}
