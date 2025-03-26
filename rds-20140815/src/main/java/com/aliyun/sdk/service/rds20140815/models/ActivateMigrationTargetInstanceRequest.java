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
 * {@link ActivateMigrationTargetInstanceRequest} extends {@link RequestModel}
 *
 * <p>ActivateMigrationTargetInstanceRequest</p>
 */
public class ActivateMigrationTargetInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceSwitch")
    private String forceSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    private ActivateMigrationTargetInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.forceSwitch = builder.forceSwitch;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateMigrationTargetInstanceRequest create() {
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
     * @return forceSwitch
     */
    public String getForceSwitch() {
        return this.forceSwitch;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public static final class Builder extends Request.Builder<ActivateMigrationTargetInstanceRequest, Builder> {
        private String DBInstanceName; 
        private String forceSwitch; 
        private Long resourceOwnerId; 
        private String switchTime; 
        private String switchTimeMode; 

        private Builder() {
            super();
        } 

        private Builder(ActivateMigrationTargetInstanceRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.forceSwitch = request.forceSwitch;
            this.resourceOwnerId = request.resourceOwnerId;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp102g323jd4****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully perform a switchover. Set the value to 1. The value 1 specifies a forceful switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder forceSwitch(String forceSwitch) {
            this.putQueryParameter("ForceSwitch", forceSwitch);
            this.forceSwitch = forceSwitch;
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
         * <p>A reserved parameter. This parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-25T06:57:41Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The time when you want to perform the switchover.</p>
         * <p>Set the value to 0. The value 0 specifies an immediate switchover.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        @Override
        public ActivateMigrationTargetInstanceRequest build() {
            return new ActivateMigrationTargetInstanceRequest(this);
        } 

    } 

}
