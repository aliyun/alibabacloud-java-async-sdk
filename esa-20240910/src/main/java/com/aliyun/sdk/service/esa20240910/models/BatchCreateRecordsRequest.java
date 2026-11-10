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
 * {@link BatchCreateRecordsRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateRecordsRequest</p>
 */
public class BatchCreateRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RecordList> recordList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private BatchCreateRecordsRequest(Builder builder) {
        super(builder);
        this.recordList = builder.recordList;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordList
     */
    public java.util.List<RecordList> getRecordList() {
        return this.recordList;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<BatchCreateRecordsRequest, Builder> {
        private java.util.List<RecordList> recordList; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateRecordsRequest request) {
            super(request);
            this.recordList = request.recordList;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The list of DNS records to be created.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordList(java.util.List<RecordList> recordList) {
            String recordListShrink = shrink(recordList, "RecordList", "json");
            this.putQueryParameter("RecordList", recordListShrink);
            this.recordList = recordList;
            return this;
        }

        /**
         * <p>The site ID. You can obtain the site ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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

        @Override
        public BatchCreateRecordsRequest build() {
            return new BatchCreateRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateRecordsRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsRequest</p>
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
             * <p>The AccessKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin server authentication type is private cross-account read, or when the origin server type is S3 and the origin server authentication type is private read.</p>
             * 
             * <strong>example:</strong>
             * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The origin server authentication type. Different origin server types support different authentication types. The origin server type refers to the SourceType parameter in this operation. When the origin server type is OSS or S3, this parameter is required. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: public read. Select this value when the origin server type is OSS or S3 and the origin server is publicly readable.</li>
             * <li><strong>private</strong>: private read. Select this value when the origin server type is S3 and the origin server is privately readable.</li>
             * <li><strong>private_same_account</strong>: private same-account read. Select this value when the origin server type is OSS, the origin server is under the same Alibaba Cloud account, and the origin server is privately readable.</li>
             * <li><strong>private_cross_account</strong>: private cross-account read. Select this value when the origin server type is OSS, the origin server is under a different Alibaba Cloud account, and the origin server is privately readable.</li>
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
             * <p>The region to which the origin server belongs. This parameter is required when the origin server type is S3. You can obtain the region of the origin server from the official website of S3.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The SecretKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin server authentication type is private cross-account read, or when the origin server type is S3 and the origin server authentication type is private read.</p>
             * 
             * <strong>example:</strong>
             * <p>VIxuvJSA2S03f******kp208dy5w7</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The signature algorithm version. This parameter is available when the origin server type is S3 and the origin server authentication type is private read. Valid values:</p>
             * <ul>
             * <li><strong>v2</strong></li>
             * <li><strong>v4</strong></li>
             * </ul>
             * <p>If this parameter is not specified, the default value is v4.</p>
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
     * {@link BatchCreateRecordsRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsRequest</p>
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
             * <p>The encryption algorithm used by the record. Valid values: <strong>0</strong> to <strong>255</strong>. This parameter applies to CERT and SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The public key certificate information of the record. This parameter applies to CERT, SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>dGVzdGFkYWxrcw==</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>The public key fingerprint of the record. This parameter applies to SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef1234567890</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The flag of the CAA record, which indicates its priority and processing method. Valid values: <strong>0</strong> to <strong>255</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The public key identifier of the record. Valid values: <strong>0</strong> to <strong>65535</strong>. This parameter applies to CERT records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * <p>The algorithm policy used by the record to match or verify the certificate. Valid values: <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * <p>The port of the record. Valid values: <strong>0</strong> to <strong>65535</strong>. This parameter applies only to SRV records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: <strong>0</strong> to <strong>65535</strong>. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, or URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the certificate or public key used by the record. Valid values: <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The tag of the CAA record, which indicates its specific type and usage, such as issue, issuewild, and iodef.</p>
             * 
             * <strong>example:</strong>
             * <p>issue</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The certificate type for CERT records or the public key type for SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage identifier of the record. Valid values: <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>The record value or partial content.</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: the IP address.</li>
             * <li><strong>CNAME</strong>: the target domain name.</li>
             * <li><strong>MX</strong>: the valid target mail server domain name.</li>
             * <li><strong>TXT</strong>: the valid character string.</li>
             * <li><strong>CAA</strong>: the valid domain name of the certification authority to issue certificates.</li>
             * <li><strong>SRV</strong>: the valid target host domain name.</li>
             * <li><strong>URI</strong>: the valid URI string.</li>
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
             * <p>The weight of the record. Valid values: <strong>0</strong> to <strong>65535</strong>. This parameter applies to SRV and URI records.</p>
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
     * {@link BatchCreateRecordsRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsRequest</p>
     */
    public static class RecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConf")
        private AuthConf authConf;

        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("Data")
        @com.aliyun.core.annotation.Validation(required = true)
        private Data data;

        @com.aliyun.core.annotation.NameInMap("HttpPorts")
        private String httpPorts;

        @com.aliyun.core.annotation.NameInMap("HttpsPorts")
        private String httpsPorts;

        @com.aliyun.core.annotation.NameInMap("Proxied")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean proxied;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private RecordList(Builder builder) {
            this.authConf = builder.authConf;
            this.bizName = builder.bizName;
            this.data = builder.data;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.proxied = builder.proxied;
            this.recordName = builder.recordName;
            this.sourceType = builder.sourceType;
            this.ttl = builder.ttl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordList create() {
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
         * @return data
         */
        public Data getData() {
            return this.data;
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
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
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

        public static final class Builder {
            private AuthConf authConf; 
            private String bizName; 
            private Data data; 
            private String httpPorts; 
            private String httpsPorts; 
            private Boolean proxied; 
            private String recordName; 
            private String sourceType; 
            private Integer ttl; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecordList model) {
                this.authConf = model.authConf;
                this.bizName = model.bizName;
                this.data = model.data;
                this.httpPorts = model.httpPorts;
                this.httpsPorts = model.httpsPorts;
                this.proxied = model.proxied;
                this.recordName = model.recordName;
                this.sourceType = model.sourceType;
                this.ttl = model.ttl;
                this.type = model.type;
            } 

            /**
             * <p>The origin server authentication information for the CNAME record.</p>
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>The business scenario for record acceleration. Valid values:</p>
             * <ul>
             * <li><strong>image_video</strong>: images and videos.</li>
             * <li><strong>api</strong>: API operations.</li>
             * <li><strong>web</strong>: web pages.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * <p>The DNS information of the record. Specify different fields based on the record type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;value&quot;:&quot;2.2.2.2&quot;
             * }</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The HTTP port. By default, port 80 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>80,2052,2082,2086,2095,8080,8880</p>
             */
            public Builder httpPorts(String httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * <p>The HTTPS port. By default, port 443 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>443,2053,2083,2087,2096,8443</p>
             */
            public Builder httpsPorts(String httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME and A/AAAA records can enable proxy acceleration. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables proxy acceleration.</li>
             * <li><strong>false</strong>: disables proxy acceleration.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder proxied(Boolean proxied) {
                this.proxied = proxied;
                return this;
            }

            /**
             * <p>The record name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The origin server type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: an OSS origin server.</li>
             * <li><strong>S3</strong>: an S3 origin server.</li>
             * <li><strong>LB</strong>: a load balancing origin server.</li>
             * <li><strong>OP</strong>: an IPAM pool origin server.</li>
             * <li><strong>Domain</strong>: a common domain name origin server.</li>
             * </ul>
             * <p>If this parameter is not specified or is left empty, the default value is Domain, which indicates a common domain name origin server type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) of the record, in seconds. A value of 1 indicates that the TTL is automatic.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The DNS record type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>A/AAAA</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordList build() {
                return new RecordList(this);
            } 

        } 

    }
}
