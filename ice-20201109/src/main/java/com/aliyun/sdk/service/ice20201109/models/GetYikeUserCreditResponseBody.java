// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetYikeUserCreditResponseBody} extends {@link TeaModel}
 *
 * <p>GetYikeUserCreditResponseBody</p>
 */
public class GetYikeUserCreditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditTotal")
    private String creditTotal;

    @com.aliyun.core.annotation.NameInMap("CreditUsage")
    private String creditUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetYikeUserCreditResponseBody(Builder builder) {
        this.creditTotal = builder.creditTotal;
        this.creditUsage = builder.creditUsage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeUserCreditResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditTotal
     */
    public String getCreditTotal() {
        return this.creditTotal;
    }

    /**
     * @return creditUsage
     */
    public String getCreditUsage() {
        return this.creditUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String creditTotal; 
        private String creditUsage; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetYikeUserCreditResponseBody model) {
            this.creditTotal = model.creditTotal;
            this.creditUsage = model.creditUsage;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total allocated credit.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder creditTotal(String creditTotal) {
            this.creditTotal = creditTotal;
            return this;
        }

        /**
         * <p>The remaining credit.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder creditUsage(String creditUsage) {
            this.creditUsage = creditUsage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetYikeUserCreditResponseBody build() {
            return new GetYikeUserCreditResponseBody(this);
        } 

    } 

}
