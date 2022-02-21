// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindResolverRuleVpcResponseBody} extends {@link TeaModel}
 *
 * <p>BindResolverRuleVpcResponseBody</p>
 */
public class BindResolverRuleVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private BindResolverRuleVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindResolverRuleVpcResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindResolverRuleVpcResponseBody build() {
            return new BindResolverRuleVpcResponseBody(this);
        } 

    } 

}
