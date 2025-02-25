// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDigitalHumanVideoCmd} extends {@link TeaModel}
 *
 * <p>SyncDigitalHumanVideoCmd</p>
 */
public class SyncDigitalHumanVideoCmd extends TeaModel {
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @NameInMap("actionType")
    @Validation(required = true)
    private String actionType;

    @NameInMap("idempotentId")
    private String idempotentId;

    @NameInMap("imageScale")
    private String imageScale;

    @NameInMap("imageUrl")
    private String imageUrl;

    @NameInMap("videoDuration")
    private Integer videoDuration;

    @NameInMap("videoId")
    @Validation(required = true)
    private String videoId;

    @NameInMap("videoTitle")
    private String videoTitle;

    @NameInMap("videoUrl")
    private String videoUrl;

    private SyncDigitalHumanVideoCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.actionType = builder.actionType;
        this.idempotentId = builder.idempotentId;
        this.imageScale = builder.imageScale;
        this.imageUrl = builder.imageUrl;
        this.videoDuration = builder.videoDuration;
        this.videoId = builder.videoId;
        this.videoTitle = builder.videoTitle;
        this.videoUrl = builder.videoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDigitalHumanVideoCmd create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return idempotentId
     */
    public String getIdempotentId() {
        return this.idempotentId;
    }

    /**
     * @return imageScale
     */
    public String getImageScale() {
        return this.imageScale;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return videoDuration
     */
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    /**
     * @return videoTitle
     */
    public String getVideoTitle() {
        return this.videoTitle;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static final class Builder {
        private String accountId; 
        private String actionType; 
        private String idempotentId; 
        private String imageScale; 
        private String imageUrl; 
        private Integer videoDuration; 
        private String videoId; 
        private String videoTitle; 
        private String videoUrl; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * actionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * idempotentId.
         */
        public Builder idempotentId(String idempotentId) {
            this.idempotentId = idempotentId;
            return this;
        }

        /**
         * imageScale.
         */
        public Builder imageScale(String imageScale) {
            this.imageScale = imageScale;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * videoDuration.
         */
        public Builder videoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }

        /**
         * videoId.
         */
        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        /**
         * videoTitle.
         */
        public Builder videoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
            return this;
        }

        /**
         * videoUrl.
         */
        public Builder videoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public SyncDigitalHumanVideoCmd build() {
            return new SyncDigitalHumanVideoCmd(this);
        } 

    } 

}
