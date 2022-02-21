// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatIpCidrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatIpCidrResponseBody</p>
 */
public class CreateNatIpCidrResponseBody extends TeaModel {
    @NameInMap("NatIpCidrId")
    private String natIpCidrId;

    @NameInMap("RequestId")
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
         * NatIpCidrId.
         */
        public Builder natIpCidrId(String natIpCidrId) {
            this.natIpCidrId = natIpCidrId;
            return this;
        }

        /**
         * RequestId.
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
