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
 * {@link DescribeCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCertsResponseBody</p>
 */
public class DescribeCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Certs")
    private java.util.List<Certs> certs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCertsResponseBody(Builder builder) {
        this.certs = builder.certs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certs
     */
    public java.util.List<Certs> getCerts() {
        return this.certs;
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
        private java.util.List<Certs> certs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCertsResponseBody model) {
            this.certs = model.certs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The certificates.</p>
         */
        public Builder certs(java.util.List<Certs> certs) {
            this.certs = certs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19511B0D-5AE0-5600-BB8A-DC2C8345****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCertsResponseBody build() {
            return new DescribeCertsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCertsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCertsResponseBody</p>
     */
    public static class Certs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AfterDate")
        private Long afterDate;

        @com.aliyun.core.annotation.NameInMap("BeforeDate")
        private Long beforeDate;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("IsChainCompleted")
        private Boolean isChainCompleted;

        private Certs(Builder builder) {
            this.afterDate = builder.afterDate;
            this.beforeDate = builder.beforeDate;
            this.certIdentifier = builder.certIdentifier;
            this.certName = builder.certName;
            this.commonName = builder.commonName;
            this.domain = builder.domain;
            this.isChainCompleted = builder.isChainCompleted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certs create() {
            return builder().build();
        }

        /**
         * @return afterDate
         */
        public Long getAfterDate() {
            return this.afterDate;
        }

        /**
         * @return beforeDate
         */
        public Long getBeforeDate() {
            return this.beforeDate;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return isChainCompleted
         */
        public Boolean getIsChainCompleted() {
            return this.isChainCompleted;
        }

        public static final class Builder {
            private Long afterDate; 
            private Long beforeDate; 
            private String certIdentifier; 
            private String certName; 
            private String commonName; 
            private String domain; 
            private Boolean isChainCompleted; 

            private Builder() {
            } 

            private Builder(Certs model) {
                this.afterDate = model.afterDate;
                this.beforeDate = model.beforeDate;
                this.certIdentifier = model.certIdentifier;
                this.certName = model.certName;
                this.commonName = model.commonName;
                this.domain = model.domain;
                this.isChainCompleted = model.isChainCompleted;
            } 

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>1976256736582</p>
             */
            public Builder afterDate(Long afterDate) {
                this.afterDate = afterDate;
                return this;
            }

            /**
             * <p>The effective time.</p>
             * 
             * <strong>example:</strong>
             * <p>1976256836582</p>
             */
            public Builder beforeDate(Long beforeDate) {
                this.beforeDate = beforeDate;
                return this;
            }

            /**
             * <p>The globally unique ID of the certificate. The value follows a &quot;&lt;Certificate ID&gt;-ap-southeast-1&quot; format. For example, if the ID of the certificate is 123, the value of the CertIdentifier parameter is 123-ap-southeast-1.</p>
             * 
             * <strong>example:</strong>
             * <p>123-ap-southeast-1</p>
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>waf1234</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The common name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.example.com</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The domain that is supported by the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the certificate chain is complete. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isChainCompleted(Boolean isChainCompleted) {
                this.isChainCompleted = isChainCompleted;
                return this;
            }

            public Certs build() {
                return new Certs(this);
            } 

        } 

    }
}
