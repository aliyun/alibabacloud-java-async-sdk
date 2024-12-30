// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
         * <p>The download URL of a file that is downloaded by using Alibaba Cloud CDN.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data-cdn.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data-cdn.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
         */
        public Builder cdnUrl(String cdnUrl) {
            this.cdnUrl = cdnUrl;
            return this;
        }

        /**
         * <p>The hash value of the file content.</p>
         * 
         * <strong>example:</strong>
         * <p>EA4942AA8761213890A5C386F88E6464D2C31CA1</p>
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * <p>The name of the algorithm that is used to calculate the hash value of the file content.</p>
         * 
         * <strong>example:</strong>
         * <p>sha1</p>
         */
        public Builder contentHashName(String contentHashName) {
            this.contentHashName = contentHashName;
            return this;
        }

        /**
         * <p>The hash value calculated by using 64-bit cyclic redundancy check (CRC-64).</p>
         * 
         * <strong>example:</strong>
         * <p>5498595269368962671</p>
         */
        public Builder crc64Hash(String crc64Hash) {
            this.crc64Hash = crc64Hash;
            return this;
        }

        /**
         * <p>The time when the download URL expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-02T15:04:05.999Z07:00</p>
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The download URL of a file that is downloaded over a virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data-vpc.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data-vpc.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
         */
        public Builder internalUrl(String internalUrl) {
            this.internalUrl = internalUrl;
            return this;
        }

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The download URL of a file that is downloaded over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://data.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
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
