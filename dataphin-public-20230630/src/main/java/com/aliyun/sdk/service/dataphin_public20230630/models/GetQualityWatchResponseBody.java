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
 * {@link GetQualityWatchResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityWatchResponseBody</p>
 */
public class GetQualityWatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityWatchInfo")
    private QualityWatchInfo qualityWatchInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityWatchResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityWatchInfo = builder.qualityWatchInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityWatchResponseBody create() {
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
     * @return qualityWatchInfo
     */
    public QualityWatchInfo getQualityWatchInfo() {
        return this.qualityWatchInfo;
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
        private QualityWatchInfo qualityWatchInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityWatchResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityWatchInfo = model.qualityWatchInfo;
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
         * QualityWatchInfo.
         */
        public Builder qualityWatchInfo(QualityWatchInfo qualityWatchInfo) {
            this.qualityWatchInfo = qualityWatchInfo;
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

        public GetQualityWatchResponseBody build() {
            return new GetQualityWatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityWatchResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchResponseBody</p>
     */
    public static class DataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSourceInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.env = builder.env;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInfo create() {
            return builder().build();
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
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private String env; 
            private String id; 
            private String modifyTime; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSourceInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.env = model.env;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.type = model.type;
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
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSourceInfo build() {
                return new DataSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchResponseBody</p>
     */
    public static class IndexInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("CellSumLogicTableName")
        private String cellSumLogicTableName;

        @com.aliyun.core.annotation.NameInMap("ComputeType")
        private String computeType;

        @com.aliyun.core.annotation.NameInMap("DateType")
        private String dateType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GranularityDisplayName")
        private String granularityDisplayName;

        @com.aliyun.core.annotation.NameInMap("GranularityId")
        private Long granularityId;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IndexInfo(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.catalog = builder.catalog;
            this.cellSumLogicTableName = builder.cellSumLogicTableName;
            this.computeType = builder.computeType;
            this.dateType = builder.dateType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.granularityDisplayName = builder.granularityDisplayName;
            this.granularityId = builder.granularityId;
            this.guid = builder.guid;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexInfo create() {
            return builder().build();
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
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return cellSumLogicTableName
         */
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        /**
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
        }

        /**
         * @return dateType
         */
        public String getDateType() {
            return this.dateType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return granularityDisplayName
         */
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        /**
         * @return granularityId
         */
        public Long getGranularityId() {
            return this.granularityId;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String bizUnitName; 
            private String catalog; 
            private String cellSumLogicTableName; 
            private String computeType; 
            private String dateType; 
            private String description; 
            private String displayName; 
            private String granularityDisplayName; 
            private Long granularityId; 
            private String guid; 
            private String id; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private Long projectId; 
            private String projectName; 
            private String type; 

            private Builder() {
            } 

            private Builder(IndexInfo model) {
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.catalog = model.catalog;
                this.cellSumLogicTableName = model.cellSumLogicTableName;
                this.computeType = model.computeType;
                this.dateType = model.dateType;
                this.description = model.description;
                this.displayName = model.displayName;
                this.granularityDisplayName = model.granularityDisplayName;
                this.granularityId = model.granularityId;
                this.guid = model.guid;
                this.id = model.id;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.type = model.type;
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * CellSumLogicTableName.
             */
            public Builder cellSumLogicTableName(String cellSumLogicTableName) {
                this.cellSumLogicTableName = cellSumLogicTableName;
                return this;
            }

            /**
             * ComputeType.
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * DateType.
             */
            public Builder dateType(String dateType) {
                this.dateType = dateType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * GranularityDisplayName.
             */
            public Builder granularityDisplayName(String granularityDisplayName) {
                this.granularityDisplayName = granularityDisplayName;
                return this;
            }

            /**
             * GranularityId.
             */
            public Builder granularityId(Long granularityId) {
                this.granularityId = granularityId;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IndexInfo build() {
                return new IndexInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchResponseBody</p>
     */
    public static class TableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("Catalog")
        private String catalog;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private String dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TableInfo(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.catalog = builder.catalog;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceType = builder.dataSourceType;
            this.description = builder.description;
            this.env = builder.env;
            this.id = builder.id;
            this.isPartitionTable = builder.isPartitionTable;
            this.name = builder.name;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
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
         * @return catalog
         */
        public String getCatalog() {
            return this.catalog;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
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
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String bizUnitName; 
            private String catalog; 
            private String dataSourceId; 
            private String dataSourceType; 
            private String description; 
            private String env; 
            private String id; 
            private Boolean isPartitionTable; 
            private String name; 
            private String owner; 
            private String ownerName; 
            private Long projectId; 
            private String projectName; 
            private String type; 

            private Builder() {
            } 

            private Builder(TableInfo model) {
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.catalog = model.catalog;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceType = model.dataSourceType;
                this.description = model.description;
                this.env = model.env;
                this.id = model.id;
                this.isPartitionTable = model.isPartitionTable;
                this.name = model.name;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.type = model.type;
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
             * Catalog.
             */
            public Builder catalog(String catalog) {
                this.catalog = catalog;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityWatchResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityWatchResponseBody</p>
     */
    public static class QualityWatchInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("DataSourceInfo")
        private DataSourceInfo dataSourceInfo;

        @com.aliyun.core.annotation.NameInMap("EnabledRuleCount")
        private Long enabledRuleCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IndexInfo")
        private IndexInfo indexInfo;

        @com.aliyun.core.annotation.NameInMap("LatestWatchTaskId")
        private Long latestWatchTaskId;

        @com.aliyun.core.annotation.NameInMap("LatestWatchTaskStatus")
        private String latestWatchTaskStatus;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QualityOwner")
        private String qualityOwner;

        @com.aliyun.core.annotation.NameInMap("QualityOwnerName")
        private String qualityOwnerName;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Long ruleCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableInfo")
        private TableInfo tableInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private QualityWatchInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.dataSourceInfo = builder.dataSourceInfo;
            this.enabledRuleCount = builder.enabledRuleCount;
            this.id = builder.id;
            this.indexInfo = builder.indexInfo;
            this.latestWatchTaskId = builder.latestWatchTaskId;
            this.latestWatchTaskStatus = builder.latestWatchTaskStatus;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.qualityOwner = builder.qualityOwner;
            this.qualityOwnerName = builder.qualityOwnerName;
            this.ruleCount = builder.ruleCount;
            this.status = builder.status;
            this.tableInfo = builder.tableInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityWatchInfo create() {
            return builder().build();
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
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return dataSourceInfo
         */
        public DataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        /**
         * @return enabledRuleCount
         */
        public Long getEnabledRuleCount() {
            return this.enabledRuleCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return indexInfo
         */
        public IndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        /**
         * @return latestWatchTaskId
         */
        public Long getLatestWatchTaskId() {
            return this.latestWatchTaskId;
        }

        /**
         * @return latestWatchTaskStatus
         */
        public String getLatestWatchTaskStatus() {
            return this.latestWatchTaskStatus;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qualityOwner
         */
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        /**
         * @return qualityOwnerName
         */
        public String getQualityOwnerName() {
            return this.qualityOwnerName;
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String creatorName; 
            private DataSourceInfo dataSourceInfo; 
            private Long enabledRuleCount; 
            private Long id; 
            private IndexInfo indexInfo; 
            private Long latestWatchTaskId; 
            private String latestWatchTaskStatus; 
            private String modifier; 
            private String modifyTime; 
            private String name; 
            private String qualityOwner; 
            private String qualityOwnerName; 
            private Long ruleCount; 
            private String status; 
            private TableInfo tableInfo; 
            private String type; 

            private Builder() {
            } 

            private Builder(QualityWatchInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.dataSourceInfo = model.dataSourceInfo;
                this.enabledRuleCount = model.enabledRuleCount;
                this.id = model.id;
                this.indexInfo = model.indexInfo;
                this.latestWatchTaskId = model.latestWatchTaskId;
                this.latestWatchTaskStatus = model.latestWatchTaskStatus;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.qualityOwner = model.qualityOwner;
                this.qualityOwnerName = model.qualityOwnerName;
                this.ruleCount = model.ruleCount;
                this.status = model.status;
                this.tableInfo = model.tableInfo;
                this.type = model.type;
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
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * DataSourceInfo.
             */
            public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
                this.dataSourceInfo = dataSourceInfo;
                return this;
            }

            /**
             * EnabledRuleCount.
             */
            public Builder enabledRuleCount(Long enabledRuleCount) {
                this.enabledRuleCount = enabledRuleCount;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IndexInfo.
             */
            public Builder indexInfo(IndexInfo indexInfo) {
                this.indexInfo = indexInfo;
                return this;
            }

            /**
             * LatestWatchTaskId.
             */
            public Builder latestWatchTaskId(Long latestWatchTaskId) {
                this.latestWatchTaskId = latestWatchTaskId;
                return this;
            }

            /**
             * LatestWatchTaskStatus.
             */
            public Builder latestWatchTaskStatus(String latestWatchTaskStatus) {
                this.latestWatchTaskStatus = latestWatchTaskStatus;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * QualityOwner.
             */
            public Builder qualityOwner(String qualityOwner) {
                this.qualityOwner = qualityOwner;
                return this;
            }

            /**
             * QualityOwnerName.
             */
            public Builder qualityOwnerName(String qualityOwnerName) {
                this.qualityOwnerName = qualityOwnerName;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
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
             * TableInfo.
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QualityWatchInfo build() {
                return new QualityWatchInfo(this);
            } 

        } 

    }
}
