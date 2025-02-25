// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendMessageToGlobeResponseBody} extends {@link TeaModel}
 *
 * <p>SendMessageToGlobeResponseBody</p>
 */
public class SendMessageToGlobeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

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
         * <p>The sender ID returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicloud321</p>
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>1008030300****</p>
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The details about the mobile phone number of the recipient.</p>
         */
        public Builder numberDetail(NumberDetail numberDetail) {
            this.numberDetail = numberDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
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
         * <p>The number of messages that incurred fees.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder segments(String segments) {
            this.segments = segments;
            return this;
        }

        /**
         * <p>The mobile phone number to which the message was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>1380000****</p>
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public SendMessageToGlobeResponseBody build() {
            return new SendMessageToGlobeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendMessageToGlobeResponseBody} extends {@link TeaModel}
     *
     * <p>SendMessageToGlobeResponseBody</p>
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
