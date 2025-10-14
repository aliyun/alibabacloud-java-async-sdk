// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyEngineMigrationRequest} extends {@link RequestModel}
 *
 * <p>ModifyEngineMigrationRequest</p>
 */
public class ModifyEngineMigrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionStrings")
    private String connectionStrings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewMasterDBInstanceName")
    private String newMasterDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwapConnectionString")
    private String swapConnectionString;

    private ModifyEngineMigrationRequest(Builder builder) {
        super(builder);
        this.connectionStrings = builder.connectionStrings;
        this.DBInstanceName = builder.DBInstanceName;
        this.newMasterDBInstanceName = builder.newMasterDBInstanceName;
        this.regionId = builder.regionId;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.swapConnectionString = builder.swapConnectionString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEngineMigrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStrings
     */
    public String getConnectionStrings() {
        return this.connectionStrings;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return newMasterDBInstanceName
     */
    public String getNewMasterDBInstanceName() {
        return this.newMasterDBInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return swapConnectionString
     */
    public String getSwapConnectionString() {
        return this.swapConnectionString;
    }

    public static final class Builder extends Request.Builder<ModifyEngineMigrationRequest, Builder> {
        private String connectionStrings; 
        private String DBInstanceName; 
        private String newMasterDBInstanceName; 
        private String regionId; 
        private String sourceDBInstanceName; 
        private String swapConnectionString; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEngineMigrationRequest request) {
            super(request);
            this.connectionStrings = request.connectionStrings;
            this.DBInstanceName = request.DBInstanceName;
            this.newMasterDBInstanceName = request.newMasterDBInstanceName;
            this.regionId = request.regionId;
            this.sourceDBInstanceName = request.sourceDBInstanceName;
            this.swapConnectionString = request.swapConnectionString;
        } 

        /**
         * ConnectionStrings.
         */
        public Builder connectionStrings(String connectionStrings) {
            this.putQueryParameter("ConnectionStrings", connectionStrings);
            this.connectionStrings = connectionStrings;
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
         * NewMasterDBInstanceName.
         */
        public Builder newMasterDBInstanceName(String newMasterDBInstanceName) {
            this.putQueryParameter("NewMasterDBInstanceName", newMasterDBInstanceName);
            this.newMasterDBInstanceName = newMasterDBInstanceName;
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

        /**
         * SourceDBInstanceName.
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * SwapConnectionString.
         */
        public Builder swapConnectionString(String swapConnectionString) {
            this.putQueryParameter("SwapConnectionString", swapConnectionString);
            this.swapConnectionString = swapConnectionString;
            return this;
        }

        @Override
        public ModifyEngineMigrationRequest build() {
            return new ModifyEngineMigrationRequest(this);
        } 

    } 

}
