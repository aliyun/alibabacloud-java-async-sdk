// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.carbonfootprint20230711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCarbonTrackResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCarbonTrackResponseBody</p>
 */
public class QueryCarbonTrackResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCarbonTrackResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCarbonTrackResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data records.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCarbonTrackResponseBody build() {
            return new QueryCarbonTrackResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("QuotaValue")
        private Double quotaValue;

        @NameInMap("Region")
        private String region;

        @NameInMap("StatisticsDate")
        private Long statisticsDate;

        @NameInMap("SubUid")
        private String subUid;

        @NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.productCode = builder.productCode;
            this.quotaValue = builder.quotaValue;
            this.region = builder.region;
            this.statisticsDate = builder.statisticsDate;
            this.subUid = builder.subUid;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaValue
         */
        public Double getQuotaValue() {
            return this.quotaValue;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return statisticsDate
         */
        public Long getStatisticsDate() {
            return this.statisticsDate;
        }

        /**
         * @return subUid
         */
        public String getSubUid() {
            return this.subUid;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String productCode; 
            private Double quotaValue; 
            private String region; 
            private Long statisticsDate; 
            private String subUid; 
            private String uid; 

            /**
             * The service code.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The carbon emissions within the specified time range, in kgCO₂e.
             */
            public Builder quotaValue(Double quotaValue) {
                this.quotaValue = quotaValue;
                return this;
            }

            /**
             * The region in which the cloud service resides.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The date when the statistics are collected, which is a timestamp in milliseconds.
             */
            public Builder statisticsDate(Long statisticsDate) {
                this.statisticsDate = statisticsDate;
                return this;
            }

            /**
             * The ID of the RAM user.
             */
            public Builder subUid(String subUid) {
                this.subUid = subUid;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
