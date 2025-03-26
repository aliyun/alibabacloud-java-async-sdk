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
    @com.aliyun.core.annotation.NameInMap("CloudBoxOfficeSite")
    private Boolean cloudBoxOfficeSite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
    private String desktopAccessType;

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
        this.bandwidth = builder.bandwidth;
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.cidrBlock = builder.cidrBlock;
        this.cloudBoxOfficeSite = builder.cloudBoxOfficeSite;
        this.desktopAccessType = builder.desktopAccessType;
        this.enableAdminAccess = builder.enableAdminAccess;
        this.enableInternetAccess = builder.enableInternetAccess;
        this.needVerifyZeroDevice = builder.needVerifyZeroDevice;
        this.officeSiteName = builder.officeSiteName;
        this.regionId = builder.regionId;
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
        private Integer bandwidth; 
        private String cenId; 
        private Long cenOwnerId; 
        private String cidrBlock; 
        private Boolean cloudBoxOfficeSite; 
        private String desktopAccessType; 
        private Boolean enableAdminAccess; 
        private Boolean enableInternetAccess; 
        private Boolean needVerifyZeroDevice; 
        private String officeSiteName; 
        private String regionId; 
        private java.util.List<String> vSwitchId; 
        private String verifyCode; 
        private String vpcType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimpleOfficeSiteRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.cidrBlock = request.cidrBlock;
            this.cloudBoxOfficeSite = request.cloudBoxOfficeSite;
            this.desktopAccessType = request.desktopAccessType;
            this.enableAdminAccess = request.enableAdminAccess;
            this.enableInternetAccess = request.enableInternetAccess;
            this.needVerifyZeroDevice = request.needVerifyZeroDevice;
            this.officeSiteName = request.officeSiteName;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.verifyCode = request.verifyCode;
            this.vpcType = request.vpcType;
        } 

        /**
         * <p>The maximum public bandwidth. Value range: 10 to 200. Unit: Mbit/s. This parameter is available if you set <code>EnableInternetAccess</code> to <code>true</code>.</p>
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
         * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
         * <blockquote>
         * <p> If you want end users to connect to cloud computers from Alibaba Cloud Workspace clients over VPCs, you can attach the office network to a CEN instance. The CEN instance is the one that connects to your on-premises network over VPN Gateway or Express Connect.</p>
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
         * <p>The ID of the Alibaba Cloud account to which the Cloud Enterprise Network (CEN) instance belongs.</p>
         * <ul>
         * <li>If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.</li>
         * <li>If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.</li>
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
         * <p>The IPv4 CIDR block that you want the office network to use in the virtual private cloud (VPC) of the office network. The system automatically creates a VPC for the office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:</p>
         * <ul>
         * <li><code>10.0.0.0/12</code> (subnet mask range: 12 to 14 bits)</li>
         * <li><code>172.16.0.0/12</code> (subnet mask range: 12 to 24 bits)</li>
         * <li><code>192.168.0.0/16</code> (subnet mask range: 16 to 24 bits)</li>
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
         * <p>Specifies whether to create a CloudBox-based office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
         * <p>The method to connect to cloud computers from Alibaba Cloud Workspace clients.</p>
         * <blockquote>
         * <p> The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to VPC or Any, PrivateLink is automatically activated.````</p>
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
         * <p>Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
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
         * <p>Specifies whether to enable Internet access.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false (default)</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
         * <p>The office network name. The name must be 2 to 255 characters in length. It can contain digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
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

        /**
         * <p>The IDs of the vSwitches that you want to specify in VPCs. This parameter is required only when you create CloudBox-based office networks.</p>
         */
        public Builder vSwitchId(java.util.List<String> vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the <a href="https://help.aliyun.com/document_detail/335132.html">SendVerifyCode</a> operation to obtain the verification code.</p>
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
         * <p>The network type of the office network.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: advanced</li>
         * <li>basic: basic</li>
         * </ul>
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
