// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySasContainerWebDefenseRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySasContainerWebDefenseRuleResponseBody</p>
 */
public class ModifySasContainerWebDefenseRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifySasContainerWebDefenseRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySasContainerWebDefenseRuleResponseBody create() {
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
         * <p>A447E4E3-42A3-58B7-A7D4-2287745BEFDC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySasContainerWebDefenseRuleResponseBody build() {
            return new ModifySasContainerWebDefenseRuleResponseBody(this);
        } 

    } 

}
