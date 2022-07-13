// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link V1MediaSecurityStorageRequest} extends {@link RequestModel}
 *
 * <p>V1MediaSecurityStorageRequest</p>
 */
public class V1MediaSecurityStorageRequest extends Request {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("AppSettings")
    private AppsSettings appSettings;

    @NameInMap("AssetId")
    private String assetId;

    @NameInMap("Customer")
    private CommonCustomer customer;

    @NameInMap("Image")
    private CommonMediaResource image;

    @NameInMap("ImageStorage")
    private CommonStorage imageStorage;

    @NameInMap("Video")
    private CommonMediaResource video;

    @NameInMap("VideoStorage")
    private CommonStorage videoStorage;

    private V1MediaSecurityStorageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSettings = builder.appSettings;
        this.assetId = builder.assetId;
        this.customer = builder.customer;
        this.image = builder.image;
        this.imageStorage = builder.imageStorage;
        this.video = builder.video;
        this.videoStorage = builder.videoStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static V1MediaSecurityStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appSettings
     */
    public AppsSettings getAppSettings() {
        return this.appSettings;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return customer
     */
    public CommonCustomer getCustomer() {
        return this.customer;
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

    public static final class Builder extends Request.Builder<V1MediaSecurityStorageRequest, Builder> {
        private String appId; 
        private AppsSettings appSettings; 
        private String assetId; 
        private CommonCustomer customer; 
        private CommonMediaResource image; 
        private CommonStorage imageStorage; 
        private CommonMediaResource video; 
        private CommonStorage videoStorage; 

        private Builder() {
            super();
        } 

        private Builder(V1MediaSecurityStorageRequest request) {
            super(request);
            this.appId = request.appId;
            this.appSettings = request.appSettings;
            this.assetId = request.assetId;
            this.customer = request.customer;
            this.image = request.image;
            this.imageStorage = request.imageStorage;
            this.video = request.video;
            this.videoStorage = request.videoStorage;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppSettings.
         */
        public Builder appSettings(AppsSettings appSettings) {
            this.appSettings = appSettings;
            return this;
        }

        /**
         * AssetId.
         */
        public Builder assetId(String assetId) {
            this.assetId = assetId;
            return this;
        }

        /**
         * Customer.
         */
        public Builder customer(CommonCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(CommonMediaResource image) {
            this.image = image;
            return this;
        }

        /**
         * ImageStorage.
         */
        public Builder imageStorage(CommonStorage imageStorage) {
            this.imageStorage = imageStorage;
            return this;
        }

        /**
         * Video.
         */
        public Builder video(CommonMediaResource video) {
            this.video = video;
            return this;
        }

        /**
         * VideoStorage.
         */
        public Builder videoStorage(CommonStorage videoStorage) {
            this.videoStorage = videoStorage;
            return this;
        }

        @Override
        public V1MediaSecurityStorageRequest build() {
            return new V1MediaSecurityStorageRequest(this);
        } 

    } 

}
