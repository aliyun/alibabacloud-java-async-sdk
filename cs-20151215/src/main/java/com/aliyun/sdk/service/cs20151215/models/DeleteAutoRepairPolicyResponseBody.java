// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeleteAutoRepairPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAutoRepairPolicyResponseBody</p>
 */
public class DeleteAutoRepairPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    private DeleteAutoRepairPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoRepairPolicyResponseBody create() {
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

        private Builder(DeleteAutoRepairPolicyResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteAutoRepairPolicyResponseBody build() {
            return new DeleteAutoRepairPolicyResponseBody(this);
        } 

    } 

}
