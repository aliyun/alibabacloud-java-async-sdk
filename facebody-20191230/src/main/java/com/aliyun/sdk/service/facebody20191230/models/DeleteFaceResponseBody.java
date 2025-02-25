// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFaceResponseBody</p>
 */
public class DeleteFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteFaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceResponseBody create() {
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

        public DeleteFaceResponseBody build() {
            return new DeleteFaceResponseBody(this);
        } 

    } 

}
