// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDemandsResponseBody</p>
 */
public class DescribeDemandsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Demands")
    private Demands demands;

    private DescribeDemandsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.regionId = builder.regionId;
        this.demands = builder.demands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDemandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return demands
     */
    public Demands getDemands() {
        return this.demands;
    }

    public static final class Builder {
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private String regionId; 
        private Demands demands; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The page number of the report list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The number of records queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The region of the query.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of records that match the filter conditions in the specified region.
         */
        public Builder demands(Demands demands) {
            this.demands = demands;
            return this;
        }

        public DescribeDemandsResponseBody build() {
            return new DescribeDemandsResponseBody(this);
        } 

    } 

    public static class SupplyInfo extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("SupplyStatus")
        private String supplyStatus;

        @NameInMap("SupplyStartTime")
        private String supplyStartTime;

        @NameInMap("SupplyEndTime")
        private String supplyEndTime;

        private SupplyInfo(Builder builder) {
            this.amount = builder.amount;
            this.supplyStatus = builder.supplyStatus;
            this.supplyStartTime = builder.supplyStartTime;
            this.supplyEndTime = builder.supplyEndTime;
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
         * @return supplyStatus
         */
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

        /**
         * @return supplyStartTime
         */
        public String getSupplyStartTime() {
            return this.supplyStartTime;
        }

        /**
         * @return supplyEndTime
         */
        public String getSupplyEndTime() {
            return this.supplyEndTime;
        }

        public static final class Builder {
            private Integer amount; 
            private String supplyStatus; 
            private String supplyStartTime; 
            private String supplyEndTime; 

            /**
             * The number of instances delivered.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The delivery status of the resource. Possible values:
             * <p>
             * 
             * -Delivered: Delivered
             * -Delivering: Delivery in progress
             */
            public Builder supplyStatus(String supplyStatus) {
                this.supplyStatus = supplyStatus;
                return this;
            }

            /**
             * The start time of resource delivery. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder supplyStartTime(String supplyStartTime) {
                this.supplyStartTime = supplyStartTime;
                return this;
            }

            /**
             * The deadline for resource delivery. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder supplyEndTime(String supplyEndTime) {
                this.supplyEndTime = supplyEndTime;
                return this;
            }

            public SupplyInfo build() {
                return new SupplyInfo(this);
            } 

        } 

    }
    public static class SupplyInfos extends TeaModel {
        @NameInMap("SupplyInfo")
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
        @NameInMap("Comment")
        private String comment;

        @NameInMap("DemandDescription")
        private String demandDescription;

        @NameInMap("DemandId")
        private String demandId;

        @NameInMap("DemandTime")
        private String demandTime;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("DemandName")
        private String demandName;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("AvailableAmount")
        private Integer availableAmount;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("UsedAmount")
        private Integer usedAmount;

        @NameInMap("TotalAmount")
        private Integer totalAmount;

        @NameInMap("DeliveringAmount")
        private Integer deliveringAmount;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("DemandStatus")
        private String demandStatus;

        @NameInMap("SupplyInfos")
        private SupplyInfos supplyInfos;

        private Demand(Builder builder) {
            this.comment = builder.comment;
            this.demandDescription = builder.demandDescription;
            this.demandId = builder.demandId;
            this.demandTime = builder.demandTime;
            this.instanceType = builder.instanceType;
            this.demandName = builder.demandName;
            this.period = builder.period;
            this.instanceChargeType = builder.instanceChargeType;
            this.availableAmount = builder.availableAmount;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.periodUnit = builder.periodUnit;
            this.zoneId = builder.zoneId;
            this.usedAmount = builder.usedAmount;
            this.totalAmount = builder.totalAmount;
            this.deliveringAmount = builder.deliveringAmount;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.demandStatus = builder.demandStatus;
            this.supplyInfos = builder.supplyInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Demand create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
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
         * @return demandTime
         */
        public String getDemandTime() {
            return this.demandTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return demandName
         */
        public String getDemandName() {
            return this.demandName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return usedAmount
         */
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        /**
         * @return totalAmount
         */
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return deliveringAmount
         */
        public Integer getDeliveringAmount() {
            return this.deliveringAmount;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return demandStatus
         */
        public String getDemandStatus() {
            return this.demandStatus;
        }

        /**
         * @return supplyInfos
         */
        public SupplyInfos getSupplyInfos() {
            return this.supplyInfos;
        }

        public static final class Builder {
            private String comment; 
            private String demandDescription; 
            private String demandId; 
            private String demandTime; 
            private String instanceType; 
            private String demandName; 
            private Integer period; 
            private String instanceChargeType; 
            private Integer availableAmount; 
            private String endTime; 
            private String startTime; 
            private String periodUnit; 
            private String zoneId; 
            private Integer usedAmount; 
            private Integer totalAmount; 
            private Integer deliveringAmount; 
            private String instanceTypeFamily; 
            private String demandStatus; 
            private SupplyInfos supplyInfos; 

            /**
             * The feedback suggestion that the resource report is rejected.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The description of the report.
             */
            public Builder demandDescription(String demandDescription) {
                this.demandDescription = demandDescription;
                return this;
            }

            /**
             * The ID of the report.
             */
            public Builder demandId(String demandId) {
                this.demandId = demandId;
                return this;
            }

            /**
             * The time when the report was created. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder demandTime(String demandTime) {
                this.demandTime = demandTime;
                return this;
            }

            /**
             * The type of the reported instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The name of the report.
             */
            public Builder demandName(String demandName) {
                this.demandName = demandName;
                return this;
            }

            /**
             * The duration of the reported resource.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The billing method of the reported resource. Possible values:
             * <p>
             * 
             * -Prepaid: Subscription
             * -Postpaid: pay-as-you-go
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * The number of instances that can be used to report Resources.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * The expected deadline for purchasing the reported resources. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The expected purchase time of the reported resource. The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is yyyy-MM-ddTHH:mm:ssZ.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The unit of the usage period of the reported resource. Possible values:
             * <p>
             * 
             * -Hour
             * -Day
             * -<props="china">Week</props>
             * -Month
             * 
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The zone of the reported resource.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
             * The number of reported instances.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * The number of instances to be delivered in the reported resources.
             */
            public Builder deliveringAmount(Integer deliveringAmount) {
                this.deliveringAmount = deliveringAmount;
                return this;
            }

            /**
             * The type family of the reported instance.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The status of the report or resource usage. Possible values:
             * <p>
             * 
             * -Creating: a report is being created.
             * -Active: resources are being supplied.
             * -Expired: The report has Expired.
             * -Finished: consumed.
             * -Refused: The report is rejected. For more information, see The "comment" parameter ".
             * -Cancelled: The filing is canceled. The filing resource has been canceled. After the report is canceled, the resource delivery status is invalid.
             */
            public Builder demandStatus(String demandStatus) {
                this.demandStatus = demandStatus;
                return this;
            }

            /**
             * The delivery status of the reported resources.
             */
            public Builder supplyInfos(SupplyInfos supplyInfos) {
                this.supplyInfos = supplyInfos;
                return this;
            }

            public Demand build() {
                return new Demand(this);
            } 

        } 

    }
    public static class Demands extends TeaModel {
        @NameInMap("Demand")
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
