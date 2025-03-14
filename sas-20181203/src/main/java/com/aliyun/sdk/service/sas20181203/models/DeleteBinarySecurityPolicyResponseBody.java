// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteBinarySecurityPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBinarySecurityPolicyResponseBody</p>
 */
public class DeleteBinarySecurityPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBinarySecurityPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBinarySecurityPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteBinarySecurityPolicyResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A6CFADC0-1167-521A-9284-8CD8034C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBinarySecurityPolicyResponseBody build() {
            return new DeleteBinarySecurityPolicyResponseBody(this);
        } 

    } 

}
