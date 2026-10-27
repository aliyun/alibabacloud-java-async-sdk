// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListIdentityProviderSCIMCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIdentityProviderSCIMCredentialsResponseBody</p>
 */
public class ListIdentityProviderSCIMCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListIdentityProviderSCIMCredentialsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityProviderSCIMCredentialsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListIdentityProviderSCIMCredentialsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business result code. If the request fails, handle the error based on the HTTP status code and the message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The operation result. For the result structure, see the response fields of this operation. For asynchronous write operations, the response indicates that the request is accepted, but does not guarantee that the background task is completed.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the current request. This code indicates the processing status of the request and is not equivalent to the final result of the background task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Task result message, which indicates that the request is accepted or contains an error message. For task results of asynchronous tasks, check the corresponding query operation.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to associate the current call with troubleshooting. Retain this ID if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>request-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current request is successful. A value of true indicates that the request is processed successfully. For asynchronous write operations, you still need to query the task results.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListIdentityProviderSCIMCredentialsResponseBody build() {
            return new ListIdentityProviderSCIMCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIdentityProviderSCIMCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIdentityProviderSCIMCredentialsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("credentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.credentialId = builder.credentialId;
            this.expireTime = builder.expireTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String credentialId; 
            private String expireTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.credentialId = model.credentialId;
                this.expireTime = model.expireTime;
                this.status = model.status;
            } 

            /**
             * <p>The creation time returned by AgentIdentity.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-26T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The credential ID. This parameter is required and cannot be empty when you delete a credential. Use the ID returned in the credential list, not the plaintext token.</p>
             * 
             * <strong>example:</strong>
             * <p>credential-example</p>
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * <p>The expiration time returned by AgentIdentity. Only credentials with a status of Enabled that have not expired are considered available.</p>
             * 
             * <strong>example:</strong>
             * <p>2027-10-26T00:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The credential status of AgentIdentity. Only credentials with a status of Enabled that have not expired are considered available. This field is not the operationStatus of a SCIM task.</p>
             * 
             * <strong>example:</strong>
             * <p>READY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
