// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSnapshotJobRequest</p>
 */
public class SubmitSnapshotJobRequest extends Request {
    @Query
    @NameInMap("Count")
    private Long count;

    @Query
    @NameInMap("Height")
    private String height;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("SnapshotTemplateId")
    private String snapshotTemplateId;

    @Query
    @NameInMap("SpecifiedOffsetTime")
    private Long specifiedOffsetTime;

    @Query
    @NameInMap("SpriteSnapshotConfig")
    private String spriteSnapshotConfig;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VideoId")
    private String videoId;

    @Query
    @NameInMap("Width")
    private String width;

    private SubmitSnapshotJobRequest(Builder builder) {
        super(builder);
        this.count = builder.count;
        this.height = builder.height;
        this.interval = builder.interval;
        this.snapshotTemplateId = builder.snapshotTemplateId;
        this.specifiedOffsetTime = builder.specifiedOffsetTime;
        this.spriteSnapshotConfig = builder.spriteSnapshotConfig;
        this.userData = builder.userData;
        this.videoId = builder.videoId;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return snapshotTemplateId
     */
    public String getSnapshotTemplateId() {
        return this.snapshotTemplateId;
    }

    /**
     * @return specifiedOffsetTime
     */
    public Long getSpecifiedOffsetTime() {
        return this.specifiedOffsetTime;
    }

    /**
     * @return spriteSnapshotConfig
     */
    public String getSpriteSnapshotConfig() {
        return this.spriteSnapshotConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    /**
     * @return width
     */
    public String getWidth() {
        return this.width;
    }

    public static final class Builder extends Request.Builder<SubmitSnapshotJobRequest, Builder> {
        private Long count; 
        private String height; 
        private Long interval; 
        private String snapshotTemplateId; 
        private Long specifiedOffsetTime; 
        private String spriteSnapshotConfig; 
        private String userData; 
        private String videoId; 
        private String width; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSnapshotJobRequest response) {
            super(response);
            this.count = response.count;
            this.height = response.height;
            this.interval = response.interval;
            this.snapshotTemplateId = response.snapshotTemplateId;
            this.specifiedOffsetTime = response.specifiedOffsetTime;
            this.spriteSnapshotConfig = response.spriteSnapshotConfig;
            this.userData = response.userData;
            this.videoId = response.videoId;
            this.width = response.width;
        } 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * SnapshotTemplateId.
         */
        public Builder snapshotTemplateId(String snapshotTemplateId) {
            this.putQueryParameter("SnapshotTemplateId", snapshotTemplateId);
            this.snapshotTemplateId = snapshotTemplateId;
            return this;
        }

        /**
         * SpecifiedOffsetTime.
         */
        public Builder specifiedOffsetTime(Long specifiedOffsetTime) {
            this.putQueryParameter("SpecifiedOffsetTime", specifiedOffsetTime);
            this.specifiedOffsetTime = specifiedOffsetTime;
            return this;
        }

        /**
         * SpriteSnapshotConfig.
         */
        public Builder spriteSnapshotConfig(String spriteSnapshotConfig) {
            this.putQueryParameter("SpriteSnapshotConfig", spriteSnapshotConfig);
            this.spriteSnapshotConfig = spriteSnapshotConfig;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * VideoId.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(String width) {
            this.putQueryParameter("Width", width);
            this.width = width;
            return this;
        }

        @Override
        public SubmitSnapshotJobRequest build() {
            return new SubmitSnapshotJobRequest(this);
        } 

    } 

}
