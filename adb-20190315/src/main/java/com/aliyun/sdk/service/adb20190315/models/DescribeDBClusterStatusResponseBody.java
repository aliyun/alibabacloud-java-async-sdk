// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterStatusResponseBody</p>
 */
public class DescribeDBClusterStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private java.util.List < String > status;

    private DescribeDBClusterStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterStatusResponseBody create() {
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
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The states of clusters. Valid values:
         * <p>
         * 
         * *   **Preparing**: The cluster is being prepared.
         * *   **Creating**: The cluster is being created.
         * *   **Restoring**: The cluster is being restored from a backup.
         * *   **Running**: The cluster is running.
         * *   **Deleting**: The cluster is being deleted.
         * *   **ClassChanging**: The cluster configurations are being changed.
         * *   **NetAddressCreating**: A network connection is being created.
         * *   **NetAddressDeleting**: A network connection is being released.
         * *   **NetAddressModifying**: A network connection is being modified.
         * *   **EngineVersionUpgrading**: The engine version is being updated.
         */
        public Builder status(java.util.List < String > status) {
            this.status = status;
            return this;
        }

        public DescribeDBClusterStatusResponseBody build() {
            return new DescribeDBClusterStatusResponseBody(this);
        } 

    } 

}
