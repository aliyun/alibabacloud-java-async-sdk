// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>DeleteDirectoriesRequest</p>
 */
public class DeleteDirectoriesRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    @Validation(required = true)
    private java.util.List < String > directoryId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteDirectoriesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDirectoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public java.util.List < String > getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDirectoriesRequest, Builder> {
        private java.util.List < String > directoryId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDirectoriesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of directories.
         */
        public Builder directoryId(java.util.List < String > directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDirectoriesRequest build() {
            return new DeleteDirectoriesRequest(this);
        } 

    } 

}
