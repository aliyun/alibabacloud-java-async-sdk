// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLibraryDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeLibraryDetailRequest</p>
 */
public class DescribeLibraryDetailRequest extends Request {
    @Query
    @NameInMap("LibraryBizId")
    private String libraryBizId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeLibraryDetailRequest(Builder builder) {
        super(builder);
        this.libraryBizId = builder.libraryBizId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLibraryDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryBizId
     */
    public String getLibraryBizId() {
        return this.libraryBizId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeLibraryDetailRequest, Builder> {
        private String libraryBizId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLibraryDetailRequest response) {
            super(response);
            this.libraryBizId = response.libraryBizId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * LibraryBizId.
         */
        public Builder libraryBizId(String libraryBizId) {
            this.putQueryParameter("LibraryBizId", libraryBizId);
            this.libraryBizId = libraryBizId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DescribeLibraryDetailRequest build() {
            return new DescribeLibraryDetailRequest(this);
        } 

    } 

}
