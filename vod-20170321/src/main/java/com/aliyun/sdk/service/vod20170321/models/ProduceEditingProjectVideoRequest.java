// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceEditingProjectVideoRequest} extends {@link RequestModel}
 *
 * <p>ProduceEditingProjectVideoRequest</p>
 */
public class ProduceEditingProjectVideoRequest extends Request {
    @Query
    @NameInMap("CoverURL")
    private String coverURL;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("MediaMetadata")
    private String mediaMetadata;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProduceConfig")
    private String produceConfig;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Timeline")
    private String timeline;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    private ProduceEditingProjectVideoRequest(Builder builder) {
        super(builder);
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.mediaMetadata = builder.mediaMetadata;
        this.ownerId = builder.ownerId;
        this.produceConfig = builder.produceConfig;
        this.projectId = builder.projectId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timeline = builder.timeline;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProduceEditingProjectVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mediaMetadata
     */
    public String getMediaMetadata() {
        return this.mediaMetadata;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return produceConfig
     */
    public String getProduceConfig() {
        return this.produceConfig;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
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

    public static final class Builder extends Request.Builder<ProduceEditingProjectVideoRequest, Builder> {
        private String coverURL; 
        private String description; 
        private String mediaMetadata; 
        private Long ownerId; 
        private String produceConfig; 
        private String projectId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String timeline; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ProduceEditingProjectVideoRequest request) {
            super(request);
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.mediaMetadata = request.mediaMetadata;
            this.ownerId = request.ownerId;
            this.produceConfig = request.produceConfig;
            this.projectId = request.projectId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.timeline = request.timeline;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * The thumbnail URL of the online editing project.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * The description of the online editing project.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The metadata of the produced video, in JSON format. For more information about the structure, see [MediaMetadata](~~52839~~).
         */
        public Builder mediaMetadata(String mediaMetadata) {
            this.putQueryParameter("MediaMetadata", mediaMetadata);
            this.mediaMetadata = mediaMetadata;
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
         * The configuration of video production, in JSON format. For more information about the structure, see [ProduceConfig](~~52839~~).
         */
        public Builder produceConfig(String produceConfig) {
            this.putQueryParameter("ProduceConfig", produceConfig);
            this.produceConfig = produceConfig;
            return this;
        }

        /**
         * The ID of the online editing project.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * The timeline of the online editing project, in JSON format. For more information about the structure, see [Timeline](~~52839~~).
         */
        public Builder timeline(String timeline) {
            this.putQueryParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * The title of the online editing project.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The custom configuration, such as the callback configuration. The value is a JSON-formatted string. For more information about the structure, see [UserData](~~86952~~).
         * <p>
         * 
         * > To use the MessageCallback parameter, you must set an HTTP callback URL and select a callback event type in the ApsaraVideo VOD console. Otherwise, the callback configuration does not take effect.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ProduceEditingProjectVideoRequest build() {
            return new ProduceEditingProjectVideoRequest(this);
        } 

    } 

}
