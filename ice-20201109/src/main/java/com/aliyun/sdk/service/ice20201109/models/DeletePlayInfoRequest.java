// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePlayInfoRequest} extends {@link RequestModel}
 *
 * <p>DeletePlayInfoRequest</p>
 */
public class DeletePlayInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DeletePhysicalFiles")
    private Boolean deletePhysicalFiles;

    @Query
    @NameInMap("FileURLs")
    private String fileURLs;

    @Query
    @NameInMap("MediaId")
    private String mediaId;

    private DeletePlayInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deletePhysicalFiles = builder.deletePhysicalFiles;
        this.fileURLs = builder.fileURLs;
        this.mediaId = builder.mediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlayInfoRequest create() {
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
     * @return fileURLs
     */
    public String getFileURLs() {
        return this.fileURLs;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    public static final class Builder extends Request.Builder<DeletePlayInfoRequest, Builder> {
        private String regionId; 
        private Boolean deletePhysicalFiles; 
        private String fileURLs; 
        private String mediaId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePlayInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deletePhysicalFiles = request.deletePhysicalFiles;
            this.fileURLs = request.fileURLs;
            this.mediaId = request.mediaId;
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
         * FileURLs.
         */
        public Builder fileURLs(String fileURLs) {
            this.putQueryParameter("FileURLs", fileURLs);
            this.fileURLs = fileURLs;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        @Override
        public DeletePlayInfoRequest build() {
            return new DeletePlayInfoRequest(this);
        } 

    } 

}
