// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageDetailResponseBody</p>
 */
public class DescribeResourceUsageDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeResourceUsageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeResourceUsageDetailResponseBody build() {
            return new DescribeResourceUsageDetailResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityUnit")
        private String capacityUnit;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DeductQuantity")
        private Float deductQuantity;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("PostpaidCost")
        private String postpaidCost;

        @com.aliyun.core.annotation.NameInMap("PotentialSavedCost")
        private String potentialSavedCost;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Long quantity;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ReservationCost")
        private String reservationCost;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SavedCost")
        private String savedCost;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusName")
        private String statusName;

        @com.aliyun.core.annotation.NameInMap("TotalQuantity")
        private Float totalQuantity;

        @com.aliyun.core.annotation.NameInMap("UsagePercentage")
        private Float usagePercentage;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("Zone")
        private String zone;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private Items(Builder builder) {
            this.capacityUnit = builder.capacityUnit;
            this.currency = builder.currency;
            this.deductQuantity = builder.deductQuantity;
            this.endTime = builder.endTime;
            this.imageType = builder.imageType;
            this.instanceSpec = builder.instanceSpec;
            this.postpaidCost = builder.postpaidCost;
            this.potentialSavedCost = builder.potentialSavedCost;
            this.quantity = builder.quantity;
            this.region = builder.region;
            this.regionNo = builder.regionNo;
            this.reservationCost = builder.reservationCost;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.savedCost = builder.savedCost;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusName = builder.statusName;
            this.totalQuantity = builder.totalQuantity;
            this.usagePercentage = builder.usagePercentage;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.zone = builder.zone;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return capacityUnit
         */
        public String getCapacityUnit() {
            return this.capacityUnit;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return deductQuantity
         */
        public Float getDeductQuantity() {
            return this.deductQuantity;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return postpaidCost
         */
        public String getPostpaidCost() {
            return this.postpaidCost;
        }

        /**
         * @return potentialSavedCost
         */
        public String getPotentialSavedCost() {
            return this.potentialSavedCost;
        }

        /**
         * @return quantity
         */
        public Long getQuantity() {
            return this.quantity;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return reservationCost
         */
        public String getReservationCost() {
            return this.reservationCost;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return savedCost
         */
        public String getSavedCost() {
            return this.savedCost;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusName
         */
        public String getStatusName() {
            return this.statusName;
        }

        /**
         * @return totalQuantity
         */
        public Float getTotalQuantity() {
            return this.totalQuantity;
        }

        /**
         * @return usagePercentage
         */
        public Float getUsagePercentage() {
            return this.usagePercentage;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String capacityUnit; 
            private String currency; 
            private Float deductQuantity; 
            private String endTime; 
            private String imageType; 
            private String instanceSpec; 
            private String postpaidCost; 
            private String potentialSavedCost; 
            private Long quantity; 
            private String region; 
            private String regionNo; 
            private String reservationCost; 
            private String resourceInstanceId; 
            private String savedCost; 
            private String startTime; 
            private String status; 
            private String statusName; 
            private Float totalQuantity; 
            private Float usagePercentage; 
            private String userId; 
            private String userName; 
            private String zone; 
            private String zoneName; 

            /**
             * The unit that is used to measure the resources that are deducted.
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * The type of the currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The amount of the deducted resources.
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * The end of the time range in which the usage details were queried.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The operating system.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * The equivalent of pay-as-you-go costs.
             */
            public Builder postpaidCost(String postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * The potential net savings.
             */
            public Builder potentialSavedCost(String potentialSavedCost) {
                this.potentialSavedCost = potentialSavedCost;
                return this;
            }

            /**
             * The number of deduction plans.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * The region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The code of the region.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * The fee of the deduction plan.
             */
            public Builder reservationCost(String reservationCost) {
                this.reservationCost = reservationCost;
                return this;
            }

            /**
             * The ID of the deduction plan.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * The net savings.
             */
            public Builder savedCost(String savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * The beginning of the time range in which the usage details were queried.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the deduction plan.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the status.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * The total capacity of the deduction plan.
             */
            public Builder totalQuantity(Float totalQuantity) {
                this.totalQuantity = totalQuantity;
                return this;
            }

            /**
             * The usage rate of the deduction plan.
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            /**
             * The account ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The username of the account.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            /**
             * The code of the zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.items = builder.items;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * The data entries.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * The number of entries returned on the current page.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * A pagination token. It can be used in the next request to retrieve a new page of results.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
