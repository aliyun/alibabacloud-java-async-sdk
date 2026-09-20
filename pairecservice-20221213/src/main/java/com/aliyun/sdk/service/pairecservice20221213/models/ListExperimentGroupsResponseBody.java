// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListExperimentGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentGroupsResponseBody</p>
 */
public class ListExperimentGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExperimentGroups")
    private java.util.List<ExperimentGroups> experimentGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentGroupsResponseBody(Builder builder) {
        this.experimentGroups = builder.experimentGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroups
     */
    public java.util.List<ExperimentGroups> getExperimentGroups() {
        return this.experimentGroups;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ExperimentGroups> experimentGroups; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExperimentGroupsResponseBody model) {
            this.experimentGroups = model.experimentGroups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of experiment groups.</p>
         */
        public Builder experimentGroups(java.util.List<ExperimentGroups> experimentGroups) {
            this.experimentGroups = experimentGroups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExperimentGroupsResponseBody build() {
            return new ListExperimentGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentGroupsResponseBody</p>
     */
    public static class ExperimentGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CrowdId")
        private String crowdId;

        @com.aliyun.core.annotation.NameInMap("CrowdTargetType")
        private String crowdTargetType;

        @com.aliyun.core.annotation.NameInMap("DebugCrowdId")
        private String debugCrowdId;

        @com.aliyun.core.annotation.NameInMap("DebugUsers")
        private String debugUsers;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DistributionTimeDuration")
        private Integer distributionTimeDuration;

        @com.aliyun.core.annotation.NameInMap("DistributionType")
        private String distributionType;

        @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
        private String experimentGroupId;

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("HoldingBuckets")
        private String holdingBuckets;

        @com.aliyun.core.annotation.NameInMap("LaboratoryId")
        private String laboratoryId;

        @com.aliyun.core.annotation.NameInMap("LayerId")
        private String layerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedAA")
        private Boolean needAA;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RandomFlow")
        private Long randomFlow;

        @com.aliyun.core.annotation.NameInMap("ReservedBuckets")
        private String reservedBuckets;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ExperimentGroups(Builder builder) {
            this.config = builder.config;
            this.crowdId = builder.crowdId;
            this.crowdTargetType = builder.crowdTargetType;
            this.debugCrowdId = builder.debugCrowdId;
            this.debugUsers = builder.debugUsers;
            this.description = builder.description;
            this.distributionTimeDuration = builder.distributionTimeDuration;
            this.distributionType = builder.distributionType;
            this.experimentGroupId = builder.experimentGroupId;
            this.filter = builder.filter;
            this.holdingBuckets = builder.holdingBuckets;
            this.laboratoryId = builder.laboratoryId;
            this.layerId = builder.layerId;
            this.name = builder.name;
            this.needAA = builder.needAA;
            this.owner = builder.owner;
            this.randomFlow = builder.randomFlow;
            this.reservedBuckets = builder.reservedBuckets;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExperimentGroups create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return crowdId
         */
        public String getCrowdId() {
            return this.crowdId;
        }

        /**
         * @return crowdTargetType
         */
        public String getCrowdTargetType() {
            return this.crowdTargetType;
        }

        /**
         * @return debugCrowdId
         */
        public String getDebugCrowdId() {
            return this.debugCrowdId;
        }

        /**
         * @return debugUsers
         */
        public String getDebugUsers() {
            return this.debugUsers;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return distributionTimeDuration
         */
        public Integer getDistributionTimeDuration() {
            return this.distributionTimeDuration;
        }

        /**
         * @return distributionType
         */
        public String getDistributionType() {
            return this.distributionType;
        }

        /**
         * @return experimentGroupId
         */
        public String getExperimentGroupId() {
            return this.experimentGroupId;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return holdingBuckets
         */
        public String getHoldingBuckets() {
            return this.holdingBuckets;
        }

        /**
         * @return laboratoryId
         */
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        /**
         * @return layerId
         */
        public String getLayerId() {
            return this.layerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needAA
         */
        public Boolean getNeedAA() {
            return this.needAA;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return randomFlow
         */
        public Long getRandomFlow() {
            return this.randomFlow;
        }

        /**
         * @return reservedBuckets
         */
        public String getReservedBuckets() {
            return this.reservedBuckets;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String config; 
            private String crowdId; 
            private String crowdTargetType; 
            private String debugCrowdId; 
            private String debugUsers; 
            private String description; 
            private Integer distributionTimeDuration; 
            private String distributionType; 
            private String experimentGroupId; 
            private String filter; 
            private String holdingBuckets; 
            private String laboratoryId; 
            private String layerId; 
            private String name; 
            private Boolean needAA; 
            private String owner; 
            private Long randomFlow; 
            private String reservedBuckets; 
            private String sceneId; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExperimentGroups model) {
                this.config = model.config;
                this.crowdId = model.crowdId;
                this.crowdTargetType = model.crowdTargetType;
                this.debugCrowdId = model.debugCrowdId;
                this.debugUsers = model.debugUsers;
                this.description = model.description;
                this.distributionTimeDuration = model.distributionTimeDuration;
                this.distributionType = model.distributionType;
                this.experimentGroupId = model.experimentGroupId;
                this.filter = model.filter;
                this.holdingBuckets = model.holdingBuckets;
                this.laboratoryId = model.laboratoryId;
                this.layerId = model.layerId;
                this.name = model.name;
                this.needAA = model.needAA;
                this.owner = model.owner;
                this.randomFlow = model.randomFlow;
                this.reservedBuckets = model.reservedBuckets;
                this.sceneId = model.sceneId;
                this.status = model.status;
            } 

            /**
             * <p>The configuration for the experiment group, in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The crowd ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder crowdId(String crowdId) {
                this.crowdId = crowdId;
                return this;
            }

            /**
             * <p>The traffic targeting method for the experiment group. Valid values:</p>
             * <ul>
             * <li><p><code>All</code>: All traffic.</p>
             * </li>
             * <li><p><code>Filter</code>: Traffic that matches the filter.</p>
             * </li>
             * <li><p><code>CrowdId</code>: Traffic from a specified crowd.</p>
             * </li>
             * <li><p><code>Random</code>: A random percentage of traffic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
             */
            public Builder crowdTargetType(String crowdTargetType) {
                this.crowdTargetType = crowdTargetType;
                return this;
            }

            /**
             * <p>The debug crowd ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder debugCrowdId(String debugCrowdId) {
                this.debugCrowdId = debugCrowdId;
                return this;
            }

            /**
             * <p>The IDs of debug users, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>1124512470******,1124512471******,1124512472******</p>
             */
            public Builder debugUsers(String debugUsers) {
                this.debugUsers = debugUsers;
                return this;
            }

            /**
             * <p>The experiment group description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a test.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The distribution duration. This parameter is required only when <code>DistributionType</code> is <code>TimeDuration</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder distributionTimeDuration(Integer distributionTimeDuration) {
                this.distributionTimeDuration = distributionTimeDuration;
                return this;
            }

            /**
             * <p>The traffic distribution method.<br>● <code>UserId</code>: by user ID<br>● <code>TimeDuration</code>: by time duration<br><br></p>
             * 
             * <strong>example:</strong>
             * <p>UserId</p>
             */
            public Builder distributionType(String distributionType) {
                this.distributionType = distributionType;
                return this;
            }

            /**
             * <p>The experiment group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder experimentGroupId(String experimentGroupId) {
                this.experimentGroupId = experimentGroupId;
                return this;
            }

            /**
             * <p>The filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>gender=female</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>If <code>CrowdTargetType</code> is set to <code>Random</code>, this parameter returns the comma-separated IDs of buckets allocated based on the <code>RandomFlow</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2,3,4</p>
             */
            public Builder holdingBuckets(String holdingBuckets) {
                this.holdingBuckets = holdingBuckets;
                return this;
            }

            /**
             * <p>The laboratory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder laboratoryId(String laboratoryId) {
                this.laboratoryId = laboratoryId;
                return this;
            }

            /**
             * <p>The layer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder layerId(String layerId) {
                this.layerId = layerId;
                return this;
            }

            /**
             * <p>The experiment group name.</p>
             * 
             * <strong>example:</strong>
             * <p>experiment_group1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to enable A/B testing for the experiment group.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needAA(Boolean needAA) {
                this.needAA = needAA;
                return this;
            }

            /**
             * <p>The owner of the experiment group.</p>
             * 
             * <strong>example:</strong>
             * <p>1124512470******</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>If <code>CrowdTargetType</code> is set to <code>Random</code>, this parameter specifies the percentage of traffic (an integer from 0 to 100) randomly allocated to the experiment group.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder randomFlow(Long randomFlow) {
                this.randomFlow = randomFlow;
                return this;
            }

            /**
             * <p>The IDs of reserved buckets, separated by commas.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2,3,4</p>
             */
            public Builder reservedBuckets(String reservedBuckets) {
                this.reservedBuckets = reservedBuckets;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The status of the experiment group. Valid values:<br>● <code>Offline</code>: The experiment group is inactive.<br>● <code>Online</code>: The experiment group is active.<br>● <code>Pushed</code>: The experiment group is fully rolled out.<br><br><br></p>
             * 
             * <strong>example:</strong>
             * <p>Offline</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExperimentGroups build() {
                return new ExperimentGroups(this);
            } 

        } 

    }
}
