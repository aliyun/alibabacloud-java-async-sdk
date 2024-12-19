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
 * {@link ListRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecordsResponseBody</p>
 */
public class ListRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListRecordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.records = builder.records;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecordsResponseBody create() {
        return builder().build();
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
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
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

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Records> records; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DNS record information. The format of this field varies based on the record type. For more information, see Add DNS records.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecordsResponseBody build() {
            return new ListRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecordsResponseBody</p>
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
             * <p>The access key of the account to which the origin server belongs. This value is returned when the SourceType is OSS, and AuthType is private_cross_account, or when the SourceType is S3 and AuthType is private.</p>
             * 
             * <strong>example:</strong>
             * <p>u0Nkg5gBK***QF5wvKMM504JUHt</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, the authentication type of the origin must be specified. Valid values:</p>
             * <ul>
             * <li><strong>public</strong>: public read. This value is returned when the origin is a public OSS or S3 bucket.</li>
             * <li><strong>private</strong>: private read. This value is returned when the origin is a private S3 bucket.</li>
             * <li><strong>private_same_account</strong>: private read under the same account. This value is returned when the origin is a private OSS bucket in your Alibaba Cloud account.</li>
             * <li><strong>private_cross_account</strong>: private read across accounts. This value is returned when the origin is a private OSS bucket in a different Alibaba Cloud account.</li>
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
             * <p>The region of the origin. This parameter is returned if the origin type is S3. You can get the region information from the official website of Amazon S3.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The secret access key of the account to which the origin server belongs. This value is returned when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.</p>
             * 
             * <strong>example:</strong>
             * <p>VIxuvJSA2S03f***kp208dy5w7</p>
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * <p>The version of the signature algorithm. This value is returned when the origin type is S3 and AuthType is private. Valid values:</p>
             * <ul>
             * <li><strong>v2</strong></li>
             * <li><strong>v4</strong></li>
             * </ul>
             * <p>If this parameter is left empty, the default value v4 is used.</p>
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
     * {@link ListRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecordsResponseBody</p>
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
             * <p>The encryption algorithm used for the record. Valid values: 0 to 255. Exclusive to CERT and SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>The public key of the certificate. Exclusive to CERT, SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>dGVzdGFkYWxrcw==</p>
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * <p>The public key fingerprint of the record. Exclusive to SSHFP records.</p>
             * 
             * <strong>example:</strong>
             * <p>abcdef1234567890</p>
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * <p>The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed. Valid values: 0 to 255. Exclusive to CAA records.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The public key identification for the record. Valid values: 0 to 65535. Exclusive to CERT records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            /**
             * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Exclusive to SMIMEA and TLSA records.</p>
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
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. Exclusive to MX, SRV, and URI records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of certificate or public key. Valid values: 0 to 255. Exclusive to SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selector(Integer selector) {
                this.selector = selector;
                return this;
            }

            /**
             * <p>The tag of the record. The Tag of a CAA record indicate its specific type and usage. Exclusive to CAA records.</p>
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
             * <p>The usage identifier of the record. Valid values: 0 to 255. Exclusive to SMIMEA, and TLSA records.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder usage(Integer usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>Record value or part of the record content. This value is returned when the record is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It has different meanings based on types of records:</p>
             * <ul>
             * <li><strong>A/AAAA</strong>: the IP addresses. IP addresses are separated by commas (,). There is at least one IPv4 address.</li>
             * <li><strong>CNAME</strong>: the pointed/mapped domain name.</li>
             * <li><strong>NS</strong>: the nameservers for the domain name.</li>
             * <li><strong>MX</strong>: a valid domain name of the mail server.</li>
             * <li><strong>TXT</strong>: a valid text string.</li>
             * <li><strong>CAA</strong>: a valid domain name of the certificate authority.</li>
             * <li><strong>SRV</strong>: a valid domain name of the target host.</li>
             * <li><strong>URI</strong>: a valid URI string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CNAME</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The weight of the record. Valid values: 0 to 65535. Exclusive to SRV and URI records.</p>
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
     * {@link ListRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecordsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthConf")
        private AuthConf authConf;

        @com.aliyun.core.annotation.NameInMap("BizName")
        private String bizName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("HostPolicy")
        private String hostPolicy;

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
        private Long ttl;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Records(Builder builder) {
            this.authConf = builder.authConf;
            this.bizName = builder.bizName;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.data = builder.data;
            this.hostPolicy = builder.hostPolicy;
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

        public static Records create() {
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
        public Long getTtl() {
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
            private Data data; 
            private String hostPolicy; 
            private Boolean proxied; 
            private String recordCname; 
            private Long recordId; 
            private String recordName; 
            private String recordSourceType; 
            private String recordType; 
            private Long siteId; 
            private String siteName; 
            private Long ttl; 
            private String updateTime; 

            /**
             * <p>The origin authentication information of the CNAME record.</p>
             */
            public Builder authConf(AuthConf authConf) {
                this.authConf = authConf;
                return this;
            }

            /**
             * <p>The business scenario of the record for acceleration. Valid values:</p>
             * <ul>
             * <li><strong>image_video</strong>: video and image.</li>
             * <li><strong>api</strong>: API.</li>
             * <li><strong>web</strong>: web page.</li>
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
             * <p>The comments of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a remark.</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the record was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-24T02:01:11Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The DNS record information. Different types of records contain different information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The origin host policy. This policy takes effect when the record type is CNAME. Valid values:</p>
             * <ul>
             * <li>follow_hostname: matches the requested domain name.</li>
             * <li>follow_origin_domain: matches the origin&quot;s domain name.</li>
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
             * <p>Indicates whether the record is proxied. Valid values:</p>
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
             * <p>The CNAME. If you use CNAME setup when you add your website to ESA, the value is the CNAME that you configured then.</p>
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
             * <p>The origin type for the CNAME record. This parameter is returned when you add a CNAME record. Valid values:</p>
             * <ul>
             * <li><strong>OSS</strong>: OSS bucket.</li>
             * <li><strong>S3</strong>: S3 bucket.</li>
             * <li><strong>LB</strong>: load balancer.</li>
             * <li><strong>OP</strong>: origin pool.</li>
             * <li><strong>Domain</strong>: domain name.</li>
             * </ul>
             * <p>If you do not pass this parameter or if you leave its value empty, Domain is returned by default.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder recordSourceType(String recordSourceType) {
                this.recordSourceType = recordSourceType;
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
             * <p>The website ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The website name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * <p>The TTL of the record. Unit: seconds. If the value is 1, the TTL of the record is determined by the system.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The time when the record was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-07T10:02:59Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
