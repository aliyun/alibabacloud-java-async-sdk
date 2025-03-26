// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody} extends {@link TeaModel}
 *
 * <p>UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody</p>
 */
public class UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody create() {
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

        private Builder(UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>980960B0-2969-40BF-8542-EBB34FD358AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody build() {
            return new UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody(this);
        } 

    } 

}
