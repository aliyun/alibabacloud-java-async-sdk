// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcFirewallCenConfigureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallCenConfigureResponseBody</p>
 */
public class CreateVpcFirewallCenConfigureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    private CreateVpcFirewallCenConfigureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallCenConfigureResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcFirewallId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        public CreateVpcFirewallCenConfigureResponseBody build() {
            return new CreateVpcFirewallCenConfigureResponseBody(this);
        } 

    } 

}
