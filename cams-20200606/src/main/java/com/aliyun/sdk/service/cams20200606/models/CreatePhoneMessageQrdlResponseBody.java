// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link CreatePhoneMessageQrdlResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePhoneMessageQrdlResponseBody</p>
 */
public class CreatePhoneMessageQrdlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePhoneMessageQrdlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePhoneMessageQrdlResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePhoneMessageQrdlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>If OK is returned, the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePhoneMessageQrdlResponseBody build() {
            return new CreatePhoneMessageQrdlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePhoneMessageQrdlResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePhoneMessageQrdlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeepLinkUrl")
        private String deepLinkUrl;

        @com.aliyun.core.annotation.NameInMap("GenerateQrImage")
        private String generateQrImage;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PrefilledMessage")
        private String prefilledMessage;

        @com.aliyun.core.annotation.NameInMap("QrImageUrl")
        private String qrImageUrl;

        @com.aliyun.core.annotation.NameInMap("QrdlCode")
        private String qrdlCode;

        private Data(Builder builder) {
            this.deepLinkUrl = builder.deepLinkUrl;
            this.generateQrImage = builder.generateQrImage;
            this.phoneNumber = builder.phoneNumber;
            this.prefilledMessage = builder.prefilledMessage;
            this.qrImageUrl = builder.qrImageUrl;
            this.qrdlCode = builder.qrdlCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deepLinkUrl
         */
        public String getDeepLinkUrl() {
            return this.deepLinkUrl;
        }

        /**
         * @return generateQrImage
         */
        public String getGenerateQrImage() {
            return this.generateQrImage;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return prefilledMessage
         */
        public String getPrefilledMessage() {
            return this.prefilledMessage;
        }

        /**
         * @return qrImageUrl
         */
        public String getQrImageUrl() {
            return this.qrImageUrl;
        }

        /**
         * @return qrdlCode
         */
        public String getQrdlCode() {
            return this.qrdlCode;
        }

        public static final class Builder {
            private String deepLinkUrl; 
            private String generateQrImage; 
            private String phoneNumber; 
            private String prefilledMessage; 
            private String qrImageUrl; 
            private String qrdlCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deepLinkUrl = model.deepLinkUrl;
                this.generateQrImage = model.generateQrImage;
                this.phoneNumber = model.phoneNumber;
                this.prefilledMessage = model.prefilledMessage;
                this.qrImageUrl = model.qrImageUrl;
                this.qrdlCode = model.qrdlCode;
            } 

            /**
             * <p>The URL of the deep link.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://wa.qrdl/">https://wa.qrdl/</a></p>
             */
            public Builder deepLinkUrl(String deepLinkUrl) {
                this.deepLinkUrl = deepLinkUrl;
                return this;
            }

            /**
             * <p>The format of the generated image.</p>
             * 
             * <strong>example:</strong>
             * <p>PNG</p>
             */
            public Builder generateQrImage(String generateQrImage) {
                this.generateQrImage = generateQrImage;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>8613800</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello</p>
             */
            public Builder prefilledMessage(String prefilledMessage) {
                this.prefilledMessage = prefilledMessage;
                return this;
            }

            /**
             * <p>The URL of the QR code.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.png">http://img.png</a></p>
             */
            public Builder qrImageUrl(String qrImageUrl) {
                this.qrImageUrl = qrImageUrl;
                return this;
            }

            /**
             * <p>The mode of the quick-response (QR) code.</p>
             * 
             * <strong>example:</strong>
             * <p>D9II3***</p>
             */
            public Builder qrdlCode(String qrdlCode) {
                this.qrdlCode = qrdlCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
