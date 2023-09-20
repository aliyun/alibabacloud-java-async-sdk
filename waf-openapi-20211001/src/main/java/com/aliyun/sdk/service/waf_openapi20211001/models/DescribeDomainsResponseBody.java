// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsResponseBody</p>
 */
public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
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
        private java.util.List < Domains> domains; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The domain names that are added to WAF in CNAME record mode.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * RequestId.
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

        public DescribeDomainsResponseBody build() {
            return new DescribeDomainsResponseBody(this);
        } 

    } 

    public static class Http extends TeaModel {
        @NameInMap("Backend")
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

            /**
             * The HTTP address of the origin server.
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
    public static class Https extends TeaModel {
        @NameInMap("Backend")
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

            /**
             * The HTTPS address of the origin server.
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
    public static class Backeds extends TeaModel {
        @NameInMap("Http")
        private java.util.List < Http> http;

        @NameInMap("Https")
        private java.util.List < Https> https;

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
        public java.util.List < Http> getHttp() {
            return this.http;
        }

        /**
         * @return https
         */
        public java.util.List < Https> getHttps() {
            return this.https;
        }

        public static final class Builder {
            private java.util.List < Http> http; 
            private java.util.List < Https> https; 

            /**
             * The HTTP addresses of the origin server.
             */
            public Builder http(java.util.List < Http> http) {
                this.http = http;
                return this;
            }

            /**
             * The HTTPS addresses of the origin server.
             */
            public Builder https(java.util.List < Https> https) {
                this.https = https;
                return this;
            }

            public Backeds build() {
                return new Backeds(this);
            } 

        } 

    }
    public static class ListenPorts extends TeaModel {
        @NameInMap("Http")
        private java.util.List < Long > http;

        @NameInMap("Https")
        private java.util.List < Long > https;

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
        public java.util.List < Long > getHttp() {
            return this.http;
        }

        /**
         * @return https
         */
        public java.util.List < Long > getHttps() {
            return this.https;
        }

        public static final class Builder {
            private java.util.List < Long > http; 
            private java.util.List < Long > https; 

            /**
             * The HTTP listener ports.
             */
            public Builder http(java.util.List < Long > http) {
                this.http = http;
                return this;
            }

            /**
             * The HTTPS listener ports.
             */
            public Builder https(java.util.List < Long > https) {
                this.https = https;
                return this;
            }

            public ListenPorts build() {
                return new ListenPorts(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @NameInMap("Backeds")
        private Backeds backeds;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("ListenPorts")
        private ListenPorts listenPorts;

        @NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @NameInMap("Status")
        private Integer status;

        private Domains(Builder builder) {
            this.backeds = builder.backeds;
            this.cname = builder.cname;
            this.domain = builder.domain;
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
            private ListenPorts listenPorts; 
            private String resourceManagerResourceGroupId; 
            private Integer status; 

            /**
             * The back-to-origin settings.
             */
            public Builder backeds(Backeds backeds) {
                this.backeds = backeds;
                return this;
            }

            /**
             * The CNAME assigned by WAF to the domain name.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The domain name that is added to WAF in CNAME record mode.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The configurations of the listeners.
             */
            public Builder listenPorts(ListenPorts listenPorts) {
                this.listenPorts = listenPorts;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The status of the domain name. Valid values:
             * <p>
             * 
             * *   **1:** The domain name is in a normal state.
             * *   **2:** The domain name is being created.
             * *   **3:** The domain name is being modified.
             * *   **4:** The domain name is being released.
             * *   **5:** WAF no longer forwards traffic that is sent to the domain name.
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
