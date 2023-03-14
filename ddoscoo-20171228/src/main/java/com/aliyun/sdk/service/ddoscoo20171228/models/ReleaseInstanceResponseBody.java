// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceResponseBody</p>
 */
public class ReleaseInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ReleaseInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceResponseBody create() {
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

        public ReleaseInstanceResponseBody build() {
            return new ReleaseInstanceResponseBody(this);
        } 

    } 

}
