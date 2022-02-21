// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallLibrariesRequest} extends {@link RequestModel}
 *
 * <p>UninstallLibrariesRequest</p>
 */
public class UninstallLibrariesRequest extends Request {
    @Query
    @NameInMap("ClusterBizIdList")
    private java.util.List < String > clusterBizIdList;

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

    private UninstallLibrariesRequest(Builder builder) {
        super(builder);
        this.clusterBizIdList = builder.clusterBizIdList;
        this.libraryBizId = builder.libraryBizId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallLibrariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterBizIdList
     */
    public java.util.List < String > getClusterBizIdList() {
        return this.clusterBizIdList;
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

    public static final class Builder extends Request.Builder<UninstallLibrariesRequest, Builder> {
        private java.util.List < String > clusterBizIdList; 
        private String libraryBizId; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallLibrariesRequest response) {
            super(response);
            this.clusterBizIdList = response.clusterBizIdList;
            this.libraryBizId = response.libraryBizId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * ClusterBizIdList.
         */
        public Builder clusterBizIdList(java.util.List < String > clusterBizIdList) {
            this.putQueryParameter("ClusterBizIdList", clusterBizIdList);
            this.clusterBizIdList = clusterBizIdList;
            return this;
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
        public UninstallLibrariesRequest build() {
            return new UninstallLibrariesRequest(this);
        } 

    } 

}
