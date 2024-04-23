// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody</p>
 */
public class QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the throughput after setting the throughput by SetDedicatedBlockStorageClusterDiskThroughput api.
         * <p>
         * 
         * - SUCCESS: The throughput has been successfully set.
         * - RUNNING: The throughput is currently being set.
         * - WAIT(): The throughput is waiting to be set.
         * - FAIL(): The throughput setting has failed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody build() {
            return new QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody(this);
        } 

    } 

}
