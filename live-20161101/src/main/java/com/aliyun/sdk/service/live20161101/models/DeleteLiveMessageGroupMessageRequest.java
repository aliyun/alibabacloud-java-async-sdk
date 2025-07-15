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
 * {@link DeleteLiveMessageGroupMessageRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveMessageGroupMessageRequest</p>
 */
public class DeleteLiveMessageGroupMessageRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private DeleteLiveMessageGroupMessageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataCenter = builder.dataCenter;
        this.deleterId = builder.deleterId;
        this.deleterInfo = builder.deleterInfo;
        this.groupId = builder.groupId;
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveMessageGroupMessageRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveMessageGroupMessageRequest, Builder> {
        private String appId; 
        private String dataCenter; 
        private String deleterId; 
        private String deleterInfo; 
        private String groupId; 
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveMessageGroupMessageRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataCenter = request.dataCenter;
            this.deleterId = request.deleterId;
            this.deleterInfo = request.deleterInfo;
            this.groupId = request.groupId;
            this.messageId = request.messageId;
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
         * <p>The ID of the user who deletes the message. The ID must be up to 64 bytes in length and can contain letters and digits.</p>
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
         * <p>testname</p>
         */
        public Builder deleterInfo(String deleterInfo) {
            this.putQueryParameter("DeleterInfo", deleterInfo);
            this.deleterInfo = deleterInfo;
            return this;
        }

        /**
         * <p>The group ID.</p>
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
         * <p>The ID of the message that you want to delete. Set this parameter to the value of MsgTid that you specified when you called the SendLiveMessageGroup operation. The ID must be up to 64 bytes in length and can contain letters and digits.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a74a8fbd3cfe4b2daa8517e4e3******</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public DeleteLiveMessageGroupMessageRequest build() {
            return new DeleteLiveMessageGroupMessageRequest(this);
        } 

    } 

}
