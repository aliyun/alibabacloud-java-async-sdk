// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link SubmitMediaCensorJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaCensorJobRequest</p>
 */
public class SubmitMediaCensorJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Barrages")
    private String barrages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverImages")
    private String coverImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalUrl")
    private String externalUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCensorConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoCensorConfig;

    private SubmitMediaCensorJobRequest(Builder builder) {
        super(builder);
        this.barrages = builder.barrages;
        this.coverImages = builder.coverImages;
        this.description = builder.description;
        this.externalUrl = builder.externalUrl;
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.videoCensorConfig = builder.videoCensorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaCensorJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return barrages
     */
    public String getBarrages() {
        return this.barrages;
    }

    /**
     * @return coverImages
     */
    public String getCoverImages() {
        return this.coverImages;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return externalUrl
     */
    public String getExternalUrl() {
        return this.externalUrl;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoCensorConfig
     */
    public String getVideoCensorConfig() {
        return this.videoCensorConfig;
    }

    public static final class Builder extends Request.Builder<SubmitMediaCensorJobRequest, Builder> {
        private String barrages; 
        private String coverImages; 
        private String description; 
        private String externalUrl; 
        private String input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String title; 
        private String userData; 
        private String videoCensorConfig; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaCensorJobRequest request) {
            super(request);
            this.barrages = request.barrages;
            this.coverImages = request.coverImages;
            this.description = request.description;
            this.externalUrl = request.externalUrl;
            this.input = request.input;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.title = request.title;
            this.userData = request.userData;
            this.videoCensorConfig = request.videoCensorConfig;
        } 

        /**
         * <p>The live comments.</p>
         * 
         * <strong>example:</strong>
         * <p>hello world</p>
         */
        public Builder barrages(String barrages) {
            this.putQueryParameter("Barrages", barrages);
            this.barrages = barrages;
            return this;
        }

        /**
         * <p>The OSS URL of the image file that is used as the thumbnail. To view the OSS URL of the image file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. You can specify up to five thumbnails in a JSON array.</p>
         * <ul>
         * <li><p>Bucket: the name of the OSS bucket that stores the input file.</p>
         * </li>
         * <li><p>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</p>
         * </li>
         * <li><p>Object: the OSS object to be moderated.</p>
         * <p>**</p>
         * <p><strong>Note</strong>The name of the object cannot start with a forward slash (/). Otherwise, the operation fails to be called.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;}]</p>
         */
        public Builder coverImages(String coverImages) {
            this.putQueryParameter("CoverImages", coverImages);
            this.coverImages = coverImages;
            return this;
        }

        /**
         * <p>The description of the video. The value can be up to 128 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>example description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The URL of the video.</p>
         */
        public Builder externalUrl(String externalUrl) {
            this.putQueryParameter("ExternalUrl", externalUrl);
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) URL of the media file to be moderated. To view the OSS URL of the media file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. To moderate an image file, use the <code>CoverImage</code> parameter to specify the OSS URL of the image file. The value is a JSON object. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * <ul>
         * <li><p>Bucket: the name of the OSS bucket that stores the input file.</p>
         * </li>
         * <li><p>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</p>
         * </li>
         * <li><p>Object: the OSS object to be moderated.</p>
         * <p>**</p>
         * <p><strong>Note</strong>The name of the object cannot start with a forward slash (/). Otherwise, the operation fails to be called.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.flv&quot;}</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the MPS queue. This ID can be used to associate the job with a notification method. To view the ID of the MPS queue, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane. An empty string (&quot;&quot;) indicates that the default MPS queue is used to run the job. By default, an MPS queue can process a maximum of 10 concurrent content moderation jobs. To increase the limit, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12246746.top-nav.ditem-sub.35da7bbcitpQnr#/ticket/createIndex">submit a ticket</a>.</p>
         * <blockquote>
         * <p>MPS queues are automatically created by the system. For more information about how to query and update MPS queues, see the <a href="https://help.aliyun.com/document_detail/188374.html">UpdatePipeline</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b22c173cced04565b1f38f1ecc39****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The title of the video. The value can be up to 64 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom data. The value can be up to 128 bytes in size.</p>
         * 
         * <strong>example:</strong>
         * <p>UserDatatestid-001-****</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The video moderation configurations and the OSS URLs of the output snapshots. To view the OSS URL of the media file, you can log on to the <strong>MPS console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane.</p>
         * <p>The value is a JSON object.</p>
         * <ul>
         * <li><p>OutputFile:</p>
         * <ul>
         * <li>Bucket: the name of the OSS bucket that stores the output file.</li>
         * <li>Location: the OSS region. The OSS region must be the same as the region in which your MPS service is activated.</li>
         * <li>Object: the OSS object to be generated. In the value, {Count} indicates the sequence number of the frame snapshot.</li>
         * </ul>
         * </li>
         * <li><p>StoreVideoTimeline: specifies whether to generate the <code>{jobId}.video_timeline</code> file. The file is stored in OSS. A value of true indicates that the file is generated. A value of false indicates that the file is not generated. If you do not specify this parameter, the file is not generated by default. For more information about the format of the file, see the &quot;VideoTimelines&quot; parameter in the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> topic.</p>
         * </li>
         * <li><p>SaveType: the output mode. A value of abnormal indicates that snapshots are generated only for illegal frames. A value of all indicates that snapshots are generated for all frames.</p>
         * </li>
         * <li><p>Biztype: the moderation template. If you do not specify this parameter or set the value to common, the default template is used. You can submit a ticket to create a custom moderation template. Then, set this parameter to your user ID to use the custom moderation template.</p>
         * </li>
         * <li><p>Scenes: the moderation scenarios. You can specify the moderation scenarios that you want to use. If you do not specify this parameter, the terrorism and porn moderation scenarios are used by default. Valid values:</p>
         * <ul>
         * <li>porn: pornographic content detection</li>
         * <li>terrorism: terrorist content detection</li>
         * <li>ad: ad violation detection</li>
         * <li>live: undesirable scene detection</li>
         * <li>logo: special logo detection</li>
         * <li>audio: audio anti-spam</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the input file contains audio tracks and the audio moderation scenario is specified, the audio tracks are moderated. If the input file does not contain audio tracks, you do not need to specify the audio moderation scenario.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Scenes&quot; : [&quot;porn&quot;], &quot;OutputFile&quot;:{&quot;Bucket&quot;: &quot;example-001&quot;,&quot;Location&quot;: &quot;oss-cn-hangzhou&quot;,&quot;Object&quot;: &quot;test/example-{Count}.jpg&quot;},&quot;SaveType&quot; : &quot;abnormal&quot;,&quot;BizType&quot;:&quot;common&quot;}</p>
         */
        public Builder videoCensorConfig(String videoCensorConfig) {
            this.putQueryParameter("VideoCensorConfig", videoCensorConfig);
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }

        @Override
        public SubmitMediaCensorJobRequest build() {
            return new SubmitMediaCensorJobRequest(this);
        } 

    } 

}
