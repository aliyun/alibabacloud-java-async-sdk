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
 * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOriginPoolsResponseBody</p>
 */
public class ListOriginPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OriginPools")
    private java.util.List<OriginPools> originPools;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListOriginPoolsResponseBody(Builder builder) {
        this.originPools = builder.originPools;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOriginPoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return originPools
     */
    public java.util.List<OriginPools> getOriginPools() {
        return this.originPools;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<OriginPools> originPools; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        /**
         * OriginPools.
         */
        public Builder originPools(java.util.List<OriginPools> originPools) {
            this.originPools = originPools;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListOriginPoolsResponseBody build() {
            return new ListOriginPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * Version.
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
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AuthConf.
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Header.
             */
            public Builder header(Object header) {
                this.header = header;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
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
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
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
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
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
             * DnsRecords.
             */
            public Builder dnsRecords(java.util.List<DnsRecords> dnsRecords) {
                this.dnsRecords = dnsRecords;
                return this;
            }

            /**
             * IPARecords.
             */
            public Builder IPARecords(java.util.List<IPARecords> IPARecords) {
                this.IPARecords = IPARecords;
                return this;
            }

            /**
             * LoadBalancers.
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
    /**
     * 
     * {@link ListOriginPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOriginPoolsResponseBody</p>
     */
    public static class OriginPools extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        private OriginPools(Builder builder) {
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.name = builder.name;
            this.origins = builder.origins;
            this.recordName = builder.recordName;
            this.referenceLBCount = builder.referenceLBCount;
            this.references = builder.references;
            this.siteId = builder.siteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginPools create() {
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
            private Long siteId; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Origins.
             */
            public Builder origins(java.util.List<Origins> origins) {
                this.origins = origins;
                return this;
            }

            /**
             * RecordName.
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * ReferenceLBCount.
             */
            public Builder referenceLBCount(Integer referenceLBCount) {
                this.referenceLBCount = referenceLBCount;
                return this;
            }

            /**
             * References.
             */
            public Builder references(References references) {
                this.references = references;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            public OriginPools build() {
                return new OriginPools(this);
            } 

        } 

    }
}
