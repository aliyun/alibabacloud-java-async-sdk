// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDomainDnssecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDnssecInfoResponseBody</p>
 */
public class DescribeDomainDnssecInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.NameInMap("DigestType")
    private String digestType;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DsRecord")
    private String dsRecord;

    @com.aliyun.core.annotation.NameInMap("Flags")
    private String flags;

    @com.aliyun.core.annotation.NameInMap("KeyTag")
    private String keyTag;

    @com.aliyun.core.annotation.NameInMap("PublicKey")
    private String publicKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDomainDnssecInfoResponseBody model) {
            this.algorithm = model.algorithm;
            this.digest = model.digest;
            this.digestType = model.digestType;
            this.domainName = model.domainName;
            this.dsRecord = model.dsRecord;
            this.flags = model.flags;
            this.keyTag = model.keyTag;
            this.publicKey = model.publicKey;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The algorithm type. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The digest. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>C1A0424B97A049F1F9B2EA139CC298533219668164E343BD21203ABC4608C02A</p>
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * <p>The digest type. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256</p>
         */
        public Builder digestType(String digestType) {
            this.digestType = digestType;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The delegation signer (DS) record. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com. 3600 IN DS 2371 13 2 C1A0424B97A049F1F9B2EA139CC298533219668164E343BD21203ABC4608C02A</p>
         */
        public Builder dsRecord(String dsRecord) {
            this.dsRecord = dsRecord;
            return this;
        }

        /**
         * <p>The flag. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>257 (KSK)</p>
         */
        public Builder flags(String flags) {
            this.flags = flags;
            return this;
        }

        /**
         * <p>The key tag. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>54931</p>
         */
        public Builder keyTag(String keyTag) {
            this.keyTag = keyTag;
            return this;
        }

        /**
         * <p>The public key. This parameter is returned if DNSSEC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>mdsswUyr3DPW132mOi8V9xESWE8jTo0dxCjjnopKl+GqJxpVXckHAeF+KkxLbxILfDLUT0rAK9iUzy1L53eKGQ==</p>
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the DNSSEC. Valid values:</p>
         * <ul>
         * <li>ON</li>
         * <li>OFF</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
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
