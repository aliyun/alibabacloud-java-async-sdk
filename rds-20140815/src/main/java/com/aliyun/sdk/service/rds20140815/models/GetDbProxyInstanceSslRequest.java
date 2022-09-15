// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDbProxyInstanceSslRequest} extends {@link RequestModel}
 *
 * <p>GetDbProxyInstanceSslRequest</p>
 */
public class GetDbProxyInstanceSslRequest extends Request {
    @Query
    @NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetDbProxyInstanceSslRequest(Builder builder) {
        super(builder);
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.dbInstanceId = builder.dbInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDbProxyInstanceSslRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDbProxyInstanceSslRequest, Builder> {
        private String DBProxyEngineType; 
        private String dbInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDbProxyInstanceSslRequest request) {
            super(request);
            this.DBProxyEngineType = request.DBProxyEngineType;
            this.dbInstanceId = request.dbInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * DBProxyEngineType.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.putQueryParameter("DBProxyEngineType", DBProxyEngineType);
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
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
        public GetDbProxyInstanceSslRequest build() {
            return new GetDbProxyInstanceSslRequest(this);
        } 

    } 

}
