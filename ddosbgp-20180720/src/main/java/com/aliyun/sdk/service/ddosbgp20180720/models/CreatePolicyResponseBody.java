// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyResponseBody</p>
 */
public class CreatePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePolicyResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>864FE2F4-CB2E-4024-B9EF-D59FD08A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyResponseBody build() {
            return new CreatePolicyResponseBody(this);
        } 

    } 

}
