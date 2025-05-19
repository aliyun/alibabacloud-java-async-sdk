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
 * {@link UpdateExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateExperimentGroupRequest</p>
 */
public class UpdateExperimentGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String experimentGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    private String crowdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CrowdTargetType")
    private String crowdTargetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributionTimeDuration")
    private Integer distributionTimeDuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributionType")
    private String distributionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LayerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String layerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedAA")
    private Boolean needAA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RandomFlow")
    private Long randomFlow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservcedBuckets")
    private String reservcedBuckets;

    private UpdateExperimentGroupRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.crowdId = builder.crowdId;
        this.crowdTargetType = builder.crowdTargetType;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.distributionTimeDuration = builder.distributionTimeDuration;
        this.distributionType = builder.distributionType;
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.layerId = builder.layerId;
        this.name = builder.name;
        this.needAA = builder.needAA;
        this.randomFlow = builder.randomFlow;
        this.reservcedBuckets = builder.reservcedBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return randomFlow
     */
    public Long getRandomFlow() {
        return this.randomFlow;
    }

    /**
     * @return reservcedBuckets
     */
    public String getReservcedBuckets() {
        return this.reservcedBuckets;
    }

    public static final class Builder extends Request.Builder<UpdateExperimentGroupRequest, Builder> {
        private String experimentGroupId; 
        private String regionId; 
        private String config; 
        private String crowdId; 
        private String crowdTargetType; 
        private String debugCrowdId; 
        private String debugUsers; 
        private String description; 
        private Integer distributionTimeDuration; 
        private String distributionType; 
        private String filter; 
        private String instanceId; 
        private String layerId; 
        private String name; 
        private Boolean needAA; 
        private Long randomFlow; 
        private String reservcedBuckets; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExperimentGroupRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.crowdId = request.crowdId;
            this.crowdTargetType = request.crowdTargetType;
            this.debugCrowdId = request.debugCrowdId;
            this.debugUsers = request.debugUsers;
            this.description = request.description;
            this.distributionTimeDuration = request.distributionTimeDuration;
            this.distributionType = request.distributionType;
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.layerId = request.layerId;
            this.name = request.name;
            this.needAA = request.needAA;
            this.randomFlow = request.randomFlow;
            this.reservcedBuckets = request.reservcedBuckets;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putPathParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putBodyParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
        }

        /**
         * CrowdTargetType.
         */
        public Builder crowdTargetType(String crowdTargetType) {
            this.putBodyParameter("CrowdTargetType", crowdTargetType);
            this.crowdTargetType = crowdTargetType;
            return this;
        }

        /**
         * DebugCrowdId.
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.putBodyParameter("DebugCrowdId", debugCrowdId);
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.putBodyParameter("DebugUsers", debugUsers);
            this.debugUsers = debugUsers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DistributionTimeDuration.
         */
        public Builder distributionTimeDuration(Integer distributionTimeDuration) {
            this.putBodyParameter("DistributionTimeDuration", distributionTimeDuration);
            this.distributionTimeDuration = distributionTimeDuration;
            return this;
        }

        /**
         * DistributionType.
         */
        public Builder distributionType(String distributionType) {
            this.putBodyParameter("DistributionType", distributionType);
            this.distributionType = distributionType;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-abcdefg1234</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder layerId(String layerId) {
            this.putBodyParameter("LayerId", layerId);
            this.layerId = layerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>experiment_group1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NeedAA.
         */
        public Builder needAA(Boolean needAA) {
            this.putBodyParameter("NeedAA", needAA);
            this.needAA = needAA;
            return this;
        }

        /**
         * RandomFlow.
         */
        public Builder randomFlow(Long randomFlow) {
            this.putBodyParameter("RandomFlow", randomFlow);
            this.randomFlow = randomFlow;
            return this;
        }

        /**
         * ReservcedBuckets.
         */
        public Builder reservcedBuckets(String reservcedBuckets) {
            this.putBodyParameter("ReservcedBuckets", reservcedBuckets);
            this.reservcedBuckets = reservcedBuckets;
            return this;
        }

        @Override
        public UpdateExperimentGroupRequest build() {
            return new UpdateExperimentGroupRequest(this);
        } 

    } 

}
