// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link DeleteMediasRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediasRequest</p>
 */
public class DeleteMediasRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizConfig")
    private String bizConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletePhysicalFiles")
    private Boolean deletePhysicalFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputURLs")
    private String inputURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    private String mediaIds;

    private DeleteMediasRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizConfig = builder.bizConfig;
        this.deletePhysicalFiles = builder.deletePhysicalFiles;
        this.inputURLs = builder.inputURLs;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediasRequest create() {
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
     * @return bizConfig
     */
    public String getBizConfig() {
        return this.bizConfig;
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

    public static final class Builder extends Request.Builder<DeleteMediasRequest, Builder> {
        private String regionId; 
        private String bizConfig; 
        private Boolean deletePhysicalFiles; 
        private String inputURLs; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediasRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizConfig = request.bizConfig;
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
         * BizConfig.
         */
        public Builder bizConfig(String bizConfig) {
            this.putQueryParameter("BizConfig", bizConfig);
            this.bizConfig = bizConfig;
            return this;
        }

        /**
         * <p>Specifies whether to delete the physical files at the same time.</p>
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
         * <p>Not supported.</p>
         */
        public Builder inputURLs(String inputURLs) {
            this.putQueryParameter("InputURLs", inputURLs);
            this.inputURLs = inputURLs;
            return this;
        }

        /**
         * <p>The media asset IDs, separated by commas. Invalid IDs are added to IgnoredList.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong>,<strong><strong><strong>c48fb37407365d4f2cd8</strong></strong></strong></p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public DeleteMediasRequest build() {
            return new DeleteMediasRequest(this);
        } 

    } 

}
