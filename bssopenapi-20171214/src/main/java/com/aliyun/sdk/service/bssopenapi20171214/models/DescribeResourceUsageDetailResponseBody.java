// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageDetailResponseBody</p>
 */
public class DescribeResourceUsageDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
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
        @NameInMap("CapacityUnit")
        private String capacityUnit;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductQuantity")
        private Float deductQuantity;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ImageType")
        private String imageType;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("PostpaidCost")
        private String postpaidCost;

        @NameInMap("PotentialSavedCost")
        private String potentialSavedCost;

        @NameInMap("Quantity")
        private Long quantity;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("ReservationCost")
        private String reservationCost;

        @NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @NameInMap("SavedCost")
        private String savedCost;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusName")
        private String statusName;

        @NameInMap("TotalQuantity")
        private Float totalQuantity;

        @NameInMap("UsagePercentage")
        private Float usagePercentage;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("Zone")
        private String zone;

        @NameInMap("ZoneName")
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
             * CapacityUnit.
             */
            public Builder capacityUnit(String capacityUnit) {
                this.capacityUnit = capacityUnit;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DeductQuantity.
             */
            public Builder deductQuantity(Float deductQuantity) {
                this.deductQuantity = deductQuantity;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ImageType.
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * PostpaidCost.
             */
            public Builder postpaidCost(String postpaidCost) {
                this.postpaidCost = postpaidCost;
                return this;
            }

            /**
             * PotentialSavedCost.
             */
            public Builder potentialSavedCost(String potentialSavedCost) {
                this.potentialSavedCost = potentialSavedCost;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
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
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * ReservationCost.
             */
            public Builder reservationCost(String reservationCost) {
                this.reservationCost = reservationCost;
                return this;
            }

            /**
             * ResourceInstanceId.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * SavedCost.
             */
            public Builder savedCost(String savedCost) {
                this.savedCost = savedCost;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusName.
             */
            public Builder statusName(String statusName) {
                this.statusName = statusName;
                return this;
            }

            /**
             * TotalQuantity.
             */
            public Builder totalQuantity(Float totalQuantity) {
                this.totalQuantity = totalQuantity;
                return this;
            }

            /**
             * UsagePercentage.
             */
            public Builder usagePercentage(Float usagePercentage) {
                this.usagePercentage = usagePercentage;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * Zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            /**
             * ZoneName.
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
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("MaxResults")
        private Integer maxResults;

        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("TotalCount")
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
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
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
