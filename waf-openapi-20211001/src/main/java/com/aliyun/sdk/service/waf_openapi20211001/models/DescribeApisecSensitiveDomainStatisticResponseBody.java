// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisecSensitiveDomainStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecSensitiveDomainStatisticResponseBody</p>
 */
public class DescribeApisecSensitiveDomainStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecSensitiveDomainStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecSensitiveDomainStatisticResponseBody create() {
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecSensitiveDomainStatisticResponseBody build() {
            return new DescribeApisecSensitiveDomainStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCount")
        private Long apiCount;

        @com.aliyun.core.annotation.NameInMap("DomainCount")
        private Long domainCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private String sensitiveCode;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveName")
        private String sensitiveName;

        private Data(Builder builder) {
            this.apiCount = builder.apiCount;
            this.domainCount = builder.domainCount;
            this.sensitiveCode = builder.sensitiveCode;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.sensitiveName = builder.sensitiveName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiCount
         */
        public Long getApiCount() {
            return this.apiCount;
        }

        /**
         * @return domainCount
         */
        public Long getDomainCount() {
            return this.domainCount;
        }

        /**
         * @return sensitiveCode
         */
        public String getSensitiveCode() {
            return this.sensitiveCode;
        }

        /**
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        /**
         * @return sensitiveName
         */
        public String getSensitiveName() {
            return this.sensitiveName;
        }

        public static final class Builder {
            private Long apiCount; 
            private Long domainCount; 
            private String sensitiveCode; 
            private String sensitiveLevel; 
            private String sensitiveName; 

            /**
             * ApiCount.
             */
            public Builder apiCount(Long apiCount) {
                this.apiCount = apiCount;
                return this;
            }

            /**
             * DomainCount.
             */
            public Builder domainCount(Long domainCount) {
                this.domainCount = domainCount;
                return this;
            }

            /**
             * SensitiveCode.
             */
            public Builder sensitiveCode(String sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            /**
             * SensitiveLevel.
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * SensitiveName.
             */
            public Builder sensitiveName(String sensitiveName) {
                this.sensitiveName = sensitiveName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
