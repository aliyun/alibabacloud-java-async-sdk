// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>PublishAppVersionResponseBody</p>
 */
public class PublishAppVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private PublishAppVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAppVersionResponseBody create() {
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

        public PublishAppVersionResponseBody build() {
            return new PublishAppVersionResponseBody(this);
        } 

    } 

}
