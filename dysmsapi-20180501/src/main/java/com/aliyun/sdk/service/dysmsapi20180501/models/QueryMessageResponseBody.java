// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMessageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageResponseBody</p>
 */
public class QueryMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorDescription")
    private String errorDescription;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("NumberDetail")
    private NumberDetail numberDetail;

    @com.aliyun.core.annotation.NameInMap("ReceiveDate")
    private String receiveDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.NameInMap("ResponseDescription")
    private String responseDescription;

    @com.aliyun.core.annotation.NameInMap("SendDate")
    private String sendDate;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("To")
    private String to;

    private QueryMessageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorDescription = builder.errorDescription;
        this.message = builder.message;
        this.messageId = builder.messageId;
        this.numberDetail = builder.numberDetail;
        this.receiveDate = builder.receiveDate;
        this.requestId = builder.requestId;
        this.responseCode = builder.responseCode;
        this.responseDescription = builder.responseDescription;
        this.sendDate = builder.sendDate;
        this.status = builder.status;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorDescription
     */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return numberDetail
     */
    public NumberDetail getNumberDetail() {
        return this.numberDetail;
    }

    /**
     * @return receiveDate
     */
    public String getReceiveDate() {
        return this.receiveDate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseCode
     */
    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * @return responseDescription
     */
    public String getResponseDescription() {
        return this.responseDescription;
    }

    /**
     * @return sendDate
     */
    public String getSendDate() {
        return this.sendDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorDescription; 
        private String message; 
        private String messageId; 
        private NumberDetail numberDetail; 
        private String receiveDate; 
        private String requestId; 
        private String responseCode; 
        private String responseDescription; 
        private String sendDate; 
        private String status; 
        private String to; 

        /**
         * <p>The status code of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>DELIVERED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        /**
         * <p>The content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1008030xxx3003</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The details about the mobile phone number.</p>
         */
        public Builder numberDetail(NumberDetail numberDetail) {
            this.numberDetail = numberDetail;
            return this;
        }

        /**
         * <p>The time when the delivery receipt was received from the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>Mon, 24 Dec 2018 16:58:22 +0800</p>
         */
        public Builder receiveDate(String receiveDate) {
            this.receiveDate = receiveDate;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status code of the delivery request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * <p>The description of the delivery request status.</p>
         * 
         * <strong>example:</strong>
         * <p>The SMS Send Request was accepted</p>
         */
        public Builder responseDescription(String responseDescription) {
            this.responseDescription = responseDescription;
            return this;
        }

        /**
         * <p>The time when the message was sent to the carrier.</p>
         * 
         * <strong>example:</strong>
         * <p>Mon, 24 Dec 2018 16:58:22 +0800</p>
         */
        public Builder sendDate(String sendDate) {
            this.sendDate = sendDate;
            return this;
        }

        /**
         * <p>The delivery status of the message.</p>
         * <ul>
         * <li>1: The message was sent.</li>
         * <li>2: The message failed to be sent.</li>
         * <li>3: The message is being sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The mobile phone number to which the message was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>6581xxx810</p>
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public QueryMessageResponseBody build() {
            return new QueryMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMessageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageResponseBody</p>
     */
    public static class NumberDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private NumberDetail(Builder builder) {
            this.carrier = builder.carrier;
            this.country = builder.country;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumberDetail create() {
            return builder().build();
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String carrier; 
            private String country; 
            private String region; 

            /**
             * <p>The carrier that owns the mobile phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>CMI</p>
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * <p>The country to which the mobile phone number belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>China</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The region to which the mobile phone number belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>HongKong</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public NumberDetail build() {
                return new NumberDetail(this);
            } 

        } 

    }
}
