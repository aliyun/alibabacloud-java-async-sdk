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
 * {@link RevokeSchemaPermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeSchemaPermissionRequest</p>
 */
public class RevokeSchemaPermissionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private RevokeSchemaPermissionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.databaseName = builder.databaseName;
        this.privileges = builder.privileges;
        this.schemaName = builder.schemaName;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeSchemaPermissionRequest create() {
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
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RevokeSchemaPermissionRequest, Builder> {
        private String instanceId; 
        private String databaseName; 
        private java.util.List<String> privileges; 
        private String schemaName; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSchemaPermissionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.databaseName = request.databaseName;
            this.privileges = request.privileges;
            this.schemaName = request.schemaName;
            this.userName = request.userName;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
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
        public RevokeSchemaPermissionRequest build() {
            return new RevokeSchemaPermissionRequest(this);
        } 

    } 

}
