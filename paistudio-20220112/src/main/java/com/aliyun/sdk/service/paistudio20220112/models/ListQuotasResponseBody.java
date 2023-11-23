// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotasResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotasResponseBody</p>
 */
public class ListQuotasResponseBody extends TeaModel {
    @NameInMap("Quotas")
    private java.util.List < Quota > quotas;

    @NameInMap("RequestId")
    private String requestId;

    private ListQuotasResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotas
     */
    public java.util.List < Quota > getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Quota > quotas; 
        private String requestId; 

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List < Quota > quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuotasResponseBody build() {
            return new ListQuotasResponseBody(this);
        } 

    } 

}
