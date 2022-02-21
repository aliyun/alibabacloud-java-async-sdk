// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForModifyingDSRecordRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForModifyingDSRecordRequest</p>
 */
public class SaveSingleTaskForModifyingDSRecordRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private Integer algorithm;

    @Query
    @NameInMap("Digest")
    @Validation(required = true)
    private String digest;

    @Query
    @NameInMap("DigestType")
    @Validation(required = true)
    private Integer digestType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("KeyTag")
    @Validation(required = true)
    private Integer keyTag;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
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

        private Builder(SaveSingleTaskForModifyingDSRecordRequest response) {
            super(response);
            this.algorithm = response.algorithm;
            this.digest = response.digest;
            this.digestType = response.digestType;
            this.domainName = response.domainName;
            this.keyTag = response.keyTag;
            this.lang = response.lang;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(Integer algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Digest.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        /**
         * DigestType.
         */
        public Builder digestType(Integer digestType) {
            this.putQueryParameter("DigestType", digestType);
            this.digestType = digestType;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * KeyTag.
         */
        public Builder keyTag(Integer keyTag) {
            this.putQueryParameter("KeyTag", keyTag);
            this.keyTag = keyTag;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * UserClientIp.
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
