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
         * <p>Specifies whether to change the storage class of a media asset that is stored for less than the minimum storage duration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you forcibly change the storage class of a media asset that is stored for less than the minimum storage duration, additional data retrieval fees are incurred.</p>
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
         * <p>The media asset ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, you can view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media assets.</li>
         * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query the media ID after the media asset is uploaded.</li>
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
         * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media asset. Valid values:</p>
         * <ul>
         * <li><strong>Expedited</strong></li>
         * <li><strong>Standard</strong></li>
         * <li><strong>Bulk</strong></li>
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
         * <p>The modification range. Valid values:</p>
         * <ul>
         * <li><strong>All</strong>: modifies the storage classes of all resources including the source files and transcoded streams.</li>
         * <li><strong>SourceFile</strong>: modifies the storage classes of only the source files. The storage class of other resources is Standard.</li>
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
         * <li><strong>Standard</strong></li>
         * <li><strong>IA</strong></li>
         * <li><strong>Archive</strong></li>
         * <li><strong>ColdArchive</strong></li>
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
