// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetDownloadUrlResponseBody</p>
 */
public class GetDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cdn_url")
    private String cdnUrl;

    @com.aliyun.core.annotation.NameInMap("content_hash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("content_hash_name")
    private String contentHashName;

    @com.aliyun.core.annotation.NameInMap("crc64_hash")
    private String crc64Hash;

    @com.aliyun.core.annotation.NameInMap("expiration")
    private String expiration;

    @com.aliyun.core.annotation.NameInMap("internal_url")
    private String internalUrl;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetDownloadUrlResponseBody(Builder builder) {
        this.cdnUrl = builder.cdnUrl;
        this.contentHash = builder.contentHash;
        this.contentHashName = builder.contentHashName;
        this.crc64Hash = builder.crc64Hash;
        this.expiration = builder.expiration;
        this.internalUrl = builder.internalUrl;
        this.size = builder.size;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return cdnUrl
     */
    public String getCdnUrl() {
        return this.cdnUrl;
    }

    /**
     * @return contentHash
     */
    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * @return contentHashName
     */
    public String getContentHashName() {
        return this.contentHashName;
    }

    /**
     * @return crc64Hash
     */
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
    }

    /**
     * @return internalUrl
     */
    public String getInternalUrl() {
        return this.internalUrl;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String cdnUrl; 
        private String contentHash; 
        private String contentHashName; 
        private String crc64Hash; 
        private String expiration; 
        private String internalUrl; 
        private Long size; 
        private String url; 

        /**
         * The download URL of a file that is downloaded by using Alibaba Cloud CDN.
         */
        public Builder cdnUrl(String cdnUrl) {
            this.cdnUrl = cdnUrl;
            return this;
        }

        /**
         * The hash value of the file content.
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * The name of the algorithm that is used to calculate the hash value of the file content.
         */
        public Builder contentHashName(String contentHashName) {
            this.contentHashName = contentHashName;
            return this;
        }

        /**
         * The hash value calculated by using 64-bit cyclic redundancy check (CRC-64).
         */
        public Builder crc64Hash(String crc64Hash) {
            this.crc64Hash = crc64Hash;
            return this;
        }

        /**
         * The time when the download URL expires.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * The download URL of a file that is downloaded over a virtual private cloud (VPC).
         */
        public Builder internalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }

        /**
         * The size of the file. Unit: bytes.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * The download URL of a file that is downloaded over the Internet.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetDownloadUrlResponseBody build() {
            return new GetDownloadUrlResponseBody(this);
        } 

    } 

}
