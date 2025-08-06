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
 * {@link DescribeAnycastEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastEipAddressResponseBody</p>
 */
public class DescribeAnycastEipAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.NameInMap("AnycastEipBindInfoList")
    private java.util.List<AnycastEipBindInfoList> anycastEipBindInfoList;

    @com.aliyun.core.annotation.NameInMap("AnycastId")
    private String anycastId;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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
        this.serviceManaged = builder.serviceManaged;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastEipAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer serviceManaged; 
        private String status; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(DescribeAnycastEipAddressResponseBody model) {
            this.aliUid = model.aliUid;
            this.anycastEipBindInfoList = model.anycastEipBindInfoList;
            this.anycastId = model.anycastId;
            this.bandwidth = model.bandwidth;
            this.bid = model.bid;
            this.businessStatus = model.businessStatus;
            this.createTime = model.createTime;
            this.description = model.description;
            this.instanceChargeType = model.instanceChargeType;
            this.internetChargeType = model.internetChargeType;
            this.ipAddress = model.ipAddress;
            this.name = model.name;
            this.requestId = model.requestId;
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
         * <p>25346073170691****</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>The information about the endpoint with which the Anycast EIP is associated.</p>
         */
        public Builder anycastEipBindInfoList(java.util.List<AnycastEipBindInfoList> anycastEipBindInfoList) {
            this.anycastEipBindInfoList = anycastEipBindInfoList;
            return this;
        }

        /**
         * <p>The ID of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>aeip-bp1ix34fralt4ykf3****</p>
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
         * <p>The BID of the account to which the Anycast EIP belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * <p>The status of the Anycast EIP. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: running as expected</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
         * <li><strong>RiskExpired</strong>: locked due to security reasons.</li>
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
         * <p>The point in time at which the Anycast EIP was created.</p>
         * <p>The time follows the ISO8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-04-23T01:37:38Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The billing method of the Anycast EIP.</p>
         * <p>Only <strong>PostPaid</strong> may be returned, which indicates the pay-as-you-go billing method.</p>
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
         * <p>Only <strong>PayByTraffic</strong> may be returned, which indicates the pay-by-data-transfer metering method.</p>
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
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzssisocarfy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The access area of the Anycast EIP.</p>
         * <p>Only <strong>international</strong> may be returned, which indicates the areas outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>international</p>
         */
        public Builder serviceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }

        /**
         * <p>Indicates whether the instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Associated</p>
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

        public DescribeAnycastEipAddressResponseBody build() {
            return new DescribeAnycastEipAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAnycastEipAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnycastEipAddressResponseBody</p>
     */
    public static class PopLocations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PopLocation")
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

            private Builder() {
            } 

            private Builder(PopLocations model) {
                this.popLocation = model.popLocation;
            } 

            /**
             * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
             * <p>If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1-pop</p>
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
    /**
     * 
     * {@link DescribeAnycastEipAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnycastEipAddressResponseBody</p>
     */
    public static class AnycastEipBindInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationMode")
        private String associationMode;

        @com.aliyun.core.annotation.NameInMap("BindInstanceId")
        private String bindInstanceId;

        @com.aliyun.core.annotation.NameInMap("BindInstanceRegionId")
        private String bindInstanceRegionId;

        @com.aliyun.core.annotation.NameInMap("BindInstanceType")
        private String bindInstanceType;

        @com.aliyun.core.annotation.NameInMap("BindTime")
        private String bindTime;

        @com.aliyun.core.annotation.NameInMap("PopLocations")
        private java.util.List<PopLocations> popLocations;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<PopLocations> getPopLocations() {
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
            private java.util.List<PopLocations> popLocations; 
            private String privateIpAddress; 
            private String status; 

            private Builder() {
            } 

            private Builder(AnycastEipBindInfoList model) {
                this.associationMode = model.associationMode;
                this.bindInstanceId = model.bindInstanceId;
                this.bindInstanceRegionId = model.bindInstanceRegionId;
                this.bindInstanceType = model.bindInstanceType;
                this.bindTime = model.bindTime;
                this.popLocations = model.popLocations;
                this.privateIpAddress = model.privateIpAddress;
                this.status = model.status;
            } 

            /**
             * <p>The association mode. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong>: the default mode. In this mode, the associated endpoint serves as the default origin server.</li>
             * <li><strong>Normal</strong>: the standard mode. In this mode, the associated endpoint serves as a standard origin server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder associationMode(String associationMode) {
                this.associationMode = associationMode;
                return this;
            }

            /**
             * <p>The ID of the endpoint with which the Anycast EIP is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zebb08phyczzawe****</p>
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region in which the endpoint is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1</p>
             */
            public Builder bindInstanceRegionId(String bindInstanceRegionId) {
                this.bindInstanceRegionId = bindInstanceRegionId;
                return this;
            }

            /**
             * <p>The type of endpoint with which the Anycast EIP is associated. Valid values:</p>
             * <ul>
             * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
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
             * <p>The time follows the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-23T02:37:38Z</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * <p>The information about the access points in associated access areas when you associate an Anycast EIP with a cloud resource.</p>
             * <p>If this is your first time associating an Anycast EIP with an endpoint, the system returns information about access points in all access areas.</p>
             */
            public Builder popLocations(java.util.List<PopLocations> popLocations) {
                this.popLocations = popLocations;
                return this;
            }

            /**
             * <p>The secondary private IP address of the associated ENI.</p>
             * <p>This parameter is valid only when <strong>BindInstanceType</strong> is set to <strong>NetworkInterface</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The status of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>BINDING</strong></li>
             * <li><strong>BINDED</strong></li>
             * <li><strong>UNBINDING</strong></li>
             * <li><strong>DELETED</strong></li>
             * <li><strong>MODIFYING</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BINDING</p>
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
    /**
     * 
     * {@link DescribeAnycastEipAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnycastEipAddressResponseBody</p>
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
             * <p>1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
