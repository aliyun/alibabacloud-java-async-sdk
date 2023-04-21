// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDesktopsResponseBody</p>
 */
public class DeleteDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDesktopsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDesktopsResponseBody create() {
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

        public DeleteDesktopsResponseBody build() {
            return new DeleteDesktopsResponseBody(this);
        } 

    } 

}
