// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectProgressResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProjectProgressResponseBody</p>
 */
public class UpdateProjectProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateProjectProgressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectProgressResponseBody create() {
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

        public UpdateProjectProgressResponseBody build() {
            return new UpdateProjectProgressResponseBody(this);
        } 

    } 

}
