// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateMediaStorageClassRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaStorageClassRequest</p>
 */
public class UpdateMediaStorageClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUpdateWithoutTimeLimit")
    private Boolean allowUpdateWithoutTimeLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTier")
    private String restoreTier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageClass;

    private UpdateMediaStorageClassRequest(Builder builder) {
        super(builder);
        this.allowUpdateWithoutTimeLimit = builder.allowUpdateWithoutTimeLimit;
        this.mediaIds = builder.mediaIds;
        this.restoreTier = builder.restoreTier;
        this.scope = builder.scope;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaStorageClassRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUpdateWithoutTimeLimit
     */
    public Boolean getAllowUpdateWithoutTimeLimit() {
        return this.allowUpdateWithoutTimeLimit;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return restoreTier
     */
    public String getRestoreTier() {
        return this.restoreTier;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<UpdateMediaStorageClassRequest, Builder> {
        private Boolean allowUpdateWithoutTimeLimit; 
        private String mediaIds; 
        private String restoreTier; 
        private String scope; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaStorageClassRequest request) {
            super(request);
            this.allowUpdateWithoutTimeLimit = request.allowUpdateWithoutTimeLimit;
            this.mediaIds = request.mediaIds;
            this.restoreTier = request.restoreTier;
            this.scope = request.scope;
            this.storageClass = request.storageClass;
        } 

        /**
         * <p>Specifies whether to allow the storage class modification for media assets that do not meet the minimum storage duration requirement. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Allowed.</li>
         * <li><strong>false</strong> (default): Not allowed.</li>
         * </ul>
         * <blockquote>
         * <p>If the storage duration of the media asset is insufficient, forcing a storage class modification incurs additional data retrieval fees.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUpdateWithoutTimeLimit(Boolean allowUpdateWithoutTimeLimit) {
            this.putQueryParameter("AllowUpdateWithoutTimeLimit", allowUpdateWithoutTimeLimit);
            this.allowUpdateWithoutTimeLimit = allowUpdateWithoutTimeLimit;
            return this;
        }

        /**
         * <p>The media asset IDs, which are the audio or video IDs (VideoId). Separate multiple IDs with commas (,). You can specify up to 20 IDs. You can obtain the IDs by using one of the following methods:</p>
         * <ul>
         * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the audio or video IDs.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Obtain upload URLs and credentials for audio and video files</a> operation, the value of the VideoId response parameter is the media asset ID.</li>
         * <li>After an audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media asset information</a> operation to query the media asset ID. The value of the VideoId response parameter is the media asset ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d56c2ac0cee271ed80004710b5ba****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The restoration priority. This parameter is required only for Cold Archive media assets. If you do not specify this parameter, the default value <strong>Standard</strong> is used. Valid values:</p>
         * <ul>
         * <li><strong>Expedited</strong>: Expedited.</li>
         * <li><strong>Standard</strong> (default): Standard.</li>
         * <li><strong>Bulk</strong>: Bulk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder restoreTier(String restoreTier) {
            this.putQueryParameter("RestoreTier", restoreTier);
            this.restoreTier = restoreTier;
            return this;
        }

        /**
         * <p>The scope of the modification. If you do not specify this parameter, the default value <strong>All</strong> is used. Valid values:</p>
         * <ul>
         * <li><strong>All</strong> (default): applies tiered storage to all resources of the media asset, including the source file and transcoded streams.</li>
         * <li><strong>SourceFile</strong>: applies tiered storage only to the video source file of the media asset ID. Resources other than the source file are stored in Standard storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The storage class. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: Standard.</li>
         * <li><strong>IA</strong>: Infrequent Access (IA).</li>
         * <li><strong>Archive</strong>: Archive.</li>
         * <li><strong>ColdArchive</strong>: Cold Archive.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Archive</p>
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public UpdateMediaStorageClassRequest build() {
            return new UpdateMediaStorageClassRequest(this);
        } 

    } 

}
