// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeAuditLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditLogsResponseBody</p>
 */
public class DescribeAuditLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncRequestId")
    private String asyncRequestId;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuditLogsResponseBody(Builder builder) {
        this.asyncRequestId = builder.asyncRequestId;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncRequestId
     */
    public String getAsyncRequestId() {
        return this.asyncRequestId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String asyncRequestId; 
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAuditLogsResponseBody model) {
            this.asyncRequestId = model.asyncRequestId;
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AsyncRequestId.
         */
        public Builder asyncRequestId(String asyncRequestId) {
            this.asyncRequestId = asyncRequestId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuditLogsResponseBody build() {
            return new DescribeAuditLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuditLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuditLogsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientPort")
        private String clientPort;

        @com.aliyun.core.annotation.NameInMap("ClientUa")
        private String clientUa;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataSet")
        private String dataSet;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EffectRow")
        private Long effectRow;

        @com.aliyun.core.annotation.NameInMap("ExecuteStatus")
        private Integer executeStatus;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("InWhiteList")
        private Boolean inWhiteList;

        @com.aliyun.core.annotation.NameInMap("InstanceAuditStatus")
        private String instanceAuditStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        @com.aliyun.core.annotation.NameInMap("LogSource")
        private String logSource;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private Long logTime;

        @com.aliyun.core.annotation.NameInMap("MemberAccount")
        private String memberAccount;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("OssObjectKey")
        private String ossObjectKey;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RuleCategory")
        private String ruleCategory;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WarnLevel")
        private String warnLevel;

        @com.aliyun.core.annotation.NameInMap("WarnLevelName")
        private String warnLevelName;

        private Items(Builder builder) {
            this.clientIp = builder.clientIp;
            this.clientPort = builder.clientPort;
            this.clientUa = builder.clientUa;
            this.columnName = builder.columnName;
            this.creationTime = builder.creationTime;
            this.dataSet = builder.dataSet;
            this.databaseName = builder.databaseName;
            this.dbType = builder.dbType;
            this.effectRow = builder.effectRow;
            this.executeStatus = builder.executeStatus;
            this.executeTime = builder.executeTime;
            this.inWhiteList = builder.inWhiteList;
            this.instanceAuditStatus = builder.instanceAuditStatus;
            this.instanceDescription = builder.instanceDescription;
            this.instanceName = builder.instanceName;
            this.ipType = builder.ipType;
            this.logSource = builder.logSource;
            this.logTime = builder.logTime;
            this.memberAccount = builder.memberAccount;
            this.message = builder.message;
            this.modelName = builder.modelName;
            this.operateType = builder.operateType;
            this.ossObjectKey = builder.ossObjectKey;
            this.packageName = builder.packageName;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.ruleCategory = builder.ruleCategory;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sqlText = builder.sqlText;
            this.tableName = builder.tableName;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.warnLevel = builder.warnLevel;
            this.warnLevelName = builder.warnLevelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientPort
         */
        public String getClientPort() {
            return this.clientPort;
        }

        /**
         * @return clientUa
         */
        public String getClientUa() {
            return this.clientUa;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataSet
         */
        public String getDataSet() {
            return this.dataSet;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return effectRow
         */
        public Long getEffectRow() {
            return this.effectRow;
        }

        /**
         * @return executeStatus
         */
        public Integer getExecuteStatus() {
            return this.executeStatus;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return inWhiteList
         */
        public Boolean getInWhiteList() {
            return this.inWhiteList;
        }

        /**
         * @return instanceAuditStatus
         */
        public String getInstanceAuditStatus() {
            return this.instanceAuditStatus;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return logSource
         */
        public String getLogSource() {
            return this.logSource;
        }

        /**
         * @return logTime
         */
        public Long getLogTime() {
            return this.logTime;
        }

        /**
         * @return memberAccount
         */
        public String getMemberAccount() {
            return this.memberAccount;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return ossObjectKey
         */
        public String getOssObjectKey() {
            return this.ossObjectKey;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productId
         */
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return ruleCategory
         */
        public String getRuleCategory() {
            return this.ruleCategory;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return warnLevel
         */
        public String getWarnLevel() {
            return this.warnLevel;
        }

        /**
         * @return warnLevelName
         */
        public String getWarnLevelName() {
            return this.warnLevelName;
        }

        public static final class Builder {
            private String clientIp; 
            private String clientPort; 
            private String clientUa; 
            private String columnName; 
            private Long creationTime; 
            private String dataSet; 
            private String databaseName; 
            private String dbType; 
            private Long effectRow; 
            private Integer executeStatus; 
            private Long executeTime; 
            private Boolean inWhiteList; 
            private String instanceAuditStatus; 
            private String instanceDescription; 
            private String instanceName; 
            private String ipType; 
            private String logSource; 
            private Long logTime; 
            private String memberAccount; 
            private String message; 
            private String modelName; 
            private String operateType; 
            private String ossObjectKey; 
            private String packageName; 
            private String productCode; 
            private Long productId; 
            private String ruleCategory; 
            private String ruleId; 
            private String ruleName; 
            private String sqlText; 
            private String tableName; 
            private String userId; 
            private String userName; 
            private String warnLevel; 
            private String warnLevelName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.clientIp = model.clientIp;
                this.clientPort = model.clientPort;
                this.clientUa = model.clientUa;
                this.columnName = model.columnName;
                this.creationTime = model.creationTime;
                this.dataSet = model.dataSet;
                this.databaseName = model.databaseName;
                this.dbType = model.dbType;
                this.effectRow = model.effectRow;
                this.executeStatus = model.executeStatus;
                this.executeTime = model.executeTime;
                this.inWhiteList = model.inWhiteList;
                this.instanceAuditStatus = model.instanceAuditStatus;
                this.instanceDescription = model.instanceDescription;
                this.instanceName = model.instanceName;
                this.ipType = model.ipType;
                this.logSource = model.logSource;
                this.logTime = model.logTime;
                this.memberAccount = model.memberAccount;
                this.message = model.message;
                this.modelName = model.modelName;
                this.operateType = model.operateType;
                this.ossObjectKey = model.ossObjectKey;
                this.packageName = model.packageName;
                this.productCode = model.productCode;
                this.productId = model.productId;
                this.ruleCategory = model.ruleCategory;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sqlText = model.sqlText;
                this.tableName = model.tableName;
                this.userId = model.userId;
                this.userName = model.userName;
                this.warnLevel = model.warnLevel;
                this.warnLevelName = model.warnLevelName;
            } 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ClientPort.
             */
            public Builder clientPort(String clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * ClientUa.
             */
            public Builder clientUa(String clientUa) {
                this.clientUa = clientUa;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataSet.
             */
            public Builder dataSet(String dataSet) {
                this.dataSet = dataSet;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EffectRow.
             */
            public Builder effectRow(Long effectRow) {
                this.effectRow = effectRow;
                return this;
            }

            /**
             * ExecuteStatus.
             */
            public Builder executeStatus(Integer executeStatus) {
                this.executeStatus = executeStatus;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * InWhiteList.
             */
            public Builder inWhiteList(Boolean inWhiteList) {
                this.inWhiteList = inWhiteList;
                return this;
            }

            /**
             * InstanceAuditStatus.
             */
            public Builder instanceAuditStatus(String instanceAuditStatus) {
                this.instanceAuditStatus = instanceAuditStatus;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * LogSource.
             */
            public Builder logSource(String logSource) {
                this.logSource = logSource;
                return this;
            }

            /**
             * LogTime.
             */
            public Builder logTime(Long logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * MemberAccount.
             */
            public Builder memberAccount(String memberAccount) {
                this.memberAccount = memberAccount;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * OssObjectKey.
             */
            public Builder ossObjectKey(String ossObjectKey) {
                this.ossObjectKey = ossObjectKey;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * RuleCategory.
             */
            public Builder ruleCategory(String ruleCategory) {
                this.ruleCategory = ruleCategory;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SqlText.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * WarnLevel.
             */
            public Builder warnLevel(String warnLevel) {
                this.warnLevel = warnLevel;
                return this;
            }

            /**
             * WarnLevelName.
             */
            public Builder warnLevelName(String warnLevelName) {
                this.warnLevelName = warnLevelName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
