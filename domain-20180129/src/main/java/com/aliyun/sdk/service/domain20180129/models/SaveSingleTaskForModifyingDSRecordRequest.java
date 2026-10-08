// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveSingleTaskForModifyingDSRecordRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForModifyingDSRecordRequest</p>
 */
public class SaveSingleTaskForModifyingDSRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Digest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String digest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DigestType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer digestType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer keyTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForModifyingDSRecordRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.digest = builder.digest;
        this.digestType = builder.digestType;
        this.domainName = builder.domainName;
        this.keyTag = builder.keyTag;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForModifyingDSRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public Integer getAlgorithm() {
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
    public Integer getDigestType() {
        return this.digestType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return keyTag
     */
    public Integer getKeyTag() {
        return this.keyTag;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForModifyingDSRecordRequest, Builder> {
        private Integer algorithm; 
        private String digest; 
        private Integer digestType; 
        private String domainName; 
        private Integer keyTag; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForModifyingDSRecordRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.digest = request.digest;
            this.digestType = request.digestType;
            this.domainName = request.domainName;
            this.keyTag = request.keyTag;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>Encryption algorithm number. For more information, see <a href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xhtml">Domain Name System Security (DNSSEC) Algorithm Numbers</a>. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: RSA/MD5  </li>
         * <li><strong>2</strong>: Diffie-Hellman  </li>
         * <li><strong>3</strong>: DSA/SHA-1  </li>
         * <li><strong>5</strong>: RSA/SHA-1  </li>
         * <li><strong>6</strong>: DSA-NSEC3-SHA1  </li>
         * <li><strong>7</strong>: RSASHA1-NSEC3-SHA1  </li>
         * <li><strong>8</strong>: RSA/SHA-256  </li>
         * <li><strong>10</strong>: RSA/SHA-512  </li>
         * <li><strong>12</strong>: GOST R 34.10-2001  </li>
         * <li><strong>13</strong>: ECDSA Curve P-256 with SHA-256  </li>
         * <li><strong>14</strong>: ECDSA Curve P-384 with SHA-384  </li>
         * <li><strong>15</strong>: Ed2551916 Ed448  </li>
         * <li><strong>252</strong>: Reserved for Indirect Keys  </li>
         * <li><strong>253</strong>: private algorithm  </li>
         * <li><strong>254</strong>: private algorithm OID</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder algorithm(Integer algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>Summary value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * <p>Digest algorithm type. For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms</a>. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: SHA-1  </li>
         * <li><strong>2</strong>: SHA-256  </li>
         * <li><strong>3</strong>: GOST R 34.11-94  </li>
         * <li><strong>4</strong>: SHA-384</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder digestType(Integer digestType) {
            this.putQueryParameter("DigestType", digestType);
            this.digestType = digestType;
            return this;
        }

        /**
         * <p>Domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Key tag used to identify DNSSEC records. It is an integer less than 65536.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder keyTag(Integer keyTag) {
            this.putQueryParameter("KeyTag", keyTag);
            this.keyTag = keyTag;
            return this;
        }

        /**
         * <p>Language of error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese  </li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>User IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForModifyingDSRecordRequest build() {
            return new SaveSingleTaskForModifyingDSRecordRequest(this);
        } 

    } 

}
