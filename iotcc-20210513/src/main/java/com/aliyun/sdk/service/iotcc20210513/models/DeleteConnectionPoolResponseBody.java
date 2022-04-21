// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnectionPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteConnectionPoolResponseBody</p>
 */
public class DeleteConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteConnectionPoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectionPoolResponseBody create() {
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

        public DeleteConnectionPoolResponseBody build() {
            return new DeleteConnectionPoolResponseBody(this);
        } 

    } 

}
