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
 * {@link RegisterTransitRouterMulticastGroupSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterTransitRouterMulticastGroupSourcesResponseBody</p>
 */
public class RegisterTransitRouterMulticastGroupSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterTransitRouterMulticastGroupSourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterTransitRouterMulticastGroupSourcesResponseBody create() {
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

        private Builder(RegisterTransitRouterMulticastGroupSourcesResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C5D5D70-0AFF-5E5C-8D8A-E92C90C8FB08</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterTransitRouterMulticastGroupSourcesResponseBody build() {
            return new RegisterTransitRouterMulticastGroupSourcesResponseBody(this);
        } 

    } 

}
