// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBClusterEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDBClusterEndpointResponseBody</p>
 */
public class DeleteDBClusterEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDBClusterEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBClusterEndpointResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDBClusterEndpointResponseBody build() {
            return new DeleteDBClusterEndpointResponseBody(this);
        } 

    } 

}
