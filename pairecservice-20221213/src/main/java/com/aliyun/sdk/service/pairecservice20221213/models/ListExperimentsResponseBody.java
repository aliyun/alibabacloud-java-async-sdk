// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentsResponseBody</p>
 */
public class ListExperimentsResponseBody extends TeaModel {
    @NameInMap("Experiments")
    private java.util.List < Experiments> experiments;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentsResponseBody(Builder builder) {
        this.experiments = builder.experiments;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return experiments
     */
    public java.util.List < Experiments> getExperiments() {
        return this.experiments;
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
        private java.util.List < Experiments> experiments; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Experiments.
         */
        public Builder experiments(java.util.List < Experiments> experiments) {
            this.experiments = experiments;
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

        public ListExperimentsResponseBody build() {
            return new ListExperimentsResponseBody(this);
        } 

    } 

    public static class Experiments extends TeaModel {
        @NameInMap("AliasExperimentId")
        private String aliasExperimentId;

        @NameInMap("Buckets")
        private String buckets;

        @NameInMap("Config")
        private String config;

        @NameInMap("DebugCrowdId")
        private String debugCrowdId;

        @NameInMap("DebugUsers")
        private String debugUsers;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExperimentGroupId")
        private String experimentGroupId;

        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("FlowPercent")
        private Integer flowPercent;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("LaboratoryId")
        private String laboratoryId;

        @NameInMap("LayerId")
        private String layerId;

        @NameInMap("Name")
        private String name;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Experiments(Builder builder) {
            this.aliasExperimentId = builder.aliasExperimentId;
            this.buckets = builder.buckets;
            this.config = builder.config;
            this.debugCrowdId = builder.debugCrowdId;
            this.debugUsers = builder.debugUsers;
            this.description = builder.description;
            this.experimentGroupId = builder.experimentGroupId;
            this.experimentId = builder.experimentId;
            this.flowPercent = builder.flowPercent;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.laboratoryId = builder.laboratoryId;
            this.layerId = builder.layerId;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Experiments create() {
            return builder().build();
        }

        /**
         * @return aliasExperimentId
         */
        public String getAliasExperimentId() {
            return this.aliasExperimentId;
        }

        /**
         * @return buckets
         */
        public String getBuckets() {
            return this.buckets;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
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
         * @return experimentGroupId
         */
        public String getExperimentGroupId() {
            return this.experimentGroupId;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return flowPercent
         */
        public Integer getFlowPercent() {
            return this.flowPercent;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasExperimentId; 
            private String buckets; 
            private String config; 
            private String debugCrowdId; 
            private String debugUsers; 
            private String description; 
            private String experimentGroupId; 
            private String experimentId; 
            private Integer flowPercent; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String laboratoryId; 
            private String layerId; 
            private String name; 
            private String sceneId; 
            private String status; 
            private String type; 

            /**
             * AliasExperimentId.
             */
            public Builder aliasExperimentId(String aliasExperimentId) {
                this.aliasExperimentId = aliasExperimentId;
                return this;
            }

            /**
             * Buckets.
             */
            public Builder buckets(String buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
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
             * ExperimentGroupId.
             */
            public Builder experimentGroupId(String experimentGroupId) {
                this.experimentGroupId = experimentGroupId;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * FlowPercent.
             */
            public Builder flowPercent(Integer flowPercent) {
                this.flowPercent = flowPercent;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Experiments build() {
                return new Experiments(this);
            } 

        } 

    }
}
