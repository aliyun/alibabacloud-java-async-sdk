// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
        @com.aliyun.core.annotation.NameInMap("IsDimensionField")
        private Boolean isDimensionField;

        @com.aliyun.core.annotation.NameInMap("Meaning")
        private String meaning;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.isDimensionField = builder.isDimensionField;
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
         * @return isDimensionField
         */
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
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
            private Boolean isDimensionField; 
            private String meaning; 
            private String name; 
            private String type; 

            /**
             * IsDimensionField.
             */
            public Builder isDimensionField(Boolean isDimensionField) {
                this.isDimensionField = isDimensionField;
                return this;
            }

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

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List < Fields> fields;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtImportedTime")
        private String gmtImportedTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TableMetaId")
        private String tableMetaId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private TableMetas(Builder builder) {
            this.canDelete = builder.canDelete;
            this.config = builder.config;
            this.description = builder.description;
            this.fields = builder.fields;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtImportedTime = builder.gmtImportedTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.module = builder.module;
            this.name = builder.name;
            this.resourceId = builder.resourceId;
            this.tableMetaId = builder.tableMetaId;
            this.tableName = builder.tableName;
            this.type = builder.type;
            this.url = builder.url;
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
         * @return config
         */
        public String getConfig() {
            return this.config;
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
         * @return gmtImportedTime
         */
        public String getGmtImportedTime() {
            return this.gmtImportedTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean canDelete; 
            private String config; 
            private String description; 
            private java.util.List < Fields> fields; 
            private String gmtCreateTime; 
            private String gmtImportedTime; 
            private String gmtModifiedTime; 
            private String module; 
            private String name; 
            private String resourceId; 
            private String tableMetaId; 
            private String tableName; 
            private String type; 
            private String url; 

            /**
             * CanDelete.
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
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
             * GmtImportedTime.
             */
            public Builder gmtImportedTime(String gmtImportedTime) {
                this.gmtImportedTime = gmtImportedTime;
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
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public TableMetas build() {
                return new TableMetas(this);
            } 

        } 

    }
}
