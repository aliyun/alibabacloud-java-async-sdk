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
 * {@link CreateSimpleOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>CreateSimpleOfficeSiteRequest</p>
 */
public class CreateSimpleOfficeSiteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessAttribute")
    private String accessAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorityHost")
    private String authorityHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientSecret")
    private String clientSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudBoxOfficeSite")
    private Boolean cloudBoxOfficeSite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Eid")
    private String eid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedVerifyZeroDevice")
    private Boolean needVerifyZeroDevice;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcType")
    private String vpcType;

    private CreateSimpleOfficeSiteRequest(Builder builder) {
        super(builder);
        this.accessAttribute = builder.accessAttribute;
        this.accountType = builder.accountType;
        this.authorityHost = builder.authorityHost;
        this.bandwidth = builder.bandwidth;
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.cidrBlock = builder.cidrBlock;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
        this.desktopAccessType = builder.desktopAccessType;
        this.domainName = builder.domainName;
        this.eid = builder.eid;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.vSwitchId = builder.vSwitchId;
        this.verifyCode = builder.verifyCode;
        this.vpcType = builder.vpcType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimpleOfficeSiteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessAttribute
     */
    public String getAccessAttribute() {
        return this.accessAttribute;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return authorityHost
     */
    public String getAuthorityHost() {
        return this.authorityHost;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenOwnerId
     */
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
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
     * @return cloudBoxOfficeSite
     */
    public Boolean getCloudBoxOfficeSite() {
        return this.cloudBoxOfficeSite;
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
     * @return eid
     */
    public String getEid() {
        return this.eid;
    }

    /**
     * @return enableAdminAccess
     */
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    /**
     * @return enableInternetAccess
     */
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    /**
     * @return needVerifyZeroDevice
     */
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
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

    /**
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    /**
     * @return vpcType
     */
    public String getVpcType() {
        return this.vpcType;
    }

    public static final class Builder extends Request.Builder<CreateSimpleOfficeSiteRequest, Builder> {
        private String accessAttribute; 
        private String accountType; 
        private String authorityHost; 
        private Integer bandwidth; 
        private String cenId; 
        private Long cenOwnerId; 
        private String cidrBlock; 
        private String clientId; 
        private String clientSecret; 
        private Boolean cloudBoxOfficeSite; 
        private String desktopAccessType; 
        private String domainName; 
        private String eid; 
        private Boolean enableAdminAccess; 
        private Boolean enableInternetAccess; 
        private Boolean needVerifyZeroDevice; 
        private String officeSiteName; 
        private String regionId; 
        private String tenantId; 
        private java.util.List<String> vSwitchId; 
        private String verifyCode; 
        private String vpcType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimpleOfficeSiteRequest request) {
            super(request);
            this.accessAttribute = request.accessAttribute;
            this.accountType = request.accountType;
            this.authorityHost = request.authorityHost;
            this.bandwidth = request.bandwidth;
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.cidrBlock = request.cidrBlock;
            this.clientId = request.clientId;
            this.clientSecret = request.clientSecret;
            this.cloudBoxOfficeSite = request.cloudBoxOfficeSite;
            this.desktopAccessType = request.desktopAccessType;
            this.domainName = request.domainName;
            this.eid = request.eid;
            this.enableAdminAccess = request.enableAdminAccess;
            this.enableInternetAccess = request.enableInternetAccess;
            this.needVerifyZeroDevice = request.needVerifyZeroDevice;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.vSwitchId = request.vSwitchId;
            this.verifyCode = request.verifyCode;
            this.vpcType = request.vpcType;
        } 

        /**
         * <p>The access attribute of the office network (workspace).</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder accessAttribute(String accessAttribute) {
            this.putQueryParameter("AccessAttribute", accessAttribute);
            this.accessAttribute = accessAttribute;
            return this;
        }

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The authority URL of the identity authentication service.</p>
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
         * <p>The peak Internet bandwidth. Valid values: 10 to 200. Unit: Mbit/s.
         * You can specify this parameter when <code>EnableInternetAccess</code> is set to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The instance ID of the Cloud Enterprise Network (CEN) instance.</p>
         * <blockquote>
         * <p>To connect to cloud desktops over a VPC connection, add the office network to a CEN instance. The CEN instance is the one that the on-premises network connects to by using a VPN or Express Connect circuit.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cen-3gwy16dojz1m65****</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID to which the CEN instance belongs.</p>
         * <ul>
         * <li>If CenId is not specified or the specified CEN instance belongs to the current Alibaba Cloud account, you do not need to specify this parameter.</li>
         * <li>If the specified CEN instance belongs to another Alibaba Cloud account, specify the Alibaba Cloud account ID of that account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>118272523431****</p>
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * <p>The IPv4 CIDR block of the VPC for the office network. This parameter is required for advanced office networks. The system uses automatic creation of a VPC based on the specified IPv4 CIDR block. Use one of the following CIDR blocks or their subnets:</p>
         * <ul>
         * <li><code>10.0.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
         * <li><code>172.16.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
         * <li><code>192.168.0.0/16</code> (valid mask range: 16 to 24 bits)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
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
         * <p>Specifies whether the office network is a CloudBox office network.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
            this.putQueryParameter("CloudBoxOfficeSite", cloudBoxOfficeSite);
            this.cloudBoxOfficeSite = cloudBoxOfficeSite;
            return this;
        }

        /**
         * <p>The access method allowed when connecting to cloud desktops.</p>
         * <blockquote>
         * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. If this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
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
         * <p>The enterprise ID (EID).</p>
         * 
         * <strong>example:</strong>
         * <p>e-1234abcd****</p>
         */
        public Builder eid(String eid) {
            this.putQueryParameter("Eid", eid);
            this.eid = eid;
            return this;
        }

        /**
         * <p>Specifies whether to grant local administrator permissions to users who use cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * <p>Specifies whether to enable public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * <p>Specifies whether to enable trusted device verification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice);
            this.needVerifyZeroDevice = needVerifyZeroDevice;
            return this;
        }

        /**
         * <p>The name of the office network. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOfficeSite_Simple</p>
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
         * <p>The ID of the vSwitch in the VPC. This parameter is required when you create a CloudBox office network.</p>
         */
        public Builder vSwitchId(java.util.List<String> vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The verification code. If the specified CEN instance belongs to another Alibaba Cloud account, call <a href="https://help.aliyun.com/document_detail/335132.html">SendVerifyCode</a> to obtain the verification code first.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        /**
         * <p>The type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder vpcType(String vpcType) {
            this.putQueryParameter("VpcType", vpcType);
            this.vpcType = vpcType;
            return this;
        }

        @Override
        public CreateSimpleOfficeSiteRequest build() {
            return new CreateSimpleOfficeSiteRequest(this);
        } 

    } 

}
