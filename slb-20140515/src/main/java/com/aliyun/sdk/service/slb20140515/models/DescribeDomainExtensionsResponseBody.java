// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeDomainExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainExtensionsResponseBody</p>
 */
public class DescribeDomainExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainExtensions")
    private DomainExtensions domainExtensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainExtensionsResponseBody(Builder builder) {
        this.domainExtensions = builder.domainExtensions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainExtensions
     */
    public DomainExtensions getDomainExtensions() {
        return this.domainExtensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainExtensions domainExtensions; 
        private String requestId; 

        /**
         * <p>The list of additional certificates.</p>
         */
        public Builder domainExtensions(DomainExtensions domainExtensions) {
            this.domainExtensions = domainExtensions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>48C1B671-C6DB-4DDE-9B30-10557E36CDE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainExtensionsResponseBody build() {
            return new DescribeDomainExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainExtensionsResponseBody</p>
     */
    public static class DomainExtension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainExtensionId")
        private String domainExtensionId;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
        private String serverCertificateId;

        private DomainExtension(Builder builder) {
            this.domain = builder.domain;
            this.domainExtensionId = builder.domainExtensionId;
            this.serverCertificateId = builder.serverCertificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainExtension create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainExtensionId
         */
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

        /**
         * @return serverCertificateId
         */
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public static final class Builder {
            private String domain; 
            private String domainExtensionId; 
            private String serverCertificateId; 

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the additional certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>de-bp1rp7ta1****</p>
             */
            public Builder domainExtensionId(String domainExtensionId) {
                this.domainExtensionId = domainExtensionId;
                return this;
            }

            /**
             * <p>The ID of the server certificate that is used by the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1231579085529123_166f8204689_1714763408_70998****</p>
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            public DomainExtension build() {
                return new DomainExtension(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainExtensionsResponseBody</p>
     */
    public static class DomainExtensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainExtension")
        private java.util.List<DomainExtension> domainExtension;

        private DomainExtensions(Builder builder) {
            this.domainExtension = builder.domainExtension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainExtensions create() {
            return builder().build();
        }

        /**
         * @return domainExtension
         */
        public java.util.List<DomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

        public static final class Builder {
            private java.util.List<DomainExtension> domainExtension; 

            /**
             * DomainExtension.
             */
            public Builder domainExtension(java.util.List<DomainExtension> domainExtension) {
                this.domainExtension = domainExtension;
                return this;
            }

            public DomainExtensions build() {
                return new DomainExtensions(this);
            } 

        } 

    }
}
