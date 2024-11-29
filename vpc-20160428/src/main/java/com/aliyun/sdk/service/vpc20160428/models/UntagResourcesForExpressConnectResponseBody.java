// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UntagResourcesForExpressConnectResponseBody} extends {@link TeaModel}
 *
 * <p>UntagResourcesForExpressConnectResponseBody</p>
 */
public class UntagResourcesForExpressConnectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UntagResourcesForExpressConnectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesForExpressConnectResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DE65F6B7-7566-4802-9007-96F2494AC512</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UntagResourcesForExpressConnectResponseBody build() {
            return new UntagResourcesForExpressConnectResponseBody(this);
        } 

    } 

}
