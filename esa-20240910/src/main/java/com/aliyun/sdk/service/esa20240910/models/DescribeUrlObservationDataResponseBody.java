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

        /**
         * UrlDetailData.
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
             * CLS.
             */
            public Builder CLS(Float CLS) {
                this.CLS = CLS;
                return this;
            }

            /**
             * ClientPlatform.
             */
            public Builder clientPlatform(String clientPlatform) {
                this.clientPlatform = clientPlatform;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * FCP.
             */
            public Builder FCP(Float FCP) {
                this.FCP = FCP;
                return this;
            }

            /**
             * FID.
             */
            public Builder FID(Float FID) {
                this.FID = FID;
                return this;
            }

            /**
             * INP.
             */
            public Builder INP(Float INP) {
                this.INP = INP;
                return this;
            }

            /**
             * LCP.
             */
            public Builder LCP(Float LCP) {
                this.LCP = LCP;
                return this;
            }

            /**
             * TTFB.
             */
            public Builder TTFB(Float TTFB) {
                this.TTFB = TTFB;
                return this;
            }

            /**
             * Url.
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
