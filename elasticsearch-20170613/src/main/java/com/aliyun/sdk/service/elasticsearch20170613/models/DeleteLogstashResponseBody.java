// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogstashResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLogstashResponseBody</p>
 */
public class DeleteLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLogstashResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogstashResponseBody create() {
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

        public DeleteLogstashResponseBody build() {
            return new DeleteLogstashResponseBody(this);
        } 

    } 

}
