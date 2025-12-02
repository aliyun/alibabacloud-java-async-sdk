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
 * {@link DescribeSparkAuditLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkAuditLogRecordsResponseBody</p>
 */
public class DescribeSparkAuditLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSparkAuditLogRecordsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.DBClusterId = builder.DBClusterId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkAuditLogRecordsResponseBody create() {
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private String DBClusterId; 
        private java.util.List<Items> items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSparkAuditLogRecordsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.DBClusterId = model.DBClusterId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details about the access denial. This parameter is returned only if Resource Access Management (RAM) permission verification failed.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1**<em><strong><strong><strong><strong><strong><strong><strong>7&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcKwyhk62IeYly4hQ+5IpXjkh1GQXuDRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;2</strong></strong></strong></strong></strong></strong></strong></em>9&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         * }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1j7******78j8i</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The list of SQL audit logs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * <p>The number of entries to return per page.</p>
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
         * <p>2D5867CF-423F-559F-BBB1-199A289E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSparkAuditLogRecordsResponseBody build() {
            return new DescribeSparkAuditLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSparkAuditLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSparkAuditLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ErrorTrace")
        private String errorTrace;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("InnerQueryId")
        private String innerQueryId;

        @com.aliyun.core.annotation.NameInMap("IsDiagnosable")
        private Boolean isDiagnosable;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("StatementId")
        private String statementId;

        @com.aliyun.core.annotation.NameInMap("StatementSource")
        private String statementSource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.clientIp = builder.clientIp;
            this.errorMsg = builder.errorMsg;
            this.errorTrace = builder.errorTrace;
            this.executeTime = builder.executeTime;
            this.innerQueryId = builder.innerQueryId;
            this.isDiagnosable = builder.isDiagnosable;
            this.processId = builder.processId;
            this.resourceGroupName = builder.resourceGroupName;
            this.SQLText = builder.SQLText;
            this.statementId = builder.statementId;
            this.statementSource = builder.statementSource;
            this.status = builder.status;
            this.totalTime = builder.totalTime;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorTrace
         */
        public String getErrorTrace() {
            return this.errorTrace;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return innerQueryId
         */
        public String getInnerQueryId() {
            return this.innerQueryId;
        }

        /**
         * @return isDiagnosable
         */
        public Boolean getIsDiagnosable() {
            return this.isDiagnosable;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return statementId
         */
        public String getStatementId() {
            return this.statementId;
        }

        /**
         * @return statementSource
         */
        public String getStatementSource() {
            return this.statementSource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String appId; 
            private String clientIp; 
            private String errorMsg; 
            private String errorTrace; 
            private String executeTime; 
            private String innerQueryId; 
            private Boolean isDiagnosable; 
            private String processId; 
            private String resourceGroupName; 
            private String SQLText; 
            private String statementId; 
            private String statementSource; 
            private String status; 
            private Long totalTime; 
            private String user; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.appId = model.appId;
                this.clientIp = model.clientIp;
                this.errorMsg = model.errorMsg;
                this.errorTrace = model.errorTrace;
                this.executeTime = model.executeTime;
                this.innerQueryId = model.innerQueryId;
                this.isDiagnosable = model.isDiagnosable;
                this.processId = model.processId;
                this.resourceGroupName = model.resourceGroupName;
                this.SQLText = model.SQLText;
                this.statementId = model.statementId;
                this.statementSource = model.statementSource;
                this.status = model.status;
                this.totalTime = model.totalTime;
                this.user = model.user;
            } 

            /**
             * <p>The Spark application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s202411061011hzc5d6476000****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The SQL execution error message.</p>
             * 
             * <strong>example:</strong>
             * <p>notFoundIp</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The SQL execution error stack trace.</p>
             * 
             * <strong>example:</strong>
             * <p>notFoundIpException</p>
             */
            public Builder errorTrace(String errorTrace) {
                this.errorTrace = errorTrace;
                return this;
            }

            /**
             * <p>The start time of the SQL statement. The time is in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-23T16:05:08Z</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The ID of the query executed within the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder innerQueryId(String innerQueryId) {
                this.innerQueryId = innerQueryId;
                return this;
            }

            /**
             * <p>Whether it can be diagnosed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDiagnosable(Boolean isDiagnosable) {
                this.isDiagnosable = isDiagnosable;
                return this;
            }

            /**
             * <p>The query ID.</p>
             * 
             * <strong>example:</strong>
             * <p>999f2439-6b10-xxxx-a5d3-daf3b35c****</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The resource group name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_job</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM adb_hdfs_import_source</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The ID of the statement.</p>
             * 
             * <strong>example:</strong>
             * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
             */
            public Builder statementId(String statementId) {
                this.statementId = statementId;
                return this;
            }

            /**
             * <p>The source from which the query was initiated.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SQL_EDITOR: SQL_EDITOR.</li>
             * <li>JDBC: JDBC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL_EDITOR</p>
             */
            public Builder statementSource(String statementSource) {
                this.statementSource = statementSource;
                return this;
            }

            /**
             * <p>The execution status of the SQL statement.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>cancel: The task is canceled .</li>
             * <li>finished: The execution succeeds .</li>
             * <li>error: The execution fails .</li>
             * <li>timeout: The execution of the command timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finish</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The duration of the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>40000</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The username that is used to execute SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
