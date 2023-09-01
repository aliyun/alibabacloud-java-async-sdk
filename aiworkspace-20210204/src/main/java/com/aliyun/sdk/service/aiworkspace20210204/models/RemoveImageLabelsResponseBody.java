// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveImageLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveImageLabelsResponseBody</p>
 */
public class RemoveImageLabelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveImageLabelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveImageLabelsResponseBody create() {
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

        public RemoveImageLabelsResponseBody build() {
            return new RemoveImageLabelsResponseBody(this);
        } 

    } 

}
