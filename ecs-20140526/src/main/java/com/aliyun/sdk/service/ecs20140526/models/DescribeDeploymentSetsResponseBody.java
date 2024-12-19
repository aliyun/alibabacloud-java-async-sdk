// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>Details about the deployment sets.</p>
         */
        public Builder deploymentSets(DeploymentSets deploymentSets) {
            this.deploymentSets = deploymentSets;
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
         * <p>1</p>
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
         * <p>The total number of queried deployment sets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDeploymentSetsResponseBody build() {
            return new DescribeDeploymentSetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentSetsResponseBody</p>
     */
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
             * <p>The number of ECS instances that can be added to the deployment set within the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder availableAmount(Integer availableAmount) {
                this.availableAmount = availableAmount;
                return this;
            }

            /**
             * <p>The number of ECS instances that reside in the zone in the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usedAmount(Integer usedAmount) {
                this.usedAmount = usedAmount;
                return this;
            }

            /**
             * <p>The ID of the zone. Only the zone IDs of existing ECS instances in the deployment set are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentSetsResponseBody</p>
     */
    public static class Capacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private java.util.List<Capacity> capacity;

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
        public java.util.List<Capacity> getCapacity() {
            return this.capacity;
        }

        public static final class Builder {
            private java.util.List<Capacity> capacity; 

            /**
             * Capacity.
             */
            public Builder capacity(java.util.List<Capacity> capacity) {
                this.capacity = capacity;
                return this;
            }

            public Capacities build() {
                return new Capacities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentSetsResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

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
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentSetsResponseBody</p>
     */
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
             * <p>Details of the capacities of the deployment set. This parameter is valid only when the deployment set contains ECS instances. The value contains information about the capacities of the deployment set in different zones.</p>
             */
            public Builder capacities(Capacities capacities) {
                this.capacities = capacities;
                return this;
            }

            /**
             * <p>The time when the deployment set was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-07T06:01:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>testDeploymentSetDescription</p>
             */
            public Builder deploymentSetDescription(String deploymentSetDescription) {
                this.deploymentSetDescription = deploymentSetDescription;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp67acfmxazb4ph****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>The name of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>testDeploymentSetName</p>
             */
            public Builder deploymentSetName(String deploymentSetName) {
                this.deploymentSetName = deploymentSetName;
                return this;
            }

            /**
             * <p>The deployment strategy. The return value of this parameter is the value of the <code>Strategy</code> request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Availability</p>
             */
            public Builder deploymentStrategy(String deploymentStrategy) {
                this.deploymentStrategy = deploymentStrategy;
                return this;
            }

            /**
             * <p>The deployment domain.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The deployment granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The number of deployment set groups in the deployment set.</p>
             * <blockquote>
             * <p> This parameter is valid only when the Strategy request parameter is set to AvailabilityGroup.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>The number of instances in the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder instanceAmount(Integer instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * <p>The IDs of the Elastic Compute Service (ECS) instances in the deployment set.</p>
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The deployment strategy.</p>
             * 
             * <strong>example:</strong>
             * <p>LooseDispersion</p>
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
    /**
     * 
     * {@link DescribeDeploymentSetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeploymentSetsResponseBody</p>
     */
    public static class DeploymentSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentSet")
        private java.util.List<DeploymentSet> deploymentSet;

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
        public java.util.List<DeploymentSet> getDeploymentSet() {
            return this.deploymentSet;
        }

        public static final class Builder {
            private java.util.List<DeploymentSet> deploymentSet; 

            /**
             * DeploymentSet.
             */
            public Builder deploymentSet(java.util.List<DeploymentSet> deploymentSet) {
                this.deploymentSet = deploymentSet;
                return this;
            }

            public DeploymentSets build() {
                return new DeploymentSets(this);
            } 

        } 

    }
}
