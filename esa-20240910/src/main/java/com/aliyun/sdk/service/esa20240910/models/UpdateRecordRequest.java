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
 * {@link UpdateRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecordRequest</p>
 */
public class UpdateRecordRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HttpPorts")
    private String httpPorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPorts")
    private String httpsPorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proxied")
    private Boolean proxied;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateRecordRequest(Builder builder) {
        super(builder);
        this.authConf = builder.authConf;
        this.bizName = builder.bizName;
        this.comment = builder.comment;
        this.data = builder.data;
        this.hostPolicy = builder.hostPolicy;
        this.httpPorts = builder.httpPorts;
        this.httpsPorts = builder.httpsPorts;
        this.proxied = builder.proxied;
        this.recordId = builder.recordId;
        this.sourceType = builder.sourceType;
        this.ttl = builder.ttl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordRequest create() {
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
     * @return httpPorts
     */
    public String getHttpPorts() {
        return this.httpPorts;
    }

    /**
     * @return httpsPorts
     */
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    /**
     * @return proxied
     */
    public Boolean getProxied() {
        return this.proxied;
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
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

    public static final class Builder extends Request.Builder<UpdateRecordRequest, Builder> {
        private AuthConf authConf; 
        private String bizName; 
        private String comment; 
        private Data data; 
        private String hostPolicy; 
        private String httpPorts; 
        private String httpsPorts; 
        private Boolean proxied; 
        private Long recordId; 
        private String sourceType; 
        private Integer ttl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecordRequest request) {
            super(request);
            this.authConf = request.authConf;
            this.bizName = request.bizName;
            this.comment = request.comment;
            this.data = request.data;
            this.hostPolicy = request.hostPolicy;
            this.httpPorts = request.httpPorts;
            this.httpsPorts = request.httpsPorts;
            this.proxied = request.proxied;
            this.recordId = request.recordId;
            this.sourceType = request.sourceType;
            this.ttl = request.ttl;
            this.type = request.type;
        } 

        /**
         * <p>The origin authentication information of the CNAME record.</p>
         */
        public Builder authConf(AuthConf authConf) {
            String authConfShrink = shrink(authConf, "AuthConf", "json");
            this.putQueryParameter("AuthConf", authConfShrink);
            this.authConf = authConf;
            return this;
        }

        /**
         * <p>The business scenario for record acceleration. This parameter is not required for records without acceleration enabled. Valid values:</p>
         * <ul>
         * <li><strong>video_image</strong>: video and image.</li>
         * <li><strong>api</strong>: API.</li>
         * <li><strong>web</strong>: web page.</li>
         * </ul>
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
         * <p>The comment for the record.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a remark.</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The DNS information of the record. The content varies depending on the record type. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">documentation</a>.</p>
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
         * <p>The back-to-origin HOST policy. This parameter takes effect when the record type is CNAME. Settings the HOST policy for back-to-origin requests. Valid values:</p>
         * <ul>
         * <li><strong>follow_hostname</strong>: follows the host record.</li>
         * <li><strong>follow_origin_domain</strong>: follows the Origin Domain Name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin_domain</p>
         */
        public Builder hostPolicy(String hostPolicy) {
            this.putQueryParameter("HostPolicy", hostPolicy);
            this.hostPolicy = hostPolicy;
            return this;
        }

        /**
         * HttpPorts.
         */
        public Builder httpPorts(String httpPorts) {
            this.putQueryParameter("HttpPorts", httpPorts);
            this.httpPorts = httpPorts;
            return this;
        }

        /**
         * HttpsPorts.
         */
        public Builder httpsPorts(String httpsPorts) {
            this.putQueryParameter("HttpsPorts", httpsPorts);
            this.httpsPorts = httpsPorts;
            return this;
        }

        /**
         * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME records and A/AAAA records support proxy acceleration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enable proxy acceleration.</li>
         * <li><strong>false</strong>: Disable proxy acceleration.</li>
         * </ul>
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
         * <p>The ID of the record. You can call <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> to obtain the record ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        /**
         * <p>The origin server type of the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin server.</li>
         * <li><strong>S3</strong>: S3 origin server.</li>
         * <li><strong>LB</strong>: load balancing origin server.</li>
         * <li><strong>OP</strong>: IPAM pool origin server.</li>
         * <li><strong>Domain</strong>: standard domain name origin server.</li>
         * </ul>
         * <p>If this parameter is not specified or is left empty, the default value is Domain, which indicates a standard domain name origin server type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The time-to-live (TTL) of the record, in seconds. Valid values: <strong>30 to 86400</strong>, or 1. A value of 1 indicates that the TTL of the record is automatically determined.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>The DNS type of the record, such as A/AAAA, CNAME, or TXT.</p>
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
        public UpdateRecordRequest build() {
            return new UpdateRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateRecordRequest</p>
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
             * <p>The AccessKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin authentication type is private cross-account read, or when the origin server type is S3 and the origin authentication type is private read.</p>
             * 
             * <strong>example:</strong>
             * <p>VIxuvJSA2S03f******kp208dy5w7</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The origin authentication type. Different origin server types support different authentication types. The origin server type refers to the SourceType parameter in this operation. When the origin server type is OSS or S3, you must specify the origin authentication type. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: public read. Select this value when the origin server type is OSS or S3 and the origin server allows public read access.</li>
             * <li><strong>private</strong>: private read. Select this value when the origin server type is S3 and the origin server allows only private read access.</li>
             * <li><strong>private_same_account</strong>: private same-account read. Select this value when the origin server type is OSS, the origin server is under the same Alibaba Cloud account, and the origin server allows only private read access.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>The signature algorithm version. This parameter is required when the origin server type is S3 and the origin authentication type is private read. Valid values:</p>
             * <ul>
             * <li><p><strong>v2</strong></p>
             * </li>
             * <li><p><strong>v4</strong></p>
             * </li>
             * </ul>
             * <p>Default value: v4.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The SecretKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin authentication type is private cross-account read, or when the origin server type is S3 and the origin authentication type is private read.</p>
             * 
             * <strong>example:</strong>
             * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The region to which the origin server belongs. This parameter is required when the origin server type is S3. Obtain the region from the official S3 website.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
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
     * {@link UpdateRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateRecordRequest</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.algorithm = model.algorithm;
                this.certificate = model.certificate;
                this.fingerprint = model.fingerprint;
                this.flag = model.flag;
                this.keyTag = model.keyTag;
                this.matchingType = model.matchingType;
                this.port = model.port;
                this.priority = model.priority;
                this.selector = model.selector;
                this.tag = model.tag;
                this.type = model.type;
                this.usage = model.usage;
                this.value = model.value;
                this.weight = model.weight;
            } 

            /**
             * <p>The encryption algorithm used by the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add CERT or SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The public key certificate information of the record. This parameter is required when you add CERT, SMIMEA, or TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>dGVzdGFkYWxrcw==</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>The public key fingerprint value of the record. This parameter is required when you add SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef1234567890</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The flag of the record. The Flag of a CAA record indicates its priority and processing method. Valid values: <strong>0 to 255</strong>. This parameter is required when you add CAA records.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The public key identifier of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add CERT records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * <p>The algorithm policy used by the record for matching or verifying certificates. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * <p>The port of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add SRV records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, or URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of certificate or public key used by the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The tag of the record. The Tag of a CAA record indicates its specific type and purpose. This parameter is required when you add CAA records.</p>
             * 
             * <strong>example:</strong>
             * <p>issue</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The certificate type of the record (for CERT records) or the public key type (for SSHFP records). This parameter is required when you add CERT or SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage identifier of the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>The record value or partial content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI records. The meaning varies depending on the record type:</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: The IP address to which the record points. Separate multiple IP addresses with commas (,). At least one IPv4 address is required.</li>
             * <li><strong>CNAME</strong>: The target domain name to which the record points.</li>
             * <li><strong>NS</strong>: The name server for the specified domain name.</li>
             * <li><strong>MX</strong>: A valid target mail server domain name.</li>
             * <li><strong>TXT</strong>: A valid text string.</li>
             * <li><strong>CAA</strong>: A valid certification authority domain name.</li>
             * <li><strong>SRV</strong>: A valid target host domain name.</li>
             * <li><strong>URI</strong>: A valid URI string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The weight of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add SRV or URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
