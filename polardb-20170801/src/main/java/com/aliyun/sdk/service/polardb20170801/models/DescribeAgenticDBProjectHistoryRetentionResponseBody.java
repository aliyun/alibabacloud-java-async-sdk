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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>项目当前生效的历史数据保留时长。实际可恢复范围请查询分支恢复窗口。</p>
         * 
         * <strong>example:</strong>
         * <p>604800</p>
         */
        public Builder historyRetentionSeconds(Long historyRetentionSeconds) {
            this.historyRetentionSeconds = historyRetentionSeconds;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>完成本次查询的时间，采用 UTC RFC3339 格式，不代表最晚可恢复时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T07:32:00Z</p>
         */
        public Builder queriedAt(String queriedAt) {
            this.queriedAt = queriedAt;
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
         * TenantId.
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
