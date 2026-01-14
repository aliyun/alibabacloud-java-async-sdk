// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link UpdateForwardingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateForwardingRulesResponseBody</p>
 */
public class UpdateForwardingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardingRules")
    private java.util.List<ForwardingRules> forwardingRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateForwardingRulesResponseBody(Builder builder) {
        this.forwardingRules = builder.forwardingRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateForwardingRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardingRules
     */
    public java.util.List<ForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ForwardingRules> forwardingRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateForwardingRulesResponseBody model) {
            this.forwardingRules = model.forwardingRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the forwarding rules.</p>
         */
        public Builder forwardingRules(java.util.List<ForwardingRules> forwardingRules) {
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64ADAB1E-0B7F-4FD8-A404-3BECC0E9CCFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateForwardingRulesResponseBody build() {
            return new UpdateForwardingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateForwardingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateForwardingRulesResponseBody</p>
     */
    public static class ForwardingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ForwardingRuleId")
        private String forwardingRuleId;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleId = builder.forwardingRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardingRules create() {
            return builder().build();
        }

        /**
         * @return forwardingRuleId
         */
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public static final class Builder {
            private String forwardingRuleId; 

            private Builder() {
            } 

            private Builder(ForwardingRules model) {
                this.forwardingRuleId = model.forwardingRuleId;
            } 

            /**
             * <p>The forwarding rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>frule-bp1dii16gu9qdvb34****</p>
             */
            public Builder forwardingRuleId(String forwardingRuleId) {
                this.forwardingRuleId = forwardingRuleId;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
