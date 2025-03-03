// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetPayerForAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetPayerForAccountResponseBody</p>
 */
public class GetPayerForAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PayerAccountId")
    private String payerAccountId;

    @com.aliyun.core.annotation.NameInMap("PayerAccountName")
    private String payerAccountName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the settlement account.</p>
         * 
         * <strong>example:</strong>
         * <p>172841235500****</p>
         */
        public Builder payerAccountId(String payerAccountId) {
            this.payerAccountId = payerAccountId;
            return this;
        }

        /**
         * <p>The name of the settlement account.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        public Builder payerAccountName(String payerAccountName) {
            this.payerAccountName = payerAccountName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
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
