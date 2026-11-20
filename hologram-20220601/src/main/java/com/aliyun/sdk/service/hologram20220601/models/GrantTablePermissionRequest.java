// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GrantTablePermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantTablePermissionRequest</p>
 */
public class GrantTablePermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allTable")
    private Boolean allTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columnNames")
    private java.util.List<String> columnNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("privileges")
    private java.util.List<String> privileges;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("schemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private GrantTablePermissionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.allTable = builder.allTable;
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.privileges = builder.privileges;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantTablePermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return allTable
     */
    public Boolean getAllTable() {
        return this.allTable;
    }

    /**
     * @return columnNames
     */
    public java.util.List<String> getColumnNames() {
        return this.columnNames;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return privileges
     */
    public java.util.List<String> getPrivileges() {
        return this.privileges;
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GrantTablePermissionRequest, Builder> {
        private String instanceId; 
        private Boolean allTable; 
        private java.util.List<String> columnNames; 
        private String databaseName; 
        private java.util.List<String> privileges; 
        private String schemaName; 
        private String tableName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GrantTablePermissionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.allTable = request.allTable;
            this.columnNames = request.columnNames;
            this.databaseName = request.databaseName;
            this.privileges = request.privileges;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
            this.userName = request.userName;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-zpr3426xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to grant permissions on all existing tables.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allTable(Boolean allTable) {
            this.putBodyParameter("allTable", allTable);
            this.allTable = allTable;
            return this;
        }

        /**
         * <p>The list of column names to grant permissions on.</p>
         */
        public Builder columnNames(java.util.List<String> columnNames) {
            this.putBodyParameter("columnNames", columnNames);
            this.columnNames = columnNames;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_db</p>
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The list of permissions.</p>
         */
        public Builder privileges(java.util.List<String> privileges) {
            this.putBodyParameter("privileges", privileges);
            this.privileges = privileges;
            return this;
        }

        /**
         * <p>The schema name.</p>
         * 
         * <strong>example:</strong>
         * <p>my_schema</p>
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>orders_pay</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The user ID. For more information, see <a href="https://help.aliyun.com/document_detail/130393.html">Hologres account overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>p4_1234xxxx</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GrantTablePermissionRequest build() {
            return new GrantTablePermissionRequest(this);
        } 

    } 

}
