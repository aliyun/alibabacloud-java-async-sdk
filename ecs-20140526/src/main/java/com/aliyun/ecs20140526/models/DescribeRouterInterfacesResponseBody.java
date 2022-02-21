// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouterInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfacesResponseBody</p>
 */
public class DescribeRouterInterfacesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouterInterfaceSet")
    private RouterInterfaceSet routerInterfaceSet;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouterInterfacesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routerInterfaceSet = builder.routerInterfaceSet;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouterInterfacesResponseBody create() {
        return builder().build();
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
     * @return routerInterfaceSet
     */
    public RouterInterfaceSet getRouterInterfaceSet() {
        return this.routerInterfaceSet;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private RouterInterfaceSet routerInterfaceSet; 
        private Integer totalCount; 

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
         * RouterInterfaceSet.
         */
        public Builder routerInterfaceSet(RouterInterfaceSet routerInterfaceSet) {
            this.routerInterfaceSet = routerInterfaceSet;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouterInterfacesResponseBody build() {
            return new DescribeRouterInterfacesResponseBody(this);
        } 

    } 

    public static class RouterInterfaceType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ConnectedTime")
        private String connectedTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("HealthCheckSourceIp")
        private String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @NameInMap("Name")
        private String name;

        @NameInMap("OppositeAccessPointId")
        private String oppositeAccessPointId;

        @NameInMap("OppositeInterfaceBusinessStatus")
        private String oppositeInterfaceBusinessStatus;

        @NameInMap("OppositeInterfaceId")
        private String oppositeInterfaceId;

        @NameInMap("OppositeInterfaceOwnerId")
        private String oppositeInterfaceOwnerId;

        @NameInMap("OppositeInterfaceSpec")
        private String oppositeInterfaceSpec;

        @NameInMap("OppositeInterfaceStatus")
        private String oppositeInterfaceStatus;

        @NameInMap("OppositeRegionId")
        private String oppositeRegionId;

        @NameInMap("OppositeRouterId")
        private String oppositeRouterId;

        @NameInMap("OppositeRouterType")
        private String oppositeRouterType;

        @NameInMap("Role")
        private String role;

        @NameInMap("RouterId")
        private String routerId;

        @NameInMap("RouterInterfaceId")
        private String routerInterfaceId;

        @NameInMap("RouterType")
        private String routerType;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        private RouterInterfaceType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.businessStatus = builder.businessStatus;
            this.chargeType = builder.chargeType;
            this.connectedTime = builder.connectedTime;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.healthCheckSourceIp = builder.healthCheckSourceIp;
            this.healthCheckTargetIp = builder.healthCheckTargetIp;
            this.name = builder.name;
            this.oppositeAccessPointId = builder.oppositeAccessPointId;
            this.oppositeInterfaceBusinessStatus = builder.oppositeInterfaceBusinessStatus;
            this.oppositeInterfaceId = builder.oppositeInterfaceId;
            this.oppositeInterfaceOwnerId = builder.oppositeInterfaceOwnerId;
            this.oppositeInterfaceSpec = builder.oppositeInterfaceSpec;
            this.oppositeInterfaceStatus = builder.oppositeInterfaceStatus;
            this.oppositeRegionId = builder.oppositeRegionId;
            this.oppositeRouterId = builder.oppositeRouterId;
            this.oppositeRouterType = builder.oppositeRouterType;
            this.role = builder.role;
            this.routerId = builder.routerId;
            this.routerInterfaceId = builder.routerInterfaceId;
            this.routerType = builder.routerType;
            this.spec = builder.spec;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterInterfaceType create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return connectedTime
         */
        public String getConnectedTime() {
            return this.connectedTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return healthCheckSourceIp
         */
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        /**
         * @return healthCheckTargetIp
         */
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oppositeAccessPointId
         */
        public String getOppositeAccessPointId() {
            return this.oppositeAccessPointId;
        }

        /**
         * @return oppositeInterfaceBusinessStatus
         */
        public String getOppositeInterfaceBusinessStatus() {
            return this.oppositeInterfaceBusinessStatus;
        }

        /**
         * @return oppositeInterfaceId
         */
        public String getOppositeInterfaceId() {
            return this.oppositeInterfaceId;
        }

        /**
         * @return oppositeInterfaceOwnerId
         */
        public String getOppositeInterfaceOwnerId() {
            return this.oppositeInterfaceOwnerId;
        }

        /**
         * @return oppositeInterfaceSpec
         */
        public String getOppositeInterfaceSpec() {
            return this.oppositeInterfaceSpec;
        }

        /**
         * @return oppositeInterfaceStatus
         */
        public String getOppositeInterfaceStatus() {
            return this.oppositeInterfaceStatus;
        }

        /**
         * @return oppositeRegionId
         */
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        /**
         * @return oppositeRouterId
         */
        public String getOppositeRouterId() {
            return this.oppositeRouterId;
        }

        /**
         * @return oppositeRouterType
         */
        public String getOppositeRouterType() {
            return this.oppositeRouterType;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return routerId
         */
        public String getRouterId() {
            return this.routerId;
        }

        /**
         * @return routerInterfaceId
         */
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        /**
         * @return routerType
         */
        public String getRouterType() {
            return this.routerType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accessPointId; 
            private String businessStatus; 
            private String chargeType; 
            private String connectedTime; 
            private String creationTime; 
            private String description; 
            private String endTime; 
            private String healthCheckSourceIp; 
            private String healthCheckTargetIp; 
            private String name; 
            private String oppositeAccessPointId; 
            private String oppositeInterfaceBusinessStatus; 
            private String oppositeInterfaceId; 
            private String oppositeInterfaceOwnerId; 
            private String oppositeInterfaceSpec; 
            private String oppositeInterfaceStatus; 
            private String oppositeRegionId; 
            private String oppositeRouterId; 
            private String oppositeRouterType; 
            private String role; 
            private String routerId; 
            private String routerInterfaceId; 
            private String routerType; 
            private String spec; 
            private String status; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * BusinessStatus.
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ConnectedTime.
             */
            public Builder connectedTime(String connectedTime) {
                this.connectedTime = connectedTime;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HealthCheckSourceIp.
             */
            public Builder healthCheckSourceIp(String healthCheckSourceIp) {
                this.healthCheckSourceIp = healthCheckSourceIp;
                return this;
            }

            /**
             * HealthCheckTargetIp.
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
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
             * OppositeAccessPointId.
             */
            public Builder oppositeAccessPointId(String oppositeAccessPointId) {
                this.oppositeAccessPointId = oppositeAccessPointId;
                return this;
            }

            /**
             * OppositeInterfaceBusinessStatus.
             */
            public Builder oppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
                this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
                return this;
            }

            /**
             * OppositeInterfaceId.
             */
            public Builder oppositeInterfaceId(String oppositeInterfaceId) {
                this.oppositeInterfaceId = oppositeInterfaceId;
                return this;
            }

            /**
             * OppositeInterfaceOwnerId.
             */
            public Builder oppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
                this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
                return this;
            }

            /**
             * OppositeInterfaceSpec.
             */
            public Builder oppositeInterfaceSpec(String oppositeInterfaceSpec) {
                this.oppositeInterfaceSpec = oppositeInterfaceSpec;
                return this;
            }

            /**
             * OppositeInterfaceStatus.
             */
            public Builder oppositeInterfaceStatus(String oppositeInterfaceStatus) {
                this.oppositeInterfaceStatus = oppositeInterfaceStatus;
                return this;
            }

            /**
             * OppositeRegionId.
             */
            public Builder oppositeRegionId(String oppositeRegionId) {
                this.oppositeRegionId = oppositeRegionId;
                return this;
            }

            /**
             * OppositeRouterId.
             */
            public Builder oppositeRouterId(String oppositeRouterId) {
                this.oppositeRouterId = oppositeRouterId;
                return this;
            }

            /**
             * OppositeRouterType.
             */
            public Builder oppositeRouterType(String oppositeRouterType) {
                this.oppositeRouterType = oppositeRouterType;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * RouterId.
             */
            public Builder routerId(String routerId) {
                this.routerId = routerId;
                return this;
            }

            /**
             * RouterInterfaceId.
             */
            public Builder routerInterfaceId(String routerInterfaceId) {
                this.routerInterfaceId = routerInterfaceId;
                return this;
            }

            /**
             * RouterType.
             */
            public Builder routerType(String routerType) {
                this.routerType = routerType;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RouterInterfaceType build() {
                return new RouterInterfaceType(this);
            } 

        } 

    }
    public static class RouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        private java.util.List < RouterInterfaceType> routerInterfaceType;

        private RouterInterfaceSet(Builder builder) {
            this.routerInterfaceType = builder.routerInterfaceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouterInterfaceSet create() {
            return builder().build();
        }

        /**
         * @return routerInterfaceType
         */
        public java.util.List < RouterInterfaceType> getRouterInterfaceType() {
            return this.routerInterfaceType;
        }

        public static final class Builder {
            private java.util.List < RouterInterfaceType> routerInterfaceType; 

            /**
             * RouterInterfaceType.
             */
            public Builder routerInterfaceType(java.util.List < RouterInterfaceType> routerInterfaceType) {
                this.routerInterfaceType = routerInterfaceType;
                return this;
            }

            public RouterInterfaceSet build() {
                return new RouterInterfaceSet(this);
            } 

        } 

    }
}
