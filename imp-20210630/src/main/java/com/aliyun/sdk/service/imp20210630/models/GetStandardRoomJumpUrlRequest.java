// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStandardRoomJumpUrlRequest} extends {@link RequestModel}
 *
 * <p>GetStandardRoomJumpUrlRequest</p>
 */
public class GetStandardRoomJumpUrlRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Body
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("UserNick")
    @Validation(required = true)
    private String userNick;

    private GetStandardRoomJumpUrlRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.platform = builder.platform;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
        this.userNick = builder.userNick;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardRoomJumpUrlRequest create() {
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
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userNick
     */
    public String getUserNick() {
        return this.userNick;
    }

    public static final class Builder extends Request.Builder<GetStandardRoomJumpUrlRequest, Builder> {
        private String appId; 
        private String appKey; 
        private String bizId; 
        private String bizType; 
        private String platform; 
        private String regionId; 
        private String userId; 
        private String userNick; 

        private Builder() {
            super();
        } 

        private Builder(GetStandardRoomJumpUrlRequest request) {
            super(request);
            this.appId = request.appId;
            this.appKey = request.appKey;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.platform = request.platform;
            this.regionId = request.regionId;
            this.userId = request.userId;
            this.userNick = request.userNick;
        } 

        /**
         * ???????????????ID????????????????????????????????????
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ??????????????????,??????????????????????????????
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * ??????ID??????????????????????????????????????????ID?????????ID???
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ???????????????????????????live???????????????class
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ?????????win, mac, android, ios, web
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * cn-shanghai
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ??????UserId,???AppId???????????????
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder userNick(String userNick) {
            this.putBodyParameter("UserNick", userNick);
            this.userNick = userNick;
            return this;
        }

        @Override
        public GetStandardRoomJumpUrlRequest build() {
            return new GetStandardRoomJumpUrlRequest(this);
        } 

    } 

}
