// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBLinkResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDBLinkResponseBody</p>
 */
public class DeleteDBLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDBLinkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBLinkResponseBody create() {
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

        public DeleteDBLinkResponseBody build() {
            return new DeleteDBLinkResponseBody(this);
        } 

    } 

}
