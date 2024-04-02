// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBizTypeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBizTypeResponseBody</p>
 */
public class CreateBizTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateBizTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBizTypeResponseBody create() {
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

        public CreateBizTypeResponseBody build() {
            return new CreateBizTypeResponseBody(this);
        } 

    } 

}
