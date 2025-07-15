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
 * {@link SendLiveMessageGroupRequest} extends {@link RequestModel}
 *
 * <p>SendLiveMessageGroupRequest</p>
 */
public class SendLiveMessageGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgTid")
    private String msgTid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgType")
    private Long msgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoCache")
    private Boolean noCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoStorage")
    private Boolean noStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String senderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderMetaInfo")
    private String senderMetaInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StaticsIncrease")
    private Long staticsIncrease;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    private Long weight;

    private SendLiveMessageGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.body = builder.body;
        this.dataCenter = builder.dataCenter;
        this.groupId = builder.groupId;
        this.msgTid = builder.msgTid;
        this.msgType = builder.msgType;
        this.noCache = builder.noCache;
        this.noStorage = builder.noStorage;
        this.senderId = builder.senderId;
        this.senderMetaInfo = builder.senderMetaInfo;
        this.staticsIncrease = builder.staticsIncrease;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLiveMessageGroupRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return noCache
     */
    public Boolean getNoCache() {
        return this.noCache;
    }

    /**
     * @return noStorage
     */
    public Boolean getNoStorage() {
        return this.noStorage;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderMetaInfo
     */
    public String getSenderMetaInfo() {
        return this.senderMetaInfo;
    }

    /**
     * @return staticsIncrease
     */
    public Long getStaticsIncrease() {
        return this.staticsIncrease;
    }

    /**
     * @return weight
     */
    public Long getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<SendLiveMessageGroupRequest, Builder> {
        private String appId; 
        private String body; 
        private String dataCenter; 
        private String groupId; 
        private String msgTid; 
        private Long msgType; 
        private Boolean noCache; 
        private Boolean noStorage; 
        private String senderId; 
        private String senderMetaInfo; 
        private Long staticsIncrease; 
        private Long weight; 

        private Builder() {
            super();
        } 

        private Builder(SendLiveMessageGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.body = request.body;
            this.dataCenter = request.dataCenter;
            this.groupId = request.groupId;
            this.msgTid = request.msgTid;
            this.msgType = request.msgType;
            this.noCache = request.noCache;
            this.noStorage = request.noStorage;
            this.senderId = request.senderId;
            this.senderMetaInfo = request.senderMetaInfo;
            this.staticsIncrease = request.staticsIncrease;
            this.weight = request.weight;
        } 

        /**
         * <p>The ID of the interactive messaging application in which the message is received.</p>
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
         * <p>The message body. The body can be up to 15 KB in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello,group</p>
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
         * <p>The ID of the group that receives the message.</p>
         * <blockquote>
         * <p> Make sure that the specified group ID exists. Otherwise, a ResourceNotExist error is returned.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptest</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
         * <p>1</p>
         */
        public Builder msgType(Long msgType) {
            this.putQueryParameter("MsgType", msgType);
            this.msgType = msgType;
            return this;
        }

        /**
         * <p>Specifies whether to disable message caching. Valid values: true and false. Default value: false, which specifies that the message is cached to the recent message list of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder noCache(Boolean noCache) {
            this.putQueryParameter("NoCache", noCache);
            this.noCache = noCache;
            return this;
        }

        /**
         * <p>Specifies whether to disable message storage. Valid values: true and false. Default value: false, which specifies that the message is stored for a validity period of 30 days. You can find the message in the response of the ListLiveMessageGroupMessages operation. If you do not want to store the message, set this parameter to true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder noStorage(Boolean noStorage) {
            this.putQueryParameter("NoStorage", noStorage);
            this.noStorage = noStorage;
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
         * <p>The additional information about the user who sends the message. The value can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1meta1</p>
         */
        public Builder senderMetaInfo(String senderMetaInfo) {
            this.putQueryParameter("SenderMetaInfo", senderMetaInfo);
            this.senderMetaInfo = senderMetaInfo;
            return this;
        }

        /**
         * <p>The contribution of the message to the increase in the number of messages of this type. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder staticsIncrease(Long staticsIncrease) {
            this.putQueryParameter("StaticsIncrease", staticsIncrease);
            this.staticsIncrease = staticsIncrease;
            return this;
        }

        /**
         * <p>The weight of the message. Default value: 1. A greater value indicates a higher priority. For a message of the highest priority, you can set the weight to 1000000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder weight(Long weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public SendLiveMessageGroupRequest build() {
            return new SendLiveMessageGroupRequest(this);
        } 

    } 

}
