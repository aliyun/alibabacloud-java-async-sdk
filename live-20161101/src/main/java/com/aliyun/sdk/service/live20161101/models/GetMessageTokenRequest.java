// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageTokenRequest} extends {@link RequestModel}
 *
 * <p>GetMessageTokenRequest</p>
 */
public class GetMessageTokenRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Body
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetMessageTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deviceId = builder.deviceId;
        this.deviceType = builder.deviceType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageTokenRequest create() {
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
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetMessageTokenRequest, Builder> {
        private String appId; 
        private String deviceId; 
        private String deviceType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.deviceId = request.deviceId;
            this.deviceType = request.deviceType;
            this.userId = request.userId;
        } 

        /**
         * 应用ID
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
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
         * 终端设备类型
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
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
        public GetMessageTokenRequest build() {
            return new GetMessageTokenRequest(this);
        } 

    } 

}
