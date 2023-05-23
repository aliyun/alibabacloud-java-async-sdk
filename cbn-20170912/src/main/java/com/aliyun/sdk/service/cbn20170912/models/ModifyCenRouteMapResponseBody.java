// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCenRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCenRouteMapResponseBody</p>
 */
public class ModifyCenRouteMapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyCenRouteMapResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCenRouteMapResponseBody create() {
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
         * The action that is performed on the community. Valid values:
         * <p>
         * 
         * *   **Additive**: adds the community to the route.
         * *   **Replace**: replaces the original community of the route.
         * 
         * This parameter specifies the action to be performed when a route meets the match condition.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCenRouteMapResponseBody build() {
            return new ModifyCenRouteMapResponseBody(this);
        } 

    } 

}
