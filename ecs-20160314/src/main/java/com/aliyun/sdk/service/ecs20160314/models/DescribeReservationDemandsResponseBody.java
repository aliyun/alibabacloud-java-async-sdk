// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservationDemandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservationDemandsResponseBody</p>
 */
public class DescribeReservationDemandsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeReservationDemandsResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservationDemandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Data data; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public DescribeReservationDemandsResponseBody build() {
            return new DescribeReservationDemandsResponseBody(this);
        } 

    } 

    public static class CapacityReservations extends TeaModel {
        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        private CapacityReservations(Builder builder) {
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.matchCriteria = builder.matchCriteria;
            this.planId = builder.planId;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservations create() {
            return builder().build();
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer instanceAmount; 
            private String instanceType; 
            private String matchCriteria; 
            private String planId; 
            private String privatePoolOptionsId; 
            private String startTime; 
            private String status; 
            private String zoneId; 

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
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
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public CapacityReservations build() {
                return new CapacityReservations(this);
            } 

        } 

    }
    public static class RecommendResource extends TeaModel {
        @NameInMap("CapacityReservations")
        private java.util.List < CapacityReservations> capacityReservations;

        private RecommendResource(Builder builder) {
            this.capacityReservations = builder.capacityReservations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendResource create() {
            return builder().build();
        }

        /**
         * @return capacityReservations
         */
        public java.util.List < CapacityReservations> getCapacityReservations() {
            return this.capacityReservations;
        }

        public static final class Builder {
            private java.util.List < CapacityReservations> capacityReservations; 

            /**
             * CapacityReservations.
             */
            public Builder capacityReservations(java.util.List < CapacityReservations> capacityReservations) {
                this.capacityReservations = capacityReservations;
                return this;
            }

            public RecommendResource build() {
                return new RecommendResource(this);
            } 

        } 

    }
    public static class ReservationResourceCapacityReservations extends TeaModel {
        @NameInMap("ApproveCode")
        private String approveCode;

        @NameInMap("ApproveNotes")
        private String approveNotes;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        private ReservationResourceCapacityReservations(Builder builder) {
            this.approveCode = builder.approveCode;
            this.approveNotes = builder.approveNotes;
            this.instanceAmount = builder.instanceAmount;
            this.instanceType = builder.instanceType;
            this.matchCriteria = builder.matchCriteria;
            this.planId = builder.planId;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservationResourceCapacityReservations create() {
            return builder().build();
        }

        /**
         * @return approveCode
         */
        public String getApproveCode() {
            return this.approveCode;
        }

        /**
         * @return approveNotes
         */
        public String getApproveNotes() {
            return this.approveNotes;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String approveCode; 
            private String approveNotes; 
            private Integer instanceAmount; 
            private String instanceType; 
            private String matchCriteria; 
            private String planId; 
            private String privatePoolOptionsId; 
            private String startTime; 
            private String status; 
            private String zoneId; 

            /**
             * ApproveCode.
             */
            public Builder approveCode(String approveCode) {
                this.approveCode = approveCode;
                return this;
            }

            /**
             * ApproveNotes.
             */
            public Builder approveNotes(String approveNotes) {
                this.approveNotes = approveNotes;
                return this;
            }

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
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
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ReservationResourceCapacityReservations build() {
                return new ReservationResourceCapacityReservations(this);
            } 

        } 

    }
    public static class ReservationResource extends TeaModel {
        @NameInMap("CapacityReservations")
        private java.util.List < ReservationResourceCapacityReservations> capacityReservations;

        private ReservationResource(Builder builder) {
            this.capacityReservations = builder.capacityReservations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReservationResource create() {
            return builder().build();
        }

        /**
         * @return capacityReservations
         */
        public java.util.List < ReservationResourceCapacityReservations> getCapacityReservations() {
            return this.capacityReservations;
        }

        public static final class Builder {
            private java.util.List < ReservationResourceCapacityReservations> capacityReservations; 

            /**
             * CapacityReservations.
             */
            public Builder capacityReservations(java.util.List < ReservationResourceCapacityReservations> capacityReservations) {
                this.capacityReservations = capacityReservations;
                return this;
            }

            public ReservationResource build() {
                return new ReservationResource(this);
            } 

        } 

    }
    public static class DemandOrders extends TeaModel {
        @NameInMap("ConfirmType")
        private String confirmType;

        @NameInMap("CouponAuto")
        private String couponAuto;

        @NameInMap("CouponType")
        private String couponType;

        @NameInMap("DemandId")
        private String demandId;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @NameInMap("InstanceCpuCoreCount")
        private Integer instanceCpuCoreCount;

        @NameInMap("InstanceTypes")
        private String instanceTypes;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        @NameInMap("Name")
        private String name;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("RecommendResource")
        private RecommendResource recommendResource;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReservationResource")
        private ReservationResource reservationResource;

        @NameInMap("ReservedInstanceDescription")
        private String reservedInstanceDescription;

        @NameInMap("ReservedInstanceId")
        private String reservedInstanceId;

        @NameInMap("ReservedInstanceName")
        private String reservedInstanceName;

        @NameInMap("ReservedInstanceOfferingType")
        private String reservedInstanceOfferingType;

        @NameInMap("ResourceSupplyType")
        private String resourceSupplyType;

        @NameInMap("SavingPlanDescription")
        private String savingPlanDescription;

        @NameInMap("SavingPlanHourFee")
        private Float savingPlanHourFee;

        @NameInMap("SavingPlanId")
        private String savingPlanId;

        @NameInMap("SavingPlanInstanceTypeFamilyGroup")
        private String savingPlanInstanceTypeFamilyGroup;

        @NameInMap("SavingPlanName")
        private String savingPlanName;

        @NameInMap("SavingPlanPayMode")
        private String savingPlanPayMode;

        @NameInMap("SavingPlanSavingType")
        private String savingPlanSavingType;

        @NameInMap("SavingPlanSpecType")
        private String savingPlanSpecType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneIds")
        private String zoneIds;

        private DemandOrders(Builder builder) {
            this.confirmType = builder.confirmType;
            this.couponAuto = builder.couponAuto;
            this.couponType = builder.couponType;
            this.demandId = builder.demandId;
            this.description = builder.description;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceCpuCoreCount = builder.instanceCpuCoreCount;
            this.instanceTypes = builder.instanceTypes;
            this.matchCriteria = builder.matchCriteria;
            this.name = builder.name;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.phoneNumber = builder.phoneNumber;
            this.platform = builder.platform;
            this.productType = builder.productType;
            this.recommendResource = builder.recommendResource;
            this.regionId = builder.regionId;
            this.reservationResource = builder.reservationResource;
            this.reservedInstanceDescription = builder.reservedInstanceDescription;
            this.reservedInstanceId = builder.reservedInstanceId;
            this.reservedInstanceName = builder.reservedInstanceName;
            this.reservedInstanceOfferingType = builder.reservedInstanceOfferingType;
            this.resourceSupplyType = builder.resourceSupplyType;
            this.savingPlanDescription = builder.savingPlanDescription;
            this.savingPlanHourFee = builder.savingPlanHourFee;
            this.savingPlanId = builder.savingPlanId;
            this.savingPlanInstanceTypeFamilyGroup = builder.savingPlanInstanceTypeFamilyGroup;
            this.savingPlanName = builder.savingPlanName;
            this.savingPlanPayMode = builder.savingPlanPayMode;
            this.savingPlanSavingType = builder.savingPlanSavingType;
            this.savingPlanSpecType = builder.savingPlanSpecType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DemandOrders create() {
            return builder().build();
        }

        /**
         * @return confirmType
         */
        public String getConfirmType() {
            return this.confirmType;
        }

        /**
         * @return couponAuto
         */
        public String getCouponAuto() {
            return this.couponAuto;
        }

        /**
         * @return couponType
         */
        public String getCouponType() {
            return this.couponType;
        }

        /**
         * @return demandId
         */
        public String getDemandId() {
            return this.demandId;
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
         * @return instanceCpuCoreCount
         */
        public Integer getInstanceCpuCoreCount() {
            return this.instanceCpuCoreCount;
        }

        /**
         * @return instanceTypes
         */
        public String getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return recommendResource
         */
        public RecommendResource getRecommendResource() {
            return this.recommendResource;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservationResource
         */
        public ReservationResource getReservationResource() {
            return this.reservationResource;
        }

        /**
         * @return reservedInstanceDescription
         */
        public String getReservedInstanceDescription() {
            return this.reservedInstanceDescription;
        }

        /**
         * @return reservedInstanceId
         */
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        /**
         * @return reservedInstanceName
         */
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        /**
         * @return reservedInstanceOfferingType
         */
        public String getReservedInstanceOfferingType() {
            return this.reservedInstanceOfferingType;
        }

        /**
         * @return resourceSupplyType
         */
        public String getResourceSupplyType() {
            return this.resourceSupplyType;
        }

        /**
         * @return savingPlanDescription
         */
        public String getSavingPlanDescription() {
            return this.savingPlanDescription;
        }

        /**
         * @return savingPlanHourFee
         */
        public Float getSavingPlanHourFee() {
            return this.savingPlanHourFee;
        }

        /**
         * @return savingPlanId
         */
        public String getSavingPlanId() {
            return this.savingPlanId;
        }

        /**
         * @return savingPlanInstanceTypeFamilyGroup
         */
        public String getSavingPlanInstanceTypeFamilyGroup() {
            return this.savingPlanInstanceTypeFamilyGroup;
        }

        /**
         * @return savingPlanName
         */
        public String getSavingPlanName() {
            return this.savingPlanName;
        }

        /**
         * @return savingPlanPayMode
         */
        public String getSavingPlanPayMode() {
            return this.savingPlanPayMode;
        }

        /**
         * @return savingPlanSavingType
         */
        public String getSavingPlanSavingType() {
            return this.savingPlanSavingType;
        }

        /**
         * @return savingPlanSpecType
         */
        public String getSavingPlanSpecType() {
            return this.savingPlanSpecType;
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
         * @return zoneIds
         */
        public String getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private String confirmType; 
            private String couponAuto; 
            private String couponType; 
            private String demandId; 
            private String description; 
            private String instanceChargeType; 
            private Integer instanceCpuCoreCount; 
            private String instanceTypes; 
            private String matchCriteria; 
            private String name; 
            private Integer period; 
            private String periodUnit; 
            private String phoneNumber; 
            private String platform; 
            private String productType; 
            private RecommendResource recommendResource; 
            private String regionId; 
            private ReservationResource reservationResource; 
            private String reservedInstanceDescription; 
            private String reservedInstanceId; 
            private String reservedInstanceName; 
            private String reservedInstanceOfferingType; 
            private String resourceSupplyType; 
            private String savingPlanDescription; 
            private Float savingPlanHourFee; 
            private String savingPlanId; 
            private String savingPlanInstanceTypeFamilyGroup; 
            private String savingPlanName; 
            private String savingPlanPayMode; 
            private String savingPlanSavingType; 
            private String savingPlanSpecType; 
            private String startTime; 
            private String status; 
            private String zoneIds; 

            /**
             * ConfirmType.
             */
            public Builder confirmType(String confirmType) {
                this.confirmType = confirmType;
                return this;
            }

            /**
             * CouponAuto.
             */
            public Builder couponAuto(String couponAuto) {
                this.couponAuto = couponAuto;
                return this;
            }

            /**
             * CouponType.
             */
            public Builder couponType(String couponType) {
                this.couponType = couponType;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * InstanceCpuCoreCount.
             */
            public Builder instanceCpuCoreCount(Integer instanceCpuCoreCount) {
                this.instanceCpuCoreCount = instanceCpuCoreCount;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(String instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * MatchCriteria.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
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
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RecommendResource.
             */
            public Builder recommendResource(RecommendResource recommendResource) {
                this.recommendResource = recommendResource;
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
             * ReservationResource.
             */
            public Builder reservationResource(ReservationResource reservationResource) {
                this.reservationResource = reservationResource;
                return this;
            }

            /**
             * ReservedInstanceDescription.
             */
            public Builder reservedInstanceDescription(String reservedInstanceDescription) {
                this.reservedInstanceDescription = reservedInstanceDescription;
                return this;
            }

            /**
             * ReservedInstanceId.
             */
            public Builder reservedInstanceId(String reservedInstanceId) {
                this.reservedInstanceId = reservedInstanceId;
                return this;
            }

            /**
             * ReservedInstanceName.
             */
            public Builder reservedInstanceName(String reservedInstanceName) {
                this.reservedInstanceName = reservedInstanceName;
                return this;
            }

            /**
             * ReservedInstanceOfferingType.
             */
            public Builder reservedInstanceOfferingType(String reservedInstanceOfferingType) {
                this.reservedInstanceOfferingType = reservedInstanceOfferingType;
                return this;
            }

            /**
             * ResourceSupplyType.
             */
            public Builder resourceSupplyType(String resourceSupplyType) {
                this.resourceSupplyType = resourceSupplyType;
                return this;
            }

            /**
             * SavingPlanDescription.
             */
            public Builder savingPlanDescription(String savingPlanDescription) {
                this.savingPlanDescription = savingPlanDescription;
                return this;
            }

            /**
             * SavingPlanHourFee.
             */
            public Builder savingPlanHourFee(Float savingPlanHourFee) {
                this.savingPlanHourFee = savingPlanHourFee;
                return this;
            }

            /**
             * SavingPlanId.
             */
            public Builder savingPlanId(String savingPlanId) {
                this.savingPlanId = savingPlanId;
                return this;
            }

            /**
             * SavingPlanInstanceTypeFamilyGroup.
             */
            public Builder savingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
                this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
                return this;
            }

            /**
             * SavingPlanName.
             */
            public Builder savingPlanName(String savingPlanName) {
                this.savingPlanName = savingPlanName;
                return this;
            }

            /**
             * SavingPlanPayMode.
             */
            public Builder savingPlanPayMode(String savingPlanPayMode) {
                this.savingPlanPayMode = savingPlanPayMode;
                return this;
            }

            /**
             * SavingPlanSavingType.
             */
            public Builder savingPlanSavingType(String savingPlanSavingType) {
                this.savingPlanSavingType = savingPlanSavingType;
                return this;
            }

            /**
             * SavingPlanSpecType.
             */
            public Builder savingPlanSpecType(String savingPlanSpecType) {
                this.savingPlanSpecType = savingPlanSpecType;
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
             * ZoneIds.
             */
            public Builder zoneIds(String zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public DemandOrders build() {
                return new DemandOrders(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DemandOrders")
        private java.util.List < DemandOrders> demandOrders;

        private Data(Builder builder) {
            this.demandOrders = builder.demandOrders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return demandOrders
         */
        public java.util.List < DemandOrders> getDemandOrders() {
            return this.demandOrders;
        }

        public static final class Builder {
            private java.util.List < DemandOrders> demandOrders; 

            /**
             * DemandOrders.
             */
            public Builder demandOrders(java.util.List < DemandOrders> demandOrders) {
                this.demandOrders = demandOrders;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
