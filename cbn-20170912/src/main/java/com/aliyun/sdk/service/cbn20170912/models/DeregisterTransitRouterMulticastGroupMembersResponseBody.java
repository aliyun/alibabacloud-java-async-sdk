// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeregisterTransitRouterMulticastGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterTransitRouterMulticastGroupMembersResponseBody</p>
 */
public class DeregisterTransitRouterMulticastGroupMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeregisterTransitRouterMulticastGroupMembersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterTransitRouterMulticastGroupMembersResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>61D0A553-5E4E-53B5-9DA3-01CBA076A286</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeregisterTransitRouterMulticastGroupMembersResponseBody build() {
            return new DeregisterTransitRouterMulticastGroupMembersResponseBody(this);
        } 

    } 

}
