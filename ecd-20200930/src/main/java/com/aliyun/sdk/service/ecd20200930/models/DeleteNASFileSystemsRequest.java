// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNASFileSystemsRequest} extends {@link RequestModel}
 *
 * <p>DeleteNASFileSystemsRequest</p>
 */
public class DeleteNASFileSystemsRequest extends Request {
    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private java.util.List < String > fileSystemId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteNASFileSystemsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNASFileSystemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public java.util.List < String > getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNASFileSystemsRequest, Builder> {
        private java.util.List < String > fileSystemId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNASFileSystemsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the NAS file systems.
         */
        public Builder fileSystemId(java.util.List < String > fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
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
        public DeleteNASFileSystemsRequest build() {
            return new DeleteNASFileSystemsRequest(this);
        } 

    } 

}
