// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendMessageToGlobeRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToGlobeRequest</p>
 */
public class SendMessageToGlobeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
    private Long validityPeriod;

    private SendMessageToGlobeRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.from = builder.from;
        this.message = builder.message;
        this.taskId = builder.taskId;
        this.to = builder.to;
        this.validityPeriod = builder.validityPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageToGlobeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * @return validityPeriod
     */
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public static final class Builder extends Request.Builder<SendMessageToGlobeRequest, Builder> {
        private String channelId; 
        private String from; 
        private String message; 
        private String taskId; 
        private String to; 
        private Long validityPeriod; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageToGlobeRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.from = request.from;
            this.message = request.message;
            this.taskId = request.taskId;
            this.to = request.to;
            this.validityPeriod = request.validityPeriod;
        } 

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>3790</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The mobile phone number of the sender. You can also specify a sender ID. The sender ID can contain both letters and digits. If it does, the ID must be between 1 to 11 characters in length. If the sender ID contains only digits, it must be 1 to 15 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Alicloud321</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The content of the message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the messaging campaign. It must be 1 to 255 characters in length. The ID is the value of the TaskId field in the delivery receipt of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>123****789</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The mobile phone number to which the message is sent. You must add the dialing code to the beginning of the mobile phone number. Example: 8521245567****.</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/sms/product-overview/dialing-codes?spm=a2c63.p38356.0.0.48b940a1PFYRMz">Dialing codes</a>.</p>
         * <blockquote>
         * <p> You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8521245567****</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The validity period of the message. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder validityPeriod(Long validityPeriod) {
            this.putQueryParameter("ValidityPeriod", validityPeriod);
            this.validityPeriod = validityPeriod;
            return this;
        }

        @Override
        public SendMessageToGlobeRequest build() {
            return new SendMessageToGlobeRequest(this);
        } 

    } 

}
