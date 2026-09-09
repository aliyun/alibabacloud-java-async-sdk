// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainDetailResponseBody</p>
 */
public class DescribeVsDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfig")
    private DomainConfig domainConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsDomainDetailResponseBody(Builder builder) {
        this.domainConfig = builder.domainConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainConfig
     */
    public DomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainConfig domainConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVsDomainDetailResponseBody model) {
            this.domainConfig = model.domainConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Domain configuration details.</p>
         */
        public Builder domainConfig(DomainConfig domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9BEC5E85-C76B-56EF-A922-860EFDB8B64B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsDomainDetailResponseBody build() {
            return new DescribeVsDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainDetailResponseBody</p>
     */
    public static class DomainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SSLProtocol")
        private String SSLProtocol;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private DomainConfig(Builder builder) {
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.domainType = builder.domainType;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.region = builder.region;
            this.SSLProtocol = builder.SSLProtocol;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfig create() {
            return builder().build();
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
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return SSLProtocol
         */
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String domainType; 
            private String gmtCreated; 
            private String gmtModified; 
            private String region; 
            private String SSLProtocol; 
            private String scope; 

            private Builder() {
            } 

            private Builder(DomainConfig model) {
                this.cname = model.cname;
                this.description = model.description;
                this.domainName = model.domainName;
                this.domainStatus = model.domainStatus;
                this.domainType = model.domainType;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.region = model.region;
                this.SSLProtocol = model.SSLProtocol;
                this.scope = model.scope;
            } 

            /**
             * <p>The CNAME assigned to the Visual Edge Computing Service domain. You must configure your DNS provider to point your domain to this CNAME.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com.*****.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The domain description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试使用</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Visual Edge Computing Service domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the Visual Edge Computing Service accelerated domain. Valid values:</p>
             * <ul>
             * <li><p><strong>online</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>offline</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>configuring</strong>: Being configured.</p>
             * </li>
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
             * <p>The domain type.</p>
             * <blockquote>
             * <p>Static value: vs</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vs</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-19T10:27:23Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The most recent modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-19T10:27:23Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The region where the domain is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>on</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>off</strong> (default): Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder SSLProtocol(String SSLProtocol) {
                this.SSLProtocol = SSLProtocol;
                return this;
            }

            /**
             * <p>The acceleration region. Valid values:</p>
             * <ul>
             * <li><p><strong>domestic</strong></p>
             * </li>
             * <li><p><strong>overseas</strong></p>
             * </li>
             * <li><p><strong>global</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public DomainConfig build() {
                return new DomainConfig(this);
            } 

        } 

    }
}
