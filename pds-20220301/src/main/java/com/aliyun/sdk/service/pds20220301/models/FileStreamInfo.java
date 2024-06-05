// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileStreamInfo} extends {@link TeaModel}
 *
 * <p>FileStreamInfo</p>
 */
public class FileStreamInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content_hash")
    private String contentHash;

    @com.aliyun.core.annotation.NameInMap("content_hash_name")
    private String contentHashName;

    @com.aliyun.core.annotation.NameInMap("content_md5")
    private String contentMd5;

    @com.aliyun.core.annotation.NameInMap("part_info_list")
    private UploadPartInfo partInfoList;

    @com.aliyun.core.annotation.NameInMap("pre_hash")
    private String preHash;

    @com.aliyun.core.annotation.NameInMap("proof_code")
    private String proofCode;

    @com.aliyun.core.annotation.NameInMap("proof_version")
    private String proofVersion;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private FileStreamInfo(Builder builder) {
        this.contentHash = builder.contentHash;
        this.contentHashName = builder.contentHashName;
        this.contentMd5 = builder.contentMd5;
        this.partInfoList = builder.partInfoList;
        this.preHash = builder.preHash;
        this.proofCode = builder.proofCode;
        this.proofVersion = builder.proofVersion;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileStreamInfo create() {
        return builder().build();
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
     * @return contentMd5
     */
    public String getContentMd5() {
        return this.contentMd5;
    }

    /**
     * @return partInfoList
     */
    public UploadPartInfo getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return preHash
     */
    public String getPreHash() {
        return this.preHash;
    }

    /**
     * @return proofCode
     */
    public String getProofCode() {
        return this.proofCode;
    }

    /**
     * @return proofVersion
     */
    public String getProofVersion() {
        return this.proofVersion;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String contentHash; 
        private String contentHashName; 
        private String contentMd5; 
        private UploadPartInfo partInfoList; 
        private String preHash; 
        private String proofCode; 
        private String proofVersion; 
        private Long size; 

        /**
         * content_hash.
         */
        public Builder contentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        /**
         * content_hash_name.
         */
        public Builder contentHashName(String contentHashName) {
            this.contentHashName = contentHashName;
            return this;
        }

        /**
         * content_md5.
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * part_info_list.
         */
        public Builder partInfoList(UploadPartInfo partInfoList) {
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * pre_hash.
         */
        public Builder preHash(String preHash) {
            this.preHash = preHash;
            return this;
        }

        /**
         * proof_code.
         */
        public Builder proofCode(String proofCode) {
            this.proofCode = proofCode;
            return this;
        }

        /**
         * proof_version.
         */
        public Builder proofVersion(String proofVersion) {
            this.proofVersion = proofVersion;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public FileStreamInfo build() {
            return new FileStreamInfo(this);
        } 

    } 

}
