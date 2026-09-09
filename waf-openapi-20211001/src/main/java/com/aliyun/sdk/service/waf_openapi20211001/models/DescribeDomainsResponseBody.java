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
 * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsResponseBody</p>
 */
public class DescribeDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
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
        private java.util.List<Domains> domains; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDomainsResponseBody model) {
            this.domains = model.domains;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of domain names.</p>
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABF68BB3-2C48-5FA4-9750-D5FE55700E36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of domain name configurations returned.</p>
         * 
         * <strong>example:</strong>
         * <p>146</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainsResponseBody build() {
            return new DescribeDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class Http extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backend")
        private String backend;

        private Http(Builder builder) {
            this.backend = builder.backend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Http create() {
            return builder().build();
        }

        /**
         * @return backend
         */
        public String getBackend() {
            return this.backend;
        }

        public static final class Builder {
            private String backend; 

            private Builder() {
            } 

            private Builder(Http model) {
                this.backend = model.backend;
            } 

            /**
             * <p>The origin address for the HTTP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
             */
            public Builder backend(String backend) {
                this.backend = backend;
                return this;
            }

            public Http build() {
                return new Http(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class Https extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backend")
        private String backend;

        private Https(Builder builder) {
            this.backend = builder.backend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Https create() {
            return builder().build();
        }

        /**
         * @return backend
         */
        public String getBackend() {
            return this.backend;
        }

        public static final class Builder {
            private String backend; 

            private Builder() {
            } 

            private Builder(Https model) {
                this.backend = model.backend;
            } 

            /**
             * <p>The origin address for the HTTPS protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
             */
            public Builder backend(String backend) {
                this.backend = backend;
                return this;
            }

            public Https build() {
                return new Https(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class Backeds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Http")
        private java.util.List<Http> http;

        @com.aliyun.core.annotation.NameInMap("Https")
        private java.util.List<Https> https;

        private Backeds(Builder builder) {
            this.http = builder.http;
            this.https = builder.https;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backeds create() {
            return builder().build();
        }

        /**
         * @return http
         */
        public java.util.List<Http> getHttp() {
            return this.http;
        }

        /**
         * @return https
         */
        public java.util.List<Https> getHttps() {
            return this.https;
        }

        public static final class Builder {
            private java.util.List<Http> http; 
            private java.util.List<Https> https; 

            private Builder() {
            } 

            private Builder(Backeds model) {
                this.http = model.http;
                this.https = model.https;
            } 

            /**
             * <p>The list of origin addresses for the HTTP protocol.</p>
             */
            public Builder http(java.util.List<Http> http) {
                this.http = http;
                return this;
            }

            /**
             * <p>The list of origin addresses for the HTTPS protocol.</p>
             */
            public Builder https(java.util.List<Https> https) {
                this.https = https;
                return this;
            }

            public Backeds build() {
                return new Backeds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class ListenPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Http")
        private java.util.List<Long> http;

        @com.aliyun.core.annotation.NameInMap("Https")
        private java.util.List<Long> https;

        private ListenPorts(Builder builder) {
            this.http = builder.http;
            this.https = builder.https;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListenPorts create() {
            return builder().build();
        }

        /**
         * @return http
         */
        public java.util.List<Long> getHttp() {
            return this.http;
        }

        /**
         * @return https
         */
        public java.util.List<Long> getHttps() {
            return this.https;
        }

        public static final class Builder {
            private java.util.List<Long> http; 
            private java.util.List<Long> https; 

            private Builder() {
            } 

            private Builder(ListenPorts model) {
                this.http = model.http;
                this.https = model.https;
            } 

            /**
             * <p>The list of listening ports for the HTTP protocol.</p>
             */
            public Builder http(java.util.List<Long> http) {
                this.http = http;
                return this;
            }

            /**
             * <p>The list of listening ports for the HTTPS protocol.</p>
             */
            public Builder https(java.util.List<Long> https) {
                this.https = https;
                return this;
            }

            public ListenPorts build() {
                return new ListenPorts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backeds")
        private Backeds backeds;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("ListenPorts")
        private ListenPorts listenPorts;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Domains(Builder builder) {
            this.backeds = builder.backeds;
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.domainId = builder.domainId;
            this.listenPorts = builder.listenPorts;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return backeds
         */
        public Backeds getBackeds() {
            return this.backeds;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return listenPorts
         */
        public ListenPorts getListenPorts() {
            return this.listenPorts;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Backeds backeds; 
            private String cname; 
            private String domain; 
            private String domainId; 
            private ListenPorts listenPorts; 
            private String resourceManagerResourceGroupId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.backeds = model.backeds;
                this.cname = model.cname;
                this.domain = model.domain;
                this.domainId = model.domainId;
                this.listenPorts = model.listenPorts;
                this.resourceManagerResourceGroupId = model.resourceManagerResourceGroupId;
                this.status = model.status;
            } 

            /**
             * <p>The back-to-origin configuration.</p>
             */
            public Builder backeds(Backeds backeds) {
                this.backeds = backeds;
                return this;
            }

            /**
             * <p>The canonical name (CNAME) that is assigned to the domain name by WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxcvdaf.****.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The domain name that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com-waf">www.aliyundoc.com-waf</a></p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The listener configuration.</p>
             */
            public Builder listenPorts(ListenPorts listenPorts) {
                this.listenPorts = listenPorts;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmvtc5z52****</p>
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: The domain name is in a normal state.</p>
             * </li>
             * <li><p><strong>2</strong>: The domain name is being created.</p>
             * </li>
             * <li><p><strong>3</strong>: The domain name is being modified.</p>
             * </li>
             * <li><p><strong>4</strong>: The domain name is being released.</p>
             * </li>
             * <li><p><strong>5</strong>: Forwarding is disabled for the domain name.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
