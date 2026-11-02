// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
         * <p>Specifies whether to delete the physical files of the media assets. If the storage address of a media asset is a user-owned OSS bucket, you must authorize the AliyunICEDefaultRole service role in advance&lt;props=&quot;china&quot;&gt;. For more information, see <a href="https://www.alibabacloud.com/help/en/ims/user-guide/record#0737d9c437bmn">Delete recorded files (OSS authorization management)</a>.</p>
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
         * <p>The URLs of the media assets to be deleted in the corresponding system. The files corresponding to the URLs must be registered in IMS first. Separate multiple URLs with commas (,). Two formats are supported: 1. http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4? 2. OSS://example-bucket/example.mp4? In the second format, the default OSS region is the same as the service registration area.</p>
         * 
         * <strong>example:</strong>
         * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4?</p>
         */
        public Builder inputURLs(String inputURLs) {
            this.putQueryParameter("InputURLs", inputURLs);
            this.inputURLs = inputURLs;
            return this;
        }

        /**
         * <p>The IMS media asset IDs. Separate multiple IDs with commas (,). If the MediaIds parameter is empty, the InputURLs parameter must not be empty.</p>
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
