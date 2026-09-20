// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableMetaResponseBody</p>
 */
public class GetTableMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanDelete")
    private Boolean canDelete;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("ResourceUri")
    private String resourceUri;

    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    private String tableMetaId;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GetTableMetaResponseBody(Builder builder) {
        this.canDelete = builder.canDelete;
        this.config = builder.config;
        this.description = builder.description;
        this.fields = builder.fields;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtImportedTime = builder.gmtImportedTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.module = builder.module;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.resourceUri = builder.resourceUri;
        this.tableMetaId = builder.tableMetaId;
        this.tableName = builder.tableName;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableMetaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Fields> getFields() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return resourceUri
     */
    public String getResourceUri() {
        return this.resourceUri;
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
        private java.util.List<Fields> fields; 
        private String gmtCreateTime; 
        private String gmtImportedTime; 
        private String gmtModifiedTime; 
        private String module; 
        private String name; 
        private String requestId; 
        private String resourceId; 
        private String resourceType; 
        private String resourceUri; 
        private String tableMetaId; 
        private String tableName; 
        private String type; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetTableMetaResponseBody model) {
            this.canDelete = model.canDelete;
            this.config = model.config;
            this.description = model.description;
            this.fields = model.fields;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtImportedTime = model.gmtImportedTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.module = model.module;
            this.name = model.name;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
            this.resourceUri = model.resourceUri;
            this.tableMetaId = model.tableMetaId;
            this.tableName = model.tableName;
            this.type = model.type;
            this.url = model.url;
        } 

        /**
         * <p>Indicates whether the table can be deleted. The value is <code>false</code> if other resources reference the table.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder canDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }

        /**
         * <p>Additional configurations for the table, provided as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;table_type&quot;:&quot;item&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The table description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test table</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The fields in the table.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15:24:33</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The import time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtImportedTime(String gmtImportedTime) {
            this.gmtImportedTime = gmtImportedTime;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15:24:33</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The table module. Valid values:</p>
         * <ul>
         * <li><p><code>ABTest</code>: An A/B testing data table.</p>
         * </li>
         * <li><p><code>ExperimentTool</code>: An experiment tool table.</p>
         * </li>
         * <li><p><code>DataDiagnosis</code>: A table for data diagnosis.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ABTest</p>
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>28C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>reso-wkgo***</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ResourceUri.
         */
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder tableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * <p>The name of the table in the database.</p>
         * 
         * <strong>example:</strong>
         * <p>table_mysql</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The table type. Valid values:</p>
         * <ul>
         * <li><p><code>MaxCompute</code></p>
         * </li>
         * <li><p><code>Hologres</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The URL of the table in Data Map. This parameter is returned only for MaxCompute tables.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dmc-xxx.com/dm/table/xxx">https://dmc-xxx.com/dm/table/xxx</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetTableMetaResponseBody build() {
            return new GetTableMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableMetaResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Fields model) {
                this.isDimensionField = model.isDimensionField;
                this.meaning = model.meaning;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Whether the field is a dimension field.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDimensionField(Boolean isDimensionField) {
                this.isDimensionField = isDimensionField;
                return this;
            }

            /**
             * <p>The field meaning.</p>
             * 
             * <strong>example:</strong>
             * <p>the gender of people</p>
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
                return this;
            }

            /**
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>gender</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The field type.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
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
}
