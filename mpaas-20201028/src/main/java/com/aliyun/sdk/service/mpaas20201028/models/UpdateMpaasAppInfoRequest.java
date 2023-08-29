// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMpaasAppInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateMpaasAppInfoRequest</p>
 */
public class UpdateMpaasAppInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("IconFileUrl")
    private String iconFileUrl;

    @Body
    @NameInMap("Identifier")
    private String identifier;

    @Body
    @NameInMap("OnexFlag")
    private Boolean onexFlag;

    @Body
    @NameInMap("SystemType")
    private String systemType;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    private UpdateMpaasAppInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.iconFileUrl = builder.iconFileUrl;
        this.identifier = builder.identifier;
        this.onexFlag = builder.onexFlag;
        this.systemType = builder.systemType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMpaasAppInfoRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return iconFileUrl
     */
    public String getIconFileUrl() {
        return this.iconFileUrl;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return onexFlag
     */
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    /**
     * @return systemType
     */
    public String getSystemType() {
        return this.systemType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateMpaasAppInfoRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appName; 
        private String iconFileUrl; 
        private String identifier; 
        private Boolean onexFlag; 
        private String systemType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMpaasAppInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appName = request.appName;
            this.iconFileUrl = request.iconFileUrl;
            this.identifier = request.identifier;
            this.onexFlag = request.onexFlag;
            this.systemType = request.systemType;
            this.tenantId = request.tenantId;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * IconFileUrl.
         */
        public Builder iconFileUrl(String iconFileUrl) {
            this.putBodyParameter("IconFileUrl", iconFileUrl);
            this.iconFileUrl = iconFileUrl;
            return this;
        }

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * OnexFlag.
         */
        public Builder onexFlag(Boolean onexFlag) {
            this.putBodyParameter("OnexFlag", onexFlag);
            this.onexFlag = onexFlag;
            return this;
        }

        /**
         * SystemType.
         */
        public Builder systemType(String systemType) {
            this.putBodyParameter("SystemType", systemType);
            this.systemType = systemType;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateMpaasAppInfoRequest build() {
            return new UpdateMpaasAppInfoRequest(this);
        } 

    } 

}
