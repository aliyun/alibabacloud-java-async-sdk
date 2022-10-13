// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAuthorizationRuleResponseBody</p>
 */
public class UpdateAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateAuthorizationRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthorizationRuleResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAuthorizationRuleResponseBody build() {
            return new UpdateAuthorizationRuleResponseBody(this);
        } 

    } 

}
