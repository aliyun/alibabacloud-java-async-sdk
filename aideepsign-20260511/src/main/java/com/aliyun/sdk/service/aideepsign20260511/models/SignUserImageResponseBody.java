// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link SignUserImageResponseBody} extends {@link TeaModel}
 *
 * <p>SignUserImageResponseBody</p>
 */
public class SignUserImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("CertificateSubject")
    private String certificateSubject;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignTime")
    private String signTime;

    @com.aliyun.core.annotation.NameInMap("SignedImageUrl")
    private String signedImageUrl;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SignUserImageResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.certificateSubject = builder.certificateSubject;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.objectKey = builder.objectKey;
        this.requestId = builder.requestId;
        this.signTime = builder.signTime;
        this.signedImageUrl = builder.signedImageUrl;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignUserImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certificateSubject
     */
    public String getCertificateSubject() {
        return this.certificateSubject;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signTime
     */
    public String getSignTime() {
        return this.signTime;
    }

    /**
     * @return signedImageUrl
     */
    public String getSignedImageUrl() {
        return this.signedImageUrl;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String algorithm; 
        private String certificateSubject; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String objectKey; 
        private String requestId; 
        private String signTime; 
        private String signedImageUrl; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SignUserImageResponseBody model) {
            this.algorithm = model.algorithm;
            this.certificateSubject = model.certificateSubject;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.objectKey = model.objectKey;
            this.requestId = model.requestId;
            this.signTime = model.signTime;
            this.signedImageUrl = model.signedImageUrl;
            this.success = model.success;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CertificateSubject.
         */
        public Builder certificateSubject(String certificateSubject) {
            this.certificateSubject = certificateSubject;
            return this;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
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
         * SignTime.
         */
        public Builder signTime(String signTime) {
            this.signTime = signTime;
            return this;
        }

        /**
         * SignedImageUrl.
         */
        public Builder signedImageUrl(String signedImageUrl) {
            this.signedImageUrl = signedImageUrl;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SignUserImageResponseBody build() {
            return new SignUserImageResponseBody(this);
        } 

    } 

}
