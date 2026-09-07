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
    @com.aliyun.core.annotation.NameInMap("AuthorityHost")
    private String authorityHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private java.util.List<String> vSwitchId;

    private ModifyOfficeSiteAttributeRequest(Builder builder) {
        super(builder);
        this.authorityHost = builder.authorityHost;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.desktopAccessType = builder.desktopAccessType;
        this.domainName = builder.domainName;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.needVerifyLoginRisk = builder.needVerifyLoginRisk;
        this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
        this.officeSiteId = builder.officeSiteId;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.vSwitchId = builder.vSwitchId;
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
     * @return authorityHost
     */
    public String getAuthorityHost() {
        return this.authorityHost;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * @return desktopAccessType
     */
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteAttributeRequest, Builder> {
        private String authorityHost; 
        private String clientId; 
        private String clientSecret; 
        private String desktopAccessType; 
        private String domainName; 
        private Boolean enableAdminAccess; 
        private Boolean needVerifyLoginRisk; 
        private Boolean needVerifyZeroDevice; 
        private String officeSiteId; 
        private String officeSiteName; 
        private String regionId; 
        private String tenantId; 
        private java.util.List<String> vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteAttributeRequest request) {
            super(request);
            this.authorityHost = request.authorityHost;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.desktopAccessType = request.desktopAccessType;
            this.domainName = request.domainName;
            this.enableAdminAccess = request.enableAdminAccess;
            this.needVerifyLoginRisk = request.needVerifyLoginRisk;
            this.needVerifyZeroDevice = request.needVerifyZeroDevice;
            this.officeSiteId = request.officeSiteId;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The Authority URL of the identity authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://login.microsoftonline.com">https://login.microsoftonline.com</a></p>
         */
        public Builder authorityHost(String authorityHost) {
            this.putQueryParameter("AuthorityHost", authorityHost);
            this.authorityHost = authorityHost;
            return this;
        }

        /**
         * <p>The client ID registered with the identity provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>a2c8f7e4-1b3d-4c5e-9f0a-6d7b8c9e****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The client secret registered with the identity provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>sct-9f3e2d1c****</p>
         */
        public Builder clientSecret(String clientSecret) {
            this.putQueryParameter("ClientSecret", clientSecret);
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * <p>The access method allowed when connecting to cloud computers.</p>
         * <blockquote>
         * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. If this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
         * </blockquote>
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
         * <p>The domain name of the enterprise AD.</p>
         * 
         * <strong>example:</strong>
         * <p>domain.local</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to grant local administrator permissions to cloud computer users.</p>
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
         * <p>This parameter applies only to convenience account-based office networks. Specifies whether secondary authentication is required during logon. If logon secondary authentication is enabled, the system checks whether the logon account has security risks when a convenience user logs on to the client. If a risk is detected, the system sends a verification code to the email address associated with the account. The convenience user can log on to the client only after passing the verification code check.</p>
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
         * <p>This parameter applies only to convenience account-based office networks. Specifies whether to enable device verification. For AD-based office networks, this parameter is empty.</p>
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
         * <p>The office network name. The name must be 2 to 255 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), or hyphens (-).<br>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D_Office_Network</p>
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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

        /**
         * <p>The tenant ID of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>72f988bf-86f1-41af-91ab-2d7cd011****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The vSwitch ID. Only one vSwitch is supported.</p>
         */
        public Builder vSwitchId(java.util.List<String> vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public ModifyOfficeSiteAttributeRequest build() {
            return new ModifyOfficeSiteAttributeRequest(this);
        } 

    } 

}
