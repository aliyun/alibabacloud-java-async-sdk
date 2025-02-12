// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ModifyElasticBandWidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBandWidthRequest</p>
 */
public class ModifyElasticBandWidthRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ElasticBandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer elasticBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyElasticBandWidthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.elasticBandwidth = builder.elasticBandwidth;
        this.instanceId = builder.instanceId;
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

    public static final class Builder extends Request.Builder<ModifyElasticBandWidthRequest, Builder> {
        private String regionId; 
        private Integer elasticBandwidth; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyElasticBandWidthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.elasticBandwidth = request.elasticBandwidth;
            this.instanceId = request.instanceId;
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
         * <p>The new burstable protection bandwidth that you want to use. Unit: Gbit/s.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/91502.html">DescribeElasticBandwidthSpec</a> operation to query the available burstable protection bandwidth of the instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder elasticBandwidth(Integer elasticBandwidth) {
            this.putQueryParameter("ElasticBandwidth", elasticBandwidth);
            this.elasticBandwidth = elasticBandwidth;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> The instance must be in a normal state. You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyElasticBandWidthRequest build() {
            return new ModifyElasticBandWidthRequest(this);
        } 

    } 

}
