// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDnssecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDnssecInfoResponseBody</p>
 */
public class DescribeDomainDnssecInfoResponseBody extends TeaModel {
    @NameInMap("Algorithm")
    private String algorithm;

    @NameInMap("Digest")
    private String digest;

    @NameInMap("DigestType")
    private String digestType;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DsRecord")
    private String dsRecord;

    @NameInMap("Flags")
    private String flags;

    @NameInMap("KeyTag")
    private String keyTag;

    @NameInMap("PublicKey")
    private String publicKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeDomainDnssecInfoResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.digest = builder.digest;
        this.digestType = builder.digestType;
        this.domainName = builder.domainName;
        this.dsRecord = builder.dsRecord;
        this.flags = builder.flags;
        this.keyTag = builder.keyTag;
        this.publicKey = builder.publicKey;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDnssecInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return digestType
     */
    public String getDigestType() {
        return this.digestType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return dsRecord
     */
    public String getDsRecord() {
        return this.dsRecord;
    }

    /**
     * @return flags
     */
    public String getFlags() {
        return this.flags;
    }

    /**
     * @return keyTag
     */
    public String getKeyTag() {
        return this.keyTag;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String algorithm; 
        private String digest; 
        private String digestType; 
        private String domainName; 
        private String dsRecord; 
        private String flags; 
        private String keyTag; 
        private String publicKey; 
        private String requestId; 
        private String status; 

        /**
         * The algorithm type. This parameter is returned if DNSSEC is enabled.
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The digest. This parameter is returned if DNSSEC is enabled.
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * The digest type. This parameter is returned if DNSSEC is enabled.
         */
        public Builder digestType(String digestType) {
            this.digestType = digestType;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The delegation signer (DS) record. This parameter is returned if DNSSEC is enabled.
         */
        public Builder dsRecord(String dsRecord) {
            this.dsRecord = dsRecord;
            return this;
        }

        /**
         * The flag. This parameter is returned if DNSSEC is enabled.
         */
        public Builder flags(String flags) {
            this.flags = flags;
            return this;
        }

        /**
         * The key tag. This parameter is returned if DNSSEC is enabled.
         */
        public Builder keyTag(String keyTag) {
            this.keyTag = keyTag;
            return this;
        }

        /**
         * The public key. This parameter is returned if DNSSEC is enabled.
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of the DNSSEC. Valid values:
         * <p>
         * 
         * *   ON
         * *   OFF
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDomainDnssecInfoResponseBody build() {
            return new DescribeDomainDnssecInfoResponseBody(this);
        } 

    } 

}
