// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link UpdateQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateQuotaResponseBody</p>
 */
public class UpdateQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateQuotaResponseBody(Builder builder) {
        this.quotaId = builder.quotaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQuotaResponseBody create() {
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
         * <p>Quota Id</p>
         * 
         * <strong>example:</strong>
         * <p>quota-20210126170216-mtl37ge7gkvdz</p>
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

        public UpdateQuotaResponseBody build() {
            return new UpdateQuotaResponseBody(this);
        } 

    } 

}
