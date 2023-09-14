// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAutoScalingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveAutoScalingPolicyResponseBody</p>
 */
public class RemoveAutoScalingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveAutoScalingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAutoScalingPolicyResponseBody create() {
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveAutoScalingPolicyResponseBody build() {
            return new RemoveAutoScalingPolicyResponseBody(this);
        } 

    } 

}
