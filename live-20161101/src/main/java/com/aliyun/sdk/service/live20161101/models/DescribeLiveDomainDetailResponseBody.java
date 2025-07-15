// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainDetailResponseBody</p>
 */
public class DescribeLiveDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainDetail")
    private DomainDetail domainDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainDetailResponseBody(Builder builder) {
        this.domainDetail = builder.domainDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainDetail
     */
    public DomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainDetail domainDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveDomainDetailResponseBody model) {
            this.domainDetail = model.domainDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration details of the domain name.</p>
         */
        public Builder domainDetail(DomainDetail domainDetail) {
            this.domainDetail = domainDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>09ABE829-6CD3-4FE0-AFEE-556113E29727</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainDetailResponseBody build() {
            return new DescribeLiveDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveDomainDetailResponseBody</p>
     */
    public static class DomainDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LiveDomainType")
        private String liveDomainType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("SSLPub")
        private String SSLPub;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private DomainDetail(Builder builder) {
            this.certName = builder.certName;
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.liveDomainType = builder.liveDomainType;
            this.region = builder.region;
            this.resourceGroupId = builder.resourceGroupId;
            this.SSLProtocol = builder.SSLProtocol;
            this.SSLPub = builder.SSLPub;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainDetail create() {
            return builder().build();
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return liveDomainType
         */
        public String getLiveDomainType() {
            return this.liveDomainType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return SSLProtocol
         */
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        /**
         * @return SSLPub
         */
        public String getSSLPub() {
            return this.SSLPub;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String certName; 
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String liveDomainType; 
            private String region; 
            private String resourceGroupId; 
            private String SSLProtocol; 
            private String SSLPub; 
            private String scope; 

            private Builder() {
            } 

            private Builder(DomainDetail model) {
                this.certName = model.certName;
                this.cname = model.cname;
                this.description = model.description;
                this.domainName = model.domainName;
                this.domainStatus = model.domainStatus;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.liveDomainType = model.liveDomainType;
                this.region = model.region;
                this.resourceGroupId = model.resourceGroupId;
                this.SSLProtocol = model.SSLProtocol;
                this.SSLPub = model.SSLPub;
                this.scope = model.scope;
            } 

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>liveCert****</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The CNAME that is assigned to the domain name. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name to the CNAME.</p>
             * <blockquote>
             * <p> A time-to-live (TTL) value is specified in the CNAME record of a domain name to indicate how long the CNAME record can be cached on the DNS resolver. If you modify the CNAME record of the domain name, the new settings take effect after the cache expires, which takes about 10 minutes. For more information, see <a href="https://help.aliyun.com/document_detail/362010.html">CNAME resolution</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>learn.developer.aliyundoc.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The description of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The streaming domain or ingest domain.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The domain name is enabled.</li>
             * <li><strong>offline</strong>: The domain name is disabled.</li>
             * <li><strong>configuring</strong>: The domain is being configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The time when the domain name was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-27T06:51:25Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the domain name was last modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-07T06:51Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>liveVideo</strong>: streaming domain</li>
             * <li><strong>liveEdge</strong>: ingest domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>liveVideo</p>
             */
            public Builder liveDomainType(String liveDomainType) {
                this.liveDomainType = liveDomainType;
                return this;
            }

            /**
             * <p>The ID of the region where the domain name resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2ogvt4nwmi7i</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the SSL certificate is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * <p>The public key of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>Public Key</p>
             */
            public Builder SSLPub(String SSLPub) {
                this.SSLPub = SSLPub;
                return this;
            }

            /**
             * <p>The acceleration region. Valid values:</p>
             * <ul>
             * <li><strong>domestic</strong>: regions in the Chinese mainland.</li>
             * <li><strong>overseas</strong>: regions outside the Chinese mainland.</li>
             * <li><strong>global</strong>: regions in and outside the Chinese mainland.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public DomainDetail build() {
                return new DomainDetail(this);
            } 

        } 

    }
}
