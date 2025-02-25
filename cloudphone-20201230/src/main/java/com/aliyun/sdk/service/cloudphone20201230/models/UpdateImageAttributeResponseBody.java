// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateImageAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateImageAttributeResponseBody</p>
 */
public class UpdateImageAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateImageAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateImageAttributeResponseBody build() {
            return new UpdateImageAttributeResponseBody(this);
        } 

    } 

}
