// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveFotaUpdateRequest} extends {@link RequestModel}
 *
 * <p>ApproveFotaUpdateRequest</p>
 */
public class ApproveFotaUpdateRequest extends Request {
    @Query
    @NameInMap("AppVersion")
    @Validation(required = true)
    private String appVersion;

    @Query
    @NameInMap("DesktopId")
    @Validation(required = true)
    private String desktopId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ApproveFotaUpdateRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveFotaUpdateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ApproveFotaUpdateRequest, Builder> {
        private String appVersion; 
        private String desktopId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveFotaUpdateRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
        } 

        /**
         * Mirror version.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * The ID of the cloud desktop.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ApproveFotaUpdateRequest build() {
            return new ApproveFotaUpdateRequest(this);
        } 

    } 

}
