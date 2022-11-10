// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveRequest</p>
 */
public class CreateLiveRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AnchorId")
    private String anchorId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CodeLevel")
    private Integer codeLevel;

    @Body
    @NameInMap("Introduction")
    private String introduction;

    @Body
    @NameInMap("LiveId")
    private String liveId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private CreateLiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.anchorId = builder.anchorId;
        this.appId = builder.appId;
        this.codeLevel = builder.codeLevel;
        this.introduction = builder.introduction;
        this.liveId = builder.liveId;
        this.roomId = builder.roomId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveRequest create() {
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
     * @return anchorId
     */
    public String getAnchorId() {
        return this.anchorId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return codeLevel
     */
    public Integer getCodeLevel() {
        return this.codeLevel;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
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

    public static final class Builder extends Request.Builder<CreateLiveRequest, Builder> {
        private String regionId; 
        private String anchorId; 
        private String appId; 
        private Integer codeLevel; 
        private String introduction; 
        private String liveId; 
        private String roomId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.anchorId = request.anchorId;
            this.appId = request.appId;
            this.codeLevel = request.codeLevel;
            this.introduction = request.introduction;
            this.liveId = request.liveId;
            this.roomId = request.roomId;
            this.title = request.title;
            this.userId = request.userId;
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
         * 主播ID，支持中英文，最大长度128位，缺省时主播为当前创建直播用户。
         */
        public Builder anchorId(String anchorId) {
            this.putBodyParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
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
         * 直播推流码率，缺省时默认为3。取值：  -1：流畅lld。 1：标清lsd。 2：高清lhd。 3：超清lud。
         */
        public Builder codeLevel(Integer codeLevel) {
            this.putBodyParameter("CodeLevel", codeLevel);
            this.codeLevel = codeLevel;
            return this;
        }

        /**
         * 直播简介，支持中英文，最大长度2048位。
         */
        public Builder introduction(String introduction) {
            this.putBodyParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * 直播资源的唯一标识ID，缺省时系统自动生成36位随机uuid字符串。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        /**
         * 房间ID，最大长度36个字符，传空值，则随机生成一个房间ID。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 直播标题，支持中英文，最大长度256位。
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * 创建直播用户。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateLiveRequest build() {
            return new CreateLiveRequest(this);
        } 

    } 

}
