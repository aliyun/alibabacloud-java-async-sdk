// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link AddIpControlPolicyItemResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpControlPolicyItemResponseBody</p>
 */
public class AddIpControlPolicyItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyItemId")
    private String policyItemId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddIpControlPolicyItemResponseBody(Builder builder) {
        this.policyItemId = builder.policyItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpControlPolicyItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyItemId
     */
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyItemId; 
        private String requestId; 

        /**
         * <p>The ID of the policy. The ID is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>P151617000829241</p>
         */
        public Builder policyItemId(String policyItemId) {
            this.policyItemId = policyItemId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpControlPolicyItemResponseBody build() {
            return new AddIpControlPolicyItemResponseBody(this);
        } 

    } 

}
