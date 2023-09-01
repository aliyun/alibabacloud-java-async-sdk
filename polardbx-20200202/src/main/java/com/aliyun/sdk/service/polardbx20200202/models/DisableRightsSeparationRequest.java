// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRightsSeparationRequest} extends {@link RequestModel}
 *
 * <p>DisableRightsSeparationRequest</p>
 */
public class DisableRightsSeparationRequest extends Request {
    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DbaAccountName")
    @Validation(required = true)
    private String dbaAccountName;

    @Query
    @NameInMap("DbaAccountPassword")
    @Validation(required = true)
    private String dbaAccountPassword;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DbaAccountName.
         */
        public Builder dbaAccountName(String dbaAccountName) {
            this.putQueryParameter("DbaAccountName", dbaAccountName);
            this.dbaAccountName = dbaAccountName;
            return this;
        }

        /**
         * DbaAccountPassword.
         */
        public Builder dbaAccountPassword(String dbaAccountPassword) {
            this.putQueryParameter("DbaAccountPassword", dbaAccountPassword);
            this.dbaAccountPassword = dbaAccountPassword;
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
        public DisableRightsSeparationRequest build() {
            return new DisableRightsSeparationRequest(this);
        } 

    } 

}
