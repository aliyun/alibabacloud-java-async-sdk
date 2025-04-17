// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link SwitchOverMajorVersionUpgradeRequest} extends {@link RequestModel}
 *
 * <p>SwitchOverMajorVersionUpgradeRequest</p>
 */
public class SwitchOverMajorVersionUpgradeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private byte[] regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchoverTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 10)
    private Integer switchoverTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SwitchOverMajorVersionUpgradeRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.switchoverTimeout = builder.switchoverTimeout;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchOverMajorVersionUpgradeRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public byte[] getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchoverTimeout
     */
    public Integer getSwitchoverTimeout() {
        return this.switchoverTimeout;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SwitchOverMajorVersionUpgradeRequest, Builder> {
        private String DBInstanceName; 
        private Long ownerId; 
        private byte[] regionId; 
        private Integer switchoverTimeout; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SwitchOverMajorVersionUpgradeRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.switchoverTimeout = request.switchoverTimeout;
            this.type = request.type;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(byte[] regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SwitchoverTimeout.
         */
        public Builder switchoverTimeout(Integer switchoverTimeout) {
            this.putQueryParameter("SwitchoverTimeout", switchoverTimeout);
            this.switchoverTimeout = switchoverTimeout;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SwitchOverMajorVersionUpgradeRequest build() {
            return new SwitchOverMajorVersionUpgradeRequest(this);
        } 

    } 

}
