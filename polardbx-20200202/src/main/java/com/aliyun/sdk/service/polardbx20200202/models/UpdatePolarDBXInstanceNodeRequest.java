// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePolarDBXInstanceNodeRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarDBXInstanceNodeRequest</p>
 */
public class UpdatePolarDBXInstanceNodeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DbInstanceNodeCount")
    @Validation(required = true)
    private String dbInstanceNodeCount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdatePolarDBXInstanceNodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceName = builder.DBInstanceName;
        this.dbInstanceNodeCount = builder.dbInstanceNodeCount;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarDBXInstanceNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dbInstanceNodeCount
     */
    public String getDbInstanceNodeCount() {
        return this.dbInstanceNodeCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdatePolarDBXInstanceNodeRequest, Builder> {
        private String clientToken; 
        private String DBInstanceName; 
        private String dbInstanceNodeCount; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarDBXInstanceNodeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBInstanceName = response.DBInstanceName;
            this.dbInstanceNodeCount = response.dbInstanceNodeCount;
            this.regionId = response.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * DbInstanceNodeCount.
         */
        public Builder dbInstanceNodeCount(String dbInstanceNodeCount) {
            this.putQueryParameter("DbInstanceNodeCount", dbInstanceNodeCount);
            this.dbInstanceNodeCount = dbInstanceNodeCount;
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
        public UpdatePolarDBXInstanceNodeRequest build() {
            return new UpdatePolarDBXInstanceNodeRequest(this);
        } 

    } 

}
