// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOIDCProviderResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteOIDCProviderResponseBody</p>
 */
public class DeleteOIDCProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteOIDCProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOIDCProviderResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteOIDCProviderResponseBody build() {
            return new DeleteOIDCProviderResponseBody(this);
        } 

    } 

}
