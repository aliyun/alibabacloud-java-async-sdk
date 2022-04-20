// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveRoomRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveRoomRequest</p>
 */
public class UpdateLiveRoomRequest extends Request {
    @Body
    @NameInMap("AnchorId")
    private String anchorId;

    @Body
    @NameInMap("AnchorNick")
    private String anchorNick;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CoverUrl")
    private String coverUrl;

    @Body
    @NameInMap("Extension")
    private java.util.Map < String, String > extension;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Body
    @NameInMap("Notice")
    private String notice;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("UserId")
    private String userId;

    private UpdateLiveRoomRequest(Builder builder) {
        super(builder);
        this.anchorId = builder.anchorId;
        this.anchorNick = builder.anchorNick;
        this.appId = builder.appId;
        this.coverUrl = builder.coverUrl;
        this.extension = builder.extension;
        this.liveId = builder.liveId;
        this.notice = builder.notice;
        this.regionId = builder.regionId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRoomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return anchorNick
     */
    public String getAnchorNick() {
        return this.anchorNick;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return extension
     */
    public java.util.Map < String, String > getExtension() {
        return this.extension;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return notice
     */
    public String getNotice() {
        return this.notice;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveRoomRequest, Builder> {
        private String anchorId; 
        private String anchorNick; 
        private String appId; 
        private String coverUrl; 
        private java.util.Map < String, String > extension; 
        private String liveId; 
        private String notice; 
        private String regionId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveRoomRequest request) {
            super(request);
            this.anchorId = request.anchorId;
            this.anchorNick = request.anchorNick;
            this.appId = request.appId;
            this.coverUrl = request.coverUrl;
            this.extension = request.extension;
            this.liveId = request.liveId;
            this.notice = request.notice;
            this.regionId = request.regionId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * 主播id，仅支持英文和数字，最大长度36位。
         */
        public Builder anchorId(String anchorId) {
            this.putBodyParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
        }

        /**
         * 主播昵称。
         */
        public Builder anchorNick(String anchorNick) {
            this.putBodyParameter("AnchorNick", anchorNick);
            this.anchorNick = anchorNick;
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
         * 封面，支持图片地址链接格式
         */
        public Builder coverUrl(String coverUrl) {
            this.putBodyParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
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
         * 直播ID。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        /**
         * 公告，支持中英文，最大长度256位。
         */
        public Builder notice(String notice) {
            this.putBodyParameter("Notice", notice);
            this.notice = notice;
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
         * 标题，支持中英文，最大长度32位。
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * 操作人ID。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateLiveRoomRequest build() {
            return new UpdateLiveRoomRequest(this);
        } 

    } 

}
