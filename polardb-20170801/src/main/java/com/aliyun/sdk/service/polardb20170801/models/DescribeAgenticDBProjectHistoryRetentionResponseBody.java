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
 * {@link DescribeAgenticDBProjectHistoryRetentionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBProjectHistoryRetentionResponseBody</p>
 */
public class DescribeAgenticDBProjectHistoryRetentionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("HistoryRetentionSeconds")
    private Long historyRetentionSeconds;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("QueriedAt")
    private String queriedAt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private DescribeAgenticDBProjectHistoryRetentionResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.historyRetentionSeconds = builder.historyRetentionSeconds;
        this.projectId = builder.projectId;
        this.queriedAt = builder.queriedAt;
        this.requestId = builder.requestId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBProjectHistoryRetentionResponseBody create() {
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
     * @return queriedAt
     */
    public String getQueriedAt() {
        return this.queriedAt;
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
        private String queriedAt; 
        private String requestId; 
        private String tenantId; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBProjectHistoryRetentionResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.historyRetentionSeconds = model.historyRetentionSeconds;
            this.projectId = model.projectId;
            this.queriedAt = model.queriedAt;
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
         * <p>The effective history data retention period for the project. For the actual recoverable range, query the branch recovery window.</p>
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
         * <p>The time when the query was completed, in UTC RFC3339 format. This does not represent the latest recoverable time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T07:32:00Z</p>
         */
        public Builder queriedAt(String queriedAt) {
            this.queriedAt = queriedAt;
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

        public DescribeAgenticDBProjectHistoryRetentionResponseBody build() {
            return new DescribeAgenticDBProjectHistoryRetentionResponseBody(this);
        } 

    } 

}
