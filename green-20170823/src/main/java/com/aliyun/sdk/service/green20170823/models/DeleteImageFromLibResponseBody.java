// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageFromLibResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteImageFromLibResponseBody</p>
 */
public class DeleteImageFromLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteImageFromLibResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageFromLibResponseBody create() {
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

        public DeleteImageFromLibResponseBody build() {
            return new DeleteImageFromLibResponseBody(this);
        } 

    } 

}
