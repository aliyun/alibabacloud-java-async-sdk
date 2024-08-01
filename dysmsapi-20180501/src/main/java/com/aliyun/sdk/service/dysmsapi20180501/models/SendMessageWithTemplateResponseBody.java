// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageWithTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageWithTemplateResponseBody</p>
 */
public class SendMessageWithTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("NumberDetail")
    private NumberDetail numberDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCode")
    private String responseCode;

    @com.aliyun.core.annotation.NameInMap("ResponseDescription")
    private String responseDescription;

    @com.aliyun.core.annotation.NameInMap("Segments")
    private String segments;

    @com.aliyun.core.annotation.NameInMap("To")
    private String to;

    private SendMessageWithTemplateResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.numberDetail = builder.numberDetail;
        this.requestId = builder.requestId;
        this.responseCode = builder.responseCode;
        this.responseDescription = builder.responseDescription;
        this.segments = builder.segments;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageWithTemplateResponseBody create() {
        return builder().build();
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
     * @return segments
     */
    public String getSegments() {
        return this.segments;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder {
        private String messageId; 
        private NumberDetail numberDetail; 
        private String requestId; 
        private String responseCode; 
        private String responseDescription; 
        private String segments; 
        private String to; 

        /**
         * The ID of the message.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * The details about the mobile phone number of the recipient.
         */
        public Builder numberDetail(NumberDetail numberDetail) {
            this.numberDetail = numberDetail;
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
         * The status code of the delivery request.
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * The description of the delivery request status.
         */
        public Builder responseDescription(String responseDescription) {
            this.responseDescription = responseDescription;
            return this;
        }

        /**
         * The number of messages that incurred fees.
         */
        public Builder segments(String segments) {
            this.segments = segments;
            return this;
        }

        /**
         * The mobile phone number to which the message was sent. The dialing code was added to the beginning of the mobile phone number. Example: 861503871\*\*\*\*.
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public SendMessageWithTemplateResponseBody build() {
            return new SendMessageWithTemplateResponseBody(this);
        } 

    } 

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
             * The carrier that owns the mobile phone number.
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * The country to which the mobile phone number belongs.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * The region to which the mobile phone number belongs.
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
