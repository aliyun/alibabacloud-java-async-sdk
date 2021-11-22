// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteStackResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteStackResponseBody</p>
 */
public class DeleteStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private DeleteStackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStackResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteStackResponseBody build() {
            return new DeleteStackResponseBody(this);
        } 

    } 

}
