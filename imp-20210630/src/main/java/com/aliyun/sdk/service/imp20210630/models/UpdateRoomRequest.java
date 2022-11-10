// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoomRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoomRequest</p>
 */
public class UpdateRoomRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    @Body
    @NameInMap("Notice")
    private String notice;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("RoomOwnerId")
    private String roomOwnerId;

    @Body
    @NameInMap("Title")
    private String title;

    private UpdateRoomRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.extension = builder.extension;
        this.notice = builder.notice;
        this.roomId = builder.roomId;
        this.roomOwnerId = builder.roomOwnerId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoomRequest create() {
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
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    /**
     * @return notice
     */
    public String getNotice() {
        return this.notice;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomOwnerId
     */
    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateRoomRequest, Builder> {
        private String regionId; 
        private String appId; 
        private java.util.Map < String, String > extension; 
        private String notice; 
        private String roomId; 
        private String roomOwnerId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoomRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.extension = request.extension;
            this.notice = request.notice;
            this.roomId = request.roomId;
            this.roomOwnerId = request.roomOwnerId;
            this.title = request.title;
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
         * 拓展字段，按需传递，需要额外记录的房间属性。
         */
        public Builder extension(java.util.Map < String, String > extension) {
            String extensionShrink = shrink(extension, "Extension", "json");
            this.putBodyParameter("Extension", extensionShrink);
            this.extension = extension;
            return this;
        }

        /**
         * 房间公告，支持中英文，最大长度256位。
         */
        public Builder notice(String notice) {
            this.putBodyParameter("Notice", notice);
            this.notice = notice;
            return this;
        }

        /**
         * 房间唯一标识。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 房主用户id，仅支持英文和数字，最大长度36位。
         */
        public Builder roomOwnerId(String roomOwnerId) {
            this.putBodyParameter("RoomOwnerId", roomOwnerId);
            this.roomOwnerId = roomOwnerId;
            return this;
        }

        /**
         * 房间标题，支持中英文，最大长度32位。
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateRoomRequest build() {
            return new UpdateRoomRequest(this);
        } 

    } 

}
