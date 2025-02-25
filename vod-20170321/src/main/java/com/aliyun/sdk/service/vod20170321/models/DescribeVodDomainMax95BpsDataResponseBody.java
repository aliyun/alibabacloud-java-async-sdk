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
 * {@link DescribeVodDomainMax95BpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainMax95BpsDataResponseBody</p>
 */
public class DescribeVodDomainMax95BpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetailData")
    private DetailData detailData;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomesticMax95Bps")
    private String domesticMax95Bps;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Max95Bps")
    private String max95Bps;

    @com.aliyun.core.annotation.NameInMap("OverseasMax95Bps")
    private String overseasMax95Bps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodDomainMax95BpsDataResponseBody(Builder builder) {
        this.detailData = builder.detailData;
        this.domainName = builder.domainName;
        this.domesticMax95Bps = builder.domesticMax95Bps;
        this.endTime = builder.endTime;
        this.max95Bps = builder.max95Bps;
        this.overseasMax95Bps = builder.overseasMax95Bps;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainMax95BpsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return detailData
     */
    public DetailData getDetailData() {
        return this.detailData;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domesticMax95Bps
     */
    public String getDomesticMax95Bps() {
        return this.domesticMax95Bps;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return max95Bps
     */
    public String getMax95Bps() {
        return this.max95Bps;
    }

    /**
     * @return overseasMax95Bps
     */
    public String getOverseasMax95Bps() {
        return this.overseasMax95Bps;
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
        private DetailData detailData; 
        private String domainName; 
        private String domesticMax95Bps; 
        private String endTime; 
        private String max95Bps; 
        private String overseasMax95Bps; 
        private String requestId; 
        private String startTime; 

        /**
         * DetailData.
         */
        public Builder detailData(DetailData detailData) {
            this.detailData = detailData;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomesticMax95Bps.
         */
        public Builder domesticMax95Bps(String domesticMax95Bps) {
            this.domesticMax95Bps = domesticMax95Bps;
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
         * Max95Bps.
         */
        public Builder max95Bps(String max95Bps) {
            this.max95Bps = max95Bps;
            return this;
        }

        /**
         * OverseasMax95Bps.
         */
        public Builder overseasMax95Bps(String overseasMax95Bps) {
            this.overseasMax95Bps = overseasMax95Bps;
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

        public DescribeVodDomainMax95BpsDataResponseBody build() {
            return new DescribeVodDomainMax95BpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainMax95BpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainMax95BpsDataResponseBody</p>
     */
    public static class Max95Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("Max95Bps")
        private Float max95Bps;

        @com.aliyun.core.annotation.NameInMap("Max95BpsPeakTime")
        private String max95BpsPeakTime;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private Max95Detail(Builder builder) {
            this.area = builder.area;
            this.max95Bps = builder.max95Bps;
            this.max95BpsPeakTime = builder.max95BpsPeakTime;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Max95Detail create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return max95Bps
         */
        public Float getMax95Bps() {
            return this.max95Bps;
        }

        /**
         * @return max95BpsPeakTime
         */
        public String getMax95BpsPeakTime() {
            return this.max95BpsPeakTime;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String area; 
            private Float max95Bps; 
            private String max95BpsPeakTime; 
            private String timeStamp; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * Max95Bps.
             */
            public Builder max95Bps(Float max95Bps) {
                this.max95Bps = max95Bps;
                return this;
            }

            /**
             * Max95BpsPeakTime.
             */
            public Builder max95BpsPeakTime(String max95BpsPeakTime) {
                this.max95BpsPeakTime = max95BpsPeakTime;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Max95Detail build() {
                return new Max95Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodDomainMax95BpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainMax95BpsDataResponseBody</p>
     */
    public static class DetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max95Detail")
        private java.util.List<Max95Detail> max95Detail;

        private DetailData(Builder builder) {
            this.max95Detail = builder.max95Detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailData create() {
            return builder().build();
        }

        /**
         * @return max95Detail
         */
        public java.util.List<Max95Detail> getMax95Detail() {
            return this.max95Detail;
        }

        public static final class Builder {
            private java.util.List<Max95Detail> max95Detail; 

            /**
             * Max95Detail.
             */
            public Builder max95Detail(java.util.List<Max95Detail> max95Detail) {
                this.max95Detail = max95Detail;
                return this;
            }

            public DetailData build() {
                return new DetailData(this);
            } 

        } 

    }
}
