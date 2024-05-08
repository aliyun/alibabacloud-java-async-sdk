// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLiveWatchDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLiveWatchDetailResponseBody</p>
 */
public class QueryLiveWatchDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("avgWatchTime")
    private Long avgWatchTime;

    @com.aliyun.core.annotation.NameInMap("liveUv")
    private Integer liveUv;

    @com.aliyun.core.annotation.NameInMap("msgCount")
    private Integer msgCount;

    @com.aliyun.core.annotation.NameInMap("playbackUv")
    private Integer playbackUv;

    @com.aliyun.core.annotation.NameInMap("praiseCount")
    private Integer praiseCount;

    @com.aliyun.core.annotation.NameInMap("pv")
    private Integer pv;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalWatchTime")
    private Long totalWatchTime;

    @com.aliyun.core.annotation.NameInMap("uv")
    private Integer uv;

    private QueryLiveWatchDetailResponseBody(Builder builder) {
        this.avgWatchTime = builder.avgWatchTime;
        this.liveUv = builder.liveUv;
        this.msgCount = builder.msgCount;
        this.playbackUv = builder.playbackUv;
        this.praiseCount = builder.praiseCount;
        this.pv = builder.pv;
        this.requestId = builder.requestId;
        this.totalWatchTime = builder.totalWatchTime;
        this.uv = builder.uv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLiveWatchDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return avgWatchTime
     */
    public Long getAvgWatchTime() {
        return this.avgWatchTime;
    }

    /**
     * @return liveUv
     */
    public Integer getLiveUv() {
        return this.liveUv;
    }

    /**
     * @return msgCount
     */
    public Integer getMsgCount() {
        return this.msgCount;
    }

    /**
     * @return playbackUv
     */
    public Integer getPlaybackUv() {
        return this.playbackUv;
    }

    /**
     * @return praiseCount
     */
    public Integer getPraiseCount() {
        return this.praiseCount;
    }

    /**
     * @return pv
     */
    public Integer getPv() {
        return this.pv;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalWatchTime
     */
    public Long getTotalWatchTime() {
        return this.totalWatchTime;
    }

    /**
     * @return uv
     */
    public Integer getUv() {
        return this.uv;
    }

    public static final class Builder {
        private Long avgWatchTime; 
        private Integer liveUv; 
        private Integer msgCount; 
        private Integer playbackUv; 
        private Integer praiseCount; 
        private Integer pv; 
        private String requestId; 
        private Long totalWatchTime; 
        private Integer uv; 

        /**
         * avgWatchTime.
         */
        public Builder avgWatchTime(Long avgWatchTime) {
            this.avgWatchTime = avgWatchTime;
            return this;
        }

        /**
         * liveUv.
         */
        public Builder liveUv(Integer liveUv) {
            this.liveUv = liveUv;
            return this;
        }

        /**
         * msgCount.
         */
        public Builder msgCount(Integer msgCount) {
            this.msgCount = msgCount;
            return this;
        }

        /**
         * playbackUv.
         */
        public Builder playbackUv(Integer playbackUv) {
            this.playbackUv = playbackUv;
            return this;
        }

        /**
         * praiseCount.
         */
        public Builder praiseCount(Integer praiseCount) {
            this.praiseCount = praiseCount;
            return this;
        }

        /**
         * pv.
         */
        public Builder pv(Integer pv) {
            this.pv = pv;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalWatchTime.
         */
        public Builder totalWatchTime(Long totalWatchTime) {
            this.totalWatchTime = totalWatchTime;
            return this;
        }

        /**
         * uv.
         */
        public Builder uv(Integer uv) {
            this.uv = uv;
            return this;
        }

        public QueryLiveWatchDetailResponseBody build() {
            return new QueryLiveWatchDetailResponseBody(this);
        } 

    } 

}
