// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateGlobalAccelerationInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateGlobalAccelerationInstanceResponseBody</p>
 */
public class AssociateGlobalAccelerationInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AssociateGlobalAccelerationInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateGlobalAccelerationInstanceResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateGlobalAccelerationInstanceResponseBody build() {
            return new AssociateGlobalAccelerationInstanceResponseBody(this);
        } 

    } 

}
