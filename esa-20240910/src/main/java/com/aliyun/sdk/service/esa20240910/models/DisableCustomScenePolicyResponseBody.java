// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DisableCustomScenePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DisableCustomScenePolicyResponseBody</p>
 */
public class DisableCustomScenePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisableCustomScenePolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCustomScenePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long policyId; 
        private String requestId; 

        /**
         * <p>The ID of the disabled policy.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        public Builder policyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableCustomScenePolicyResponseBody build() {
            return new DisableCustomScenePolicyResponseBody(this);
        } 

    } 

}
