// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachCommonBandwidthPackageToLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>AttachCommonBandwidthPackageToLoadBalancerRequest</p>
 */
public class AttachCommonBandwidthPackageToLoadBalancerRequest extends Request {
    @Query
    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    private String bandwidthPackageId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AttachCommonBandwidthPackageToLoadBalancerRequest(Builder builder) {
        super(builder);
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCommonBandwidthPackageToLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachCommonBandwidthPackageToLoadBalancerRequest, Builder> {
        private String bandwidthPackageId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachCommonBandwidthPackageToLoadBalancerRequest response) {
            super(response);
            this.bandwidthPackageId = response.bandwidthPackageId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.loadBalancerId = response.loadBalancerId;
            this.regionId = response.regionId;
        } 

        /**
         * 带宽包ID
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * 幂等参数
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachCommonBandwidthPackageToLoadBalancerRequest build() {
            return new AttachCommonBandwidthPackageToLoadBalancerRequest(this);
        } 

    } 

}
