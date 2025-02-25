// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
 *
 * <p>GetOriginPoolResponseBody</p>
 */
public class GetOriginPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Origins")
    private java.util.List<Origins> origins;

    @com.aliyun.core.annotation.NameInMap("RecordName")
    private String recordName;

    @com.aliyun.core.annotation.NameInMap("ReferenceLBCount")
    private Integer referenceLBCount;

    @com.aliyun.core.annotation.NameInMap("References")
    private References references;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetOriginPoolResponseBody(Builder builder) {
        this.enabled = builder.enabled;
        this.id = builder.id;
        this.name = builder.name;
        this.origins = builder.origins;
        this.recordName = builder.recordName;
        this.referenceLBCount = builder.referenceLBCount;
        this.references = builder.references;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOriginPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return origins
     */
    public java.util.List<Origins> getOrigins() {
        return this.origins;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return referenceLBCount
     */
    public Integer getReferenceLBCount() {
        return this.referenceLBCount;
    }

    /**
     * @return references
     */
    public References getReferences() {
        return this.references;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private Boolean enabled; 
        private Long id; 
        private String name; 
        private java.util.List<Origins> origins; 
        private String recordName; 
        private Integer referenceLBCount; 
        private References references; 
        private String requestId; 
        private Long siteId; 

        /**
         * <p>Whether the origin pool is enabled:</p>
         * <ul>
         * <li>true: Enabled;</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Origin pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>103852052519****</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Name of the origin pool. The name is unique under a single site.</p>
         * 
         * <strong>example:</strong>
         * <p>pool1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Information about the origins added to the origin pool.</p>
         */
        public Builder origins(java.util.List<Origins> origins) {
            this.origins = origins;
            return this;
        }

        /**
         * <p>The domain name assigned to the origin pool, which can be used as the origin address for records under the site.</p>
         * 
         * <strong>example:</strong>
         * <p>pool1.example.com</p>
         */
        public Builder recordName(String recordName) {
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>The number of load balancers that reference this origin pool.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder referenceLBCount(Integer referenceLBCount) {
            this.referenceLBCount = referenceLBCount;
            return this;
        }

        /**
         * <p>Reference information for the origin pool. The origin pool is considered referenced when it is configured in a load balancer or set as the origin for a record.</p>
         */
        public Builder references(References references) {
            this.references = references;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ID of the site to which the origin pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>21655860979****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public GetOriginPoolResponseBody build() {
            return new GetOriginPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class AuthConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecretKey")
        private String secretKey;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AuthConf(Builder builder) {
            this.accessKey = builder.accessKey;
            this.authType = builder.authType;
            this.region = builder.region;
            this.secretKey = builder.secretKey;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConf create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String accessKey; 
            private String authType; 
            private String region; 
            private String secretKey; 
            private String version; 

            /**
             * <p>The AccessKey required when AuthType is set to private_cross_account or private.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI5tSpj224hDfLmXEx****</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The type of authentication:</p>
             * <ul>
             * <li>public: Public read/write, used when the origin is OSS or S3 and is publicly readable/writable;</li>
             * <li>private_same_account: Private same account, used when the origin is OSS and the authentication type is private within the same account;</li>
             * <li>private_cross_account: Private cross account, used when the origin is OSS and the authentication type is private across accounts;</li>
             * <li>private: Used when the origin is S3 and the authentication type is private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>public</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The source Region to be passed when the origin is AWS S3.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The SecretKey required when AuthType is set to private_cross_account or private.</p>
             * 
             * <strong>example:</strong>
             * <p>tzXL8ub4GtjkjZOJhS****</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The signature version required when the origin is an AWS S3.</p>
             * 
             * <strong>example:</strong>
             * <p>v4</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public AuthConf build() {
                return new AuthConf(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class Origins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AuthConf")
        private AuthConf authConf;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Header")
        private Object header;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Origins(Builder builder) {
            this.address = builder.address;
            this.authConf = builder.authConf;
            this.enabled = builder.enabled;
            this.header = builder.header;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Origins create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return authConf
         */
        public AuthConf getAuthConf() {
            return this.authConf;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return header
         */
        public Object getHeader() {
            return this.header;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String address; 
            private AuthConf authConf; 
            private Boolean enabled; 
            private Object header; 
            private Long id; 
            private String name; 
            private String type; 
            private Integer weight; 

            /**
             * <p>The address of the origin, e.g., <a href="http://www.example.com">www.example.com</a>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Authentication information. When the origin is an OSS or S3, and authentication is required, you need to provide the relevant configuration information.</p>
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>Whether the origin is enabled:</p>
             * <ul>
             * <li>true: Enabled;</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The request header to be included when fetching from the origin, only supports Host.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;Host&quot;: [
             *           &quot;example.com&quot;
             *         ]
             *       }</p>
             */
            public Builder header(Object header) {
                this.header = header;
                return this;
            }

            /**
             * <p>The ID of the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>99750209487****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>origin1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the origin:</p>
             * <ul>
             * <li>ip_domain: IP or domain type origin;</li>
             * <li>OSS: OSS address origin;</li>
             * <li>S3: AWS S3 origin.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip_domain</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight, an integer between 0 and 100.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Origins build() {
                return new Origins(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class DnsRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DnsRecords(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsRecords create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>Record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>104285288635****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Record name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DnsRecords build() {
                return new DnsRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class IPARecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IPARecords(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPARecords create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>记录ID。</p>
             * 
             * <strong>example:</strong>
             * <p>104285288635****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Record name.</p>
             * 
             * <strong>example:</strong>
             * <p>ipa.example.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IPARecords build() {
                return new IPARecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LoadBalancers(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * <p>ID of the load balancer.</p>
             * 
             * <strong>example:</strong>
             * <p>99874066052****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the load balancer.</p>
             * 
             * <strong>example:</strong>
             * <p>lb1.example.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOriginPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetOriginPoolResponseBody</p>
     */
    public static class References extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsRecords")
        private java.util.List<DnsRecords> dnsRecords;

        @com.aliyun.core.annotation.NameInMap("IPARecords")
        private java.util.List<IPARecords> IPARecords;

        @com.aliyun.core.annotation.NameInMap("LoadBalancers")
        private java.util.List<LoadBalancers> loadBalancers;

        private References(Builder builder) {
            this.dnsRecords = builder.dnsRecords;
            this.IPARecords = builder.IPARecords;
            this.loadBalancers = builder.loadBalancers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static References create() {
            return builder().build();
        }

        /**
         * @return dnsRecords
         */
        public java.util.List<DnsRecords> getDnsRecords() {
            return this.dnsRecords;
        }

        /**
         * @return IPARecords
         */
        public java.util.List<IPARecords> getIPARecords() {
            return this.IPARecords;
        }

        /**
         * @return loadBalancers
         */
        public java.util.List<LoadBalancers> getLoadBalancers() {
            return this.loadBalancers;
        }

        public static final class Builder {
            private java.util.List<DnsRecords> dnsRecords; 
            private java.util.List<IPARecords> IPARecords; 
            private java.util.List<LoadBalancers> loadBalancers; 

            /**
             * <p>List of layer 7 records using this origin pool as the origin.</p>
             */
            public Builder dnsRecords(java.util.List<DnsRecords> dnsRecords) {
                this.dnsRecords = dnsRecords;
                return this;
            }

            /**
             * <p>List of layer 4 records using this origin pool as the origin.</p>
             */
            public Builder IPARecords(java.util.List<IPARecords> IPARecords) {
                this.IPARecords = IPARecords;
                return this;
            }

            /**
             * <p>List of load balancers using this origin pool.</p>
             */
            public Builder loadBalancers(java.util.List<LoadBalancers> loadBalancers) {
                this.loadBalancers = loadBalancers;
                return this;
            }

            public References build() {
                return new References(this);
            } 

        } 

    }
}
