// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBVersionInfosRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBVersionInfosRequest</p>
 */
public class DescribeDBVersionInfosRequest extends Request {
    @Query
    @NameInMap("DBInstanceMode")
    private String DBInstanceMode;

    @Query
    @NameInMap("DBVersion")
    private String DBVersion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDBVersionInfosRequest(Builder builder) {
        super(builder);
        this.DBInstanceMode = builder.DBInstanceMode;
        this.DBVersion = builder.DBVersion;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBVersionInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceMode
     */
    public String getDBInstanceMode() {
        return this.DBInstanceMode;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeDBVersionInfosRequest, Builder> {
        private String DBInstanceMode; 
        private String DBVersion; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBVersionInfosRequest request) {
            super(request);
            this.DBInstanceMode = request.DBInstanceMode;
            this.DBVersion = request.DBVersion;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * DBInstanceMode.
         */
        public Builder DBInstanceMode(String DBInstanceMode) {
            this.putQueryParameter("DBInstanceMode", DBInstanceMode);
            this.DBInstanceMode = DBInstanceMode;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeDBVersionInfosRequest build() {
            return new DescribeDBVersionInfosRequest(this);
        } 

    } 

}
