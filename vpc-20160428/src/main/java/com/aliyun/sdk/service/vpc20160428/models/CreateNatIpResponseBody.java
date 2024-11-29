// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNatIpResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatIpResponseBody</p>
 */
public class CreateNatIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatIp")
    private String natIp;

    @com.aliyun.core.annotation.NameInMap("NatIpId")
    private String natIpId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatIpResponseBody(Builder builder) {
        this.natIp = builder.natIp;
        this.natIpId = builder.natIpId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpId
     */
    public String getNatIpId() {
        return this.natIpId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String natIp; 
        private String natIpId; 
        private String requestId; 

        /**
         * <p>The NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.34</p>
         */
        public Builder natIp(String natIp) {
            this.natIp = natIp;
            return this;
        }

        /**
         * <p>The ID of the NAT IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatip-gw8y7q3cpk3fggs8****</p>
         */
        public Builder natIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9AD97A0-5338-43F8-8A80-5E274CCBA11B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatIpResponseBody build() {
            return new CreateNatIpResponseBody(this);
        } 

    } 

}
