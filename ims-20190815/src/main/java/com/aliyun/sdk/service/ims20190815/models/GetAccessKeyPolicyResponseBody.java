// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccessKeyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyPolicyResponseBody</p>
 */
public class GetAccessKeyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("AccessKeyPolicy")
    private String accessKeyPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccessKeyPolicyResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeyPolicy = builder.accessKeyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeyPolicy
     */
    public String getAccessKeyPolicy() {
        return this.accessKeyPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeyPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccessKeyPolicyResponseBody model) {
            this.accessKeyId = model.accessKeyId;
            this.accessKeyPolicy = model.accessKeyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * AccessKeyPolicy.
         */
        public Builder accessKeyPolicy(String accessKeyPolicy) {
            this.accessKeyPolicy = accessKeyPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyPolicyResponseBody build() {
            return new GetAccessKeyPolicyResponseBody(this);
        } 

    } 

}
