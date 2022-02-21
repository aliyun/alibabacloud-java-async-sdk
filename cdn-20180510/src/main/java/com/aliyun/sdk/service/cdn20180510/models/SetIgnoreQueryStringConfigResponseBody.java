// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetIgnoreQueryStringConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetIgnoreQueryStringConfigResponseBody</p>
 */
public class SetIgnoreQueryStringConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetIgnoreQueryStringConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetIgnoreQueryStringConfigResponseBody create() {
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

        public SetIgnoreQueryStringConfigResponseBody build() {
            return new SetIgnoreQueryStringConfigResponseBody(this);
        } 

    } 

}
