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
 * {@link DisableRightsSeparationRequest} extends {@link RequestModel}
 *
 * <p>DisableRightsSeparationRequest</p>
 */
public class DisableRightsSeparationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbaAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbaAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbaAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbaAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DisableRightsSeparationRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.dbaAccountName = builder.dbaAccountName;
        this.dbaAccountPassword = builder.dbaAccountPassword;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableRightsSeparationRequest create() {
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
     * @return dbaAccountName
     */
    public String getDbaAccountName() {
        return this.dbaAccountName;
    }

    /**
     * @return dbaAccountPassword
     */
    public String getDbaAccountPassword() {
        return this.dbaAccountPassword;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DisableRightsSeparationRequest, Builder> {
        private String DBInstanceName; 
        private String dbaAccountName; 
        private String dbaAccountPassword; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisableRightsSeparationRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.dbaAccountName = request.dbaAccountName;
            this.dbaAccountPassword = request.dbaAccountPassword;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-sprcym7g7w****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account_1</p>
         */
        public Builder dbaAccountName(String dbaAccountName) {
            this.putQueryParameter("DbaAccountName", dbaAccountName);
            this.dbaAccountName = dbaAccountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder dbaAccountPassword(String dbaAccountPassword) {
            this.putQueryParameter("DbaAccountPassword", dbaAccountPassword);
            this.dbaAccountPassword = dbaAccountPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisableRightsSeparationRequest build() {
            return new DisableRightsSeparationRequest(this);
        } 

    } 

}
