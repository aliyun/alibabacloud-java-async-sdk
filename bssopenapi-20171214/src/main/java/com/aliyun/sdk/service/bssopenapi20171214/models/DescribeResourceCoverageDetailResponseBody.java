// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceCoverageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceCoverageDetailResponseBody</p>
 */
public class DescribeResourceCoverageDetailResponseBody extends TeaModel {
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

    private DescribeResourceCoverageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceCoverageDetailResponseBody create() {
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

        public DescribeResourceCoverageDetailResponseBody build() {
            return new DescribeResourceCoverageDetailResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CapacityUnit")
        private String capacityUnit;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityName")
        private String commodityName;

        @NameInMap("CoveragePercentage")
        private Float coveragePercentage;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("DeductQuantity")
        private Float deductQuantity;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("PaymentAmount")
        private Float paymentAmount;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Region")
        private String region;

        @NameInMap("RegionNo")
        private String regionNo;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("TotalQuantity")
        private Float totalQuantity;

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
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.coveragePercentage = builder.coveragePercentage;
            this.currency = builder.currency;
            this.deductQuantity = builder.deductQuantity;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.instanceSpec = builder.instanceSpec;
            this.paymentAmount = builder.paymentAmount;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
            this.region = builder.region;
            this.regionNo = builder.regionNo;
            this.startTime = builder.startTime;
            this.totalQuantity = builder.totalQuantity;
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
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return coveragePercentage
         */
        public Float getCoveragePercentage() {
            return this.coveragePercentage;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return paymentAmount
         */
        public Float getPaymentAmount() {
            return this.paymentAmount;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalQuantity
         */
        public Float getTotalQuantity() {
            return this.totalQuantity;
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
            private String commodityCode; 
            private String commodityName; 
            private Float coveragePercentage; 
            private String currency; 
            private Float deductQuantity; 
            private String endTime; 
            private String instanceId; 
            private String instanceSpec; 
            private Float paymentAmount; 
            private String productCode; 
            private String productName; 
            private String region; 
            private String regionNo; 
            private String startTime; 
            private Float totalQuantity; 
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
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * CoveragePercentage.
             */
            public Builder coveragePercentage(Float coveragePercentage) {
                this.coveragePercentage = coveragePercentage;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * PaymentAmount.
             */
            public Builder paymentAmount(Float paymentAmount) {
                this.paymentAmount = paymentAmount;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
