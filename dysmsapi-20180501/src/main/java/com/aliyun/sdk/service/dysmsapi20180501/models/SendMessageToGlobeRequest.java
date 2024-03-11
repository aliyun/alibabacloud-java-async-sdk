// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGlobeRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToGlobeRequest</p>
 */
public class SendMessageToGlobeRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private String to;

    @Query
    @NameInMap("ValidityPeriod")
    private Long validityPeriod;

    private SendMessageToGlobeRequest(Builder builder) {
        super(builder);
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
            this.from = request.from;
            this.message = request.message;
            this.taskId = request.taskId;
            this.to = request.to;
            this.validityPeriod = request.validityPeriod;
        } 

        /**
         * The mobile phone number of the sender. You can also specify a sender ID. The sender ID can contain both letters and digits. If it does, the ID must be between 1 to 11 characters in length. If the sender ID contains only digits, it must be 1 to 15 characters in length.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The content of the message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * The ID of the messaging campaign. It must be 1 to 255 characters in length. The ID is the value of the TaskId field in the delivery receipt of the message.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The mobile phone number to which the message is sent. You must add the dialing code to the beginning of the mobile phone number. Example: 8521245567\*\*\*\*.
         * <p>
         * 
         * For more information, see [Dialing codes](https://www.alibabacloud.com/help/zh/short-message-service/latest/dialing-codes).
         * 
         * >  You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * The validity period of the message. Unit: seconds.
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
