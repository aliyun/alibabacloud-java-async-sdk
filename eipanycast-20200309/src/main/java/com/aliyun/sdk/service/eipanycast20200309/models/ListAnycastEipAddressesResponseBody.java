// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link ListAnycastEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnycastEipAddressesResponseBody</p>
 */
public class ListAnycastEipAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnycastList")
    private java.util.List<AnycastList> anycastList;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAnycastEipAddressesResponseBody(Builder builder) {
        this.anycastList = builder.anycastList;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnycastEipAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastList
     */
    public java.util.List<AnycastList> getAnycastList() {
        return this.anycastList;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AnycastList> anycastList; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAnycastEipAddressesResponseBody model) {
            this.anycastList = model.anycastList;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of Anycast EIPs.</p>
         */
        public Builder anycastList(java.util.List<AnycastList> anycastList) {
            this.anycastList = anycastList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If <strong>NextToken</strong> is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnycastEipAddressesResponseBody build() {
            return new ListAnycastEipAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnycastEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnycastEipAddressesResponseBody</p>
     */
    public static class AnycastEipBindInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindInstanceId")
        private String bindInstanceId;

        @com.aliyun.core.annotation.NameInMap("BindInstanceRegionId")
        private String bindInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("BindInstanceType")
        private String bindInstanceType;

        @com.aliyun.core.annotation.NameInMap("BindTime")
        private String bindTime;

        private AnycastEipBindInfoList(Builder builder) {
            this.bindInstanceId = builder.bindInstanceId;
            this.bindInstanceRegionId = builder.bindInstanceRegionId;
            this.bindInstanceType = builder.bindInstanceType;
            this.bindTime = builder.bindTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnycastEipBindInfoList create() {
            return builder().build();
        }

        /**
         * @return bindInstanceId
         */
        public String getBindInstanceId() {
            return this.bindInstanceId;
        }

        /**
         * @return bindInstanceRegionId
         */
        public String getBindInstanceRegionId() {
            return this.bindInstanceRegionId;
        }

        /**
         * @return bindInstanceType
         */
        public String getBindInstanceType() {
            return this.bindInstanceType;
        }

        /**
         * @return bindTime
         */
        public String getBindTime() {
            return this.bindTime;
        }

        public static final class Builder {
            private String bindInstanceId; 
            private String bindInstanceRegionId; 
            private String bindInstanceType; 
            private String bindTime; 

            private Builder() {
            } 

            private Builder(AnycastEipBindInfoList model) {
                this.bindInstanceId = model.bindInstanceId;
                this.bindInstanceRegionId = model.bindInstanceRegionId;
                this.bindInstanceType = model.bindInstanceType;
                this.bindTime = model.bindTime;
            } 

            /**
             * <p>The ID of the cloud resource with which the Anycast EIP is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zebb08phyczzawe****</p>
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the cloud resource is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder bindInstanceRegionId(String bindInstanceRegionId) {
                this.bindInstanceRegionId = bindInstanceRegionId;
                return this;
            }

            /**
             * <p>The type of cloud resource with which the Anycast EIP is associated.</p>
             * <ul>
             * <li><strong>SlbInstance</strong>: an internal-facing Classic Load Balancer (CLB) instance deployed in a virtual private cloud (VPC). CLB is formerly known as Server Load Balancer (SLB).</li>
             * <li><strong>NetworkInterface</strong>: an elastic network interface (ENI).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SlbInstance</p>
             */
            public Builder bindInstanceType(String bindInstanceType) {
                this.bindInstanceType = bindInstanceType;
                return this;
            }

            /**
             * <p>The time when the Anycast EIP was associated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-23T01:37:38Z</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            public AnycastEipBindInfoList build() {
                return new AnycastEipBindInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnycastEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnycastEipAddressesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAnycastEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnycastEipAddressesResponseBody</p>
     */
    public static class AnycastList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AnycastEipBindInfoList")
        private java.util.List<AnycastEipBindInfoList> anycastEipBindInfoList;

        @com.aliyun.core.annotation.NameInMap("AnycastId")
        private String anycastId;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceLocation")
        private String serviceLocation;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private AnycastList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.anycastEipBindInfoList = builder.anycastEipBindInfoList;
            this.anycastId = builder.anycastId;
            this.bandwidth = builder.bandwidth;
            this.businessStatus = builder.businessStatus;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceChargeType = builder.instanceChargeType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceLocation = builder.serviceLocation;
            this.serviceManaged = builder.serviceManaged;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnycastList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return anycastEipBindInfoList
         */
        public java.util.List<AnycastEipBindInfoList> getAnycastEipBindInfoList() {
            return this.anycastEipBindInfoList;
        }

        /**
         * @return anycastId
         */
        public String getAnycastId() {
            return this.anycastId;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceLocation
         */
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        /**
         * @return serviceManaged
         */
        public Integer getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long aliUid; 
            private java.util.List<AnycastEipBindInfoList> anycastEipBindInfoList; 
            private String anycastId; 
            private Integer bandwidth; 
            private String businessStatus; 
            private String createTime; 
            private String description; 
            private String instanceChargeType; 
            private String internetChargeType; 
            private String ipAddress; 
            private String name; 
            private String resourceGroupId; 
            private String serviceLocation; 
            private Integer serviceManaged; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(AnycastList model) {
                this.aliUid = model.aliUid;
                this.anycastEipBindInfoList = model.anycastEipBindInfoList;
                this.anycastId = model.anycastId;
                this.bandwidth = model.bandwidth;
                this.businessStatus = model.businessStatus;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceChargeType = model.instanceChargeType;
                this.internetChargeType = model.internetChargeType;
                this.ipAddress = model.ipAddress;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceLocation = model.serviceLocation;
                this.serviceManaged = model.serviceManaged;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the account to which the Anycast EIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123440159596****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The list of cloud resources with which the Anycast EIPs are associated.</p>
             */
            public Builder anycastEipBindInfoList(java.util.List<AnycastEipBindInfoList> anycastEipBindInfoList) {
                this.anycastEipBindInfoList = anycastEipBindInfoList;
                return this;
            }

            /**
             * <p>The ID of the Anycast EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>aeip-2zeerraiwb7ujsxdc****</p>
             */
            public Builder anycastId(String anycastId) {
                this.anycastId = anycastId;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The service status of the Anycast EIP. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the Anycast EIP was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-22T01:37:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the Anycast EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>docdesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The billing method of the Anycast EIP.</p>
             * <p><strong>PostPaid</strong>: pay-as-you-go</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The metering method of the Anycast EIP.</p>
             * <p><strong>PayByTraffic</strong>: pay-by-data-transfer</p>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The IP address of the Anycast EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>139.95.XX.XX</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The name of the Anycast EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>docname</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzthsmwsnfuni</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The access area of the Anycast EIP.</p>
             * <p><strong>international</strong>: regions outside the Chinese mainland</p>
             * 
             * <strong>example:</strong>
             * <p>international</p>
             */
            public Builder serviceLocation(String serviceLocation) {
                this.serviceLocation = serviceLocation;
                return this;
            }

            /**
             * <p>Indicates whether the resource is created by the service account.</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The status of the Anycast EIP.</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Unassociating</strong></li>
             * <li><strong>Allocated</strong></li>
             * <li><strong>Associated</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Releasing</strong></li>
             * <li><strong>Released</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public AnycastList build() {
                return new AnycastList(this);
            } 

        } 

    }
}
