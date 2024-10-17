// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchSendMessageToGlobeRequest} extends {@link RequestModel}
 *
 * <p>BatchSendMessageToGlobeRequest</p>
 */
public class BatchSendMessageToGlobeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidityPeriod")
    private Long validityPeriod;

    private BatchSendMessageToGlobeRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.from = builder.from;
        this.message = builder.message;
        this.taskId = builder.taskId;
        this.to = builder.to;
        this.type = builder.type;
        this.validityPeriod = builder.validityPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSendMessageToGlobeRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return validityPeriod
     */
    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public static final class Builder extends Request.Builder<BatchSendMessageToGlobeRequest, Builder> {
        private String channelId; 
        private String from; 
        private String message; 
        private String taskId; 
        private String to; 
        private String type; 
        private Long validityPeriod; 

        private Builder() {
            super();
        } 

        private Builder(BatchSendMessageToGlobeRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.from = request.from;
            this.message = request.message;
            this.taskId = request.taskId;
            this.to = request.to;
            this.type = request.type;
            this.validityPeriod = request.validityPeriod;
        } 

        /**
         * ChannelId.
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
         * <p>[&quot;message to 931520581****&quot;,&quot;message to 931530581****&quot;,&quot;message to 931540581****&quot;,&quot;message to 931550581****&quot;]</p>
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
         * <p>123789****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The mobile phone numbers to which the message is sent. You must add the dialing code to the beginning of each mobile phone number.</p>
         * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/short-message-service/latest/dialing-codes">Dialing codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;931520581****&quot;,&quot;931530581****&quot;,&quot;931540581****&quot;,&quot;931550581****&quot;]</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The type of the message. Valid values:</p>
         * <ul>
         * <li><strong>NOTIFY</strong>: notification</li>
         * <li><strong>MKT</strong>: promotional message</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOTIFY</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The validity period of the message. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder validityPeriod(Long validityPeriod) {
            this.putQueryParameter("ValidityPeriod", validityPeriod);
            this.validityPeriod = validityPeriod;
            return this;
        }

        @Override
        public BatchSendMessageToGlobeRequest build() {
            return new BatchSendMessageToGlobeRequest(this);
        } 

    } 

}
