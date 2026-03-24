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
 * {@link BroadcastSceneTemplate} extends {@link TeaModel}
 *
 * <p>BroadcastSceneTemplate</p>
 */
public class BroadcastSceneTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("coverURL")
    private String coverURL;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

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

    @com.aliyun.core.annotation.NameInMap("shortVideoURL")
    private String shortVideoURL;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.NameInMap("thumbnailURL")
    private String thumbnailURL;

    private BroadcastSceneTemplate(Builder builder) {
        this.coverURL = builder.coverURL;
        this.createTime = builder.createTime;
        this.desc = builder.desc;
        this.id = builder.id;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.previewURL = builder.previewURL;
        this.ratio = builder.ratio;
        this.shortVideoURL = builder.shortVideoURL;
        this.tags = builder.tags;
        this.thumbnailURL = builder.thumbnailURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BroadcastSceneTemplate create() {
        return builder().build();
    }

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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
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
     * @return shortVideoURL
     */
    public String getShortVideoURL() {
        return this.shortVideoURL;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return thumbnailURL
     */
    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public static final class Builder {
        private String coverURL; 
        private String createTime; 
        private String desc; 
        private String id; 
        private String modifiedTime; 
        private String name; 
        private String previewURL; 
        private String ratio; 
        private String shortVideoURL; 
        private java.util.List<String> tags; 
        private String thumbnailURL; 

        private Builder() {
        } 

        private Builder(BroadcastSceneTemplate model) {
            this.coverURL = model.coverURL;
            this.createTime = model.createTime;
            this.desc = model.desc;
            this.id = model.id;
            this.modifiedTime = model.modifiedTime;
            this.name = model.name;
            this.previewURL = model.previewURL;
            this.ratio = model.ratio;
            this.shortVideoURL = model.shortVideoURL;
            this.tags = model.tags;
            this.thumbnailURL = model.thumbnailURL;
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
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
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
         * shortVideoURL.
         */
        public Builder shortVideoURL(String shortVideoURL) {
            this.shortVideoURL = shortVideoURL;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * thumbnailURL.
         */
        public Builder thumbnailURL(String thumbnailURL) {
            this.thumbnailURL = thumbnailURL;
            return this;
        }

        public BroadcastSceneTemplate build() {
            return new BroadcastSceneTemplate(this);
        } 

    } 

}
