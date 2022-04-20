// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCommentRequest} extends {@link RequestModel}
 *
 * <p>SendCommentRequest</p>
 */
public class SendCommentRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("SenderId")
    @Validation(required = true)
    private String senderId;

    @Body
    @NameInMap("SenderNick")
    private String senderNick;

    private SendCommentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.content = builder.content;
        this.extension = builder.extension;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.senderId = builder.senderId;
        this.senderNick = builder.senderNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCommentRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderNick
     */
    public String getSenderNick() {
        return this.senderNick;
    }

    public static final class Builder extends Request.Builder<SendCommentRequest, Builder> {
        private String appId; 
        private String content; 
        private java.util.Map < String, String > extension; 
        private String regionId; 
        private String roomId; 
        private String senderId; 
        private String senderNick; 

        private Builder() {
            super();
        } 

        private Builder(SendCommentRequest request) {
            super(request);
            this.appId = request.appId;
            this.content = request.content;
            this.extension = request.extension;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.senderId = request.senderId;
            this.senderNick = request.senderNick;
        } 

        /**
         * 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 发送的文本内容。最大的长度不超过256个字节。
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 扩展字段，服务端仅做透传。
         */
        public Builder extension(java.util.Map < String, String > extension) {
            String extensionShrink = shrink(extension, "Extension", "json");
            this.putBodyParameter("Extension", extensionShrink);
            this.extension = extension;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 直播间唯一标识，在调用CreateRoom返回。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 弹幕发送者的用户ID，最大长度不超过32个字节。
         */
        public Builder senderId(String senderId) {
            this.putBodyParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * 弹幕消息发送者的昵称。
         */
        public Builder senderNick(String senderNick) {
            this.putBodyParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        @Override
        public SendCommentRequest build() {
            return new SendCommentRequest(this);
        } 

    } 

}
