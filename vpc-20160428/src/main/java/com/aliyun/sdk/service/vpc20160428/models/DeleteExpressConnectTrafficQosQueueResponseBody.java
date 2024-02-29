// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteExpressConnectTrafficQosQueueResponseBody</p>
 */
public class DeleteExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteExpressConnectTrafficQosQueueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExpressConnectTrafficQosQueueResponseBody create() {
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

        public DeleteExpressConnectTrafficQosQueueResponseBody build() {
            return new DeleteExpressConnectTrafficQosQueueResponseBody(this);
        } 

    } 

}
