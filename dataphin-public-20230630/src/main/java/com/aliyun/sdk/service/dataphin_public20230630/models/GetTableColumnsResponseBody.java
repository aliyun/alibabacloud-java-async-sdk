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
 * {@link GetTableColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableColumnsResponseBody</p>
 */
public class GetTableColumnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private java.util.List<ColumnList> columnList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableColumnsResponseBody(Builder builder) {
        this.code = builder.code;
        this.columnList = builder.columnList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableColumnsResponseBody create() {
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
     * @return columnList
     */
    public java.util.List<ColumnList> getColumnList() {
        return this.columnList;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<ColumnList> columnList; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTableColumnsResponseBody model) {
            this.code = model.code;
            this.columnList = model.columnList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * ColumnList.
         */
        public Builder columnList(java.util.List<ColumnList> columnList) {
            this.columnList = columnList;
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

        public GetTableColumnsResponseBody build() {
            return new GetTableColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableColumnsResponseBody</p>
     */
    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassifyId")
        private Long classifyId;

        @com.aliyun.core.annotation.NameInMap("ClassifyName")
        private String classifyName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataSourceId")
        private Long dataSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceType")
        private String dataSourceType;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("IsForeignKey")
        private Boolean isForeignKey;

        @com.aliyun.core.annotation.NameInMap("IsPartitionColumn")
        private Boolean isPartitionColumn;

        @com.aliyun.core.annotation.NameInMap("IsPrimaryKey")
        private Boolean isPrimaryKey;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LevelAbbreviation")
        private String levelAbbreviation;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("SeqNumber")
        private Integer seqNumber;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("VisitCount30d")
        private Long visitCount30d;

        private ColumnList(Builder builder) {
            this.classifyId = builder.classifyId;
            this.classifyName = builder.classifyName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.dataSourceId = builder.dataSourceId;
            this.dataSourceType = builder.dataSourceType;
            this.dataType = builder.dataType;
            this.defaultValue = builder.defaultValue;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.guid = builder.guid;
            this.isForeignKey = builder.isForeignKey;
            this.isPartitionColumn = builder.isPartitionColumn;
            this.isPrimaryKey = builder.isPrimaryKey;
            this.lastModifier = builder.lastModifier;
            this.levelAbbreviation = builder.levelAbbreviation;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.nullable = builder.nullable;
            this.seqNumber = builder.seqNumber;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
            this.visitCount30d = builder.visitCount30d;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
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
         * @return dataSourceId
         */
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return isForeignKey
         */
        public Boolean getIsForeignKey() {
            return this.isForeignKey;
        }

        /**
         * @return isPartitionColumn
         */
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

        /**
         * @return isPrimaryKey
         */
        public Boolean getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return levelAbbreviation
         */
        public String getLevelAbbreviation() {
            return this.levelAbbreviation;
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
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return seqNumber
         */
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return visitCount30d
         */
        public Long getVisitCount30d() {
            return this.visitCount30d;
        }

        public static final class Builder {
            private Long classifyId; 
            private String classifyName; 
            private String comment; 
            private String createTime; 
            private String creator; 
            private Long dataSourceId; 
            private String dataSourceType; 
            private String dataType; 
            private String defaultValue; 
            private String displayName; 
            private String env; 
            private String guid; 
            private Boolean isForeignKey; 
            private Boolean isPartitionColumn; 
            private Boolean isPrimaryKey; 
            private String lastModifier; 
            private String levelAbbreviation; 
            private String modifyTime; 
            private String name; 
            private Boolean nullable; 
            private Integer seqNumber; 
            private String tableGuid; 
            private String tableName; 
            private Long visitCount30d; 

            private Builder() {
            } 

            private Builder(ColumnList model) {
                this.classifyId = model.classifyId;
                this.classifyName = model.classifyName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.dataSourceId = model.dataSourceId;
                this.dataSourceType = model.dataSourceType;
                this.dataType = model.dataType;
                this.defaultValue = model.defaultValue;
                this.displayName = model.displayName;
                this.env = model.env;
                this.guid = model.guid;
                this.isForeignKey = model.isForeignKey;
                this.isPartitionColumn = model.isPartitionColumn;
                this.isPrimaryKey = model.isPrimaryKey;
                this.lastModifier = model.lastModifier;
                this.levelAbbreviation = model.levelAbbreviation;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.nullable = model.nullable;
                this.seqNumber = model.seqNumber;
                this.tableGuid = model.tableGuid;
                this.tableName = model.tableName;
                this.visitCount30d = model.visitCount30d;
            } 

            /**
             * ClassifyId.
             */
            public Builder classifyId(Long classifyId) {
                this.classifyId = classifyId;
                return this;
            }

            /**
             * ClassifyName.
             */
            public Builder classifyName(String classifyName) {
                this.classifyName = classifyName;
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
             * DataSourceId.
             */
            public Builder dataSourceId(Long dataSourceId) {
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * IsForeignKey.
             */
            public Builder isForeignKey(Boolean isForeignKey) {
                this.isForeignKey = isForeignKey;
                return this;
            }

            /**
             * IsPartitionColumn.
             */
            public Builder isPartitionColumn(Boolean isPartitionColumn) {
                this.isPartitionColumn = isPartitionColumn;
                return this;
            }

            /**
             * IsPrimaryKey.
             */
            public Builder isPrimaryKey(Boolean isPrimaryKey) {
                this.isPrimaryKey = isPrimaryKey;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LevelAbbreviation.
             */
            public Builder levelAbbreviation(String levelAbbreviation) {
                this.levelAbbreviation = levelAbbreviation;
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
             * Nullable.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * SeqNumber.
             */
            public Builder seqNumber(Integer seqNumber) {
                this.seqNumber = seqNumber;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
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
             * VisitCount30d.
             */
            public Builder visitCount30d(Long visitCount30d) {
                this.visitCount30d = visitCount30d;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
