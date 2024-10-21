// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
