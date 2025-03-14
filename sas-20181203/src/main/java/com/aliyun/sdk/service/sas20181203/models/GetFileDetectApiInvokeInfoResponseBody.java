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
 * {@link GetFileDetectApiInvokeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectApiInvokeInfoResponseBody</p>
 */
public class GetFileDetectApiInvokeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(GetFileDetectApiInvokeInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returns the response body.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9f368b6e-d60a-43c5-bd6f-c7087f2d****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileDetectApiInvokeInfoResponseBody build() {
            return new GetFileDetectApiInvokeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDetectApiInvokeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileDetectApiInvokeInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthCount")
        private Long authCount;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Long expire;

        @com.aliyun.core.annotation.NameInMap("FlowRate")
        private Integer flowRate;

        @com.aliyun.core.annotation.NameInMap("RemainAuthCount")
        private Long remainAuthCount;

        @com.aliyun.core.annotation.NameInMap("SaleVersion")
        private Integer saleVersion;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.authCount = model.authCount;
                this.expire = model.expire;
                this.flowRate = model.flowRate;
                this.remainAuthCount = model.remainAuthCount;
                this.saleVersion = model.saleVersion;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * <p>The total number of authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder authCount(Long authCount) {
                this.authCount = authCount;
                return this;
            }

            /**
             * <p>The timestamp of the expiration date of the authorization number.</p>
             * 
             * <strong>example:</strong>
             * <p>1815753600000</p>
             */
            public Builder expire(Long expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The frequency of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder flowRate(Integer flowRate) {
                this.flowRate = flowRate;
                return this;
            }

            /**
             * <p>The number of remaining authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder remainAuthCount(Long remainAuthCount) {
                this.remainAuthCount = remainAuthCount;
                return this;
            }

            /**
             * <p>The Authorized Version. Valid values include:</p>
             * <ul>
             * <li><strong>1:</strong> trial version</li>
             * <li><strong>2:</strong> Enterprise Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder saleVersion(Integer saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * <p>The time unit of the frequency limit. Value:</p>
             * <ul>
             * <li><strong>SECONDS</strong></li>
             * <li><strong>MINUTES</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SECONDS</p>
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
