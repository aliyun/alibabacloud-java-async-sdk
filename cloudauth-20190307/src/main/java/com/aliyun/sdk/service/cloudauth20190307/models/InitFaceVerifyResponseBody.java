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
 * {@link InitFaceVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>InitFaceVerifyResponseBody</p>
 */
public class InitFaceVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private InitFaceVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitFaceVerifyResponseBody create() {
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

        private Builder(InitFaceVerifyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code: 200 indicates success, other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public InitFaceVerifyResponseBody build() {
            return new InitFaceVerifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitFaceVerifyResponseBody} extends {@link TeaModel}
     *
     * <p>InitFaceVerifyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertifyId")
        private String certifyId;

        @com.aliyun.core.annotation.NameInMap("CertifyUrl")
        private String certifyUrl;

        private ResultObject(Builder builder) {
            this.certifyId = builder.certifyId;
            this.certifyUrl = builder.certifyUrl;
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

        /**
         * @return certifyUrl
         */
        public String getCertifyUrl() {
            return this.certifyUrl;
        }

        public static final class Builder {
            private String certifyId; 
            private String certifyUrl; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.certifyId = model.certifyId;
                this.certifyUrl = model.certifyUrl;
            } 

            /**
             * <p>Unique identifier for real-person authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
             */
            public Builder certifyId(String certifyId) {
                this.certifyId = certifyId;
                return this;
            }

            /**
             * <p>URL for real-person authentication in a Web browser, which will redirect according to the ReturnUrl parameter after authentication.</p>
             * <blockquote>
             * <p>Notice: </p>
             * </blockquote>
             * <ul>
             * <li><p>The CertifyUrl returned by the initialization interface is valid for <strong>30 minutes and can only be used once</strong>. Please use it within the validity period to avoid reuse.</p>
             * </li>
             * <li><p>This parameter requires the correct input of <strong>MetaInfo</strong> to return a CertifyUrl that matches the client. If you cannot obtain it, please check whether <strong>MetaInfo</strong> and other input parameters are correct.</p>
             * </li>
             * <li><p>The domain name of this URL may change with service updates. To ensure normal service availability, it is recommended not to apply access control to this domain name.</p>
             * </li>
             * <li><p>When redirecting in the browser, try not to use incognito mode or modify the URL, as this may result in a <strong>signature error</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://t.aliyun.com/">https://t.aliyun.com/</a>****</p>
             */
            public Builder certifyUrl(String certifyUrl) {
                this.certifyUrl = certifyUrl;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
