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
 * {@link ModifyAgenticDBProjectHistoryRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAgenticDBProjectHistoryRetentionResponseBody</p>
 */
public class ModifyAgenticDBProjectHistoryRetentionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("HistoryRetentionSeconds")
    private Long historyRetentionSeconds;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private ModifyAgenticDBProjectHistoryRetentionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.historyRetentionSeconds = builder.historyRetentionSeconds;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAgenticDBProjectHistoryRetentionResponseBody create() {
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
     * @return historyRetentionSeconds
     */
    public Long getHistoryRetentionSeconds() {
        return this.historyRetentionSeconds;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private Long historyRetentionSeconds; 
        private String projectId; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(ModifyAgenticDBProjectHistoryRetentionResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.historyRetentionSeconds = model.historyRetentionSeconds;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
            this.tenantId = model.tenantId;
        } 

        /**
         * <p>DBClusterId</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The current effective history retention period of the project. To check the actual recoverable range, query the branch recovery window.</p>
         * 
         * <strong>example:</strong>
         * <p>604800</p>
         */
        public Builder historyRetentionSeconds(Long historyRetentionSeconds) {
            this.historyRetentionSeconds = historyRetentionSeconds;
            return this;
        }

        /**
         * <p>ProjectId</p>
         * 
         * <strong>example:</strong>
         * <p>proj-a1b2c3d4e5f6</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>req-123</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TenantId</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public ModifyAgenticDBProjectHistoryRetentionResponseBody build() {
            return new ModifyAgenticDBProjectHistoryRetentionResponseBody(this);
        } 

    } 

}
