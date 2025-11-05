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
 * {@link RevokeTablePermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeTablePermissionRequest</p>
 */
public class RevokeTablePermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allTable")
    private Boolean allTable;

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

    private RevokeTablePermissionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.allTable = builder.allTable;
        this.databaseName = builder.databaseName;
        this.privileges = builder.privileges;
        this.schemaName = builder.schemaName;
        this.tableName = builder.tableName;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTablePermissionRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeTablePermissionRequest, Builder> {
        private String instanceId; 
        private Boolean allTable; 
        private String databaseName; 
        private java.util.List<String> privileges; 
        private String schemaName; 
        private String tableName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RevokeTablePermissionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.allTable = request.allTable;
            this.databaseName = request.databaseName;
            this.privileges = request.privileges;
            this.schemaName = request.schemaName;
            this.tableName = request.tableName;
            this.userName = request.userName;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * allTable.
         */
        public Builder allTable(Boolean allTable) {
            this.putBodyParameter("allTable", allTable);
            this.allTable = allTable;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * privileges.
         */
        public Builder privileges(java.util.List<String> privileges) {
            this.putBodyParameter("privileges", privileges);
            this.privileges = privileges;
            return this;
        }

        /**
         * schemaName.
         */
        public Builder schemaName(String schemaName) {
            this.putBodyParameter("schemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public RevokeTablePermissionRequest build() {
            return new RevokeTablePermissionRequest(this);
        } 

    } 

}
