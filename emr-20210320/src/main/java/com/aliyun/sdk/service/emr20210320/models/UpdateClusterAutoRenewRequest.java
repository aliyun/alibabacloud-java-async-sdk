// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link UpdateClusterAutoRenewRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterAutoRenewRequest</p>
 */
public class UpdateClusterAutoRenewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewInstances")
    private java.util.List<AutoRenewInstance> autoRenewInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterAutoRenew")
    private Boolean clusterAutoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterAutoRenewDuration")
    private Integer clusterAutoRenewDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterAutoRenewDurationUnit")
    private String clusterAutoRenewDurationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewAllInstances")
    private Boolean renewAllInstances;

    private UpdateClusterAutoRenewRequest(Builder builder) {
        super(builder);
        this.autoRenewInstances = builder.autoRenewInstances;
        this.clusterAutoRenew = builder.clusterAutoRenew;
        this.clusterAutoRenewDuration = builder.clusterAutoRenewDuration;
        this.clusterAutoRenewDurationUnit = builder.clusterAutoRenewDurationUnit;
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.renewAllInstances = builder.renewAllInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterAutoRenewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewInstances
     */
    public java.util.List<AutoRenewInstance> getAutoRenewInstances() {
        return this.autoRenewInstances;
    }

    /**
     * @return clusterAutoRenew
     */
    public Boolean getClusterAutoRenew() {
        return this.clusterAutoRenew;
    }

    /**
     * @return clusterAutoRenewDuration
     */
    public Integer getClusterAutoRenewDuration() {
        return this.clusterAutoRenewDuration;
    }

    /**
     * @return clusterAutoRenewDurationUnit
     */
    public String getClusterAutoRenewDurationUnit() {
        return this.clusterAutoRenewDurationUnit;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return renewAllInstances
     */
    public Boolean getRenewAllInstances() {
        return this.renewAllInstances;
    }

    public static final class Builder extends Request.Builder<UpdateClusterAutoRenewRequest, Builder> {
        private java.util.List<AutoRenewInstance> autoRenewInstances; 
        private Boolean clusterAutoRenew; 
        private Integer clusterAutoRenewDuration; 
        private String clusterAutoRenewDurationUnit; 
        private String clusterId; 
        private String regionId; 
        private Boolean renewAllInstances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterAutoRenewRequest request) {
            super(request);
            this.autoRenewInstances = request.autoRenewInstances;
            this.clusterAutoRenew = request.clusterAutoRenew;
            this.clusterAutoRenewDuration = request.clusterAutoRenewDuration;
            this.clusterAutoRenewDurationUnit = request.clusterAutoRenewDurationUnit;
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.renewAllInstances = request.renewAllInstances;
        } 

        /**
         * <p>自动续费ECS实例列表。</p>
         */
        public Builder autoRenewInstances(java.util.List<AutoRenewInstance> autoRenewInstances) {
            this.putQueryParameter("AutoRenewInstances", autoRenewInstances);
            this.autoRenewInstances = autoRenewInstances;
            return this;
        }

        /**
         * <p>集群是否自动续费。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder clusterAutoRenew(Boolean clusterAutoRenew) {
            this.putQueryParameter("ClusterAutoRenew", clusterAutoRenew);
            this.clusterAutoRenew = clusterAutoRenew;
            return this;
        }

        /**
         * <p>集群自动续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterAutoRenewDuration(Integer clusterAutoRenewDuration) {
            this.putQueryParameter("ClusterAutoRenewDuration", clusterAutoRenewDuration);
            this.clusterAutoRenewDuration = clusterAutoRenewDuration;
            return this;
        }

        /**
         * <p>集群续费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Monthly</p>
         */
        public Builder clusterAutoRenewDurationUnit(String clusterAutoRenewDurationUnit) {
            this.putQueryParameter("ClusterAutoRenewDurationUnit", clusterAutoRenewDurationUnit);
            this.clusterAutoRenewDurationUnit = clusterAutoRenewDurationUnit;
            return this;
        }

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-d6661c71139a****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>续费所有ECS实例。</p>
         */
        public Builder renewAllInstances(Boolean renewAllInstances) {
            this.putQueryParameter("RenewAllInstances", renewAllInstances);
            this.renewAllInstances = renewAllInstances;
            return this;
        }

        @Override
        public UpdateClusterAutoRenewRequest build() {
            return new UpdateClusterAutoRenewRequest(this);
        } 

    } 

}
