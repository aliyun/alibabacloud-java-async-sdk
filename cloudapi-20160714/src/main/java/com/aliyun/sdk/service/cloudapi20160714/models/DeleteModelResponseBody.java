// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteModelResponseBody</p>
 */
public class DeleteModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteModelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelResponseBody create() {
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
         * Deletes a model from Model Management for an API group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteModelResponseBody build() {
            return new DeleteModelResponseBody(this);
        } 

    } 

}
