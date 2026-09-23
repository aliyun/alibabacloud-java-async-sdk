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
 * {@link GetSecurityIdentifyResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityIdentifyResultResponseBody</p>
 */
public class GetSecurityIdentifyResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIdentifyResultInfo")
    private SecurityIdentifyResultInfo securityIdentifyResultInfo;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSecurityIdentifyResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securityIdentifyResultInfo = builder.securityIdentifyResultInfo;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityIdentifyResultResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIdentifyResultInfo
     */
    public SecurityIdentifyResultInfo getSecurityIdentifyResultInfo() {
        return this.securityIdentifyResultInfo;
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
        private String requestId; 
        private SecurityIdentifyResultInfo securityIdentifyResultInfo; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSecurityIdentifyResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.securityIdentifyResultInfo = model.securityIdentifyResultInfo;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>The identification result details.</p>
         */
        public Builder securityIdentifyResultInfo(SecurityIdentifyResultInfo securityIdentifyResultInfo) {
            this.securityIdentifyResultInfo = securityIdentifyResultInfo;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSecurityIdentifyResultResponseBody build() {
            return new GetSecurityIdentifyResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityIdentifyResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityIdentifyResultResponseBody</p>
     */
    public static class SecurityIdentifyResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizDate")
        private String bizDate;

        @com.aliyun.core.annotation.NameInMap("BizUnitDisplayName")
        private String bizUnitDisplayName;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("ClassifyAbbreviation")
        private String classifyAbbreviation;

        @com.aliyun.core.annotation.NameInMap("ClassifyId")
        private Long classifyId;

        @com.aliyun.core.annotation.NameInMap("ClassifyName")
        private String classifyName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private Long datasourceId;

        @com.aliyun.core.annotation.NameInMap("DatasourceName")
        private String datasourceName;

        @com.aliyun.core.annotation.NameInMap("FieldDescription")
        private String fieldDescription;

        @com.aliyun.core.annotation.NameInMap("FieldId")
        private String fieldId;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("HasBetterRule")
        private Boolean hasBetterRule;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdentifyRecordId")
        private Long identifyRecordId;

        @com.aliyun.core.annotation.NameInMap("IsCustomIdentify")
        private Boolean isCustomIdentify;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private Boolean isLocked;

        @com.aliyun.core.annotation.NameInMap("LevelAbbreviation")
        private String levelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("LevelColor")
        private Long levelColor;

        @com.aliyun.core.annotation.NameInMap("LevelIndex")
        private Long levelIndex;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProjectDisplayName")
        private String projectDisplayName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ScanTaskId")
        private Long scanTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TableCatalog")
        private String tableCatalog;

        @com.aliyun.core.annotation.NameInMap("TableDescription")
        private String tableDescription;

        @com.aliyun.core.annotation.NameInMap("TableEnv")
        private String tableEnv;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableTaskId")
        private Long tableTaskId;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private SecurityIdentifyResultInfo(Builder builder) {
            this.bizDate = builder.bizDate;
            this.bizUnitDisplayName = builder.bizUnitDisplayName;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.classifyAbbreviation = builder.classifyAbbreviation;
            this.classifyId = builder.classifyId;
            this.classifyName = builder.classifyName;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.fieldDescription = builder.fieldDescription;
            this.fieldId = builder.fieldId;
            this.fieldName = builder.fieldName;
            this.hasBetterRule = builder.hasBetterRule;
            this.id = builder.id;
            this.identifyRecordId = builder.identifyRecordId;
            this.isCustomIdentify = builder.isCustomIdentify;
            this.isLocked = builder.isLocked;
            this.levelAbbreviation = builder.levelAbbreviation;
            this.levelColor = builder.levelColor;
            this.levelIndex = builder.levelIndex;
            this.levelName = builder.levelName;
            this.modifier = builder.modifier;
            this.modifyTime = builder.modifyTime;
            this.projectDisplayName = builder.projectDisplayName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.scanTaskId = builder.scanTaskId;
            this.status = builder.status;
            this.tableCatalog = builder.tableCatalog;
            this.tableDescription = builder.tableDescription;
            this.tableEnv = builder.tableEnv;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableTaskId = builder.tableTaskId;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIdentifyResultInfo create() {
            return builder().build();
        }

        /**
         * @return bizDate
         */
        public String getBizDate() {
            return this.bizDate;
        }

        /**
         * @return bizUnitDisplayName
         */
        public String getBizUnitDisplayName() {
            return this.bizUnitDisplayName;
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
         * @return classifyAbbreviation
         */
        public String getClassifyAbbreviation() {
            return this.classifyAbbreviation;
        }

        /**
         * @return classifyId
         */
        public Long getClassifyId() {
            return this.classifyId;
        }

        /**
         * @return classifyName
         */
        public String getClassifyName() {
            return this.classifyName;
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
         * @return datasourceId
         */
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return datasourceName
         */
        public String getDatasourceName() {
            return this.datasourceName;
        }

        /**
         * @return fieldDescription
         */
        public String getFieldDescription() {
            return this.fieldDescription;
        }

        /**
         * @return fieldId
         */
        public String getFieldId() {
            return this.fieldId;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return hasBetterRule
         */
        public Boolean getHasBetterRule() {
            return this.hasBetterRule;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifyRecordId
         */
        public Long getIdentifyRecordId() {
            return this.identifyRecordId;
        }

        /**
         * @return isCustomIdentify
         */
        public Boolean getIsCustomIdentify() {
            return this.isCustomIdentify;
        }

        /**
         * @return isLocked
         */
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        /**
         * @return levelAbbreviation
         */
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
        }

        /**
         * @return levelColor
         */
        public Long getLevelColor() {
            return this.levelColor;
        }

        /**
         * @return levelIndex
         */
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
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
         * @return projectDisplayName
         */
        public String getProjectDisplayName() {
            return this.projectDisplayName;
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
         * @return scanTaskId
         */
        public Long getScanTaskId() {
            return this.scanTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableCatalog
         */
        public String getTableCatalog() {
            return this.tableCatalog;
        }

        /**
         * @return tableDescription
         */
        public String getTableDescription() {
            return this.tableDescription;
        }

        /**
         * @return tableEnv
         */
        public String getTableEnv() {
            return this.tableEnv;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableTaskId
         */
        public Long getTableTaskId() {
            return this.tableTaskId;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private String bizDate; 
            private String bizUnitDisplayName; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private String classifyAbbreviation; 
            private Long classifyId; 
            private String classifyName; 
            private String createTime; 
            private String creator; 
            private Long datasourceId; 
            private String datasourceName; 
            private String fieldDescription; 
            private String fieldId; 
            private String fieldName; 
            private Boolean hasBetterRule; 
            private Long id; 
            private Long identifyRecordId; 
            private Boolean isCustomIdentify; 
            private Boolean isLocked; 
            private String levelAbbreviation; 
            private Long levelColor; 
            private Long levelIndex; 
            private String levelName; 
            private String modifier; 
            private String modifyTime; 
            private String projectDisplayName; 
            private Long projectId; 
            private String projectName; 
            private Long scanTaskId; 
            private String status; 
            private String tableCatalog; 
            private String tableDescription; 
            private String tableEnv; 
            private String tableId; 
            private String tableName; 
            private Long tableTaskId; 
            private String tableType; 

            private Builder() {
            } 

            private Builder(SecurityIdentifyResultInfo model) {
                this.bizDate = model.bizDate;
                this.bizUnitDisplayName = model.bizUnitDisplayName;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.classifyAbbreviation = model.classifyAbbreviation;
                this.classifyId = model.classifyId;
                this.classifyName = model.classifyName;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.fieldDescription = model.fieldDescription;
                this.fieldId = model.fieldId;
                this.fieldName = model.fieldName;
                this.hasBetterRule = model.hasBetterRule;
                this.id = model.id;
                this.identifyRecordId = model.identifyRecordId;
                this.isCustomIdentify = model.isCustomIdentify;
                this.isLocked = model.isLocked;
                this.levelAbbreviation = model.levelAbbreviation;
                this.levelColor = model.levelColor;
                this.levelIndex = model.levelIndex;
                this.levelName = model.levelName;
                this.modifier = model.modifier;
                this.modifyTime = model.modifyTime;
                this.projectDisplayName = model.projectDisplayName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.scanTaskId = model.scanTaskId;
                this.status = model.status;
                this.tableCatalog = model.tableCatalog;
                this.tableDescription = model.tableDescription;
                this.tableEnv = model.tableEnv;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
                this.tableTaskId = model.tableTaskId;
                this.tableType = model.tableType;
            } 

            /**
             * <p>The business date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder bizDate(String bizDate) {
                this.bizDate = bizDate;
                return this;
            }

            /**
             * <p>The display name of the business unit in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>LD_test</p>
             */
            public Builder bizUnitDisplayName(String bizUnitDisplayName) {
                this.bizUnitDisplayName = bizUnitDisplayName;
                return this;
            }

            /**
             * <p>The business unit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The business unit name.</p>
             * 
             * <strong>example:</strong>
             * <p>LD_test</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The classification abbreviation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classifyAbbreviation(String classifyAbbreviation) {
                this.classifyAbbreviation = classifyAbbreviation;
                return this;
            }

            /**
             * <p>The classification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder classifyId(Long classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * <p>The classification name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classifyName(String classifyName) {
                this.classifyName = classifyName;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 10:30:30</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101121</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The data source name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds1</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The field description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fieldDescription(String fieldDescription) {
                this.fieldDescription = fieldDescription;
                return this;
            }

            /**
             * <p>The field ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test.col1</p>
             */
            public Builder fieldId(String fieldId) {
                this.fieldId = fieldId;
                return this;
            }

            /**
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>col1</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Indicates whether a better matching result exists.</p>
             */
            public Builder hasBetterRule(Boolean hasBetterRule) {
                this.hasBetterRule = hasBetterRule;
                return this;
            }

            /**
             * <p>The identification result ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The identification record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder identifyRecordId(Long identifyRecordId) {
                this.identifyRecordId = identifyRecordId;
                return this;
            }

            /**
             * <p>Indicates whether a custom tagging rule is used.</p>
             */
            public Builder isCustomIdentify(Boolean isCustomIdentify) {
                this.isCustomIdentify = isCustomIdentify;
                return this;
            }

            /**
             * <p>Indicates whether the result is locked.</p>
             */
            public Builder isLocked(Boolean isLocked) {
                this.isLocked = isLocked;
                return this;
            }

            /**
             * <p>The sensitivity level abbreviation.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder levelAbbreviation(String levelAbbreviation) {
                this.levelAbbreviation = levelAbbreviation;
                return this;
            }

            /**
             * <p>The sensitivity level color.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder levelColor(Long levelColor) {
                this.levelColor = levelColor;
                return this;
            }

            /**
             * <p>The sensitivity level index.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder levelIndex(Long levelIndex) {
                this.levelIndex = levelIndex;
                return this;
            }

            /**
             * <p>The sensitivity level name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * <p>The modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 10:30:30</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The display name of the project in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectDisplayName(String projectDisplayName) {
                this.projectDisplayName = projectDisplayName;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101121</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The scan task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder scanTaskId(Long scanTaskId) {
                this.scanTaskId = scanTaskId;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>ENABLE: enabled.</li>
             * <li>DISABLE: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The table catalog.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder tableCatalog(String tableCatalog) {
                this.tableCatalog = tableCatalog;
                return this;
            }

            /**
             * <p>The table description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableDescription(String tableDescription) {
                this.tableDescription = tableDescription;
                return this;
            }

            /**
             * <p>The table environment.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder tableEnv(String tableEnv) {
                this.tableEnv = tableEnv;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>t_test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The identification table task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder tableTaskId(Long tableTaskId) {
                this.tableTaskId = tableTaskId;
                return this;
            }

            /**
             * <p>The table type. Valid values:</p>
             * <ul>
             * <li>LOGIC_TABLE: logical table.</li>
             * <li>LOGIC_DIM_TABLE: logical dimension table.</li>
             * <li>LOGIC_FACT_TABLE: fact logical table.</li>
             * <li>LOGIC_SUM_TABLE: aggregate logical table.</li>
             * <li>LOGIC_ODM_SOURCE: source table.</li>
             * <li>LOGIC_LABEL_TABLE: label logical table.</li>
             * <li>PHYSICAL_TABLE: physical table.</li>
             * <li>REAL_TIME_LOGIC_TABLE: real-time configured logical table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LOGIC_TABLE</p>
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public SecurityIdentifyResultInfo build() {
                return new SecurityIdentifyResultInfo(this);
            } 

        } 

    }
}
