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
 * {@link DeleteLiveMessageUserMessageRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveMessageUserMessageRequest</p>
 */
public class DeleteLiveMessageUserMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    private String dataCenter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleterId")
    private String deleterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleterInfo")
    private String deleterInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverId;

    private DeleteLiveMessageUserMessageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.deleterId = builder.deleterId;
        this.deleterInfo = builder.deleterInfo;
        this.messageId = builder.messageId;
        this.receiverId = builder.receiverId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveMessageUserMessageRequest create() {
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
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return deleterId
     */
    public String getDeleterId() {
        return this.deleterId;
    }

    /**
     * @return deleterInfo
     */
    public String getDeleterInfo() {
        return this.deleterInfo;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return receiverId
     */
    public String getReceiverId() {
        return this.receiverId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveMessageUserMessageRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String deleterId; 
        private String deleterInfo; 
        private String messageId; 
        private String receiverId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveMessageUserMessageRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.deleterId = request.deleterId;
            this.deleterInfo = request.deleterInfo;
            this.messageId = request.messageId;
            this.receiverId = request.receiverId;
        } 

        /**
         * <p>The application ID.</p>
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
         * <p>The data center where the interactive messaging application is deployed. Set this parameter to the value of DataCenter that you specified when you called the <a href="https://help.aliyun.com/document_detail/2593195.html">CreateLiveMessageApp</a> operation. Valid values: cn-shanghai (Shanghai) and ap-southeast-1 (Singapore).</p>
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
         * <p>The ID of the user who performs the deletion operation. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>169830****</p>
         */
        public Builder deleterId(String deleterId) {
            this.putQueryParameter("DeleterId", deleterId);
            this.deleterId = deleterId;
            return this;
        }

        /**
         * <p>The additional information about the user who performs the deletion operation. The value can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        public Builder deleterInfo(String deleterInfo) {
            this.putQueryParameter("DeleterInfo", deleterInfo);
            this.deleterInfo = deleterInfo;
            return this;
        }

        /**
         * <p>The ID of the message that you want to delete. Set this parameter to the value of MsgTid that you specified when you called the SendLiveMessageUser operation. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The ID of the user who received the message to delete. The ID can contain only letters and digits and can be up to 64 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>169830****</p>
         */
        public Builder receiverId(String receiverId) {
            this.putQueryParameter("ReceiverId", receiverId);
            this.receiverId = receiverId;
            return this;
        }

        @Override
        public DeleteLiveMessageUserMessageRequest build() {
            return new DeleteLiveMessageUserMessageRequest(this);
        } 

    } 

}
