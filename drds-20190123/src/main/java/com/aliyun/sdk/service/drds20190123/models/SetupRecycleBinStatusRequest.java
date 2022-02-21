// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupRecycleBinStatusRequest} extends {@link RequestModel}
 *
 * <p>SetupRecycleBinStatusRequest</p>
 */
public class SetupRecycleBinStatusRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StatusAction")
    @Validation(required = true)
    private String statusAction;

    private SetupRecycleBinStatusRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.regionId = builder.regionId;
        this.statusAction = builder.statusAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupRecycleBinStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statusAction
     */
    public String getStatusAction() {
        return this.statusAction;
    }

    public static final class Builder extends Request.Builder<SetupRecycleBinStatusRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String regionId; 
        private String statusAction; 

        private Builder() {
            super();
        } 

        private Builder(SetupRecycleBinStatusRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.regionId = response.regionId;
            this.statusAction = response.statusAction;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StatusAction.
         */
        public Builder statusAction(String statusAction) {
            this.putQueryParameter("StatusAction", statusAction);
            this.statusAction = statusAction;
            return this;
        }

        @Override
        public SetupRecycleBinStatusRequest build() {
            return new SetupRecycleBinStatusRequest(this);
        } 

    } 

}
