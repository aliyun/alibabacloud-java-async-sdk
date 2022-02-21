// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionStringRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConnectionStringRequest</p>
 */
public class ModifyDBInstanceConnectionStringRequest extends Request {
    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("CurrentConnectionString")
    @Validation(required = true)
    private String currentConnectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    private ModifyDBInstanceConnectionStringRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionStringRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionStringRequest, Builder> {
        private String connectionStringPrefix; 
        private String currentConnectionString; 
        private String DBInstanceId; 
        private String port; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConnectionStringRequest response) {
            super(response);
            this.connectionStringPrefix = response.connectionStringPrefix;
            this.currentConnectionString = response.currentConnectionString;
            this.DBInstanceId = response.DBInstanceId;
            this.port = response.port;
        } 

        /**
         * ConnectionStringPrefix.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * CurrentConnectionString.
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public ModifyDBInstanceConnectionStringRequest build() {
            return new ModifyDBInstanceConnectionStringRequest(this);
        } 

    } 

}
