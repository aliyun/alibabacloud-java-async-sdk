// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBatchOperateCardsTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBatchOperateCardsTaskResponseBody</p>
 */
public class DeleteBatchOperateCardsTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBatchOperateCardsTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBatchOperateCardsTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBatchOperateCardsTaskResponseBody build() {
            return new DeleteBatchOperateCardsTaskResponseBody(this);
        } 

    } 

}
