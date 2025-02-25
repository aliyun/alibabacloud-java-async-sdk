// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteContainerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteContainerGroupResponseBody</p>
 */
public class DeleteContainerGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteContainerGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContainerGroupResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>45D5B0AD-3B00-4A9B-9911-6D5303B06712</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteContainerGroupResponseBody build() {
            return new DeleteContainerGroupResponseBody(this);
        } 

    } 

}
