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
 * {@link DetectAigcImageResponseBody} extends {@link TeaModel}
 *
 * <p>DetectAigcImageResponseBody</p>
 */
public class DetectAigcImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Body")
    private java.util.List<DetectAigcImageResponseBodyBody> body;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DetectAigcImageResponseBody(Builder builder) {
        this.body = builder.body;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectAigcImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.List<DetectAigcImageResponseBodyBody> getBody() {
        return this.body;
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
        private java.util.List<DetectAigcImageResponseBodyBody> body; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DetectAigcImageResponseBody model) {
            this.body = model.body;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Body.
         */
        public Builder body(java.util.List<DetectAigcImageResponseBodyBody> body) {
            this.body = body;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DetectAigcImageResponseBody build() {
            return new DetectAigcImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetectAigcImageResponseBody} extends {@link TeaModel}
     *
     * <p>DetectAigcImageResponseBody</p>
     */
    public static class DetectAigcImageResponseBodyBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private DetectAigcImageResponseBodyBody(Builder builder) {
            this.confidence = builder.confidence;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectAigcImageResponseBodyBody create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String confidence; 
            private String label; 

            private Builder() {
            } 

            private Builder(DetectAigcImageResponseBodyBody model) {
                this.confidence = model.confidence;
                this.label = model.label;
            } 

            /**
             * Confidence.
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public DetectAigcImageResponseBodyBody build() {
                return new DetectAigcImageResponseBodyBody(this);
            } 

        } 

    }
}
