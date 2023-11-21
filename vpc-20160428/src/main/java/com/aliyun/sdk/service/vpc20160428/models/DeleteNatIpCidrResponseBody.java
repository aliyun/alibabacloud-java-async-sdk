// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatIpCidrResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNatIpCidrResponseBody</p>
 */
public class DeleteNatIpCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteNatIpCidrResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatIpCidrResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteNatIpCidrResponseBody build() {
            return new DeleteNatIpCidrResponseBody(this);
        } 

    } 

}
