// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CloneCenterPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CloneCenterPolicyResponseBody</p>
 */
public class CloneCenterPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneCenterPolicyResponseBody(Builder builder) {
        this.policyGroupId = builder.policyGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneCenterPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloneCenterPolicyResponseBody model) {
            this.policyGroupId = model.policyGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the duplicated cloud computer policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-gx2x1dhsmthe9****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneCenterPolicyResponseBody build() {
            return new CloneCenterPolicyResponseBody(this);
        } 

    } 

}
