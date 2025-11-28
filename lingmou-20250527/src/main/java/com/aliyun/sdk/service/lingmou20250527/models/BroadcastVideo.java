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
 * {@link BroadcastVideo} extends {@link TeaModel}
 *
 * <p>BroadcastVideo</p>
 */
public class BroadcastVideo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alignmentFileURL")
    private String alignmentFileURL;

    @com.aliyun.core.annotation.NameInMap("captionURL")
    private String captionURL;

    @com.aliyun.core.annotation.NameInMap("coverURL")
    private String coverURL;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("videoURL")
    private String videoURL;

    private BroadcastVideo(Builder builder) {
        this.alignmentFileURL = builder.alignmentFileURL;
        this.captionURL = builder.captionURL;
        this.coverURL = builder.coverURL;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.status = builder.status;
        this.videoURL = builder.videoURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BroadcastVideo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alignmentFileURL
     */
    public String getAlignmentFileURL() {
        return this.alignmentFileURL;
    }

    /**
     * @return captionURL
     */
    public String getCaptionURL() {
        return this.captionURL;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return videoURL
     */
    public String getVideoURL() {
        return this.videoURL;
    }

    public static final class Builder {
        private String alignmentFileURL; 
        private String captionURL; 
        private String coverURL; 
        private String createTime; 
        private String id; 
        private String modifiedTime; 
        private String name; 
        private String status; 
        private String videoURL; 

        private Builder() {
        } 

        private Builder(BroadcastVideo model) {
            this.alignmentFileURL = model.alignmentFileURL;
            this.captionURL = model.captionURL;
            this.coverURL = model.coverURL;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifiedTime = model.modifiedTime;
            this.name = model.name;
            this.status = model.status;
            this.videoURL = model.videoURL;
        } 

        /**
         * alignmentFileURL.
         */
        public Builder alignmentFileURL(String alignmentFileURL) {
            this.alignmentFileURL = alignmentFileURL;
            return this;
        }

        /**
         * captionURL.
         */
        public Builder captionURL(String captionURL) {
            this.captionURL = captionURL;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * videoURL.
         */
        public Builder videoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }

        public BroadcastVideo build() {
            return new BroadcastVideo(this);
        } 

    } 

}
