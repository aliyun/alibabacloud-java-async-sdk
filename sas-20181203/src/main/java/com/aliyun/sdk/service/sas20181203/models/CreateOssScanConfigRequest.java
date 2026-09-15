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
    @com.aliyun.core.annotation.NameInMap("AutoAdd")
    private Integer autoAdd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketNameList")
    private java.util.List<String> bucketNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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
    @com.aliyun.core.annotation.NameInMap("RealTimeIncr")
    private Boolean realTimeIncr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDayList")
    private java.util.List<Integer> scanDayList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateOssScanConfigRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.autoAdd = builder.autoAdd;
        this.bucketNameList = builder.bucketNameList;
        this.clientToken = builder.clientToken;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.decryptionList = builder.decryptionList;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.lastModifiedStartTime = builder.lastModifiedStartTime;
        this.name = builder.name;
        this.realTimeIncr = builder.realTimeIncr;
        this.scanDayList = builder.scanDayList;
        this.source = builder.source;
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
     * @return autoAdd
     */
    public Integer getAutoAdd() {
        return this.autoAdd;
    }

    /**
     * @return bucketNameList
     */
    public java.util.List<String> getBucketNameList() {
        return this.bucketNameList;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return realTimeIncr
     */
    public Boolean getRealTimeIncr() {
        return this.realTimeIncr;
    }

    /**
     * @return scanDayList
     */
    public java.util.List<Integer> getScanDayList() {
        return this.scanDayList;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateOssScanConfigRequest, Builder> {
        private Boolean allKeyPrefix; 
        private Integer autoAdd; 
        private java.util.List<String> bucketNameList; 
        private String clientToken; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private java.util.List<String> decryptionList; 
        private Integer enable; 
        private String endTime; 
        private java.util.List<String> keyPrefixList; 
        private java.util.List<String> keySuffixList; 
        private Long lastModifiedStartTime; 
        private String name; 
        private Boolean realTimeIncr; 
        private java.util.List<Integer> scanDayList; 
        private String source; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateOssScanConfigRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.autoAdd = request.autoAdd;
            this.bucketNameList = request.bucketNameList;
            this.clientToken = request.clientToken;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.decryptionList = request.decryptionList;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.lastModifiedStartTime = request.lastModifiedStartTime;
            this.name = request.name;
            this.realTimeIncr = request.realTimeIncr;
            this.scanDayList = request.scanDayList;
            this.source = request.source;
            this.startTime = request.startTime;
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
         * <p>Specifies whether OSS buckets are automatically added to this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder autoAdd(Integer autoAdd) {
            this.putQueryParameter("AutoAdd", autoAdd);
            this.autoAdd = autoAdd;
            return this;
        }

        /**
         * <p>The list of bucket names.</p>
         */
        public Builder bucketNameList(java.util.List<String> bucketNameList) {
            this.putQueryParameter("BucketNameList", bucketNameList);
            this.bucketNameList = bucketNameList;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The maximum number of files to decompress. Minimum value: 1. Maximum value: 1000. When the maximum number of decompressed files is exceeded, the decompression operation stops. The detection of files that have already been decompressed is not affected.</p>
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
         * <p>The maximum number of decompression layers when multiple levels of nested compressed files exist. Minimum value: 1. Maximum value: 5. When the maximum number of decompression layers is exceeded, the decompression operation stops. The detection of files that have already been decompressed is not affected.</p>
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
         * <p>Specifies whether to enable the policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enabled.</li>
         * <li><strong>0</strong>: Disabled.</li>
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
         * <p>The scan stop time, in the HH:mm:ss format.</p>
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
         * <p>The file prefix list.</p>
         */
        public Builder keyPrefixList(java.util.List<String> keyPrefixList) {
            this.putQueryParameter("KeyPrefixList", keyPrefixList);
            this.keyPrefixList = keyPrefixList;
            return this;
        }

        /**
         * <p>The list of file suffixes to scan.</p>
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
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to enable real-time incremental detection. If this parameter is set to true, the ScanDayList, StartTime, and EndTime parameters do not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder realTimeIncr(Boolean realTimeIncr) {
            this.putQueryParameter("RealTimeIncr", realTimeIncr);
            this.realTimeIncr = realTimeIncr;
            return this;
        }

        /**
         * <p>The scan schedule. The number represents the day of the week.</p>
         */
        public Builder scanDayList(java.util.List<Integer> scanDayList) {
            this.putQueryParameter("ScanDayList", scanDayList);
            this.scanDayList = scanDayList;
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

        /**
         * <p>The scan start time, in the HH:mm:ss format.</p>
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
