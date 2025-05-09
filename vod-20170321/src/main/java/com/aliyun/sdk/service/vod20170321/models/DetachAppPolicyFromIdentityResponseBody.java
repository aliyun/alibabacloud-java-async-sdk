// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DetachAppPolicyFromIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>DetachAppPolicyFromIdentityResponseBody</p>
 */
public class DetachAppPolicyFromIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedPolicyNames")
    private java.util.List<String> failedPolicyNames;

    @com.aliyun.core.annotation.NameInMap("NonExistPolicyNames")
    private java.util.List<String> nonExistPolicyNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetachAppPolicyFromIdentityResponseBody(Builder builder) {
        this.failedPolicyNames = builder.failedPolicyNames;
        this.nonExistPolicyNames = builder.nonExistPolicyNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAppPolicyFromIdentityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedPolicyNames
     */
    public java.util.List<String> getFailedPolicyNames() {
        return this.failedPolicyNames;
    }

    /**
     * @return nonExistPolicyNames
     */
    public java.util.List<String> getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> failedPolicyNames; 
        private java.util.List<String> nonExistPolicyNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetachAppPolicyFromIdentityResponseBody model) {
            this.failedPolicyNames = model.failedPolicyNames;
            this.nonExistPolicyNames = model.nonExistPolicyNames;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The names of the policies that failed to be granted to the RAM user or RAM role.</p>
         */
        public Builder failedPolicyNames(java.util.List<String> failedPolicyNames) {
            this.failedPolicyNames = failedPolicyNames;
            return this;
        }

        /**
         * <p>The name of the policy that was not found.</p>
         */
        public Builder nonExistPolicyNames(java.util.List<String> nonExistPolicyNames) {
            this.nonExistPolicyNames = nonExistPolicyNames;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-****-D7393642C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetachAppPolicyFromIdentityResponseBody build() {
            return new DetachAppPolicyFromIdentityResponseBody(this);
        } 

    } 

}
