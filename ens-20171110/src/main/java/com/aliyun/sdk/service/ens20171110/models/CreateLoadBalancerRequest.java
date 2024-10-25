// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the Edge Node Service (ENS) node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-telecom</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The name of the ELB instance. The name must be 1 to 80 characters in length. If you leave this parameter empty, the system randomly allocates a name as the value of this parameter.</p>
         * <blockquote>
         * <p> The value cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gcs-pre-websocket-eslb-telecom</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The specification of the ELB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>elb.s2.medium</p>
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            this.putQueryParameter("LoadBalancerSpec", loadBalancerSpec);
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * <p>The network ID of the created ELB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5sax03dh2eyagujgsn7z9****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The billing method of the cluster. Valid value: PostPaid. PostPaid specifies the pay-as-you-go billing method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the internal-facing ELB instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5s78haoys9oylle6ln71m****</p>
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
