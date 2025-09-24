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
 * {@link GenerateUpgradeReportForSyncCloneResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUpgradeReportForSyncCloneResponseBody</p>
 */
public class GenerateUpgradeReportForSyncCloneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceDBClusterId")
    private String sourceDBClusterId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private GenerateUpgradeReportForSyncCloneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceDBClusterId = builder.sourceDBClusterId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUpgradeReportForSyncCloneResponseBody create() {
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

    /**
     * @return sourceDBClusterId
     */
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String requestId; 
        private String sourceDBClusterId; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(GenerateUpgradeReportForSyncCloneResponseBody model) {
            this.requestId = model.requestId;
            this.sourceDBClusterId = model.sourceDBClusterId;
            this.taskId = model.taskId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceDBClusterId.
         */
        public Builder sourceDBClusterId(String sourceDBClusterId) {
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public GenerateUpgradeReportForSyncCloneResponseBody build() {
            return new GenerateUpgradeReportForSyncCloneResponseBody(this);
        } 

    } 

}
