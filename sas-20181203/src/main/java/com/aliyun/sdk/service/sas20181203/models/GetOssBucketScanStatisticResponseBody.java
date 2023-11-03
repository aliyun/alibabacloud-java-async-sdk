// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssBucketScanStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssBucketScanStatisticResponseBody</p>
 */
public class GetOssBucketScanStatisticResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetOssBucketScanStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssBucketScanStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssBucketScanStatisticResponseBody build() {
            return new GetOssBucketScanStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("HighRisk")
        private Long highRisk;

        @NameInMap("LowRisk")
        private Long lowRisk;

        @NameInMap("MediumRisk")
        private Long mediumRisk;

        @NameInMap("NoScanBucket")
        private Integer noScanBucket;

        @NameInMap("RemainAuth")
        private Integer remainAuth;

        @NameInMap("RiskBucket")
        private Integer riskBucket;

        @NameInMap("ScanObject")
        private Long scanObject;

        @NameInMap("TotalBucket")
        private Integer totalBucket;

        @NameInMap("TotalObject")
        private Long totalObject;

        private Data(Builder builder) {
            this.expireTime = builder.expireTime;
            this.highRisk = builder.highRisk;
            this.lowRisk = builder.lowRisk;
            this.mediumRisk = builder.mediumRisk;
            this.noScanBucket = builder.noScanBucket;
            this.remainAuth = builder.remainAuth;
            this.riskBucket = builder.riskBucket;
            this.scanObject = builder.scanObject;
            this.totalBucket = builder.totalBucket;
            this.totalObject = builder.totalObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return highRisk
         */
        public Long getHighRisk() {
            return this.highRisk;
        }

        /**
         * @return lowRisk
         */
        public Long getLowRisk() {
            return this.lowRisk;
        }

        /**
         * @return mediumRisk
         */
        public Long getMediumRisk() {
            return this.mediumRisk;
        }

        /**
         * @return noScanBucket
         */
        public Integer getNoScanBucket() {
            return this.noScanBucket;
        }

        /**
         * @return remainAuth
         */
        public Integer getRemainAuth() {
            return this.remainAuth;
        }

        /**
         * @return riskBucket
         */
        public Integer getRiskBucket() {
            return this.riskBucket;
        }

        /**
         * @return scanObject
         */
        public Long getScanObject() {
            return this.scanObject;
        }

        /**
         * @return totalBucket
         */
        public Integer getTotalBucket() {
            return this.totalBucket;
        }

        /**
         * @return totalObject
         */
        public Long getTotalObject() {
            return this.totalObject;
        }

        public static final class Builder {
            private Long expireTime; 
            private Long highRisk; 
            private Long lowRisk; 
            private Long mediumRisk; 
            private Integer noScanBucket; 
            private Integer remainAuth; 
            private Integer riskBucket; 
            private Long scanObject; 
            private Integer totalBucket; 
            private Long totalObject; 

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HighRisk.
             */
            public Builder highRisk(Long highRisk) {
                this.highRisk = highRisk;
                return this;
            }

            /**
             * LowRisk.
             */
            public Builder lowRisk(Long lowRisk) {
                this.lowRisk = lowRisk;
                return this;
            }

            /**
             * MediumRisk.
             */
            public Builder mediumRisk(Long mediumRisk) {
                this.mediumRisk = mediumRisk;
                return this;
            }

            /**
             * NoScanBucket.
             */
            public Builder noScanBucket(Integer noScanBucket) {
                this.noScanBucket = noScanBucket;
                return this;
            }

            /**
             * RemainAuth.
             */
            public Builder remainAuth(Integer remainAuth) {
                this.remainAuth = remainAuth;
                return this;
            }

            /**
             * RiskBucket.
             */
            public Builder riskBucket(Integer riskBucket) {
                this.riskBucket = riskBucket;
                return this;
            }

            /**
             * ScanObject.
             */
            public Builder scanObject(Long scanObject) {
                this.scanObject = scanObject;
                return this;
            }

            /**
             * TotalBucket.
             */
            public Builder totalBucket(Integer totalBucket) {
                this.totalBucket = totalBucket;
                return this;
            }

            /**
             * TotalObject.
             */
            public Builder totalObject(Long totalObject) {
                this.totalObject = totalObject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
