// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetOssBucketScanStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssBucketScanStatisticResponseBody</p>
 */
public class GetOssBucketScanStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOssBucketScanStatisticResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FAC50208-E56B-5CC8-8738-2B219D1A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOssBucketScanStatisticResponseBody build() {
            return new GetOssBucketScanStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssBucketScanStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssBucketScanStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("HighRisk")
        private Long highRisk;

        @com.aliyun.core.annotation.NameInMap("LowRisk")
        private Long lowRisk;

        @com.aliyun.core.annotation.NameInMap("MediumRisk")
        private Long mediumRisk;

        @com.aliyun.core.annotation.NameInMap("NoScanBucket")
        private Integer noScanBucket;

        @com.aliyun.core.annotation.NameInMap("RemainAuth")
        private Integer remainAuth;

        @com.aliyun.core.annotation.NameInMap("RiskBucket")
        private Integer riskBucket;

        @com.aliyun.core.annotation.NameInMap("ScanObject")
        private Long scanObject;

        @com.aliyun.core.annotation.NameInMap("TotalBucket")
        private Integer totalBucket;

        @com.aliyun.core.annotation.NameInMap("TotalObject")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.expireTime = model.expireTime;
                this.highRisk = model.highRisk;
                this.lowRisk = model.lowRisk;
                this.mediumRisk = model.mediumRisk;
                this.noScanBucket = model.noScanBucket;
                this.remainAuth = model.remainAuth;
                this.riskBucket = model.riskBucket;
                this.scanObject = model.scanObject;
                this.totalBucket = model.totalBucket;
                this.totalObject = model.totalObject;
            } 

            /**
             * <p>The expiration time of the purchased quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1714442403000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The number of high-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder highRisk(Long highRisk) {
                this.highRisk = highRisk;
                return this;
            }

            /**
             * <p>The number of low-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowRisk(Long lowRisk) {
                this.lowRisk = lowRisk;
                return this;
            }

            /**
             * <p>The number of medium-risk objects.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediumRisk(Long mediumRisk) {
                this.mediumRisk = mediumRisk;
                return this;
            }

            /**
             * <p>The number of buckets that are not checked.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder noScanBucket(Integer noScanBucket) {
                this.noScanBucket = noScanBucket;
                return this;
            }

            /**
             * <p>The remaining quota.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remainAuth(Integer remainAuth) {
                this.remainAuth = remainAuth;
                return this;
            }

            /**
             * <p>The number of buckets in which at-risk objects exist.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskBucket(Integer riskBucket) {
                this.riskBucket = riskBucket;
                return this;
            }

            /**
             * <p>The number of objects that are checked.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scanObject(Long scanObject) {
                this.scanObject = scanObject;
                return this;
            }

            /**
             * <p>The total number of buckets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalBucket(Integer totalBucket) {
                this.totalBucket = totalBucket;
                return this;
            }

            /**
             * <p>The total number of objects in the bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
