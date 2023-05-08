// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectApiInvokeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectApiInvokeInfoResponseBody</p>
 */
public class GetFileDetectApiInvokeInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetFileDetectApiInvokeInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectApiInvokeInfoResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileDetectApiInvokeInfoResponseBody build() {
            return new GetFileDetectApiInvokeInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthCount")
        private Long authCount;

        @NameInMap("Expire")
        private Long expire;

        @NameInMap("FlowRate")
        private Integer flowRate;

        @NameInMap("RemainAuthCount")
        private Long remainAuthCount;

        @NameInMap("SaleVersion")
        private Integer saleVersion;

        @NameInMap("TimeUnit")
        private String timeUnit;

        private Data(Builder builder) {
            this.authCount = builder.authCount;
            this.expire = builder.expire;
            this.flowRate = builder.flowRate;
            this.remainAuthCount = builder.remainAuthCount;
            this.saleVersion = builder.saleVersion;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authCount
         */
        public Long getAuthCount() {
            return this.authCount;
        }

        /**
         * @return expire
         */
        public Long getExpire() {
            return this.expire;
        }

        /**
         * @return flowRate
         */
        public Integer getFlowRate() {
            return this.flowRate;
        }

        /**
         * @return remainAuthCount
         */
        public Long getRemainAuthCount() {
            return this.remainAuthCount;
        }

        /**
         * @return saleVersion
         */
        public Integer getSaleVersion() {
            return this.saleVersion;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private Long authCount; 
            private Long expire; 
            private Integer flowRate; 
            private Long remainAuthCount; 
            private Integer saleVersion; 
            private String timeUnit; 

            /**
             * AuthCount.
             */
            public Builder authCount(Long authCount) {
                this.authCount = authCount;
                return this;
            }

            /**
             * Expire.
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * FlowRate.
             */
            public Builder flowRate(Integer flowRate) {
                this.flowRate = flowRate;
                return this;
            }

            /**
             * RemainAuthCount.
             */
            public Builder remainAuthCount(Long remainAuthCount) {
                this.remainAuthCount = remainAuthCount;
                return this;
            }

            /**
             * SaleVersion.
             */
            public Builder saleVersion(Integer saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * TimeUnit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
