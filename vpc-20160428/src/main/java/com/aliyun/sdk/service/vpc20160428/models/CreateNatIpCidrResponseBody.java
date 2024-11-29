// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNatIpCidrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatIpCidrResponseBody</p>
 */
public class CreateNatIpCidrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatIpCidrId")
    private String natIpCidrId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatIpCidrResponseBody(Builder builder) {
        this.natIpCidrId = builder.natIpCidrId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatIpCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return natIpCidrId
     */
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String natIpCidrId; 
        private String requestId; 

        /**
         * <p>The ID of the NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatcidr-gw8lhqtvdn4qnea****</p>
         */
        public Builder natIpCidrId(String natIpCidrId) {
            this.natIpCidrId = natIpCidrId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7021BEB1-210F-48A9-AB82-BE9A9110BB89</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatIpCidrResponseBody build() {
            return new CreateNatIpCidrResponseBody(this);
        } 

    } 

}
