// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaInfosRequest</p>
 */
public class DeleteMediaInfosRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DeletePhysicalFiles")
    private Boolean deletePhysicalFiles;

    @Query
    @NameInMap("InputURLs")
    private String inputURLs;

    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    private DeleteMediaInfosRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deletePhysicalFiles = builder.deletePhysicalFiles;
        this.inputURLs = builder.inputURLs;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deletePhysicalFiles
     */
    public Boolean getDeletePhysicalFiles() {
        return this.deletePhysicalFiles;
    }

    /**
     * @return inputURLs
     */
    public String getInputURLs() {
        return this.inputURLs;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    public static final class Builder extends Request.Builder<DeleteMediaInfosRequest, Builder> {
        private String regionId; 
        private Boolean deletePhysicalFiles; 
        private String inputURLs; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaInfosRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deletePhysicalFiles = request.deletePhysicalFiles;
            this.inputURLs = request.inputURLs;
            this.mediaIds = request.mediaIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DeletePhysicalFiles.
         */
        public Builder deletePhysicalFiles(Boolean deletePhysicalFiles) {
            this.putQueryParameter("DeletePhysicalFiles", deletePhysicalFiles);
            this.deletePhysicalFiles = deletePhysicalFiles;
            return this;
        }

        /**
         * InputURLs.
         */
        public Builder inputURLs(String inputURLs) {
            this.putQueryParameter("InputURLs", inputURLs);
            this.inputURLs = inputURLs;
            return this;
        }

        /**
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public DeleteMediaInfosRequest build() {
            return new DeleteMediaInfosRequest(this);
        } 

    } 

}
