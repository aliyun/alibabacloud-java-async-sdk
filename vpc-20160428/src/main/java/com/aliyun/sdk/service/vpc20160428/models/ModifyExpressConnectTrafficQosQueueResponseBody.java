// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyExpressConnectTrafficQosQueueResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyExpressConnectTrafficQosQueueResponseBody</p>
 */
public class ModifyExpressConnectTrafficQosQueueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyExpressConnectTrafficQosQueueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectTrafficQosQueueResponseBody create() {
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
         * <p>079874CD-AEC1-43E6-AC03-ADD96B6E4907</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyExpressConnectTrafficQosQueueResponseBody build() {
            return new ModifyExpressConnectTrafficQosQueueResponseBody(this);
        } 

    } 

}
