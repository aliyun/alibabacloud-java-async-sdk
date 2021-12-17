// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTransitRouterRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTransitRouterRouteEntryResponseBody</p>
 */
public class DeleteTransitRouterRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteTransitRouterRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTransitRouterRouteEntryResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTransitRouterRouteEntryResponseBody build() {
            return new DeleteTransitRouterRouteEntryResponseBody(this);
        } 

    } 

}
