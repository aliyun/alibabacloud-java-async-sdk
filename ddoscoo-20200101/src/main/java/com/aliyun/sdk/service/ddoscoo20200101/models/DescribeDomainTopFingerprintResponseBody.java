// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainTopFingerprintResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopFingerprintResponseBody</p>
 */
public class DescribeDomainTopFingerprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTopFp")
    private java.util.List<DomainTopFp> domainTopFp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopFingerprintResponseBody(Builder builder) {
        this.domainTopFp = builder.domainTopFp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopFingerprintResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainTopFp
     */
    public java.util.List<DomainTopFp> getDomainTopFp() {
        return this.domainTopFp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainTopFp> domainTopFp; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainTopFingerprintResponseBody model) {
            this.domainTopFp = model.domainTopFp;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the fingerprints of the clients.</p>
         */
        public Builder domainTopFp(java.util.List<DomainTopFp> domainTopFp) {
            this.domainTopFp = domainTopFp;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopFingerprintResponseBody build() {
            return new DescribeDomainTopFingerprintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopFingerprintResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopFingerprintResponseBody</p>
     */
    public static class DomainTopFp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Fingerprinting")
        private String fingerprinting;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        private DomainTopFp(Builder builder) {
            this.domain = builder.domain;
            this.fingerprinting = builder.fingerprinting;
            this.pv = builder.pv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTopFp create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return fingerprinting
         */
        public String getFingerprinting() {
            return this.fingerprinting;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        public static final class Builder {
            private String domain; 
            private String fingerprinting; 
            private Long pv; 

            private Builder() {
            } 

            private Builder(DomainTopFp model) {
                this.domain = model.domain;
                this.fingerprinting = model.fingerprinting;
                this.pv = model.pv;
            } 

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The fingerprint of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>8a374c9724582b14a4cfa58c8c9fb2bc</p>
             */
            public Builder fingerprinting(String fingerprinting) {
                this.fingerprinting = fingerprinting;
                return this;
            }

            /**
             * <p>The page views.</p>
             * 
             * <strong>example:</strong>
             * <p>22121</p>
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            public DomainTopFp build() {
                return new DomainTopFp(this);
            } 

        } 

    }
}
