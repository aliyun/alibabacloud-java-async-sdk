// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTraficMatchRuleToTrafficMarkingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>AddTraficMatchRuleToTrafficMarkingPolicyResponseBody</p>
 */
public class AddTraficMatchRuleToTrafficMarkingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddTraficMatchRuleToTrafficMarkingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTraficMatchRuleToTrafficMarkingPolicyResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddTraficMatchRuleToTrafficMarkingPolicyResponseBody build() {
            return new AddTraficMatchRuleToTrafficMarkingPolicyResponseBody(this);
        } 

    } 

}
