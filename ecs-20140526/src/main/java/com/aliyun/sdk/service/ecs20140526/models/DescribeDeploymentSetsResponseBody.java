// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeploymentSetsResponseBody</p>
 */
public class DescribeDeploymentSetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentSets")
    private DeploymentSets deploymentSets;

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

    private DescribeDeploymentSetsResponseBody(Builder builder) {
        this.deploymentSets = builder.deploymentSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeploymentSetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentSets
     */
    public DeploymentSets getDeploymentSets() {
        return this.deploymentSets;
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
        private DeploymentSets deploymentSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the deployment sets.
         */
        public Builder deploymentSets(DeploymentSets deploymentSets) {
            this.deploymentSets = deploymentSets;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of deployment sets returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeploymentSetsResponseBody build() {
            return new DescribeDeploymentSetsResponseBody(this);
        } 

    } 

    public static class Capacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableAmount")
        private Integer availableAmount;

        @com.aliyun.core.annotation.NameInMap("UsedAmount")
        private Integer usedAmount;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Capacity(Builder builder) {
            this.availableAmount = builder.availableAmount;
            this.usedAmount = builder.usedAmount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacity create() {
            return builder().build();
        }

        /**
         * @return availableAmount
         */
        public Integer getAvailableAmount() {
            return this.availableAmount;
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
            private Integer usedAmount; 
            private String zoneId; 

            /**
             * The number of ECS instances that can be added to the deployment set within the zone.
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * The number of ECS instances that belong to the zone in the deployment set.
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * The ID of the zone. Only the zone IDs of existing ECS instances in the deployment set are returned.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Capacity build() {
                return new Capacity(this);
            } 

        } 

    }
    public static class Capacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
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
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
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
    public static class DeploymentSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacities")
        private Capacities capacities;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetDescription")
        private String deploymentSetDescription;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetName")
        private String deploymentSetName;

        @com.aliyun.core.annotation.NameInMap("DeploymentStrategy")
        private String deploymentStrategy;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("InstanceAmount")
        private Integer instanceAmount;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private DeploymentSet(Builder builder) {
            this.capacities = builder.capacities;
            this.creationTime = builder.creationTime;
            this.deploymentSetDescription = builder.deploymentSetDescription;
            this.deploymentSetId = builder.deploymentSetId;
            this.deploymentSetName = builder.deploymentSetName;
            this.deploymentStrategy = builder.deploymentStrategy;
            this.domain = builder.domain;
            this.granularity = builder.granularity;
            this.groupCount = builder.groupCount;
            this.instanceAmount = builder.instanceAmount;
            this.instanceIds = builder.instanceIds;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentSet create() {
            return builder().build();
        }

        /**
         * @return capacities
         */
        public Capacities getCapacities() {
            return this.capacities;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deploymentSetDescription
         */
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return deploymentSetName
         */
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        /**
         * @return deploymentStrategy
         */
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
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
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Capacities capacities; 
            private String creationTime; 
            private String deploymentSetDescription; 
            private String deploymentSetId; 
            private String deploymentSetName; 
            private String deploymentStrategy; 
            private String domain; 
            private String granularity; 
            private Integer groupCount; 
            private Integer instanceAmount; 
            private InstanceIds instanceIds; 
            private String strategy; 

            /**
             * Details of the capacities of the deployment set. This parameter is valid only when the deployment set contains Elastic Compute Service (ECS) instances. The value contains the capacities of the deployment set in different zones.
             */
            public Builder capacities(Capacities capacities) {
                this.capacities = capacities;
                return this;
            }

            /**
             * The time when the deployment set was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The ID of the deployment set.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
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
             * The deployment strategy. The value of this response parameter is that of the `Strategy` request parameter.
             */
            public Builder deploymentStrategy(String deploymentStrategy) {
                this.deploymentStrategy = deploymentStrategy;
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
             * The deployment granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * The number of deployment set groups in the deployment set.
             * <p>
             * 
             * >  This parameter is valid only when the Strategy request parameter is set to AvailabilityGroup.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
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
             * The IDs of the instances in the deployment set.
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * The deployment strategy.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public DeploymentSet build() {
                return new DeploymentSet(this);
            } 

        } 

    }
    public static class DeploymentSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentSet")
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
