// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConnectDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ConnectDatabaseRequest</p>
 */
public class ConnectDatabaseRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    private ConnectDatabaseRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.dbPassword = builder.dbPassword;
        this.dbType = builder.dbType;
        this.dbUserName = builder.dbUserName;
        this.gatewayId = builder.gatewayId;
        this.host = builder.host;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<ConnectDatabaseRequest, Builder> {
        private String dbName; 
        private String dbPassword; 
        private String dbType; 
        private String dbUserName; 
        private String gatewayId; 
        private String host; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(ConnectDatabaseRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.dbPassword = request.dbPassword;
            this.dbType = request.dbType;
            this.dbUserName = request.dbUserName;
            this.gatewayId = request.gatewayId;
            this.host = request.host;
            this.port = request.port;
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
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
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
         * Port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public ConnectDatabaseRequest build() {
            return new ConnectDatabaseRequest(this);
        } 

    } 

}
