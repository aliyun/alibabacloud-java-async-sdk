// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > bucketNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
    private Integer decompressMaxFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
    private Integer decompressMaxLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeKeySuffixList")
    private java.util.List < String > excludeKeySuffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPrefixList")
    private java.util.List < String > keyPrefixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySuffixList")
    private java.util.List < String > keySuffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer scanMode;

    private CreateOssBucketScanTaskRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.bucketNameList = builder.bucketNameList;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.excludeKeySuffixList = builder.excludeKeySuffixList;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.scanMode = builder.scanMode;
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
    public java.util.List < String > getBucketNameList() {
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
     * @return excludeKeySuffixList
     */
    public java.util.List < String > getExcludeKeySuffixList() {
        return this.excludeKeySuffixList;
    }

    /**
     * @return keyPrefixList
     */
    public java.util.List < String > getKeyPrefixList() {
        return this.keyPrefixList;
    }

    /**
     * @return keySuffixList
     */
    public java.util.List < String > getKeySuffixList() {
        return this.keySuffixList;
    }

    /**
     * @return scanMode
     */
    public Integer getScanMode() {
        return this.scanMode;
    }

    public static final class Builder extends Request.Builder<CreateOssBucketScanTaskRequest, Builder> {
        private Boolean allKeyPrefix; 
        private java.util.List < String > bucketNameList; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private java.util.List < String > excludeKeySuffixList; 
        private java.util.List < String > keyPrefixList; 
        private java.util.List < String > keySuffixList; 
        private Integer scanMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssBucketScanTaskRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.bucketNameList = request.bucketNameList;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.excludeKeySuffixList = request.excludeKeySuffixList;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.scanMode = request.scanMode;
        } 

        /**
         * Whether to match all prefixes.
         */
        public Builder allKeyPrefix(Boolean allKeyPrefix) {
            this.putQueryParameter("AllKeyPrefix", allKeyPrefix);
            this.allKeyPrefix = allKeyPrefix;
            return this;
        }

        /**
         * The names of the buckets.
         */
        public Builder bucketNameList(java.util.List < String > bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * DecompressMaxFileCount.
         */
        public Builder decompressMaxFileCount(Integer decompressMaxFileCount) {
            this.putQueryParameter("DecompressMaxFileCount", decompressMaxFileCount);
            this.decompressMaxFileCount = decompressMaxFileCount;
            return this;
        }

        /**
         * DecompressMaxLayer.
         */
        public Builder decompressMaxLayer(Integer decompressMaxLayer) {
            this.putQueryParameter("DecompressMaxLayer", decompressMaxLayer);
            this.decompressMaxLayer = decompressMaxLayer;
            return this;
        }

        /**
         * The suffixes of the objects that you do not want to check.
         */
        public Builder excludeKeySuffixList(java.util.List < String > excludeKeySuffixList) {
            this.putQueryParameter("ExcludeKeySuffixList", excludeKeySuffixList);
            this.excludeKeySuffixList = excludeKeySuffixList;
            return this;
        }

        /**
         * The prefixes of the objects that you want to check.
         */
        public Builder keyPrefixList(java.util.List < String > keyPrefixList) {
            this.putQueryParameter("KeyPrefixList", keyPrefixList);
            this.keyPrefixList = keyPrefixList;
            return this;
        }

        /**
         * The suffixes of the objects that you want to check.
         */
        public Builder keySuffixList(java.util.List < String > keySuffixList) {
            this.putQueryParameter("KeySuffixList", keySuffixList);
            this.keySuffixList = keySuffixList;
            return this;
        }

        /**
         * The check mode. Valid values:
         * <p>
         * 
         * *   **1**: checks all objects in the bucket.
         * *   **2**: checks only new objects in the bucket.
         */
        public Builder scanMode(Integer scanMode) {
            this.putQueryParameter("ScanMode", scanMode);
            this.scanMode = scanMode;
            return this;
        }

        @Override
        public CreateOssBucketScanTaskRequest build() {
            return new CreateOssBucketScanTaskRequest(this);
        } 

    } 

}
