// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVscMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>DetachVscMountPointResponseBody</p>
 */
public class DetachVscMountPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DetachVscMountPointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachVscMountPointResponseBody create() {
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

        public DetachVscMountPointResponseBody build() {
            return new DetachVscMountPointResponseBody(this);
        } 

    } 

}
