// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClusterInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedBlockStorageClusterInstanceStatusRequest</p>
 */
public class DescribeDedicatedBlockStorageClusterInstanceStatusRequest extends Request {
    @Query
    @NameInMap("DbscId")
    @Validation(required = true)
    private String dbscId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeDedicatedBlockStorageClusterInstanceStatusRequest(Builder builder) {
        super(builder);
        this.dbscId = builder.dbscId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClusterInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedBlockStorageClusterInstanceStatusRequest, Builder> {
        private String dbscId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedBlockStorageClusterInstanceStatusRequest response) {
            super(response);
            this.dbscId = response.dbscId;
            this.regionId = response.regionId;
        } 

        /**
         * DbscId.
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
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
        public DescribeDedicatedBlockStorageClusterInstanceStatusRequest build() {
            return new DescribeDedicatedBlockStorageClusterInstanceStatusRequest(this);
        } 

    } 

}
