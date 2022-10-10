// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDBClusterStorageUsageResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshDBClusterStorageUsageResponseBody</p>
 */
public class RefreshDBClusterStorageUsageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RefreshDBClusterStorageUsageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshDBClusterStorageUsageResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshDBClusterStorageUsageResponseBody build() {
            return new RefreshDBClusterStorageUsageResponseBody(this);
        } 

    } 

}
