// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPayerForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetPayerForAccountResponseBody</p>
 */
public class GetPayerForAccountResponseBody extends TeaModel {
    @NameInMap("PayerAccountId")
    private String payerAccountId;

    @NameInMap("PayerAccountName")
    private String payerAccountName;

    @NameInMap("RequestId")
    private String requestId;

    private GetPayerForAccountResponseBody(Builder builder) {
        this.payerAccountId = builder.payerAccountId;
        this.payerAccountName = builder.payerAccountName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPayerForAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    /**
     * @return payerAccountName
     */
    public String getPayerAccountName() {
        return this.payerAccountName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String payerAccountId; 
        private String payerAccountName; 
        private String requestId; 

        /**
         * PayerAccountId.
         */
        public Builder payerAccountId(String payerAccountId) {
            this.payerAccountId = payerAccountId;
            return this;
        }

        /**
         * PayerAccountName.
         */
        public Builder payerAccountName(String payerAccountName) {
            this.payerAccountName = payerAccountName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPayerForAccountResponseBody build() {
            return new GetPayerForAccountResponseBody(this);
        } 

    } 

}
