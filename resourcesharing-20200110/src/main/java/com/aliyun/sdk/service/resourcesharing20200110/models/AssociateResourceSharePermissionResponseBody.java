// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateResourceSharePermissionResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResourceSharePermissionResponseBody</p>
 */
public class AssociateResourceSharePermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateResourceSharePermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourceSharePermissionResponseBody create() {
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
         * <p>111FB84A-60A9-403E-9067-E55D7EE95BD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateResourceSharePermissionResponseBody build() {
            return new AssociateResourceSharePermissionResponseBody(this);
        } 

    } 

}
