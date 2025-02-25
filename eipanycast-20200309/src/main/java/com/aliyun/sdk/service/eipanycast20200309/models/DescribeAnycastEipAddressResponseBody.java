// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastEipAddressResponseBody</p>
 */
public class DescribeAnycastEipAddressResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private Long aliUid;

    @NameInMap("AnycastEipBindInfoList")
    private java.util.List < AnycastEipBindInfoList> anycastEipBindInfoList;

    @NameInMap("AnycastId")
    private String anycastId;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("Bid")
    private String bid;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServiceLocation")
    private String serviceLocation;

    @NameInMap("Status")
    private String status;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private DescribeAnycastEipAddressResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.anycastEipBindInfoList = builder.anycastEipBindInfoList;
        this.anycastId = builder.anycastId;
        this.bandwidth = builder.bandwidth;
        this.bid = builder.bid;
        this.businessStatus = builder.businessStatus;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.ipAddress = builder.ipAddress;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceLocation = builder.serviceLocation;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastEipAddressResponseBody create() {
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
     * @return bid
     */
    public String getBid() {
        return this.bid;
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
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
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
        private String bid; 
        private String businessStatus; 
        private String createTime; 
        private String description; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String ipAddress; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private String serviceLocation; 
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
         * The information about the endpoint with which the Anycast EIP is associated.
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
         * The BID of the account to which the Anycast EIP belongs.
         */
        public Builder bid(String bid) {
            this.bid = bid;
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
         * The point in time at which the Anycast EIP was created.
         * <p>
         * 
         * The time follows the ISO8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
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
         * Only **PostPaid** may be returned, which indicates the pay-as-you-go billing method.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The metering method of the Anycast EIP.
         * <p>
         * 
         * Only **PayByTraffic** may be returned, which indicates the pay-by-data-transfer metering method.
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The access area of the Anycast EIP.
         * <p>
         * 
         * Only **international** may be returned, which indicates the areas outside the Chinese mainland.
         */
        public Builder serviceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
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

        public DescribeAnycastEipAddressResponseBody build() {
            return new DescribeAnycastEipAddressResponseBody(this);
        } 

    } 

    public static class PopLocations extends TeaModel {
        @NameInMap("PopLocation")
        private String popLocation;

        private PopLocations(Builder builder) {
            this.popLocation = builder.popLocation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PopLocations create() {
            return builder().build();
        }

        /**
         * @return popLocation
         */
        public String getPopLocation() {
            return this.popLocation;
        }

        public static final class Builder {
            private String popLocation; 

            /**
             * The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.
             * <p>
             * 
             * If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.
             */
            public Builder popLocation(String popLocation) {
                this.popLocation = popLocation;
                return this;
            }

            public PopLocations build() {
                return new PopLocations(this);
            } 

        } 

    }
    public static class AnycastEipBindInfoList extends TeaModel {
        @NameInMap("AssociationMode")
        private String associationMode;

        @NameInMap("BindInstanceId")
        private String bindInstanceId;

        @NameInMap("BindInstanceRegionId")
        private String bindInstanceRegionId;

        @NameInMap("BindInstanceType")
        private String bindInstanceType;

        @NameInMap("BindTime")
        private String bindTime;

        @NameInMap("PopLocations")
        private java.util.List < PopLocations> popLocations;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("Status")
        private String status;

        private AnycastEipBindInfoList(Builder builder) {
            this.associationMode = builder.associationMode;
            this.bindInstanceId = builder.bindInstanceId;
            this.bindInstanceRegionId = builder.bindInstanceRegionId;
            this.bindInstanceType = builder.bindInstanceType;
            this.bindTime = builder.bindTime;
            this.popLocations = builder.popLocations;
            this.privateIpAddress = builder.privateIpAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnycastEipBindInfoList create() {
            return builder().build();
        }

        /**
         * @return associationMode
         */
        public String getAssociationMode() {
            return this.associationMode;
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

        /**
         * @return popLocations
         */
        public java.util.List < PopLocations> getPopLocations() {
            return this.popLocations;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String associationMode; 
            private String bindInstanceId; 
            private String bindInstanceRegionId; 
            private String bindInstanceType; 
            private String bindTime; 
            private java.util.List < PopLocations> popLocations; 
            private String privateIpAddress; 
            private String status; 

            /**
             * The association mode. Valid values:
             * <p>
             * 
             * *   **Default**: the default mode. In this mode, the associated endpoint serves as the default origin server.
             * *   **Normal**: the standard mode. In this mode, the associated endpoint serves as a standard origin server.
             */
            public Builder associationMode(String associationMode) {
                this.associationMode = associationMode;
                return this;
            }

            /**
             * The ID of the endpoint with which the Anycast EIP is associated.
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * The ID of the region in which the endpoint is deployed.
             */
            public Builder bindInstanceRegionId(String bindInstanceRegionId) {
                this.bindInstanceRegionId = bindInstanceRegionId;
                return this;
            }

            /**
             * The type of endpoint with which the Anycast EIP is associated. Valid values:
             * <p>
             * 
             * *   **SlbInstance**: a CLB instance in a VPC.
             * *   **NetworkInterface**: an elastic network interface (ENI).
             */
            public Builder bindInstanceType(String bindInstanceType) {
                this.bindInstanceType = bindInstanceType;
                return this;
            }

            /**
             * The time when the Anycast EIP was associated.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.
             * <p>
             * 
             * If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.
             */
            public Builder popLocations(java.util.List < PopLocations> popLocations) {
                this.popLocations = popLocations;
                return this;
            }

            /**
             * The secondary private IP address of the associated ENI.
             * <p>
             * 
             * This parameter is valid only when **BindInstanceType** is set to **NetworkInterface**.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The status of the endpoint. Valid values:
             * <p>
             * 
             * *   **BINDING**
             * *   **BINDED**
             * *   **UNBINDING**
             * *   **DELETED**
             * *   **MODIFYING**
             */
            public Builder status(String status) {
                this.status = status;
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
}
