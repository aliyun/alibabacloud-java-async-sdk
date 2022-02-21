// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSSLRequest</p>
 */
public class ModifyDBInstanceSSLRequest extends Request {
    @Query
    @NameInMap("ConnectionString")
    private String connectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("SSLEnabled")
    @Validation(required = true)
    private Integer SSLEnabled;

    private ModifyDBInstanceSSLRequest(Builder builder) {
        super(builder);
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.SSLEnabled = builder.SSLEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSSLRequest create() {
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return SSLEnabled
     */
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSSLRequest, Builder> {
        private String connectionString; 
        private String DBInstanceId; 
        private Integer SSLEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSSLRequest response) {
            super(response);
            this.connectionString = response.connectionString;
            this.DBInstanceId = response.DBInstanceId;
            this.SSLEnabled = response.SSLEnabled;
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(Integer SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        @Override
        public ModifyDBInstanceSSLRequest build() {
            return new ModifyDBInstanceSSLRequest(this);
        } 

    } 

}
