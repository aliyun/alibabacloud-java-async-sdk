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
 * {@link QueryGroupLiveInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGroupLiveInfoResponseBody</p>
 */
public class QueryGroupLiveInfoResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("replayUrl")
    private String replayUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("staffId")
    private String staffId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("subscribeCount")
    private Integer subscribeCount;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("uv")
    private Integer uv;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryGroupLiveInfoResponseBody(Builder builder) {
        this.coverUrl = builder.coverUrl;
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.introduction = builder.introduction;
        this.liveId = builder.liveId;
        this.livePlayUrl = builder.livePlayUrl;
        this.liveStatus = builder.liveStatus;
        this.playbackDuration = builder.playbackDuration;
        this.replayUrl = builder.replayUrl;
        this.requestId = builder.requestId;
        this.staffId = builder.staffId;
        this.startTime = builder.startTime;
        this.subscribeCount = builder.subscribeCount;
        this.title = builder.title;
        this.uv = builder.uv;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupLiveInfoResponseBody create() {
        return builder().build();
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
     * @return replayUrl
     */
    public String getReplayUrl() {
        return this.replayUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return staffId
     */
    public String getStaffId() {
        return this.staffId;
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

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
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
        private String replayUrl; 
        private String requestId; 
        private String staffId; 
        private Long startTime; 
        private Integer subscribeCount; 
        private String title; 
        private Integer uv; 
        private String vendorRequestId; 
        private String vendorType; 

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
         * replayUrl.
         */
        public Builder replayUrl(String replayUrl) {
            this.replayUrl = replayUrl;
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
         * staffId.
         */
        public Builder staffId(String staffId) {
            this.staffId = staffId;
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

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public QueryGroupLiveInfoResponseBody build() {
            return new QueryGroupLiveInfoResponseBody(this);
        } 

    } 

}
