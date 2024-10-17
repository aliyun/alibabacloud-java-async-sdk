// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadMediaByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadMediaByURLRequest</p>
 */
public class UploadMediaByURLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetaData")
    private String mediaMetaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostProcessConfig")
    private String postProcessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTargetConfig")
    private String uploadTargetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadURLs")
    private String uploadURLs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private UploadMediaByURLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.entityId = builder.entityId;
        this.mediaMetaData = builder.mediaMetaData;
        this.postProcessConfig = builder.postProcessConfig;
        this.uploadTargetConfig = builder.uploadTargetConfig;
        this.uploadURLs = builder.uploadURLs;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaByURLRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return mediaMetaData
     */
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    /**
     * @return postProcessConfig
     */
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    /**
     * @return uploadTargetConfig
     */
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    /**
     * @return uploadURLs
     */
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<UploadMediaByURLRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String entityId; 
        private String mediaMetaData; 
        private String postProcessConfig; 
        private String uploadTargetConfig; 
        private String uploadURLs; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(UploadMediaByURLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.entityId = request.entityId;
            this.mediaMetaData = request.mediaMetaData;
            this.postProcessConfig = request.postProcessConfig;
            this.uploadTargetConfig = request.uploadTargetConfig;
            this.uploadURLs = request.uploadURLs;
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The entity ID. You can call the CreateEntity operation to create an entity and specify a dynamic metadata structure.</p>
         * 
         * <strong>example:</strong>
         * <p>d67281da3c8743b8823ad12976187***</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The metadata of the media file that you want to upload. The value must be a JSON string.</p>
         * <ul>
         * <li>This parameter takes effect only if its value matches a URL that is specified in UploadURLs.</li>
         * <li>You must convert the JSON-formatted data, such as [UploadMetadata, UploadMetadata,…], into a JSON string.</li>
         * <li>For more information, see the &quot;UploadMetadata&quot; section of this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;SourceURL&quot;:&quot;<a href="https://example.aliyundoc.com/video01.mp4%22,%22Title%22:%22urlUploadTest%22%7D%5D">https://example.aliyundoc.com/video01.mp4&quot;,&quot;Title&quot;:&quot;urlUploadTest&quot;}]</a></p>
         */
        public Builder mediaMetaData(String mediaMetaData) {
            this.putQueryParameter("MediaMetaData", mediaMetaData);
            this.mediaMetaData = mediaMetaData;
            return this;
        }

        /**
         * <p>The postprocessing configurations. You can specify this parameter if Type is set to video or audio.</p>
         * <p>Set ProcessType to Workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessType&quot;: &quot;Workflow&quot;,&quot;ProcessID&quot;:&quot;b72a06c6beeb4dcdb898feef067b1***&quot;}</p>
         */
        public Builder postProcessConfig(String postProcessConfig) {
            this.putQueryParameter("PostProcessConfig", postProcessConfig);
            this.postProcessConfig = postProcessConfig;
            return this;
        }

        /**
         * <p>The destination storage address.</p>
         * <p>Set StorageType to oss.</p>
         * <p>Set StorageLocation to an address in ApsaraVideo VOD. You cannot set this field to an OSS URL.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;StorageType&quot;:&quot;oss&quot;,&quot;StorageLocation&quot;:&quot;outin-***.oss-cn-shanghai.aliyuncs.com&quot;}</p>
         */
        public Builder uploadTargetConfig(String uploadTargetConfig) {
            this.putQueryParameter("UploadTargetConfig", uploadTargetConfig);
            this.uploadTargetConfig = uploadTargetConfig;
            return this;
        }

        /**
         * <p>The URL of the source file.</p>
         * <ul>
         * <li><p>The URL must contain a file name extension, such as mp4 in <code>https://****.mp4</code>.</p>
         * <ul>
         * <li>If the URL does not contain a file name extension, you can specify one by setting <code>FileExtension</code> in <code>UploadMetadata</code>.</li>
         * <li>If the URL contains a file name extension and <code>FileExtension</code> is also specified, the value of <code>FileExtension</code> prevails.</li>
         * </ul>
         * </li>
         * <li><p>URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.</p>
         * </li>
         * <li><p>Special characters may cause upload failures. Therefore, you must encode URLs before you separate them with commas (,).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://diffurl.mp4">https://diffurl.mp4</a></p>
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        /**
         * <p>The user data. The value must be a JSON string. You can configure settings such as message callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public UploadMediaByURLRequest build() {
            return new UploadMediaByURLRequest(this);
        } 

    } 

}
