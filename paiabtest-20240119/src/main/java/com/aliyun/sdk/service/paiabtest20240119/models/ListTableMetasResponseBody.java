// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableMetasResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableMetasResponseBody</p>
 */
public class ListTableMetasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TableMetas")
    private java.util.List < TableMetas> tableMetas;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTableMetasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tableMetas = builder.tableMetas;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableMetasResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tableMetas
     */
    public java.util.List < TableMetas> getTableMetas() {
        return this.tableMetas;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TableMetas> tableMetas; 
        private Long totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TableMetas.
         */
        public Builder tableMetas(java.util.List < TableMetas> tableMetas) {
            this.tableMetas = tableMetas;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTableMetasResponseBody build() {
            return new ListTableMetasResponseBody(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meaning")
        private String meaning;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.meaning = builder.meaning;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return meaning
         */
        public String getMeaning() {
            return this.meaning;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String meaning; 
            private String name; 
            private String type; 

            /**
             * Meaning.
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    public static class TableMetas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("DatasourceInfo")
        private String datasourceInfo;

        @com.aliyun.core.annotation.NameInMap("DatasourceType")
        private String datasourceType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List < Fields> fields;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TableMetaId")
        private String tableMetaId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private TableMetas(Builder builder) {
            this.canDelete = builder.canDelete;
            this.datasourceInfo = builder.datasourceInfo;
            this.datasourceType = builder.datasourceType;
            this.description = builder.description;
            this.fields = builder.fields;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.tableMetaId = builder.tableMetaId;
            this.tableName = builder.tableName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMetas create() {
            return builder().build();
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return datasourceInfo
         */
        public String getDatasourceInfo() {
            return this.datasourceInfo;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fields
         */
        public java.util.List < Fields> getFields() {
            return this.fields;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tableMetaId
         */
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private Boolean canDelete; 
            private String datasourceInfo; 
            private String datasourceType; 
            private String description; 
            private java.util.List < Fields> fields; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String tableMetaId; 
            private String tableName; 
            private String workspaceId; 

            /**
             * CanDelete.
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * DatasourceInfo.
             */
            public Builder datasourceInfo(String datasourceInfo) {
                this.datasourceInfo = datasourceInfo;
                return this;
            }

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
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
             * Fields.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
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
             * TableMetaId.
             */
            public Builder tableMetaId(String tableMetaId) {
                this.tableMetaId = tableMetaId;
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
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public TableMetas build() {
                return new TableMetas(this);
            } 

        } 

    }
}
