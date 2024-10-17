// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePlayInfoRequest} extends {@link RequestModel}
 *
 * <p>DeletePlayInfoRequest</p>
 */
public class DeletePlayInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletePhysicalFiles")
    private Boolean deletePhysicalFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileURLs")
    private String fileURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
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
         * <p>Specifies whether to delete the physical file of the media stream.</p>
         * <p>If the media asset is stored in your own Object Storage Service (OSS) bucket, you must authorize the service role AliyunICEDefaultRole in advance. &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/449331.html#p-ko2-wc7-iad">Authorize IMS to delete recording files in OSS</a>.</p>
         * <p>You can delete only the physical files of transcoded streams, but not the physical files of source files.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletePhysicalFiles(Boolean deletePhysicalFiles) {
            this.putQueryParameter("DeletePhysicalFiles", deletePhysicalFiles);
            this.deletePhysicalFiles = deletePhysicalFiles;
            return this;
        }

        /**
         * <p>The URL of the media stream file that you want to delete. Separate multiple URLs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ice-test001.oss-cn-shanghai.aliyuncs.com/%E6%8E%A5%E5%8F%A3%E6%B5%8B%E8%AF%95/%E5%B0%8F%E7%8C%AA%E4%BD%A9%E5%A5%87640*360.mp4">https://ice-test001.oss-cn-shanghai.aliyuncs.com/%E6%8E%A5%E5%8F%A3%E6%B5%8B%E8%AF%95/%E5%B0%8F%E7%8C%AA%E4%BD%A9%E5%A5%87640*360.mp4</a></p>
         */
        public Builder fileURLs(String fileURLs) {
            this.putQueryParameter("FileURLs", fileURLs);
            this.fileURLs = fileURLs;
            return this;
        }

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1d3518e0027d71ed80cd909598416303</p>
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
