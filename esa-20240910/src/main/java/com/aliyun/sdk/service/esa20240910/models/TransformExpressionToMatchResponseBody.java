// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformExpressionToMatchResponseBody} extends {@link TeaModel}
 *
 * <p>TransformExpressionToMatchResponseBody</p>
 */
public class TransformExpressionToMatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Match")
    private WafRuleMatch match;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TransformExpressionToMatchResponseBody(Builder builder) {
        this.match = builder.match;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformExpressionToMatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return match
     */
    public WafRuleMatch getMatch() {
        return this.match;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private WafRuleMatch match; 
        private String requestId; 

        /**
         * Match.
         */
        public Builder match(WafRuleMatch match) {
            this.match = match;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TransformExpressionToMatchResponseBody build() {
            return new TransformExpressionToMatchResponseBody(this);
        } 

    } 

}
