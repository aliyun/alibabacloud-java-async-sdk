// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The demands in the region.</p>
         */
        public Builder demands(Demands demands) {
            this.demands = demands;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of queried demands.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDemandsResponseBody build() {
            return new DescribeDemandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDemandsResponseBody</p>
     */
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
             * <p>The number of delivered instances.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>需求单对应的私有池ID。</p>
             * 
             * <strong>example:</strong>
             * <p>crp-bp1fv8sbhelbzjwx****</p>
             */
            public Builder privatePoolId(String privatePoolId) {
                this.privatePoolId = privatePoolId;
                return this;
            }

            /**
             * <p>The end of the time range during which the filed resources are delivered and available. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-03T15:00:00Z</p>
             */
            public Builder supplyEndTime(String supplyEndTime) {
                this.supplyEndTime = supplyEndTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the filed resources are delivered and available. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-01T14:00:00Z</p>
             */
            public Builder supplyStartTime(String supplyStartTime) {
                this.supplyStartTime = supplyStartTime;
                return this;
            }

            /**
             * <p>The delivery status of the filed resource. Valid values:</p>
             * <ul>
             * <li>Delivered: The filed resource is delivered.</li>
             * <li>Delivering: The filed resource is being delivered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Delivering</p>
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
    /**
     * 
     * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDemandsResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDemandsResponseBody</p>
     */
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
             * <p>The number of available instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * <p>The feedback on the rejected demands.</p>
             * 
             * <strong>example:</strong>
             * <p>test-for-comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The number of instances to be delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder deliveringAmount(Integer deliveringAmount) {
                this.deliveringAmount = deliveringAmount;
                return this;
            }

            /**
             * <p>The description of the demand.</p>
             * 
             * <strong>example:</strong>
             * <p>test-DemandDescription</p>
             */
            public Builder demandDescription(String demandDescription) {
                this.demandDescription = demandDescription;
                return this;
            }

            /**
             * <p>The ID of the demand.</p>
             * 
             * <strong>example:</strong>
             * <p>ed-bp11n21kq00sl71p****</p>
             */
            public Builder demandId(String demandId) {
                this.demandId = demandId;
                return this;
            }

            /**
             * <p>The name of the demand.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-node-demand</p>
             */
            public Builder demandName(String demandName) {
                this.demandName = demandName;
                return this;
            }

            /**
             * <p>The status of the demand or filed resources. Valid values:</p>
             * <ul>
             * <li>Creating: The demand is being created.</li>
             * <li>Active: The filed resources are being supplied.</li>
             * <li>Expired: The demand has expired.</li>
             * <li>Finished: The filed resources are consumed.</li>
             * <li>Refused: The demand is rejected. To view the reason for rejection, see the <code>Comment</code> parameter.</li>
             * <li>Cancelled: The demand is canceled. After the demand is canceled, the delivery status of the resources becomes invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder demandStatus(String demandStatus) {
                this.demandStatus = demandStatus;
                return this;
            }

            /**
             * <p>The time when the demand was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T12:00:00Z</p>
             */
            public Builder demandTime(String demandTime) {
                this.demandTime = demandTime;
                return this;
            }

            /**
             * <p>The expected end time for the purchase of the filed resources. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-03T15:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The billing method of the filed resources. Valid values:</p>
             * <ul>
             * <li>Prepaid: subscription.</li>
             * <li>Postpaid: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance type of the filed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The instance family of the filed instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>The usage duration of the filed resources.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the usage duration of the filed resources. Valid values:</p>
             * <ul>
             * <li>Hour</li>
             * <li>Day</li>
             * <li></li>
             * <li>Month</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The expected start time for the purchase of the filed resources. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-27T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The delivery status of the filed resources.</p>
             */
            public Builder supplyInfos(SupplyInfos supplyInfos) {
                this.supplyInfos = supplyInfos;
                return this;
            }

            /**
             * <p>The number of filed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder totalAmount(Integer totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * <p>The number of consumed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * <p>The ID of the zone where the filed resource resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
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
    /**
     * 
     * {@link DescribeDemandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDemandsResponseBody</p>
     */
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
