// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupBroadcastTablesRequest} extends {@link RequestModel}
 *
 * <p>SetupBroadcastTablesRequest</p>
 */
public class SetupBroadcastTablesRequest extends Request {
    @Query
    @NameInMap("Active")
    @Validation(required = true)
    private Boolean active;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private java.util.List < String > tableName;

    private SetupBroadcastTablesRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupBroadcastTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableName
     */
    public java.util.List < String > getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<SetupBroadcastTablesRequest, Builder> {
        private Boolean active; 
        private String dbName; 
        private String drdsInstanceId; 
        private String regionId; 
        private java.util.List < String > tableName; 

        private Builder() {
            super();
        } 

        private Builder(SetupBroadcastTablesRequest request) {
            super(request);
            this.active = request.active;
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.regionId = request.regionId;
            this.tableName = request.tableName;
        } 

        /**
         * Specifies whether to activate a broadcast table for the database.
         */
        public Builder active(Boolean active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * The name of the database for which you want to configure a broadcast table.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The ID of the region in which the PolarDB-X 1.0 instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder tableName(java.util.List < String > tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public SetupBroadcastTablesRequest build() {
            return new SetupBroadcastTablesRequest(this);
        } 

    } 

}
