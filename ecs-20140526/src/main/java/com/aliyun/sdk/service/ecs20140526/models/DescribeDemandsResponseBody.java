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
    @NameInMap("Demands")
    private Demands demands;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Demands.
         */
        public Builder demands(Demands demands) {
            this.demands = demands;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDemandsResponseBody build() {
            return new DescribeDemandsResponseBody(this);
        } 

    } 

    public static class SupplyInfo extends TeaModel {
        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("PrivatePoolId")
        private String privatePoolId;

        @NameInMap("SupplyEndTime")
        private String supplyEndTime;

        @NameInMap("SupplyStartTime")
        private String supplyStartTime;

        @NameInMap("SupplyStatus")
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
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * PrivatePoolId.
             */
            public Builder privatePoolId(String privatePoolId) {
                this.privatePoolId = privatePoolId;
                return this;
            }

            /**
             * SupplyEndTime.
             */
            public Builder supplyEndTime(String supplyEndTime) {
                this.supplyEndTime = supplyEndTime;
                return this;
            }

            /**
             * SupplyStartTime.
             */
            public Builder supplyStartTime(String supplyStartTime) {
                this.supplyStartTime = supplyStartTime;
                return this;
            }

            /**
             * SupplyStatus.
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
        @NameInMap("AvailableAmount")
        private Integer availableAmount;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("DeliveringAmount")
        private Integer deliveringAmount;

        @NameInMap("DemandDescription")
        private String demandDescription;

        @NameInMap("DemandId")
        private String demandId;

        @NameInMap("DemandName")
        private String demandName;

        @NameInMap("DemandStatus")
        private String demandStatus;

        @NameInMap("DemandTime")
        private String demandTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SupplyInfos")
        private SupplyInfos supplyInfos;

        @NameInMap("TotalAmount")
        private Integer totalAmount;

        @NameInMap("UsedAmount")
        private Integer usedAmount;

        @NameInMap("ZoneId")
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
             * AvailableAmount.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DeliveringAmount.
             */
            public Builder deliveringAmount(Integer deliveringAmount) {
                this.deliveringAmount = deliveringAmount;
                return this;
            }

            /**
             * DemandDescription.
             */
            public Builder demandDescription(String demandDescription) {
                this.demandDescription = demandDescription;
                return this;
            }

            /**
             * DemandId.
             */
            public Builder demandId(String demandId) {
                this.demandId = demandId;
                return this;
            }

            /**
             * DemandName.
             */
            public Builder demandName(String demandName) {
                this.demandName = demandName;
                return this;
            }

            /**
             * DemandStatus.
             */
            public Builder demandStatus(String demandStatus) {
                this.demandStatus = demandStatus;
                return this;
            }

            /**
             * DemandTime.
             */
            public Builder demandTime(String demandTime) {
                this.demandTime = demandTime;
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
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
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
             * SupplyInfos.
             */
            public Builder supplyInfos(SupplyInfos supplyInfos) {
                this.supplyInfos = supplyInfos;
                return this;
            }

            /**
             * TotalAmount.
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * UsedAmount.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * ZoneId.
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
