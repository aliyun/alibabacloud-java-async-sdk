// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link RegisterBucUserResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterBucUserResponseBody</p>
 */
public class RegisterBucUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private BucUser result;

    private RegisterBucUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterBucUserResponseBody create() {
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

    /**
     * @return result
     */
    public BucUser getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private BucUser result; 

        private Builder() {
        } 

        private Builder(RegisterBucUserResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D372D265-81C4-5B84-8827-596F0CF768FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(BucUser result) {
            this.result = result;
            return this;
        }

        public RegisterBucUserResponseBody build() {
            return new RegisterBucUserResponseBody(this);
        } 

    } 

}
