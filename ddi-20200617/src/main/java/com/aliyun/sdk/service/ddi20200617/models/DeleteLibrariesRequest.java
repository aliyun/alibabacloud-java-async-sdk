// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLibrariesRequest} extends {@link RequestModel}
 *
 * <p>DeleteLibrariesRequest</p>
 */
public class DeleteLibrariesRequest extends Request {
    @Query
    @NameInMap("LibraryBizIdList")
    private java.util.List < String > libraryBizIdList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteLibrariesRequest(Builder builder) {
        super(builder);
        this.libraryBizIdList = builder.libraryBizIdList;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLibrariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryBizIdList
     */
    public java.util.List < String > getLibraryBizIdList() {
        return this.libraryBizIdList;
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

    public static final class Builder extends Request.Builder<DeleteLibrariesRequest, Builder> {
        private java.util.List < String > libraryBizIdList; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLibrariesRequest request) {
            super(request);
            this.libraryBizIdList = request.libraryBizIdList;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * LibraryBizIdList.
         */
        public Builder libraryBizIdList(java.util.List < String > libraryBizIdList) {
            this.putQueryParameter("LibraryBizIdList", libraryBizIdList);
            this.libraryBizIdList = libraryBizIdList;
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
        public DeleteLibrariesRequest build() {
            return new DeleteLibrariesRequest(this);
        } 

    } 

}
