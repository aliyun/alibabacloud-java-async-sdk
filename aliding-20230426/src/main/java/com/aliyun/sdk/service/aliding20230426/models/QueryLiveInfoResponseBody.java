// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryLiveInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLiveInfoResponseBody</p>
 */
public class QueryLiveInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("coverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("introduction")
    private String introduction;

    @com.aliyun.core.annotation.NameInMap("liveId")
    private String liveId;

    @com.aliyun.core.annotation.NameInMap("livePlayUrl")
    private String livePlayUrl;

    @com.aliyun.core.annotation.NameInMap("liveStatus")
    private Integer liveStatus;

    @com.aliyun.core.annotation.NameInMap("playbackDuration")
    private Long playbackDuration;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("subscribeCount")
    private Integer subscribeCount;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("uv")
    private Integer uv;

    private QueryLiveInfoResponseBody(Builder builder) {
        this.coverUrl = builder.coverUrl;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.introduction = builder.introduction;
        this.liveId = builder.liveId;
        this.livePlayUrl = builder.livePlayUrl;
        this.liveStatus = builder.liveStatus;
        this.playbackDuration = builder.playbackDuration;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.subscribeCount = builder.subscribeCount;
        this.title = builder.title;
        this.uv = builder.uv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return livePlayUrl
     */
    public String getLivePlayUrl() {
        return this.livePlayUrl;
    }

    /**
     * @return liveStatus
     */
    public Integer getLiveStatus() {
        return this.liveStatus;
    }

    /**
     * @return playbackDuration
     */
    public Long getPlaybackDuration() {
        return this.playbackDuration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subscribeCount
     */
    public Integer getSubscribeCount() {
        return this.subscribeCount;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uv
     */
    public Integer getUv() {
        return this.uv;
    }

    public static final class Builder {
        private String coverUrl; 
        private Long duration; 
        private Long endTime; 
        private String introduction; 
        private String liveId; 
        private String livePlayUrl; 
        private Integer liveStatus; 
        private Long playbackDuration; 
        private String requestId; 
        private Long startTime; 
        private Integer subscribeCount; 
        private String title; 
        private Integer uv; 

        private Builder() {
        } 

        private Builder(QueryLiveInfoResponseBody model) {
            this.coverUrl = model.coverUrl;
            this.duration = model.duration;
            this.endTime = model.endTime;
            this.introduction = model.introduction;
            this.liveId = model.liveId;
            this.livePlayUrl = model.livePlayUrl;
            this.liveStatus = model.liveStatus;
            this.playbackDuration = model.playbackDuration;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.subscribeCount = model.subscribeCount;
            this.title = model.title;
            this.uv = model.uv;
        } 

        /**
         * coverUrl.
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * introduction.
         */
        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /**
         * liveId.
         */
        public Builder liveId(String liveId) {
            this.liveId = liveId;
            return this;
        }

        /**
         * livePlayUrl.
         */
        public Builder livePlayUrl(String livePlayUrl) {
            this.livePlayUrl = livePlayUrl;
            return this;
        }

        /**
         * liveStatus.
         */
        public Builder liveStatus(Integer liveStatus) {
            this.liveStatus = liveStatus;
            return this;
        }

        /**
         * playbackDuration.
         */
        public Builder playbackDuration(Long playbackDuration) {
            this.playbackDuration = playbackDuration;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * subscribeCount.
         */
        public Builder subscribeCount(Integer subscribeCount) {
            this.subscribeCount = subscribeCount;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * uv.
         */
        public Builder uv(Integer uv) {
            this.uv = uv;
            return this;
        }

        public QueryLiveInfoResponseBody build() {
            return new QueryLiveInfoResponseBody(this);
        } 

    } 

}
