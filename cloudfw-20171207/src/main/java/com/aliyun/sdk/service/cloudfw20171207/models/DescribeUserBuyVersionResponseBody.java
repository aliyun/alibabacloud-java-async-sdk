// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeUserBuyVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserBuyVersionResponseBody</p>
 */
public class DescribeUserBuyVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckClusterConnectorQuota")
    private Long ackClusterConnectorQuota;

    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("DefaultBandwidth")
    private Long defaultBandwidth;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("ExtensionBandwidth")
    private Long extensionBandwidth;

    @com.aliyun.core.annotation.NameInMap("GeneralInstance")
    private Long generalInstance;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("InternetBandwidth")
    private Long internetBandwidth;

    @com.aliyun.core.annotation.NameInMap("IpNumber")
    private Long ipNumber;

    @com.aliyun.core.annotation.NameInMap("LogStatus")
    private Boolean logStatus;

    @com.aliyun.core.annotation.NameInMap("LogStorage")
    private Long logStorage;

    @com.aliyun.core.annotation.NameInMap("MajorVersion")
    private Long majorVersion;

    @com.aliyun.core.annotation.NameInMap("MaxOverflow")
    private Long maxOverflow;

    @com.aliyun.core.annotation.NameInMap("NatBandwidth")
    private Long natBandwidth;

    @com.aliyun.core.annotation.NameInMap("PrivateDnsConnectorQuota")
    private Long privateDnsConnectorQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sdl")
    private Long sdl;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("TemporaryBandwidth")
    private Long temporaryBandwidth;

    @com.aliyun.core.annotation.NameInMap("ThreatIntelligence")
    private Long threatIntelligence;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private Boolean userStatus;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("VpcBandwidth")
    private Long vpcBandwidth;

    @com.aliyun.core.annotation.NameInMap("VpcNumber")
    private Long vpcNumber;

    private DescribeUserBuyVersionResponseBody(Builder builder) {
        this.ackClusterConnectorQuota = builder.ackClusterConnectorQuota;
        this.aliUid = builder.aliUid;
        this.defaultBandwidth = builder.defaultBandwidth;
        this.expire = builder.expire;
        this.extensionBandwidth = builder.extensionBandwidth;
        this.generalInstance = builder.generalInstance;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.internetBandwidth = builder.internetBandwidth;
        this.ipNumber = builder.ipNumber;
        this.logStatus = builder.logStatus;
        this.logStorage = builder.logStorage;
        this.majorVersion = builder.majorVersion;
        this.maxOverflow = builder.maxOverflow;
        this.natBandwidth = builder.natBandwidth;
        this.privateDnsConnectorQuota = builder.privateDnsConnectorQuota;
        this.requestId = builder.requestId;
        this.sdl = builder.sdl;
        this.startTime = builder.startTime;
        this.temporaryBandwidth = builder.temporaryBandwidth;
        this.threatIntelligence = builder.threatIntelligence;
        this.userStatus = builder.userStatus;
        this.version = builder.version;
        this.vpcBandwidth = builder.vpcBandwidth;
        this.vpcNumber = builder.vpcNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackClusterConnectorQuota
     */
    public Long getAckClusterConnectorQuota() {
        return this.ackClusterConnectorQuota;
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return defaultBandwidth
     */
    public Long getDefaultBandwidth() {
        return this.defaultBandwidth;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return extensionBandwidth
     */
    public Long getExtensionBandwidth() {
        return this.extensionBandwidth;
    }

    /**
     * @return generalInstance
     */
    public Long getGeneralInstance() {
        return this.generalInstance;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return internetBandwidth
     */
    public Long getInternetBandwidth() {
        return this.internetBandwidth;
    }

    /**
     * @return ipNumber
     */
    public Long getIpNumber() {
        return this.ipNumber;
    }

    /**
     * @return logStatus
     */
    public Boolean getLogStatus() {
        return this.logStatus;
    }

    /**
     * @return logStorage
     */
    public Long getLogStorage() {
        return this.logStorage;
    }

    /**
     * @return majorVersion
     */
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return maxOverflow
     */
    public Long getMaxOverflow() {
        return this.maxOverflow;
    }

    /**
     * @return natBandwidth
     */
    public Long getNatBandwidth() {
        return this.natBandwidth;
    }

    /**
     * @return privateDnsConnectorQuota
     */
    public Long getPrivateDnsConnectorQuota() {
        return this.privateDnsConnectorQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdl
     */
    public Long getSdl() {
        return this.sdl;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return temporaryBandwidth
     */
    public Long getTemporaryBandwidth() {
        return this.temporaryBandwidth;
    }

    /**
     * @return threatIntelligence
     */
    public Long getThreatIntelligence() {
        return this.threatIntelligence;
    }

    /**
     * @return userStatus
     */
    public Boolean getUserStatus() {
        return this.userStatus;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return vpcBandwidth
     */
    public Long getVpcBandwidth() {
        return this.vpcBandwidth;
    }

    /**
     * @return vpcNumber
     */
    public Long getVpcNumber() {
        return this.vpcNumber;
    }

    public static final class Builder {
        private Long ackClusterConnectorQuota; 
        private Long aliUid; 
        private Long defaultBandwidth; 
        private Long expire; 
        private Long extensionBandwidth; 
        private Long generalInstance; 
        private String instanceId; 
        private String instanceStatus; 
        private Long internetBandwidth; 
        private Long ipNumber; 
        private Boolean logStatus; 
        private Long logStorage; 
        private Long majorVersion; 
        private Long maxOverflow; 
        private Long natBandwidth; 
        private Long privateDnsConnectorQuota; 
        private String requestId; 
        private Long sdl; 
        private Long startTime; 
        private Long temporaryBandwidth; 
        private Long threatIntelligence; 
        private Boolean userStatus; 
        private Integer version; 
        private Long vpcBandwidth; 
        private Long vpcNumber; 

        private Builder() {
        } 

        private Builder(DescribeUserBuyVersionResponseBody model) {
            this.ackClusterConnectorQuota = model.ackClusterConnectorQuota;
            this.aliUid = model.aliUid;
            this.defaultBandwidth = model.defaultBandwidth;
            this.expire = model.expire;
            this.extensionBandwidth = model.extensionBandwidth;
            this.generalInstance = model.generalInstance;
            this.instanceId = model.instanceId;
            this.instanceStatus = model.instanceStatus;
            this.internetBandwidth = model.internetBandwidth;
            this.ipNumber = model.ipNumber;
            this.logStatus = model.logStatus;
            this.logStorage = model.logStorage;
            this.majorVersion = model.majorVersion;
            this.maxOverflow = model.maxOverflow;
            this.natBandwidth = model.natBandwidth;
            this.privateDnsConnectorQuota = model.privateDnsConnectorQuota;
            this.requestId = model.requestId;
            this.sdl = model.sdl;
            this.startTime = model.startTime;
            this.temporaryBandwidth = model.temporaryBandwidth;
            this.threatIntelligence = model.threatIntelligence;
            this.userStatus = model.userStatus;
            this.version = model.version;
            this.vpcBandwidth = model.vpcBandwidth;
            this.vpcNumber = model.vpcNumber;
        } 

        /**
         * <p>The ACK cluster connector quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder ackClusterConnectorQuota(Long ackClusterConnectorQuota) {
            this.ackClusterConnectorQuota = ackClusterConnectorQuota;
            return this;
        }

        /**
         * <p>The AliUid of the Cloud Firewall account.</p>
         * 
         * <strong>example:</strong>
         * <p>119898001566xxxx</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The default bandwidth of the edition.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder defaultBandwidth(Long defaultBandwidth) {
            this.defaultBandwidth = defaultBandwidth;
            return this;
        }

        /**
         * <p>The expiration time of the Cloud Firewall instance.</p>
         * <blockquote>
         * <p>The value is a millisecond-level UNIX timestamp.</p>
         * </blockquote>
         * <blockquote>
         * <p>This field is meaningless when you use the pay-as-you-go edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1726934400000</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The extended bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder extensionBandwidth(Long extensionBandwidth) {
            this.extensionBandwidth = extensionBandwidth;
            return this;
        }

        /**
         * <p>The general-purpose instance quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder generalInstance(Long generalInstance) {
            this.generalInstance = generalInstance;
            return this;
        }

        /**
         * <p>The ID of the purchased Cloud Firewall instance.</p>
         * <blockquote>
         * <p>This field is meaningless when you use the trial version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vipcloudfw-cn-xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The provisioning status of the Cloud Firewall instance. Valid values:</p>
         * <ul>
         * <li><p><strong>normal</strong>: The instance is running normally.</p>
         * </li>
         * <li><p><strong>init</strong>: The instance is being initialized.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The instance is being deleted. </p>
         * </li>
         * <li><p><strong>abnormal</strong>: The instance is abnormal.</p>
         * </li>
         * <li><p><strong>free</strong>: No valid instance exists.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The purchased traffic processing capacity of the Internet firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder internetBandwidth(Long internetBandwidth) {
            this.internetBandwidth = internetBandwidth;
            return this;
        }

        /**
         * <p>The purchased quota for the Internet border protection.</p>
         * <blockquote>
         * <p>This field takes effect only for subscription users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder ipNumber(Long ipNumber) {
            this.ipNumber = ipNumber;
            return this;
        }

        /**
         * <p>The enabling status of log delivery. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder logStatus(Boolean logStatus) {
            this.logStatus = logStatus;
            return this;
        }

        /**
         * <p>The purchased log storage capacity.</p>
         * <blockquote>
         * <p>This field takes effect only for subscription users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder logStorage(Long logStorage) {
            this.logStorage = logStorage;
            return this;
        }

        /**
         * <p>The major version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder majorVersion(Long majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * <p>Indicates whether burstable elastic billing is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1000000</strong>: Enabled.</li>
         * <li><strong>0</strong>: Disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This field takes effect only for subscription users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxOverflow(Long maxOverflow) {
            this.maxOverflow = maxOverflow;
            return this;
        }

        /**
         * <p>The purchased traffic processing capacity of NAT firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder natBandwidth(Long natBandwidth) {
            this.natBandwidth = natBandwidth;
            return this;
        }

        /**
         * <p>The private DNS connector quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder privateDnsConnectorQuota(Long privateDnsConnectorQuota) {
            this.privateDnsConnectorQuota = privateDnsConnectorQuota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F71B03EE-xxxxx-91D79CC6AA1A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The enabling status of sensitive data leak detection. In the Resource field, true indicates enabled and false indicates disabled. In the API response, 1 indicates enabled and 0 indicates disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sdl(Long sdl) {
            this.sdl = sdl;
            return this;
        }

        /**
         * <p>The activation time of the Cloud Firewall instance.</p>
         * <blockquote>
         * <p>The value is a millisecond-level UNIX timestamp.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1692504764000</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The temporary upgrade bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder temporaryBandwidth(Long temporaryBandwidth) {
            this.temporaryBandwidth = temporaryBandwidth;
            return this;
        }

        /**
         * <p>The enabling status of threat intelligence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder threatIntelligence(Long threatIntelligence) {
            this.threatIntelligence = threatIntelligence;
            return this;
        }

        /**
         * <p>The status of the Cloud Firewall instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Valid.</li>
         * <li><strong>false</strong>: Invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder userStatus(Boolean userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        /**
         * <p>The version of the Cloud Firewall instance. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Premium Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>4</strong>: Ultimate Edition</li>
         * <li><strong>10</strong>: Pay-as-you-go Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The purchased traffic processing capacity of VPC firewalls.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        public Builder vpcBandwidth(Long vpcBandwidth) {
            this.vpcBandwidth = vpcBandwidth;
            return this;
        }

        /**
         * <p>The purchased quota for VPC firewalls.</p>
         * <blockquote>
         * <p>This field takes effect only for subscription users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder vpcNumber(Long vpcNumber) {
            this.vpcNumber = vpcNumber;
            return this;
        }

        public DescribeUserBuyVersionResponseBody build() {
            return new DescribeUserBuyVersionResponseBody(this);
        } 

    } 

}
