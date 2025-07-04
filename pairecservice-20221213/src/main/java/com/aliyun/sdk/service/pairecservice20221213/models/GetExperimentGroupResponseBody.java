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
 * {@link GetExperimentGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentGroupResponseBody</p>
 */
public class GetExperimentGroupResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReservedBuckets")
    private String reservedBuckets;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetExperimentGroupResponseBody(Builder builder) {
        this.config = builder.config;
        this.crowdId = builder.crowdId;
        this.crowdTargetType = builder.crowdTargetType;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.distributionTimeDuration = builder.distributionTimeDuration;
        this.distributionType = builder.distributionType;
        this.filter = builder.filter;
        this.holdingBuckets = builder.holdingBuckets;
        this.laboratoryId = builder.laboratoryId;
        this.layerId = builder.layerId;
        this.name = builder.name;
        this.needAA = builder.needAA;
        this.owner = builder.owner;
        this.randomFlow = builder.randomFlow;
        this.requestId = builder.requestId;
        this.reservedBuckets = builder.reservedBuckets;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String filter; 
        private String holdingBuckets; 
        private String laboratoryId; 
        private String layerId; 
        private String name; 
        private Boolean needAA; 
        private String owner; 
        private Long randomFlow; 
        private String requestId; 
        private String reservedBuckets; 
        private String sceneId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetExperimentGroupResponseBody model) {
            this.config = model.config;
            this.crowdId = model.crowdId;
            this.crowdTargetType = model.crowdTargetType;
            this.debugCrowdId = model.debugCrowdId;
            this.debugUsers = model.debugUsers;
            this.description = model.description;
            this.distributionTimeDuration = model.distributionTimeDuration;
            this.distributionType = model.distributionType;
            this.filter = model.filter;
            this.holdingBuckets = model.holdingBuckets;
            this.laboratoryId = model.laboratoryId;
            this.layerId = model.layerId;
            this.name = model.name;
            this.needAA = model.needAA;
            this.owner = model.owner;
            this.randomFlow = model.randomFlow;
            this.requestId = model.requestId;
            this.reservedBuckets = model.reservedBuckets;
            this.sceneId = model.sceneId;
            this.status = model.status;
        } 

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
         * CrowdTargetType.
         */
        public Builder crowdTargetType(String crowdTargetType) {
            this.crowdTargetType = crowdTargetType;
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
         * Filter.
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * HoldingBuckets.
         */
        public Builder holdingBuckets(String holdingBuckets) {
            this.holdingBuckets = holdingBuckets;
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
         * RandomFlow.
         */
        public Builder randomFlow(Long randomFlow) {
            this.randomFlow = randomFlow;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BDB621CB-A81E-5D39-8793-39A365CBCC74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetExperimentGroupResponseBody build() {
            return new GetExperimentGroupResponseBody(this);
        } 

    } 

}
