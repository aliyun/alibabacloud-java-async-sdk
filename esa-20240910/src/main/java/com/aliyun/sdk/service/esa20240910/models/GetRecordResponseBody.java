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
 * {@link GetRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecordResponseBody</p>
 */
public class GetRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordModel")
    private RecordModel recordModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRecordResponseBody(Builder builder) {
        this.recordModel = builder.recordModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordModel
     */
    public RecordModel getRecordModel() {
        return this.recordModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordModel recordModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRecordResponseBody model) {
            this.recordModel = model.recordModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the queried record.</p>
         */
        public Builder recordModel(RecordModel recordModel) {
            this.recordModel = recordModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRecordResponseBody build() {
            return new GetRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecordResponseBody</p>
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
             * <p>The AccessKey of the account to which the origin belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>VIxuvJSA2S03f******kp208dy5w7</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The origin authentication type. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: public read. Select this value when the origin type is OSS or S3 and the origin has public read access.</li>
             * <li><strong>private</strong>: private read. Select this value when the origin type is S3 and the origin has private read access.</li>
             * <li><strong>private_same_account</strong>: private read within the same account. Select this value when the origin type is OSS, the origin is under the same Alibaba Cloud account, and the origin has private read access.</li>
             * <li><strong>private_cross_account</strong>: private read across accounts. Select this value when the origin type is OSS, the origin is under a different Alibaba Cloud account, and the origin has private read access.</li>
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
             * <p>The region of the origin. Obtain the region from the official S3 website.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The AccessKey of the account to which the origin belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The signature algorithm version. Valid values:</p>
             * <ul>
             * <li><strong>v2</strong></li>
             * <li><strong>v4</strong></li>
             * </ul>
             * <p>Default value: v4.</p>
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
     * {@link GetRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecordResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

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
            this.tags = builder.tags;
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
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
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
            private java.util.Map<String, ?> tags; 
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
                this.tags = model.tags;
                this.type = model.type;
                this.usage = model.usage;
                this.value = model.value;
                this.weight = model.weight;
            } 

            /**
             * <p>The encryption algorithm used by the record. Valid values: <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The public key certificate information of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>dGVzdGFkYWxrcw==</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>The public key fingerprint value of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef1234567890</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The flag of the record. The Flag of a CAA record indicates its priority and processing method. Valid values: <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The public key identifier of the record. Valid values: <strong>0 to 65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * <p>The algorithm policy used by the record for matching or verifying certificates. Valid values: <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * <p>The port of the record. Valid values: <strong>0 to 65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>8707</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: <strong>0 to 65535</strong>. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of certificate or public key used by the record. Valid values: <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The tag of the record. The Tag of a CAA record indicates its specific type and purpose.</p>
             * 
             * <strong>example:</strong>
             * <p>issue</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The tags of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;test\&quot;: \&quot;test val1\&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The certificate type of the record (in CERT records) or the public key type (in SSHFP records).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage identifier of the record. Valid values: <strong>0 to 255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>The record value or partial content. The meaning varies by record type:</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: the IP address that the record points to. Separate multiple IP addresses with commas (,). At least one IPv4 address is required.</li>
             * <li><strong>CNAME</strong>: the target domain name that the record points to.</li>
             * <li><strong>NS</strong>: the name server for the specified domain name.</li>
             * <li><strong>MX</strong>: the valid target mail server domain name.</li>
             * <li><strong>TXT</strong>: a valid text string.</li>
             * <li><strong>CAA</strong>: a valid certification authority domain name.</li>
             * <li><strong>SRV</strong>: a valid target host domain name.</li>
             * <li><strong>URI</strong>: a valid URI string.</li>
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
             * <p>The weight of the record. Valid values: <strong>0 to 65535</strong>.</p>
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
    /**
     * 
     * {@link GetRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecordResponseBody</p>
     */
    public static class RecordModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConf")
        private AuthConf authConf;

        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomPort")
        private String customPort;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("HostPolicy")
        private String hostPolicy;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("Proxied")
        private Boolean proxied;

        @com.aliyun.core.annotation.NameInMap("RecordCname")
        private String recordCname;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RecordSourceType")
        private String recordSourceType;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private RecordModel(Builder builder) {
            this.authConf = builder.authConf;
            this.bizName = builder.bizName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.customPort = builder.customPort;
            this.data = builder.data;
            this.hostPolicy = builder.hostPolicy;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.proxied = builder.proxied;
            this.recordCname = builder.recordCname;
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.recordSourceType = builder.recordSourceType;
            this.recordType = builder.recordType;
            this.siteId = builder.siteId;
            this.siteName = builder.siteName;
            this.ttl = builder.ttl;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordModel create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customPort
         */
        public String getCustomPort() {
            return this.customPort;
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
         * @return recordCname
         */
        public String getRecordCname() {
            return this.recordCname;
        }

        /**
         * @return recordId
         */
        public Long getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return recordSourceType
         */
        public String getRecordSourceType() {
            return this.recordSourceType;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private AuthConf authConf; 
            private String bizName; 
            private String comment; 
            private String createTime; 
            private String customPort; 
            private Data data; 
            private String hostPolicy; 
            private String httpPorts; 
            private String httpsPorts; 
            private Boolean proxied; 
            private String recordCname; 
            private Long recordId; 
            private String recordName; 
            private String recordSourceType; 
            private String recordType; 
            private Long siteId; 
            private String siteName; 
            private Integer ttl; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(RecordModel model) {
                this.authConf = model.authConf;
                this.bizName = model.bizName;
                this.comment = model.comment;
                this.createTime = model.createTime;
                this.customPort = model.customPort;
                this.data = model.data;
                this.hostPolicy = model.hostPolicy;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.proxied = model.proxied;
                this.recordCname = model.recordCname;
                this.recordId = model.recordId;
                this.recordName = model.recordName;
                this.recordSourceType = model.recordSourceType;
                this.recordType = model.recordType;
                this.siteId = model.siteId;
                this.siteName = model.siteName;
                this.ttl = model.ttl;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The back-to-origin authentication information of the CNAME record.</p>
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>The business scenario when the record is accelerated. Valid values:</p>
             * <ul>
             * <li><strong>image_video</strong>: video and image.</li>
             * <li><strong>api</strong>: API.</li>
             * <li><strong>web</strong>: web page.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>image_video</p>
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * <p>The comment of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>Remarks</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The creation time of the record. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10T13:30:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomPort.
             */
            public Builder customPort(String customPort) {
                this.customPort = customPort;
                return this;
            }

            /**
             * <p>The DNS information of the record. The content returned in this field varies by record type.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The back-to-origin HOST policy. This parameter takes effect when the record type is CNAME. It specifies the HOST header policy for back-to-origin requests. Valid values:</p>
             * <ul>
             * <li><strong>follow_hostname</strong>: follows the host record.</li>
             * <li><strong>follow_origin_domain</strong>: follows the origin domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>follow_origin_domain</p>
             */
            public Builder hostPolicy(String hostPolicy) {
                this.hostPolicy = hostPolicy;
                return this;
            }

            /**
             * HttpPorts.
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * HttpsPorts.
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Indicates whether proxy acceleration is enabled for the record. Only CNAME and A/AAAA records support proxy acceleration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Proxy acceleration is enabled.</li>
             * <li><strong>false</strong>: Proxy acceleration is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder proxied(Boolean proxied) {
                this.proxied = proxied;
                return this;
            }

            /**
             * <p>The CNAME of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>a.example.com.cnamezone.com</p>
             */
            public Builder recordCname(String recordCname) {
                this.recordCname = recordCname;
                return this;
            }

            /**
             * <p>The record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123</p>
             */
            public Builder recordId(Long recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The record name.</p>
             * 
             * <strong>example:</strong>
             * <p>a.example.com</p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The origin type of the CNAME record. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: OSS origin.</li>
             * <li><strong>S3</strong>: S3 origin.</li>
             * <li><strong>LB</strong>: load balancing origin.</li>
             * <li><strong>OP</strong>: IPAM pool origin.</li>
             * <li><strong>Domain</strong>: standard domain name origin.</li>
             * </ul>
             * <p>If this parameter is not specified or is left empty, the default value is Domain, which indicates a standard domain name origin type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder recordSourceType(String recordSourceType) {
                this.recordSourceType = recordSourceType;
                return this;
            }

            /**
             * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, or TXT</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>A/AAAA</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The site name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The Time-to-Live (TTL) of the record, in seconds. A value of 1 indicates that the TTL is set to automatic.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The update time of the record. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-27T02:26:22Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public RecordModel build() {
                return new RecordModel(this);
            } 

        } 

    }
}
