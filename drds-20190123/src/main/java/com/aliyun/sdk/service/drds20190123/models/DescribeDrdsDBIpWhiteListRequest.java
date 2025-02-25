// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsDBIpWhiteListRequest</p>
 */
public class DescribeDrdsDBIpWhiteListRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeDrdsDBIpWhiteListRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBIpWhiteListRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsDBIpWhiteListRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsDBIpWhiteListRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * The database name.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The name of the whitelist group.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
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
        public DescribeDrdsDBIpWhiteListRequest build() {
            return new DescribeDrdsDBIpWhiteListRequest(this);
        } 

    } 

}
