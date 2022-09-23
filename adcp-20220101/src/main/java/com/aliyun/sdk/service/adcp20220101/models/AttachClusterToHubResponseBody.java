// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClusterToHubResponseBody} extends {@link TeaModel}
 *
 * <p>AttachClusterToHubResponseBody</p>
 */
public class AttachClusterToHubResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ManagedClusterIds")
    private java.util.List < String > managedClusterIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
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
         * ClusterId.
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
         * RequestId.
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
