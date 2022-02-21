// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualBorderRouterResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVirtualBorderRouterResponseBody</p>
 */
public class DeleteVirtualBorderRouterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteVirtualBorderRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVirtualBorderRouterResponseBody create() {
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

        public DeleteVirtualBorderRouterResponseBody build() {
            return new DeleteVirtualBorderRouterResponseBody(this);
        } 

    } 

}
