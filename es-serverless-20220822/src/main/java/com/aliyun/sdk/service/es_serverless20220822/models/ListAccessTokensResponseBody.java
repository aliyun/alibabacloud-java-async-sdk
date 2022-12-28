// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessTokensResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessTokensResponseBody</p>
 */
public class ListAccessTokensResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private ListAccessTokensResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessTokensResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccessTokensResponseBody build() {
            return new ListAccessTokensResponseBody(this);
        } 

    } 

}
