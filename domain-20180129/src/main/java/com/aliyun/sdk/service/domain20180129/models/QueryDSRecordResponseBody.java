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
 * {@link QueryDSRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDSRecordResponseBody</p>
 */
public class QueryDSRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DSRecordList")
    private java.util.List<DSRecordList> DSRecordList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDSRecordResponseBody(Builder builder) {
        this.DSRecordList = builder.DSRecordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDSRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DSRecordList
     */
    public java.util.List<DSRecordList> getDSRecordList() {
        return this.DSRecordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DSRecordList> DSRecordList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDSRecordResponseBody model) {
            this.DSRecordList = model.DSRecordList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of DS records.</p>
         */
        public Builder DSRecordList(java.util.List<DSRecordList> DSRecordList) {
            this.DSRecordList = DSRecordList;
            return this;
        }

        /**
         * <p>Unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>814B2AF0-ED6F-4C13-B41C-8AC0B1023583</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDSRecordResponseBody build() {
            return new QueryDSRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDSRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDSRecordResponseBody</p>
     */
    public static class DSRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Algorithm")
        private Integer algorithm;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("DigestType")
        private Integer digestType;

        @com.aliyun.core.annotation.NameInMap("KeyTag")
        private Integer keyTag;

        private DSRecordList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.digest = builder.digest;
            this.digestType = builder.digestType;
            this.keyTag = builder.keyTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DSRecordList create() {
            return builder().build();
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
         * @return keyTag
         */
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public static final class Builder {
            private Integer algorithm; 
            private String digest; 
            private Integer digestType; 
            private Integer keyTag; 

            private Builder() {
            } 

            private Builder(DSRecordList model) {
                this.algorithm = model.algorithm;
                this.digest = model.digest;
                this.digestType = model.digestType;
                this.keyTag = model.keyTag;
            } 

            /**
             * <p>Encryption algorithm number. For more information, see <a href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xhtml">Domain Name System Security (DNSSEC) Algorithm Numbers</a>. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: RSA/MD5;</li>
             * <li><strong>2</strong>: Diffie-Hellman;</li>
             * <li><strong>3</strong>: DSA/SHA-1;</li>
             * <li><strong>5</strong>: RSA/SHA-1;</li>
             * <li><strong>6</strong>: DSA-NSEC3-SHA1;</li>
             * <li><strong>7</strong>: RSASHA1-NSEC3-SHA1;</li>
             * <li><strong>8</strong>: RSA/SHA-256;</li>
             * <li><strong>10</strong>: RSA/SHA-512;</li>
             * <li><strong>12</strong>: GOST R 34.10-2001;</li>
             * <li><strong>13</strong>: ECDSA Curve P-256 with SHA-256;</li>
             * <li><strong>14</strong>: ECDSA Curve P-384 with SHA-384;</li>
             * <li><strong>15</strong>: Ed25519;</li>
             * <li><strong>16</strong>: Ed448;</li>
             * <li><strong>252</strong>: Reserved for Indirect Keys;</li>
             * <li><strong>253</strong>: private algorithm;</li>
             * <li><strong>254</strong>: private algorithm OID.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * <p>Digest value.</p>
             * 
             * <strong>example:</strong>
             * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>Digest algorithm type. For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms</a>. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: SHA-1;</li>
             * <li><strong>2</strong>: SHA-256;</li>
             * <li><strong>3</strong>: GOST R 34.11-94;</li>
             * <li><strong>4</strong>: SHA-384.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder digestType(Integer digestType) {
                this.digestType = digestType;
                return this;
            }

            /**
             * <p>Key tag used to identify DNSSEC records. It is an integer less than 65536.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            public DSRecordList build() {
                return new DSRecordList(this);
            } 

        } 

    }
}
