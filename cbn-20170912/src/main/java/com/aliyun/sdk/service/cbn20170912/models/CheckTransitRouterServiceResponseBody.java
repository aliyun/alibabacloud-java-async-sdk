// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckTransitRouterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTransitRouterServiceResponseBody</p>
 */
public class CheckTransitRouterServiceResponseBody extends TeaModel {
    @NameInMap("Enabled")
    private String enabled;

    @NameInMap("RequestId")
    private String requestId;

    private CheckTransitRouterServiceResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTransitRouterServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return this.enabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enabled; 
        private String requestId; 

        /**
         * Indicates whether the transit router feature is activated.
         * <p>
         * 
         * *   **true**: activated
         * *   If this value is not returned, the system prompts that the current account does not have the transit router feature activated.
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckTransitRouterServiceResponseBody build() {
            return new CheckTransitRouterServiceResponseBody(this);
        } 

    } 

}
