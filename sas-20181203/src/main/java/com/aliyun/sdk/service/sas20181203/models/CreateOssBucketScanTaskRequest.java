// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateOssBucketScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateOssBucketScanTaskRequest</p>
 */
public class CreateOssBucketScanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
    private Boolean allKeyPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> bucketNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
    private Integer decompressMaxFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
    private Integer decompressMaxLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecryptionList")
    private java.util.List<String> decryptionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeKeySuffixList")
    private java.util.List<String> excludeKeySuffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPrefixList")
    private java.util.List<String> keyPrefixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySuffixList")
    private java.util.List<String> keySuffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastModifiedStartTime")
    private Long lastModifiedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer scanMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private CreateOssBucketScanTaskRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.bucketNameList = builder.bucketNameList;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.decryptionList = builder.decryptionList;
        this.excludeKeySuffixList = builder.excludeKeySuffixList;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.lastModifiedStartTime = builder.lastModifiedStartTime;
        this.scanMode = builder.scanMode;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssBucketScanTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allKeyPrefix
     */
    public Boolean getAllKeyPrefix() {
        return this.allKeyPrefix;
    }

    /**
     * @return bucketNameList
     */
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    /**
     * @return decompressMaxFileCount
     */
    public Integer getDecompressMaxFileCount() {
        return this.decompressMaxFileCount;
    }

    /**
     * @return decompressMaxLayer
     */
    public Integer getDecompressMaxLayer() {
        return this.decompressMaxLayer;
    }

    /**
     * @return decryptionList
     */
    public java.util.List<String> getDecryptionList() {
        return this.decryptionList;
    }

    /**
     * @return excludeKeySuffixList
     */
    public java.util.List<String> getExcludeKeySuffixList() {
        return this.excludeKeySuffixList;
    }

    /**
     * @return keyPrefixList
     */
    public java.util.List<String> getKeyPrefixList() {
        return this.keyPrefixList;
    }

    /**
     * @return keySuffixList
     */
    public java.util.List<String> getKeySuffixList() {
        return this.keySuffixList;
    }

    /**
     * @return lastModifiedStartTime
     */
    public Long getLastModifiedStartTime() {
        return this.lastModifiedStartTime;
    }

    /**
     * @return scanMode
     */
    public Integer getScanMode() {
        return this.scanMode;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateOssBucketScanTaskRequest, Builder> {
        private Boolean allKeyPrefix; 
        private java.util.List<String> bucketNameList; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private java.util.List<String> decryptionList; 
        private java.util.List<String> excludeKeySuffixList; 
        private java.util.List<String> keyPrefixList; 
        private java.util.List<String> keySuffixList; 
        private Long lastModifiedStartTime; 
        private Integer scanMode; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssBucketScanTaskRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.bucketNameList = request.bucketNameList;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.decryptionList = request.decryptionList;
            this.excludeKeySuffixList = request.excludeKeySuffixList;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.lastModifiedStartTime = request.lastModifiedStartTime;
            this.scanMode = request.scanMode;
            this.source = request.source;
        } 

        /**
         * <p>Specifies whether to match all prefixes. If this parameter is set to true, the KeyPrefixList parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allKeyPrefix(Boolean allKeyPrefix) {
            this.putQueryParameter("AllKeyPrefix", allKeyPrefix);
            this.allKeyPrefix = allKeyPrefix;
            return this;
        }

        /**
         * <p>The list of bucket names. The specified buckets must already exist in OSS and must have been synchronized to Security Center by calling the RefreshOssBucketScanInfo operation. You can call the ListOssBucket operation to obtain the list of managed buckets.</p>
         * <p>This parameter is required.</p>
         */
        public Builder bucketNameList(java.util.List<String> bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * <p>The maximum number of files to decompress. The minimum value is 1 and the maximum value is 1000. When the maximum number of decompressed files is exceeded, the decompression operation stops immediately. The scanning of files that have already been decompressed is not affected.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
            this.putQueryParameter("DecompressMaxFileCount", decompressMaxFileCount);
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }

        /**
         * <p>The maximum number of decompression layers when multiple levels of nested compressed files exist. The minimum value is 1 and the maximum value is 5. When the maximum number of decompression layers is exceeded, the decompression operation stops immediately. The scanning of files that have already been decompressed is not affected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder decompressMaxLayer(Integer decompressMaxLayer) {
            this.putQueryParameter("DecompressMaxLayer", decompressMaxLayer);
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }

        /**
         * <p>The list of decryption types.</p>
         */
        public Builder decryptionList(java.util.List<String> decryptionList) {
            this.putQueryParameter("DecryptionList", decryptionList);
            this.decryptionList = decryptionList;
            return this;
        }

        /**
         * <p>The list of file suffixes to exclude from scanning.</p>
         */
        public Builder excludeKeySuffixList(java.util.List<String> excludeKeySuffixList) {
            this.putQueryParameter("ExcludeKeySuffixList", excludeKeySuffixList);
            this.excludeKeySuffixList = excludeKeySuffixList;
            return this;
        }

        /**
         * <p>The prefix list of files.</p>
         */
        public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
            this.putQueryParameter("KeyPrefixList", keyPrefixList);
            this.keyPrefixList = keyPrefixList;
            return this;
        }

        /**
         * <p>The list of file suffixes.</p>
         */
        public Builder keySuffixList(java.util.List<String> keySuffixList) {
            this.putQueryParameter("KeySuffixList", keySuffixList);
            this.keySuffixList = keySuffixList;
            return this;
        }

        /**
         * <p>Specifies that only files whose last modification time is after the specified timestamp are scanned. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1724301769834</p>
         */
        public Builder lastModifiedStartTime(Long lastModifiedStartTime) {
            this.putQueryParameter("LastModifiedStartTime", lastModifiedStartTime);
            this.lastModifiedStartTime = lastModifiedStartTime;
            return this;
        }

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Full file scan.</p>
         * </li>
         * <li><p><strong>2</strong>: Incremental file scan.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanMode(Integer scanMode) {
            this.putQueryParameter("ScanMode", scanMode);
            this.scanMode = scanMode;
            return this;
        }

        /**
         * <p>The business source. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS.</li>
         * <li><strong>NAS</strong>: NAS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateOssBucketScanTaskRequest build() {
            return new CreateOssBucketScanTaskRequest(this);
        } 

    } 

}
