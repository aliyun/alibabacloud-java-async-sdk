// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @Query
    @NameInMap("LoadBalancerSpec")
    @Validation(required = true)
    private String loadBalancerSpec;

    @Query
    @NameInMap("NetworkId")
    @Validation(required = true)
    private String networkId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.ensRegionId = builder.ensRegionId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.networkId = builder.networkId;
        this.payType = builder.payType;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerSpec
     */
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String ensRegionId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String networkId; 
        private String payType; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.ensRegionId = request.ensRegionId;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.networkId = request.networkId;
            this.payType = request.payType;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * LoadBalancerName.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * LoadBalancerSpec.
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
        } 

    } 

}
