// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamGRTNStreamDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamGRTNStreamDataResponseBody</p>
 */
public class DescribeLiveStreamGRTNStreamDataResponseBody extends TeaModel {
    @NameInMap("LiveGRTNStreamData")
    private LiveGRTNStreamData liveGRTNStreamData;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamGRTNStreamDataResponseBody(Builder builder) {
        this.liveGRTNStreamData = builder.liveGRTNStreamData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamGRTNStreamDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveGRTNStreamData
     */
    public LiveGRTNStreamData getLiveGRTNStreamData() {
        return this.liveGRTNStreamData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveGRTNStreamData liveGRTNStreamData; 
        private String requestId; 

        /**
         * LiveGRTNStreamData.
         */
        public Builder liveGRTNStreamData(LiveGRTNStreamData liveGRTNStreamData) {
            this.liveGRTNStreamData = liveGRTNStreamData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamGRTNStreamDataResponseBody build() {
            return new DescribeLiveStreamGRTNStreamDataResponseBody(this);
        } 

    } 

    public static class CdnDelay extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private CdnDelay(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnDelay create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public CdnDelay build() {
                return new CdnDelay(this);
            } 

        } 

    }
    public static class CdnDelayList extends TeaModel {
        @NameInMap("CdnDelay")
        private java.util.List < CdnDelay> cdnDelay;

        private CdnDelayList(Builder builder) {
            this.cdnDelay = builder.cdnDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnDelayList create() {
            return builder().build();
        }

        /**
         * @return cdnDelay
         */
        public java.util.List < CdnDelay> getCdnDelay() {
            return this.cdnDelay;
        }

        public static final class Builder {
            private java.util.List < CdnDelay> cdnDelay; 

            /**
             * CdnDelay.
             */
            public Builder cdnDelay(java.util.List < CdnDelay> cdnDelay) {
                this.cdnDelay = cdnDelay;
                return this;
            }

            public CdnDelayList build() {
                return new CdnDelayList(this);
            } 

        } 

    }
    public static class NetDelay extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NetDelay(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetDelay create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NetDelay build() {
                return new NetDelay(this);
            } 

        } 

    }
    public static class NetDelayList extends TeaModel {
        @NameInMap("NetDelay")
        private java.util.List < NetDelay> netDelay;

        private NetDelayList(Builder builder) {
            this.netDelay = builder.netDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetDelayList create() {
            return builder().build();
        }

        /**
         * @return netDelay
         */
        public java.util.List < NetDelay> getNetDelay() {
            return this.netDelay;
        }

        public static final class Builder {
            private java.util.List < NetDelay> netDelay; 

            /**
             * NetDelay.
             */
            public Builder netDelay(java.util.List < NetDelay> netDelay) {
                this.netDelay = netDelay;
                return this;
            }

            public NetDelayList build() {
                return new NetDelayList(this);
            } 

        } 

    }
    public static class Delay extends TeaModel {
        @NameInMap("CdnDelayList")
        private CdnDelayList cdnDelayList;

        @NameInMap("NetDelayList")
        private NetDelayList netDelayList;

        private Delay(Builder builder) {
            this.cdnDelayList = builder.cdnDelayList;
            this.netDelayList = builder.netDelayList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delay create() {
            return builder().build();
        }

        /**
         * @return cdnDelayList
         */
        public CdnDelayList getCdnDelayList() {
            return this.cdnDelayList;
        }

        /**
         * @return netDelayList
         */
        public NetDelayList getNetDelayList() {
            return this.netDelayList;
        }

        public static final class Builder {
            private CdnDelayList cdnDelayList; 
            private NetDelayList netDelayList; 

            /**
             * CdnDelayList.
             */
            public Builder cdnDelayList(CdnDelayList cdnDelayList) {
                this.cdnDelayList = cdnDelayList;
                return this;
            }

            /**
             * NetDelayList.
             */
            public Builder netDelayList(NetDelayList netDelayList) {
                this.netDelayList = netDelayList;
                return this;
            }

            public Delay build() {
                return new Delay(this);
            } 

        } 

    }
    public static class NackFailCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailCount build() {
                return new NackFailCount(this);
            } 

        } 

    }
    public static class NackFailCountList extends TeaModel {
        @NameInMap("NackFailCount")
        private java.util.List < NackFailCount> nackFailCount;

        private NackFailCountList(Builder builder) {
            this.nackFailCount = builder.nackFailCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailCountList create() {
            return builder().build();
        }

        /**
         * @return nackFailCount
         */
        public java.util.List < NackFailCount> getNackFailCount() {
            return this.nackFailCount;
        }

        public static final class Builder {
            private java.util.List < NackFailCount> nackFailCount; 

            /**
             * NackFailCount.
             */
            public Builder nackFailCount(java.util.List < NackFailCount> nackFailCount) {
                this.nackFailCount = nackFailCount;
                return this;
            }

            public NackFailCountList build() {
                return new NackFailCountList(this);
            } 

        } 

    }
    public static class NackFailMaxCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailMaxCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMaxCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailMaxCount build() {
                return new NackFailMaxCount(this);
            } 

        } 

    }
    public static class NackFailMaxCountList extends TeaModel {
        @NameInMap("NackFailMaxCount")
        private java.util.List < NackFailMaxCount> nackFailMaxCount;

        private NackFailMaxCountList(Builder builder) {
            this.nackFailMaxCount = builder.nackFailMaxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMaxCountList create() {
            return builder().build();
        }

        /**
         * @return nackFailMaxCount
         */
        public java.util.List < NackFailMaxCount> getNackFailMaxCount() {
            return this.nackFailMaxCount;
        }

        public static final class Builder {
            private java.util.List < NackFailMaxCount> nackFailMaxCount; 

            /**
             * NackFailMaxCount.
             */
            public Builder nackFailMaxCount(java.util.List < NackFailMaxCount> nackFailMaxCount) {
                this.nackFailMaxCount = nackFailMaxCount;
                return this;
            }

            public NackFailMaxCountList build() {
                return new NackFailMaxCountList(this);
            } 

        } 

    }
    public static class NackFailMaxRtt extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailMaxRtt(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMaxRtt create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailMaxRtt build() {
                return new NackFailMaxRtt(this);
            } 

        } 

    }
    public static class NackFailMaxRttList extends TeaModel {
        @NameInMap("NackFailMaxRtt")
        private java.util.List < NackFailMaxRtt> nackFailMaxRtt;

        private NackFailMaxRttList(Builder builder) {
            this.nackFailMaxRtt = builder.nackFailMaxRtt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMaxRttList create() {
            return builder().build();
        }

        /**
         * @return nackFailMaxRtt
         */
        public java.util.List < NackFailMaxRtt> getNackFailMaxRtt() {
            return this.nackFailMaxRtt;
        }

        public static final class Builder {
            private java.util.List < NackFailMaxRtt> nackFailMaxRtt; 

            /**
             * NackFailMaxRtt.
             */
            public Builder nackFailMaxRtt(java.util.List < NackFailMaxRtt> nackFailMaxRtt) {
                this.nackFailMaxRtt = nackFailMaxRtt;
                return this;
            }

            public NackFailMaxRttList build() {
                return new NackFailMaxRttList(this);
            } 

        } 

    }
    public static class NackFailMinRtt extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailMinRtt(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMinRtt create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailMinRtt build() {
                return new NackFailMinRtt(this);
            } 

        } 

    }
    public static class NackFailMinRttList extends TeaModel {
        @NameInMap("NackFailMinRtt")
        private java.util.List < NackFailMinRtt> nackFailMinRtt;

        private NackFailMinRttList(Builder builder) {
            this.nackFailMinRtt = builder.nackFailMinRtt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailMinRttList create() {
            return builder().build();
        }

        /**
         * @return nackFailMinRtt
         */
        public java.util.List < NackFailMinRtt> getNackFailMinRtt() {
            return this.nackFailMinRtt;
        }

        public static final class Builder {
            private java.util.List < NackFailMinRtt> nackFailMinRtt; 

            /**
             * NackFailMinRtt.
             */
            public Builder nackFailMinRtt(java.util.List < NackFailMinRtt> nackFailMinRtt) {
                this.nackFailMinRtt = nackFailMinRtt;
                return this;
            }

            public NackFailMinRttList build() {
                return new NackFailMinRttList(this);
            } 

        } 

    }
    public static class NackFailNotFound extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailNotFound(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailNotFound create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailNotFound build() {
                return new NackFailNotFound(this);
            } 

        } 

    }
    public static class NackFailNotFoundList extends TeaModel {
        @NameInMap("NackFailNotFound")
        private java.util.List < NackFailNotFound> nackFailNotFound;

        private NackFailNotFoundList(Builder builder) {
            this.nackFailNotFound = builder.nackFailNotFound;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailNotFoundList create() {
            return builder().build();
        }

        /**
         * @return nackFailNotFound
         */
        public java.util.List < NackFailNotFound> getNackFailNotFound() {
            return this.nackFailNotFound;
        }

        public static final class Builder {
            private java.util.List < NackFailNotFound> nackFailNotFound; 

            /**
             * NackFailNotFound.
             */
            public Builder nackFailNotFound(java.util.List < NackFailNotFound> nackFailNotFound) {
                this.nackFailNotFound = nackFailNotFound;
                return this;
            }

            public NackFailNotFoundList build() {
                return new NackFailNotFoundList(this);
            } 

        } 

    }
    public static class NackFailTimeout extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackFailTimeout(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailTimeout create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackFailTimeout build() {
                return new NackFailTimeout(this);
            } 

        } 

    }
    public static class NackFailTimeoutList extends TeaModel {
        @NameInMap("NackFailTimeout")
        private java.util.List < NackFailTimeout> nackFailTimeout;

        private NackFailTimeoutList(Builder builder) {
            this.nackFailTimeout = builder.nackFailTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackFailTimeoutList create() {
            return builder().build();
        }

        /**
         * @return nackFailTimeout
         */
        public java.util.List < NackFailTimeout> getNackFailTimeout() {
            return this.nackFailTimeout;
        }

        public static final class Builder {
            private java.util.List < NackFailTimeout> nackFailTimeout; 

            /**
             * NackFailTimeout.
             */
            public Builder nackFailTimeout(java.util.List < NackFailTimeout> nackFailTimeout) {
                this.nackFailTimeout = nackFailTimeout;
                return this;
            }

            public NackFailTimeoutList build() {
                return new NackFailTimeoutList(this);
            } 

        } 

    }
    public static class NackInRtcpCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private NackInRtcpCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackInRtcpCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public NackInRtcpCount build() {
                return new NackInRtcpCount(this);
            } 

        } 

    }
    public static class NackInRtcpCountList extends TeaModel {
        @NameInMap("NackInRtcpCount")
        private java.util.List < NackInRtcpCount> nackInRtcpCount;

        private NackInRtcpCountList(Builder builder) {
            this.nackInRtcpCount = builder.nackInRtcpCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NackInRtcpCountList create() {
            return builder().build();
        }

        /**
         * @return nackInRtcpCount
         */
        public java.util.List < NackInRtcpCount> getNackInRtcpCount() {
            return this.nackInRtcpCount;
        }

        public static final class Builder {
            private java.util.List < NackInRtcpCount> nackInRtcpCount; 

            /**
             * NackInRtcpCount.
             */
            public Builder nackInRtcpCount(java.util.List < NackInRtcpCount> nackInRtcpCount) {
                this.nackInRtcpCount = nackInRtcpCount;
                return this;
            }

            public NackInRtcpCountList build() {
                return new NackInRtcpCountList(this);
            } 

        } 

    }
    public static class RtcpOutCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private RtcpOutCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtcpOutCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public RtcpOutCount build() {
                return new RtcpOutCount(this);
            } 

        } 

    }
    public static class RtcpOutCountList extends TeaModel {
        @NameInMap("RtcpOutCount")
        private java.util.List < RtcpOutCount> rtcpOutCount;

        private RtcpOutCountList(Builder builder) {
            this.rtcpOutCount = builder.rtcpOutCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtcpOutCountList create() {
            return builder().build();
        }

        /**
         * @return rtcpOutCount
         */
        public java.util.List < RtcpOutCount> getRtcpOutCount() {
            return this.rtcpOutCount;
        }

        public static final class Builder {
            private java.util.List < RtcpOutCount> rtcpOutCount; 

            /**
             * RtcpOutCount.
             */
            public Builder rtcpOutCount(java.util.List < RtcpOutCount> rtcpOutCount) {
                this.rtcpOutCount = rtcpOutCount;
                return this;
            }

            public RtcpOutCountList build() {
                return new RtcpOutCountList(this);
            } 

        } 

    }
    public static class RtpOutBytes extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private RtpOutBytes(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutBytes create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public RtpOutBytes build() {
                return new RtpOutBytes(this);
            } 

        } 

    }
    public static class RtpOutBytesList extends TeaModel {
        @NameInMap("RtpOutBytes")
        private java.util.List < RtpOutBytes> rtpOutBytes;

        private RtpOutBytesList(Builder builder) {
            this.rtpOutBytes = builder.rtpOutBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutBytesList create() {
            return builder().build();
        }

        /**
         * @return rtpOutBytes
         */
        public java.util.List < RtpOutBytes> getRtpOutBytes() {
            return this.rtpOutBytes;
        }

        public static final class Builder {
            private java.util.List < RtpOutBytes> rtpOutBytes; 

            /**
             * RtpOutBytes.
             */
            public Builder rtpOutBytes(java.util.List < RtpOutBytes> rtpOutBytes) {
                this.rtpOutBytes = rtpOutBytes;
                return this;
            }

            public RtpOutBytesList build() {
                return new RtpOutBytesList(this);
            } 

        } 

    }
    public static class RtpOutCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private RtpOutCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public RtpOutCount build() {
                return new RtpOutCount(this);
            } 

        } 

    }
    public static class RtpOutCountList extends TeaModel {
        @NameInMap("RtpOutCount")
        private java.util.List < RtpOutCount> rtpOutCount;

        private RtpOutCountList(Builder builder) {
            this.rtpOutCount = builder.rtpOutCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutCountList create() {
            return builder().build();
        }

        /**
         * @return rtpOutCount
         */
        public java.util.List < RtpOutCount> getRtpOutCount() {
            return this.rtpOutCount;
        }

        public static final class Builder {
            private java.util.List < RtpOutCount> rtpOutCount; 

            /**
             * RtpOutCount.
             */
            public Builder rtpOutCount(java.util.List < RtpOutCount> rtpOutCount) {
                this.rtpOutCount = rtpOutCount;
                return this;
            }

            public RtpOutCountList build() {
                return new RtpOutCountList(this);
            } 

        } 

    }
    public static class RtpOutRetransBytes extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private RtpOutRetransBytes(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutRetransBytes create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public RtpOutRetransBytes build() {
                return new RtpOutRetransBytes(this);
            } 

        } 

    }
    public static class RtpOutRetransBytesList extends TeaModel {
        @NameInMap("RtpOutRetransBytes")
        private java.util.List < RtpOutRetransBytes> rtpOutRetransBytes;

        private RtpOutRetransBytesList(Builder builder) {
            this.rtpOutRetransBytes = builder.rtpOutRetransBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutRetransBytesList create() {
            return builder().build();
        }

        /**
         * @return rtpOutRetransBytes
         */
        public java.util.List < RtpOutRetransBytes> getRtpOutRetransBytes() {
            return this.rtpOutRetransBytes;
        }

        public static final class Builder {
            private java.util.List < RtpOutRetransBytes> rtpOutRetransBytes; 

            /**
             * RtpOutRetransBytes.
             */
            public Builder rtpOutRetransBytes(java.util.List < RtpOutRetransBytes> rtpOutRetransBytes) {
                this.rtpOutRetransBytes = rtpOutRetransBytes;
                return this;
            }

            public RtpOutRetransBytesList build() {
                return new RtpOutRetransBytesList(this);
            } 

        } 

    }
    public static class RtpOutRetransCount extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private RtpOutRetransCount(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutRetransCount create() {
            return builder().build();
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Integer value; 

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public RtpOutRetransCount build() {
                return new RtpOutRetransCount(this);
            } 

        } 

    }
    public static class RtpOutRetransCountList extends TeaModel {
        @NameInMap("RtpOutRetransCount")
        private java.util.List < RtpOutRetransCount> rtpOutRetransCount;

        private RtpOutRetransCountList(Builder builder) {
            this.rtpOutRetransCount = builder.rtpOutRetransCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RtpOutRetransCountList create() {
            return builder().build();
        }

        /**
         * @return rtpOutRetransCount
         */
        public java.util.List < RtpOutRetransCount> getRtpOutRetransCount() {
            return this.rtpOutRetransCount;
        }

        public static final class Builder {
            private java.util.List < RtpOutRetransCount> rtpOutRetransCount; 

            /**
             * RtpOutRetransCount.
             */
            public Builder rtpOutRetransCount(java.util.List < RtpOutRetransCount> rtpOutRetransCount) {
                this.rtpOutRetransCount = rtpOutRetransCount;
                return this;
            }

            public RtpOutRetransCountList build() {
                return new RtpOutRetransCountList(this);
            } 

        } 

    }
    public static class MsidInfo extends TeaModel {
        @NameInMap("NackFailCountList")
        private NackFailCountList nackFailCountList;

        @NameInMap("NackFailMaxCountList")
        private NackFailMaxCountList nackFailMaxCountList;

        @NameInMap("NackFailMaxRttList")
        private NackFailMaxRttList nackFailMaxRttList;

        @NameInMap("NackFailMinRttList")
        private NackFailMinRttList nackFailMinRttList;

        @NameInMap("NackFailNotFoundList")
        private NackFailNotFoundList nackFailNotFoundList;

        @NameInMap("NackFailTimeoutList")
        private NackFailTimeoutList nackFailTimeoutList;

        @NameInMap("NackInRtcpCountList")
        private NackInRtcpCountList nackInRtcpCountList;

        @NameInMap("Name")
        private String name;

        @NameInMap("RtcpOutCountList")
        private RtcpOutCountList rtcpOutCountList;

        @NameInMap("RtpOutBytesList")
        private RtpOutBytesList rtpOutBytesList;

        @NameInMap("RtpOutCountList")
        private RtpOutCountList rtpOutCountList;

        @NameInMap("RtpOutRetransBytesList")
        private RtpOutRetransBytesList rtpOutRetransBytesList;

        @NameInMap("RtpOutRetransCountList")
        private RtpOutRetransCountList rtpOutRetransCountList;

        @NameInMap("Ssrc")
        private Integer ssrc;

        private MsidInfo(Builder builder) {
            this.nackFailCountList = builder.nackFailCountList;
            this.nackFailMaxCountList = builder.nackFailMaxCountList;
            this.nackFailMaxRttList = builder.nackFailMaxRttList;
            this.nackFailMinRttList = builder.nackFailMinRttList;
            this.nackFailNotFoundList = builder.nackFailNotFoundList;
            this.nackFailTimeoutList = builder.nackFailTimeoutList;
            this.nackInRtcpCountList = builder.nackInRtcpCountList;
            this.name = builder.name;
            this.rtcpOutCountList = builder.rtcpOutCountList;
            this.rtpOutBytesList = builder.rtpOutBytesList;
            this.rtpOutCountList = builder.rtpOutCountList;
            this.rtpOutRetransBytesList = builder.rtpOutRetransBytesList;
            this.rtpOutRetransCountList = builder.rtpOutRetransCountList;
            this.ssrc = builder.ssrc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsidInfo create() {
            return builder().build();
        }

        /**
         * @return nackFailCountList
         */
        public NackFailCountList getNackFailCountList() {
            return this.nackFailCountList;
        }

        /**
         * @return nackFailMaxCountList
         */
        public NackFailMaxCountList getNackFailMaxCountList() {
            return this.nackFailMaxCountList;
        }

        /**
         * @return nackFailMaxRttList
         */
        public NackFailMaxRttList getNackFailMaxRttList() {
            return this.nackFailMaxRttList;
        }

        /**
         * @return nackFailMinRttList
         */
        public NackFailMinRttList getNackFailMinRttList() {
            return this.nackFailMinRttList;
        }

        /**
         * @return nackFailNotFoundList
         */
        public NackFailNotFoundList getNackFailNotFoundList() {
            return this.nackFailNotFoundList;
        }

        /**
         * @return nackFailTimeoutList
         */
        public NackFailTimeoutList getNackFailTimeoutList() {
            return this.nackFailTimeoutList;
        }

        /**
         * @return nackInRtcpCountList
         */
        public NackInRtcpCountList getNackInRtcpCountList() {
            return this.nackInRtcpCountList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rtcpOutCountList
         */
        public RtcpOutCountList getRtcpOutCountList() {
            return this.rtcpOutCountList;
        }

        /**
         * @return rtpOutBytesList
         */
        public RtpOutBytesList getRtpOutBytesList() {
            return this.rtpOutBytesList;
        }

        /**
         * @return rtpOutCountList
         */
        public RtpOutCountList getRtpOutCountList() {
            return this.rtpOutCountList;
        }

        /**
         * @return rtpOutRetransBytesList
         */
        public RtpOutRetransBytesList getRtpOutRetransBytesList() {
            return this.rtpOutRetransBytesList;
        }

        /**
         * @return rtpOutRetransCountList
         */
        public RtpOutRetransCountList getRtpOutRetransCountList() {
            return this.rtpOutRetransCountList;
        }

        /**
         * @return ssrc
         */
        public Integer getSsrc() {
            return this.ssrc;
        }

        public static final class Builder {
            private NackFailCountList nackFailCountList; 
            private NackFailMaxCountList nackFailMaxCountList; 
            private NackFailMaxRttList nackFailMaxRttList; 
            private NackFailMinRttList nackFailMinRttList; 
            private NackFailNotFoundList nackFailNotFoundList; 
            private NackFailTimeoutList nackFailTimeoutList; 
            private NackInRtcpCountList nackInRtcpCountList; 
            private String name; 
            private RtcpOutCountList rtcpOutCountList; 
            private RtpOutBytesList rtpOutBytesList; 
            private RtpOutCountList rtpOutCountList; 
            private RtpOutRetransBytesList rtpOutRetransBytesList; 
            private RtpOutRetransCountList rtpOutRetransCountList; 
            private Integer ssrc; 

            /**
             * NackFailCountList.
             */
            public Builder nackFailCountList(NackFailCountList nackFailCountList) {
                this.nackFailCountList = nackFailCountList;
                return this;
            }

            /**
             * NackFailMaxCountList.
             */
            public Builder nackFailMaxCountList(NackFailMaxCountList nackFailMaxCountList) {
                this.nackFailMaxCountList = nackFailMaxCountList;
                return this;
            }

            /**
             * NackFailMaxRttList.
             */
            public Builder nackFailMaxRttList(NackFailMaxRttList nackFailMaxRttList) {
                this.nackFailMaxRttList = nackFailMaxRttList;
                return this;
            }

            /**
             * NackFailMinRttList.
             */
            public Builder nackFailMinRttList(NackFailMinRttList nackFailMinRttList) {
                this.nackFailMinRttList = nackFailMinRttList;
                return this;
            }

            /**
             * NackFailNotFoundList.
             */
            public Builder nackFailNotFoundList(NackFailNotFoundList nackFailNotFoundList) {
                this.nackFailNotFoundList = nackFailNotFoundList;
                return this;
            }

            /**
             * NackFailTimeoutList.
             */
            public Builder nackFailTimeoutList(NackFailTimeoutList nackFailTimeoutList) {
                this.nackFailTimeoutList = nackFailTimeoutList;
                return this;
            }

            /**
             * NackInRtcpCountList.
             */
            public Builder nackInRtcpCountList(NackInRtcpCountList nackInRtcpCountList) {
                this.nackInRtcpCountList = nackInRtcpCountList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RtcpOutCountList.
             */
            public Builder rtcpOutCountList(RtcpOutCountList rtcpOutCountList) {
                this.rtcpOutCountList = rtcpOutCountList;
                return this;
            }

            /**
             * RtpOutBytesList.
             */
            public Builder rtpOutBytesList(RtpOutBytesList rtpOutBytesList) {
                this.rtpOutBytesList = rtpOutBytesList;
                return this;
            }

            /**
             * RtpOutCountList.
             */
            public Builder rtpOutCountList(RtpOutCountList rtpOutCountList) {
                this.rtpOutCountList = rtpOutCountList;
                return this;
            }

            /**
             * RtpOutRetransBytesList.
             */
            public Builder rtpOutRetransBytesList(RtpOutRetransBytesList rtpOutRetransBytesList) {
                this.rtpOutRetransBytesList = rtpOutRetransBytesList;
                return this;
            }

            /**
             * RtpOutRetransCountList.
             */
            public Builder rtpOutRetransCountList(RtpOutRetransCountList rtpOutRetransCountList) {
                this.rtpOutRetransCountList = rtpOutRetransCountList;
                return this;
            }

            /**
             * Ssrc.
             */
            public Builder ssrc(Integer ssrc) {
                this.ssrc = ssrc;
                return this;
            }

            public MsidInfo build() {
                return new MsidInfo(this);
            } 

        } 

    }
    public static class MsidInfoList extends TeaModel {
        @NameInMap("MsidInfo")
        private java.util.List < MsidInfo> msidInfo;

        private MsidInfoList(Builder builder) {
            this.msidInfo = builder.msidInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsidInfoList create() {
            return builder().build();
        }

        /**
         * @return msidInfo
         */
        public java.util.List < MsidInfo> getMsidInfo() {
            return this.msidInfo;
        }

        public static final class Builder {
            private java.util.List < MsidInfo> msidInfo; 

            /**
             * MsidInfo.
             */
            public Builder msidInfo(java.util.List < MsidInfo> msidInfo) {
                this.msidInfo = msidInfo;
                return this;
            }

            public MsidInfoList build() {
                return new MsidInfoList(this);
            } 

        } 

    }
    public static class LiveGRTNStreamData extends TeaModel {
        @NameInMap("Delay")
        private Delay delay;

        @NameInMap("MsidInfoList")
        private MsidInfoList msidInfoList;

        private LiveGRTNStreamData(Builder builder) {
            this.delay = builder.delay;
            this.msidInfoList = builder.msidInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveGRTNStreamData create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Delay getDelay() {
            return this.delay;
        }

        /**
         * @return msidInfoList
         */
        public MsidInfoList getMsidInfoList() {
            return this.msidInfoList;
        }

        public static final class Builder {
            private Delay delay; 
            private MsidInfoList msidInfoList; 

            /**
             * Delay.
             */
            public Builder delay(Delay delay) {
                this.delay = delay;
                return this;
            }

            /**
             * MsidInfoList.
             */
            public Builder msidInfoList(MsidInfoList msidInfoList) {
                this.msidInfoList = msidInfoList;
                return this;
            }

            public LiveGRTNStreamData build() {
                return new LiveGRTNStreamData(this);
            } 

        } 

    }
}
