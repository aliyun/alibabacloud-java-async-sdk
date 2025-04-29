// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetDedicatedBlockStorageClusterDiskThroughputResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17EE62D8-064E-5404-8B0D-72122478****</p>
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
