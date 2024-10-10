// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRecordRequest} extends {@link RequestModel}
 *
 * <p>CreateRecordRequest</p>
 */
public class CreateRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthConf")
    private AuthConf authConf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizName")
    private String bizName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Data data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostPolicy")
    private String hostPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proxied")
    private Boolean proxied;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateRecordRequest(Builder builder) {
        super(builder);
        this.authConf = builder.authConf;
        this.bizName = builder.bizName;
        this.comment = builder.comment;
        this.data = builder.data;
        this.hostPolicy = builder.hostPolicy;
        this.proxied = builder.proxied;
        this.recordName = builder.recordName;
        this.siteId = builder.siteId;
        this.sourceType = builder.sourceType;
        this.ttl = builder.ttl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConf
     */
    public AuthConf getAuthConf() {
        return this.authConf;
    }

    /**
     * @return bizName
     */
    public String getBizName() {
        return this.bizName;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return hostPolicy
     */
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    /**
     * @return proxied
     */
    public Boolean getProxied() {
        return this.proxied;
    }

    /**
     * @return recordName
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRecordRequest, Builder> {
        private AuthConf authConf; 
        private String bizName; 
        private String comment; 
        private Data data; 
        private String hostPolicy; 
        private Boolean proxied; 
        private String recordName; 
        private Long siteId; 
        private String sourceType; 
        private Integer ttl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecordRequest request) {
            super(request);
            this.authConf = request.authConf;
            this.bizName = request.bizName;
            this.comment = request.comment;
            this.data = request.data;
            this.hostPolicy = request.hostPolicy;
            this.proxied = request.proxied;
            this.recordName = request.recordName;
            this.siteId = request.siteId;
            this.sourceType = request.sourceType;
            this.ttl = request.ttl;
            this.type = request.type;
        } 

        /**
         * AuthConf.
         */
        public Builder authConf(AuthConf authConf) {
            String authConfShrink = shrink(authConf, "AuthConf", "json");
            this.putQueryParameter("AuthConf", authConfShrink);
            this.authConf = authConf;
            return this;
        }

        /**
         * <p>业务场景</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder bizName(String bizName) {
            this.putQueryParameter("BizName", bizName);
            this.bizName = bizName;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;value&quot;:&quot;2.2.2.2&quot;
         * }</p>
         */
        public Builder data(Data data) {
            String dataShrink = shrink(data, "Data", "json");
            this.putQueryParameter("Data", dataShrink);
            this.data = data;
            return this;
        }

        /**
         * HostPolicy.
         */
        public Builder hostPolicy(String hostPolicy) {
            this.putQueryParameter("HostPolicy", hostPolicy);
            this.hostPolicy = hostPolicy;
            return this;
        }

        /**
         * <p>是否代理加速</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder proxied(Boolean proxied) {
            this.putQueryParameter("Proxied", proxied);
            this.proxied = proxied;
            return this;
        }

        /**
         * <p>记录名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder recordName(String recordName) {
            this.putQueryParameter("RecordName", recordName);
            this.recordName = recordName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>记录类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRecordRequest build() {
            return new CreateRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRecordRequest} extends {@link TeaModel}
     *
     * <p>CreateRecordRequest</p>
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
     * {@link CreateRecordRequest} extends {@link TeaModel}
     *
     * <p>CreateRecordRequest</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private Integer algorithm;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("Fingerprint")
        private String fingerprint;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private Integer flag;

        @com.aliyun.core.annotation.NameInMap("KeyTag")
        private Integer keyTag;

        @com.aliyun.core.annotation.NameInMap("MatchingType")
        private Integer matchingType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private Integer selector;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Integer usage;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private Data(Builder builder) {
            this.algorithm = builder.algorithm;
            this.certificate = builder.certificate;
            this.fingerprint = builder.fingerprint;
            this.flag = builder.flag;
            this.keyTag = builder.keyTag;
            this.matchingType = builder.matchingType;
            this.port = builder.port;
            this.priority = builder.priority;
            this.selector = builder.selector;
            this.tag = builder.tag;
            this.type = builder.type;
            this.usage = builder.usage;
            this.value = builder.value;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return fingerprint
         */
        public String getFingerprint() {
            return this.fingerprint;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
        }

        /**
         * @return keyTag
         */
        public Integer getKeyTag() {
            return this.keyTag;
        }

        /**
         * @return matchingType
         */
        public Integer getMatchingType() {
            return this.matchingType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return selector
         */
        public Integer getSelector() {
            return this.selector;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return usage
         */
        public Integer getUsage() {
            return this.usage;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer algorithm; 
            private String certificate; 
            private String fingerprint; 
            private Integer flag; 
            private Integer keyTag; 
            private Integer matchingType; 
            private Integer port; 
            private Integer priority; 
            private Integer selector; 
            private String tag; 
            private Integer type; 
            private Integer usage; 
            private String value; 
            private Integer weight; 

            /**
             * Algorithm.
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * Fingerprint.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * Flag.
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * KeyTag.
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * MatchingType.
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Selector.
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>记录类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>A/AAAA</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
