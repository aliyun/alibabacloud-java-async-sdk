// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticBizQpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBizQpsRequest</p>
 */
public class ModifyElasticBizQpsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("OpsElasticQps")
    private Long opsElasticQps;

    private ModifyElasticBizQpsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this.opsElasticQps = builder.opsElasticQps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticBizQpsRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return opsElasticQps
     */
    public Long getOpsElasticQps() {
        return this.opsElasticQps;
    }

    public static final class Builder extends Request.Builder<ModifyElasticBizQpsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String mode; 
        private Long opsElasticQps; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticBizQpsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
            this.opsElasticQps = request.opsElasticQps;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * OpsElasticQps.
         */
        public Builder opsElasticQps(Long opsElasticQps) {
            this.putQueryParameter("OpsElasticQps", opsElasticQps);
            this.opsElasticQps = opsElasticQps;
            return this;
        }

        @Override
        public ModifyElasticBizQpsRequest build() {
            return new ModifyElasticBizQpsRequest(this);
        } 

    } 

}
