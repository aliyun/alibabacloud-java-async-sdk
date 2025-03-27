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
 * {@link EnableCustomScenePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>EnableCustomScenePolicyResponseBody</p>
 */
public class EnableCustomScenePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private Long policyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableCustomScenePolicyResponseBody(Builder builder) {
        this.policyId = builder.policyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableCustomScenePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(EnableCustomScenePolicyResponseBody model) {
            this.policyId = model.policyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder policyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableCustomScenePolicyResponseBody build() {
            return new EnableCustomScenePolicyResponseBody(this);
        } 

    } 

}
