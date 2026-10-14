// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("LoadBalancerType")
    private String loadBalancerType;

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
        this.billingCycle = builder.billingCycle;
        this.clientToken = builder.clientToken;
        this.ensRegionId = builder.ensRegionId;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerSpec = builder.loadBalancerSpec;
        this.loadBalancerType = builder.loadBalancerType;
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
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return loadBalancerType
     */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
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
        private String billingCycle; 
        private String clientToken; 
        private String ensRegionId; 
        private String loadBalancerName; 
        private String loadBalancerSpec; 
        private String loadBalancerType; 
        private String networkId; 
        private String payType; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
            this.clientToken = request.clientToken;
            this.ensRegionId = request.ensRegionId;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerSpec = request.loadBalancerSpec;
            this.loadBalancerType = request.loadBalancerType;
            this.networkId = request.networkId;
            this.payType = request.payType;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>The billing cycle of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>Ensures the idempotency of the request to avoid duplicate operations caused by multiple retries.</p>
         * <ul>
         * <li><p>Generate a parameter value from your client and ensure that the value is unique across different requests. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length.</p>
         * </li>
         * <li><p>If you use a ClientToken that has been used before and the other request parameters remain unchanged, the client receives the same result as the first submission, with no impact on your server-side state.</p>
         * </li>
         * <li><p>You can retry when the API times out or returns the PROCESSING error code, and idempotency takes effect. If the return result is an HTTP 200 status code, the retry returns the same result as the previous call with no impact on your server-side state. If the return result is an HTTP 4xx status code and the error code is not PROCESSING, idempotency does not take effect.</p>
         * </li>
         * <li><p>The ClientToken is valid for 10 minutes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>26C28756-2586-17AF-B802-0DC50D8FDEBB</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the ENS edge zone.</p>
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
         * <p>The name of the load balancing instance. The name must be 1 to 80 characters in length and can contain letters and Chinese characters. If you do not specify this parameter, the system automatically assigns an instance name.</p>
         * <blockquote>
         * <p>The name cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The specification of the load balancing instance.</p>
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
         * <p>The type of the Edge Load Balancing instance.</p>
         * <ul>
         * <li>CLB: Classic Load Balancing instance.</li>
         * <li>InternetDR: Public pattern load balancing instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLB</p>
         */
        public Builder loadBalancerType(String loadBalancerType) {
            this.putQueryParameter("LoadBalancerType", loadBalancerType);
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * <p>The network ID of the Edge Load Balancing (ELB) instance to create.</p>
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
         * <p>The billing type. PostPaid (currently the only supported type): pay-as-you-go.</p>
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
         * <p>The ID of the vSwitch to which the VPC instance belongs.</p>
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
