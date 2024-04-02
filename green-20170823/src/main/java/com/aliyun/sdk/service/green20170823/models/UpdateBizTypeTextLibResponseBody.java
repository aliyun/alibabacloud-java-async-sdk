// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBizTypeTextLibResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBizTypeTextLibResponseBody</p>
 */
public class UpdateBizTypeTextLibResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateBizTypeTextLibResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizTypeTextLibResponseBody create() {
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

        public UpdateBizTypeTextLibResponseBody build() {
            return new UpdateBizTypeTextLibResponseBody(this);
        } 

    } 

}
