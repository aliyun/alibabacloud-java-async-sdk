// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsActionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsActionLogsResponseBody</p>
 */
public class DescribeApsActionLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ActionLogs")
    private java.util.List<ActionLogs> actionLogs;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("WorkloadId")
    private String workloadId;

    private DescribeApsActionLogsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.actionLogs = builder.actionLogs;
        this.DBClusterId = builder.DBClusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.workloadId = builder.workloadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsActionLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return actionLogs
     */
    public java.util.List<ActionLogs> getActionLogs() {
        return this.actionLogs;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return workloadId
     */
    public String getWorkloadId() {
        return this.workloadId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<ActionLogs> actionLogs; 
        private String DBClusterId; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 
        private String workloadId; 

        private Builder() {
        } 

        private Builder(DescribeApsActionLogsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.actionLogs = model.actionLogs;
            this.DBClusterId = model.DBClusterId;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.workloadId = model.workloadId;
        } 

        /**
         * <p>The information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;AuthAction&quot;: &quot;xxx&quot;,
         *   &quot;AuthPrincipalDisplayName&quot;: &quot;sampleName&quot;,
         *   &quot;AuthPrincipalOwnerId&quot;: &quot;111111111111111111&quot;,
         *   &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *   &quot;AuthResource&quot;: &quot;xxx&quot;,
         *   &quot;NoPermissionType&quot;: &quot;xxx&quot;,
         *   &quot;PolicyType&quot;: &quot;xxx&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The queried logs.</p>
         */
        public Builder actionLogs(java.util.List<ActionLogs> actionLogs) {
            this.actionLogs = actionLogs;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1r053byu48p****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EDBA27-AF3E-5966-9503-FD1557E19167</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The ID of the real-time data ingestion job.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-hz109vpvt4fg8528d****</p>
         */
        public Builder workloadId(String workloadId) {
            this.workloadId = workloadId;
            return this;
        }

        public DescribeApsActionLogsResponseBody build() {
            return new DescribeApsActionLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsActionLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsActionLogsResponseBody</p>
     */
    public static class ActionLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ActionLogs(Builder builder) {
            this.context = builder.context;
            this.stage = builder.stage;
            this.state = builder.state;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionLogs create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String context; 
            private String stage; 
            private String state; 
            private String time; 

            private Builder() {
            } 

            private Builder(ActionLogs model) {
                this.context = model.context;
                this.stage = model.stage;
                this.state = model.state;
                this.time = model.time;
            } 

            /**
             * <p>The content of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>DDL migration job finished</p>
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * <p>The phase during which the log was generated. Valid values:</p>
             * <ul>
             * <li><strong>StructureMigrate</strong>: schema migration.</li>
             * <li><strong>FullDataSync</strong>: full data synchronization.</li>
             * <li><strong>IncrementalSync</strong>: incremental data synchronization.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullDataSync</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The type of the log. Multiple log types are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>INFO</strong></li>
             * <li><strong>WARN</strong></li>
             * <li><strong>ERROR</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INFO,WARN,ERROR</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the log was generated. The time follows the ISO 8601 standard in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-01T05:46:30Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ActionLogs build() {
                return new ActionLogs(this);
            } 

        } 

    }
}
