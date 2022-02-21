// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicContactPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ReleasePublicContactPointsResponseBody</p>
 */
public class ReleasePublicContactPointsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReleasePublicContactPointsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicContactPointsResponseBody create() {
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

        public ReleasePublicContactPointsResponseBody build() {
            return new ReleasePublicContactPointsResponseBody(this);
        } 

    } 

}
