// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResolverRuleResponseBody</p>
 */
public class UpdateResolverRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateResolverRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResolverRuleResponseBody create() {
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

        public UpdateResolverRuleResponseBody build() {
            return new UpdateResolverRuleResponseBody(this);
        } 

    } 

}
