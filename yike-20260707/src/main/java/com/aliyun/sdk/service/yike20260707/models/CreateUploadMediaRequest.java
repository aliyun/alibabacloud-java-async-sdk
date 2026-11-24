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
 * {@link CreateUploadMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadMediaRequest</p>
 */
public class CreateUploadMediaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialType")
    private String credentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileInfo")
    private String fileInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetaData")
    private String mediaMetaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialType = builder.credentialType;
        this.entityId = builder.entityId;
        this.fileInfo = builder.fileInfo;
        this.mediaId = builder.mediaId;
        this.mediaMetaData = builder.mediaMetaData;
        this.overwrite = builder.overwrite;
        this.projectId = builder.projectId;
        this.storageLocation = builder.storageLocation;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadMediaRequest create() {
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
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return fileInfo
     */
    public String getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaMetaData
     */
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateUploadMediaRequest, Builder> {
        private String regionId; 
        private String credentialType; 
        private String entityId; 
        private String fileInfo; 
        private String mediaId; 
        private String mediaMetaData; 
        private Boolean overwrite; 
        private String projectId; 
        private String storageLocation; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialType = request.credentialType;
            this.entityId = request.entityId;
            this.fileInfo = request.fileInfo;
            this.mediaId = request.mediaId;
            this.mediaMetaData = request.mediaMetaData;
            this.overwrite = request.overwrite;
            this.projectId = request.projectId;
            this.storageLocation = request.storageLocation;
            this.userData = request.userData;
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
         * <p>The type of the upload credential. Valid values:</p>
         * <ul>
         * <li><code>STS_TOKEN</code>: the default value, used for direct upload by using the OSS SDK.</li>
         * <li><code>POST_POLICY</code>: used for form-based upload.</li>
         * <li><code>PRESIGNED_URL</code>: used for pre-signed PUT upload.</li>
         * <li><code>UPLOAD_TICKET</code>: the ticket mode, where a real credential is issued only when the ticket is exchanged.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STS_TOKEN</p>
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * <p>The entity ID. The default value is AiSaasMediaAsset. You can ignore this parameter for general calls.</p>
         * 
         * <strong>example:</strong>
         * <p>AiSaasMediaAsset</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The file information in JSON string format. This parameter is required when you create a media asset. The <strong>Type</strong> field is required and can be set to video, audio, or image. The <strong>Name</strong> (file name), <strong>Ext</strong> (file name extension without the dot), and <strong>Size</strong> (size in bytes) fields are optional. This parameter can be omitted when you overwrite an existing media asset (Overwrite=true). If omitted, the original media asset type and source file name extension are used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;:&quot;video&quot;,&quot;Name&quot;:&quot;demo.mp4&quot;,&quot;Ext&quot;:&quot;mp4&quot;,&quot;Size&quot;:10485760}</p>
         */
        public Builder fileInfo(String fileInfo) {
            this.putQueryParameter("FileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * <p>The ID of the existing media asset. This parameter is required when Overwrite is set to true to overwrite the media asset. If CredentialType is set to UPLOAD_TICKET, this parameter indicates a ticket exchange. Do not specify this parameter in other credential modes.</p>
         * 
         * <strong>example:</strong>
         * <p>b7e94fc0e*****6e7c5486601</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The media asset metadata in JSON string format. This parameter is required when you create a media asset. It can contain the following fields: <strong>Title</strong> (title, defaults to FileInfo.Name if not specified), <strong>Description</strong>, <strong>CateId</strong> (category ID), <strong>Tags</strong> (comma-separated), <strong>BusinessType</strong> (falls back to general for invalid values), <strong>CoverURL</strong>, <strong>DynamicMetaData</strong> (JSON string, such as ProductionId), <strong>ReferenceId</strong> (external reference ID), and <strong>RegisterConfig</strong> (object containing SearchLibName to specify the search library). This parameter can be omitted when you overwrite an existing media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Title&quot;:&quot;demo&quot;,&quot;Description&quot;:&quot;test&quot;,&quot;Tags&quot;:&quot;test,demo&quot;,&quot;BusinessType&quot;:&quot;general&quot;,&quot;DynamicMetaData&quot;:&quot;{\&quot;ProductionId\&quot;:\&quot;pd_123456\&quot;}&quot;}</p>
         */
        public Builder mediaMetaData(String mediaMetaData) {
            this.putQueryParameter("MediaMetaData", mediaMetaData);
            this.mediaMetaData = mediaMetaData;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the existing media asset. Default value: false. If this parameter is set to true, you must specify MediaId. The original media asset is reset (old files, snapshots, and analysis artifacts are cleared, and the status is set to uploading), and a new credential is issued as if it were the first upload.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The project ID. This parameter is written to dynamicMetaData.ProductionId with the highest priority, overwriting the value with the same name in DynamicMetaData, and is automatically paired with the default folder <code>fd__default</code>. This parameter is supported only by the default entity. If you specify this parameter for a non-default entity, an <code>InvalidParameter</code> error is returned. If you do not specify this parameter, the <code>ProductionId</code> is obtained from the existing fallback chain.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_123456</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The specified storage location in the <code>bucket.endpoint</code> format. If you do not specify this parameter, a bucket is selected based on the default bucket selection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The custom user data in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizId&quot;:&quot;order-123&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadMediaRequest build() {
            return new CreateUploadMediaRequest(this);
        } 

    } 

}
