// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBandwidthackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBandwidthackagesResponseBody</p>
 */
public class ListBandwidthackagesResponseBody extends TeaModel {
    @NameInMap("BandwidthPackages")
    private java.util.List < BandwidthPackages> bandwidthPackages;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBandwidthackagesResponseBody(Builder builder) {
        this.bandwidthPackages = builder.bandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBandwidthackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthPackages
     */
    public java.util.List < BandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < BandwidthPackages> bandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the bandwidth plans.
         */
        public Builder bandwidthPackages(java.util.List < BandwidthPackages> bandwidthPackages) {
            this.bandwidthPackages = bandwidthPackages;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBandwidthackagesResponseBody build() {
            return new ListBandwidthackagesResponseBody(this);
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
             * The tag key of the bandwidth plan.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the bandwidth plan.
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
    public static class BandwidthPackages extends TeaModel {
        @NameInMap("Accelerators")
        private java.util.List < String > accelerators;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("State")
        private String state;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private BandwidthPackages(Builder builder) {
            this.accelerators = builder.accelerators;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.state = builder.state;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return accelerators
         */
        public java.util.List < String > getAccelerators() {
            return this.accelerators;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < String > accelerators; 
            private Integer bandwidth; 
            private String bandwidthPackageId; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private String expiredTime; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String state; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the GA instance that is associated with the bandwidth plan.
             */
            public Builder accelerators(java.util.List < String > accelerators) {
                this.accelerators = accelerators;
                return this;
            }

            /**
             * The bandwidth value of the bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The ID of the bandwidth plan.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * The billing method of the bandwidth plan. Only **PREPAY** is returned, which indicates the subscription billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The timestamp when the bandwidth plan was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the bandwidth plan.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The timestamp when the bandwidth plan expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The name of the GA instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * The state of the bandwidth plan. Valid values:
             * <p>
             * 
             * *   **init**: The bandwidth plan is being initialized.
             * *   **active**: The bandwidth plan is available.
             * *   **binded**: The bandwidth plan is associated with a GA instance.
             * *   **binding**: The bandwidth plan is being associated.
             * *   **unbinding**: The bandwidth plan is being disassociated.
             * *   **updating**: The bandwidth plan is being updated.
             * *   **finacialLocked**: The bandwidth plan is locked due to overdue payments.
             * *   **Locked**: The bandwidth plan is locked.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The tags of the bandwidth plans.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public BandwidthPackages build() {
                return new BandwidthPackages(this);
            } 

        } 

    }
}
