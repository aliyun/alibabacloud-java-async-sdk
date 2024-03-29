// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeDBInstanceEngineVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBInstanceEngineVersionRequest</p>
 */
public class UpgradeDBInstanceEngineVersionRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    private UpgradeDBInstanceEngineVersionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.engineVersion = builder.engineVersion;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTimeMode = builder.switchTimeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBInstanceEngineVersionRequest create() {
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
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public static final class Builder extends Request.Builder<UpgradeDBInstanceEngineVersionRequest, Builder> {
        private String DBInstanceId; 
        private String engineVersion; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String switchTimeMode; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBInstanceEngineVersionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.engineVersion = request.engineVersion;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTimeMode = request.switchTimeMode;
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
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SwitchTimeMode.
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        @Override
        public UpgradeDBInstanceEngineVersionRequest build() {
            return new UpgradeDBInstanceEngineVersionRequest(this);
        } 

    } 

}
