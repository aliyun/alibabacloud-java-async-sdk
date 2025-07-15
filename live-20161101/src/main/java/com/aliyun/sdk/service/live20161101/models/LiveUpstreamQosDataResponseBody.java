// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link LiveUpstreamQosDataResponseBody} extends {@link TeaModel}
 *
 * <p>LiveUpstreamQosDataResponseBody</p>
 */
public class LiveUpstreamQosDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private LiveUpstreamQosDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveUpstreamQosDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(LiveUpstreamQosDataResponseBody model) {
            this.data = model.data;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public LiveUpstreamQosDataResponseBody build() {
            return new LiveUpstreamQosDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link LiveUpstreamQosDataResponseBody} extends {@link TeaModel}
     *
     * <p>LiveUpstreamQosDataResponseBody</p>
     */
    public static class DetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectDur")
        private Long connectDur;

        @com.aliyun.core.annotation.NameInMap("ConnectFailedCount")
        private Long connectFailedCount;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("FirstDataDur")
        private Long firstDataDur;

        @com.aliyun.core.annotation.NameInMap("FirstDataFailedCount")
        private Long firstDataFailedCount;

        @com.aliyun.core.annotation.NameInMap("FirstFrameDur")
        private Long firstFrameDur;

        @com.aliyun.core.annotation.NameInMap("FirstFrameSuccessCount")
        private Long firstFrameSuccessCount;

        @com.aliyun.core.annotation.NameInMap("StatusCode2Xx")
        private Long statusCode2Xx;

        @com.aliyun.core.annotation.NameInMap("StatusCode3Xx")
        private Long statusCode3Xx;

        @com.aliyun.core.annotation.NameInMap("StatusCode4Xx")
        private Long statusCode4Xx;

        @com.aliyun.core.annotation.NameInMap("StatusCode5Xx")
        private Long statusCode5Xx;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private DetailData(Builder builder) {
            this.connectDur = builder.connectDur;
            this.connectFailedCount = builder.connectFailedCount;
            this.count = builder.count;
            this.firstDataDur = builder.firstDataDur;
            this.firstDataFailedCount = builder.firstDataFailedCount;
            this.firstFrameDur = builder.firstFrameDur;
            this.firstFrameSuccessCount = builder.firstFrameSuccessCount;
            this.statusCode2Xx = builder.statusCode2Xx;
            this.statusCode3Xx = builder.statusCode3Xx;
            this.statusCode4Xx = builder.statusCode4Xx;
            this.statusCode5Xx = builder.statusCode5Xx;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailData create() {
            return builder().build();
        }

        /**
         * @return connectDur
         */
        public Long getConnectDur() {
            return this.connectDur;
        }

        /**
         * @return connectFailedCount
         */
        public Long getConnectFailedCount() {
            return this.connectFailedCount;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return firstDataDur
         */
        public Long getFirstDataDur() {
            return this.firstDataDur;
        }

        /**
         * @return firstDataFailedCount
         */
        public Long getFirstDataFailedCount() {
            return this.firstDataFailedCount;
        }

        /**
         * @return firstFrameDur
         */
        public Long getFirstFrameDur() {
            return this.firstFrameDur;
        }

        /**
         * @return firstFrameSuccessCount
         */
        public Long getFirstFrameSuccessCount() {
            return this.firstFrameSuccessCount;
        }

        /**
         * @return statusCode2Xx
         */
        public Long getStatusCode2Xx() {
            return this.statusCode2Xx;
        }

        /**
         * @return statusCode3Xx
         */
        public Long getStatusCode3Xx() {
            return this.statusCode3Xx;
        }

        /**
         * @return statusCode4Xx
         */
        public Long getStatusCode4Xx() {
            return this.statusCode4Xx;
        }

        /**
         * @return statusCode5Xx
         */
        public Long getStatusCode5Xx() {
            return this.statusCode5Xx;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long connectDur; 
            private Long connectFailedCount; 
            private Long count; 
            private Long firstDataDur; 
            private Long firstDataFailedCount; 
            private Long firstFrameDur; 
            private Long firstFrameSuccessCount; 
            private Long statusCode2Xx; 
            private Long statusCode3Xx; 
            private Long statusCode4Xx; 
            private Long statusCode5Xx; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(DetailData model) {
                this.connectDur = model.connectDur;
                this.connectFailedCount = model.connectFailedCount;
                this.count = model.count;
                this.firstDataDur = model.firstDataDur;
                this.firstDataFailedCount = model.firstDataFailedCount;
                this.firstFrameDur = model.firstFrameDur;
                this.firstFrameSuccessCount = model.firstFrameSuccessCount;
                this.statusCode2Xx = model.statusCode2Xx;
                this.statusCode3Xx = model.statusCode3Xx;
                this.statusCode4Xx = model.statusCode4Xx;
                this.statusCode5Xx = model.statusCode5Xx;
                this.timestamp = model.timestamp;
            } 

            /**
             * ConnectDur.
             */
            public Builder connectDur(Long connectDur) {
                this.connectDur = connectDur;
                return this;
            }

            /**
             * ConnectFailedCount.
             */
            public Builder connectFailedCount(Long connectFailedCount) {
                this.connectFailedCount = connectFailedCount;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * FirstDataDur.
             */
            public Builder firstDataDur(Long firstDataDur) {
                this.firstDataDur = firstDataDur;
                return this;
            }

            /**
             * FirstDataFailedCount.
             */
            public Builder firstDataFailedCount(Long firstDataFailedCount) {
                this.firstDataFailedCount = firstDataFailedCount;
                return this;
            }

            /**
             * FirstFrameDur.
             */
            public Builder firstFrameDur(Long firstFrameDur) {
                this.firstFrameDur = firstFrameDur;
                return this;
            }

            /**
             * FirstFrameSuccessCount.
             */
            public Builder firstFrameSuccessCount(Long firstFrameSuccessCount) {
                this.firstFrameSuccessCount = firstFrameSuccessCount;
                return this;
            }

            /**
             * StatusCode2Xx.
             */
            public Builder statusCode2Xx(Long statusCode2Xx) {
                this.statusCode2Xx = statusCode2Xx;
                return this;
            }

            /**
             * StatusCode3Xx.
             */
            public Builder statusCode3Xx(Long statusCode3Xx) {
                this.statusCode3Xx = statusCode3Xx;
                return this;
            }

            /**
             * StatusCode4Xx.
             */
            public Builder statusCode4Xx(Long statusCode4Xx) {
                this.statusCode4Xx = statusCode4Xx;
                return this;
            }

            /**
             * StatusCode5Xx.
             */
            public Builder statusCode5Xx(Long statusCode5Xx) {
                this.statusCode5Xx = statusCode5Xx;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public DetailData build() {
                return new DetailData(this);
            } 

        } 

    }
    /**
     * 
     * {@link LiveUpstreamQosDataResponseBody} extends {@link TeaModel}
     *
     * <p>LiveUpstreamQosDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnDomain")
        private String cdnDomain;

        @com.aliyun.core.annotation.NameInMap("CdnIsp")
        private String cdnIsp;

        @com.aliyun.core.annotation.NameInMap("CdnOcid")
        private String cdnOcid;

        @com.aliyun.core.annotation.NameInMap("CdnProvince")
        private String cdnProvince;

        @com.aliyun.core.annotation.NameInMap("DetailData")
        private java.util.List<DetailData> detailData;

        @com.aliyun.core.annotation.NameInMap("KwaiSidc")
        private String kwaiSidc;

        @com.aliyun.core.annotation.NameInMap("KwaiTsc")
        private Long kwaiTsc;

        @com.aliyun.core.annotation.NameInMap("UpstreamDomain")
        private String upstreamDomain;

        private Data(Builder builder) {
            this.cdnDomain = builder.cdnDomain;
            this.cdnIsp = builder.cdnIsp;
            this.cdnOcid = builder.cdnOcid;
            this.cdnProvince = builder.cdnProvince;
            this.detailData = builder.detailData;
            this.kwaiSidc = builder.kwaiSidc;
            this.kwaiTsc = builder.kwaiTsc;
            this.upstreamDomain = builder.upstreamDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdnDomain
         */
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        /**
         * @return cdnIsp
         */
        public String getCdnIsp() {
            return this.cdnIsp;
        }

        /**
         * @return cdnOcid
         */
        public String getCdnOcid() {
            return this.cdnOcid;
        }

        /**
         * @return cdnProvince
         */
        public String getCdnProvince() {
            return this.cdnProvince;
        }

        /**
         * @return detailData
         */
        public java.util.List<DetailData> getDetailData() {
            return this.detailData;
        }

        /**
         * @return kwaiSidc
         */
        public String getKwaiSidc() {
            return this.kwaiSidc;
        }

        /**
         * @return kwaiTsc
         */
        public Long getKwaiTsc() {
            return this.kwaiTsc;
        }

        /**
         * @return upstreamDomain
         */
        public String getUpstreamDomain() {
            return this.upstreamDomain;
        }

        public static final class Builder {
            private String cdnDomain; 
            private String cdnIsp; 
            private String cdnOcid; 
            private String cdnProvince; 
            private java.util.List<DetailData> detailData; 
            private String kwaiSidc; 
            private Long kwaiTsc; 
            private String upstreamDomain; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdnDomain = model.cdnDomain;
                this.cdnIsp = model.cdnIsp;
                this.cdnOcid = model.cdnOcid;
                this.cdnProvince = model.cdnProvince;
                this.detailData = model.detailData;
                this.kwaiSidc = model.kwaiSidc;
                this.kwaiTsc = model.kwaiTsc;
                this.upstreamDomain = model.upstreamDomain;
            } 

            /**
             * CdnDomain.
             */
            public Builder cdnDomain(String cdnDomain) {
                this.cdnDomain = cdnDomain;
                return this;
            }

            /**
             * CdnIsp.
             */
            public Builder cdnIsp(String cdnIsp) {
                this.cdnIsp = cdnIsp;
                return this;
            }

            /**
             * CdnOcid.
             */
            public Builder cdnOcid(String cdnOcid) {
                this.cdnOcid = cdnOcid;
                return this;
            }

            /**
             * CdnProvince.
             */
            public Builder cdnProvince(String cdnProvince) {
                this.cdnProvince = cdnProvince;
                return this;
            }

            /**
             * DetailData.
             */
            public Builder detailData(java.util.List<DetailData> detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * KwaiSidc.
             */
            public Builder kwaiSidc(String kwaiSidc) {
                this.kwaiSidc = kwaiSidc;
                return this;
            }

            /**
             * KwaiTsc.
             */
            public Builder kwaiTsc(Long kwaiTsc) {
                this.kwaiTsc = kwaiTsc;
                return this;
            }

            /**
             * UpstreamDomain.
             */
            public Builder upstreamDomain(String upstreamDomain) {
                this.upstreamDomain = upstreamDomain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
