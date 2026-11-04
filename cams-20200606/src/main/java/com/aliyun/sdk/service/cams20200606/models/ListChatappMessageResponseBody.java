// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListChatappMessageResponseBody} extends {@link TeaModel}
 *
 * <p>ListChatappMessageResponseBody</p>
 */
public class ListChatappMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListChatappMessageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChatappMessageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListChatappMessageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li><p>OK: The request was successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of returned data objects.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>608F9CCA-B5EB-3D72-8047-B25D6D75BDEC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListChatappMessageResponseBody build() {
            return new ListChatappMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChatappMessageResponseBody} extends {@link TeaModel}
     *
     * <p>ListChatappMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessNumber")
        private String businessNumber;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("ClientAcceptStatusName")
        private String clientAcceptStatusName;

        @com.aliyun.core.annotation.NameInMap("ClientReadStatus")
        private String clientReadStatus;

        @com.aliyun.core.annotation.NameInMap("ClientReadStatusName")
        private String clientReadStatusName;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("EventAction")
        private String eventAction;

        @com.aliyun.core.annotation.NameInMap("EventActionName")
        private String eventActionName;

        @com.aliyun.core.annotation.NameInMap("FailBackContent")
        private String failBackContent;

        @com.aliyun.core.annotation.NameInMap("FailBackFlag")
        private String failBackFlag;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        private String languageCode;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("MessageSource")
        private String messageSource;

        @com.aliyun.core.annotation.NameInMap("MessageStatus")
        private String messageStatus;

        @com.aliyun.core.annotation.NameInMap("MessageStatusName")
        private String messageStatusName;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("MessageTypeName")
        private String messageTypeName;

        @com.aliyun.core.annotation.NameInMap("Month")
        private String month;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private String sendTime;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UniqueMessageId")
        private String uniqueMessageId;

        @com.aliyun.core.annotation.NameInMap("UserNumber")
        private String userNumber;

        private Data(Builder builder) {
            this.businessNumber = builder.businessNumber;
            this.channelType = builder.channelType;
            this.clientAcceptStatusName = builder.clientAcceptStatusName;
            this.clientReadStatus = builder.clientReadStatus;
            this.clientReadStatusName = builder.clientReadStatusName;
            this.conversationId = builder.conversationId;
            this.eventAction = builder.eventAction;
            this.eventActionName = builder.eventActionName;
            this.failBackContent = builder.failBackContent;
            this.failBackFlag = builder.failBackFlag;
            this.failReason = builder.failReason;
            this.languageCode = builder.languageCode;
            this.message = builder.message;
            this.messageId = builder.messageId;
            this.messageSource = builder.messageSource;
            this.messageStatus = builder.messageStatus;
            this.messageStatusName = builder.messageStatusName;
            this.messageType = builder.messageType;
            this.messageTypeName = builder.messageTypeName;
            this.month = builder.month;
            this.sendTime = builder.sendTime;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.type = builder.type;
            this.uniqueMessageId = builder.uniqueMessageId;
            this.userNumber = builder.userNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessNumber
         */
        public String getBusinessNumber() {
            return this.businessNumber;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return clientAcceptStatusName
         */
        public String getClientAcceptStatusName() {
            return this.clientAcceptStatusName;
        }

        /**
         * @return clientReadStatus
         */
        public String getClientReadStatus() {
            return this.clientReadStatus;
        }

        /**
         * @return clientReadStatusName
         */
        public String getClientReadStatusName() {
            return this.clientReadStatusName;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return eventAction
         */
        public String getEventAction() {
            return this.eventAction;
        }

        /**
         * @return eventActionName
         */
        public String getEventActionName() {
            return this.eventActionName;
        }

        /**
         * @return failBackContent
         */
        public String getFailBackContent() {
            return this.failBackContent;
        }

        /**
         * @return failBackFlag
         */
        public String getFailBackFlag() {
            return this.failBackFlag;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
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
         * @return messageSource
         */
        public String getMessageSource() {
            return this.messageSource;
        }

        /**
         * @return messageStatus
         */
        public String getMessageStatus() {
            return this.messageStatus;
        }

        /**
         * @return messageStatusName
         */
        public String getMessageStatusName() {
            return this.messageStatusName;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return messageTypeName
         */
        public String getMessageTypeName() {
            return this.messageTypeName;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return sendTime
         */
        public String getSendTime() {
            return this.sendTime;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uniqueMessageId
         */
        public String getUniqueMessageId() {
            return this.uniqueMessageId;
        }

        /**
         * @return userNumber
         */
        public String getUserNumber() {
            return this.userNumber;
        }

        public static final class Builder {
            private String businessNumber; 
            private String channelType; 
            private String clientAcceptStatusName; 
            private String clientReadStatus; 
            private String clientReadStatusName; 
            private String conversationId; 
            private String eventAction; 
            private String eventActionName; 
            private String failBackContent; 
            private String failBackFlag; 
            private String failReason; 
            private String languageCode; 
            private String message; 
            private String messageId; 
            private String messageSource; 
            private String messageStatus; 
            private String messageStatusName; 
            private String messageType; 
            private String messageTypeName; 
            private String month; 
            private String sendTime; 
            private String templateCode; 
            private String templateName; 
            private String type; 
            private String uniqueMessageId; 
            private String userNumber; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.businessNumber = model.businessNumber;
                this.channelType = model.channelType;
                this.clientAcceptStatusName = model.clientAcceptStatusName;
                this.clientReadStatus = model.clientReadStatus;
                this.clientReadStatusName = model.clientReadStatusName;
                this.conversationId = model.conversationId;
                this.eventAction = model.eventAction;
                this.eventActionName = model.eventActionName;
                this.failBackContent = model.failBackContent;
                this.failBackFlag = model.failBackFlag;
                this.failReason = model.failReason;
                this.languageCode = model.languageCode;
                this.message = model.message;
                this.messageId = model.messageId;
                this.messageSource = model.messageSource;
                this.messageStatus = model.messageStatus;
                this.messageStatusName = model.messageStatusName;
                this.messageType = model.messageType;
                this.messageTypeName = model.messageTypeName;
                this.month = model.month;
                this.sendTime = model.sendTime;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
                this.type = model.type;
                this.uniqueMessageId = model.uniqueMessageId;
                this.userNumber = model.userNumber;
            } 

            /**
             * <p>The business phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>86183********</p>
             */
            public Builder businessNumber(String businessNumber) {
                this.businessNumber = businessNumber;
                return this;
            }

            /**
             * <p>The channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>WHATSAPP</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The name of the message acceptance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder clientAcceptStatusName(String clientAcceptStatusName) {
                this.clientAcceptStatusName = clientAcceptStatusName;
                return this;
            }

            /**
             * <p>The message read status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder clientReadStatus(String clientReadStatus) {
                this.clientReadStatus = clientReadStatus;
                return this;
            }

            /**
             * <p>The message read status name.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder clientReadStatusName(String clientReadStatusName) {
                this.clientReadStatusName = clientReadStatusName;
                return this;
            }

            /**
             * <p>The conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>805a66**************************</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The upstream or downstream message type.</p>
             * 
             * <strong>example:</strong>
             * <p>DOWN</p>
             */
            public Builder eventAction(String eventAction) {
                this.eventAction = eventAction;
                return this;
            }

            /**
             * <p>The name of the upstream or downstream message type. Valid values:</p>
             * <ul>
             * <li><p>DOWN: downstream message.</p>
             * </li>
             * <li><p>UP: upstream message.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOWN</p>
             */
            public Builder eventActionName(String eventActionName) {
                this.eventActionName = eventActionName;
                return this;
            }

            /**
             * <p>The fallback content.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder failBackContent(String failBackContent) {
                this.failBackContent = failBackContent;
                return this;
            }

            /**
             * <p>Indicates whether the message falls back to SMS. Valid values:</p>
             * <ul>
             * <li><p>Y: Yes.</p>
             * </li>
             * <li><p>N: No.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder failBackFlag(String failBackFlag) {
                this.failBackFlag = failBackFlag;
                return this;
            }

            /**
             * <p>The reason for the sending failure.</p>
             * 
             * <strong>example:</strong>
             * <p>timeout</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>The template language. For more languages, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>202509*******************</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message source.</p>
             * 
             * <strong>example:</strong>
             * <p>api</p>
             */
            public Builder messageSource(String messageSource) {
                this.messageSource = messageSource;
                return this;
            }

            /**
             * <p>The message status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder messageStatus(String messageStatus) {
                this.messageStatus = messageStatus;
                return this;
            }

            /**
             * <p>The message status name.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder messageStatusName(String messageStatusName) {
                this.messageStatusName = messageStatusName;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>INTERACTIVE</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The message type name.</p>
             * 
             * <strong>example:</strong>
             * <p>interactive</p>
             */
            public Builder messageTypeName(String messageTypeName) {
                this.messageTypeName = messageTypeName;
                return this;
            }

            /**
             * <p>The month of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>202507</p>
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * <p>The sending time in ISO 8601 format with a time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-11T01:16:49.761+00:00</p>
             */
            public Builder sendTime(String sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * <p>The template code.</p>
             * 
             * <strong>example:</strong>
             * <p>1103***************</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>picture_template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>message</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The unique message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20250911******************************</p>
             */
            public Builder uniqueMessageId(String uniqueMessageId) {
                this.uniqueMessageId = uniqueMessageId;
                return this;
            }

            /**
             * <p>The user phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>86177********</p>
             */
            public Builder userNumber(String userNumber) {
                this.userNumber = userNumber;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
