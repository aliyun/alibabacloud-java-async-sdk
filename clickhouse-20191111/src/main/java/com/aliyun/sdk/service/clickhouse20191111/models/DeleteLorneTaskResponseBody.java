// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLorneTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLorneTaskResponseBody</p>
 */
public class DeleteLorneTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLorneTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLorneTaskResponseBody create() {
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

        public DeleteLorneTaskResponseBody build() {
            return new DeleteLorneTaskResponseBody(this);
        } 

    } 

}
