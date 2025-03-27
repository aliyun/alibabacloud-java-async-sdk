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
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
             * <p>The encryption algorithm used for the record. Valid values: 0 to 255. Applicable to CERT and SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The public key of the certificate. Applicable to CERT, SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>dGVzdGFkYWxrcw==</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>The public key fingerprint of the record. Applicable to SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef1234567890</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The Flag for a CAA record indicates its priority and how it is processed. Valid values: 0 to 255.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The public key identification for the record. Valid values: 0 to 65535. Applicable to CERT records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * <p>The port of the record. Valid values: 0 to 65535. Exclusive to SRV records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of certificate or public key. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The tag of a CAA record, which indicates its specific type and purpose, such as issue, issuewild, and iodef.</p>
             * 
             * <strong>example:</strong>
             * <p>issue</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The certificate type of the record (in CERT records), or the public key type (in SSHFP records).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The usage identifier of the record. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>The record value or part of the record content. A/AAAA: the IP address being pointed to. CNAME: the target domain name being pointed to. MX: valid target mail server domain name. TXT: valid text string. CAA: valid certificate authority domain name. SRV: valid target host domain name. URI: valid URI string.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The weight of the record. Valid values: 0 to 65,535. Applicable to SRV and URI records.</p>
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
                this.proxied = model.proxied;
                this.recordName = model.recordName;
                this.sourceType = model.sourceType;
                this.ttl = model.ttl;
                this.type = model.type;
            } 

            /**
             * AuthConf.
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>The business scenario of the record for acceleration. Valid values:</p>
             * <ul>
             * <li><strong>image_video</strong></li>
             * <li><strong>api</strong></li>
             * <li><strong>web</strong></li>
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
             * <p>The DNS information of the record. Enter fields based on the record type.</p>
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
             * <p>Specifies whether to proxy the record. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The origin type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: OSS bucket.</li>
             * <li><strong>S3</strong>: S3 bucket.</li>
             * <li><strong>LB</strong>: load balancer.</li>
             * <li><strong>OP</strong>: origin pool.</li>
             * <li><strong>Domain</strong>: domain name.</li>
             * </ul>
             * <p>If you do not pass this parameter or if you leave its value empty, Domain is used by default.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The TTL of the record. Unit: seconds. If the value is 1, the TTL of the record is determined by the system.</p>
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
             * <p>The DNS type of the record.</p>
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
