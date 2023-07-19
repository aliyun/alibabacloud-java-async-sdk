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
         * The burstable clean bandwidth. Unit: Mbit/s. The burstable clean bandwidth cannot exceed nine times the clean bandwidth of your Anti-DDoS Pro or Anti-DDoS Premium instance, and the sum of the clean bandwidth and the burstable clean bandwidth cannot exceed the maximum clean bandwidth that is supported by your instance. The value 0 indicates that the burstable clean bandwidth feature is disabled. You can disable the burstable clean bandwidth feature once a month.
         */
        public Builder elasticBizBandwidth(Integer elasticBizBandwidth) {
            this.putQueryParameter("ElasticBizBandwidth", elasticBizBandwidth);
            this.elasticBizBandwidth = elasticBizBandwidth;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The metering method of the burstable clean bandwidth feature. Valid values:
         * <p>
         * 
         * *   **month**: the metering method of monthly 95th percentile
         * *   **day**: the metering method of daily 95th percentile
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
