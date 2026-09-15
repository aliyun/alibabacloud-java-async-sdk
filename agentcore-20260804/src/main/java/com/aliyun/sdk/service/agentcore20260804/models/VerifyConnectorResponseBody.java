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
 * {@link VerifyConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyConnectorResponseBody</p>
 */
public class VerifyConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private VerifyConnectorResponseBody(Builder builder) {
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

    public static VerifyConnectorResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyConnectorResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The validation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123456</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyConnectorResponseBody build() {
            return new VerifyConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyConnectorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("invalidServiceAccountKeys")
        private java.util.List<String> invalidServiceAccountKeys;

        @com.aliyun.core.annotation.NameInMap("valid")
        private Boolean valid;

        private Data(Builder builder) {
            this.invalidServiceAccountKeys = builder.invalidServiceAccountKeys;
            this.valid = builder.valid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return invalidServiceAccountKeys
         */
        public java.util.List<String> getInvalidServiceAccountKeys() {
            return this.invalidServiceAccountKeys;
        }

        /**
         * @return valid
         */
        public Boolean getValid() {
            return this.valid;
        }

        public static final class Builder {
            private java.util.List<String> invalidServiceAccountKeys; 
            private Boolean valid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.invalidServiceAccountKeys = model.invalidServiceAccountKeys;
                this.valid = model.valid;
            } 

            /**
             * <p>The list of Service Account Key names that failed validation. Each element is a key name string. This list is empty if all keys pass validation.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder invalidServiceAccountKeys(java.util.List<String> invalidServiceAccountKeys) {
                this.invalidServiceAccountKeys = invalidServiceAccountKeys;
                return this;
            }

            /**
             * <p>Indicates whether the credentials are valid.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder valid(Boolean valid) {
                this.valid = valid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
