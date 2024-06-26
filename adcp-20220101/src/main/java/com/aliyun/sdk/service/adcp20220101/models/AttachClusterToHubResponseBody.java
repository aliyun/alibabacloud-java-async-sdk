// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClusterToHubResponseBody} extends {@link TeaModel}
 *
 * <p>AttachClusterToHubResponseBody</p>
 */
public class AttachClusterToHubResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ManagedClusterIds")
    private java.util.List < String > managedClusterIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private AttachClusterToHubResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.managedClusterIds = builder.managedClusterIds;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachClusterToHubResponseBody create() {
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
         * You can call the AttachClusterToHub operation to associate an Container Service for Kubernetes (ACK) cluster with a master instance of ACK One.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Zhishi
         */
        public Builder managedClusterIds(java.util.List < String > managedClusterIds) {
            this.managedClusterIds = managedClusterIds;
            return this;
        }

        /**
         * Example 1
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

        public AttachClusterToHubResponseBody build() {
            return new AttachClusterToHubResponseBody(this);
        } 

    } 

}
