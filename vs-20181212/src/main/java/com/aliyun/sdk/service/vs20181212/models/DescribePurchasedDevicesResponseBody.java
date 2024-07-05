// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePurchasedDevicesResponseBody</p>
 */
public class DescribePurchasedDevicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Devices")
    private java.util.List < Devices> devices;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribePurchasedDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.pageCount = builder.pageCount;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePurchasedDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private Long pageCount; 
        private Long pageNum; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePurchasedDevicesResponseBody build() {
            return new DescribePurchasedDevicesResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegisterCode")
        private String registerCode;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private Devices(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.name = builder.name;
            this.orderId = builder.orderId;
            this.region = builder.region;
            this.registerCode = builder.registerCode;
            this.subType = builder.subType;
            this.type = builder.type;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return registerCode
         */
        public String getRegisterCode() {
            return this.registerCode;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String id; 
            private String name; 
            private String orderId; 
            private String region; 
            private String registerCode; 
            private String subType; 
            private String type; 
            private String vendor; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegisterCode.
             */
            public Builder registerCode(String registerCode) {
                this.registerCode = registerCode;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
