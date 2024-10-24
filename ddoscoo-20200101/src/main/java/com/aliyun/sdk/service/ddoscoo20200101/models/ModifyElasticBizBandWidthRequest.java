// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyElasticBizBandWidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBizBandWidthRequest</p>
 */
public class ModifyElasticBizBandWidthRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticBizBandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer elasticBizBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
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
         * <p>The burstable clean bandwidth. Unit: Mbit/s. The burstable clean bandwidth cannot exceed nine times the clean bandwidth of your Anti-DDoS Pro or Anti-DDoS Premium instance, and the sum of the clean bandwidth and the burstable clean bandwidth cannot exceed the maximum clean bandwidth that is supported by your instance. The value 0 indicates that the burstable clean bandwidth feature is disabled. You can disable the burstable clean bandwidth feature once a month.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder elasticBizBandwidth(Integer elasticBizBandwidth) {
            this.putQueryParameter("ElasticBizBandwidth", elasticBizBandwidth);
            this.elasticBizBandwidth = elasticBizBandwidth;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-tl32morr****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metering method of the burstable clean bandwidth feature. Valid values:</p>
         * <ul>
         * <li><strong>month</strong>: the metering method of monthly 95th percentile</li>
         * <li><strong>day</strong>: the metering method of daily 95th percentile</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>month</p>
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
