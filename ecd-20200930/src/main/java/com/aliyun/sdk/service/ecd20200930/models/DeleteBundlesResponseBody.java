// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBundlesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBundlesResponseBody</p>
 */
public class DeleteBundlesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteBundlesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBundlesResponseBody create() {
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

        public DeleteBundlesResponseBody build() {
            return new DeleteBundlesResponseBody(this);
        } 

    } 

}
