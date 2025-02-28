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
 * {@link CreateExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateExperimentGroupRequest</p>
 */
public class CreateExperimentGroupRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean needAA;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RandomFlow")
    private Long randomFlow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReservedBuckets")
    private String reservedBuckets;

    private CreateExperimentGroupRequest(Builder builder) {
        super(builder);
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
        this.reservedBuckets = builder.reservedBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reservedBuckets
     */
    public String getReservedBuckets() {
        return this.reservedBuckets;
    }

    public static final class Builder extends Request.Builder<CreateExperimentGroupRequest, Builder> {
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
        private String reservedBuckets; 

        private Builder() {
            super();
        } 

        private Builder(CreateExperimentGroupRequest request) {
            super(request);
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
            this.reservedBuckets = request.reservedBuckets;
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
         * Description.
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
         * <p>pairec-test1</p>
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
         * <p>experiment_group_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * ReservedBuckets.
         */
        public Builder reservedBuckets(String reservedBuckets) {
            this.putBodyParameter("ReservedBuckets", reservedBuckets);
            this.reservedBuckets = reservedBuckets;
            return this;
        }

        @Override
        public CreateExperimentGroupRequest build() {
            return new CreateExperimentGroupRequest(this);
        } 

    } 

}
