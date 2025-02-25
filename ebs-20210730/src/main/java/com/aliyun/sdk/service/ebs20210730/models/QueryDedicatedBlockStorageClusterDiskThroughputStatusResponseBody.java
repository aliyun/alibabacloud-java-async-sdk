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
 * {@link QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody</p>
 */
public class QueryDedicatedBlockStorageClusterDiskThroughputStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A37597A6-BB99-19B3-85EA-4C2B91F0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the throughput after setting the throughput by SetDedicatedBlockStorageClusterDiskThroughput api.</p>
         * <ul>
         * <li>SUCCESS: The throughput has been successfully set.</li>
         * <li>RUNNING: The throughput is currently being set.</li>
         * <li>WAIT(): The throughput is waiting to be set.</li>
         * <li>FAIL(): The throughput setting has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
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
