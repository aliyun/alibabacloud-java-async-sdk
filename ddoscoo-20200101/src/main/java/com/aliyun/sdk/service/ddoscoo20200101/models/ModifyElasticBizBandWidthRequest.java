// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticBizBandWidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBizBandWidthRequest</p>
 */
public class ModifyElasticBizBandWidthRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ElasticBizBandwidth")
    @Validation(required = true)
    private Integer elasticBizBandwidth;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mode")
    private String mode;

    private ModifyElasticBizBandWidthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.elasticBizBandwidth = builder.elasticBizBandwidth;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticBizBandWidthRequest create() {
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
     * @return elasticBizBandwidth
     */
    public Integer getElasticBizBandwidth() {
        return this.elasticBizBandwidth;
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

    public static final class Builder extends Request.Builder<ModifyElasticBizBandWidthRequest, Builder> {
        private String regionId; 
        private Integer elasticBizBandwidth; 
        private String instanceId; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticBizBandWidthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.elasticBizBandwidth = request.elasticBizBandwidth;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
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
         * ElasticBizBandwidth.
         */
        public Builder elasticBizBandwidth(Integer elasticBizBandwidth) {
            this.putQueryParameter("ElasticBizBandwidth", elasticBizBandwidth);
            this.elasticBizBandwidth = elasticBizBandwidth;
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

        @Override
        public ModifyElasticBizBandWidthRequest build() {
            return new ModifyElasticBizBandWidthRequest(this);
        } 

    } 

}
