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
         * <p>The configuration of the experiment group.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the crowd for crowd targeting. You can obtain this ID by calling the ListCrowds operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder crowdId(String crowdId) {
            this.putBodyParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
        }

        /**
         * <p>The crowd targeting type for the experiment group. Valid values:</p>
         * <ul>
         * <li><p><code>All</code>: All traffic</p>
         * </li>
         * <li><p><code>Filter</code>: Traffic that matches the filter condition</p>
         * </li>
         * <li><p><code>CrowdId</code>: Traffic from a specific crowd</p>
         * </li>
         * <li><p><code>Random</code>: A random percentage of traffic</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder crowdTargetType(String crowdTargetType) {
            this.putBodyParameter("CrowdTargetType", crowdTargetType);
            this.crowdTargetType = crowdTargetType;
            return this;
        }

        /**
         * <p>The ID of the debug crowd. You can obtain this ID by calling the ListCrowds operation.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.putBodyParameter("DebugCrowdId", debugCrowdId);
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * <p>The UIDs of the debug users. The value must be the UID of an Alibaba Cloud account or a RAM user. Separate multiple UIDs with a comma.</p>
         * 
         * <strong>example:</strong>
         * <p>1124512470******,1124512471******,1124512472******</p>
         */
        public Builder debugUsers(String debugUsers) {
            this.putBodyParameter("DebugUsers", debugUsers);
            this.debugUsers = debugUsers;
            return this;
        }

        /**
         * <p>The description of the experiment group.</p>
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
         * <p>The time duration for traffic distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder distributionTimeDuration(Integer distributionTimeDuration) {
            this.putBodyParameter("DistributionTimeDuration", distributionTimeDuration);
            this.distributionTimeDuration = distributionTimeDuration;
            return this;
        }

        /**
         * <p>The distribution type. Valid values: <code>UserId</code> (by user ID) and <code>TimeDuration</code> (by time duration).</p>
         * 
         * <strong>example:</strong>
         * <p>UserId</p>
         */
        public Builder distributionType(String distributionType) {
            this.putBodyParameter("DistributionType", distributionType);
            this.distributionType = distributionType;
            return this;
        }

        /**
         * <p>The filter condition for crowd targeting.</p>
         * 
         * <strong>example:</strong>
         * <p>gender=male</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The instance ID. You can obtain this ID by calling the ListInstances operation.</p>
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
         * <p>The ID of the layer. You can obtain this ID by calling the ListLayers operation.</p>
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
         * <p>The name of the experiment group.</p>
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
         * <p>Specifies whether to create an A/A experiment group.</p>
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
         * <p>The percentage of traffic to randomly allocate to this experiment group. This parameter is used only when <code>CrowdTargetType</code> is set to <code>Random</code>. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder randomFlow(Long randomFlow) {
            this.putBodyParameter("RandomFlow", randomFlow);
            this.randomFlow = randomFlow;
            return this;
        }

        /**
         * <p>A comma-separated list of reserved bucket numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
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
