// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link BroadcastScene} extends {@link TeaModel}
 *
 * <p>BroadcastScene</p>
 */
public class BroadcastScene extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clipInfo")
    private String clipInfo;

    @com.aliyun.core.annotation.NameInMap("coverURL")
    private String coverURL;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("downloadURL")
    private String downloadURL;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("previewURL")
    private String previewURL;

    @com.aliyun.core.annotation.NameInMap("ratio")
    private String ratio;

    @com.aliyun.core.annotation.NameInMap("remainSeconds")
    private Long remainSeconds;

    @com.aliyun.core.annotation.NameInMap("shortVideoURL")
    private String shortVideoURL;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("thumbnailURL")
    private String thumbnailURL;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private BroadcastScene(Builder builder) {
        this.clipInfo = builder.clipInfo;
        this.coverURL = builder.coverURL;
        this.createTime = builder.createTime;
        this.downloadURL = builder.downloadURL;
        this.id = builder.id;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.previewURL = builder.previewURL;
        this.ratio = builder.ratio;
        this.remainSeconds = builder.remainSeconds;
        this.shortVideoURL = builder.shortVideoURL;
        this.status = builder.status;
        this.thumbnailURL = builder.thumbnailURL;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BroadcastScene create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clipInfo
     */
    public String getClipInfo() {
        return this.clipInfo;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return downloadURL
     */
    public String getDownloadURL() {
        return this.downloadURL;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return previewURL
     */
    public String getPreviewURL() {
        return this.previewURL;
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return remainSeconds
     */
    public Long getRemainSeconds() {
        return this.remainSeconds;
    }

    /**
     * @return shortVideoURL
     */
    public String getShortVideoURL() {
        return this.shortVideoURL;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thumbnailURL
     */
    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String clipInfo; 
        private String coverURL; 
        private String createTime; 
        private String downloadURL; 
        private String id; 
        private String modifiedTime; 
        private String name; 
        private String previewURL; 
        private String ratio; 
        private Long remainSeconds; 
        private String shortVideoURL; 
        private String status; 
        private String thumbnailURL; 
        private Long version; 

        private Builder() {
        } 

        private Builder(BroadcastScene model) {
            this.clipInfo = model.clipInfo;
            this.coverURL = model.coverURL;
            this.createTime = model.createTime;
            this.downloadURL = model.downloadURL;
            this.id = model.id;
            this.modifiedTime = model.modifiedTime;
            this.name = model.name;
            this.previewURL = model.previewURL;
            this.ratio = model.ratio;
            this.remainSeconds = model.remainSeconds;
            this.shortVideoURL = model.shortVideoURL;
            this.status = model.status;
            this.thumbnailURL = model.thumbnailURL;
            this.version = model.version;
        } 

        /**
         * clipInfo.
         */
        public Builder clipInfo(String clipInfo) {
            this.clipInfo = clipInfo;
            return this;
        }

        /**
         * coverURL.
         */
        public Builder coverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * downloadURL.
         */
        public Builder downloadURL(String downloadURL) {
            this.downloadURL = downloadURL;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * previewURL.
         */
        public Builder previewURL(String previewURL) {
            this.previewURL = previewURL;
            return this;
        }

        /**
         * ratio.
         */
        public Builder ratio(String ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * remainSeconds.
         */
        public Builder remainSeconds(Long remainSeconds) {
            this.remainSeconds = remainSeconds;
            return this;
        }

        /**
         * shortVideoURL.
         */
        public Builder shortVideoURL(String shortVideoURL) {
            this.shortVideoURL = shortVideoURL;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * thumbnailURL.
         */
        public Builder thumbnailURL(String thumbnailURL) {
            this.thumbnailURL = thumbnailURL;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public BroadcastScene build() {
            return new BroadcastScene(this);
        } 

    } 

}
