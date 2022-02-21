// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsParamsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsParamsRequest</p>
 */
public class DescribeDrdsParamsRequest extends Request {
    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("ParamLevel")
    @Validation(required = true)
    private String paramLevel;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDrdsParamsRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.paramLevel = builder.paramLevel;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsParamsRequest create() {
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
     * @return paramLevel
     */
    public String getParamLevel() {
        return this.paramLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsParamsRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String paramLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsParamsRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.paramLevel = response.paramLevel;
            this.regionId = response.regionId;
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
         * ParamLevel.
         */
        public Builder paramLevel(String paramLevel) {
            this.putQueryParameter("ParamLevel", paramLevel);
            this.paramLevel = paramLevel;
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
        public DescribeDrdsParamsRequest build() {
            return new DescribeDrdsParamsRequest(this);
        } 

    } 

}
