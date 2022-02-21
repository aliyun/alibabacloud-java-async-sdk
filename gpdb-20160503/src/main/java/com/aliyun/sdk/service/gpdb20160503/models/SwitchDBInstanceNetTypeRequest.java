// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceNetTypeRequest} extends {@link RequestModel}
 *
 * <p>SwitchDBInstanceNetTypeRequest</p>
 */
public class SwitchDBInstanceNetTypeRequest extends Request {
    @Query
    @NameInMap("ConnectionStringPrefix")
    @Validation(required = true)
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Port")
    @Validation(required = true)
    private String port;

    private SwitchDBInstanceNetTypeRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBInstanceId = builder.DBInstanceId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchDBInstanceNetTypeRequest create() {
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

    public static final class Builder extends Request.Builder<SwitchDBInstanceNetTypeRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBInstanceId; 
        private String port; 

        private Builder() {
            super();
        } 

        private Builder(SwitchDBInstanceNetTypeRequest response) {
            super(response);
            this.connectionStringPrefix = response.connectionStringPrefix;
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
        public SwitchDBInstanceNetTypeRequest build() {
            return new SwitchDBInstanceNetTypeRequest(this);
        } 

    } 

}
