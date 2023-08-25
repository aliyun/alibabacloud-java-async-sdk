// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnycastEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnycastEipAddressesResponseBody</p>
 */
public class ListAnycastEipAddressesResponseBody extends TeaModel {
    @NameInMap("AnycastList")
    private java.util.List < AnycastList> anycastList;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return anycastList
     */
    public java.util.List < AnycastList> getAnycastList() {
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
        private java.util.List < AnycastList> anycastList; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of Anycast EIPs.
         */
        public Builder anycastList(java.util.List < AnycastList> anycastList) {
            this.anycastList = anycastList;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If **NextToken** is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnycastEipAddressesResponseBody build() {
            return new ListAnycastEipAddressesResponseBody(this);
        } 

    } 

    public static class AnycastEipBindInfoList extends TeaModel {
        @NameInMap("BindInstanceId")
        private String bindInstanceId;

        @NameInMap("BindInstanceRegionId")
        private String bindInstanceRegionId;

        @NameInMap("BindInstanceType")
        private String bindInstanceType;

        @NameInMap("BindTime")
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

            /**
             * The ID of the cloud resource with which the Anycast EIP is associated.
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * The ID of the region where the cloud resource is deployed.
             */
            public Builder bindInstanceRegionId(String bindInstanceRegionId) {
                this.bindInstanceRegionId = bindInstanceRegionId;
                return this;
            }

            /**
             * The type of cloud resource with which the Anycast EIP is associated.
             * <p>
             * 
             * *   **SlbInstance**: an internal-facing Classic Load Balancer (CLB) instance deployed in a virtual private cloud (VPC). CLB is formerly known as Server Load Balancer (SLB).
             * *   **NetworkInterface**: an elastic network interface (ENI).
             */
            public Builder bindInstanceType(String bindInstanceType) {
                this.bindInstanceType = bindInstanceType;
                return this;
            }

            /**
             * The time when the Anycast EIP was associated.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class AnycastList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("AnycastEipBindInfoList")
        private java.util.List < AnycastEipBindInfoList> anycastEipBindInfoList;

        @NameInMap("AnycastId")
        private String anycastId;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServiceLocation")
        private String serviceLocation;

        @NameInMap("ServiceManaged")
        private Integer serviceManaged;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
        public java.util.List < AnycastEipBindInfoList> getAnycastEipBindInfoList() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long aliUid; 
            private java.util.List < AnycastEipBindInfoList> anycastEipBindInfoList; 
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
            private java.util.List < Tags> tags; 

            /**
             * The ID of the account to which the Anycast EIP belongs.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The list of cloud resources with which the Anycast EIPs are associated.
             */
            public Builder anycastEipBindInfoList(java.util.List < AnycastEipBindInfoList> anycastEipBindInfoList) {
                this.anycastEipBindInfoList = anycastEipBindInfoList;
                return this;
            }

            /**
             * The ID of the Anycast EIP.
             */
            public Builder anycastId(String anycastId) {
                this.anycastId = anycastId;
                return this;
            }

            /**
             * The maximum bandwidth of the Anycast EIP. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The service status of the Anycast EIP. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **FinancialLocked**
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the Anycast EIP was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the Anycast EIP.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The billing method of the Anycast EIP.
             * <p>
             * 
             * **PostPaid**: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The metering method of the Anycast EIP.
             * <p>
             * 
             * **PayByTraffic**: pay-by-data-transfer
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The IP address of the Anycast EIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The name of the Anycast EIP.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The access area of the Anycast EIP.
             * <p>
             * 
             * **international**: regions outside the Chinese mainland
             */
            public Builder serviceLocation(String serviceLocation) {
                this.serviceLocation = serviceLocation;
                return this;
            }

            /**
             * Indicates whether the resource is created by the service account.
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder serviceManaged(Integer serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The status of the Anycast EIP.
             * <p>
             * 
             * *   **Associating**
             * *   **Unassociating**
             * *   **Allocated**
             * *   **Associated**
             * *   **Modifying**
             * *   **Releasing**
             * *   **Released**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The information about the tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public AnycastList build() {
                return new AnycastList(this);
            } 

        } 

    }
}
