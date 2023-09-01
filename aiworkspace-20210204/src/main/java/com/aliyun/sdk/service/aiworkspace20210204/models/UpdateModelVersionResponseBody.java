// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateModelVersionResponseBody</p>
 */
public class UpdateModelVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateModelVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelVersionResponseBody create() {
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

        public UpdateModelVersionResponseBody build() {
            return new UpdateModelVersionResponseBody(this);
        } 

    } 

}
