// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("ServiceLocation")
    private String serviceLocation;

    @NameInMap("Status")
    private String status;


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
        this.serviceLocation = builder.serviceLocation;
        this.status = builder.status;
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
        private String serviceLocation; 
        private String status; 

        /**
         * <p>AliUid.</p>
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>AnycastEipBindInfoList.</p>
         */
        public Builder anycastEipBindInfoList(java.util.List < AnycastEipBindInfoList> anycastEipBindInfoList) {
            this.anycastEipBindInfoList = anycastEipBindInfoList;
            return this;
        }

        /**
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>Bandwidth.</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>Bid.</p>
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * <p>BusinessStatus.</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>CreateTime.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>InstanceChargeType.</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>InternetChargeType.</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>IpAddress.</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ServiceLocation.</p>
         */
        public Builder serviceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
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
             * <p>PopLocation</p>
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
             * <p>绑定模式 Normal、Default</p>
             */
            public Builder associationMode(String associationMode) {
                this.associationMode = associationMode;
                return this;
            }

            /**
             * <p>BindInstanceId.</p>
             */
            public Builder bindInstanceId(String bindInstanceId) {
                this.bindInstanceId = bindInstanceId;
                return this;
            }

            /**
             * <p>BindInstanceRegionId.</p>
             */
            public Builder bindInstanceRegionId(String bindInstanceRegionId) {
                this.bindInstanceRegionId = bindInstanceRegionId;
                return this;
            }

            /**
             * <p>BindInstanceType.</p>
             */
            public Builder bindInstanceType(String bindInstanceType) {
                this.bindInstanceType = bindInstanceType;
                return this;
            }

            /**
             * <p>BindTime.</p>
             */
            public Builder bindTime(String bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * <p>关联的pop点</p>
             */
            public Builder popLocations(java.util.List < PopLocations> popLocations) {
                this.popLocations = popLocations;
                return this;
            }

            /**
             * <p>ip地址</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>Status.</p>
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
}
