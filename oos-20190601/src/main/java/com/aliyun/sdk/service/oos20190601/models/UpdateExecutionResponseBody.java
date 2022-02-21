// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExecutionResponseBody</p>
 */
public class UpdateExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateExecutionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExecutionResponseBody create() {
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

        public UpdateExecutionResponseBody build() {
            return new UpdateExecutionResponseBody(this);
        } 

    } 

}
