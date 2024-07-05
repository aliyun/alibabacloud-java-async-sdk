// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMediaRequest} extends {@link RequestModel}
 *
 * <p>AddMediaRequest</p>
 */
public class AddMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileURL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputUnbind")
    private Boolean inputUnbind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
    private String mediaWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowUserData")
    private String mediaWorkflowUserData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private AddMediaRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.fileURL = builder.fileURL;
        this.inputUnbind = builder.inputUnbind;
        this.mediaWorkflowId = builder.mediaWorkflowId;
        this.mediaWorkflowUserData = builder.mediaWorkflowUserData;
        this.overrideParams = builder.overrideParams;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return inputUnbind
     */
    public Boolean getInputUnbind() {
        return this.inputUnbind;
    }

    /**
     * @return mediaWorkflowId
     */
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    /**
     * @return mediaWorkflowUserData
     */
    public String getMediaWorkflowUserData() {
        return this.mediaWorkflowUserData;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
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
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<AddMediaRequest, Builder> {
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String fileURL; 
        private Boolean inputUnbind; 
        private String mediaWorkflowId; 
        private String mediaWorkflowUserData; 
        private String overrideParams; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaRequest request) {
            super(request);
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.fileURL = request.fileURL;
            this.inputUnbind = request.inputUnbind;
            this.mediaWorkflowId = request.mediaWorkflowId;
            this.mediaWorkflowUserData = request.mediaWorkflowUserData;
            this.overrideParams = request.overrideParams;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.title = request.title;
        } 

        /**
         * The ID of the category to which the media file belongs. The value cannot be negative.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The URL of the thumbnail. To obtain the URL, you can log on to the **MPS console** and choose **Workflows** > **Media Buckets**. Alternatively, you can log on to the **OSS console** and click **My OSS Paths**.
         * <p>
         * 
         * *   The value can be up to 3,200 bytes in length.
         * *   The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see [URL encoding](~~423796~~).
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * The description of the media file.
         * <p>
         * 
         * *   The description can be up to 1,024 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The path of the input file. You can query the path of the input file in the MPS or OSS console. For more information, see the **Triggering and matching rules for a workflow** section of this topic.
         * <p>
         * 
         * *   The value can be up to 3,200 bytes in length.
         * *   The URL complies with RFC 2396 and is encoded in UTF-8, with reserved characters being percent-encoded. For more information, see [URL encoding](~~423796~~).
         */
        public Builder fileURL(String fileURL) {
            this.putQueryParameter("FileURL", fileURL);
            this.fileURL = fileURL;
            return this;
        }

        /**
         * Specifies whether to check if the media workflow supports the specified input path. We recommend that you set this parameter to true to prevent errors that may result from invalid paths. Valid values:
         * <p>
         * 
         * *   **true**: checks whether the workflow supports the specified input path.
         * *   **false**: does not check whether the workflow supports the specified input path.
         */
        public Builder inputUnbind(Boolean inputUnbind) {
            this.putQueryParameter("InputUnbind", inputUnbind);
            this.inputUnbind = inputUnbind;
            return this;
        }

        /**
         * The ID of the media workflow that you want to run for the media file. To query the ID of a media workflow, you can log on to the MPS console or call the [AddMediaWorkflow](~~44437~~) operation.
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * The custom data of the media workflow.
         * <p>
         * 
         * *   The value can be up to 1,024 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder mediaWorkflowUserData(String mediaWorkflowUserData) {
            this.putQueryParameter("MediaWorkflowUserData", mediaWorkflowUserData);
            this.mediaWorkflowUserData = mediaWorkflowUserData;
            return this;
        }

        /**
         * The subtitle settings that are used to overwrite the original settings.
         * <p>
         * 
         * *   Example 1: Use `{"WebVTTSubtitleOverrides",[{"RefActivityName":"subtitleNode","WebVTTSubtitleURL":"http://test.oss-cn-hangzhou.aliyuncs.com/example1.vtt"}]}` to overwrite the original subtitle settings during HTTP Live Streaming (HLS) packaging.
         * *   Example 2: Use `{"subtitleTransNodeName":{"InputConfig":{"Format":"stl","InputFile":{"URL":"http://subtitleBucket.oss-cn-hangzhou.aliyuncs.com/package/example/CENG.stl"}}}}` to overwrite the original subtitle settings during Dynamic Adaptive Streaming over HTTP (DASH) packaging.
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
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
         * The tags that you want to add to the media file.
         * <p>
         * 
         * > In MPS, each tag that is specified for a media file is independent. You can search for all the media files that have the same tags in the Media Library.
         * 
         * *   You can specify up to 16 tags for a media file. Separate multiple tags with commas (,).
         * *   Each tag can be up to 32 bytes in size
         * *   The value must be encoded in UTF-8.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The title of the media file.
         * <p>
         * 
         * *   The title can be up to 128 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public AddMediaRequest build() {
            return new AddMediaRequest(this);
        } 

    } 

}
