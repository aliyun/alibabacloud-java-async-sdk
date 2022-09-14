// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteJobTemplatesResponseBody</p>
 */
public class DeleteJobTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteJobTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobTemplatesResponseBody create() {
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

        public DeleteJobTemplatesResponseBody build() {
            return new DeleteJobTemplatesResponseBody(this);
        } 

    } 

}
