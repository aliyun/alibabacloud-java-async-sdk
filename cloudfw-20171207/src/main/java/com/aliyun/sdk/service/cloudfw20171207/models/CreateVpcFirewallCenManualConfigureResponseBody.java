// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateVpcFirewallCenManualConfigureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallCenManualConfigureResponseBody</p>
 */
public class CreateVpcFirewallCenManualConfigureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    private CreateVpcFirewallCenManualConfigureResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallCenManualConfigureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateVpcFirewallCenManualConfigureResponseBody model) {
            this.requestId = model.requestId;
            this.vpcFirewallId = model.vpcFirewallId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VpcFirewallId.
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        public CreateVpcFirewallCenManualConfigureResponseBody build() {
            return new CreateVpcFirewallCenManualConfigureResponseBody(this);
        } 

    } 

}
