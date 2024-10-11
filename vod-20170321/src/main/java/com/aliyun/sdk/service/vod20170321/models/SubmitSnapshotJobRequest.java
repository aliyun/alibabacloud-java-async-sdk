// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSnapshotJobRequest</p>
 */
public class SubmitSnapshotJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Height")
    private String height;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotTemplateId")
    private String snapshotTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedOffsetTime")
    private Long specifiedOffsetTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecifiedOffsetTimes")
    private java.util.List < Long > specifiedOffsetTimes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpriteSnapshotConfig")
    private String spriteSnapshotConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Width")
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
         * <p>The maximum number of snapshots. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Long count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The height of each snapshot. Valid values: <code>[8,4096]</code>. By default, the height of the video source is used. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder height(String height) {
            this.putQueryParameter("Height", height);
            this.height = height;
            return this;
        }

        /**
         * <p>The snapshot interval. The value must be <strong>greater than or equal to 0</strong>.</p>
         * <ul>
         * <li>Unit: seconds.</li>
         * <li>Default value: <strong>1</strong>.</li>
         * <li>If you set this parameter to <strong>0</strong>, snapshots are captured at even intervals based on the video duration divided by the value of the Count parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The ID of the snapshot template.</p>
         * <ul>
         * <li>We recommend that you create a snapshot template before you specify the template ID. For more information about how to create a snapshot template, see <a href="https://help.aliyun.com/document_detail/99406.html">AddVodTemplate</a>.</li>
         * <li>If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f5b228fe693bf55bd87b789****</p>
         */
        public Builder snapshotTemplateId(String snapshotTemplateId) {
            this.putQueryParameter("SnapshotTemplateId", snapshotTemplateId);
            this.snapshotTemplateId = snapshotTemplateId;
            return this;
        }

        /**
         * <p>The point in time when the first snapshot is captured.</p>
         * <ul>
         * <li>Unit: milliseconds.</li>
         * <li>Default value: <strong>0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder specifiedOffsetTime(Long specifiedOffsetTime) {
            this.putQueryParameter("SpecifiedOffsetTime", specifiedOffsetTime);
            this.specifiedOffsetTime = specifiedOffsetTime;
            return this;
        }

        /**
         * <p>The playback positions at which you want to capture snapshots. Unit: milliseconds. You can specify up to 30 playback positions in a request.</p>
         */
        public Builder specifiedOffsetTimes(java.util.List < Long > specifiedOffsetTimes) {
            String specifiedOffsetTimesShrink = shrink(specifiedOffsetTimes, "SpecifiedOffsetTimes", "json");
            this.putQueryParameter("SpecifiedOffsetTimes", specifiedOffsetTimesShrink);
            this.specifiedOffsetTimes = specifiedOffsetTimes;
            return this;
        }

        /**
         * <p>The sprite snapshot configuration. If you set this parameter, sprite snapshots are generated. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">SpriteSnapshotConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CellWidth&quot;: 120, &quot;CellHeight&quot;: 68, &quot;Columns&quot;: 3,&quot;Lines&quot;: 10, &quot;Padding&quot;: 20, &quot;Margin&quot;: 50}</p>
         */
        public Builder spriteSnapshotConfig(String spriteSnapshotConfig) {
            this.putQueryParameter("SpriteSnapshotConfig", spriteSnapshotConfig);
            this.spriteSnapshotConfig = spriteSnapshotConfig;
            return this;
        }

        /**
         * <p>The custom configurations including the configuration of transparent data transmission and callback configurations. The value must be a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/86952.html">UserData</a>.</p>
         * <blockquote>
         * <p> To use the message callback feature, you must specify an HTTP callback URL and the callback events in the ApsaraVideo VOD console. Otherwise, the callback settings do not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;http://.example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;example&quot;:&quot;www&quot;}}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>After you upload a video in the ApsaraVideo VOD console, you can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
         * <li>Obtain the video ID from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you called to obtain the upload URL and credential.</li>
         * <li>Obtain the video ID from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you called to query media information after the audio or video file is uploaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>d3e680e618708efbf2cae7cc9312****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        /**
         * <p>The width of each snapshot. Valid values: <code>[8,4096]</code>. By default, the width of the video source is used. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
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
