// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteQuotaResponseBody</p>
 */
public class DeleteQuotaResponseBody extends TeaModel {
    @NameInMap("QuotaId")
    private String quotaId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteQuotaResponseBody(Builder builder) {
        this.quotaId = builder.quotaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String quotaId; 
        private String requestId; 

        /**
         * Quota Id
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteQuotaResponseBody build() {
            return new DeleteQuotaResponseBody(this);
        } 

    } 

}