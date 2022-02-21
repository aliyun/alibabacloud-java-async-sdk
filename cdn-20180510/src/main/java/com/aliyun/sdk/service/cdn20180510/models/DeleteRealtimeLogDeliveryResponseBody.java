// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRealtimeLogDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRealtimeLogDeliveryResponseBody</p>
 */
public class DeleteRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteRealtimeLogDeliveryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRealtimeLogDeliveryResponseBody create() {
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

        public DeleteRealtimeLogDeliveryResponseBody build() {
            return new DeleteRealtimeLogDeliveryResponseBody(this);
        } 

    } 

}
