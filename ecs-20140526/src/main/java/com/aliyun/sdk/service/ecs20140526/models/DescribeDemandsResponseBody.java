// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDemandsResponseBody</p>
 */
public class DescribeDemandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Demands")
    private Demands demands;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDemandsResponseBody(Builder builder) {
        this.demands = builder.demands;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDemandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return demands
     */
    public Demands getDemands() {
        return this.demands;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private Demands demands; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The demands in the region.
         */
        public Builder demands(Demands demands) {
            this.demands = demands;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The number of queried demands.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDemandsResponseBody build() {
            return new DescribeDemandsResponseBody(this);
        } 

    } 

    public static class SupplyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolId")
        private String privatePoolId;

        @com.aliyun.core.annotation.NameInMap("SupplyEndTime")
        private String supplyEndTime;

        @com.aliyun.core.annotation.NameInMap("SupplyStartTime")
        private String supplyStartTime;

        @com.aliyun.core.annotation.NameInMap("SupplyStatus")
        private String supplyStatus;

        private SupplyInfo(Builder builder) {
            this.amount = builder.amount;
            this.privatePoolId = builder.privatePoolId;
            this.supplyEndTime = builder.supplyEndTime;
            this.supplyStartTime = builder.supplyStartTime;
            this.supplyStatus = builder.supplyStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplyInfo create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return privatePoolId
         */
        public String getPrivatePoolId() {
            return this.privatePoolId;
        }

        /**
         * @return supplyEndTime
         */
        public String getSupplyEndTime() {
            return this.supplyEndTime;
        }

        /**
         * @return supplyStartTime
         */
        public String getSupplyStartTime() {
            return this.supplyStartTime;
        }

        /**
         * @return supplyStatus
         */
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

        public static final class Builder {
            private Integer amount; 
            private String privatePoolId; 
            private String supplyEndTime; 
            private String supplyStartTime; 
            private String supplyStatus; 

            /**
             * The number of delivered instances.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 需求单对应的私有池ID。
             */
            public Builder privatePoolId(String privatePoolId) {
                this.privatePoolId = privatePoolId;
                return this;
            }

            /**
             * The end of the time range during which the filed resources are delivered and available. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder supplyEndTime(String supplyEndTime) {
                this.supplyEndTime = supplyEndTime;
                return this;
            }

            /**
             * The beginning of the time range during which the filed resources are delivered and available. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder supplyStartTime(String supplyStartTime) {
                this.supplyStartTime = supplyStartTime;
                return this;
            }

            /**
             * The delivery status of the filed resource. Valid values:
             * <p>
             * 
             * *   Delivered: The filed resource is delivered.
             * *   Delivering: The filed resource is being delivered.
             */
            public Builder supplyStatus(String supplyStatus) {
                this.supplyStatus = supplyStatus;
                return this;
            }

            public SupplyInfo build() {
                return new SupplyInfo(this);
            } 

        } 

    }
    public static class SupplyInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupplyInfo")
        private java.util.List < SupplyInfo> supplyInfo;

        private SupplyInfos(Builder builder) {
            this.supplyInfo = builder.supplyInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplyInfos create() {
            return builder().build();
        }

        /**
         * @return supplyInfo
         */
        public java.util.List < SupplyInfo> getSupplyInfo() {
            return this.supplyInfo;
        }

        public static final class Builder {
            private java.util.List < SupplyInfo> supplyInfo; 

            /**
             * SupplyInfo.
             */
            public Builder supplyInfo(java.util.List < SupplyInfo> supplyInfo) {
                this.supplyInfo = supplyInfo;
                return this;
            }

            public SupplyInfos build() {
                return new SupplyInfos(this);
            } 

        } 

    }
    public static class Demand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private Integer availableAmount;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DeliveringAmount")
        private Integer deliveringAmount;

        @com.aliyun.core.annotation.NameInMap("DemandDescription")
        private String demandDescription;

        @com.aliyun.core.annotation.NameInMap("DemandId")
        private String demandId;

        @com.aliyun.core.annotation.NameInMap("DemandName")
        private String demandName;

        @com.aliyun.core.annotation.NameInMap("DemandStatus")
        private String demandStatus;

        @com.aliyun.core.annotation.NameInMap("DemandTime")
        private String demandTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SupplyInfos")
        private SupplyInfos supplyInfos;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private Integer totalAmount;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Demand(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.comment = builder.comment;
            this.deliveringAmount = builder.deliveringAmount;
            this.demandDescription = builder.demandDescription;
            this.demandId = builder.demandId;
            this.demandName = builder.demandName;
            this.demandStatus = builder.demandStatus;
            this.demandTime = builder.demandTime;
            this.endTime = builder.endTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceType = builder.instanceType;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.startTime = builder.startTime;
            this.supplyInfos = builder.supplyInfos;
            this.totalAmount = builder.totalAmount;
            this.usedAmount = builder.usedAmount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demand create() {
            return builder().build();
        }

        /**
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return deliveringAmount
         */
        public Integer getDeliveringAmount() {
            return this.deliveringAmount;
        }

        /**
         * @return demandDescription
         */
        public String getDemandDescription() {
            return this.demandDescription;
        }

        /**
         * @return demandId
         */
        public String getDemandId() {
            return this.demandId;
        }

        /**
         * @return demandName
         */
        public String getDemandName() {
            return this.demandName;
        }

        /**
         * @return demandStatus
         */
        public String getDemandStatus() {
            return this.demandStatus;
        }

        /**
         * @return demandTime
         */
        public String getDemandTime() {
            return this.demandTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return supplyInfos
         */
        public SupplyInfos getSupplyInfos() {
            return this.supplyInfos;
        }

        /**
         * @return totalAmount
         */
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return usedAmount
         */
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer availableAmount; 
            private String comment; 
            private Integer deliveringAmount; 
            private String demandDescription; 
            private String demandId; 
            private String demandName; 
            private String demandStatus; 
            private String demandTime; 
            private String endTime; 
            private String instanceChargeType; 
            private String instanceType; 
            private String instanceTypeFamily; 
            private Integer period; 
            private String periodUnit; 
            private String startTime; 
            private SupplyInfos supplyInfos; 
            private Integer totalAmount; 
            private Integer usedAmount; 
            private String zoneId; 

            /**
             * The number of available instances.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * The feedback on the rejected demands.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The number of instances to be delivered.
             */
            public Builder deliveringAmount(Integer deliveringAmount) {
                this.deliveringAmount = deliveringAmount;
                return this;
            }

            /**
             * The description of the demand.
             */
            public Builder demandDescription(String demandDescription) {
                this.demandDescription = demandDescription;
                return this;
            }

            /**
             * The ID of the demand.
             */
            public Builder demandId(String demandId) {
                this.demandId = demandId;
                return this;
            }

            /**
             * The name of the demand.
             */
            public Builder demandName(String demandName) {
                this.demandName = demandName;
                return this;
            }

            /**
             * The status of the demand or filed resources. Valid values:
             * <p>
             * 
             * *   Creating: The demand is being created.
             * *   Active: The filed resources are being supplied.
             * *   Expired: The demand has expired.
             * *   Finished: The filed resources are consumed.
             * *   Refused: The demand is rejected. To view the reason for rejection, see the `Comment` parameter.
             * *   Cancelled: The demand is canceled. After the demand is canceled, the delivery status of the resources becomes invalid.
             */
            public Builder demandStatus(String demandStatus) {
                this.demandStatus = demandStatus;
                return this;
            }

            /**
             * The time when the demand was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder demandTime(String demandTime) {
                this.demandTime = demandTime;
                return this;
            }

            /**
             * The expected end time for the purchase of the filed resources. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The billing method of the filed resources. Valid values:
             * <p>
             * 
             * *   Prepaid: subscription.
             * *   Postpaid: pay-as-you-go.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The instance type of the filed instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The instance family of the filed instance.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The usage duration of the filed resources.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The unit of the usage duration of the filed resources. Valid values:
             * <p>
             * 
             * *   Hour
             * *   Day
             * *
             * *   Month
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The expected start time for the purchase of the filed resources. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The delivery status of the filed resources.
             */
            public Builder supplyInfos(SupplyInfos supplyInfos) {
                this.supplyInfos = supplyInfos;
                return this;
            }

            /**
             * The number of filed instances.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * The number of consumed instances.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * The ID of the zone where the filed resource resides.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Demand build() {
                return new Demand(this);
            } 

        } 

    }
    public static class Demands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Demand")
        private java.util.List < Demand> demand;

        private Demands(Builder builder) {
            this.demand = builder.demand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demands create() {
            return builder().build();
        }

        /**
         * @return demand
         */
        public java.util.List < Demand> getDemand() {
            return this.demand;
        }

        public static final class Builder {
            private java.util.List < Demand> demand; 

            /**
             * Demand.
             */
            public Builder demand(java.util.List < Demand> demand) {
                this.demand = demand;
                return this;
            }

            public Demands build() {
                return new Demands(this);
            } 

        } 

    }
}
