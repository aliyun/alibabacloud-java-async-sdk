// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyElasticBizQpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyElasticBizQpsRequest</p>
 */
public class ModifyElasticBizQpsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsElasticQps")
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
         * <p>The ID of the Anti-DDoS Proxy instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
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

        /**
         * <p>The metering method for the burstable QPS. Valid values:</p>
         * <ul>
         * <li><strong>month</strong>: monthly 95th percentile</li>
         * <li><strong>day</strong>: daily 95th percentile QPS</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The burstable QPS value.</p>
         * <blockquote>
         * <p> The default value is 300,000 for the Chinese mainland and 150,000 for regions outside the Chinese mainland.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
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
