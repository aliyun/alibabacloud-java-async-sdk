// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTablesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListTablesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class StreamTableConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private StreamTableConfig(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamTableConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(StreamTableConfig model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public StreamTableConfig build() {
                return new StreamTableConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetTagList")
        private java.util.List<String> assetTagList;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataDomainId")
        private Long dataDomainId;

        @com.aliyun.core.annotation.NameInMap("DataDomainName")
        private String dataDomainName;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("IsBasicMode")
        private Boolean isBasicMode;

        @com.aliyun.core.annotation.NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @com.aliyun.core.annotation.NameInMap("LastDdlTime")
        private String lastDdlTime;

        @com.aliyun.core.annotation.NameInMap("LastDmlTime")
        private String lastDmlTime;

        @com.aliyun.core.annotation.NameInMap("LastQueryTime")
        private String lastQueryTime;

        @com.aliyun.core.annotation.NameInMap("LifeCycle")
        private Long lifeCycle;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParentModelId")
        private String parentModelId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Long securityLevel;

        @com.aliyun.core.annotation.NameInMap("SecurityLevelAbbreviation")
        private String securityLevelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("SecurityLevelName")
        private String securityLevelName;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StreamTableConfig")
        private java.util.List<StreamTableConfig> streamTableConfig;

        @com.aliyun.core.annotation.NameInMap("TableSizeInBytes")
        private Long tableSizeInBytes;

        @com.aliyun.core.annotation.NameInMap("VisitCount30d")
        private Long visitCount30d;

        private TableList(Builder builder) {
            this.assetTagList = builder.assetTagList;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.dataDomainId = builder.dataDomainId;
            this.dataDomainName = builder.dataDomainName;
            this.dataSourceId = builder.dataSourceId;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.fileId = builder.fileId;
            this.guid = builder.guid;
            this.isBasicMode = builder.isBasicMode;
            this.isPartitionTable = builder.isPartitionTable;
            this.lastDdlTime = builder.lastDdlTime;
            this.lastDmlTime = builder.lastDmlTime;
            this.lastQueryTime = builder.lastQueryTime;
            this.lifeCycle = builder.lifeCycle;
            this.name = builder.name;
            this.owner = builder.owner;
            this.parentModelId = builder.parentModelId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.securityLevel = builder.securityLevel;
            this.securityLevelAbbreviation = builder.securityLevelAbbreviation;
            this.securityLevelName = builder.securityLevelName;
            this.storageType = builder.storageType;
            this.streamTableConfig = builder.streamTableConfig;
            this.tableSizeInBytes = builder.tableSizeInBytes;
            this.visitCount30d = builder.visitCount30d;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
        }

        /**
         * @return assetTagList
         */
        public java.util.List<String> getAssetTagList() {
            return this.assetTagList;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataDomainId
         */
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        /**
         * @return dataDomainName
         */
        public String getDataDomainName() {
            return this.dataDomainName;
        }

        /**
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return isBasicMode
         */
        public Boolean getIsBasicMode() {
            return this.isBasicMode;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        /**
         * @return lastDdlTime
         */
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        /**
         * @return lastDmlTime
         */
        public String getLastDmlTime() {
            return this.lastDmlTime;
        }

        /**
         * @return lastQueryTime
         */
        public String getLastQueryTime() {
            return this.lastQueryTime;
        }

        /**
         * @return lifeCycle
         */
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parentModelId
         */
        public String getParentModelId() {
            return this.parentModelId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return securityLevel
         */
        public Long getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return securityLevelAbbreviation
         */
        public String getSecurityLevelAbbreviation() {
            return this.securityLevelAbbreviation;
        }

        /**
         * @return securityLevelName
         */
        public String getSecurityLevelName() {
            return this.securityLevelName;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return streamTableConfig
         */
        public java.util.List<StreamTableConfig> getStreamTableConfig() {
            return this.streamTableConfig;
        }

        /**
         * @return tableSizeInBytes
         */
        public Long getTableSizeInBytes() {
            return this.tableSizeInBytes;
        }

        /**
         * @return visitCount30d
         */
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

        public static final class Builder {
            private java.util.List<String> assetTagList; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private String comment; 
            private String createTime; 
            private String creator; 
            private Long dataDomainId; 
            private String dataDomainName; 
            private Long dataSourceId; 
            private String displayName; 
            private String env; 
            private String fileId; 
            private String guid; 
            private Boolean isBasicMode; 
            private Boolean isPartitionTable; 
            private String lastDdlTime; 
            private String lastDmlTime; 
            private String lastQueryTime; 
            private Long lifeCycle; 
            private String name; 
            private String owner; 
            private String parentModelId; 
            private Long projectId; 
            private String projectName; 
            private Long securityLevel; 
            private String securityLevelAbbreviation; 
            private String securityLevelName; 
            private String storageType; 
            private java.util.List<StreamTableConfig> streamTableConfig; 
            private Long tableSizeInBytes; 
            private Long visitCount30d; 

            private Builder() {
            } 

            private Builder(TableList model) {
                this.assetTagList = model.assetTagList;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.dataDomainId = model.dataDomainId;
                this.dataDomainName = model.dataDomainName;
                this.dataSourceId = model.dataSourceId;
                this.displayName = model.displayName;
                this.env = model.env;
                this.fileId = model.fileId;
                this.guid = model.guid;
                this.isBasicMode = model.isBasicMode;
                this.isPartitionTable = model.isPartitionTable;
                this.lastDdlTime = model.lastDdlTime;
                this.lastDmlTime = model.lastDmlTime;
                this.lastQueryTime = model.lastQueryTime;
                this.lifeCycle = model.lifeCycle;
                this.name = model.name;
                this.owner = model.owner;
                this.parentModelId = model.parentModelId;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.securityLevel = model.securityLevel;
                this.securityLevelAbbreviation = model.securityLevelAbbreviation;
                this.securityLevelName = model.securityLevelName;
                this.storageType = model.storageType;
                this.streamTableConfig = model.streamTableConfig;
                this.tableSizeInBytes = model.tableSizeInBytes;
                this.visitCount30d = model.visitCount30d;
            } 

            /**
             * AssetTagList.
             */
            public Builder assetTagList(java.util.List<String> assetTagList) {
                this.assetTagList = assetTagList;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DataDomainId.
             */
            public Builder dataDomainId(Long dataDomainId) {
                this.dataDomainId = dataDomainId;
                return this;
            }

            /**
             * DataDomainName.
             */
            public Builder dataDomainName(String dataDomainName) {
                this.dataDomainName = dataDomainName;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * IsBasicMode.
             */
            public Builder isBasicMode(Boolean isBasicMode) {
                this.isBasicMode = isBasicMode;
                return this;
            }

            /**
             * IsPartitionTable.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * LastDdlTime.
             */
            public Builder lastDdlTime(String lastDdlTime) {
                this.lastDdlTime = lastDdlTime;
                return this;
            }

            /**
             * LastDmlTime.
             */
            public Builder lastDmlTime(String lastDmlTime) {
                this.lastDmlTime = lastDmlTime;
                return this;
            }

            /**
             * LastQueryTime.
             */
            public Builder lastQueryTime(String lastQueryTime) {
                this.lastQueryTime = lastQueryTime;
                return this;
            }

            /**
             * LifeCycle.
             */
            public Builder lifeCycle(Long lifeCycle) {
                this.lifeCycle = lifeCycle;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ParentModelId.
             */
            public Builder parentModelId(String parentModelId) {
                this.parentModelId = parentModelId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(Long securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * SecurityLevelAbbreviation.
             */
            public Builder securityLevelAbbreviation(String securityLevelAbbreviation) {
                this.securityLevelAbbreviation = securityLevelAbbreviation;
                return this;
            }

            /**
             * SecurityLevelName.
             */
            public Builder securityLevelName(String securityLevelName) {
                this.securityLevelName = securityLevelName;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * StreamTableConfig.
             */
            public Builder streamTableConfig(java.util.List<StreamTableConfig> streamTableConfig) {
                this.streamTableConfig = streamTableConfig;
                return this;
            }

            /**
             * TableSizeInBytes.
             */
            public Builder tableSizeInBytes(Long tableSizeInBytes) {
                this.tableSizeInBytes = tableSizeInBytes;
                return this;
            }

            /**
             * VisitCount30d.
             */
            public Builder visitCount30d(Long visitCount30d) {
                this.visitCount30d = visitCount30d;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableList")
        private java.util.List<TableList> tableList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.tableList = builder.tableList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return tableList
         */
        public java.util.List<TableList> getTableList() {
            return this.tableList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<TableList> tableList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.tableList = model.tableList;
                this.totalCount = model.totalCount;
            } 

            /**
             * TableList.
             */
            public Builder tableList(java.util.List<TableList> tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
