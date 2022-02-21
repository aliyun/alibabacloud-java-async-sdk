// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationsResponseBody</p>
 */
public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("CapacityReservations")
    private CapacityReservations capacityReservations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCapacityReservationsResponseBody(Builder builder) {
        this.capacityReservations = builder.capacityReservations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacityReservations
     */
    public CapacityReservations getCapacityReservations() {
        return this.capacityReservations;
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
        private CapacityReservations capacityReservations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CapacityReservations.
         */
        public Builder capacityReservations(CapacityReservations capacityReservations) {
            this.capacityReservations = capacityReservations;
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

        public DescribeCapacityReservationsResponseBody build() {
            return new DescribeCapacityReservationsResponseBody(this);
        } 

    } 

    public static class CapacityReservation extends TeaModel {
        @NameInMap("AvailableInstanceCount")
        private Integer availableInstanceCount;

        @NameInMap("CapacityReservationId")
        private String capacityReservationId;

        @NameInMap("CapacityReservationName")
        private String capacityReservationName;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndDateType")
        private String endDateType;

        @NameInMap("InstanceMatchCriteria")
        private String instanceMatchCriteria;

        @NameInMap("InstancePlatform")
        private String instancePlatform;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TimeSlot")
        private String timeSlot;

        @NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @NameInMap("ZoneId")
        private String zoneId;

        private CapacityReservation(Builder builder) {
            this.availableInstanceCount = builder.availableInstanceCount;
            this.capacityReservationId = builder.capacityReservationId;
            this.capacityReservationName = builder.capacityReservationName;
            this.description = builder.description;
            this.endDateType = builder.endDateType;
            this.instanceMatchCriteria = builder.instanceMatchCriteria;
            this.instancePlatform = builder.instancePlatform;
            this.instanceType = builder.instanceType;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.timeSlot = builder.timeSlot;
            this.totalInstanceCount = builder.totalInstanceCount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservation create() {
            return builder().build();
        }

        /**
         * @return availableInstanceCount
         */
        public Integer getAvailableInstanceCount() {
            return this.availableInstanceCount;
        }

        /**
         * @return capacityReservationId
         */
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        /**
         * @return capacityReservationName
         */
        public String getCapacityReservationName() {
            return this.capacityReservationName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDateType
         */
        public String getEndDateType() {
            return this.endDateType;
        }

        /**
         * @return instanceMatchCriteria
         */
        public String getInstanceMatchCriteria() {
            return this.instanceMatchCriteria;
        }

        /**
         * @return instancePlatform
         */
        public String getInstancePlatform() {
            return this.instancePlatform;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeSlot
         */
        public String getTimeSlot() {
            return this.timeSlot;
        }

        /**
         * @return totalInstanceCount
         */
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer availableInstanceCount; 
            private String capacityReservationId; 
            private String capacityReservationName; 
            private String description; 
            private String endDateType; 
            private String instanceMatchCriteria; 
            private String instancePlatform; 
            private String instanceType; 
            private String networkType; 
            private String regionId; 
            private String status; 
            private String timeSlot; 
            private Integer totalInstanceCount; 
            private String zoneId; 

            /**
             * AvailableInstanceCount.
             */
            public Builder availableInstanceCount(Integer availableInstanceCount) {
                this.availableInstanceCount = availableInstanceCount;
                return this;
            }

            /**
             * CapacityReservationId.
             */
            public Builder capacityReservationId(String capacityReservationId) {
                this.capacityReservationId = capacityReservationId;
                return this;
            }

            /**
             * CapacityReservationName.
             */
            public Builder capacityReservationName(String capacityReservationName) {
                this.capacityReservationName = capacityReservationName;
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
             * EndDateType.
             */
            public Builder endDateType(String endDateType) {
                this.endDateType = endDateType;
                return this;
            }

            /**
             * InstanceMatchCriteria.
             */
            public Builder instanceMatchCriteria(String instanceMatchCriteria) {
                this.instanceMatchCriteria = instanceMatchCriteria;
                return this;
            }

            /**
             * InstancePlatform.
             */
            public Builder instancePlatform(String instancePlatform) {
                this.instancePlatform = instancePlatform;
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
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TimeSlot.
             */
            public Builder timeSlot(String timeSlot) {
                this.timeSlot = timeSlot;
                return this;
            }

            /**
             * TotalInstanceCount.
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public CapacityReservation build() {
                return new CapacityReservation(this);
            } 

        } 

    }
    public static class CapacityReservations extends TeaModel {
        @NameInMap("CapacityReservation")
        private java.util.List < CapacityReservation> capacityReservation;

        private CapacityReservations(Builder builder) {
            this.capacityReservation = builder.capacityReservation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservations create() {
            return builder().build();
        }

        /**
         * @return capacityReservation
         */
        public java.util.List < CapacityReservation> getCapacityReservation() {
            return this.capacityReservation;
        }

        public static final class Builder {
            private java.util.List < CapacityReservation> capacityReservation; 

            /**
             * CapacityReservation.
             */
            public Builder capacityReservation(java.util.List < CapacityReservation> capacityReservation) {
                this.capacityReservation = capacityReservation;
                return this;
            }

            public CapacityReservations build() {
                return new CapacityReservations(this);
            } 

        } 

    }
}
