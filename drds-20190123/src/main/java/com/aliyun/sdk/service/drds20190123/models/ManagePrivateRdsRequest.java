// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManagePrivateRdsRequest} extends {@link RequestModel}
 *
 * <p>ManagePrivateRdsRequest</p>
 */
public class ManagePrivateRdsRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Params")
    private String params;

    @Query
    @NameInMap("RdsAction")
    @Validation(required = true)
    private String rdsAction;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ManagePrivateRdsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.params = builder.params;
        this.rdsAction = builder.rdsAction;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManagePrivateRdsRequest create() {
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
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return rdsAction
     */
    public String getRdsAction() {
        return this.rdsAction;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ManagePrivateRdsRequest, Builder> {
        private String DBInstanceId; 
        private String drdsInstanceId; 
        private String params; 
        private String rdsAction; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ManagePrivateRdsRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.drdsInstanceId = response.drdsInstanceId;
            this.params = response.params;
            this.rdsAction = response.rdsAction;
            this.regionId = response.regionId;
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
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * RdsAction.
         */
        public Builder rdsAction(String rdsAction) {
            this.putQueryParameter("RdsAction", rdsAction);
            this.rdsAction = rdsAction;
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
        public ManagePrivateRdsRequest build() {
            return new ManagePrivateRdsRequest(this);
        } 

    } 

}
