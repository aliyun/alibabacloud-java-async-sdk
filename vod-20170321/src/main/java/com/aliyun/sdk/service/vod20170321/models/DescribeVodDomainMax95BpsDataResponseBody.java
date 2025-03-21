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
         * <p>Details of the 95th percentile bandwidth.</p>
         */
        public Builder detailData(DetailData detailData) {
            this.detailData = detailData;
            return this;
        }

        /**
         * <p>The domain name for CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The 95th percentile bandwidth in the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>16777590.28</p>
         */
        public Builder domesticMax95Bps(String domesticMax95Bps) {
            this.domesticMax95Bps = domesticMax95Bps;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p> The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T13:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The 95th percentile bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>16777590.28</p>
         */
        public Builder max95Bps(String max95Bps) {
            this.max95Bps = max95Bps;
            return this;
        }

        /**
         * <p>The 95th percentile bandwidth outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder overseasMax95Bps(String overseasMax95Bps) {
            this.overseasMax95Bps = overseasMax95Bps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
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
             * <p>The billable region where the peak 95 data was collected.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The 95th percentile bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>16777590.28</p>
             */
            public Builder max95Bps(Float max95Bps) {
                this.max95Bps = max95Bps;
                return this;
            }

            /**
             * <p>The time corresponding to the 95th percentile bandwidth peak.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-11T21:05:00Z</p>
             */
            public Builder max95BpsPeakTime(String max95BpsPeakTime) {
                this.max95BpsPeakTime = max95BpsPeakTime;
                return this;
            }

            /**
             * <p>The timestamp of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-18 10:11:32</p>
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
