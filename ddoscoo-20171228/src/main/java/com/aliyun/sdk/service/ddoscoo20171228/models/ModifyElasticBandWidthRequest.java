// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ElasticBandwidth")
    @Validation(required = true)
    private Integer elasticBandwidth;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private ModifyElasticBandWidthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.elasticBandwidth = builder.elasticBandwidth;
        this.instanceId = builder.instanceId;
        this.sourceIp = builder.sourceIp;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyElasticBandWidthRequest, Builder> {
        private String regionId; 
        private Integer elasticBandwidth; 
        private String instanceId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticBandWidthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.elasticBandwidth = request.elasticBandwidth;
            this.instanceId = request.instanceId;
            this.sourceIp = request.sourceIp;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyElasticBandWidthRequest build() {
            return new ModifyElasticBandWidthRequest(this);
        } 

    } 

}
