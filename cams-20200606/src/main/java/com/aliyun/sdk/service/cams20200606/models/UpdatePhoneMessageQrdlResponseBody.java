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
 * {@link UpdatePhoneMessageQrdlResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePhoneMessageQrdlResponseBody</p>
 */
public class UpdatePhoneMessageQrdlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePhoneMessageQrdlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePhoneMessageQrdlResponseBody create() {
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

        private Builder(UpdatePhoneMessageQrdlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result returns OK as normal.</p>
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
         * <p>Error description information.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1612C226-E271-4CFE-9F18-4066D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePhoneMessageQrdlResponseBody build() {
            return new UpdatePhoneMessageQrdlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePhoneMessageQrdlResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePhoneMessageQrdlResponseBody</p>
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
             * <p>Deep link address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://wa.msg/">https://wa.msg/</a></p>
             */
            public Builder deepLinkUrl(String deepLinkUrl) {
                this.deepLinkUrl = deepLinkUrl;
                return this;
            }

            /**
             * <p>Generate image types.</p>
             * 
             * <strong>example:</strong>
             * <p>PNG</p>
             */
            public Builder generateQrImage(String generateQrImage) {
                this.generateQrImage = generateQrImage;
                return this;
            }

            /**
             * <p>Number.</p>
             * 
             * <strong>example:</strong>
             * <p>8613800</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Message content.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello</p>
             */
            public Builder prefilledMessage(String prefilledMessage) {
                this.prefilledMessage = prefilledMessage;
                return this;
            }

            /**
             * <p>QR code address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.png">https://img.png</a></p>
             */
            public Builder qrImageUrl(String qrImageUrl) {
                this.qrImageUrl = qrImageUrl;
                return this;
            }

            /**
             * <p>QR code encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>DEDEE998</p>
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
