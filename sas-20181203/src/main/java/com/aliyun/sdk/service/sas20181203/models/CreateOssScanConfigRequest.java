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
 * {@link CreateOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateOssScanConfigRequest</p>
 */
public class CreateOssScanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
    private Boolean allKeyPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketNameList")
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
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

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
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDayList")
    private java.util.List<Integer> scanDayList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateOssScanConfigRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.bucketNameList = builder.bucketNameList;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.decryptionList = builder.decryptionList;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.lastModifiedStartTime = builder.lastModifiedStartTime;
        this.name = builder.name;
        this.scanDayList = builder.scanDayList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOssScanConfigRequest create() {
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
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scanDayList
     */
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateOssScanConfigRequest, Builder> {
        private Boolean allKeyPrefix; 
        private java.util.List<String> bucketNameList; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private java.util.List<String> decryptionList; 
        private Integer enable; 
        private String endTime; 
        private java.util.List<String> keyPrefixList; 
        private java.util.List<String> keySuffixList; 
        private Long lastModifiedStartTime; 
        private String name; 
        private java.util.List<Integer> scanDayList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssScanConfigRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.bucketNameList = request.bucketNameList;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.decryptionList = request.decryptionList;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.lastModifiedStartTime = request.lastModifiedStartTime;
            this.name = request.name;
            this.scanDayList = request.scanDayList;
            this.startTime = request.startTime;
        } 

        /**
         * <p>Specifies whether to match the prefixes of all objects.</p>
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
         * <p>The names of buckets.</p>
         */
        public Builder bucketNameList(java.util.List<String> bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * <p>The maximum number of objects that can be extracted during decompression. Valid values: 1 to 1000. If the maximum number of objects that can be extracted is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
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
         * <p>The maximum number of decompression levels when multi-level packages are decompressed. Valid values: 1 to 5. If the maximum number of decompression levels is reached, the decompression operation immediately ends and the detection of extracted objects is not affected.</p>
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
         * <p>The decryption methods.</p>
         */
        public Builder decryptionList(java.util.List<String> decryptionList) {
            this.putQueryParameter("DecryptionList", decryptionList);
            this.decryptionList = decryptionList;
            return this;
        }

        /**
         * <p>Specifies whether to enable the policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The time when the scan ends. The time must be in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>01:01:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The prefixes of the objects.</p>
         */
        public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
            this.putQueryParameter("KeyPrefixList", keyPrefixList);
            this.keyPrefixList = keyPrefixList;
            return this;
        }

        /**
         * <p>The suffixes of the files to scan.</p>
         */
        public Builder keySuffixList(java.util.List<String> keySuffixList) {
            this.putQueryParameter("KeySuffixList", keySuffixList);
            this.keySuffixList = keySuffixList;
            return this;
        }

        /**
         * <p>The timestamp when the object was last modified. The time must be later than the timestamp that you specify. Unit: milliseconds.</p>
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
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The days on which the scan is executed in a week.</p>
         */
        public Builder scanDayList(java.util.List<Integer> scanDayList) {
            this.putQueryParameter("ScanDayList", scanDayList);
            this.scanDayList = scanDayList;
            return this;
        }

        /**
         * <p>The time when the scan starts. The time must be in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateOssScanConfigRequest build() {
            return new CreateOssScanConfigRequest(this);
        } 

    } 

}
