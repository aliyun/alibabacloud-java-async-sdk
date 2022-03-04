// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetsResponseBody</p>
 */
public class DescribeDeploymentSetsResponseBody extends TeaModel {
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

    @NameInMap("DeploymentSets")
    private DeploymentSets deploymentSets;

    private DescribeDeploymentSetsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.regionId = builder.regionId;
        this.deploymentSets = builder.deploymentSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentSetsResponseBody create() {
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
     * @return deploymentSets
     */
    public DeploymentSets getDeploymentSets() {
        return this.deploymentSets;
    }

    public static final class Builder {
        private Integer pageSize; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 
        private String regionId; 
        private DeploymentSets deploymentSets; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of pages in the deployment set list.
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
         * The total number of queried deployment sets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The region ID of the deployment set.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Returns the deployment set details in an array of DeploymentSet.
         */
        public Builder deploymentSets(DeploymentSets deploymentSets) {
            this.deploymentSets = deploymentSets;
            return this;
        }

        public DescribeDeploymentSetsResponseBody build() {
            return new DescribeDeploymentSetsResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        private java.util.List < String > instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List < String > getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List < String > instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List < String > instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    public static class Capacity extends TeaModel {
        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("UsedAmount")
        private Integer usedAmount;

        @NameInMap("AvailableAmount")
        private Integer availableAmount;

        private Capacity(Builder builder) {
            this.zoneId = builder.zoneId;
            this.usedAmount = builder.usedAmount;
            this.availableAmount = builder.availableAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
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
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public static final class Builder {
            private String zoneId; 
            private Integer usedAmount; 
            private Integer availableAmount; 

            /**
             * The ID of the zone. Only the zone ID of the ECS instance in the deployment set is returned.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The number of ECS instances in the deployment set that belong to the zone.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * The number of ECS instances that can be added to the current deployment set in the zone.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    public static class Capacities extends TeaModel {
        @NameInMap("Capacity")
        private java.util.List < Capacity> capacity;

        private Capacities(Builder builder) {
            this.capacity = builder.capacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacities create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public java.util.List < Capacity> getCapacity() {
            return this.capacity;
        }

        public static final class Builder {
            private java.util.List < Capacity> capacity; 

            /**
             * Capacity.
             */
            public Builder capacity(java.util.List < Capacity> capacity) {
                this.capacity = capacity;
                return this;
            }

            public Capacities build() {
                return new Capacities(this);
            } 

        } 

    }
    public static class DeploymentSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Strategy")
        private String strategy;

        @NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @NameInMap("DeploymentStrategy")
        private String deploymentStrategy;

        @NameInMap("DeploymentSetDescription")
        private String deploymentSetDescription;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("GroupCount")
        private Integer groupCount;

        @NameInMap("Granularity")
        private String granularity;

        @NameInMap("DeploymentSetName")
        private String deploymentSetName;

        @NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        @NameInMap("Capacities")
        private Capacities capacities;

        private DeploymentSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.strategy = builder.strategy;
            this.deploymentSetId = builder.deploymentSetId;
            this.deploymentStrategy = builder.deploymentStrategy;
            this.deploymentSetDescription = builder.deploymentSetDescription;
            this.domain = builder.domain;
            this.groupCount = builder.groupCount;
            this.granularity = builder.granularity;
            this.deploymentSetName = builder.deploymentSetName;
            this.instanceAmount = builder.instanceAmount;
            this.instanceIds = builder.instanceIds;
            this.capacities = builder.capacities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return deploymentStrategy
         */
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        /**
         * @return deploymentSetDescription
         */
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return deploymentSetName
         */
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        /**
         * @return instanceAmount
         */
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceIds
         */
        public InstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return capacities
         */
        public Capacities getCapacities() {
            return this.capacities;
        }

        public static final class Builder {
            private String creationTime; 
            private String strategy; 
            private String deploymentSetId; 
            private String deploymentStrategy; 
            private String deploymentSetDescription; 
            private String domain; 
            private Integer groupCount; 
            private String granularity; 
            private String deploymentSetName; 
            private Integer instanceAmount; 
            private InstanceIds instanceIds; 
            private Capacities capacities; 

            /**
             * The time when the deployment set was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The deployment policy.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * The deployment policy. The returned value corresponds to the value of the request parameter "stratege.
             */
            public Builder deploymentStrategy(String deploymentStrategy) {
                this.deploymentStrategy = deploymentStrategy;
                return this;
            }

            /**
             * The description of the deployment set.
             */
            public Builder deploymentSetDescription(String deploymentSetDescription) {
                this.deploymentSetDescription = deploymentSetDescription;
                return this;
            }

            /**
             * The deployment domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The number of groups in the deployment set.
             * <p>
             * 
             * > This value takes effect when the deployment set policy is set to AvailabilityGroup.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The deployment granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * The name of the deployment set.
             */
            public Builder deploymentSetName(String deploymentSetName) {
                this.deploymentSetName = deploymentSetName;
                return this;
            }

            /**
             * The number of instances in the deployment set.
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * An array consisting of Capacity. The response is provided only when there are existing ECS instances in the deployment set. The response contains the capacity information of the deployment set zone dimension.
             */
            public Builder capacities(Capacities capacities) {
                this.capacities = capacities;
                return this;
            }

            public DeploymentSet build() {
                return new DeploymentSet(this);
            } 

        } 

    }
    public static class DeploymentSets extends TeaModel {
        @NameInMap("DeploymentSet")
        private java.util.List < DeploymentSet> deploymentSet;

        private DeploymentSets(Builder builder) {
            this.deploymentSet = builder.deploymentSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentSets create() {
            return builder().build();
        }

        /**
         * @return deploymentSet
         */
        public java.util.List < DeploymentSet> getDeploymentSet() {
            return this.deploymentSet;
        }

        public static final class Builder {
            private java.util.List < DeploymentSet> deploymentSet; 

            /**
             * DeploymentSet.
             */
            public Builder deploymentSet(java.util.List < DeploymentSet> deploymentSet) {
                this.deploymentSet = deploymentSet;
                return this;
            }

            public DeploymentSets build() {
                return new DeploymentSets(this);
            } 

        } 

    }
}
