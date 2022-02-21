// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatherAppEnvStatsRequest} extends {@link RequestModel}
 *
 * <p>GatherAppEnvStatsRequest</p>
 */
public class GatherAppEnvStatsRequest extends Request {
    @Body
    @NameInMap("EnvId")
    private String envId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TargetInstances")
    private String targetInstances;

    private GatherAppEnvStatsRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.regionId = builder.regionId;
        this.targetInstances = builder.targetInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GatherAppEnvStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetInstances
     */
    public String getTargetInstances() {
        return this.targetInstances;
    }

    public static final class Builder extends Request.Builder<GatherAppEnvStatsRequest, Builder> {
        private String envId; 
        private String regionId; 
        private String targetInstances; 

        private Builder() {
            super();
        } 

        private Builder(GatherAppEnvStatsRequest response) {
            super(response);
            this.envId = response.envId;
            this.regionId = response.regionId;
            this.targetInstances = response.targetInstances;
        } 

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putBodyParameter("EnvId", envId);
            this.envId = envId;
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
         * TargetInstances.
         */
        public Builder targetInstances(String targetInstances) {
            this.putBodyParameter("TargetInstances", targetInstances);
            this.targetInstances = targetInstances;
            return this;
        }

        @Override
        public GatherAppEnvStatsRequest build() {
            return new GatherAppEnvStatsRequest(this);
        } 

    } 

}
