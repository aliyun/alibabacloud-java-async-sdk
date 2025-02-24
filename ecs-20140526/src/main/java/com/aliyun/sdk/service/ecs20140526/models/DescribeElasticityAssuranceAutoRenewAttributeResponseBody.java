// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeElasticityAssuranceAutoRenewAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticityAssuranceAutoRenewAttributeResponseBody</p>
 */
public class DescribeElasticityAssuranceAutoRenewAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceRenewAttributes")
    private ElasticityAssuranceRenewAttributes elasticityAssuranceRenewAttributes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeElasticityAssuranceAutoRenewAttributeResponseBody(Builder builder) {
        this.elasticityAssuranceRenewAttributes = builder.elasticityAssuranceRenewAttributes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticityAssuranceAutoRenewAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticityAssuranceRenewAttributes
     */
    public ElasticityAssuranceRenewAttributes getElasticityAssuranceRenewAttributes() {
        return this.elasticityAssuranceRenewAttributes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ElasticityAssuranceRenewAttributes elasticityAssuranceRenewAttributes; 
        private String requestId; 

        /**
         * ElasticityAssuranceRenewAttributes.
         */
        public Builder elasticityAssuranceRenewAttributes(ElasticityAssuranceRenewAttributes elasticityAssuranceRenewAttributes) {
            this.elasticityAssuranceRenewAttributes = elasticityAssuranceRenewAttributes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticityAssuranceAutoRenewAttributeResponseBody build() {
            return new DescribeElasticityAssuranceAutoRenewAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticityAssuranceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssuranceAutoRenewAttributeResponseBody</p>
     */
    public static class ElasticityAssuranceRenewAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
        private String privatePoolOptionsId;

        @com.aliyun.core.annotation.NameInMap("RenewalStatus")
        private String renewalStatus;

        private ElasticityAssuranceRenewAttribute(Builder builder) {
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
            this.renewalStatus = builder.renewalStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceRenewAttribute create() {
            return builder().build();
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return privatePoolOptionsId
         */
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        /**
         * @return renewalStatus
         */
        public String getRenewalStatus() {
            return this.renewalStatus;
        }

        public static final class Builder {
            private Integer period; 
            private String periodUnit; 
            private String privatePoolOptionsId; 
            private String renewalStatus; 

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(String privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            /**
             * RenewalStatus.
             */
            public Builder renewalStatus(String renewalStatus) {
                this.renewalStatus = renewalStatus;
                return this;
            }

            public ElasticityAssuranceRenewAttribute build() {
                return new ElasticityAssuranceRenewAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeElasticityAssuranceAutoRenewAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticityAssuranceAutoRenewAttributeResponseBody</p>
     */
    public static class ElasticityAssuranceRenewAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticityAssuranceRenewAttribute")
        private java.util.List<ElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttribute;

        private ElasticityAssuranceRenewAttributes(Builder builder) {
            this.elasticityAssuranceRenewAttribute = builder.elasticityAssuranceRenewAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticityAssuranceRenewAttributes create() {
            return builder().build();
        }

        /**
         * @return elasticityAssuranceRenewAttribute
         */
        public java.util.List<ElasticityAssuranceRenewAttribute> getElasticityAssuranceRenewAttribute() {
            return this.elasticityAssuranceRenewAttribute;
        }

        public static final class Builder {
            private java.util.List<ElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttribute; 

            /**
             * ElasticityAssuranceRenewAttribute.
             */
            public Builder elasticityAssuranceRenewAttribute(java.util.List<ElasticityAssuranceRenewAttribute> elasticityAssuranceRenewAttribute) {
                this.elasticityAssuranceRenewAttribute = elasticityAssuranceRenewAttribute;
                return this;
            }

            public ElasticityAssuranceRenewAttributes build() {
                return new ElasticityAssuranceRenewAttributes(this);
            } 

        } 

    }
}
