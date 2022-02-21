// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteForwardingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteForwardingRuleResponseBody</p>
 */
public class DeleteForwardingRuleResponseBody extends TeaModel {
    @NameInMap("ForwardingRuleId")
    private String forwardingRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteForwardingRuleResponseBody(Builder builder) {
        this.forwardingRuleId = builder.forwardingRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteForwardingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardingRuleId
     */
    public String getForwardingRuleId() {
        return this.forwardingRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String forwardingRuleId; 
        private String requestId; 

        /**
         * ForwardingRuleId.
         */
        public Builder forwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteForwardingRuleResponseBody build() {
            return new DeleteForwardingRuleResponseBody(this);
        } 

    } 

}
