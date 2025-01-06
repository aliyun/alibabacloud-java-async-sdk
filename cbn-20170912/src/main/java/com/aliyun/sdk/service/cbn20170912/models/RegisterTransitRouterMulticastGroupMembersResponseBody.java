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
 * {@link RegisterTransitRouterMulticastGroupMembersResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterTransitRouterMulticastGroupMembersResponseBody</p>
 */
public class RegisterTransitRouterMulticastGroupMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterTransitRouterMulticastGroupMembersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterTransitRouterMulticastGroupMembersResponseBody create() {
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
         * <p>EB985B7E-2CF8-5EC9-A7DB-F7C82ABD3ACE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterTransitRouterMulticastGroupMembersResponseBody build() {
            return new RegisterTransitRouterMulticastGroupMembersResponseBody(this);
        } 

    } 

}
