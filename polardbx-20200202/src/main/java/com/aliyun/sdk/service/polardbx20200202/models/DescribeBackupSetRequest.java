// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupSetRequest</p>
 */
public class DescribeBackupSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCrossRegion")
    private String destCrossRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeBackupSetRequest(Builder builder) {
        super(builder);
        this.backupSetId = builder.backupSetId;
        this.DBInstanceName = builder.DBInstanceName;
        this.destCrossRegion = builder.destCrossRegion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetId
     */
    public String getBackupSetId() {
        return this.backupSetId;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return destCrossRegion
     */
    public String getDestCrossRegion() {
        return this.destCrossRegion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeBackupSetRequest, Builder> {
        private String backupSetId; 
        private String DBInstanceName; 
        private String destCrossRegion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupSetRequest request) {
            super(request);
            this.backupSetId = request.backupSetId;
            this.DBInstanceName = request.DBInstanceName;
            this.destCrossRegion = request.destCrossRegion;
            this.regionId = request.regionId;
        } 

        /**
         * BackupSetId.
         */
        public Builder backupSetId(String backupSetId) {
            this.putQueryParameter("BackupSetId", backupSetId);
            this.backupSetId = backupSetId;
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
         * DestCrossRegion.
         */
        public Builder destCrossRegion(String destCrossRegion) {
            this.putQueryParameter("DestCrossRegion", destCrossRegion);
            this.destCrossRegion = destCrossRegion;
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
        public DescribeBackupSetRequest build() {
            return new DescribeBackupSetRequest(this);
        } 

    } 

}
