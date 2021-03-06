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

    @Host
    @NameInMap("RegionId")
    private String regionId;

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
        this.anchorId = builder.anchorId;
        this.appId = builder.appId;
        this.codeLevel = builder.codeLevel;
        this.introduction = builder.introduction;
        this.liveId = builder.liveId;
        this.regionId = builder.regionId;
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
        private String anchorId; 
        private String appId; 
        private Integer codeLevel; 
        private String introduction; 
        private String liveId; 
        private String regionId; 
        private String roomId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveRequest request) {
            super(request);
            this.anchorId = request.anchorId;
            this.appId = request.appId;
            this.codeLevel = request.codeLevel;
            this.introduction = request.introduction;
            this.liveId = request.liveId;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.title = request.title;
            this.userId = request.userId;
        } 

        /**
         * ??????ID?????????????????????????????????128???????????????????????????????????????????????????
         */
        public Builder anchorId(String anchorId) {
            this.putBodyParameter("AnchorId", anchorId);
            this.anchorId = anchorId;
            return this;
        }

        /**
         * ??????????????????????????????????????????????????????????????????6????????????
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ???????????????????????????????????????3????????????  -1?????????lld??? 1?????????lsd??? 2?????????lhd??? 3?????????lud???
         */
        public Builder codeLevel(Integer codeLevel) {
            this.putBodyParameter("CodeLevel", codeLevel);
            this.codeLevel = codeLevel;
            return this;
        }

        /**
         * ?????????????????????????????????????????????2048??????
         */
        public Builder introduction(String introduction) {
            this.putBodyParameter("Introduction", introduction);
            this.introduction = introduction;
            return this;
        }

        /**
         * ???????????????????????????ID??????????????????????????????36?????????uuid????????????
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
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
         * ??????ID???????????????36???????????????????????????????????????????????????ID???
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * ?????????????????????????????????????????????256??????
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * ?????????????????????
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
