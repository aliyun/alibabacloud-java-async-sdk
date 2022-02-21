// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDhcpOptionsSetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDhcpOptionsSetResponseBody</p>
 */
public class CreateDhcpOptionsSetResponseBody extends TeaModel {
    @NameInMap("DhcpOptionsSetId")
    private String dhcpOptionsSetId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDhcpOptionsSetResponseBody(Builder builder) {
        this.dhcpOptionsSetId = builder.dhcpOptionsSetId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDhcpOptionsSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return dhcpOptionsSetId
     */
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dhcpOptionsSetId; 
        private String requestId; 

        /**
         * DhcpOptionsSetId.
         */
        public Builder dhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDhcpOptionsSetResponseBody build() {
            return new CreateDhcpOptionsSetResponseBody(this);
        } 

    } 

}
