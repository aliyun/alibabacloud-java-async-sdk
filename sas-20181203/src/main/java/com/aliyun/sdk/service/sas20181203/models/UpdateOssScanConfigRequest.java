// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssScanConfigRequest</p>
 */
public class UpdateOssScanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllKeyPrefix")
    private Boolean allKeyPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketNameList")
    private java.util.List < String > bucketNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxFileCount")
    private Integer decompressMaxFileCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DecompressMaxLayer")
    private Integer decompressMaxLayer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPrefixList")
    private java.util.List < String > keyPrefixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeySuffixList")
    private java.util.List < String > keySuffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanDayList")
    private java.util.List < Integer > scanDayList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private UpdateOssScanConfigRequest(Builder builder) {
        super(builder);
        this.allKeyPrefix = builder.allKeyPrefix;
        this.bucketNameList = builder.bucketNameList;
        this.decompressMaxFileCount = builder.decompressMaxFileCount;
        this.decompressMaxLayer = builder.decompressMaxLayer;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.keyPrefixList = builder.keyPrefixList;
        this.keySuffixList = builder.keySuffixList;
        this.name = builder.name;
        this.scanDayList = builder.scanDayList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssScanConfigRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scanDayList
     */
    public java.util.List < Integer > getScanDayList() {
        return this.scanDayList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<UpdateOssScanConfigRequest, Builder> {
        private Boolean allKeyPrefix; 
        private java.util.List < String > bucketNameList; 
        private Integer decompressMaxFileCount; 
        private Integer decompressMaxLayer; 
        private Integer enable; 
        private String endTime; 
        private String id; 
        private java.util.List < String > keyPrefixList; 
        private java.util.List < String > keySuffixList; 
        private String name; 
        private java.util.List < Integer > scanDayList; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssScanConfigRequest request) {
            super(request);
            this.allKeyPrefix = request.allKeyPrefix;
            this.bucketNameList = request.bucketNameList;
            this.decompressMaxFileCount = request.decompressMaxFileCount;
            this.decompressMaxLayer = request.decompressMaxLayer;
            this.enable = request.enable;
            this.endTime = request.endTime;
            this.id = request.id;
            this.keyPrefixList = request.keyPrefixList;
            this.keySuffixList = request.keySuffixList;
            this.name = request.name;
            this.scanDayList = request.scanDayList;
            this.startTime = request.startTime;
        } 

        /**
         * Whether to match all file prefixes.
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
         * Specifies whether to enable the bucket check policy. Valid values:
         * <p>
         * 
         * *   **1**: enables the bucket check policy.
         * *   **0**: disables the bucket check policy.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The end time of the check. Specify the time in the HH:mm:ss format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The prefixes of the object that you want to check.
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
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The time when the check is performed. The value specifies the days of the week.
         */
        public Builder scanDayList(java.util.List < Integer > scanDayList) {
            this.putQueryParameter("ScanDayList", scanDayList);
            this.scanDayList = scanDayList;
            return this;
        }

        /**
         * The start time of the check. Specify the time in the HH:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public UpdateOssScanConfigRequest build() {
            return new UpdateOssScanConfigRequest(this);
        } 

    } 

}
