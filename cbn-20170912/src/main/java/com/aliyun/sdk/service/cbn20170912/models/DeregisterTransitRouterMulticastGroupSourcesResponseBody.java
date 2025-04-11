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
 * {@link DeregisterTransitRouterMulticastGroupSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupSourcesResponseBody</p>
 */
public class DeregisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeregisterTransitRouterMulticastGroupSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterTransitRouterMulticastGroupSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeregisterTransitRouterMulticastGroupSourcesResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>53E7E8BE-7F4E-5458-ACCA-9B5C1D6A642D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeregisterTransitRouterMulticastGroupSourcesResponseBody build() {
            return new DeregisterTransitRouterMulticastGroupSourcesResponseBody(this);
        } 

    } 

}
