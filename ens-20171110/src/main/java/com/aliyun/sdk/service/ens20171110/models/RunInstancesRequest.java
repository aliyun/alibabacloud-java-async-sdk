// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RunInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunInstancesRequest</p>
 */
public class RunInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoInstallCloudAssistant")
    private Boolean autoInstallCloudAssistant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private String autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Carrier")
    private String carrier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssistantRegion")
    private String cloudAssistantRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
    private String deploymentSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeStrategy")
    private String instanceChargeStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    private Long internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressCount")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Long ipv6AddressCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
    private Integer launchTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetDistrictCode")
    private String netDistrictCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetWorkId")
    private String netWorkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpIdentification")
    private Boolean publicIpIdentification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleAreaLevel")
    private String scheduleAreaLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulingPriceStrategy")
    private String schedulingPriceStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchedulingStrategy")
    private String schedulingStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityId")
    private String securityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotDuration")
    private Integer spotDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpdVSwitchIds")
    private java.util.List<String> vpdVSwitchIds;

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoInstallCloudAssistant = builder.autoInstallCloudAssistant;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.billingCycle = builder.billingCycle;
        this.carrier = builder.carrier;
        this.cloudAssistantRegion = builder.cloudAssistantRegion;
        this.dataDisk = builder.dataDisk;
        this.deletionProtection = builder.deletionProtection;
        this.deploymentSetId = builder.deploymentSetId;
        this.ensRegionId = builder.ensRegionId;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.instanceChargeStrategy = builder.instanceChargeStrategy;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.ipType = builder.ipType;
        this.ipv6AddressCount = builder.ipv6AddressCount;
        this.keyPairName = builder.keyPairName;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateName = builder.launchTemplateName;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.netDistrictCode = builder.netDistrictCode;
        this.netWorkId = builder.netWorkId;
        this.password = builder.password;
        this.passwordInherit = builder.passwordInherit;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.privateIpAddress = builder.privateIpAddress;
        this.publicIpIdentification = builder.publicIpIdentification;
        this.scheduleAreaLevel = builder.scheduleAreaLevel;
        this.schedulingPriceStrategy = builder.schedulingPriceStrategy;
        this.schedulingStrategy = builder.schedulingStrategy;
        this.securityId = builder.securityId;
        this.spotDuration = builder.spotDuration;
        this.spotStrategy = builder.spotStrategy;
        this.systemDisk = builder.systemDisk;
        this.tag = builder.tag;
        this.uniqueSuffix = builder.uniqueSuffix;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
        this.vpdId = builder.vpdId;
        this.vpdVSwitchIds = builder.vpdVSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return autoInstallCloudAssistant
     */
    public Boolean getAutoInstallCloudAssistant() {
        return this.autoInstallCloudAssistant;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return cloudAssistantRegion
     */
    public String getCloudAssistantRegion() {
        return this.cloudAssistantRegion;
    }

    /**
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return deploymentSetId
     */
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceChargeStrategy
     */
    public String getInstanceChargeStrategy() {
        return this.instanceChargeStrategy;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return ipv6AddressCount
     */
    public Long getIpv6AddressCount() {
        return this.ipv6AddressCount;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return launchTemplateVersion
     */
    public Integer getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return netDistrictCode
     */
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    /**
     * @return netWorkId
     */
    public String getNetWorkId() {
        return this.netWorkId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return publicIpIdentification
     */
    public Boolean getPublicIpIdentification() {
        return this.publicIpIdentification;
    }

    /**
     * @return scheduleAreaLevel
     */
    public String getScheduleAreaLevel() {
        return this.scheduleAreaLevel;
    }

    /**
     * @return schedulingPriceStrategy
     */
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    /**
     * @return schedulingStrategy
     */
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * @return securityId
     */
    public String getSecurityId() {
        return this.securityId;
    }

    /**
     * @return spotDuration
     */
    public Integer getSpotDuration() {
        return this.spotDuration;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return uniqueSuffix
     */
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return vpdVSwitchIds
     */
    public java.util.List<String> getVpdVSwitchIds() {
        return this.vpdVSwitchIds;
    }

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private Long amount; 
        private Boolean autoInstallCloudAssistant; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private String autoUseCoupon; 
        private String billingCycle; 
        private String carrier; 
        private String cloudAssistantRegion; 
        private java.util.List<DataDisk> dataDisk; 
        private Boolean deletionProtection; 
        private String deploymentSetId; 
        private String ensRegionId; 
        private String hostName; 
        private String imageId; 
        private String instanceChargeStrategy; 
        private String instanceChargeType; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private Long internetMaxBandwidthOut; 
        private String ipType; 
        private Long ipv6AddressCount; 
        private String keyPairName; 
        private String launchTemplateId; 
        private String launchTemplateName; 
        private Integer launchTemplateVersion; 
        private String netDistrictCode; 
        private String netWorkId; 
        private String password; 
        private Boolean passwordInherit; 
        private Long period; 
        private String periodUnit; 
        private String privateIpAddress; 
        private Boolean publicIpIdentification; 
        private String scheduleAreaLevel; 
        private String schedulingPriceStrategy; 
        private String schedulingStrategy; 
        private String securityId; 
        private Integer spotDuration; 
        private String spotStrategy; 
        private SystemDisk systemDisk; 
        private java.util.List<Tag> tag; 
        private Boolean uniqueSuffix; 
        private String userData; 
        private String vSwitchId; 
        private String vpdId; 
        private java.util.List<String> vpdVSwitchIds; 

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoInstallCloudAssistant = request.autoInstallCloudAssistant;
            this.autoReleaseTime = request.autoReleaseTime;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.billingCycle = request.billingCycle;
            this.carrier = request.carrier;
            this.cloudAssistantRegion = request.cloudAssistantRegion;
            this.dataDisk = request.dataDisk;
            this.deletionProtection = request.deletionProtection;
            this.deploymentSetId = request.deploymentSetId;
            this.ensRegionId = request.ensRegionId;
            this.hostName = request.hostName;
            this.imageId = request.imageId;
            this.instanceChargeStrategy = request.instanceChargeStrategy;
            this.instanceChargeType = request.instanceChargeType;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.internetMaxBandwidthOut = request.internetMaxBandwidthOut;
            this.ipType = request.ipType;
            this.ipv6AddressCount = request.ipv6AddressCount;
            this.keyPairName = request.keyPairName;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateName = request.launchTemplateName;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.netDistrictCode = request.netDistrictCode;
            this.netWorkId = request.netWorkId;
            this.password = request.password;
            this.passwordInherit = request.passwordInherit;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.privateIpAddress = request.privateIpAddress;
            this.publicIpIdentification = request.publicIpIdentification;
            this.scheduleAreaLevel = request.scheduleAreaLevel;
            this.schedulingPriceStrategy = request.schedulingPriceStrategy;
            this.schedulingStrategy = request.schedulingStrategy;
            this.securityId = request.securityId;
            this.spotDuration = request.spotDuration;
            this.spotStrategy = request.spotStrategy;
            this.systemDisk = request.systemDisk;
            this.tag = request.tag;
            this.uniqueSuffix = request.uniqueSuffix;
            this.userData = request.userData;
            this.vSwitchId = request.vSwitchId;
            this.vpdId = request.vpdId;
            this.vpdVSwitchIds = request.vpdVSwitchIds;
        } 

        /**
         * <p>The number of instances to create. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to automatically install the Cloud Assistant client on the instance.</p>
         */
        public Builder autoInstallCloudAssistant(Boolean autoInstallCloudAssistant) {
            this.putQueryParameter("AutoInstallCloudAssistant", autoInstallCloudAssistant);
            this.autoInstallCloudAssistant = autoInstallCloudAssistant;
            return this;
        }

        /**
         * <p>The automatic release time of the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * <ul>
         * <li><p>If the value of seconds (<code>ss</code>) is not <code>00</code>, the time is automatically set to the start of the current minute (<code>mm</code>).</p>
         * </li>
         * <li><p>The earliest release time is one hour after the current time.</p>
         * </li>
         * </ul>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-28T14:38:52Z</p>
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables auto-renewal.</li>
         * <li><strong>false</strong>: does not enable auto-renewal. (Default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is invalid for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to use coupons. Default value: true (AutoUseCoupon=true).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(String autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The billing cycle for instance compute resources. Only instance-level pay-as-you-go is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>Day</strong>: daily billing.</p>
         * </li>
         * <li><p><strong>Month</strong>: monthly billing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The carrier.</p>
         * <blockquote>
         * <p>This parameter is required for region-level scheduling.</br>
         * For node-level scheduling, if a node has multiple carriers and you do not specify a carrier, instances are created for each carrier on the node. For example, if a node has both China Mobile and China Unicom carriers, instances with two ISPs are created.</br>You can call <a href="https://help.aliyun.com/document_detail/2637461.html">DescribeRegionIsps</a> to query the carrier information of a node.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * <p>The region for Cloud Assistant access. Valid values: cn-zhangjiakou (Zhangjiakou) and ap-southeast-1 (Singapore).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        public Builder cloudAssistantRegion(String cloudAssistantRegion) {
            this.putQueryParameter("CloudAssistantRegion", cloudAssistantRegion);
            this.cloudAssistantRegion = cloudAssistantRegion;
            return this;
        }

        /**
         * <p>The data cloud disk specifications.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            String dataDiskShrink = shrink(dataDisk, "DataDisk", "json");
            this.putQueryParameter("DataDisk", dataDiskShrink);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling an API operation. Valid values: </p>
         * <ul>
         * <li>true: Enables instance release protection.</li>
         * <li>false: Disables instance release protection.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This property applies only to pay-as-you-go instances and can only restrict manual release operations. It does not take effect on system-initiated release operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-5s1p6x2l3r4b****</p>
         */
        public Builder deploymentSetId(String deploymentSetId) {
            this.putQueryParameter("DeploymentSetId", deploymentSetId);
            this.deploymentSetId = deploymentSetId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p>This parameter is required for node-level scheduling and is invalid for region-level scheduling.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-foshan-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>test-HostName</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The image ID. This parameter cannot be specified for ARM-based instances. This parameter is required for other instance types.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5si16wo6simkt267p8b7h****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance billing strategy. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: instance-level billing.</li>
         * <li>If not specified, the default is user-level billing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder instanceChargeStrategy(String instanceChargeStrategy) {
            this.putQueryParameter("InstanceChargeStrategy", instanceChargeStrategy);
            this.instanceChargeStrategy = instanceChargeStrategy;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The instance name. The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), or hyphens (-).</p>
         * <p>Default value: the InstanceId of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.sn1.small</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Billable methods for bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthByDay</strong>: daily peak bandwidth</li>
         * <li><strong>95BandwidthByMonth</strong>: monthly 95th percentile bandwidth</li>
         * </ul>
         * <blockquote>
         * <p>You can select a billing method only for the first purchase. Subsequent purchases use the billing method selected during the first purchase by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BandwidthByDay</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The maximum public bandwidth. If the value of this parameter is greater than 0, a public IP address is automatically assigned to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * <p>The IP type. Valid values:</p>
         * <ul>
         * <li><p><strong>ipv4</strong> (default): IPv4.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6.</p>
         * </li>
         * <li><p><strong>ipv4Andipv6</strong>: IPv4 and IPv6 (single stack).</p>
         * </li>
         * <li><p><strong>ipv4Withipv6</strong>: IPv4 and IPv6 (dual-stack).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * <p>The number of randomly generated IPv6 addresses to assign to the primary ENI of the private network.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ipv6AddressCount(Long ipv6AddressCount) {
            this.putQueryParameter("Ipv6AddressCount", ipv6AddressCount);
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        /**
         * <p>The key pair name.</p>
         * <blockquote>
         * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wx2-jumpserver</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The ID of the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-test</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The name of the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-test</p>
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * <p>The version of the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder launchTemplateVersion(Integer launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * <p>The region code.</p>
         * <blockquote>
         * <p>This parameter is required for region-level scheduling and is invalid for node-level scheduling.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>350000</p>
         */
        public Builder netDistrictCode(String netDistrictCode) {
            this.putQueryParameter("NetDistrictCode", netDistrictCode);
            this.netDistrictCode = netDistrictCode;
            return this;
        }

        /**
         * <p>The network ID.</p>
         * <blockquote>
         * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling. If you do not specify vSwitch information, only the validity of the network ID is verified. The actual resource creation does not use this network ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>net-id</p>
         */
        public Builder netWorkId(String netWorkId) {
            this.putQueryParameter("NetWorkId", netWorkId);
            this.netWorkId = netWorkId;
            return this;
        }

        /**
         * <p>The instance password.</p>
         * <blockquote>
         * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to use the preset password of the image. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses the preset password.</li>
         * <li><strong>false</strong>: does not use the preset password.</li>
         * </ul>
         * <blockquote>
         * <p>Specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * <p>The duration of the purchased resource.</p>
         * <ul>
         * <li><p>If <strong>PeriodUnit</strong> is set to <strong>Day</strong>, <strong>Period</strong> can only be set to <strong>3</strong>.</p>
         * </li>
         * <li><p>If <strong>PeriodUnit</strong> is set to <strong>Month</strong>, <strong>Period</strong> can be set to <strong>1-9</strong> or <strong>12</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the purchase duration. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong> (default): monthly purchase.</li>
         * <li><strong>Day</strong>: daily purchase.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The private IP address.</p>
         * <blockquote>
         * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling.
         * If a private IP address is specified, the number of instances can only be 1. The private IP address takes effect only when both the private IP address and vSwitch ID are specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>Specifies whether to enable public IP identification. Valid values:</p>
         * <ul>
         * <li><p>true: enables public IP identification.</p>
         * </li>
         * <li><p>false: does not enable public IP identification.</p>
         * </li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicIpIdentification(Boolean publicIpIdentification) {
            this.putQueryParameter("PublicIpIdentification", publicIpIdentification);
            this.publicIpIdentification = publicIpIdentification;
            return this;
        }

        /**
         * <p>The scheduling level. Use this parameter to specify node-level or region-level scheduling. Valid values:</p>
         * <ul>
         * <li><strong>Big</strong>: major area</li>
         * <li><strong>Middle</strong>: province</li>
         * <li><strong>Small</strong>: city</li>
         * <li><strong>Region</strong>: node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        public Builder scheduleAreaLevel(String scheduleAreaLevel) {
            this.putQueryParameter("ScheduleAreaLevel", scheduleAreaLevel);
            this.scheduleAreaLevel = scheduleAreaLevel;
            return this;
        }

        /**
         * <p>The scheduling price strategy. Valid values:</p>
         * <ul>
         * <li><strong>PriceHighPriority</strong>: high price first</li>
         * <li><strong>PriceLowPriority</strong>: low price first</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PriceHighPriority</p>
         */
        public Builder schedulingPriceStrategy(String schedulingPriceStrategy) {
            this.putQueryParameter("SchedulingPriceStrategy", schedulingPriceStrategy);
            this.schedulingPriceStrategy = schedulingPriceStrategy;
            return this;
        }

        /**
         * <p>The scheduling strategy. Valid values:</p>
         * <ul>
         * <li><strong>Concentrate</strong>: concentrated</li>
         * <li><strong>Disperse</strong>: dispersed</li>
         * </ul>
         * <blockquote>
         * <p>For node-level scheduling, the value is <strong>Concentrate</strong>. For region-level scheduling, select a value based on your requirements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Concentrate</p>
         */
        public Builder schedulingStrategy(String schedulingStrategy) {
            this.putQueryParameter("SchedulingStrategy", schedulingStrategy);
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-test</p>
         */
        public Builder securityId(String securityId) {
            this.putQueryParameter("SecurityId", securityId);
            this.securityId = securityId;
            return this;
        }

        /**
         * <p>The protection period of the spot instance.</p>
         * <p>Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The bidding policy for the pay-as-you-go instance. This parameter takes effect when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
         * <ul>
         * <li>NoSpot: a regular pay-as-you-go instance.</li>
         * <li>SpotAsPriceGo: the system automatically bids at the current market price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotAsPriceGo</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The system cloud disk specifications.</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            String systemDiskShrink = shrink(systemDisk, "SystemDisk", "json");
            this.putQueryParameter("SystemDisk", systemDiskShrink);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>The tags that are bound to the instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to add sequential suffixes to <strong>HostName</strong> and <strong>InstanceName</strong>. The sequential suffixes start from 001 and cannot exceed 999.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * <p>The custom user data. Maximum size: 16 KB. You can pass in <strong>UserData</strong> information. <strong>UserData</strong> is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWtest</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p>This parameter can only be used for node-level scheduling. An error is returned if this parameter is specified for region-level scheduling.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-5sagnw7m613oulalkd10n****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPD network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-5s7xxxxxxx</p>
         */
        public Builder vpdId(String vpdId) {
            this.putQueryParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The list of VPD vSwitch IDs.</p>
         */
        public Builder vpdVSwitchIds(java.util.List<String> vpdVSwitchIds) {
            String vpdVSwitchIdsShrink = shrink(vpdVSwitchIds, "VpdVSwitchIds", "json");
            this.putQueryParameter("VpdVSwitchIds", vpdVSwitchIdsShrink);
            this.vpdVSwitchIds = vpdVSwitchIds;
            return this;
        }

        @Override
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("KMSKeyId")
        private String KMSKeyId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.encrypted = builder.encrypted;
            this.KMSKeyId = builder.KMSKeyId;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean encrypted; 
            private String KMSKeyId; 
            private Long size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.encrypted = model.encrypted;
                this.KMSKeyId = model.KMSKeyId;
                this.size = model.size;
            } 

            /**
             * <p>The disk category. Valid values:</p>
             * <ul>
             * <li><strong>cloud_efficiency</strong>: ultra cloud disk</li>
             * <li><strong>cloud_ssd</strong>: all-flash cloud disk</li>
             * <li><strong>local_hdd</strong>: local HDD</li>
             * <li><strong>local_ssd</strong>: local SSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Specifies whether to encrypt the cloud disk. Valid values:</p>
             * <ul>
             * <li><p>true: encrypts the cloud disk.</p>
             * </li>
             * <li><p>false (default): does not encrypt the cloud disk.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The ID of the KMS key used by the cloud disk. Valid values:</p>
             * <ul>
             * <li><p>true: encrypts the cloud disk.</p>
             * </li>
             * <li><p>false (default): does not encrypt the cloud disk.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If Encrypted is set to true and KMSKeyId is empty, the default service key is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Long size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.size = model.size;
            } 

            /**
             * <p>The type of the system cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunInstancesRequest} extends {@link TeaModel}
     *
     * <p>RunInstancesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The custom tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
