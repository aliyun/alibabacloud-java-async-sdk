// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link V1MediaSecurityStorageResponse} extends {@link TeaModel}
 *
 * <p>V1MediaSecurityStorageResponse</p>
 */
public class V1MediaSecurityStorageResponse extends Response {
    @NameInMap("AssetId")
    private String assetId;

    @NameInMap("Image")
    private CommonMediaResource image;

    @NameInMap("ImageStorage")
    private CommonStorage imageStorage;

    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("Video")
    private CommonMediaResource video;

    @NameInMap("VideoStorage")
    private CommonStorage videoStorage;

    private V1MediaSecurityStorageResponse(BuilderImpl builder) {
        super(builder);
        this.assetId = builder.assetId;
        this.image = builder.image;
        this.imageStorage = builder.imageStorage;
        this.mediaId = builder.mediaId;
        this.video = builder.video;
        this.videoStorage = builder.videoStorage;
    }

    public static V1MediaSecurityStorageResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return image
     */
    public CommonMediaResource getImage() {
        return this.image;
    }

    /**
     * @return imageStorage
     */
    public CommonStorage getImageStorage() {
        return this.imageStorage;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return video
     */
    public CommonMediaResource getVideo() {
        return this.video;
    }

    /**
     * @return videoStorage
     */
    public CommonStorage getVideoStorage() {
        return this.videoStorage;
    }

    public interface Builder extends Response.Builder<V1MediaSecurityStorageResponse, Builder> {

        Builder assetId(String assetId);

        Builder image(CommonMediaResource image);

        Builder imageStorage(CommonStorage imageStorage);

        Builder mediaId(String mediaId);

        Builder video(CommonMediaResource video);

        Builder videoStorage(CommonStorage videoStorage);

        @Override
        V1MediaSecurityStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<V1MediaSecurityStorageResponse, Builder>
            implements Builder {
        private String assetId; 
        private CommonMediaResource image; 
        private CommonStorage imageStorage; 
        private String mediaId; 
        private CommonMediaResource video; 
        private CommonStorage videoStorage; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(V1MediaSecurityStorageResponse response) {
            super(response);
            this.assetId = response.assetId;
            this.image = response.image;
            this.imageStorage = response.imageStorage;
            this.mediaId = response.mediaId;
            this.video = response.video;
            this.videoStorage = response.videoStorage;
        } 

        /**
         * AssetId.
         */
        @Override
        public Builder assetId(String assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * Image.
         */
        @Override
        public Builder image(CommonMediaResource image) {
            this.image = image;
            return this;
        }

        /**
         * ImageStorage.
         */
        @Override
        public Builder imageStorage(CommonStorage imageStorage) {
            this.imageStorage = imageStorage;
            return this;
        }

        /**
         * MediaId.
         */
        @Override
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * Video.
         */
        @Override
        public Builder video(CommonMediaResource video) {
            this.video = video;
            return this;
        }

        /**
         * VideoStorage.
         */
        @Override
        public Builder videoStorage(CommonStorage videoStorage) {
            this.videoStorage = videoStorage;
            return this;
        }

        @Override
        public V1MediaSecurityStorageResponse build() {
            return new V1MediaSecurityStorageResponse(this);
        } 

    } 

}
