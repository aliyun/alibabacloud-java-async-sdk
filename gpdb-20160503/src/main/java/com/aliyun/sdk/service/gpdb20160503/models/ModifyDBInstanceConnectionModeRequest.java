// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceConnectionModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceConnectionModeRequest</p>
 */
public class ModifyDBInstanceConnectionModeRequest extends Request {
    @Query
    @NameInMap("ConnectionMode")
    @Validation(required = true)
    private String connectionMode;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private ModifyDBInstanceConnectionModeRequest(Builder builder) {
        super(builder);
        this.connectionMode = builder.connectionMode;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionMode
     */
    public String getConnectionMode() {
        return this.connectionMode;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceConnectionModeRequest, Builder> {
        private String connectionMode; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceConnectionModeRequest response) {
            super(response);
            this.connectionMode = response.connectionMode;
            this.DBInstanceId = response.DBInstanceId;
        } 

        /**
         * ConnectionMode.
         */
        public Builder connectionMode(String connectionMode) {
            this.putQueryParameter("ConnectionMode", connectionMode);
            this.connectionMode = connectionMode;
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

        @Override
        public ModifyDBInstanceConnectionModeRequest build() {
            return new ModifyDBInstanceConnectionModeRequest(this);
        } 

    } 

}
