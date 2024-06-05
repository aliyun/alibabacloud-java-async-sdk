// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDatabaseRequest} extends {@link RequestModel}
 *
 * <p>AddDatabaseRequest</p>
 */
public class AddDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddDatabaseRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbDescription = builder.dbDescription;
        this.dbName = builder.dbName;
        this.dbPassword = builder.dbPassword;
        this.dbType = builder.dbType;
        this.dbUserName = builder.dbUserName;
        this.gatewayId = builder.gatewayId;
        this.host = builder.host;
        this.port = builder.port;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddDatabaseRequest, Builder> {
        private String clientToken; 
        private String dbDescription; 
        private String dbName; 
        private String dbPassword; 
        private String dbType; 
        private String dbUserName; 
        private String gatewayId; 
        private String host; 
        private Integer port; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddDatabaseRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbDescription = request.dbDescription;
            this.dbName = request.dbName;
            this.dbPassword = request.dbPassword;
            this.dbType = request.dbType;
            this.dbUserName = request.dbUserName;
            this.gatewayId = request.gatewayId;
            this.host = request.host;
            this.port = request.port;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddDatabaseRequest build() {
            return new AddDatabaseRequest(this);
        } 

    } 

}
