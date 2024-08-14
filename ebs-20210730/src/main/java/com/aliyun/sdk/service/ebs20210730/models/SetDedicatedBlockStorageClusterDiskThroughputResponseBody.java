// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDedicatedBlockStorageClusterDiskThroughputResponseBody} extends {@link TeaModel}
 *
 * <p>SetDedicatedBlockStorageClusterDiskThroughputResponseBody</p>
 */
public class SetDedicatedBlockStorageClusterDiskThroughputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetDedicatedBlockStorageClusterDiskThroughputResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDedicatedBlockStorageClusterDiskThroughputResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDedicatedBlockStorageClusterDiskThroughputResponseBody build() {
            return new SetDedicatedBlockStorageClusterDiskThroughputResponseBody(this);
        } 

    } 

}
