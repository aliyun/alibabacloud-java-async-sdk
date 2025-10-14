// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeUrlObservationDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUrlObservationDataResponseBody</p>
 */
public class DescribeUrlObservationDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("UrlDetailData")
    private java.util.List<UrlDetailData> urlDetailData;

    private DescribeUrlObservationDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.urlDetailData = builder.urlDetailData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUrlObservationDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return urlDetailData
     */
    public java.util.List<UrlDetailData> getUrlDetailData() {
        return this.urlDetailData;
    }

    public static final class Builder {
        private String endTime; 
        private String requestId; 
        private String startTime; 
        private java.util.List<UrlDetailData> urlDetailData; 

        private Builder() {
        } 

        private Builder(DescribeUrlObservationDataResponseBody model) {
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.urlDetailData = model.urlDetailData;
        } 

        /**
         * <p>The end of the time range during which data was queried.</p>
         * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The create time. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The objects that are returned.</p>
         */
        public Builder urlDetailData(java.util.List<UrlDetailData> urlDetailData) {
            this.urlDetailData = urlDetailData;
            return this;
        }

        public DescribeUrlObservationDataResponseBody build() {
            return new DescribeUrlObservationDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUrlObservationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUrlObservationDataResponseBody</p>
     */
    public static class UrlDetailData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CLS")
        private Float CLS;

        @com.aliyun.core.annotation.NameInMap("ClientPlatform")
        private String clientPlatform;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("FCP")
        private Float FCP;

        @com.aliyun.core.annotation.NameInMap("FID")
        private Float FID;

        @com.aliyun.core.annotation.NameInMap("INP")
        private Float INP;

        @com.aliyun.core.annotation.NameInMap("LCP")
        private Float LCP;

        @com.aliyun.core.annotation.NameInMap("TTFB")
        private Float TTFB;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private UrlDetailData(Builder builder) {
            this.CLS = builder.CLS;
            this.clientPlatform = builder.clientPlatform;
            this.country = builder.country;
            this.FCP = builder.FCP;
            this.FID = builder.FID;
            this.INP = builder.INP;
            this.LCP = builder.LCP;
            this.TTFB = builder.TTFB;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlDetailData create() {
            return builder().build();
        }

        /**
         * @return CLS
         */
        public Float getCLS() {
            return this.CLS;
        }

        /**
         * @return clientPlatform
         */
        public String getClientPlatform() {
            return this.clientPlatform;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return FCP
         */
        public Float getFCP() {
            return this.FCP;
        }

        /**
         * @return FID
         */
        public Float getFID() {
            return this.FID;
        }

        /**
         * @return INP
         */
        public Float getINP() {
            return this.INP;
        }

        /**
         * @return LCP
         */
        public Float getLCP() {
            return this.LCP;
        }

        /**
         * @return TTFB
         */
        public Float getTTFB() {
            return this.TTFB;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Float CLS; 
            private String clientPlatform; 
            private String country; 
            private Float FCP; 
            private Float FID; 
            private Float INP; 
            private Float LCP; 
            private Float TTFB; 
            private String url; 

            private Builder() {
            } 

            private Builder(UrlDetailData model) {
                this.CLS = model.CLS;
                this.clientPlatform = model.clientPlatform;
                this.country = model.country;
                this.FCP = model.FCP;
                this.FID = model.FID;
                this.INP = model.INP;
                this.LCP = model.LCP;
                this.TTFB = model.TTFB;
                this.url = model.url;
            } 

            /**
             * <p>Measures the maximum layout mutation score for every unexpected layout change that occurs throughout the life of the page.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder CLS(Float CLS) {
                this.CLS = CLS;
                return this;
            }

            /**
             * <p>The platform of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>PC</p>
             */
            public Builder clientPlatform(String clientPlatform) {
                this.clientPlatform = clientPlatform;
                return this;
            }

            /**
             * <p>The country or region to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>Measures the time between when the page is loaded and when any part of the page&quot;s content is rendered on the screen. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder FCP(Float FCP) {
                this.FCP = FCP;
                return this;
            }

            /**
             * <p>Measures the time between when the user first interacts with the page and when the browser is actually able to start processing an event handler in response to that interaction. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder FID(Float FID) {
                this.FID = FID;
                return this;
            }

            /**
             * <p>Measures the responsiveness of the page, or how long it takes for the page to respond to user input visibly. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder INP(Float INP) {
                this.INP = INP;
                return this;
            }

            /**
             * <p>Reports the rendering time of the largest image or text block visible in the viewport. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder LCP(Float LCP) {
                this.LCP = LCP;
                return this;
            }

            /**
             * <p>This metric measures the time between when a resource initiates a request and when the first byte of the response starts to arrive. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder TTFB(Float TTFB) {
                this.TTFB = TTFB;
                return this;
            }

            /**
             * <p>The URL of the web page to monitor.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com/test</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public UrlDetailData build() {
                return new UrlDetailData(this);
            } 

        } 

    }
}
