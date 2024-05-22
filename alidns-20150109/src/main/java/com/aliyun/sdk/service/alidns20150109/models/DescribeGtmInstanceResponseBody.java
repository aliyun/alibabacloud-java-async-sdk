// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceResponseBody</p>
 */
public class DescribeGtmInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessStrategyNum")
    private Integer accessStrategyNum;

    @com.aliyun.core.annotation.NameInMap("AddressPoolNum")
    private Integer addressPoolNum;

    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private String alertGroup;

    @com.aliyun.core.annotation.NameInMap("Cname")
    private String cname;

    @com.aliyun.core.annotation.NameInMap("CnameMode")
    private String cnameMode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
    private Long expireTimestamp;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("LbaStrategy")
    private String lbaStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("UserDomainName")
    private String userDomainName;

    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    private DescribeGtmInstanceResponseBody(Builder builder) {
        this.accessStrategyNum = builder.accessStrategyNum;
        this.addressPoolNum = builder.addressPoolNum;
        this.alertGroup = builder.alertGroup;
        this.cname = builder.cname;
        this.cnameMode = builder.cnameMode;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.expireTime = builder.expireTime;
        this.expireTimestamp = builder.expireTimestamp;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lbaStrategy = builder.lbaStrategy;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ttl = builder.ttl;
        this.userDomainName = builder.userDomainName;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessStrategyNum
     */
    public Integer getAccessStrategyNum() {
        return this.accessStrategyNum;
    }

    /**
     * @return addressPoolNum
     */
    public Integer getAddressPoolNum() {
        return this.addressPoolNum;
    }

    /**
     * @return alertGroup
     */
    public String getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
    }

    /**
     * @return cnameMode
     */
    public String getCnameMode() {
        return this.cnameMode;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimestamp
     */
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lbaStrategy
     */
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return userDomainName
     */
    public String getUserDomainName() {
        return this.userDomainName;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder {
        private Integer accessStrategyNum; 
        private Integer addressPoolNum; 
        private String alertGroup; 
        private String cname; 
        private String cnameMode; 
        private String createTime; 
        private Long createTimestamp; 
        private String expireTime; 
        private Long expireTimestamp; 
        private String instanceId; 
        private String instanceName; 
        private String lbaStrategy; 
        private String requestId; 
        private String resourceGroupId; 
        private Integer ttl; 
        private String userDomainName; 
        private String versionCode; 

        /**
         * The number of access policies of the GTM instance.
         */
        public Builder accessStrategyNum(Integer accessStrategyNum) {
            this.accessStrategyNum = accessStrategyNum;
            return this;
        }

        /**
         * The number of address pools of the GTM instance.
         */
        public Builder addressPoolNum(Integer addressPoolNum) {
            this.addressPoolNum = addressPoolNum;
            return this;
        }

        /**
         * The alert group of the GTM instance.
         */
        public Builder alertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * The domain name of the GTM instance to which the service domain name is mapped by using a CNAME record.
         */
        public Builder cname(String cname) {
            this.cname = cname;
            return this;
        }

        /**
         * Indicates whether the CNAME is a custom domain name or is assigned by the system. Valid values:
         * <p>
         * 
         * *   **SYSTEM_ASSIGN**
         * *   **CUSTOM**
         */
        public Builder cnameMode(String cnameMode) {
            this.cnameMode = cnameMode;
            return this;
        }

        /**
         * The time when the GTM instance was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The timestamp that indicates the time when the GTM instance was created.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * The time when the GTM instance expires.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The timestamp that indicates the time when the GTM instance expires.
         */
        public Builder expireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }

        /**
         * The ID of the GTM instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the GTM instance.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The load balancing policy. Valid values:
         * <p>
         * 
         * *   **ALL_RR**: round robin
         * *   **RATIO**: weighted round-robin
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The global time to live (TTL).
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * The domain name of the application.
         */
        public Builder userDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }

        /**
         * The version code.
         */
        public Builder versionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }

        public DescribeGtmInstanceResponseBody build() {
            return new DescribeGtmInstanceResponseBody(this);
        } 

    } 

}
