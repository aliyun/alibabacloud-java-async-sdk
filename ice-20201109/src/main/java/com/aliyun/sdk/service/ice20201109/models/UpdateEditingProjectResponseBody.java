// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEditingProjectResponseBody</p>
 */
public class UpdateEditingProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateEditingProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEditingProjectResponseBody create() {
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

        public UpdateEditingProjectResponseBody build() {
            return new UpdateEditingProjectResponseBody(this);
        } 

    } 

}
