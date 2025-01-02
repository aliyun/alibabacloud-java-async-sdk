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
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("IpNumber")
    private Long ipNumber;

    @com.aliyun.core.annotation.NameInMap("LogStatus")
    private Boolean logStatus;

    @com.aliyun.core.annotation.NameInMap("LogStorage")
    private Long logStorage;

    @com.aliyun.core.annotation.NameInMap("MaxOverflow")
    private Long maxOverflow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private Boolean userStatus;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("VpcNumber")
    private Long vpcNumber;

    private DescribeUserBuyVersionResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.expire = builder.expire;
        this.instanceId = builder.instanceId;
        this.instanceStatus = builder.instanceStatus;
        this.ipNumber = builder.ipNumber;
        this.logStatus = builder.logStatus;
        this.logStorage = builder.logStorage;
        this.maxOverflow = builder.maxOverflow;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.userStatus = builder.userStatus;
        this.version = builder.version;
        this.vpcNumber = builder.vpcNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
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
     * @return maxOverflow
     */
    public Long getMaxOverflow() {
        return this.maxOverflow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
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
     * @return vpcNumber
     */
    public Long getVpcNumber() {
        return this.vpcNumber;
    }

    public static final class Builder {
        private Long aliUid; 
        private Long expire; 
        private String instanceId; 
        private String instanceStatus; 
        private Long ipNumber; 
        private Boolean logStatus; 
        private Long logStorage; 
        private Long maxOverflow; 
        private String requestId; 
        private Long startTime; 
        private Boolean userStatus; 
        private Integer version; 
        private Long vpcNumber; 

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase Cloud Firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>119898001566xxxx</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The time when Cloud Firewall expires.</p>
         * <blockquote>
         * <p> The value is a timestamp in milliseconds.</p>
         * </blockquote>
         * <blockquote>
         * <p> If you use Cloud Firewall that uses the pay-as-you-go billing method, ignore this parameter.</p>
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
         * <p>The instance ID of Cloud Firewall.</p>
         * <blockquote>
         * <p> If you use a trial of Cloud Firewall, ignore this parameter.</p>
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
         * <p>The status of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Cloud Firewall is running as expected.</li>
         * <li><strong>init</strong>: Cloud Firewall is being initialized.</li>
         * <li><strong>deleting</strong>: Cloud Firewall is being deleted.</li>
         * <li><strong>abnormal</strong>: An exception occurs in Cloud Firewall.</li>
         * <li><strong>free</strong>: Cloud Firewall is invalid.</li>
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
         * <p>The number of public IP addresses that can be protected.</p>
         * <blockquote>
         * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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
         * <p>Indicates whether log delivery is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The log storage capacity.</p>
         * <blockquote>
         * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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
         * <p>The status of the burstable protected traffic feature. Valid values:</p>
         * <ul>
         * <li><strong>1000000</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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
         * <p>The time when Cloud Firewall was activated.</p>
         * <blockquote>
         * <p> The value is a timestamp in milliseconds.</p>
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
         * <p>Indicates whether Cloud Firewall is valid. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The edition of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Premium Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>4</strong>: Ultimate Edition.</li>
         * <li><strong>10</strong>: Cloud Firewall that uses the pay-as-you-go billing method.</li>
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
         * <p>The number of virtual private clouds (VPCs) that can be protected.</p>
         * <blockquote>
         * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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
