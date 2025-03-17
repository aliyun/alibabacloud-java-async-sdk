// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyOfficeSiteAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteAttributeRequest</p>
 */
public class ModifyOfficeSiteAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedVerifyLoginRisk")
    private Boolean needVerifyLoginRisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedVerifyZeroDevice")
    private Boolean needVerifyZeroDevice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteName")
    private String officeSiteName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The method to connect to cloud computers from Alibaba Cloud Workspace clients.</p>
         * <blockquote>
         * <p> VPC connection relies on the Alibaba Cloud PrivateLink service. You can use PrivateLink for free. When you set this parameter to <code>VPC</code> or <code>Any</code>, the system automatically activates PrivateLink.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>INTERNET (default): allows end users to connect to cloud computers over the Internet.</li>
         * <li>VPC: allows end users to connect to cloud computers over VPCs.</li>
         * <li>ANY: allows end users to connect to cloud computers over the Internet and VPCs. When end users connect to cloud computers from Elastic Desktop Service, you can choose a connection method based on your business requirements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * <p>Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * <p>Specifies whether to enable two-factor verification when an end user logs on to an Alibaba Cloud Workspace client. This parameter is required only for convenience office networks. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when the end user uses a convenience user to log on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account of the convenience user. Then, the end user can log on to the client only when the verification code is correct.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needVerifyLoginRisk(Boolean needVerifyLoginRisk) {
            this.putQueryParameter("NeedVerifyLoginRisk", needVerifyLoginRisk);
            this.needVerifyLoginRisk = needVerifyLoginRisk;
            return this;
        }

        /**
         * <p>Specifies whether to enable device verification. This parameter is required only for convenience office networks. This parameter is left empty for enterprise Active Directory (AD) office networks.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice);
            this.needVerifyZeroDevice = needVerifyZeroDevice;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-882398****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.<br>This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
