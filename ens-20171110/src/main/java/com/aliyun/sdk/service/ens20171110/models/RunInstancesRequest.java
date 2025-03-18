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
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Long amount;

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
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long internetMaxBandwidthOut;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

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
    @com.aliyun.core.annotation.Validation(required = true)
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

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.billingCycle = builder.billingCycle;
        this.carrier = builder.carrier;
        this.dataDisk = builder.dataDisk;
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
        this.keyPairName = builder.keyPairName;
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
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
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
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
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

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private Long amount; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private String autoUseCoupon; 
        private String billingCycle; 
        private String carrier; 
        private java.util.List<DataDisk> dataDisk; 
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
        private String keyPairName; 
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

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoReleaseTime = request.autoReleaseTime;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.billingCycle = request.billingCycle;
            this.carrier = request.carrier;
            this.dataDisk = request.dataDisk;
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
            this.keyPairName = request.keyPairName;
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
        } 

        /**
         * <p>The number of instances that you want to create. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
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
         * <p>The time when to automatically release the pay-as-you-go instance. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
         * <ul>
         * <li>If the value of <code>ss</code> is not <code>00</code>, the start time is automatically rounded down to the nearest minute based on the value of <code>mm</code>.</li>
         * <li>The specified time must be at least one hour later than the current time.</li>
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
         * <p>Specifies whether to enable auto-renewal for the premium bandwidth plan. Examples:</p>
         * <ul>
         * <li><strong>true</strong>.</li>
         * <li><strong>false</strong> (default).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is not available when InstanceChargeType is set to PostPaid.</p>
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
         * <p>Specifies whether to use coupons. Default value: true.</p>
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
         * <p>The billing cycle of computing resources of the instance. Only pay-as-you-go instances are supported. Valid values:</p>
         * <ul>
         * <li><strong>Day</strong>.</li>
         * <li><strong>Month</strong>.</li>
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
         * <p>The Internet service provider (ISP).</p>
         * <blockquote>
         * <p> This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
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
         * <p>The specifications of data disks.</p>
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            String dataDiskShrink = shrink(dataDisk, "DataDisk", "json");
            this.putQueryParameter("DataDisk", dataDiskShrink);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * <p>The ID of the node.</p>
         * <blockquote>
         * <p> This parameter is required if ScheduleAreaLevel is set to Region and is not available if ScheduleAreaLevel is set to other values.</p>
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
         * <p>The name of the host.</p>
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
         * <p>The ID of the image. For ARM PCB-based server instances, leave this parameter empty. For other instances, this parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-5si16wo6simkt267p8b7hcmy3</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The billing policy of the instance. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: Bills are generated based on instances.</li>
         * <li>If you do not specify this parameter, bills are generated based on users.</li>
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
         * <p>The billing method of the instance. Examples:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * <p>The default value of this parameter is the value of the InstanceId parameter.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The bandwidth billing method. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthByDay</strong>: pay by daily peak bandwidth</li>
         * <li><strong>95BandwidthByMonth</strong>: pay by monthly 95th percentile bandwidth</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you purchase an ENS instance for the first time. The value that you specified is used as the default value for subsequent purchases.</p>
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
         * <p>The maximum public bandwidth. If the value of this parameter is greater than 0, a public IP address is assigned to the instance.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong> (default).</li>
         * <li><strong>ipv6</strong>.</li>
         * <li><strong>ipv4Andipv6</strong> (single stack).</li>
         * <li><strong>ipv4Withipv6</strong> (dual stack).</li>
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
         * <p>The name of the key pair.</p>
         * <blockquote>
         * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
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
         * <p>The code of the region.</p>
         * <blockquote>
         * <p> This parameter is not available if ScheduleAreaLevel is set to Region and is required if ScheduleAreaLevel is set to other values.</p>
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
         * <p>The ID of the network.</p>
         * <blockquote>
         * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
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
         * <p>The password that is used to connect to the instance.</p>
         * <blockquote>
         * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> You need to specify at least one of <strong>Password</strong>, <strong>KeyPairName</strong>, and <strong>PasswordInherit</strong>.</p>
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
         * <p>The unit of the subscription period.</p>
         * <ul>
         * <li>If <strong>PeriodUnit</strong> is set to <strong>Day</strong>, <strong>Period</strong> can only be set to <strong>3</strong>.</li>
         * <li>If <strong>PeriodUnit</strong> is <strong>Month</strong>, <strong>Period</strong> can be set to <strong>1 to 9</strong> or <strong>12</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1-9,12</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription period. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong> (default).</li>
         * <li><strong>Day</strong>.</li>
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
         * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs. If you specify a private IP address, the number of instances must be 1. The private IP address takes effect only when the private IP address and the vSwitch ID are not empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.120</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>Specifies whether to enable public IP address identification. Valid values: true and false. Default value: false.</p>
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
         * <p>The scheduling level. This parameter specifies area-level scheduling or node-level scheduling. Valid values:</p>
         * <ul>
         * <li><strong>Big</strong>: greater area</li>
         * <li><strong>Middle</strong>: province</li>
         * <li><strong>Small</strong>: city</li>
         * <li><strong>Region</strong>: node</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The scheduling price policy. Examples:</p>
         * <ul>
         * <li><strong>PriceHighPriority</strong>: The high price prevails.</li>
         * <li><strong>PriceLowPriority</strong>: The low price prevails.</li>
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
         * <p>The scheduling policy of the taint. Valid values:</p>
         * <ul>
         * <li><strong>Concentrate</strong></li>
         * <li><strong>Disperse</strong></li>
         * </ul>
         * <blockquote>
         * <p> If ScheduleAreaLevel is set to Region, set this parameter to <strong>Concentrate</strong>. If ScheduleAreaLevel is set to other values, set this parameter to Concentrate or Disperse based on your business requirements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>concentrate</p>
         */
        public Builder schedulingStrategy(String schedulingStrategy) {
            this.putQueryParameter("SchedulingStrategy", schedulingStrategy);
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * <p>The ID of security group.</p>
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
         * <p>The protection period of the preemptible instance. Unit: hours. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: After a preemptible instance is created, Alibaba Cloud ensures that the instance is not automatically released within 1 hour. After the 1-hour protection period ends, the system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * <li>0: After a preemptible instance is created, Alibaba Cloud does not ensure that the instance runs for 1 hour. The system compares the bid price with the market price and checks the resource inventory to determine whether to retain or release the instance.</li>
         * </ul>
         * <p>Alibaba Cloud sends an ECS system event to notify you 5 minutes before the instance is released. Preemptible instances are billed by second. We recommend that you specify an appropriate protection period based on your business requirements.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder spotDuration(Integer spotDuration) {
            this.putQueryParameter("SpotDuration", spotDuration);
            this.spotDuration = spotDuration;
            return this;
        }

        /**
         * <p>The bidding policy for the pay-as-you-go instance. This parameter is valid only when the <code>InstanceChargeType</code> parameter is set to <code>PostPaid</code>. Valid values:</p>
         * <ul>
         * <li>NoSpot: The elastic container instances are pay-as-you-go instances.</li>
         * <li>SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is automatically used as the bidding price.</li>
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
         * <p>The specification of the system disk.</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            String systemDiskShrink = shrink(systemDisk, "SystemDisk", "json");
            this.putQueryParameter("SystemDisk", systemDiskShrink);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether to append sequential suffixes to the hostname specified by the <strong>HostName</strong> parameter and to the instance name specified by the <strong>InstanceName</strong> parameter. The sequential suffixes range from 001 to 999.</p>
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
         * <p>The custom data. The maximum data size is 16 KB. You can specify <strong>UserData</strong>. <strong>UserData</strong> must be Base64-encoded.</p>
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
         * <p>The ID of the vSwitch.</p>
         * <blockquote>
         * <p> This parameter is available only if ScheduleAreaLevel is set to Region and cannot be configured if ScheduleAreaLevel is set to other values. Otherwise, an error occurs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-5sagnw7m613oulalkd10nv0ob</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
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
             * <p>The category of the disk. Examples:</p>
             * <ul>
             * <li><strong>cloud_efficiency</strong>: ultra disk.</li>
             * <li><strong>cloud_ssd</strong>: all-flash disk.</li>
             * <li><strong>local_hdd</strong>: local HDD.</li>
             * <li><strong>local_ssd</strong>: local SSD.</li>
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
             * <p>Specifies whether to encrypt the disk. Valid values:</p>
             * <ul>
             * <li>true.</li>
             * <li>false (default).</li>
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
             * <p>The ID of the Key Management Service (KMS) key that is used for the disk. Valid values:</p>
             * <ul>
             * <li>true.</li>
             * <li>false (default).</li>
             * </ul>
             * <blockquote>
             * <p> If you set the Encrypted parameter to true, the default service key is used when the KMSKeyId parameter is empty.</p>
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
             * <p>The size of a data disk. Unit: GiB.</p>
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
             * <p>The category of the system disk.</p>
             * 
             * <strong>example:</strong>
             * <p>local_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
