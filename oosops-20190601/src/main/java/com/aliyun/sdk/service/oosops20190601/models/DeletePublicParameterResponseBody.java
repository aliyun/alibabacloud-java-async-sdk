// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePublicParameterResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePublicParameterResponseBody</p>
 */
public class DeletePublicParameterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeletePublicParameterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePublicParameterResponseBody create() {
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

        public DeletePublicParameterResponseBody build() {
            return new DeletePublicParameterResponseBody(this);
        } 

    } 

}
