// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachClusterFromHubResponseBody} extends {@link TeaModel}
 *
 * <p>DetachClusterFromHubResponseBody</p>
 */
public class DetachClusterFromHubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ManagedClusterIds")
    private java.util.List < String > managedClusterIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private DetachClusterFromHubResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.managedClusterIds = builder.managedClusterIds;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachClusterFromHubResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return managedClusterIds
     */
    public java.util.List < String > getManagedClusterIds() {
        return this.managedClusterIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String clusterId; 
        private java.util.List < String > managedClusterIds; 
        private String requestId; 
        private String taskId; 

        /**
         * Zhishi
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ManagedClusterIds.
         */
        public Builder managedClusterIds(java.util.List < String > managedClusterIds) {
            this.managedClusterIds = managedClusterIds;
            return this;
        }

        /**
         * You can call the DetachClusterFromHub operation to disassociate clusters from a master instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public DetachClusterFromHubResponseBody build() {
            return new DetachClusterFromHubResponseBody(this);
        } 

    } 

}
