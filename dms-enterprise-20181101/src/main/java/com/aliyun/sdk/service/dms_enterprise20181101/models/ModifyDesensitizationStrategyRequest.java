// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ModifyDesensitizationStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesensitizationStrategyRequest</p>
 */
public class ModifyDesensitizationStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsLogic")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean isLogic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReset")
    private Boolean isReset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Integer ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ModifyDesensitizationStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnName = builder.columnName;
        this.dbId = builder.dbId;
        this.isDefault = builder.isDefault;
        this.isLogic = builder.isLogic;
        this.isReset = builder.isReset;
        this.ruleId = builder.ruleId;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesensitizationStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return isLogic
     */
    public Boolean getIsLogic() {
        return this.isLogic;
    }

    /**
     * @return isReset
     */
    public Boolean getIsReset() {
        return this.isReset;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ModifyDesensitizationStrategyRequest, Builder> {
        private String regionId; 
        private String columnName; 
        private Integer dbId; 
        private Boolean isDefault; 
        private Boolean isLogic; 
        private Boolean isReset; 
        private Integer ruleId; 
        private String schemaName; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesensitizationStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnName = request.columnName;
            this.dbId = request.dbId;
            this.isDefault = request.isDefault;
            this.isLogic = request.isLogic;
            this.isReset = request.isReset;
            this.ruleId = request.ruleId;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the field. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the field name.</p>
         * <blockquote>
         * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141870.html">ListColumns</a> operation to obtain the field name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_column</p>
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The desensitization algorithm of the field setting. The default value is false. The values are as follows:</p>
         * <ul>
         * <li><p><strong>true</strong>: default desensitization algorithm.</p>
         * </li>
         * <li><p><strong>false</strong> :semi-desensitization algorithm.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a physical database.</li>
         * <li><strong>false</strong>: The database is a logical database.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isLogic(Boolean isLogic) {
            this.putQueryParameter("IsLogic", isLogic);
            this.isLogic = isLogic;
            return this;
        }

        /**
         * <p>Specifies whether to reset the masking rule. Valid value:</p>
         * <ul>
         * <li><strong>true</strong>: Reset the masking rule.</li>
         * <li><strong>false</strong>: Do not reset the masking rule. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isReset(Boolean isReset) {
            this.putQueryParameter("IsReset", isReset);
            this.isReset = isReset;
            return this;
        }

        /**
         * <p>The ID of the masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the database. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the database name.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the database is a physical database, you can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the database name.</p>
         * </li>
         * <li><p>If the database is a logical database, you can call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to obtain the name of the database.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_schema</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/188103.html">ListSensitiveColumns</a> operation to obtain the table name.</p>
         * <blockquote>
         * <p> You can also call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the table name.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> in the topic &quot;Manage DMS tenants.&quot;</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ModifyDesensitizationStrategyRequest build() {
            return new ModifyDesensitizationStrategyRequest(this);
        } 

    } 

}
