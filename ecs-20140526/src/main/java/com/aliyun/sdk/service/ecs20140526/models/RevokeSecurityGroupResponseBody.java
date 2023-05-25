// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeSecurityGroupResponseBody</p>
 */
public class RevokeSecurityGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RevokeSecurityGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeSecurityGroupResponseBody create() {
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

        public RevokeSecurityGroupResponseBody build() {
            return new RevokeSecurityGroupResponseBody(this);
        } 

    } 

}
