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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckTransitRouterServiceResponseBody model) {
            this.enabled = model.enabled;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the transit router service is activated for the current Alibaba Cloud account.</p>
         * <ul>
         * <li><strong>true</strong>: The service is activated.</li>
         * <li>If this parameter is not returned, the transit router service is not activated for the current Alibaba Cloud account, and the system returns a corresponding message.</li>
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
         * <p>The request ID.</p>
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
