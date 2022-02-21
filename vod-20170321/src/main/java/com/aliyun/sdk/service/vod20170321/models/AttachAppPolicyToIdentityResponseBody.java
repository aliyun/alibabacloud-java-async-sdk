// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachAppPolicyToIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>AttachAppPolicyToIdentityResponseBody</p>
 */
public class AttachAppPolicyToIdentityResponseBody extends TeaModel {
    @NameInMap("FailedPolicyNames")
    private java.util.List < String > failedPolicyNames;

    @NameInMap("NonExistPolicyNames")
    private java.util.List < String > nonExistPolicyNames;

    @NameInMap("RequestId")
    private String requestId;

    private AttachAppPolicyToIdentityResponseBody(Builder builder) {
        this.failedPolicyNames = builder.failedPolicyNames;
        this.nonExistPolicyNames = builder.nonExistPolicyNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachAppPolicyToIdentityResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedPolicyNames
     */
    public java.util.List < String > getFailedPolicyNames() {
        return this.failedPolicyNames;
    }

    /**
     * @return nonExistPolicyNames
     */
    public java.util.List < String > getNonExistPolicyNames() {
        return this.nonExistPolicyNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedPolicyNames; 
        private java.util.List < String > nonExistPolicyNames; 
        private String requestId; 

        /**
         * FailedPolicyNames.
         */
        public Builder failedPolicyNames(java.util.List < String > failedPolicyNames) {
            this.failedPolicyNames = failedPolicyNames;
            return this;
        }

        /**
         * NonExistPolicyNames.
         */
        public Builder nonExistPolicyNames(java.util.List < String > nonExistPolicyNames) {
            this.nonExistPolicyNames = nonExistPolicyNames;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachAppPolicyToIdentityResponseBody build() {
            return new AttachAppPolicyToIdentityResponseBody(this);
        } 

    } 

}
