// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrefixListResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePrefixListResponseBody</p>
 */
public class DeletePrefixListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeletePrefixListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrefixListResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePrefixListResponseBody build() {
            return new DeletePrefixListResponseBody(this);
        } 

    } 

}
