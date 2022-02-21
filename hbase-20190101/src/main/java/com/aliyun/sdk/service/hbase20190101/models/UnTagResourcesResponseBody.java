// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnTagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>UnTagResourcesResponseBody</p>
 */
public class UnTagResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UnTagResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnTagResourcesResponseBody create() {
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

        public UnTagResourcesResponseBody build() {
            return new UnTagResourcesResponseBody(this);
        } 

    } 

}
