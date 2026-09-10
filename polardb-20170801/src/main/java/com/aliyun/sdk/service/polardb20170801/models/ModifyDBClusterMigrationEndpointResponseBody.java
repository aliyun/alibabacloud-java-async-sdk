// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterMigrationEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterMigrationEndpointResponseBody</p>
 */
public class ModifyDBClusterMigrationEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifyDBClusterMigrationEndpointResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterMigrationEndpointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String DBClusterId; 
        private String requestId; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(ModifyDBClusterMigrationEndpointResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to view information about all clusters in the destination region, including the cluster ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-k2j1qqukj583di7n9</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F901FB05-8109-547F-A0B9-9C4FF7F4927A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>21498490</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ModifyDBClusterMigrationEndpointResponseBody build() {
            return new ModifyDBClusterMigrationEndpointResponseBody(this);
        } 

    } 

}
