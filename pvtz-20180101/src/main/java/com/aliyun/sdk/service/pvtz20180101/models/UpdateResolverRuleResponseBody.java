// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResolverRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResolverRuleResponseBody</p>
 */
public class UpdateResolverRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
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
         * RequestId.
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
