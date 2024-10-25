// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerResponseBody</p>
 */
public class CreateLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateLoadBalancerResponseBody(Builder builder) {
        this.loadBalancerId = builder.loadBalancerId;
        this.loadBalancerName = builder.loadBalancerName;
        this.networkId = builder.networkId;
        this.requestId = builder.requestId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder {
        private String loadBalancerId; 
        private String loadBalancerName; 
        private String networkId; 
        private String requestId; 
        private String vSwitchId; 

        /**
         * <p>The ID of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5s7crik3yo3bp03gqrbp5****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The name of the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gcs-pre-websocket-****</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5sax03dh2eyagujgsn7z9****</p>
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1ECC937A-AE0E-4626-BE51-DED1D6D1C888</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch to which the ELB instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5savh5ngxh8sbj14bu7n****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        public CreateLoadBalancerResponseBody build() {
            return new CreateLoadBalancerResponseBody(this);
        } 

    } 

}
