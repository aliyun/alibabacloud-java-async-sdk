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
 * {@link DescribeSensitiveOutboundDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveOutboundDistributionResponseBody</p>
 */
public class DescribeSensitiveOutboundDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSensitiveOutboundDistributionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveOutboundDistributionResponseBody create() {
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSensitiveOutboundDistributionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The traffic distribution of personal information records involved in cross-border data transfer.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSensitiveOutboundDistributionResponseBody build() {
            return new DescribeSensitiveOutboundDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveOutboundDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveOutboundDistributionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("InfoOutboundCount")
        private Long infoOutboundCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveOutboundCount")
        private Long sensitiveOutboundCount;

        private Data(Builder builder) {
            this.country = builder.country;
            this.infoOutboundCount = builder.infoOutboundCount;
            this.sensitiveOutboundCount = builder.sensitiveOutboundCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
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

        public static final class Builder {
            private String country; 
            private Long infoOutboundCount; 
            private Long sensitiveOutboundCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.country = model.country;
                this.infoOutboundCount = model.infoOutboundCount;
                this.sensitiveOutboundCount = model.sensitiveOutboundCount;
            } 

            /**
             * <p>The country to which the data is transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>US</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The number of personal information records involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>213</p>
             */
            public Builder infoOutboundCount(Long infoOutboundCount) {
                this.infoOutboundCount = infoOutboundCount;
                return this;
            }

            /**
             * <p>The number of sensitive information records involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>144</p>
             */
            public Builder sensitiveOutboundCount(Long sensitiveOutboundCount) {
                this.sensitiveOutboundCount = sensitiveOutboundCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
