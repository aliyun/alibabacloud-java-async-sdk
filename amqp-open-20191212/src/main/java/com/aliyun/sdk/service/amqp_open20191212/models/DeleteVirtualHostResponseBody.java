// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualHostResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVirtualHostResponseBody</p>
 */
public class DeleteVirtualHostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteVirtualHostResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualHostResponseBody create() {
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

        public DeleteVirtualHostResponseBody build() {
            return new DeleteVirtualHostResponseBody(this);
        } 

    } 

}
