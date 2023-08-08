// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodepoolResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteClusterNodepoolResponseBody</p>
 */
public class DeleteClusterNodepoolResponseBody extends TeaModel {
    @NameInMap("request_id")
    private String requestId;

    private DeleteClusterNodepoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterNodepoolResponseBody create() {
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

        public DeleteClusterNodepoolResponseBody build() {
            return new DeleteClusterNodepoolResponseBody(this);
        } 

    } 

}
