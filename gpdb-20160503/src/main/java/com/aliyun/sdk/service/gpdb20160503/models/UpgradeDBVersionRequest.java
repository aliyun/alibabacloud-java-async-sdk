// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBVersionRequest</p>
 */
public class UpgradeDBVersionRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("MajorVersion")
    private String majorVersion;

    @Query
    @NameInMap("MinorVersion")
    private String minorVersion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SwitchTime")
    private String switchTime;

    @Query
    @NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    private UpgradeDBVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.majorVersion = builder.majorVersion;
        this.minorVersion = builder.minorVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return majorVersion
     */
    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * @return minorVersion
     */
    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public static final class Builder extends Request.Builder<UpgradeDBVersionRequest, Builder> {
        private String DBInstanceId; 
        private String majorVersion; 
        private String minorVersion; 
        private Long ownerId; 
        private String regionId; 
        private String switchTime; 
        private String switchTimeMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.majorVersion = request.majorVersion;
            this.minorVersion = request.minorVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
        } 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * This parameter is no longer used and does not need to be specified.
         */
        public Builder majorVersion(String majorVersion) {
            this.putQueryParameter("MajorVersion", majorVersion);
            this.majorVersion = majorVersion;
            return this;
        }

        /**
         * The minor version of the instance.
         */
        public Builder minorVersion(String minorVersion) {
            this.putQueryParameter("MinorVersion", minorVersion);
            this.minorVersion = minorVersion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * This parameter is no longer used and does not need to be specified.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * This parameter is no longer used and does not need to be specified.
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        @Override
        public UpgradeDBVersionRequest build() {
            return new UpgradeDBVersionRequest(this);
        } 

    } 

}
