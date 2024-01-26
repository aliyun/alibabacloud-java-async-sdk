// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransactionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransactionResponseBody</p>
 */
public class CreateTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransactionId")
    private Integer transactionId;

    private CreateTransactionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transactionId = builder.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransactionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transactionId
     */
    public Integer getTransactionId() {
        return this.transactionId;
    }

    public static final class Builder {
        private String requestId; 
        private Integer transactionId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TransactionId.
         */
        public Builder transactionId(Integer transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public CreateTransactionResponseBody build() {
            return new CreateTransactionResponseBody(this);
        } 

    } 

}
