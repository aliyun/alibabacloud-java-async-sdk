// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendCustomMessageToUsersRequest} extends {@link RequestModel}
 *
 * <p>SendCustomMessageToUsersRequest</p>
 */
public class SendCustomMessageToUsersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Body
    @NameInMap("ReceiverList")
    @Validation(required = true)
    private java.util.List < String > receiverList;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    private SendCustomMessageToUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.body = builder.body;
        this.receiverList = builder.receiverList;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendCustomMessageToUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return receiverList
     */
    public java.util.List < String > getReceiverList() {
        return this.receiverList;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    public static final class Builder extends Request.Builder<SendCustomMessageToUsersRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String body; 
        private java.util.List < String > receiverList; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(SendCustomMessageToUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.body = request.body;
            this.receiverList = request.receiverList;
            this.roomId = request.roomId;
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
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 消息体内容。
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * 消息指定的接收人ID列表。
         */
        public Builder receiverList(java.util.List < String > receiverList) {
            this.putBodyParameter("ReceiverList", receiverList);
            this.receiverList = receiverList;
            return this;
        }

        /**
         * 房间唯一标识，由调用CreateRoom返回。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        @Override
        public SendCustomMessageToUsersRequest build() {
            return new SendCustomMessageToUsersRequest(this);
        } 

    } 

}
