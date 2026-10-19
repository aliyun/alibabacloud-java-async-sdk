// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link PublishMessageRequest} extends {@link RequestModel}
 *
 * <p>PublishMessageRequest</p>
 */
public class PublishMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageAttributes")
    private MessageAttributes messageAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageBody")
    private String messageBody;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageGroupId")
    private String messageGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageTag")
    private String messageTag;

    private PublishMessageRequest(Builder builder) {
        super(builder);
        this.topicName = builder.topicName;
        this.messageAttributes = builder.messageAttributes;
        this.messageBody = builder.messageBody;
        this.messageGroupId = builder.messageGroupId;
        this.messageTag = builder.messageTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return messageAttributes
     */
    public MessageAttributes getMessageAttributes() {
        return this.messageAttributes;
    }

    /**
     * @return messageBody
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * @return messageGroupId
     */
    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    /**
     * @return messageTag
     */
    public String getMessageTag() {
        return this.messageTag;
    }

    public static final class Builder extends Request.Builder<PublishMessageRequest, Builder> {
        private String topicName; 
        private MessageAttributes messageAttributes; 
        private String messageBody; 
        private String messageGroupId; 
        private String messageTag; 

        private Builder() {
            super();
        } 

        private Builder(PublishMessageRequest request) {
            super(request);
            this.topicName = request.topicName;
            this.messageAttributes = request.messageAttributes;
            this.messageBody = request.messageBody;
            this.messageGroupId = request.messageGroupId;
            this.messageTag = request.messageTag;
        } 

        /**
         * <p><strong>Topic name</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTopic</p>
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * <p><strong>Message attributes</strong>. You do not need to set this parameter when pushing messages to queues or HTTP endpoints.</p>
         */
        public Builder messageAttributes(MessageAttributes messageAttributes) {
            this.putBodyParameter("MessageAttributes", messageAttributes);
            this.messageAttributes = messageAttributes;
            return this;
        }

        /**
         * <p><strong>Message content</strong>. Base64-encode the content beforehand.
         * Maximum size: 64 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>hello topic</p>
         */
        public Builder messageBody(String messageBody) {
            this.putBodyParameter("MessageBody", messageBody);
            this.messageBody = messageBody;
            return this;
        }

        /**
         * MessageGroupId.
         */
        public Builder messageGroupId(String messageGroupId) {
            this.putBodyParameter("MessageGroupId", messageGroupId);
            this.messageGroupId = messageGroupId;
            return this;
        }

        /**
         * <p><strong>Message tag</strong>, used for message filtering on subscriptions.
         * Maximum length: 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>order-event</p>
         */
        public Builder messageTag(String messageTag) {
            this.putBodyParameter("MessageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        @Override
        public PublishMessageRequest build() {
            return new PublishMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link PublishMessageRequest} extends {@link TeaModel}
     *
     * <p>PublishMessageRequest</p>
     */
    public static class MessageAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectMail")
        private String directMail;

        @com.aliyun.core.annotation.NameInMap("DirectSMS")
        private String directSMS;

        @com.aliyun.core.annotation.NameInMap("Push")
        private String push;

        private MessageAttributes(Builder builder) {
            this.directMail = builder.directMail;
            this.directSMS = builder.directSMS;
            this.push = builder.push;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageAttributes create() {
            return builder().build();
        }

        /**
         * @return directMail
         */
        public String getDirectMail() {
            return this.directMail;
        }

        /**
         * @return directSMS
         */
        public String getDirectSMS() {
            return this.directSMS;
        }

        /**
         * @return push
         */
        public String getPush() {
            return this.push;
        }

        public static final class Builder {
            private String directMail; 
            private String directSMS; 
            private String push; 

            private Builder() {
            } 

            private Builder(MessageAttributes model) {
                this.directMail = model.directMail;
                this.directSMS = model.directSMS;
                this.push = model.push;
            } 

            /**
             * <p><strong>Email push attributes</strong> (JSON-formatted string).</p>
             * 
             * <strong>example:</strong>
             * <p>For more information, see <a href="https://www.alibabacloud.com/help/en/direct-mail/singlesendmail">https://www.alibabacloud.com/help/en/direct-mail/singlesendmail</a>.</p>
             */
            public Builder directMail(String directMail) {
                this.directMail = directMail;
                return this;
            }

            /**
             * <p>SMS push attributes (JSON-formatted string), including <code>FreeSignName</code>, <code>TemplateCode</code>, <code>Type</code>, <code>Receiver</code>, and <code>SmsParams</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;FreeSignName&quot;:&quot;Alibaba Cloud&quot;,&quot;TemplateCode&quot;:&quot;SMS_123456&quot;,&quot;Type&quot;:&quot;singleContent&quot;,&quot;Receiver&quot;:&quot;13800000000&quot;,&quot;SmsParams&quot;:&quot;{\&quot;code\&quot;:\&quot;1234\&quot;}&quot;}</p>
             */
            public Builder directSMS(String directSMS) {
                this.directSMS = directSMS;
                return this;
            }

            /**
             * <p>Mobile push attributes (JSON-formatted string).</p>
             * 
             * <strong>example:</strong>
             * <p>Sample mobile push attributes value.</p>
             */
            public Builder push(String push) {
                this.push = push;
                return this;
            }

            public MessageAttributes build() {
                return new MessageAttributes(this);
            } 

        } 

    }
}
