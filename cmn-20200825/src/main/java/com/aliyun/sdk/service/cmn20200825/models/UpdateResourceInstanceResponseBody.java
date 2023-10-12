// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateResourceInstanceResponseBody</p>
 */
public class UpdateResourceInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateResourceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceInstanceResponseBody create() {
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

        public UpdateResourceInstanceResponseBody build() {
            return new UpdateResourceInstanceResponseBody(this);
        } 

    } 

}
