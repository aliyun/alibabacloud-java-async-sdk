// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFilesetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFilesetResponseBody</p>
 */
public class DeleteFilesetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteFilesetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFilesetResponseBody create() {
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

        public DeleteFilesetResponseBody build() {
            return new DeleteFilesetResponseBody(this);
        } 

    } 

}
