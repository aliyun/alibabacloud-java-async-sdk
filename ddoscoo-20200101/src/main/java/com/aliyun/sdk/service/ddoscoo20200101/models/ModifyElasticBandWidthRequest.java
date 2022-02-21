// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticBandWidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBandWidthRequest</p>
 */
public class ModifyElasticBandWidthRequest extends Request {
    @Query
    @NameInMap("ElasticBandwidth")
    @Validation(required = true)
    private Integer elasticBandwidth;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyElasticBandWidthRequest(Builder builder) {
        super(builder);
        this.elasticBandwidth = builder.elasticBandwidth;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticBandWidthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticBandwidth
     */
    public Integer getElasticBandwidth() {
        return this.elasticBandwidth;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyElasticBandWidthRequest, Builder> {
        private Integer elasticBandwidth; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticBandWidthRequest response) {
            super(response);
            this.elasticBandwidth = response.elasticBandwidth;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * ElasticBandwidth.
         */
        public Builder elasticBandwidth(Integer elasticBandwidth) {
            this.putQueryParameter("ElasticBandwidth", elasticBandwidth);
            this.elasticBandwidth = elasticBandwidth;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyElasticBandWidthRequest build() {
            return new ModifyElasticBandWidthRequest(this);
        } 

    } 

}
