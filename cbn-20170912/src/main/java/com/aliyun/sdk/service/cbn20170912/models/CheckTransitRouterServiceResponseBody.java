// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckTransitRouterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckTransitRouterServiceResponseBody</p>
 */
public class CheckTransitRouterServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private String enabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the transit router feature is activated.</p>
         * <ul>
         * <li><strong>true</strong>: activated</li>
         * <li>If this value is not returned, the system prompts that the current account does not have the transit router feature activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D93C8B9-C354-5C3E-BEFB-BA8A2C314D68</p>
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
