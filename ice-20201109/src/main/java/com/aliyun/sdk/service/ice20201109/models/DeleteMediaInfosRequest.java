// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaInfosRequest</p>
 */
public class DeleteMediaInfosRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletePhysicalFiles")
    private Boolean deletePhysicalFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURLs")
    private String inputURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
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
         * <p>Specifies whether to delete the physical file of the media asset.</p>
         * <p>If the media asset is stored in your own OSS bucket, you must authorize the service role AliyunICEDefaultRole in advance. For more information&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/zh/ims/user-guide/record?spm=a2c4g.11186623.0.i8#0737d9c437bmn">Authorize IMS to delete recording files in OSS</a>.</p>
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
         * <p>The URL of the media asset that you want to delete. The file corresponding to the URL must be registered with IMS. Separate multiple URLs with commas (,). The following two formats are supported:</p>
         * <ol>
         * <li>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?</li>
         * <li>OSS://example-bucket/example.mp4?<br>In this format, it is considered by default that the region of the OSS bucket in which the media asset resides is the same as the region in which IMS is activated.</li>
         * </ol>
         */
        public Builder inputURLs(String inputURLs) {
            this.putQueryParameter("InputURLs", inputURLs);
            this.inputURLs = inputURLs;
            return this;
        }

        /**
         * <p>The ID of the media asset that you want to delete from Intelligent Media Services (IMS).</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,).</li>
         * </ul>
         * <p>If you leave MediaIds empty, you must specify InputURLs.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
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
