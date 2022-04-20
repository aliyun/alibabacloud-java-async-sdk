// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAuthTokenRequest</p>
 */
public class GetAuthTokenRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetAuthTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenRequest create() {
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
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
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

    public static final class Builder extends Request.Builder<GetAuthTokenRequest, Builder> {
        private String appId; 
        private String appKey; 
        private String deviceId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * 用户的应用ID，在控制台创建应用时生成
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 终端设备类型,通过控制台创建和查询
         */
        public Builder appKey(String appKey) {
            this.putBodyParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * 终端设备ID
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
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
         * 用户UserId,在AppId下单独唯一
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetAuthTokenRequest build() {
            return new GetAuthTokenRequest(this);
        } 

    } 

}
