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
 * {@link ListSecurityIdentifyRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityIdentifyRecordsResponseBody</p>
 */
public class ListSecurityIdentifyRecordsResponseBody extends TeaModel {
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

    private ListSecurityIdentifyRecordsResponseBody(Builder builder) {
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

    public static ListSecurityIdentifyRecordsResponseBody create() {
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

        private Builder(ListSecurityIdentifyRecordsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
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
         * <p>The paged query result.</p>
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
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSecurityIdentifyRecordsResponseBody build() {
            return new ListSecurityIdentifyRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityIdentifyRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityIdentifyRecordsResponseBody</p>
     */
    public static class IdentifyRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualIdentifyRate")
        private Double actualIdentifyRate;

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

        @com.aliyun.core.annotation.NameInMap("ClassifyStatus")
        private String classifyStatus;

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

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsBetterMatch")
        private Boolean isBetterMatch;

        @com.aliyun.core.annotation.NameInMap("IsCustomIdentify")
        private Boolean isCustomIdentify;

        @com.aliyun.core.annotation.NameInMap("IsLocked")
        private Boolean isLocked;

        @com.aliyun.core.annotation.NameInMap("LevelAbbreviation")
        private String levelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("LevelIndex")
        private Long levelIndex;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("ProjectDisplayName")
        private String projectDisplayName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("TableDescription")
        private String tableDescription;

        @com.aliyun.core.annotation.NameInMap("TableEnv")
        private String tableEnv;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private IdentifyRecordList(Builder builder) {
            this.actualIdentifyRate = builder.actualIdentifyRate;
            this.bizDate = builder.bizDate;
            this.bizUnitDisplayName = builder.bizUnitDisplayName;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.classifyAbbreviation = builder.classifyAbbreviation;
            this.classifyId = builder.classifyId;
            this.classifyName = builder.classifyName;
            this.classifyStatus = builder.classifyStatus;
            this.datasourceId = builder.datasourceId;
            this.datasourceName = builder.datasourceName;
            this.fieldDescription = builder.fieldDescription;
            this.fieldId = builder.fieldId;
            this.fieldName = builder.fieldName;
            this.id = builder.id;
            this.isBetterMatch = builder.isBetterMatch;
            this.isCustomIdentify = builder.isCustomIdentify;
            this.isLocked = builder.isLocked;
            this.levelAbbreviation = builder.levelAbbreviation;
            this.levelIndex = builder.levelIndex;
            this.levelName = builder.levelName;
            this.projectDisplayName = builder.projectDisplayName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.tableDescription = builder.tableDescription;
            this.tableEnv = builder.tableEnv;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentifyRecordList create() {
            return builder().build();
        }

        /**
         * @return actualIdentifyRate
         */
        public Double getActualIdentifyRate() {
            return this.actualIdentifyRate;
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
         * @return classifyStatus
         */
        public String getClassifyStatus() {
            return this.classifyStatus;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isBetterMatch
         */
        public Boolean getIsBetterMatch() {
            return this.isBetterMatch;
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
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private Double actualIdentifyRate; 
            private String bizDate; 
            private String bizUnitDisplayName; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private String classifyAbbreviation; 
            private Long classifyId; 
            private String classifyName; 
            private String classifyStatus; 
            private Long datasourceId; 
            private String datasourceName; 
            private String fieldDescription; 
            private String fieldId; 
            private String fieldName; 
            private Long id; 
            private Boolean isBetterMatch; 
            private Boolean isCustomIdentify; 
            private Boolean isLocked; 
            private String levelAbbreviation; 
            private Long levelIndex; 
            private String levelName; 
            private String projectDisplayName; 
            private Long projectId; 
            private String projectName; 
            private String tableDescription; 
            private String tableEnv; 
            private String tableId; 
            private String tableName; 
            private String tableType; 

            private Builder() {
            } 

            private Builder(IdentifyRecordList model) {
                this.actualIdentifyRate = model.actualIdentifyRate;
                this.bizDate = model.bizDate;
                this.bizUnitDisplayName = model.bizUnitDisplayName;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.classifyAbbreviation = model.classifyAbbreviation;
                this.classifyId = model.classifyId;
                this.classifyName = model.classifyName;
                this.classifyStatus = model.classifyStatus;
                this.datasourceId = model.datasourceId;
                this.datasourceName = model.datasourceName;
                this.fieldDescription = model.fieldDescription;
                this.fieldId = model.fieldId;
                this.fieldName = model.fieldName;
                this.id = model.id;
                this.isBetterMatch = model.isBetterMatch;
                this.isCustomIdentify = model.isCustomIdentify;
                this.isLocked = model.isLocked;
                this.levelAbbreviation = model.levelAbbreviation;
                this.levelIndex = model.levelIndex;
                this.levelName = model.levelName;
                this.projectDisplayName = model.projectDisplayName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.tableDescription = model.tableDescription;
                this.tableEnv = model.tableEnv;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
                this.tableType = model.tableType;
            } 

            /**
             * <p>The actual match rate.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
             */
            public Builder actualIdentifyRate(Double actualIdentifyRate) {
                this.actualIdentifyRate = actualIdentifyRate;
                return this;
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
             * <p>The display name of the business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>test_abc</p>
             */
            public Builder bizUnitDisplayName(String bizUnitDisplayName) {
                this.bizUnitDisplayName = bizUnitDisplayName;
                return this;
            }

            /**
             * <p>The ID of the business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The name of the business unit.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The abbreviation of the classification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classifyAbbreviation(String classifyAbbreviation) {
                this.classifyAbbreviation = classifyAbbreviation;
                return this;
            }

            /**
             * <p>The ID of the classification.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder classifyId(Long classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * <p>The name of the classification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classifyName(String classifyName) {
                this.classifyName = classifyName;
                return this;
            }

            /**
             * <p>The status of the classification. Valid values:</p>
             * <ul>
             * <li>ENABLE: Enabled.</li>
             * <li>DISABLE: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder classifyStatus(String classifyStatus) {
                this.classifyStatus = classifyStatus;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder datasourceName(String datasourceName) {
                this.datasourceName = datasourceName;
                return this;
            }

            /**
             * <p>The description of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fieldDescription(String fieldDescription) {
                this.fieldDescription = fieldDescription;
                return this;
            }

            /**
             * <p>The ID of the field.</p>
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
             * <p>The ID of the identification record.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether this is a better match.</p>
             */
            public Builder isBetterMatch(Boolean isBetterMatch) {
                this.isBetterMatch = isBetterMatch;
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
             * <p>Indicates whether the record is locked.</p>
             */
            public Builder isLocked(Boolean isLocked) {
                this.isLocked = isLocked;
                return this;
            }

            /**
             * <p>The abbreviated name of the level.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder levelAbbreviation(String levelAbbreviation) {
                this.levelAbbreviation = levelAbbreviation;
                return this;
            }

            /**
             * <p>The level index.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder levelIndex(Long levelIndex) {
                this.levelIndex = levelIndex;
                return this;
            }

            /**
             * <p>The name of the level.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
                return this;
            }

            /**
             * <p>The display name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>test_abc</p>
             */
            public Builder projectDisplayName(String projectDisplayName) {
                this.projectDisplayName = projectDisplayName;
                return this;
            }

            /**
             * <p>The ID of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The description of the table.</p>
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
             * <p>The ID of the table.</p>
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
             * <p>The type of the table. Valid values:</p>
             * <ul>
             * <li>LOGIC_TABLE: logical table.</li>
             * <li>LOGIC_DIM_TABLE: logical dimension table.</li>
             * <li>LOGIC_FACT_TABLE: logical fact table.</li>
             * <li>LOGIC_SUM_TABLE: logical summary table.</li>
             * <li>LOGIC_ODM_SOURCE: source table.</li>
             * <li>LOGIC_LABEL_TABLE: logical label table.</li>
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

            public IdentifyRecordList build() {
                return new IdentifyRecordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecurityIdentifyRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityIdentifyRecordsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentifyRecordList")
        private java.util.List<IdentifyRecordList> identifyRecordList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.identifyRecordList = builder.identifyRecordList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return identifyRecordList
         */
        public java.util.List<IdentifyRecordList> getIdentifyRecordList() {
            return this.identifyRecordList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<IdentifyRecordList> identifyRecordList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.identifyRecordList = model.identifyRecordList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of identification records.</p>
             */
            public Builder identifyRecordList(java.util.List<IdentifyRecordList> identifyRecordList) {
                this.identifyRecordList = identifyRecordList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
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
