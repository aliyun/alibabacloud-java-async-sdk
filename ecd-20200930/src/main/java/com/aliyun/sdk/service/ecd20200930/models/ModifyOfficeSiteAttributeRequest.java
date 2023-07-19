// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteAttributeRequest</p>
 */
public class ModifyOfficeSiteAttributeRequest extends Request {
    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @Query
    @NameInMap("NeedVerifyLoginRisk")
    private Boolean needVerifyLoginRisk;

    @Query
    @NameInMap("NeedVerifyZeroDevice")
    private Boolean needVerifyZeroDevice;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteAttributeRequest(Builder builder) {
        super(builder);
        this.desktopAccessType = builder.desktopAccessType;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
        this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return needVerifyLoginRisk
     */
    public Boolean getNeedVerifyLoginRisk() {
        return this.needVerifyLoginRisk;
    }

    /**
     * @return needVerifyZeroDevice
     */
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return officeSiteName
     */
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteAttributeRequest, Builder> {
        private String desktopAccessType; 
        private Boolean enableAdminAccess; 
        private Boolean needVerifyLoginRisk; 
        private Boolean needVerifyZeroDevice; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteAttributeRequest request) {
            super(request);
            this.desktopAccessType = request.desktopAccessType;
            this.enableAdminAccess = request.enableAdminAccess;
            this.needVerifyLoginRisk = request.needVerifyLoginRisk;
            this.needVerifyZeroDevice = request.needVerifyZeroDevice;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
        } 

        /**
         * The method that you want to use to connect the Alibaba Cloud Workspace client to cloud desktops. Valid values:
         * <p>
         * 
         * *   INTERNET: connects the client to cloud desktops only over the Internet.
         * *   VPC: connects the client to cloud desktops only over a VPC.
         * *   Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method based on your business requirements when you connect to a cloud desktop from the client.
         * 
         * Default value: INTERNET.
         * 
         * > VPC connections are established by using Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to VPC or Any, PrivateLink is automatically activated.
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * 是否为使用云桌面的用户赋予本地管理员权限。
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * This parameter is only applicable to a workspace of the convenience account type, which indicates whether to require two-factor verification when you log on to the client. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the verification code is correctly entered.
         */
        public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
            this.putQueryParameter("NeedVerifyLoginRisk", needVerifyLoginRisk);
            this.needVerifyLoginRisk = needVerifyLoginRisk;
            return this;
        }

        /**
         * This parameter is only applicable to a workspace of the convenience account type, which indicates whether to require device verification when you log on to the client. For a workspace of the enterprise Active Directory (AD) account type, the value of this parameter is empty.
         */
        public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice);
            this.needVerifyZeroDevice = needVerifyZeroDevice;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The name of the workspace. We recommend that you specify a name that is easy to identify. The name must be 2 to 255 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with http:// or https://.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyOfficeSiteAttributeRequest build() {
            return new ModifyOfficeSiteAttributeRequest(this);
        } 

    } 

}
