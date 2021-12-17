// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateTransitRouterRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterRouteEntryResponseBody</p>
 */
public class UpdateTransitRouterRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private UpdateTransitRouterRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterRouteEntryResponseBody create() {
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

        public UpdateTransitRouterRouteEntryResponseBody build() {
            return new UpdateTransitRouterRouteEntryResponseBody(this);
        } 

    } 

}
