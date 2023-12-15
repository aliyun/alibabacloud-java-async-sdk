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
    @NameInMap("SpecifiedOffsetTimes")
    private java.util.List < Long > specifiedOffsetTimes;

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
        this.specifiedOffsetTimes = builder.specifiedOffsetTimes;
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
     * @return specifiedOffsetTimes
     */
    public java.util.List < Long > getSpecifiedOffsetTimes() {
        return this.specifiedOffsetTimes;
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
        private java.util.List < Long > specifiedOffsetTimes; 
        private String spriteSnapshotConfig; 
        private String userData; 
        private String videoId; 
        private String width; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSnapshotJobRequest request) {
            super(request);
            this.count = request.count;
            this.height = request.height;
            this.interval = request.interval;
            this.snapshotTemplateId = request.snapshotTemplateId;
            this.specifiedOffsetTime = request.specifiedOffsetTime;
            this.specifiedOffsetTimes = request.specifiedOffsetTimes;
            this.spriteSnapshotConfig = request.spriteSnapshotConfig;
            this.userData = request.userData;
            this.videoId = request.videoId;
            this.width = request.width;
        } 

        /**
         * The maximum number of snapshots. Default value: **1**.
         */
        public Builder count(Long count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * The height of each snapshot. Valid values: `[8,4096]`. By default, the height of the video mezzanine file is used. Unit: pixel.
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * The snapshot interval. The value must be **greater than or equal to 0**. Unit: seconds. If you set this parameter to **0**, snapshots are taken at even intervals based on the video duration divided by the value of the Count parameter. Default value: **1**.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The ID of the snapshot template.
         * <p>
         * 
         * *   We recommend that you create a snapshot template before you specify the ID of the snapshot template.
         * *   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.
         * *   For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).
         */
        public Builder snapshotTemplateId(String snapshotTemplateId) {
            this.putQueryParameter("SnapshotTemplateId", snapshotTemplateId);
            this.snapshotTemplateId = snapshotTemplateId;
            return this;
        }

        /**
         * The start time of the specified snapshot time period.
         * <p>
         * 
         * *   Unit: milliseconds.
         * *   Default value: **0**.
         */
        public Builder specifiedOffsetTime(Long specifiedOffsetTime) {
            this.putQueryParameter("SpecifiedOffsetTime", specifiedOffsetTime);
            this.specifiedOffsetTime = specifiedOffsetTime;
            return this;
        }

        /**
         * SpecifiedOffsetTimes.
         */
        public Builder specifiedOffsetTimes(java.util.List < Long > specifiedOffsetTimes) {
            String specifiedOffsetTimesShrink = shrink(specifiedOffsetTimes, "SpecifiedOffsetTimes", "json");
            this.putQueryParameter("SpecifiedOffsetTimes", specifiedOffsetTimesShrink);
            this.specifiedOffsetTimes = specifiedOffsetTimes;
            return this;
        }

        /**
         * The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see [SpriteSnapshotConfig](~~86952~~).
         */
        public Builder spriteSnapshotConfig(String spriteSnapshotConfig) {
            this.putQueryParameter("SpriteSnapshotConfig", spriteSnapshotConfig);
            this.spriteSnapshotConfig = spriteSnapshotConfig;
            return this;
        }

        /**
         * The custom configurations, including the configuration of transparent data transmission and callback configurations. The value is a JSON-formatted string. For more information, see [UserData](~~86952~~).
         * <p>
         * 
         * **
         * 
         * **Note** The callback configurations take effect only when you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the video.
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        /**
         * The width of each snapshot. Valid values: `[8,4096]`. By default, the width of the video mezzanine file is used. Unit: pixel.
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
