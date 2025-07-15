// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SendLiveMessageUserRequest} extends {@link RequestModel}
 *
 * <p>SendLiveMessageUserRequest</p>
 */
public class SendLiveMessageUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HighReliability")
    private Boolean highReliability;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgTid")
    private String msgTid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgType")
    private Long msgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderInfo")
    private String senderInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
    private Boolean storage;

    private SendLiveMessageUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.body = builder.body;
        this.dataCenter = builder.dataCenter;
        this.highReliability = builder.highReliability;
        this.msgTid = builder.msgTid;
        this.msgType = builder.msgType;
        this.receiverId = builder.receiverId;
        this.senderId = builder.senderId;
        this.senderInfo = builder.senderInfo;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveMessageUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return highReliability
     */
    public Boolean getHighReliability() {
        return this.highReliability;
    }

    /**
     * @return msgTid
     */
    public String getMsgTid() {
        return this.msgTid;
    }

    /**
     * @return msgType
     */
    public Long getMsgType() {
        return this.msgType;
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderInfo
     */
    public String getSenderInfo() {
        return this.senderInfo;
    }

    /**
     * @return storage
     */
    public Boolean getStorage() {
        return this.storage;
    }

    public static final class Builder extends Request.Builder<SendLiveMessageUserRequest, Builder> {
        private String appId; 
        private String body; 
        private String dataCenter; 
        private Boolean highReliability; 
        private String msgTid; 
        private Long msgType; 
        private String receiverId; 
        private String senderId; 
        private String senderInfo; 
        private Boolean storage; 

        private Builder() {
            super();
        } 

        private Builder(SendLiveMessageUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.body = request.body;
            this.dataCenter = request.dataCenter;
            this.highReliability = request.highReliability;
            this.msgTid = request.msgTid;
            this.msgType = request.msgType;
            this.receiverId = request.receiverId;
            this.senderId = request.senderId;
            this.senderInfo = request.senderInfo;
            this.storage = request.storage;
        } 

        /**
         * <p>The ID of the interactive messaging application in which the message is sent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The message body. It can be up to 15 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello, user</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The data center. It must be the same as the data center that was specified when you called the <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a> operation to create the interactive messaging application. Valid values: cn-shanghai and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putQueryParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>Specifies whether to set the message as a highly reliable message. A highly reliable message ensures that success is returned only after the receiver has received the message and responded. If the receiver does not respond within 3 seconds, failure is returned.</p>
         * <ul>
         * <li>true: sets the message as a highly reliable message.</li>
         * <li>false (default): does not set the message as a highly reliable message.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported only by the client SDK V1.5.1 and later. When you send a message to a client with an earlier SDK version, the message can be successfully sent without waiting for an acknowledgement (ACK) response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder highReliability(Boolean highReliability) {
            this.putQueryParameter("HighReliability", highReliability);
            this.highReliability = highReliability;
            return this;
        }

        /**
         * <p>The ID of the message, which is a unique identifier that can be used to delete the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>169830****</p>
         */
        public Builder msgTid(String msgTid) {
            this.putQueryParameter("MsgTid", msgTid);
            this.msgTid = msgTid;
            return this;
        }

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder msgType(Long msgType) {
            this.putQueryParameter("MsgType", msgType);
            this.msgType = msgType;
            return this;
        }

        /**
         * <p>The ID of the user who receives the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * <blockquote>
         * <p> Make sure that the user who receives the message is online. You can call the CheckLiveMessageUsersOnline operation to query whether the user is online.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2</p>
         */
        public Builder receiverId(String receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
            return this;
        }

        /**
         * <p>The ID of the user who sends the message. The ID can be up to 64 bytes in length and can contain letters and digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder senderId(String senderId) {
            this.putQueryParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * <p>The additional information about the user who sends the message. It can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1meta1</p>
         */
        public Builder senderInfo(String senderInfo) {
            this.putQueryParameter("SenderInfo", senderInfo);
            this.senderInfo = senderInfo;
            return this;
        }

        /**
         * <p>Specifies whether to store the message.</p>
         * <ul>
         * <li>true: stores the message.</li>
         * <li>false (default): does not store the message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder storage(Boolean storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        @Override
        public SendLiveMessageUserRequest build() {
            return new SendLiveMessageUserRequest(this);
        } 

    } 

}
