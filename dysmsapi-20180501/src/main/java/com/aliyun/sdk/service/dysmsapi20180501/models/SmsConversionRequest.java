// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SmsConversionRequest} extends {@link RequestModel}
 *
 * <p>SmsConversionRequest</p>
 */
public class SmsConversionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversionTime")
    private Long conversionTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Delivered")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean delivered;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private SmsConversionRequest(Builder builder) {
        super(builder);
        this.conversionTime = builder.conversionTime;
        this.delivered = builder.delivered;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmsConversionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversionTime
     */
    public Long getConversionTime() {
        return this.conversionTime;
    }

    /**
     * @return delivered
     */
    public Boolean getDelivered() {
        return this.delivered;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<SmsConversionRequest, Builder> {
        private Long conversionTime; 
        private Boolean delivered; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(SmsConversionRequest request) {
            super(request);
            this.conversionTime = request.conversionTime;
            this.delivered = request.delivered;
            this.messageId = request.messageId;
        } 

        /**
         * <p>The time when the OTP message was delivered. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <ul>
         * <li>If you leave the parameter empty, the current timestamp is specified by default.</li>
         * <li>If you specify the parameter, the timestamp must be greater than the message sending time and less than the current timestamp.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1349055900000</p>
         */
        public Builder conversionTime(Long conversionTime) {
            this.putQueryParameter("ConversionTime", conversionTime);
            this.conversionTime = conversionTime;
            return this;
        }

        /**
         * <p>Specifies whether customers replied to the OTP message. Valid values: true and false.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder delivered(Boolean delivered) {
            this.putQueryParameter("Delivered", delivered);
            this.delivered = delivered;
            return this;
        }

        /**
         * <p>The ID of the OTP message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1008030300****</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public SmsConversionRequest build() {
            return new SmsConversionRequest(this);
        } 

    } 

}
