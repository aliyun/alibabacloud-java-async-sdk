// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCElasticScalingRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCElasticScalingRequest</p>
 */
public class ModifyRCElasticScalingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingEnabled")
    private Boolean scalingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledRule")
    private String scheduledRule;

    private ModifyRCElasticScalingRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
        this.scalingEnabled = builder.scalingEnabled;
        this.scheduledRule = builder.scheduledRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCElasticScalingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingEnabled
     */
    public Boolean getScalingEnabled() {
        return this.scalingEnabled;
    }

    /**
     * @return scheduledRule
     */
    public String getScheduledRule() {
        return this.scheduledRule;
    }

    public static final class Builder extends Request.Builder<ModifyRCElasticScalingRequest, Builder> {
        private Boolean dryRun; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 
        private Boolean scalingEnabled; 
        private String scheduledRule; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCElasticScalingRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
            this.scalingEnabled = request.scalingEnabled;
            this.scheduledRule = request.scheduledRule;
        } 

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScalingEnabled.
         */
        public Builder scalingEnabled(Boolean scalingEnabled) {
            this.putQueryParameter("ScalingEnabled", scalingEnabled);
            this.scalingEnabled = scalingEnabled;
            return this;
        }

        /**
         * ScheduledRule.
         */
        public Builder scheduledRule(String scheduledRule) {
            this.putQueryParameter("ScheduledRule", scheduledRule);
            this.scheduledRule = scheduledRule;
            return this;
        }

        @Override
        public ModifyRCElasticScalingRequest build() {
            return new ModifyRCElasticScalingRequest(this);
        } 

    } 

}
