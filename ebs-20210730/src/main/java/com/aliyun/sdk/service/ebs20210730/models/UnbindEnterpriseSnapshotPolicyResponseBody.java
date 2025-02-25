// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link UnbindEnterpriseSnapshotPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindEnterpriseSnapshotPolicyResponseBody</p>
 */
public class UnbindEnterpriseSnapshotPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnbindEnterpriseSnapshotPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindEnterpriseSnapshotPolicyResponseBody create() {
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
         * <p>061DE1AB-08BA-5ACD-A03A-440117C6939A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindEnterpriseSnapshotPolicyResponseBody build() {
            return new UnbindEnterpriseSnapshotPolicyResponseBody(this);
        } 

    } 

}
