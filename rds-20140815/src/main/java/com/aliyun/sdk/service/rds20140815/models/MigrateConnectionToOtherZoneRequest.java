// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateConnectionToOtherZoneRequest} extends {@link RequestModel}
 *
 * <p>MigrateConnectionToOtherZoneRequest</p>
 */
public class MigrateConnectionToOtherZoneRequest extends Request {
    @Query
    @NameInMap("ConnectionString")
    @Validation(required = true)
    private String connectionString;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private MigrateConnectionToOtherZoneRequest(Builder builder) {
        super(builder);
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateConnectionToOtherZoneRequest create() {
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<MigrateConnectionToOtherZoneRequest, Builder> {
        private String connectionString; 
        private String DBInstanceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateConnectionToOtherZoneRequest request) {
            super(request);
            this.connectionString = request.connectionString;
            this.DBInstanceId = request.DBInstanceId;
            this.zoneId = request.zoneId;
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
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public MigrateConnectionToOtherZoneRequest build() {
            return new MigrateConnectionToOtherZoneRequest(this);
        } 

    } 

}
