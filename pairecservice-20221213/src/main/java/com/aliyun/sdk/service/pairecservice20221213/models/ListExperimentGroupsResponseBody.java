// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExperimentGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentGroupsResponseBody</p>
 */
public class ListExperimentGroupsResponseBody extends TeaModel {
    @NameInMap("ExperimentGroups")
    private java.util.List < ExperimentGroups> experimentGroups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return experimentGroups
     */
    public java.util.List < ExperimentGroups> getExperimentGroups() {
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
        private java.util.List < ExperimentGroups> experimentGroups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * ExperimentGroups.
         */
        public Builder experimentGroups(java.util.List < ExperimentGroups> experimentGroups) {
            this.experimentGroups = experimentGroups;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExperimentGroupsResponseBody build() {
            return new ListExperimentGroupsResponseBody(this);
        } 

    } 

    public static class ExperimentGroups extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("CrowdId")
        private String crowdId;

        @NameInMap("DebugCrowdId")
        private String debugCrowdId;

        @NameInMap("DebugUsers")
        private String debugUsers;

        @NameInMap("Description")
        private String description;

        @NameInMap("DistributionTimeDuration")
        private Integer distributionTimeDuration;

        @NameInMap("DistributionType")
        private String distributionType;

        @NameInMap("ExperimentGroupId")
        private String experimentGroupId;

        @NameInMap("Filter")
        private String filter;

        @NameInMap("LaboratoryId")
        private String laboratoryId;

        @NameInMap("LayerId")
        private String layerId;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedAA")
        private Boolean needAA;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ReservedBuckets")
        private String reservedBuckets;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("Status")
        private String status;

        private ExperimentGroups(Builder builder) {
            this.config = builder.config;
            this.crowdId = builder.crowdId;
            this.debugCrowdId = builder.debugCrowdId;
            this.debugUsers = builder.debugUsers;
            this.description = builder.description;
            this.distributionTimeDuration = builder.distributionTimeDuration;
            this.distributionType = builder.distributionType;
            this.experimentGroupId = builder.experimentGroupId;
            this.filter = builder.filter;
            this.laboratoryId = builder.laboratoryId;
            this.layerId = builder.layerId;
            this.name = builder.name;
            this.needAA = builder.needAA;
            this.owner = builder.owner;
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
            private String debugCrowdId; 
            private String debugUsers; 
            private String description; 
            private Integer distributionTimeDuration; 
            private String distributionType; 
            private String experimentGroupId; 
            private String filter; 
            private String laboratoryId; 
            private String layerId; 
            private String name; 
            private Boolean needAA; 
            private String owner; 
            private String reservedBuckets; 
            private String sceneId; 
            private String status; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CrowdId.
             */
            public Builder crowdId(String crowdId) {
                this.crowdId = crowdId;
                return this;
            }

            /**
             * DebugCrowdId.
             */
            public Builder debugCrowdId(String debugCrowdId) {
                this.debugCrowdId = debugCrowdId;
                return this;
            }

            /**
             * DebugUsers.
             */
            public Builder debugUsers(String debugUsers) {
                this.debugUsers = debugUsers;
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
             * DistributionTimeDuration.
             */
            public Builder distributionTimeDuration(Integer distributionTimeDuration) {
                this.distributionTimeDuration = distributionTimeDuration;
                return this;
            }

            /**
             * DistributionType.
             */
            public Builder distributionType(String distributionType) {
                this.distributionType = distributionType;
                return this;
            }

            /**
             * ExperimentGroupId.
             */
            public Builder experimentGroupId(String experimentGroupId) {
                this.experimentGroupId = experimentGroupId;
                return this;
            }

            /**
             * Filter.
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * LaboratoryId.
             */
            public Builder laboratoryId(String laboratoryId) {
                this.laboratoryId = laboratoryId;
                return this;
            }

            /**
             * LayerId.
             */
            public Builder layerId(String layerId) {
                this.layerId = layerId;
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
             * NeedAA.
             */
            public Builder needAA(Boolean needAA) {
                this.needAA = needAA;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ReservedBuckets.
             */
            public Builder reservedBuckets(String reservedBuckets) {
                this.reservedBuckets = reservedBuckets;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * Status.
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
