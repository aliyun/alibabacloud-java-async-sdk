// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindResolverRuleVpcResponseBody} extends {@link TeaModel}
 *
 * <p>BindResolverRuleVpcResponseBody</p>
 */
public class BindResolverRuleVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12FE6E98-3885-423E-B18B-88CC17052A31</p>
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
