// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDailyPlayStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDailyPlayStatisResponseBody</p>
 */
public class GetDailyPlayStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DailyPlayStatisList")
    private java.util.List<DailyPlayStatisList> dailyPlayStatisList;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDailyPlayStatisResponseBody(Builder builder) {
        this.dailyPlayStatisList = builder.dailyPlayStatisList;
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDailyPlayStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyPlayStatisList
     */
    public java.util.List<DailyPlayStatisList> getDailyPlayStatisList() {
        return this.dailyPlayStatisList;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DailyPlayStatisList> dailyPlayStatisList; 
        private String mediaId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDailyPlayStatisResponseBody model) {
            this.dailyPlayStatisList = model.dailyPlayStatisList;
            this.mediaId = model.mediaId;
            this.requestId = model.requestId;
        } 

        /**
         * DailyPlayStatisList.
         */
        public Builder dailyPlayStatisList(java.util.List<DailyPlayStatisList> dailyPlayStatisList) {
            this.dailyPlayStatisList = dailyPlayStatisList;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDailyPlayStatisResponseBody build() {
            return new GetDailyPlayStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDailyPlayStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetDailyPlayStatisResponseBody</p>
     */
    public static class DailyPlayStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Flow")
        private Double flow;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("PlayCount")
        private Long playCount;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private DailyPlayStatisList(Builder builder) {
            this.appId = builder.appId;
            this.date = builder.date;
            this.flow = builder.flow;
            this.mediaId = builder.mediaId;
            this.playCount = builder.playCount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyPlayStatisList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return flow
         */
        public Double getFlow() {
            return this.flow;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return playCount
         */
        public Long getPlayCount() {
            return this.playCount;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long appId; 
            private String date; 
            private Double flow; 
            private String mediaId; 
            private Long playCount; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(DailyPlayStatisList model) {
                this.appId = model.appId;
                this.date = model.date;
                this.flow = model.flow;
                this.mediaId = model.mediaId;
                this.playCount = model.playCount;
                this.userId = model.userId;
            } 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Flow.
             */
            public Builder flow(Double flow) {
                this.flow = flow;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * PlayCount.
             */
            public Builder playCount(Long playCount) {
                this.playCount = playCount;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public DailyPlayStatisList build() {
                return new DailyPlayStatisList(this);
            } 

        } 

    }
}
