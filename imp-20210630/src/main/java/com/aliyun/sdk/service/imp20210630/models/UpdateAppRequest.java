// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("AppStatus")
    private String appStatus;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appStatus = builder.appStatus;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appStatus
     */
    public String getAppStatus() {
        return this.appStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private String appId; 
        private String appName; 
        private String appStatus; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest response) {
            super(response);
            this.appId = response.appId;
            this.appName = response.appName;
            this.appStatus = response.appStatus;
            this.regionId = response.regionId;
        } 

        /**
         * 应用唯一标识
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * 应用状态
         */
        public Builder appStatus(String appStatus) {
            this.putBodyParameter("AppStatus", appStatus);
            this.appStatus = appStatus;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
        } 

    } 

}
