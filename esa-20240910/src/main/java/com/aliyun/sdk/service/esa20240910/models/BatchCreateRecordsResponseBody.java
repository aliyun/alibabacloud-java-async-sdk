// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateRecordsResponseBody</p>
 */
public class BatchCreateRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordResultList")
    private RecordResultList recordResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchCreateRecordsResponseBody(Builder builder) {
        this.recordResultList = builder.recordResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordResultList
     */
    public RecordResultList getRecordResultList() {
        return this.recordResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordResultList recordResultList; 
        private String requestId; 

        /**
         * <p>The records that have been created and failed to be created.</p>
         */
        public Builder recordResultList(RecordResultList recordResultList) {
            this.recordResultList = recordResultList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchCreateRecordsResponseBody build() {
            return new BatchCreateRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsResponseBody</p>
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
             * <p>The flag bit of the record. Indicates its priority and handling method, used in CAA records.</p>
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
             * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>RSA</p>
             */
            public Builder matchingType(Integer matchingType) {
                this.matchingType = matchingType;
                return this;
            }

            /**
             * <p>The port number of the record, associated with the SRV record. Exclusive to SRV records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. Applicable to MX, SRV, and URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>Indicates its priority and handling method, used in CAA records.</p>
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
             * <p>The record value or part of the record content. This value is returned when the record is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It has different meanings based on types of records:</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: the IP addresses. IP addresses are separated by commas (,). There is at least one IPv4 address.</li>
             * <li><strong>CNAME</strong>: the mapped domain name.</li>
             * <li><strong>NS</strong>: the nameservers for the domain name.</li>
             * <li><strong>MX</strong>: a valid domain name of the target mail server.</li>
             * <li><strong>TXT</strong>: a valid text string.</li>
             * <li><strong>CAA</strong>: a valid domain name of the certificate authority.</li>
             * <li><strong>SRV</strong>: a valid domain name of the target host.</li>
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
             * <p>The weight of the record. Applicable to SRV and URI records.</p>
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
     * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsResponseBody</p>
     */
    public static class Failed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Proxied")
        private Boolean proxied;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Failed(Builder builder) {
            this.bizName = builder.bizName;
            this.data = builder.data;
            this.description = builder.description;
            this.proxied = builder.proxied;
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.recordType = builder.recordType;
            this.sourceType = builder.sourceType;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Failed create() {
            return builder().build();
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
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

        public static final class Builder {
            private String bizName; 
            private Data data; 
            private String description; 
            private Boolean proxied; 
            private Long recordId; 
            private String recordName; 
            private String recordType; 
            private String sourceType; 
            private Integer ttl; 

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
             * <p>The DNS information about the record, which contains various types of record values and their related attributes.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;value&quot;:&quot;2.2.2.2&quot;}</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The result description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the record is proxied. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>A/AAAA</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>The origin type of the CNAME record. This field is left empty for other types of records. The type of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: OSS bucket.</li>
             * <li><strong>S3</strong>: S3 bucket.</li>
             * <li><strong>LB</strong>: load balancer.</li>
             * <li><strong>OP</strong>: origin pool.</li>
             * <li><strong>Domain</strong>: domain name.</li>
             * </ul>
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
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Failed build() {
                return new Failed(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsResponseBody</p>
     */
    public static class SuccessData extends TeaModel {
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

        private SuccessData(Builder builder) {
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

        public static SuccessData create() {
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
             * <p>The flag bit of the record. Indicates its priority and handling method, used in CAA records.</p>
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
             * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
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
             * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. Applicable to MX, SRV, and URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The label of a CAA record, which indicates its specific type and purpose, such as issue, issuewild, and iodef.</p>
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
             * <p>The record value or part of the record content. This value is returned when the record is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It has different meanings based on types of records:</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: the IP addresses. Multiple IPs are separated by commas (,). There is at least one IPv4 address.</li>
             * <li><strong>CNAME</strong>: the mapped domain name.</li>
             * <li><strong>NS</strong>: the nameservers for the domain name.</li>
             * <li><strong>MX</strong>: a valid domain name of the target mail server.</li>
             * <li><strong>TXT</strong>: a valid text string.</li>
             * <li><strong>CAA</strong>: a valid domain name of the certificate authority.</li>
             * <li><strong>SRV</strong>: a valid domain name of the target host.</li>
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
             * <p>The weight of the record. Valid values: 0 to 65535. Applicable to SRV and URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public SuccessData build() {
                return new SuccessData(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsResponseBody</p>
     */
    public static class Success extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("Data")
        private SuccessData data;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Proxied")
        private Boolean proxied;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private Long recordId;

        @com.aliyun.core.annotation.NameInMap("RecordName")
        private String recordName;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        private Success(Builder builder) {
            this.bizName = builder.bizName;
            this.data = builder.data;
            this.description = builder.description;
            this.proxied = builder.proxied;
            this.recordId = builder.recordId;
            this.recordName = builder.recordName;
            this.recordType = builder.recordType;
            this.sourceType = builder.sourceType;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Success create() {
            return builder().build();
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
        public SuccessData getData() {
            return this.data;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return recordName
         */
        public String getRecordName() {
            return this.recordName;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
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

        public static final class Builder {
            private String bizName; 
            private SuccessData data; 
            private String description; 
            private Boolean proxied; 
            private Long recordId; 
            private String recordName; 
            private String recordType; 
            private String sourceType; 
            private Integer ttl; 

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
             * <p>The DNS record information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
             */
            public Builder data(SuccessData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The result description.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the record is proxied. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder recordName(String recordName) {
                this.recordName = recordName;
                return this;
            }

            /**
             * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>A/AAAA</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>The origin type of the CNAME record. This field is left empty for other types of records. The type of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: OSS bucket.</li>
             * <li><strong>S3</strong>: S3 bucket.</li>
             * <li><strong>LB</strong>: load balancer.</li>
             * <li><strong>OP</strong>: origin pool.</li>
             * <li><strong>Domain</strong>: domain name.</li>
             * </ul>
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
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            public Success build() {
                return new Success(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateRecordsResponseBody</p>
     */
    public static class RecordResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private java.util.List < Failed> failed;

        @com.aliyun.core.annotation.NameInMap("Success")
        private java.util.List < Success> success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private RecordResultList(Builder builder) {
            this.failed = builder.failed;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordResultList create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public java.util.List < Failed> getFailed() {
            return this.failed;
        }

        /**
         * @return success
         */
        public java.util.List < Success> getSuccess() {
            return this.success;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Failed> failed; 
            private java.util.List < Success> success; 
            private Integer totalCount; 

            /**
             * <p>The records that failed to be created.</p>
             */
            public Builder failed(java.util.List < Failed> failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>The records that have been created.</p>
             */
            public Builder success(java.util.List < Success> success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of returned records.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public RecordResultList build() {
                return new RecordResultList(this);
            } 

        } 

    }
}
