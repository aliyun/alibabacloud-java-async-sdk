// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamGRTNStreamInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamGRTNStreamInfoResponseBody</p>
 */
public class DescribeLiveStreamGRTNStreamInfoResponseBody extends TeaModel {
    @NameInMap("LiveGRTNStreamInfoList")
    private LiveGRTNStreamInfoList liveGRTNStreamInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamGRTNStreamInfoResponseBody(Builder builder) {
        this.liveGRTNStreamInfoList = builder.liveGRTNStreamInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamGRTNStreamInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveGRTNStreamInfoList
     */
    public LiveGRTNStreamInfoList getLiveGRTNStreamInfoList() {
        return this.liveGRTNStreamInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveGRTNStreamInfoList liveGRTNStreamInfoList; 
        private String requestId; 

        /**
         * LiveGRTNStreamInfoList.
         */
        public Builder liveGRTNStreamInfoList(LiveGRTNStreamInfoList liveGRTNStreamInfoList) {
            this.liveGRTNStreamInfoList = liveGRTNStreamInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamGRTNStreamInfoResponseBody build() {
            return new DescribeLiveStreamGRTNStreamInfoResponseBody(this);
        } 

    } 

    public static class LiveGRTNStreamInfo extends TeaModel {
        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("Errmsg")
        private String errmsg;

        @NameInMap("Errno")
        private Integer errno;

        @NameInMap("FirstFrame")
        private Integer firstFrame;

        @NameInMap("FirstPacket")
        private Integer firstPacket;

        @NameInMap("IsH5")
        private Integer isH5;

        @NameInMap("IsRts")
        private Integer isRts;

        @NameInMap("Pcid")
        private String pcid;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("StartTime")
        private Integer startTime;

        @NameInMap("Tid")
        private String tid;

        @NameInMap("Url")
        private String url;

        private LiveGRTNStreamInfo(Builder builder) {
            this.clientIp = builder.clientIp;
            this.endTime = builder.endTime;
            this.errmsg = builder.errmsg;
            this.errno = builder.errno;
            this.firstFrame = builder.firstFrame;
            this.firstPacket = builder.firstPacket;
            this.isH5 = builder.isH5;
            this.isRts = builder.isRts;
            this.pcid = builder.pcid;
            this.serverIp = builder.serverIp;
            this.startTime = builder.startTime;
            this.tid = builder.tid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveGRTNStreamInfo create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return errmsg
         */
        public String getErrmsg() {
            return this.errmsg;
        }

        /**
         * @return errno
         */
        public Integer getErrno() {
            return this.errno;
        }

        /**
         * @return firstFrame
         */
        public Integer getFirstFrame() {
            return this.firstFrame;
        }

        /**
         * @return firstPacket
         */
        public Integer getFirstPacket() {
            return this.firstPacket;
        }

        /**
         * @return isH5
         */
        public Integer getIsH5() {
            return this.isH5;
        }

        /**
         * @return isRts
         */
        public Integer getIsRts() {
            return this.isRts;
        }

        /**
         * @return pcid
         */
        public String getPcid() {
            return this.pcid;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String clientIp; 
            private Integer endTime; 
            private String errmsg; 
            private Integer errno; 
            private Integer firstFrame; 
            private Integer firstPacket; 
            private Integer isH5; 
            private Integer isRts; 
            private String pcid; 
            private String serverIp; 
            private Integer startTime; 
            private String tid; 
            private String url; 

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Errmsg.
             */
            public Builder errmsg(String errmsg) {
                this.errmsg = errmsg;
                return this;
            }

            /**
             * Errno.
             */
            public Builder errno(Integer errno) {
                this.errno = errno;
                return this;
            }

            /**
             * FirstFrame.
             */
            public Builder firstFrame(Integer firstFrame) {
                this.firstFrame = firstFrame;
                return this;
            }

            /**
             * FirstPacket.
             */
            public Builder firstPacket(Integer firstPacket) {
                this.firstPacket = firstPacket;
                return this;
            }

            /**
             * IsH5.
             */
            public Builder isH5(Integer isH5) {
                this.isH5 = isH5;
                return this;
            }

            /**
             * IsRts.
             */
            public Builder isRts(Integer isRts) {
                this.isRts = isRts;
                return this;
            }

            /**
             * Pcid.
             */
            public Builder pcid(String pcid) {
                this.pcid = pcid;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public LiveGRTNStreamInfo build() {
                return new LiveGRTNStreamInfo(this);
            } 

        } 

    }
    public static class LiveGRTNStreamInfoList extends TeaModel {
        @NameInMap("LiveGRTNStreamInfo")
        private java.util.List < LiveGRTNStreamInfo> liveGRTNStreamInfo;

        private LiveGRTNStreamInfoList(Builder builder) {
            this.liveGRTNStreamInfo = builder.liveGRTNStreamInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveGRTNStreamInfoList create() {
            return builder().build();
        }

        /**
         * @return liveGRTNStreamInfo
         */
        public java.util.List < LiveGRTNStreamInfo> getLiveGRTNStreamInfo() {
            return this.liveGRTNStreamInfo;
        }

        public static final class Builder {
            private java.util.List < LiveGRTNStreamInfo> liveGRTNStreamInfo; 

            /**
             * LiveGRTNStreamInfo.
             */
            public Builder liveGRTNStreamInfo(java.util.List < LiveGRTNStreamInfo> liveGRTNStreamInfo) {
                this.liveGRTNStreamInfo = liveGRTNStreamInfo;
                return this;
            }

            public LiveGRTNStreamInfoList build() {
                return new LiveGRTNStreamInfoList(this);
            } 

        } 

    }
}
