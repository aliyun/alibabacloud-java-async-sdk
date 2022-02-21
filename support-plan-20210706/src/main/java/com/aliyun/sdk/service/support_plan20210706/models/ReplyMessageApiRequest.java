// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplyMessageApiRequest} extends {@link RequestModel}
 *
 * <p>ReplyMessageApiRequest</p>
 */
public class ReplyMessageApiRequest extends Request {
    @Query
    @NameInMap("MsgContent")
    @Validation(required = true)
    private String msgContent;

    @Query
    @NameInMap("MsgType")
    private String msgType;

    @Query
    @NameInMap("OpenGroupId")
    private String openGroupId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private ReplyMessageApiRequest(Builder builder) {
        super(builder);
        this.msgContent = builder.msgContent;
        this.msgType = builder.msgType;
        this.openGroupId = builder.openGroupId;
        this.orderId = builder.orderId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplyMessageApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msgContent
     */
    public String getMsgContent() {
        return this.msgContent;
    }

    /**
     * @return msgType
     */
    public String getMsgType() {
        return this.msgType;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ReplyMessageApiRequest, Builder> {
        private String msgContent; 
        private String msgType; 
        private String openGroupId; 
        private String orderId; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ReplyMessageApiRequest response) {
            super(response);
            this.msgContent = response.msgContent;
            this.msgType = response.msgType;
            this.openGroupId = response.openGroupId;
            this.orderId = response.orderId;
            this.userId = response.userId;
            this.userName = response.userName;
        } 

        /**
         * 消息内容
         */
        public Builder msgContent(String msgContent) {
            this.putQueryParameter("MsgContent", msgContent);
            this.msgContent = msgContent;
            return this;
        }

        /**
         * 消息类型
         */
        public Builder msgType(String msgType) {
            this.putQueryParameter("MsgType", msgType);
            this.msgType = msgType;
            return this;
        }

        /**
         * 群Id
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * 任务单Id
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * 消息发送人Id
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * 消息发送人
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ReplyMessageApiRequest build() {
            return new ReplyMessageApiRequest(this);
        } 

    } 

}
