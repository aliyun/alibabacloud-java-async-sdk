// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link InitCardVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>InitCardVerifyResponseBody</p>
 */
public class InitCardVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private InitCardVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitCardVerifyResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(InitCardVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The return code. A value of 200 indicates success, and other values indicate failure.
         * Important:</p>
         * <ul>
         * <li>This parameter indicates whether the API is called successfully. For more information about return codes, see Error codes.</li>
         * <li>To view the business result, check the fields in ResultObject.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public InitCardVerifyResponseBody build() {
            return new InitCardVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitCardVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>InitCardVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        private ResultObject(Builder builder) {
            this.certifyId = builder.certifyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return certifyId
         */
        public String getCertifyId() {
            return this.certifyId;
        }

        public static final class Builder {
            private String certifyId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.certifyId = model.certifyId;
            } 

            /**
             * <p>The verification request ID, which is the unique identifier of the authentication request in the verification service.</p>
             * <ul>
             * <li>When you query the authentication result, you must specify the authentication request ID.</li>
             * <li>The CertifyId field is used for billing statistics. To facilitate subsequent bill reconciliation, store the field information locally. The CertifyId returned by the initialization API is valid for 30 minutes and can be submitted for authentication only once. Use it within the validity period to avoid repeated use.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>91707dc296d469ad38e4c5efa6a0****</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
