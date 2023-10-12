// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDedicatedLineResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDedicatedLineResponseBody</p>
 */
public class UpdateDedicatedLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateDedicatedLineResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDedicatedLineResponseBody create() {
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

        public UpdateDedicatedLineResponseBody build() {
            return new UpdateDedicatedLineResponseBody(this);
        } 

    } 

}
