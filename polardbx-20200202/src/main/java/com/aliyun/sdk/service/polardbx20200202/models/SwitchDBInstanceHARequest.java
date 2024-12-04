// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SwitchDBInstanceHARequest} extends {@link RequestModel}
 *
 * <p>SwitchDBInstanceHARequest</p>
 */
public class SwitchDBInstanceHARequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPrimaryAzoneId")
    private String targetPrimaryAzoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPrimaryRegionId")
    private String targetPrimaryRegionId;

    private SwitchDBInstanceHARequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.regionId = builder.regionId;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.targetPrimaryAzoneId = builder.targetPrimaryAzoneId;
        this.targetPrimaryRegionId = builder.targetPrimaryRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchDBInstanceHARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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

    /**
     * @return targetPrimaryAzoneId
     */
    public String getTargetPrimaryAzoneId() {
        return this.targetPrimaryAzoneId;
    }

    /**
     * @return targetPrimaryRegionId
     */
    public String getTargetPrimaryRegionId() {
        return this.targetPrimaryRegionId;
    }

    public static final class Builder extends Request.Builder<SwitchDBInstanceHARequest, Builder> {
        private String DBInstanceName; 
        private String regionId; 
        private String switchTime; 
        private String switchTimeMode; 
        private String targetPrimaryAzoneId; 
        private String targetPrimaryRegionId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchDBInstanceHARequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.regionId = request.regionId;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.targetPrimaryAzoneId = request.targetPrimaryAzoneId;
            this.targetPrimaryRegionId = request.targetPrimaryRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SwitchTime.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
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

        /**
         * TargetPrimaryAzoneId.
         */
        public Builder targetPrimaryAzoneId(String targetPrimaryAzoneId) {
            this.putQueryParameter("TargetPrimaryAzoneId", targetPrimaryAzoneId);
            this.targetPrimaryAzoneId = targetPrimaryAzoneId;
            return this;
        }

        /**
         * TargetPrimaryRegionId.
         */
        public Builder targetPrimaryRegionId(String targetPrimaryRegionId) {
            this.putQueryParameter("TargetPrimaryRegionId", targetPrimaryRegionId);
            this.targetPrimaryRegionId = targetPrimaryRegionId;
            return this;
        }

        @Override
        public SwitchDBInstanceHARequest build() {
            return new SwitchDBInstanceHARequest(this);
        } 

    } 

}
