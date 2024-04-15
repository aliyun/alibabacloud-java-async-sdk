// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimpleOfficeSiteRequest} extends {@link RequestModel}
 *
 * <p>CreateSimpleOfficeSiteRequest</p>
 */
public class CreateSimpleOfficeSiteRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @Query
    @NameInMap("CidrBlock")
    private String cidrBlock;

    @Query
    @NameInMap("CloudBoxOfficeSite")
    private Boolean cloudBoxOfficeSite;

    @Query
    @NameInMap("DesktopAccessType")
    private String desktopAccessType;

    @Query
    @NameInMap("EnableAdminAccess")
    private Boolean enableAdminAccess;

    @Query
    @NameInMap("EnableInternetAccess")
    private Boolean enableInternetAccess;

    @Query
    @NameInMap("NeedVerifyZeroDevice")
    private Boolean needVerifyZeroDevice;

    @Query
    @NameInMap("OfficeSiteName")
    private String officeSiteName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VSwitchId")
    private java.util.List < String > vSwitchId;

    @Query
    @NameInMap("VerifyCode")
    private String verifyCode;

    @Query
    @NameInMap("VpcType")
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
    public java.util.List < String > getVSwitchId() {
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
        private java.util.List < String > vSwitchId; 
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
         * The maximum public bandwidth. Value range: 10 to 200. Unit: Mbit/s. This parameter is available if you set `EnableInternetAccess` to `true`.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The Cloud Enterprise Network (CEN) instance ID.
         * <p>
         * 
         * >  If you want end users to connect to cloud computers from WUYING clients over VPCs, you can attach the office network to a CEN instance. The CEN instance is the one that connects to your on-premises network over VPN Gateway or Express Connect.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the Cloud Enterprise Network (CEN) instance belongs.
         * <p>
         * 
         * - If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.
         * - If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * The IPv4 CIDR block that you want the office network to use in the virtual private cloud (VPC) of the office network. The system automatically creates a VPC for the office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:
         * <p>
         * 
         * *   `10.0.0.0/12` (subnet mask range: 12 to 14 bits)
         * *   `172.16.0.0/12` (subnet mask range: 12 to 24 bits)
         * *   `192.168.0.0/16` (subnet mask range: 16 to 24 bits)
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * Specifies whether to create a CloudBox-based office network.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder cloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
            this.putQueryParameter("CloudBoxOfficeSite", cloudBoxOfficeSite);
            this.cloudBoxOfficeSite = cloudBoxOfficeSite;
            return this;
        }

        /**
         * The method to connect to cloud computers from WUYING clients.
         * <p>
         * 
         * >  The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to VPC or Any, PrivateLink is automatically activated.````
         */
        public Builder desktopAccessType(String desktopAccessType) {
            this.putQueryParameter("DesktopAccessType", desktopAccessType);
            this.desktopAccessType = desktopAccessType;
            return this;
        }

        /**
         * Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.
         * <p>
         * 
         * Valid values:
         * 
         * * true (default)
         * * false
         */
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            this.putQueryParameter("EnableAdminAccess", enableAdminAccess);
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }

        /**
         * Specifies whether to enable Internet access.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false (default)
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            this.putQueryParameter("EnableInternetAccess", enableInternetAccess);
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }

        /**
         * Specifies whether to enable trusted device verification.
         */
        public Builder needVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.putQueryParameter("NeedVerifyZeroDevice", needVerifyZeroDevice);
            this.needVerifyZeroDevice = needVerifyZeroDevice;
            return this;
        }

        /**
         * The office network name. The name must be 2 to 255 characters in length. It can contain digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder officeSiteName(String officeSiteName) {
            this.putQueryParameter("OfficeSiteName", officeSiteName);
            this.officeSiteName = officeSiteName;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the vSwitches that you want to specify in VPCs. This parameter is required only when you create CloudBox-based office networks.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the [SendVerifyCode](~~335132~~) operation to obtain the verification code.
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        /**
         * The network type of the office network.
         * <p>
         * 
         * Valid values:
         * 
         * *   standard: advanced
         * *   basic: basic
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
