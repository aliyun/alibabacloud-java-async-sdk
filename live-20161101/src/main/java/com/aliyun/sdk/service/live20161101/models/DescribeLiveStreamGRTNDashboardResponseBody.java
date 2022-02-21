// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamGRTNDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamGRTNDashboardResponseBody</p>
 */
public class DescribeLiveStreamGRTNDashboardResponseBody extends TeaModel {
    @NameInMap("LiveGRTNDashboard")
    private LiveGRTNDashboard liveGRTNDashboard;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveStreamGRTNDashboardResponseBody(Builder builder) {
        this.liveGRTNDashboard = builder.liveGRTNDashboard;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamGRTNDashboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveGRTNDashboard
     */
    public LiveGRTNDashboard getLiveGRTNDashboard() {
        return this.liveGRTNDashboard;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveGRTNDashboard liveGRTNDashboard; 
        private String requestId; 

        /**
         * LiveGRTNDashboard.
         */
        public Builder liveGRTNDashboard(LiveGRTNDashboard liveGRTNDashboard) {
            this.liveGRTNDashboard = liveGRTNDashboard;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveStreamGRTNDashboardResponseBody build() {
            return new DescribeLiveStreamGRTNDashboardResponseBody(this);
        } 

    } 

    public static class AvgCdnDelay extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private AvgCdnDelay(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgCdnDelay create() {
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

            public AvgCdnDelay build() {
                return new AvgCdnDelay(this);
            } 

        } 

    }
    public static class AvgCdnDelayList extends TeaModel {
        @NameInMap("AvgCdnDelay")
        private java.util.List < AvgCdnDelay> avgCdnDelay;

        private AvgCdnDelayList(Builder builder) {
            this.avgCdnDelay = builder.avgCdnDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgCdnDelayList create() {
            return builder().build();
        }

        /**
         * @return avgCdnDelay
         */
        public java.util.List < AvgCdnDelay> getAvgCdnDelay() {
            return this.avgCdnDelay;
        }

        public static final class Builder {
            private java.util.List < AvgCdnDelay> avgCdnDelay; 

            /**
             * AvgCdnDelay.
             */
            public Builder avgCdnDelay(java.util.List < AvgCdnDelay> avgCdnDelay) {
                this.avgCdnDelay = avgCdnDelay;
                return this;
            }

            public AvgCdnDelayList build() {
                return new AvgCdnDelayList(this);
            } 

        } 

    }
    public static class AvgFirstFrame extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private AvgFirstFrame(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgFirstFrame create() {
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

            public AvgFirstFrame build() {
                return new AvgFirstFrame(this);
            } 

        } 

    }
    public static class AvgFirstFrameList extends TeaModel {
        @NameInMap("AvgFirstFrame")
        private java.util.List < AvgFirstFrame> avgFirstFrame;

        private AvgFirstFrameList(Builder builder) {
            this.avgFirstFrame = builder.avgFirstFrame;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgFirstFrameList create() {
            return builder().build();
        }

        /**
         * @return avgFirstFrame
         */
        public java.util.List < AvgFirstFrame> getAvgFirstFrame() {
            return this.avgFirstFrame;
        }

        public static final class Builder {
            private java.util.List < AvgFirstFrame> avgFirstFrame; 

            /**
             * AvgFirstFrame.
             */
            public Builder avgFirstFrame(java.util.List < AvgFirstFrame> avgFirstFrame) {
                this.avgFirstFrame = avgFirstFrame;
                return this;
            }

            public AvgFirstFrameList build() {
                return new AvgFirstFrameList(this);
            } 

        } 

    }
    public static class AvgFirstPacket extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private AvgFirstPacket(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgFirstPacket create() {
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

            public AvgFirstPacket build() {
                return new AvgFirstPacket(this);
            } 

        } 

    }
    public static class AvgFirstPacketList extends TeaModel {
        @NameInMap("AvgFirstPacket")
        private java.util.List < AvgFirstPacket> avgFirstPacket;

        private AvgFirstPacketList(Builder builder) {
            this.avgFirstPacket = builder.avgFirstPacket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgFirstPacketList create() {
            return builder().build();
        }

        /**
         * @return avgFirstPacket
         */
        public java.util.List < AvgFirstPacket> getAvgFirstPacket() {
            return this.avgFirstPacket;
        }

        public static final class Builder {
            private java.util.List < AvgFirstPacket> avgFirstPacket; 

            /**
             * AvgFirstPacket.
             */
            public Builder avgFirstPacket(java.util.List < AvgFirstPacket> avgFirstPacket) {
                this.avgFirstPacket = avgFirstPacket;
                return this;
            }

            public AvgFirstPacketList build() {
                return new AvgFirstPacketList(this);
            } 

        } 

    }
    public static class AvgNetDelay extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Integer value;

        private AvgNetDelay(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgNetDelay create() {
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

            public AvgNetDelay build() {
                return new AvgNetDelay(this);
            } 

        } 

    }
    public static class AvgNetDelayList extends TeaModel {
        @NameInMap("AvgNetDelay")
        private java.util.List < AvgNetDelay> avgNetDelay;

        private AvgNetDelayList(Builder builder) {
            this.avgNetDelay = builder.avgNetDelay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgNetDelayList create() {
            return builder().build();
        }

        /**
         * @return avgNetDelay
         */
        public java.util.List < AvgNetDelay> getAvgNetDelay() {
            return this.avgNetDelay;
        }

        public static final class Builder {
            private java.util.List < AvgNetDelay> avgNetDelay; 

            /**
             * AvgNetDelay.
             */
            public Builder avgNetDelay(java.util.List < AvgNetDelay> avgNetDelay) {
                this.avgNetDelay = avgNetDelay;
                return this;
            }

            public AvgNetDelayList build() {
                return new AvgNetDelayList(this);
            } 

        } 

    }
    public static class FirstFrameInfo extends TeaModel {
        @NameInMap("Gt4000")
        private Integer gt4000;

        @NameInMap("Lt1000")
        private Integer lt1000;

        @NameInMap("Lt1500")
        private Integer lt1500;

        @NameInMap("Lt2000")
        private Integer lt2000;

        @NameInMap("Lt250")
        private Integer lt250;

        @NameInMap("Lt400")
        private Integer lt400;

        @NameInMap("Lt4000")
        private Integer lt4000;

        @NameInMap("Lt800")
        private Integer lt800;

        @NameInMap("Time")
        private Integer time;

        private FirstFrameInfo(Builder builder) {
            this.gt4000 = builder.gt4000;
            this.lt1000 = builder.lt1000;
            this.lt1500 = builder.lt1500;
            this.lt2000 = builder.lt2000;
            this.lt250 = builder.lt250;
            this.lt400 = builder.lt400;
            this.lt4000 = builder.lt4000;
            this.lt800 = builder.lt800;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstFrameInfo create() {
            return builder().build();
        }

        /**
         * @return gt4000
         */
        public Integer getGt4000() {
            return this.gt4000;
        }

        /**
         * @return lt1000
         */
        public Integer getLt1000() {
            return this.lt1000;
        }

        /**
         * @return lt1500
         */
        public Integer getLt1500() {
            return this.lt1500;
        }

        /**
         * @return lt2000
         */
        public Integer getLt2000() {
            return this.lt2000;
        }

        /**
         * @return lt250
         */
        public Integer getLt250() {
            return this.lt250;
        }

        /**
         * @return lt400
         */
        public Integer getLt400() {
            return this.lt400;
        }

        /**
         * @return lt4000
         */
        public Integer getLt4000() {
            return this.lt4000;
        }

        /**
         * @return lt800
         */
        public Integer getLt800() {
            return this.lt800;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer gt4000; 
            private Integer lt1000; 
            private Integer lt1500; 
            private Integer lt2000; 
            private Integer lt250; 
            private Integer lt400; 
            private Integer lt4000; 
            private Integer lt800; 
            private Integer time; 

            /**
             * Gt4000.
             */
            public Builder gt4000(Integer gt4000) {
                this.gt4000 = gt4000;
                return this;
            }

            /**
             * Lt1000.
             */
            public Builder lt1000(Integer lt1000) {
                this.lt1000 = lt1000;
                return this;
            }

            /**
             * Lt1500.
             */
            public Builder lt1500(Integer lt1500) {
                this.lt1500 = lt1500;
                return this;
            }

            /**
             * Lt2000.
             */
            public Builder lt2000(Integer lt2000) {
                this.lt2000 = lt2000;
                return this;
            }

            /**
             * Lt250.
             */
            public Builder lt250(Integer lt250) {
                this.lt250 = lt250;
                return this;
            }

            /**
             * Lt400.
             */
            public Builder lt400(Integer lt400) {
                this.lt400 = lt400;
                return this;
            }

            /**
             * Lt4000.
             */
            public Builder lt4000(Integer lt4000) {
                this.lt4000 = lt4000;
                return this;
            }

            /**
             * Lt800.
             */
            public Builder lt800(Integer lt800) {
                this.lt800 = lt800;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public FirstFrameInfo build() {
                return new FirstFrameInfo(this);
            } 

        } 

    }
    public static class FirstFrameInfoList extends TeaModel {
        @NameInMap("FirstFrameInfo")
        private java.util.List < FirstFrameInfo> firstFrameInfo;

        private FirstFrameInfoList(Builder builder) {
            this.firstFrameInfo = builder.firstFrameInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstFrameInfoList create() {
            return builder().build();
        }

        /**
         * @return firstFrameInfo
         */
        public java.util.List < FirstFrameInfo> getFirstFrameInfo() {
            return this.firstFrameInfo;
        }

        public static final class Builder {
            private java.util.List < FirstFrameInfo> firstFrameInfo; 

            /**
             * FirstFrameInfo.
             */
            public Builder firstFrameInfo(java.util.List < FirstFrameInfo> firstFrameInfo) {
                this.firstFrameInfo = firstFrameInfo;
                return this;
            }

            public FirstFrameInfoList build() {
                return new FirstFrameInfoList(this);
            } 

        } 

    }
    public static class H5Info extends TeaModel {
        @NameInMap("110")
        private Integer code110;

        @NameInMap("120")
        private Integer code120;

        @NameInMap("200")
        private Integer code200;

        @NameInMap("202")
        private Integer code202;

        @NameInMap("400")
        private Integer code400;

        @NameInMap("403")
        private Integer code403;

        @NameInMap("404")
        private Integer code404;

        @NameInMap("405")
        private Integer code405;

        @NameInMap("500")
        private Integer code500;

        @NameInMap("504")
        private Integer code504;

        @NameInMap("507")
        private Integer code507;

        @NameInMap("508")
        private Integer code508;

        @NameInMap("611")
        private Integer code611;

        @NameInMap("Time")
        private Integer time;

        private H5Info(Builder builder) {
            this.code110 = builder.code110;
            this.code120 = builder.code120;
            this.code200 = builder.code200;
            this.code202 = builder.code202;
            this.code400 = builder.code400;
            this.code403 = builder.code403;
            this.code404 = builder.code404;
            this.code405 = builder.code405;
            this.code500 = builder.code500;
            this.code504 = builder.code504;
            this.code507 = builder.code507;
            this.code508 = builder.code508;
            this.code611 = builder.code611;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static H5Info create() {
            return builder().build();
        }

        /**
         * @return code110
         */
        public Integer getCode110() {
            return this.code110;
        }

        /**
         * @return code120
         */
        public Integer getCode120() {
            return this.code120;
        }

        /**
         * @return code200
         */
        public Integer getCode200() {
            return this.code200;
        }

        /**
         * @return code202
         */
        public Integer getCode202() {
            return this.code202;
        }

        /**
         * @return code400
         */
        public Integer getCode400() {
            return this.code400;
        }

        /**
         * @return code403
         */
        public Integer getCode403() {
            return this.code403;
        }

        /**
         * @return code404
         */
        public Integer getCode404() {
            return this.code404;
        }

        /**
         * @return code405
         */
        public Integer getCode405() {
            return this.code405;
        }

        /**
         * @return code500
         */
        public Integer getCode500() {
            return this.code500;
        }

        /**
         * @return code504
         */
        public Integer getCode504() {
            return this.code504;
        }

        /**
         * @return code507
         */
        public Integer getCode507() {
            return this.code507;
        }

        /**
         * @return code508
         */
        public Integer getCode508() {
            return this.code508;
        }

        /**
         * @return code611
         */
        public Integer getCode611() {
            return this.code611;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer code110; 
            private Integer code120; 
            private Integer code200; 
            private Integer code202; 
            private Integer code400; 
            private Integer code403; 
            private Integer code404; 
            private Integer code405; 
            private Integer code500; 
            private Integer code504; 
            private Integer code507; 
            private Integer code508; 
            private Integer code611; 
            private Integer time; 

            /**
             * 110.
             */
            public Builder code110(Integer code110) {
                this.code110 = code110;
                return this;
            }

            /**
             * 120.
             */
            public Builder code120(Integer code120) {
                this.code120 = code120;
                return this;
            }

            /**
             * 200.
             */
            public Builder code200(Integer code200) {
                this.code200 = code200;
                return this;
            }

            /**
             * 202.
             */
            public Builder code202(Integer code202) {
                this.code202 = code202;
                return this;
            }

            /**
             * 400.
             */
            public Builder code400(Integer code400) {
                this.code400 = code400;
                return this;
            }

            /**
             * 403.
             */
            public Builder code403(Integer code403) {
                this.code403 = code403;
                return this;
            }

            /**
             * 404.
             */
            public Builder code404(Integer code404) {
                this.code404 = code404;
                return this;
            }

            /**
             * 405.
             */
            public Builder code405(Integer code405) {
                this.code405 = code405;
                return this;
            }

            /**
             * 500.
             */
            public Builder code500(Integer code500) {
                this.code500 = code500;
                return this;
            }

            /**
             * 504.
             */
            public Builder code504(Integer code504) {
                this.code504 = code504;
                return this;
            }

            /**
             * 507.
             */
            public Builder code507(Integer code507) {
                this.code507 = code507;
                return this;
            }

            /**
             * 508.
             */
            public Builder code508(Integer code508) {
                this.code508 = code508;
                return this;
            }

            /**
             * 611.
             */
            public Builder code611(Integer code611) {
                this.code611 = code611;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public H5Info build() {
                return new H5Info(this);
            } 

        } 

    }
    public static class H5InfoList extends TeaModel {
        @NameInMap("H5Info")
        private java.util.List < H5Info> h5Info;

        private H5InfoList(Builder builder) {
            this.h5Info = builder.h5Info;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static H5InfoList create() {
            return builder().build();
        }

        /**
         * @return h5Info
         */
        public java.util.List < H5Info> getH5Info() {
            return this.h5Info;
        }

        public static final class Builder {
            private java.util.List < H5Info> h5Info; 

            /**
             * H5Info.
             */
            public Builder h5Info(java.util.List < H5Info> h5Info) {
                this.h5Info = h5Info;
                return this;
            }

            public H5InfoList build() {
                return new H5InfoList(this);
            } 

        } 

    }
    public static class NativeInfo extends TeaModel {
        @NameInMap("110")
        private Integer code110;

        @NameInMap("120")
        private Integer code120;

        @NameInMap("200")
        private Integer code200;

        @NameInMap("202")
        private Integer code202;

        @NameInMap("400")
        private Integer code400;

        @NameInMap("403")
        private Integer code403;

        @NameInMap("404")
        private Integer code404;

        @NameInMap("405")
        private Integer code405;

        @NameInMap("500")
        private Integer code500;

        @NameInMap("504")
        private Integer code504;

        @NameInMap("507")
        private Integer code507;

        @NameInMap("508")
        private Integer code508;

        @NameInMap("611")
        private Integer code611;

        @NameInMap("Time")
        private Integer time;

        private NativeInfo(Builder builder) {
            this.code110 = builder.code110;
            this.code120 = builder.code120;
            this.code200 = builder.code200;
            this.code202 = builder.code202;
            this.code400 = builder.code400;
            this.code403 = builder.code403;
            this.code404 = builder.code404;
            this.code405 = builder.code405;
            this.code500 = builder.code500;
            this.code504 = builder.code504;
            this.code507 = builder.code507;
            this.code508 = builder.code508;
            this.code611 = builder.code611;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeInfo create() {
            return builder().build();
        }

        /**
         * @return code110
         */
        public Integer getCode110() {
            return this.code110;
        }

        /**
         * @return code120
         */
        public Integer getCode120() {
            return this.code120;
        }

        /**
         * @return code200
         */
        public Integer getCode200() {
            return this.code200;
        }

        /**
         * @return code202
         */
        public Integer getCode202() {
            return this.code202;
        }

        /**
         * @return code400
         */
        public Integer getCode400() {
            return this.code400;
        }

        /**
         * @return code403
         */
        public Integer getCode403() {
            return this.code403;
        }

        /**
         * @return code404
         */
        public Integer getCode404() {
            return this.code404;
        }

        /**
         * @return code405
         */
        public Integer getCode405() {
            return this.code405;
        }

        /**
         * @return code500
         */
        public Integer getCode500() {
            return this.code500;
        }

        /**
         * @return code504
         */
        public Integer getCode504() {
            return this.code504;
        }

        /**
         * @return code507
         */
        public Integer getCode507() {
            return this.code507;
        }

        /**
         * @return code508
         */
        public Integer getCode508() {
            return this.code508;
        }

        /**
         * @return code611
         */
        public Integer getCode611() {
            return this.code611;
        }

        /**
         * @return time
         */
        public Integer getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer code110; 
            private Integer code120; 
            private Integer code200; 
            private Integer code202; 
            private Integer code400; 
            private Integer code403; 
            private Integer code404; 
            private Integer code405; 
            private Integer code500; 
            private Integer code504; 
            private Integer code507; 
            private Integer code508; 
            private Integer code611; 
            private Integer time; 

            /**
             * 110.
             */
            public Builder code110(Integer code110) {
                this.code110 = code110;
                return this;
            }

            /**
             * 120.
             */
            public Builder code120(Integer code120) {
                this.code120 = code120;
                return this;
            }

            /**
             * 200.
             */
            public Builder code200(Integer code200) {
                this.code200 = code200;
                return this;
            }

            /**
             * 202.
             */
            public Builder code202(Integer code202) {
                this.code202 = code202;
                return this;
            }

            /**
             * 400.
             */
            public Builder code400(Integer code400) {
                this.code400 = code400;
                return this;
            }

            /**
             * 403.
             */
            public Builder code403(Integer code403) {
                this.code403 = code403;
                return this;
            }

            /**
             * 404.
             */
            public Builder code404(Integer code404) {
                this.code404 = code404;
                return this;
            }

            /**
             * 405.
             */
            public Builder code405(Integer code405) {
                this.code405 = code405;
                return this;
            }

            /**
             * 500.
             */
            public Builder code500(Integer code500) {
                this.code500 = code500;
                return this;
            }

            /**
             * 504.
             */
            public Builder code504(Integer code504) {
                this.code504 = code504;
                return this;
            }

            /**
             * 507.
             */
            public Builder code507(Integer code507) {
                this.code507 = code507;
                return this;
            }

            /**
             * 508.
             */
            public Builder code508(Integer code508) {
                this.code508 = code508;
                return this;
            }

            /**
             * 611.
             */
            public Builder code611(Integer code611) {
                this.code611 = code611;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Integer time) {
                this.time = time;
                return this;
            }

            public NativeInfo build() {
                return new NativeInfo(this);
            } 

        } 

    }
    public static class NativeInfoList extends TeaModel {
        @NameInMap("NativeInfo")
        private java.util.List < NativeInfo> nativeInfo;

        private NativeInfoList(Builder builder) {
            this.nativeInfo = builder.nativeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NativeInfoList create() {
            return builder().build();
        }

        /**
         * @return nativeInfo
         */
        public java.util.List < NativeInfo> getNativeInfo() {
            return this.nativeInfo;
        }

        public static final class Builder {
            private java.util.List < NativeInfo> nativeInfo; 

            /**
             * NativeInfo.
             */
            public Builder nativeInfo(java.util.List < NativeInfo> nativeInfo) {
                this.nativeInfo = nativeInfo;
                return this;
            }

            public NativeInfoList build() {
                return new NativeInfoList(this);
            } 

        } 

    }
    public static class SuccessRate extends TeaModel {
        @NameInMap("Time")
        private Integer time;

        @NameInMap("Value")
        private Float value;

        private SuccessRate(Builder builder) {
            this.time = builder.time;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessRate create() {
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
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer time; 
            private Float value; 

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
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public SuccessRate build() {
                return new SuccessRate(this);
            } 

        } 

    }
    public static class SuccessRateList extends TeaModel {
        @NameInMap("SuccessRate")
        private java.util.List < SuccessRate> successRate;

        private SuccessRateList(Builder builder) {
            this.successRate = builder.successRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessRateList create() {
            return builder().build();
        }

        /**
         * @return successRate
         */
        public java.util.List < SuccessRate> getSuccessRate() {
            return this.successRate;
        }

        public static final class Builder {
            private java.util.List < SuccessRate> successRate; 

            /**
             * SuccessRate.
             */
            public Builder successRate(java.util.List < SuccessRate> successRate) {
                this.successRate = successRate;
                return this;
            }

            public SuccessRateList build() {
                return new SuccessRateList(this);
            } 

        } 

    }
    public static class LiveGRTNDashboard extends TeaModel {
        @NameInMap("AvgCdnDelayList")
        private AvgCdnDelayList avgCdnDelayList;

        @NameInMap("AvgFirstFrameList")
        private AvgFirstFrameList avgFirstFrameList;

        @NameInMap("AvgFirstPacketList")
        private AvgFirstPacketList avgFirstPacketList;

        @NameInMap("AvgNetDelayList")
        private AvgNetDelayList avgNetDelayList;

        @NameInMap("FirstFrameInfoList")
        private FirstFrameInfoList firstFrameInfoList;

        @NameInMap("H5InfoList")
        private H5InfoList h5InfoList;

        @NameInMap("NativeInfoList")
        private NativeInfoList nativeInfoList;

        @NameInMap("SuccessRateList")
        private SuccessRateList successRateList;

        private LiveGRTNDashboard(Builder builder) {
            this.avgCdnDelayList = builder.avgCdnDelayList;
            this.avgFirstFrameList = builder.avgFirstFrameList;
            this.avgFirstPacketList = builder.avgFirstPacketList;
            this.avgNetDelayList = builder.avgNetDelayList;
            this.firstFrameInfoList = builder.firstFrameInfoList;
            this.h5InfoList = builder.h5InfoList;
            this.nativeInfoList = builder.nativeInfoList;
            this.successRateList = builder.successRateList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveGRTNDashboard create() {
            return builder().build();
        }

        /**
         * @return avgCdnDelayList
         */
        public AvgCdnDelayList getAvgCdnDelayList() {
            return this.avgCdnDelayList;
        }

        /**
         * @return avgFirstFrameList
         */
        public AvgFirstFrameList getAvgFirstFrameList() {
            return this.avgFirstFrameList;
        }

        /**
         * @return avgFirstPacketList
         */
        public AvgFirstPacketList getAvgFirstPacketList() {
            return this.avgFirstPacketList;
        }

        /**
         * @return avgNetDelayList
         */
        public AvgNetDelayList getAvgNetDelayList() {
            return this.avgNetDelayList;
        }

        /**
         * @return firstFrameInfoList
         */
        public FirstFrameInfoList getFirstFrameInfoList() {
            return this.firstFrameInfoList;
        }

        /**
         * @return h5InfoList
         */
        public H5InfoList getH5InfoList() {
            return this.h5InfoList;
        }

        /**
         * @return nativeInfoList
         */
        public NativeInfoList getNativeInfoList() {
            return this.nativeInfoList;
        }

        /**
         * @return successRateList
         */
        public SuccessRateList getSuccessRateList() {
            return this.successRateList;
        }

        public static final class Builder {
            private AvgCdnDelayList avgCdnDelayList; 
            private AvgFirstFrameList avgFirstFrameList; 
            private AvgFirstPacketList avgFirstPacketList; 
            private AvgNetDelayList avgNetDelayList; 
            private FirstFrameInfoList firstFrameInfoList; 
            private H5InfoList h5InfoList; 
            private NativeInfoList nativeInfoList; 
            private SuccessRateList successRateList; 

            /**
             * AvgCdnDelayList.
             */
            public Builder avgCdnDelayList(AvgCdnDelayList avgCdnDelayList) {
                this.avgCdnDelayList = avgCdnDelayList;
                return this;
            }

            /**
             * AvgFirstFrameList.
             */
            public Builder avgFirstFrameList(AvgFirstFrameList avgFirstFrameList) {
                this.avgFirstFrameList = avgFirstFrameList;
                return this;
            }

            /**
             * AvgFirstPacketList.
             */
            public Builder avgFirstPacketList(AvgFirstPacketList avgFirstPacketList) {
                this.avgFirstPacketList = avgFirstPacketList;
                return this;
            }

            /**
             * AvgNetDelayList.
             */
            public Builder avgNetDelayList(AvgNetDelayList avgNetDelayList) {
                this.avgNetDelayList = avgNetDelayList;
                return this;
            }

            /**
             * FirstFrameInfoList.
             */
            public Builder firstFrameInfoList(FirstFrameInfoList firstFrameInfoList) {
                this.firstFrameInfoList = firstFrameInfoList;
                return this;
            }

            /**
             * H5InfoList.
             */
            public Builder h5InfoList(H5InfoList h5InfoList) {
                this.h5InfoList = h5InfoList;
                return this;
            }

            /**
             * NativeInfoList.
             */
            public Builder nativeInfoList(NativeInfoList nativeInfoList) {
                this.nativeInfoList = nativeInfoList;
                return this;
            }

            /**
             * SuccessRateList.
             */
            public Builder successRateList(SuccessRateList successRateList) {
                this.successRateList = successRateList;
                return this;
            }

            public LiveGRTNDashboard build() {
                return new LiveGRTNDashboard(this);
            } 

        } 

    }
}
