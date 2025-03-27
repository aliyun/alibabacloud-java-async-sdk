// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSensitiveOutboundTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveOutboundTrendResponseBody</p>
 */
public class DescribeSensitiveOutboundTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveOutboundTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveOutboundTrendResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSensitiveOutboundTrendResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information records involved in cross-border data transfer.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSensitiveOutboundTrendResponseBody build() {
            return new DescribeSensitiveOutboundTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveOutboundTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveOutboundTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private Long infoCount;

        @com.aliyun.core.annotation.NameInMap("InfoOutboundCount")
        private Long infoOutboundCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveOutboundCount")
        private Long sensitiveOutboundCount;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.infoCount = builder.infoCount;
            this.infoOutboundCount = builder.infoOutboundCount;
            this.sensitiveOutboundCount = builder.sensitiveOutboundCount;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Long getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return infoOutboundCount
         */
        public Long getInfoOutboundCount() {
            return this.infoOutboundCount;
        }

        /**
         * @return sensitiveOutboundCount
         */
        public Long getSensitiveOutboundCount() {
            return this.sensitiveOutboundCount;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Long infoCount; 
            private Long infoOutboundCount; 
            private Long sensitiveOutboundCount; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.infoCount = model.infoCount;
                this.infoOutboundCount = model.infoOutboundCount;
                this.sensitiveOutboundCount = model.sensitiveOutboundCount;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The total number of personal information records.</p>
             * 
             * <strong>example:</strong>
             * <p>672</p>
             */
            public Builder infoCount(Long infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * <p>The total number of personal information records involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>541</p>
             */
            public Builder infoOutboundCount(Long infoOutboundCount) {
                this.infoOutboundCount = infoOutboundCount;
                return this;
            }

            /**
             * <p>The total number of sensitive information records involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>378</p>
             */
            public Builder sensitiveOutboundCount(Long sensitiveOutboundCount) {
                this.sensitiveOutboundCount = sensitiveOutboundCount;
                return this;
            }

            /**
             * <p>The time of cross-border data transfer. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1672502400</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
