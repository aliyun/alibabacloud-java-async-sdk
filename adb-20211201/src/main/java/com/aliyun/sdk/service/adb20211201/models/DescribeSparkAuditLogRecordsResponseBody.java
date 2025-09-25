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
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * ErrorTrace.
             */
            public Builder errorTrace(String errorTrace) {
                this.errorTrace = errorTrace;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * InnerQueryId.
             */
            public Builder innerQueryId(String innerQueryId) {
                this.innerQueryId = innerQueryId;
                return this;
            }

            /**
             * IsDiagnosable.
             */
            public Builder isDiagnosable(Boolean isDiagnosable) {
                this.isDiagnosable = isDiagnosable;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>Statement ID。</p>
             * 
             * <strong>example:</strong>
             * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
             */
            public Builder statementId(String statementId) {
                this.statementId = statementId;
                return this;
            }

            /**
             * StatementSource.
             */
            public Builder statementSource(String statementSource) {
                this.statementSource = statementSource;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalTime.
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * User.
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
