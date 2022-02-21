// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
    @NameInMap("ConnectionString")
    @Validation(required = true)
    private String connectionString;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("NewPort")
    @Validation(required = true)
    private String newPort;

    @Query
    @NameInMap("NewPrefix")
    @Validation(required = true)
    private String newPrefix;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyDBInstanceConnectionStringRequest(Builder builder) {
        super(builder);
        this.connectionString = builder.connectionString;
        this.DBInstanceName = builder.DBInstanceName;
        this.newPort = builder.newPort;
        this.newPrefix = builder.newPrefix;
        this.regionId = builder.regionId;
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
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return newPort
     */
    public String getNewPort() {
        return this.newPort;
    }

    /**
     * @return newPrefix
     */
    public String getNewPrefix() {
        return this.newPrefix;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionStringRequest, Builder> {
        private String connectionString; 
        private String DBInstanceName; 
        private String newPort; 
        private String newPrefix; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConnectionStringRequest response) {
            super(response);
            this.connectionString = response.connectionString;
            this.DBInstanceName = response.DBInstanceName;
            this.newPort = response.newPort;
            this.newPrefix = response.newPrefix;
            this.regionId = response.regionId;
        } 

        /**
         * ConnectionString.
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * NewPort.
         */
        public Builder newPort(String newPort) {
            this.putQueryParameter("NewPort", newPort);
            this.newPort = newPort;
            return this;
        }

        /**
         * NewPrefix.
         */
        public Builder newPrefix(String newPrefix) {
            this.putQueryParameter("NewPrefix", newPrefix);
            this.newPrefix = newPrefix;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDBInstanceConnectionStringRequest build() {
            return new ModifyDBInstanceConnectionStringRequest(this);
        } 

    } 

}
