// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeGtmInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstancesResponseBody</p>
 */
public class DescribeGtmInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GtmInstances")
    private GtmInstances gtmInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeGtmInstancesResponseBody(Builder builder) {
        this.gtmInstances = builder.gtmInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gtmInstances
     */
    public GtmInstances getGtmInstances() {
        return this.gtmInstances;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private GtmInstances gtmInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeGtmInstancesResponseBody model) {
            this.gtmInstances = model.gtmInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The list of queried instances.</p>
         */
        public Builder gtmInstances(GtmInstances gtmInstances) {
            this.gtmInstances = gtmInstances;
            return this;
        }

        /**
         * <p>The returned page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>193B0163-7F93-42DF-AB05-ACEEB7D22707</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmInstancesResponseBody build() {
            return new DescribeGtmInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstancesResponseBody</p>
     */
    public static class GtmInstance extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("UserDomainName")
        private String userDomainName;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private GtmInstance(Builder builder) {
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
            this.resourceGroupId = builder.resourceGroupId;
            this.ttl = builder.ttl;
            this.userDomainName = builder.userDomainName;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GtmInstance create() {
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
            private String resourceGroupId; 
            private Integer ttl; 
            private String userDomainName; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(GtmInstance model) {
                this.accessStrategyNum = model.accessStrategyNum;
                this.addressPoolNum = model.addressPoolNum;
                this.alertGroup = model.alertGroup;
                this.cname = model.cname;
                this.cnameMode = model.cnameMode;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.expireTime = model.expireTime;
                this.expireTimestamp = model.expireTimestamp;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.lbaStrategy = model.lbaStrategy;
                this.resourceGroupId = model.resourceGroupId;
                this.ttl = model.ttl;
                this.userDomainName = model.userDomainName;
                this.versionCode = model.versionCode;
            } 

            /**
             * <p>The number of access policies.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder accessStrategyNum(Integer accessStrategyNum) {
                this.accessStrategyNum = accessStrategyNum;
                return this;
            }

            /**
             * <p>The number of address pools.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder addressPoolNum(Integer addressPoolNum) {
                this.addressPoolNum = addressPoolNum;
                return this;
            }

            /**
             * <p>The name of the alert group.</p>
             * 
             * <strong>example:</strong>
             * <p>[\&quot;R&amp;D group\&quot;]</p>
             */
            public Builder alertGroup(String alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            /**
             * <p>The CNAME domain name that is used to access the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance1.14.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The CNAME domain name used to access the instance. Valid values:</p>
             * <ul>
             * <li><strong>SYSTEM_ASSIGN</strong>: A CNAME domain name assigned by the system is used.</li>
             * <li><strong>CUSTOM</strong>: A custom CNAME domain name is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_ASSIGN</p>
             */
            public Builder cnameMode(String cnameMode) {
                this.cnameMode = cnameMode;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-06-06T11:34Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1528284856000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-06-06T11:34Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1528284856000</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The load balancing policy that is used. Valid values:</p>
             * <ul>
             * <li><strong>ALL_RR</strong>: Load balancing</li>
             * <li><strong>RATIO</strong>: Weighted round-robin</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RATIO</p>
             */
            public Builder lbaStrategy(String lbaStrategy) {
                this.lbaStrategy = lbaStrategy;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2q2jqpjh***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The global time to live (TTL).</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The domain name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder userDomainName(String userDomainName) {
                this.userDomainName = userDomainName;
                return this;
            }

            /**
             * <p>The version code of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>biaozhun</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public GtmInstance build() {
                return new GtmInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstancesResponseBody</p>
     */
    public static class GtmInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GtmInstance")
        private java.util.List<GtmInstance> gtmInstance;

        private GtmInstances(Builder builder) {
            this.gtmInstance = builder.gtmInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GtmInstances create() {
            return builder().build();
        }

        /**
         * @return gtmInstance
         */
        public java.util.List<GtmInstance> getGtmInstance() {
            return this.gtmInstance;
        }

        public static final class Builder {
            private java.util.List<GtmInstance> gtmInstance; 

            private Builder() {
            } 

            private Builder(GtmInstances model) {
                this.gtmInstance = model.gtmInstance;
            } 

            /**
             * GtmInstance.
             */
            public Builder gtmInstance(java.util.List<GtmInstance> gtmInstance) {
                this.gtmInstance = gtmInstance;
                return this;
            }

            public GtmInstances build() {
                return new GtmInstances(this);
            } 

        } 

    }
}
