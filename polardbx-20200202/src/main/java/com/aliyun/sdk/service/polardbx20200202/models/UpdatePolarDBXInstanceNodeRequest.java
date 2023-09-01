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
    @NameInMap("CNNodeCount")
    private String CNNodeCount;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DNNodeCount")
    private String DNNodeCount;

    @Query
    @NameInMap("DbInstanceNodeCount")
    private String dbInstanceNodeCount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdatePolarDBXInstanceNodeRequest(Builder builder) {
        super(builder);
        this.CNNodeCount = builder.CNNodeCount;
        this.clientToken = builder.clientToken;
        this.DBInstanceName = builder.DBInstanceName;
        this.DNNodeCount = builder.DNNodeCount;
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
     * @return CNNodeCount
     */
    public String getCNNodeCount() {
        return this.CNNodeCount;
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
     * @return DNNodeCount
     */
    public String getDNNodeCount() {
        return this.DNNodeCount;
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
        private String CNNodeCount; 
        private String clientToken; 
        private String DBInstanceName; 
        private String DNNodeCount; 
        private String dbInstanceNodeCount; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarDBXInstanceNodeRequest request) {
            super(request);
            this.CNNodeCount = request.CNNodeCount;
            this.clientToken = request.clientToken;
            this.DBInstanceName = request.DBInstanceName;
            this.DNNodeCount = request.DNNodeCount;
            this.dbInstanceNodeCount = request.dbInstanceNodeCount;
            this.regionId = request.regionId;
        } 

        /**
         * CNNodeCount.
         */
        public Builder CNNodeCount(String CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
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
         * DNNodeCount.
         */
        public Builder DNNodeCount(String DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
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
