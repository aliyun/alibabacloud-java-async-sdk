// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0876E54E-3E36-5C31-89F0-9EE8A9266F9A</p>
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
