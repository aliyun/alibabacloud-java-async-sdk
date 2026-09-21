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
 * {@link CreateOriginPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateOriginPoolRequest</p>
 */
public class CreateOriginPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origins")
    private java.util.List<Origins> origins;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private CreateOriginPoolRequest(Builder builder) {
        super(builder);
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.origins = builder.origins;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOriginPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateOriginPoolRequest, Builder> {
        private Boolean enabled; 
        private String name; 
        private java.util.List<Origins> origins; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOriginPoolRequest request) {
            super(request);
            this.enabled = request.enabled;
            this.name = request.name;
            this.origins = request.origins;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Specifies whether the origin pool is enabled.</p>
         * <ul>
         * <li><p><code>true</code>: enabled</p>
         * </li>
         * <li><p><code>false</code>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The name of the origin pool. The name must be unique within a site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pool1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of origins to add to the origin pool. Use an array to specify multiple origins.</p>
         */
        public Builder origins(java.util.List<Origins> origins) {
            String originsShrink = shrink(origins, "Origins", "json");
            this.putQueryParameter("Origins", originsShrink);
            this.origins = origins;
            return this;
        }

        /**
         * <p>The site ID. To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21655860979****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public CreateOriginPoolRequest build() {
            return new CreateOriginPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOriginPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateOriginPoolRequest</p>
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

            private Builder() {
            } 

            private Builder(AuthConf model) {
                this.accessKey = model.accessKey;
                this.authType = model.authType;
                this.region = model.region;
                this.secretKey = model.secretKey;
                this.version = model.version;
            } 

            /**
             * <p>The access key required for private authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAccessKeyID</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The authentication type. Valid values:</p>
             * <ul>
             * <li><p><code>public</code>: Public read/write. Use this for public OSS or AWS S3 buckets.</p>
             * </li>
             * <li><p><code>private_same_account</code>: Private authentication for an OSS bucket in the same Alibaba Cloud account.</p>
             * </li>
             * <li><p><code>private_cross_account</code>: Private authentication for an OSS bucket in a different Alibaba Cloud account.</p>
             * </li>
             * <li><p><code>private</code>: Private authentication for an AWS S3 bucket.</p>
             * </li>
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
             * <p>The region of the origin. Required for AWS S3 origins.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The secret key required for private authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>yourAccessKeySecret</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The signature version. Required for AWS S3 origins.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
     * {@link CreateOriginPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateOriginPoolRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("IpVersionPolicy")
        private String ipVersionPolicy;

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
            this.ipVersionPolicy = builder.ipVersionPolicy;
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
         * @return ipVersionPolicy
         */
        public String getIpVersionPolicy() {
            return this.ipVersionPolicy;
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
            private String ipVersionPolicy; 
            private String name; 
            private String type; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Origins model) {
                this.address = model.address;
                this.authConf = model.authConf;
                this.enabled = model.enabled;
                this.header = model.header;
                this.ipVersionPolicy = model.ipVersionPolicy;
                this.name = model.name;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The address of the origin. For example, www\.example.com.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The authentication configuration for the origin. Required if the origin is an OSS or AWS S3 bucket that requires authentication.</p>
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>Specifies whether the origin is enabled.</p>
             * <ul>
             * <li><p><code>true</code>: enabled</p>
             * </li>
             * <li><p><code>false</code>: disabled</p>
             * </li>
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
             * <p>The request header to include in back-to-origin requests. Only the <code>Host</code> header is supported.</p>
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
             * <p>The IP protocol version for back-to-origin requests. Valid values:</p>
             * <ul>
             * <li><p><code>round_robin</code>: Default. Randomly selects an IPv4 or IPv6 origin.</p>
             * </li>
             * <li><p><code>ipv4_first</code>: Prioritizes IPv4 origins.</p>
             * </li>
             * <li><p><code>ipv6_first</code>: Prioritizes IPv6 origins.</p>
             * </li>
             * <li><p><code>follow</code>: Uses the same IP protocol version as the client\&quot;s request.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>round_robin</p>
             */
            public Builder ipVersionPolicy(String ipVersionPolicy) {
                this.ipVersionPolicy = ipVersionPolicy;
                return this;
            }

            /**
             * <p>The name of the origin. The name must be unique within the origin pool.</p>
             * 
             * <strong>example:</strong>
             * <p>origin1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the origin. Valid values:</p>
             * <ul>
             * <li><p><code>ip_domain</code>: An IP address or a domain name.</p>
             * </li>
             * <li><p><code>OSS</code>: An Alibaba Cloud OSS bucket.</p>
             * </li>
             * <li><p><code>S3</code>: An AWS S3 bucket.</p>
             * </li>
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
             * <p>The weight of the origin. The value must be an integer from 0 to 100.</p>
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
}
