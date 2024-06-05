// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseRequest</p>
 */
public class ModifyDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbDescription")
    private String dbDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbPassword")
    private String dbPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbUserName")
    private String dbUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    private ModifyDatabaseRequest(Builder builder) {
        super(builder);
        this.dbDescription = builder.dbDescription;
        this.dbName = builder.dbName;
        this.dbPassword = builder.dbPassword;
        this.dbType = builder.dbType;
        this.dbUserName = builder.dbUserName;
        this.host = builder.host;
        this.instanceId = builder.instanceId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbDescription
     */
    public String getDbDescription() {
        return this.dbDescription;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dbPassword
     */
    public String getDbPassword() {
        return this.dbPassword;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return dbUserName
     */
    public String getDbUserName() {
        return this.dbUserName;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseRequest, Builder> {
        private String dbDescription; 
        private String dbName; 
        private String dbPassword; 
        private String dbType; 
        private String dbUserName; 
        private String host; 
        private String instanceId; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseRequest request) {
            super(request);
            this.dbDescription = request.dbDescription;
            this.dbName = request.dbName;
            this.dbPassword = request.dbPassword;
            this.dbType = request.dbType;
            this.dbUserName = request.dbUserName;
            this.host = request.host;
            this.instanceId = request.instanceId;
            this.port = request.port;
        } 

        /**
         * DbDescription.
         */
        public Builder dbDescription(String dbDescription) {
            this.putBodyParameter("DbDescription", dbDescription);
            this.dbDescription = dbDescription;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DbPassword.
         */
        public Builder dbPassword(String dbPassword) {
            this.putBodyParameter("DbPassword", dbPassword);
            this.dbPassword = dbPassword;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putBodyParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * DbUserName.
         */
        public Builder dbUserName(String dbUserName) {
            this.putBodyParameter("DbUserName", dbUserName);
            this.dbUserName = dbUserName;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public ModifyDatabaseRequest build() {
            return new ModifyDatabaseRequest(this);
        } 

    } 

}
