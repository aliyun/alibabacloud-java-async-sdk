// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePdnsUdpIpSegmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePdnsUdpIpSegmentResponseBody</p>
 */
public class CreatePdnsUdpIpSegmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ValidMessage")
    private String validMessage;

    private CreatePdnsUdpIpSegmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.validMessage = builder.validMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdnsUdpIpSegmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return validMessage
     */
    public String getValidMessage() {
        return this.validMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String validMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ValidMessage.
         */
        public Builder validMessage(String validMessage) {
            this.validMessage = validMessage;
            return this;
        }

        public CreatePdnsUdpIpSegmentResponseBody build() {
            return new CreatePdnsUdpIpSegmentResponseBody(this);
        } 

    } 

}
