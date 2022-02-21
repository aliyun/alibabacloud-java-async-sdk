// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteShadowSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteShadowSchemaResponseBody</p>
 */
public class DeleteShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteShadowSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteShadowSchemaResponseBody create() {
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

        public DeleteShadowSchemaResponseBody build() {
            return new DeleteShadowSchemaResponseBody(this);
        } 

    } 

}
