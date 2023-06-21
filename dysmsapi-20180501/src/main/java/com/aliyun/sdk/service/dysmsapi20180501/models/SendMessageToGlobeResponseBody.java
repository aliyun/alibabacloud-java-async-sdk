// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGlobeResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageToGlobeResponseBody</p>
 */
public class SendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("From")
    private String from;

    @NameInMap("MessageId")
    private String messageId;

    @NameInMap("NumberDetail")
    private NumberDetail numberDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResponseCode")
    private String responseCode;

    @NameInMap("ResponseDescription")
    private String responseDescription;

    @NameInMap("Segments")
    private String segments;

    @NameInMap("To")
    private String to;

    private SendMessageToGlobeResponseBody(Builder builder) {
        this.from = builder.from;
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

    public static SendMessageToGlobeResponseBody create() {
        return builder().build();
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
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
        private String from; 
        private String messageId; 
        private NumberDetail numberDetail; 
        private String requestId; 
        private String responseCode; 
        private String responseDescription; 
        private String segments; 
        private String to; 

        /**
         * The sender ID returned.
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

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
         * The mobile phone number to which the message was sent.
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public SendMessageToGlobeResponseBody build() {
            return new SendMessageToGlobeResponseBody(this);
        } 

    } 

    public static class NumberDetail extends TeaModel {
        @NameInMap("Carrier")
        private String carrier;

        @NameInMap("Country")
        private String country;

        @NameInMap("Region")
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
